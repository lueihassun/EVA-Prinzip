import java.util.*;  
public class MiniBot 
{
  public static void main(String[] args) 
  {
    // Scanner-Objekt erstellen. System.in ist ein Standard Input-Stream.
    Scanner sc = new Scanner(System.in);
    // Konsolenausgabe.
    System.out.println("\n-> Hallo, bitte beantworte folgende Fragen:\n");
    // Konsolenausgabe.
    System.out.println("1. Wie heißt du?\n");
    // Nutzereingabe auslesen.
    String name = sc.nextLine();
    // Konsolenausgabe.
    System.out.println("\n2. Wie alt bist du?\n");
    // Nutzereingabe auslesen.
    String alter = sc.nextLine();
    // Konsolenausgabe.
    System.out.println("\n3. Was ist deine Lieblingsfarbe?\n");
    // Nutzereingabe auslesen.
    String farbe = sc.nextLine();
    // Konsolenausgabe.
    System.out.println("\n4. Was ist dein Hobby?\n");
    // Nutzereingabe auslesen.
    String hobby = sc.nextLine();
    // Konsolenausgabe.
    System.out.println("\n5. Bist du verheiratet? (ja/nein)\n");
    // Nutzereingabe auslesen.
    String zustand = sc.nextLine();
    
    // Konsolenausgabe.
    System.out.println("\n6. Woher kommst du?\n");
    // Nutzereingabe auslesen.
    String land = sc.nextLine();
    
    // Wenn Nutzereingabe == ja, dann den Wert der Variable mit verheiratet überschreiben, sonst ledig.
    if (zustand.contains("ja")) 
    {
      zustand = "verheiratet";
    }
    else
    {
      zustand = "ledig";
    }
    // Konsolenausgabe mit der Nutzereingabe.
    System.out.println("\n-> Hallo " + name + ", du bist " + alter + " Jahre alt." + " Deine Lieblingsfarbe ist " + farbe + " und dein Hobby ist " + hobby + ". Du bist " + zustand + "." + " Du kommst aus " + land + ".\n" );
  }
}