package chapter2.recipe_02_08;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: IteratingOverCollectionData
 * Date: 2016-10-20
 * Time: 오전 9:02
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class IteratingOverCollectionData {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();

        //Populate the list
        for (int x = 0; x < 10; x++) {
            myList.add("Test " + x);
        }
        //Print each element within the list
        myList.stream().forEach((value) -> {
            System.out.println(value);
        });
    }
}
