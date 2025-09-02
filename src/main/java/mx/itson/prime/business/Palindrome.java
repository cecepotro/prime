/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.prime.business;

/**
 *
 * @author janto
 */
public class Palindrome {

    /**
     * @return the leftToRight
     */
    public String getLeftToRight() {
        return leftToRight;
    }

    /**
     * @param leftToRight the leftToRight to set
     */
    public void setLeftToRight(String leftToRight) {
        this.leftToRight = leftToRight;
    }

    /**
     * @return the rightToLeft
     */
    public String getRightToLeft() {
        return rightToLeft;
    }

    /**
     * @param rightToLeft the rightToLeft to set
     */
    public void setRightToLeft(String rightToLeft) {
        this.rightToLeft = rightToLeft;
    }

    /**
     * @return the result
     */
    public boolean isResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(boolean result) {
        this.result = result;
    }
    
    private String leftToRight;
    private String rightToLeft;
    private boolean result;
    
    
    /*public static boolean isPalindrome(String value){
        // Limpia la cadena de texto y le quita espacios y transforma a minúsculas
        String text = value.replaceAll("\\s", "").toLowerCase();
        // Convierte el texto a un array de char
        char[] letras = text.toCharArray();
        // Determina la longitud del array
        int count =  letras.length;
        
        for(char l : letras){
            if(l != letras[count - 1]){
                return false;
            }else{
                count -= 1;
                //count = count - 1;
                
            }
        }
        return true;
    }*/
    
    public static Palindrome isPalindrome(String value){
        // Limpia la cadena de texto y le quita espacios y transforma a minúsculas
        String text = value.replaceAll("\\s", "").toLowerCase();
        // Convierte el texto a un array de char
        char[] letras = text.toCharArray();
        // Determina la longitud del array
        int count =  letras.length;
        
        for(char l : letras){
            if(l != letras[count - 1]){
                return false;
            }else{
                count -= 1;
                //count = count - 1;
                /*if(count < 0){
                    return true;
                }*/
            }
        }
        return true;
    }
}
