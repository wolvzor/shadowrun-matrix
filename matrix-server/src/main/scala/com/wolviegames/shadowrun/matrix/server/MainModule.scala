package com.wolviegames.shadowrun.matrix.server

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule

class MainModule(implicit val system: ActorSystem, implicit val mat: ActorMaterializer) extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
    install(new AkkaModule)

  }
}
