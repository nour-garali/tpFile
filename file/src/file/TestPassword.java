package file;

import java.io.*;
public class TestPassword {
 public static void main(String[] args) {
 String l;
 BufferedReader f;
 boolean test = false;
 try {
 f = new BufferedReader(new FileReader("c:\\fichiers\\in.txt"));
 String login = lireMot("Entrez le login : ");
 String password = lireMot("Entrez le mot de passe : ");
 l = f.readLine();
 while (l != null) {
 String[] words = l.split(" ");
 if (words[0].equals(login) && words[1].equals(password)) { test = true; }
 l = f.readLine();
 }
 f.close();
 if (test == true) {
 System.out.println("Authentification réussi");
 } else {
 System.out.println("PB Authentification");
 }
 } catch (IOException e) {
 System.err.println("Erreur: " + e);
 }
 }
 public static String lireMot(String msg) throws IOException {
 BufferedReader keyboard;
 keyboard = new BufferedReader(new InputStreamReader(System.in));
 System.out.print(msg);
 return keyboard.readLine();
 }
}
