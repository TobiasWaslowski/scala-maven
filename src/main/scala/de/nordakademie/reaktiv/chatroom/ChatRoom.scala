package de.nordakademie.reaktiv.chatroom

import akka.actor.{Actor, ActorRef, Terminated}
import de.nordakademie.reaktiv.chatroom.ChatAction.Join
import de.nordakademie.reaktiv.demo.Message

object ChatAction {
  case object Join
  case class Message(sender: ActorRef, content: String)
}

class ChatRoom extends Actor {

  var users : Set[ActorRef] = Set.empty

  def receive: Receive = {
    case Join => ??? // implement logic to add a user to a room
    case Terminated => ??? // remove user when the actor is terminated
    case message: String => ??? // deal with incoming messages
  }
}
