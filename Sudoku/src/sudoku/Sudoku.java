/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Usuario
 */
public class Sudoku {

    public boolean chequeaSudoku(int[][] matriz) {
	boolean encontradoRepetido = true;
	if (matriz.length != 3) {
	    encontradoRepetido = false;
	}
	//Buscamos la posicion del numero a comprobar
	for (int fila = 0; fila < matriz.length && encontradoRepetido; fila++) {
	    if (matriz[fila].length == 3) {
		for (int columna = 0; columna < matriz[fila].length && encontradoRepetido; columna++) {
		    if (matriz[fila][columna] < 10 && matriz[fila][columna] > 0) {
			//Con el numero ya seleccionado, hacemos la comprobacion de los numero repetidos
			for (int fila2 = fila; fila2 < matriz.length && encontradoRepetido; fila2++) {
			    for (int columna2 = 0; columna2 < matriz[fila2].length && encontradoRepetido; columna2++) {
				//Vamos comprobando que el numero no se repita en ningun sitio
				if (fila2 != fila || columna2 != columna) {
				    if (matriz[fila2][columna2] == matriz[fila][columna]) {
					return false;
				    }
				}
			    }
			}
		    } else {
			encontradoRepetido = false;
		    }
		}
	    } else {
		encontradoRepetido = false;
	    }
	}
	return encontradoRepetido;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Sudoku prueba = new Sudoku();

	int matrizPrueba[][]={{1,2,3},{4,5,6},{7,8,9}};
	System.out.println("{1,2,3},{4,5,6},{7,8,9}-TRUE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba));
	
	int matrizPrueba2[][]={{4,1,3},{2,7,5},{9,6,8}};
	System.out.println("{4,1,3},{2,7,5},{9,6,8}- TRUE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba2));
	
	int matrizPrueba3[][]={{4,1,3},{4,7,5},{9,6,8}};
	System.out.println("{4,1,3},{4,7,5},{9,6,8}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba3));

	int matrizPrueba4[][] = {{4, 1, 31}, {2, 7, 5}, {9, 6, 8}};
	System.out.println("{4,1,31},{2,7,5},{9,6,8}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba4));
	
	int matrizPrueba5[][]={{4,1,31},{31,7,5},{9,6,8}};
	System.out.println("{4,1,31},{31,7,5},{9,6,8}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba5));
	
	int matrizPrueba6[][]={{4,1,31},{7,31,5},{9,6,8}};
	System.out.println("{4,1,31},{7,31,5},{9,6,8}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba6));
	
	int matrizPrueba7[][]={{4,1,31},{5,7,31},{9,6,8}};
	System.out.println("{4,1,31},{5,7,31},{9,6,8}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba7));
	
	int matrizPrueba8[][]={{4,1,31},{5,7,9},{31,6,8}};
	System.out.println("{4,1,31},{5,7,9},{31,6,8}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba8));
	
	int matrizPrueba9[][]={{4,1,31},{5,7,9},{8,6,31}};
	System.out.println("{4,1,31},{5,7,9},{8,6,31}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba9));

	int matrizPrueba10[][]={{4,1,2},{5,7},{8,6,31}};
	System.out.println("{4,1,2},{5,7},{8,6,31}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba10));
	
	int matrizPrueba11[][]={{4,1,2},{5,7,9,3},{8,6,31}};
	System.out.println("{4,1,2},{5,7,9,3},{8,6,31}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba11));

	int matrizPrueba12[][]={{4,-1,2},{5,7,9,3},{8,6,31}};
	System.out.println("{4,-1,2},{5,7,9,3},{8,6,31}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba12));
	
	int matrizPrueba13[][]={};
	System.out.println("{4,1,2},{5,7,9,3},{8,6,31}-FALSE");
	System.out.println(prueba.chequeaSudoku(matrizPrueba13));

    }

}
