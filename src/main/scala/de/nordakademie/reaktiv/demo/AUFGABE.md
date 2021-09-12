# Aufgabe 1

Vervollständigt die PersonalGreeter-Klasse, sodass folgende Anforderungen erfüllt werden:

1. Es soll separat nach dem Vor- und Nachnamen gefragt werden.
2. Es sollen nur Inputs akzeptiert werden, die lediglich ein Wort lang sind. "Max Mustermann" ist kein valider Vor-
oder Nachname. "Jan-Max" ist allerdings ein valider Vorname, genau so wie "Müller-Meier" ein valider Nachname ist.
3. Nachdem sowohl der Vor- als auch der Nachname eingegeben wurden, gebt den vollen Namen aus und kehrt in den
Ursprungszustand zurück.
4. BONUS: Findet einen Weg, den vollen Namen an den HelloActor weiterzugeben, der euch dann mit "Hallo, Max Mustermann"
grüßt.

Hinweis: Input könnt ihr mit dem folgenden Funktionsaufruf erhalten:

    scala.io.StdIn.readLine()

