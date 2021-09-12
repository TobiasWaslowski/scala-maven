package de.nordakademie.reaktiv.demo

import akka.actor.Actor

class ConcatMachine extends Actor {

  def receive: Receive = {
    // context.become() ist der Zustandsübergang unserer FSM
    case string: String => context.become(acceptAdditionalString(string))
    case _ => println("I don't know what to do with this.")
  }

  def acceptAdditionalString(firstString: String): Receive = {
    case string: String =>
      println(s"${firstString}-${string}")
      context.become(receive)
    case _ => println("I don't know what to do with this")
  }

}
