package com.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SearchClient {
	public static void main(String[] args) throws FileNotFoundException {
		String loc = "C:\\Users\\MANI\\Desktop\\Java\\com.dictionary\\src\\com\\dictionary\\dictionary.txt";
		File file = new File(loc);
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		
		FileHandling fh = new FileHandling();
		fh.createMap(file);
		name = sc.nextLine();
		fh.searchForWord(name);
	}
}
