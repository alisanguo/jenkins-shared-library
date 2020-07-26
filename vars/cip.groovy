import com.alisanguo.atoms.AtomSample

def doJob(Map params = [:]) {
    AtomSample atomSample = new AtomSample(this)
    atomSample.atomExecution()
}