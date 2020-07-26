package com.alisanguo.atoms

import com.alisanguo.action.AtomExecution

abstract class AbstractAtom extends AtomExecution implements Serializable {

    def steps

    AbstractAtom(steps) {
        this.steps = steps
    }

    def atomExecution() {
        long start = System.currentTimeMillis()
        try {
            this.beforeAtomExecution()
            before()
            execute()
            after()

            this.afterAtomExecution()
        }finally {
            long end = System.currentTimeMillis()
            echo("atom execute time ${end - start}")
        }

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
