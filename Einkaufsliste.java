import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Stream;

public class Main {

  private Scanner in = new Scanner(System.in);
  private ArrayList <Double> preis = new ArrayList<>();
  private ArrayList <String> geschaeft = new ArrayList<>();
  private ArrayList <String> kategorie = new ArrayList<>();

  // FIXME: Diese Methode implementieren
  private void details(String[] parts) {
    // Prüfen: parts hat 2 Elemente
    // 0 ist "details", 1 ist der Shopname
    // Bei Fehlern invalid() aufrufen und die Methode mit return beenden
  }

  // FIXME: Diese Methode implementieren
  private void report(String[] parts) {
    if(parts.length() == 2){
      if(parts[1].equals("category")){
        Double p = 0;
        String k = "";
        kategorie.stream().filter(kategoie -> kategoie.)
      }
    }
    else invalid();
    // Prüfen: parts hat 2 Elemente
    // 0 ist "report", 1 ist entweder "category" oder "shop"
    // Bei Fehlern invalid() aufrufen und die Methode mit return beenden
  }

  // FIXME: Diese Methode implementieren
  private void add(String[] parts) {

    if(parts.length() == 4){
      geschaeft.add(parts[1]);
      kategorie.add(parts[2]);
      preis.add(parts[3]);
    }

    else invalid();
    // Prüfen: parts hat 4 Elemente
    // 0 ist "add", 1 und 2 sind String, 3 ist ein String, in dem ein Double Wert steht
    // Bei Fehlern invalid() aufrufen und die Methode mit return beenden
  }

  // FIXME: Diese Methode implementieren
  private void exit() {
    System.out.println("Bye.");
    System.exit(0);
  }

  // FIXME: Diese Methode implementieren
  public void run() {
    // Hier muss in geeigneter Weise readAndProcess aufgerufen werden
  }


  /**
   * Diese Methode soll aufgerufen werden, wenn es einen Fehler bei den Parametern gibt
   */
  private void invalid() {
    System.out.println("Ungültige Eingabe.");
  }


  /**
   * Liest eine Zeile von der Eingabeaufforderung
   * Ruft je nach erstem Wort die passende Methode auf
   * @return Die Methode gibt true zurück, wenn das Programm
   * nach der Verarbeitung des Kommandos weiterlaufen soll
   */
  private boolean readAndProcess() {
    String line;
    line = in.nextLine();
    String[] parts = line.split(" ");
    switch (parts[0]) {
      case "add": {
        add(parts);
        return true;
      }
      case "report": {
        report(parts);
        return true;
      }
      case "details": {
        details(parts);
        return true;
      }
      case "exit": {
        exit();
        return false;
      }
      default: {
        invalid();
        return true;
      }
    }
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }

}
