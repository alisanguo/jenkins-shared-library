package com.alisanguo.atoms

class AbstractAtom implements Serializable {

    def steps

    AbstractAtom(steps) {
        this.steps = steps
        steps.echo("init abstract atom")

        def emc = new ExpandoMetaClass( AbstractAtom.class, false )

        steps.properties.each { key, value ->
            steps.echo("****${key}")
            if (emc.hasProperty(key) && !(key in ['class', 'metaClass']))
                emc[key] = value
        }

        emc.initialize()
        this.metaClass = emc


    }

    def execute() {

    }



}
