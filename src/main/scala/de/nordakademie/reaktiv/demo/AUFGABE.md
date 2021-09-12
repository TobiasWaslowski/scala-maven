# Aufgabe 1

Vervollst�ndigt die PersonalGreeter-Klasse, sodass folgende Anforderungen erf�llt werden:

1. Es soll separat nach dem Vor- und Nachnamen gefragt werden.
2. Es sollen nur Inputs akzeptiert werden, die lediglich ein Wort lang sind. "Max Mustermann" ist kein valider Vor-
oder Nachname. "Jan-Max" ist allerdings ein valider Vorname, genau so wie "M�ller-Meier" ein valider Nachname ist.
3. Nachdem sowohl der Vor- als auch der Nachname eingegeben wurden, schickt den vollen Namen an den HelloActor, der
euch gr��t. Danach setzt sich der Zustand des PersonalGreeters zur�ck.

Hinweis: Input k�nnt ihr mit dem folgenden Funktionsaufruf erhalten:

    scala.io.StdIn.readLine()

Weiterer Hinweis: Ihr k�nnt bei der Instantiierung des Actors den Actor zu parametrisieren. Das geht folgenderma�en:

    val personalGreeter = system.actorOf(Props(classOf[PersonalGreeter], args), "personalGreeter")
