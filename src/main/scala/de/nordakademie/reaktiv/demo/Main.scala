package de.nordakademie.reaktiv.demo

import akka.actor.{ActorSystem, Props}

object Main extends App {

  val system: ActorSystem = ActorSystem("test")
  val helloActor = system.actorOf(Props[HelloActor], "helloActor")
  val greeter = system.actorOf(Props[Greeter], "greeter")

  greeter ! Message(helloActor, "test")
  greeter ! Message(helloActor, "hello")
  greeter ! "hello"

  system.terminate()
}
