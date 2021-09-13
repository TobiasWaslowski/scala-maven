package de.nordakademie.reaktiv.chatroom

import akka.actor.{Actor, ActorRef}
import de.nordakademie.reaktiv.chatroom.User.{ConnectTo, OutgoingMessage}

object User {

  case class ConnectTo(chatRoom: ActorRef)
  case class OutgoingMessage(toRoom: ActorRef, text: String)

}

class User extends Actor {

  def receive: Receive = {
    case ConnectTo(chatRoom) => ??? // chatRoom beitreten
    case _ => println("please implement me")
  }

  def connectedBehaviour(): Receive = {
    ??? // eingehende und ausgehende Nachrichten handlen
  }

}
