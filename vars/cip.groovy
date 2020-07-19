import com.alisanguo.atoms.AtomSample

def doJob(Map params = [:]) {
    println(this.typeName)
    AtomSample atomSample = new AtomSample(this)
    atomSample.execute()
}