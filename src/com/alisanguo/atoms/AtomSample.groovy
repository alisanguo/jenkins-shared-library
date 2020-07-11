package com.alisanguo.atoms
import com.alisanguo.atoms.AbstractAtom

class AtomSample extends AbstractAtom implements Serializable{

    AtomSample(steps) {
        super(steps)
    }

    @Override
    def execute() {
        sleep time: 2, unit: 'NANOSECONDS'
        String msg = "hello world"
        echo "li $msg"
    }

}