package com.alisanguo.atoms

import com.alisanguo.annotation.AtomInputParam

class AtomSample extends AbstractAtom implements Serializable{

    @AtomInputParam("name")
    String name

    AtomSample(steps) {
        super(steps)
    }

    @Override
    def execute() {
        steps.sleep time: 2, unit: 'NANOSECONDS'
        String msg = "hello world"
        echo "$name $msg"
    }

    @Override
    def before() {
        echo "AtomSample before"
    }

    @Override
    def after() {
        echo "AtomSample after"
    }

}