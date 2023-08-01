package com.appcd.traitfinder

import io.joern.javasrc2cpg.{Config, JavaSrc2Cpg}
import io.joern.x2cpg.X2Cpg.applyDefaultOverlays
import io.shiftleft.codepropertygraph.generated.Cpg
import io.shiftleft.codepropertygraph.generated.nodes.NewMynodetype
import io.shiftleft.passes.SimpleCpgPass
import io.shiftleft.semanticcpg.language._
import overflowdb.BatchedUpdate
import scala.util.{Failure, Success}
import io.shiftleft.passes.CpgPass

case class TraitConfig(scanDirectory: String = ".")  {
  
}

/** Example program that makes use of Joern as a library
  */
object Main extends App {
  val directory      =  "testprogram"
  val config         = Config().withInputPath(directory)
  val cpgOrException = JavaSrc2Cpg().createCpg(config)

  cpgOrException match {
    case Success(cpg) =>
      println("[DONE]")
      println("Applying default overlays")
      applyDefaultOverlays(cpg)
      println("Printing all methods:")
      println("=====================")
      cpg.method.name.foreach(println)
      println("=====================")
      println("Running a custom pass to add some custom nodes")
      new MyPass(cpg).createAndApply()
      println("Running custom queries")
      cpg.mynodetype.foreach(println)
      cpg.mynodetype.myCustomStep.l
    case Failure(exception) =>
      println("[FAILED]")
      println(exception)
  }
}

/** Example of a custom pass that creates and stores a node in the CPG.
  */
class MyPass(cpg: Cpg) extends CpgPass(cpg) {
  override def run(builder: BatchedUpdate.DiffGraphBuilder): Unit = {
    val n = NewMynodetype().myproperty("foo")
    builder.addNode(n)
  }
}
