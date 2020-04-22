package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		WordCount wordCount = new WordCount();
		wordCount.getWordCount("./alices_adventures_in_wonderland.txt");
	}

	private void getWordCount(String filename){
		int wordCount = 0;
		int sentenceCount = 0;
		try (Scanner scanner = new Scanner(new File(filename)) ) {
			while (scanner.hasNextLine()){
				String line = scanner.nextLine();
				if (line.isEmpty()){
					continue;
				}
				String[] words = line.trim().split("\\s+");
				wordCount = wordCount + words.length;
				for (String word : words){
					if (word.endsWith(".")
							|| word.endsWith("?")
							|| word.endsWith("!")) {
						sentenceCount++;
					}
				}
			}
			System.out.println("Word count: " + wordCount);
			System.out.println("Sentence count: " + sentenceCount);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
