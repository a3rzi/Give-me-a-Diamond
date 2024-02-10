package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //given
         int  dimondSize = 3;

        //when

       List<String> dimond = buildDimond(dimondSize);
        for (String result : dimond) {
            System.out.println(result);
        }
    }
// *
//***
// *
    private static List<String> buildDimond(int dimondSize) {
       // Return null/nil/None/... if the input is an even number or negative
        if (dimondSize%2==0|| dimondSize<0){
            return null;
        }
        List<String> dimond = new ArrayList<>();
        for (int i = 0; i<dimondSize; i++){

            int space = Math.abs(dimondSize/2-i);
            int star = dimondSize-2*space;
            StringBuilder sb = new StringBuilder();
            for (int j =0; j<dimondSize; j++){
                sb.append(" ");
            }
            for (int j =0; j<dimondSize; j++){
                sb.append("*");
            }
            for (int j =0; j<dimondSize; j++){
                sb.append(" ");
            }
            dimond.add(sb.toString());



        }
        return dimond;
    }


}