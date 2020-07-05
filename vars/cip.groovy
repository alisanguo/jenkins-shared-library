import com.alisanguo.atoms.AtomSample

def doJob(Map params = [:]) {
    println(this.properties)
    AtomSample atomSample = new AtomSample(this)
    atomSample.execute()
}