package com.alisanguo.atoms

import com.alisanguo.action.AtomExecution

abstract class AbstractAtom extends AtomExecution implements Serializable {

    def steps

    AbstractAtom(steps) {
        this.steps = steps
    }

    def atomExecution() {
        this.beforeAtomExecution()

        before()
        execute()
        after()

        this.afterAtomExecution()
    }

    def before() {
        echo "AbstractAtom before"
    }

    def execute() {
        echo "AbstractAtom execute"
    }

    def after() {
        echo "AbstractAtom after"
    }

    def echo(String msg) {
        steps.echo(msg)
    }




}
