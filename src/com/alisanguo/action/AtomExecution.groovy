package com.alisanguo.action

import com.alisanguo.annotation.AtomInputParam
import groovy.sql.Sql

@Grapes([
    @GrabResolver(name = 'aliyun', root = 'http://maven.aliyun.com/nexus/content/groups/public/'),
    @Grab('mysql:mysql-connector-java:5.1.25')
])
class AtomExecution {

    def steps

    AtomExecution(steps) {
        this.steps = steps
        steps.echo (ClassLoader.getSystemClassLoader().class.name)
    }

    def beforeAtomExecution() {
        steps.echo (ClassLoader.getSystemClassLoader().class.name)
        this.class.declaredFields.each {f ->
            f.setAccessible(true)
            def atomInputParam = f.getAnnotation(AtomInputParam)
            if (atomInputParam) {
                String value = queryParams()
                f.set(this, value)
            }
        }
    }

    def afterAtomExecution() {

    }


    String queryParams() {
        def url = 'jdbc:mysql://localhost:3306/test'
        def user = 'ali'
        def password = 'ali7350519'
        def driver = 'com.mysql.jdbc.Driver'

        String value = ''
        Sql.withInstance(url, user, password, driver) {sql ->
            def row = sql.firstRow('select name from atom_param where id = 1')
            value = row.getProperty('name')
        }
        return value
    }
}
