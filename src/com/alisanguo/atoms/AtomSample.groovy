package com.alisanguo.atoms
import com.alisanguo.atoms.AbstractAtom

class AtomSample extends AbstractAtom implements Serializable{

    AtomSample(steps) {
        super(steps)
    }

    @Override
    def execute() {
        echo("hello world")
    }

    def methodMissing(String name, def args) {
        steps.echo("atom methodMissing ${name}")
        steps.name(args)
    }
}