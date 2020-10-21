public class BanderasJuego{
	public static void main(String[] args) {
		String[] archivox = ConsoleFile.read("info_banderas.csv");
        String [] capitales = {"Londres", "Bogota", "Lima", "Varsovia", "Yakarta", "Roma", "Abuya", "Oslo", "HangaRoa", "Bucarest", "Berlin", "Tokyo", "Mariehamn", "Seul", "Victoria", "Gibraltar", "Damasco", "Praga", "Beirut", "Edimburgo", "LaHabana", "Moscu", "SriJayawardenapuraKotte", "Banjul", "SantiagoDeChile", "Amsterdam", "Pionyang"};        
        int posAleatoria = (int) Math.floor(Math.random() * capitales.length); 
        String capital = capitales[posAleatoria];

        char [] letras = capital.toCharArray();
        char [] guion = new char[letras.length];

        for (int i=0; i<letras.length; i++){
            guion[i]= '-';
        }
        
        System.out.println("Cual es su capital?");
        System.out.println(guion);
		
        //Gran Bretaña
        if(capital == "Londres") {
		for(int n=1 ; n<21; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
			System.out.println();
        }
        }
        //Colombia
        if(capital == "Bogota"){
        for(int n=21 ; n<41; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
		}
        }
        //Peru
        if(capital == "Lima"){
		for(int n=41 ; n<61; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
		}
        }

















	}
}