package com.dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FileHandling {

	HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

	
	public  void createMap(File file) throws FileNotFoundException {
		
		
		FileReader fis = new FileReader(file);
		BufferedReader br = new BufferedReader(fis);
		
		
		
		String line;
		
		try {
			while((line = br.readLine())!=null) {
				String [] temp = line.split(":|\\,");
				HashSet<String> hs= new HashSet<>();
				
				
				for(String i : temp) {
					hs.add(i);
				}
				
				map.put(temp[0], hs);
				
			}

			System.out.println(map);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void searchForWord(String name) {
		if(map.containsKey(name)) {
			System.out.println(name + " in different languages : ");
			System.out.println(map.get(name));
		}else {
			System.out.println("Not found... Do you want to add this entry into the dictionary?");
		}

}
}
