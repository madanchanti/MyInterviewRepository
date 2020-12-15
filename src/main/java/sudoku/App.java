package sudoku;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
	
	private static int[][] sudokuArray = {{1,2,3,4,5,6,7,8,9}, {2,3,4,5,6,7,8,1,9}, {1,2,5,3,4,6,7,8,9}, {9,8,6,7,5,4,3,2,1}, {9,8,7,6,5,4,3,2,1}, {9,8,7,6,5,4,3,2,1}, {9,8,7,6,5,4,3,2,1}, {9,8,7,6,5,4,3,2,1},
 {9,8,7,6,5,4,3,2,1}};

	//checking the sudoku here	
	public static void checkSudoku() {
		checkTheMatrix();
		for(int i=0; i<9; i++) {
			rowValidator(i);
			columnValidator(i);
		}
	}

    //method to check the 3*3 matrix in the sudoku
    public static void checkTheMatrix() {
    	Map<Integer, Integer> hMap = new HashMap<>();
    	if(sudokuArray != null) {
    		for(int i=0; i<9; i++) {
    			for(int j=0; j<9; j++) {
    				if(hMap.containsKey(sudokuArray[i][j]) == false) {
    					hMap.put(sudokuArray[i][j], 1);
    				} else {
    					hMap.put(sudokuArray[i][j], hMap.get(sudokuArray[i][j])+1);
    				}
    			}
    		}
    		Set<Map.Entry<Integer, Integer>> hashMap = hMap.entrySet();
    		for(Map.Entry<Integer, Integer> data : hashMap) {
    			if(data.getValue() > 1) {
    				System.out.println("Duplicate value repeated "+data.getValue()+" for "+data.getKey());
    			}
    		}
    	}
    }
    
    //method to do row validation
    public static void rowValidator(int rowValue) {
    	Map<Integer, Integer> hMap = new HashMap<>();
    	if(sudokuArray != null) {
    		for(int i=0; i<9; i++) {
    			if(hMap.containsKey(sudokuArray[rowValue][i]) == false) {
    				hMap.put(sudokuArray[rowValue][i], 1);
    			} else {
    				hMap.put(sudokuArray[rowValue][i], hMap.get(sudokuArray[rowValue][i])+1);
    			}
    		}
    		Set<Map.Entry<Integer, Integer>> hashMap = hMap.entrySet();
    		for(Map.Entry<Integer, Integer> data : hashMap) {
    			if(data.getValue() > 1) {
    				System.out.println("Duplicate value repeated "+data.getValue()+" for "+data.getKey());
    			}
    		}
    	}
    }

    //method to do column validation
    public static void columnValidator(int columnValue) {
    	Map<Integer, Integer> hMap = new HashMap<>();
    	if(sudokuArray != null) {
    		for(int i=0; i<9; i++) {
    			if(hMap.containsKey(sudokuArray[i][columnValue]) == false) {
    				hMap.put(sudokuArray[i][columnValue], 1);
    			} else {
    				hMap.put(sudokuArray[i][columnValue], hMap.get(sudokuArray[i][columnValue])+1);
    			}
    		}
    		Set<Map.Entry<Integer, Integer>> hashMap = hMap.entrySet();
    		for(Map.Entry<Integer, Integer> data : hashMap) {
    			if(data.getValue() > 1) {
    				System.out.println("Duplicate value repeated "+data.getValue()+" for "+data.getKey());
    			}
    		}
    	}
    }
    
    //sudoku being replaced if passed dynamically
    public App(int[][] sudokuArray) {
    	this.sudokuArray = sudokuArray;
    }
 
    public static void main(String[] args) {
    	checkSudoku();
    }
}
