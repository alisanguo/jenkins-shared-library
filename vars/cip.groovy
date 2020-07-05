import com.alisanguo.atoms.AtomSample

def doJob(Map params = [:]) {
    println(this)
    AtomSample atomSample = new AtomSample(this)
    atomSample.execute()
}