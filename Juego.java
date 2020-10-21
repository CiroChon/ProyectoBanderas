import java.util.Scanner; 
import java.util.Arrays;

public class Juego {
    public static void main (String[] args){
        String [] capitales = {"Londres", "Bogota", "Lima", "Varsovia", "Yakarta", "Roma", "Abuya", "Oslo", "HangaRoa", "Bucarest", "Berlin", "Tokyo", "Mariehamn", "Seul", "Victoria", "Gibraltar", "Damasco", "Praga", "Beirut", "Edimburgo", "LaHabana", "Moscu", "SriJayawardenapuraKotte", "Banjul", "SantiagoDeChile", "Amsterdam", "Pionyang"};        
        int posAleatoria = (int) Math.floor(Math.random() * capitales.length); 
        String capital = capitales[posAleatoria];

        char [] letras = capital.toCharArray();
        char [] guion = new char[letras.length];

        for (int i=0; i<letras.length; i++){
            guion[i]= '-';
        }

        int intentos = 3;
        
        System.out.println("Cual es su capital?");
        System.out.println(guion);
        boolean ganar = false;
        while(ganar == false) {
 
            Scanner lector = new Scanner(System.in);
            char letraIntro = lector.next().charAt(0);
            for (int i=0; i<letras.length; i++){
                if(letras[i]==letraIntro){
                    guion[i]=letraIntro;
                } 
                if (Arrays.equals (letras, guion)){
                    System.out.println("Esooo!");
                    break;
                }
            }
            System.out.println(guion);
        }























    }
}