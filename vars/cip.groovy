import com.alisanguo.atoms.AtomSample

def doJob(Map params = [:]) {
    println(this.metaClass)
    AtomSample atomSample = new AtomSample(this)
    atomSample.atomExecution()
}