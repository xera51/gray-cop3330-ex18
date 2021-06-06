/*
 *  UCF COP3330 Summer 2021 Exercise 18 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    static App myApp = new App();

    @Test
    public void convert_32_F_to_C(){
        double F = 32;
        double C = myApp.convertFToC(F);

        String expectedOutput = "0";
        String actualOutput = String.format("%.0f", C);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void convert_0_C_to_F(){
        double C = 0;
        double F = myApp.convertCToF(C);

        String expectedOutput = "32";
        String actualOutput = String.format("%.0f", F);

        assertEquals(expectedOutput, actualOutput);
    }
}