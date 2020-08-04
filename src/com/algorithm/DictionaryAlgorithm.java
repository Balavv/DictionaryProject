package com.algorithm;

public class DictionaryAlgorithm {

	public static void main(String args[]) {

		DictionaryMap map = new DictionaryMap();

		map.save("Dog", "Animal");

		System.out.println(map.findByKey("Dog"));

	}

}
