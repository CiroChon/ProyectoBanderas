public class Banderas{
	public static void main(String[] args) {
		
		String[] archivox = ConsoleFile.read("info_banderas.csv");
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