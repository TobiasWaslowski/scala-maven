package de.nordakademie.reaktiv.demo

import akka.actor.Actor

class PersonalGreeter extends Actor {


  override def preStart(): Unit = println("Wie heißt du?")

  def receive: Receive = {
    case string: String =>
      if (string.isEmpty || string.contains(" ")) {
        println("Sorry, das ist kein valider Input")
      } else {
        println("Und was ist dein Nachname?")
        context.become(receiveSurname(string))
      }
    case _ => println("Sorry, das ist kein valider Input.")
  }

  def receiveSurname(firstName: String): Receive = {
    case string: String =>
      if (string.isEmpty || string.contains(" ")) {
        println("Sorry, das ist kein valider Input")
      } else {
        println(s"Hallo, ${firstName} ${string}")
        preStart()
        context.become(receive)
      }
    case _ => println("Sorry, das ist kein valider Input.")
  }


}
