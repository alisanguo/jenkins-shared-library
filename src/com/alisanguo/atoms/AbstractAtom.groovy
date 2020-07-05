package com.alisanguo.atoms

class AbstractAtom implements Serializable {

    def steps

    AbstractAtom(steps) {
        this.steps = steps
        steps.echo("init abstract atom")
        this.echo = steps.echo




    }

    def execute() {

    }



}
