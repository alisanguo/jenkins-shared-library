package com.alisanguo.action

import com.alisanguo.annotation.AtomInputParam

class AtomExecution {

    def beforeAtomExecution() {
        this.class.declaredFields.each {f ->
            f.setAccessible(true)
            def atomInputParam = f.getAnnotation(AtomInputParam)
            if (atomInputParam) {
                f.set(this, 'wli')
            }
        }
    }

    def afterAtomExecution() {

    }
}
