import scala.language.implicitConversions 
object test extends App{
  import scala.reflect.runtime.universe._
  /*
  import scala.sprinter.printers.PrettyPrinters
  import scala.reflect.internal._
  import scala.tools.nsc.{Global, Settings}
  import scala.tools.nsc.reporters.ConsoleReporter
  import scala.tools.reflect._
  val settings = new Settings
  val compiler = new Global(settings, new ConsoleReporter(settings))
  import compiler._
  */
  val name : TypeName = "ASDF"
  val tree = q"class ${name}"
  //val tree = Literal(Constant(4))

  /*
  val printers = PrettyPrinters(compiler)
  println( printers.show(tree) )
  */
  println(tree)
}