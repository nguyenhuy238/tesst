/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testjunit;

/**
 *
 * @author GIGABYTE
 */
public class TestJUnit {

    public String categorizeNumber(int num) {
        if (num < 0) {
            return "Negative";
        } else if (num == 0) {
            return "Zero";
        } else if (num > 0 && num <= 10) {
            return "Small Positive";
        } else {
            return "Large Positive";
        }
    }
    
}
