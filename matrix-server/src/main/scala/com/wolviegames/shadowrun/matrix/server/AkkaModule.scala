package com.wolviegames.shadowrun.matrix.server

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.google.inject.AbstractModule
import com.sandinh.akuice.AkkaGuiceSupport
import net.codingwell.scalaguice.ScalaModule

class AkkaModule(implicit val system: ActorSystem, implicit val mat: ActorMaterializer) extends AbstractModule with ScalaModule with AkkaGuiceSupport {
  override def configure(): Unit = {
    bind[ActorSystem].toInstance(system)
    bind[ActorMaterializer].toInstance(mat)
  }
}
