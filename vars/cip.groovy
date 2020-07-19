import com.alisanguo.atoms.AtomSample

def doJob(Map params = [:]) {
    println(this.class)
    AtomSample atomSample = new AtomSample(this)
    atomSample.execute()
}