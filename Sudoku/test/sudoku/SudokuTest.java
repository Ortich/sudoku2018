/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class SudokuTest {
    
    public SudokuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of chequeaSudoku method, of class Sudoku.
     */
    @Test
    public void testChequeaSudoku() {
	System.out.println("chequeaSudoku");
	
	int matrizPrueba[][]={{1,2,3},{4,5,6},{7,8,9}};
	int matrizPrueba2[][]={{4,1,3},{2,7,5},{9,6,8}};
	int matrizPrueba3[][]={{4,1,3},{4,7,5},{9,6,8}};
	int matrizPrueba4[][] = {{4, 1, 31}, {2, 7, 5}, {9, 6, 8}};
	int matrizPrueba5[][]={{4,1,31},{31,7,5},{9,6,8}};
	int matrizPrueba6[][]={{4,1,31},{7,31,5},{9,6,8}};
	int matrizPrueba7[][]={{4,1,31},{5,7,31},{9,6,8}};
	int matrizPrueba8[][]={{4,1,31},{5,7,9},{31,6,8}};
	int matrizPrueba9[][]={{4,1,31},{5,7,9},{8,6,31}};
	int matrizPrueba10[][]={{4,1,2},{5,7},{8,6,31}};
	int matrizPrueba11[][]={{4,1,2},{5,7,9,3},{8,6,31}};
	int matrizPrueba12[][]={{4,-1,2},{5,7,9,3},{8,6,31}};
	int matrizPrueba13[][]={};
	
	Sudoku instance = new Sudoku();
	
	boolean expResult = true;
	boolean expResult2 = true;
	boolean expResult3 = false;
	boolean expResult4 = false;
	boolean expResult5 = false;
	boolean expResult6 = false;
	boolean expResult7 = false;
	boolean expResult8 = false;
	boolean expResult9 = false;
	boolean expResult10 = false;
	boolean expResult11 = false;
	boolean expResult12 = false;
	boolean expResult13 = false;
	
	boolean result = instance.chequeaSudoku(matrizPrueba);
	assertEquals(expResult, result);
	boolean result2 = instance.chequeaSudoku(matrizPrueba2);
	assertEquals(expResult2, result2);
	boolean result3 = instance.chequeaSudoku(matrizPrueba3);
	assertEquals(expResult3, result3);
	boolean result4 = instance.chequeaSudoku(matrizPrueba4);
	assertEquals(expResult4, result4);
	boolean result5 = instance.chequeaSudoku(matrizPrueba5);
	assertEquals(expResult5, result5);
	boolean result6 = instance.chequeaSudoku(matrizPrueba6);
	assertEquals(expResult6, result6);
	boolean result7 = instance.chequeaSudoku(matrizPrueba7);
	assertEquals(expResult7, result7);
	boolean result8 = instance.chequeaSudoku(matrizPrueba8);
	assertEquals(expResult8, result8);
	boolean result9 = instance.chequeaSudoku(matrizPrueba9);
	assertEquals(expResult9, result9);
	boolean result10 = instance.chequeaSudoku(matrizPrueba10);
	assertEquals(expResult10, result10);
	boolean result11 = instance.chequeaSudoku(matrizPrueba11);
	assertEquals(expResult11, result11);
	boolean result12 = instance.chequeaSudoku(matrizPrueba12);
	assertEquals(expResult12, result12);
	boolean result13 = instance.chequeaSudoku(matrizPrueba13);
	assertEquals(expResult13, result13);
    }   
}
