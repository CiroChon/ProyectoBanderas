public class BanderaAlemania{
	public static void main(String[] args) {
		
		char matriz[][];
		matriz = new char[18][27];
			//i filas
			//j columunas
		 for (int i= 0; i<7 ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		matriz[i][j] = 'N';
		 		
		 	}
		 }
		 
		 for (int i=0;i<matriz.length ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		if(matriz[i][j]=='N')
		 		{
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
		 		System.out.print(ConsoleColors.RESET);
		 	}
		 	System.out.println();
		 }


	}
}