package com.alisanguo.atoms

class AbstractAtom implements Serializable {

    def steps

    AbstractAtom(steps) {
        this.steps = steps
        println("init abstract atom")

        def emc = new ExpandoMetaClass( AbstractAtom.class, false )

        steps.properties.each { key, value ->
            println("****" + key)
            if (emc.hasProperty(key) && !(key in ['class', 'metaClass']))
                emc[key] = value
        }

        emc.initialize()
        this.metaClass = emc


    }

    def execute() {

    }



}
