package de.nordakademie.reaktiv.demo

import akka.actor.{ActorSystem, Props}

object Main extends App {

  // Initiate ActorSystem and HelloActor
  val system: ActorSystem = ActorSystem("test")
  val personalGreeter = system.actorOf(Props[PersonalGreeter], "personalGreeter")

  while(true) {
    val input = scala.io.StdIn.readLine()
    personalGreeter ! input
  }

  // And kill the system
  system.terminate()
}
