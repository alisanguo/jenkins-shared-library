import com.alisanguo.atoms.AbstractAtom
import com.alisanguo.atoms.AtomSample

def doJob(Map params = [:]) {
    AbstractAtom atomSample = new AtomSample(this)
    atomSample.atomExecution()
}