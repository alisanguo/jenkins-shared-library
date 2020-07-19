import com.alisanguo.atoms.AtomSample

def doJob(Map params = [:]) {
    println(this.class.name)
    println(this.getClasses().name)
    AtomSample atomSample = new AtomSample(this)
    atomSample.execute()
}