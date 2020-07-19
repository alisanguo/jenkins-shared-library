package com.alisanguo.atoms

class AbstractAtom implements Serializable {

    cip steps

    AbstractAtom(steps) {
        this.steps = steps
    }

    def execute() {

    }

    def echo(String msg) {
        steps.echo(msg)
    }




}
