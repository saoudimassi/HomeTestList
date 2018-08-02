import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;


import org.junit.jupiter.api.Test;

class ListTesting {
	
	final int DIVIENEGATIVENUMBRE = -1;
	final int EMPLYLIST = 0;
	final int DIVIEPEERNUMBRE = 2;
	final int DIVIEODDNUMBRE = 3;
	final int PEERLINGTHLIST = 10;
	final int ODDLINGTHLIST = 13;
	
	// Prepare to capture output
	PrintStream originalOut = System.out;     
	OutputStream os = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(os);
	
	
	//list with peer length divided on peer number should divide list on equals sub list   
	@Test
	void peerListLengthOddSubListLengthTest() {
		
		System.setOut(ps);
		
		ListHomeTest test = new ListHomeTest();
		
		ArrayList<Integer> inerList = test.listFill(PEERLINGTHLIST);
			
		ArrayList<ArrayList<Integer>> outerList;
		
		try {
			outerList = test.partition(inerList, DIVIEPEERNUMBRE);
			
			test.printList(outerList);
			assertEquals("[[0, 1], [2, 3], [4, 5], [6, 7], [8, 9]]", os.toString());

			// Restore normal operation   
			System.setOut(originalOut);
			
		} catch (PartitionExceptions e) {}	
	}
	
	//list with peer length divided on odd number should divide list on equals sub list
	@Test
	void peerListLengthPeerSubListLengthTest() {
		
		System.setOut(ps);
		
		ListHomeTest test = new ListHomeTest();
		
		ArrayList<Integer> inerList = test.listFill(PEERLINGTHLIST);
			
		ArrayList<ArrayList<Integer>> outerList;
		
		try {
			outerList = test.partition(inerList, DIVIEODDNUMBRE);
			
			test.printList(outerList);
			assertEquals("[[0, 1, 2], [3, 4, 5], [6, 7, 8], [9]]", os.toString());

			// Restore normal operation   
			System.setOut(originalOut);
			
		} catch (PartitionExceptions e) {}	
	}
	
	//list with odd length divided on peer number should divide list on not equal sub list
	@Test
	void oddListLengthPeerSubListLengthTest() {
		
		System.setOut(ps);
		
		ListHomeTest test = new ListHomeTest();
		
		ArrayList<Integer> inerList = test.listFill(ODDLINGTHLIST);
			
		ArrayList<ArrayList<Integer>> outerList;
		
		try {
			outerList = test.partition(inerList, DIVIEPEERNUMBRE);
			
			test.printList(outerList);
			assertEquals("[[0, 1], [2, 3], [4, 5], [6, 7], [8, 9], [10, 11], [12]]", os.toString());

			// Restore normal operation   
			System.setOut(originalOut);
			
		} catch (PartitionExceptions e) {}	
	}
	
	
	//list with odd length divided on add number should divide list on not equal sub list
	@Test
	void oddListLengthOddSubListLengthTest() {
		
		System.setOut(ps);
		
		ListHomeTest test = new ListHomeTest();
		
		ArrayList<Integer> inerList = test.listFill(ODDLINGTHLIST);
			
		ArrayList<ArrayList<Integer>> outerList;
		
		try {
			outerList = test.partition(inerList, DIVIEODDNUMBRE);
			
			test.printList(outerList);
			assertEquals("[[0, 1, 2], [3, 4, 5], [6, 7, 8], [9, 10, 11], [12]]", os.toString());

			// Restore normal operation   
			System.setOut(originalOut);
			
		} catch (PartitionExceptions e) {}	
	}
	
	//list with odd length divided on add number should show exception
	@Test
	void negativeSubListLengthTest() {
		
		System.setOut(ps);
		
		ListHomeTest test = new ListHomeTest();
		
		ArrayList<Integer> inerList = test.listFill(ODDLINGTHLIST);
			
		ArrayList<ArrayList<Integer>> outerList;
		
		try {
			outerList = test.partition(inerList, DIVIENEGATIVENUMBRE);
			
			test.printList(outerList);
			assertEquals("The zise of sub list must be greather than 0 !", os.toString());

			// Restore normal operation   
			System.setOut(originalOut);
			
		} catch (PartitionExceptions e) {}	
	}
	
	//list with odd length divided on add number should show exception
	@Test
	void emptyListTest() {
		
		System.setOut(ps);
		
		ListHomeTest test = new ListHomeTest();
		
		ArrayList<Integer> inerList = test.listFill(EMPLYLIST);
			
		ArrayList<ArrayList<Integer>> outerList;
		
		try {
			outerList = test.partition(inerList, DIVIENEGATIVENUMBRE);
			
			test.printList(outerList);
			assertEquals("The inner list must be not empty !", os.toString());

			// Restore normal operation   
			System.setOut(originalOut);
			
		} catch (PartitionExceptions e) {}	
	}
	
	//list with small size divided on big number should show exception
	@Test
	void sizeSubListGreatherThanSizeListTest() {
		
		System.setOut(ps);
		
		ListHomeTest test = new ListHomeTest();
		
		ArrayList<Integer> inerList = test.listFill(EMPLYLIST);
			
		ArrayList<ArrayList<Integer>> outerList;
		
		try {
			outerList = test.partition(inerList, DIVIENEGATIVENUMBRE);
			
			test.printList(outerList);
			assertEquals("The zise of inner list must be greather than size of sub list !", os.toString());

			// Restore normal operation   
			System.setOut(originalOut);
			
		} catch (PartitionExceptions e) {}	
	}
}
