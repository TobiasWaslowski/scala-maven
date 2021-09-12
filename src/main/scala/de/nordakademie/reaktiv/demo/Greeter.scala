package de.nordakademie.reaktiv.demo

import akka.actor.Actor

class Greeter extends Actor {

  def receive: Receive = {
    case Message(recipient, content) => recipient ! content
    case text: String => println(s"Received message ${text}")
    case _ => println("I'm afraid I can't do anything with this.")
  }

}
