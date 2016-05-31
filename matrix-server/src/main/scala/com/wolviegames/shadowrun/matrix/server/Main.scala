package com.wolviegames.shadowrun.matrix.server

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.google.inject.{Guice, Stage}


object Main extends App {
  import net.codingwell.scalaguice.InjectorExtensions._


  implicit val system = ActorSystem()
  implicit val mat = ActorMaterializer()

  val inj = Guice.createInjector(Stage.PRODUCTION, new MainModule)



}