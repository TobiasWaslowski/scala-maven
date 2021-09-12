package de.nordakademie.reaktiv.chatroom

import akka.actor.{Actor, ActorRef, Terminated}
import de.nordakademie.reaktiv.chatroom.ChatAction._

object ChatAction {
  case object Join
  case class Message(sender: ActorRef, content: String)
}

class ChatRoom extends Actor {

  var users : Set[ActorRef] = Set.empty

  def receive: Receive = {
    case Join =>
      users += sender()
      context.system.log.info(s"${sender()} just joined the chat!")
      // we also would like to remove the user when its actor is stopped
      context.watch(sender())

    case Terminated(user) =>
      users -= user

    case msg: String =>
      val recipients = users.filter(_ != sender())
      context.system.log.info(s"forwarding message from ${sender()} to users: ${recipients}")
      recipients.foreach(_ ! Message(sender(), msg))
  }
}
