# ✖️ Java-Projekt: Einfache Multiplikationstabelle (0 bis 10)

* Dieses Java-Programm fragt den Benutzer nach einer Zahl und gibt dann die **Multiplikationstabelle von 0 bis 10** für diese Zahl aus.
Ein ideales Projekt für Anfänger, um mit **Schleifen** (`for`) und **Benutzereingabe** (`Scanner`) zu arbeiten.


## 🧾 Quellcode
```
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Data:");

        System.out.println("Input the first number:");
        int x = scanner.nextInt();
        System.out.println("Results: ");

        for(int i = 0; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
```
## 📌 Was macht das Programm?
* Fragt den Benutzer nach einer **Ganzzahl**

* Gibt alle Ergebnisse der Multiplikation dieser Zahl mit `0` bis `10` aus

Verwendet eine `for`-**Schleife** für die Wiederholung

## ▶️ Beispielausgabe
```
Test Data:
Input the first number:
> 7
Results:
7 * 0 = 0
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
...
7 * 10 = 70
```
