package com.alisanguo.atoms

class AbstractAtom implements Serializable {

    def steps

    AbstractAtom(steps) {
        this.steps = steps
        steps.properties.each { key, value ->
            if (this.hasProperty(key) && !(key in ['class', 'metaClass']))
                this[key] = value
        }
    }

    def execute() {

    }



}
