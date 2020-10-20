public class Bandera{
	public static void main(String[] args) {
		
		char matriz[][];
		matriz = new char[27][19];
			//i filas
			//j columunas
		 for (int i= 0; i<matriz.length ;i++ ) {

		 	for (int i=0;i<6 ;i++ ) {
		 		matriz[i][j] = 'N';
		 		
		 	}
		 }

		 for (int i=0;i<2 ;i++ ) {

		 	for (int j=2;j<matriz[0].length;j++ ) {
		 		matriz[i][j] = 'V';
		 	}
		 	
		 }

		 for(int i = 4; i<matriz.length; i++){

			 for(int j= 2; j<matriz[0].length; j++){
			 	matriz[i][j]= 'N';
			 }
		}

		for(int i=2; i< 4; i++)
        {
            for(int j=2;j<9;j++)
            {
                matriz[i][j]='B';
            }
        }

		 for (int i=0;i<matriz.length ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		if(matriz[i][j]=='R')
		 		{
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
		 		if(matriz[i][j]=='V')
		 		{
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
		 		if(matriz[i][j]=='B')
		 		{
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
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