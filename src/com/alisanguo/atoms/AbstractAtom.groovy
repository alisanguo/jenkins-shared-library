package com.alisanguo.atoms

class AbstractAtom implements Serializable {

    def steps

    AbstractAtom(steps) {
        this.steps = steps
        steps.echo("init abstract atom")

    }

    def methodMissing(String name, def args) {
        System.out.println("methodMissing")
        steps[name](args)
    }

    def execute() {

    }



}
