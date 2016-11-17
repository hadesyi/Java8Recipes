package chapter4.recipe_04_11;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * Project: Java8Recipes
 * FileName: recipe04_11
 * Date: 2016-11-17
 * Time: 오전 10:32
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_11 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Locl Date and Time : " + ldt);

        // Obtain the LocalDateTime object of the date 11/17/2016 at 11:11
        LocalDateTime ldt2 = LocalDateTime.of(2016, Month.NOVEMBER, 11, 12, 00);

        // Obtain the month from LocalDateTime object
        Month month = ldt.getMonth();
        int monthValue = ldt.getMonthValue();
        System.out.println("Month : " + month);
        System.out.println("Month Value : " + monthValue);
    }
}
