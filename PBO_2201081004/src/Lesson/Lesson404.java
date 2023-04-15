/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson;

/**
 *
 * @author LAB-MM
 */
public class Lesson404 {
    public static void main(String[] args) {
        //---------------------------------------------------------------------------------------------
        //String Operations Example
        String string1= "Hello";
        String string2= "Caron";
        String string3=""; //empty String or null
        string3="How are you ".concat(string2);
        System.out.println("String3: " + string3);  
        //get length
        System.out.println("Length: "+ string1.length());
        //get substring beginning with character 0, up to,
        //but not including character 5
        System.out.println("sub: "+ string3.substring(0,5));
        //uppercase
        System.out.println("Upper: "+string3.toUpperCase());
        
        //---------------------------------------------------------------------------------------------------------------
        //String Concatenation Example
        String s1 = "This is a";
        String s2 = "string";
        String s3 = s1 + s2;
        String s4 = "This is a" + s2;
        s1 += s2;
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        
        //------------------------------------------------------------------------------------------------------------
        //CompareTo and equals
        
        String S1,S2;
        S1= "abc";
        S2= "cde";
        System.out.println(S2.compareTo(S1));
        
        S1= "abc";
        S2= "ABC";
        System.out.println(S1.equals(S2));
        System.out.println(S1.equalsIgnoreCase(S2));
        
        
        
        
    }
    
}
