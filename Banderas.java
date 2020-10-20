public class Banderas{
	public static void main(String[] args) {
		String[] archivox = ConsoleFile.read("info_banderas.csv");
		for(int n=1 ; n<20; n++){
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
}