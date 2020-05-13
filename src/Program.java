import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
   try => Comando a ser executado = BEGIN END
   catch => Capturar o erro = EXCEPTION
   FileNotFoundException => Tipo do erro = WHEN NO_DATA_FOUND THEN
   finally => É executado independente de erro ou não = GO_TO
   e => alias do erro
   printStackTrace() => Informação completa do erro, inclusive com as chamadas
   getMessage() => Mensagem de erro tratada
 */

public class Program {
    public static void main(String args[]) {
        File file = new File("/Users/lhserafim/Desktop/teste.txt"); // CORRETO
        Scanner sc = null; // Cria o scanner como null
        try{
            sc = new Scanner(file); // scanner lendo o arquivo
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage()); //Traz a mensagem de erro
            //e.printStackTrace();
        }
        finally{
            if (sc != null) {
                System.out.print("FIM");
                sc.close();
            }

        }
    }
}
