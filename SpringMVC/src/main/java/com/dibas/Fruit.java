package com.dibas;

import java.util.List;
import java.util.Map;

public class Fruit {

	private List<String> fruitNameList;
	private Map<String, String> fruitNameMap;

	public List<String> getFruitNameList() {
		return fruitNameList;
	}

	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

	public Fruit() {
		// no arg constructor
	}

	public String talkAboutYou() {

		String speech = "Hi, I'm Fruit. ";

		if (fruitNameList != null && fruitNameList.size() > 0) {
			speech += "\nList :\n";
			for (int i = 0; i < fruitNameList.size(); i++) {
				speech += (i + 1) + " Name: " + fruitNameList.get(i) + "\n";
			}
		}

		if (fruitNameMap != null && fruitNameMap.size() > 0) {

			speech += "\nMap :\n";
			// int i=0;
			for (Map.Entry<String, String> fruitName : fruitNameMap.entrySet()) {
				speech +=
						// (i+1)+" "+
						fruitName.getKey() + " --> " + fruitName.getValue() + "\n";
				// i++;
			}

		}

		return speech;
	}

}
