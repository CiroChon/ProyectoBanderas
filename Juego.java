import java.util.Scanner; 

public class Juego {
    public static void main (String[] args){
        String [] capitales = {"Londres", "Bogota", "Lima", "Varsovia", "Yakarta", "Roma", "Abuya", "Oslo", "Hanga Roa", "Bucarest", "Berlin", "Tokyo", "Mariehamn", "Seul", "Victoria", "Gibraltar", "Damasco", "Praga", "Beirut", "Edimburgo", "La Habana", "Moscu", "Sri Jayawardenapura Kotte", "Banjul", "Santiago De Chile", "Amsterdam", "Pionyang"};        
        int posAleatoria = (int) Math.floor(Math.random() * capitales.length); 
        String capital = capitales[posAleatoria];

        System.out.println(capital);
        char [] letras = capital.toCharArray();
        char [] guion = new char[letras.length];

        for (int i=0; i<letras.length; i++){
            guion[i]= '-';
        }
        System.out.println("Cual es su capital?");
        System.out.println(guion);

        Scanner lector = new Scanner(System.in);
        char letraIntro = lector.next().charAt(0);
        for (int i=0; i<letras.length; i++){
            if(letras[i]==letraIntro){
                guion[i]=letraIntro;
            } 
        }
        System.out.println(guion);
























    }
}