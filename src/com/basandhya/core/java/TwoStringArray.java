package com.basandhya.core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoStringArray {
    private static List<String> commonElemnets = null;

    public static void main(String[] args) {
        String allListedValidErrors = "E10,E13,E11,E25,E15";
        String errorsAppeaedOnScreen= "E10 E25 E11";
        String[] totalListedErrors = allListedValidErrors.split(",");
        String[] totalActualErrors = allListedValidErrors.split("\\s+");
        doesValidErrosContainActual(totalListedErrors, totalActualErrors);

        }


    private static boolean doesValidErrosContainActual(String[] totalPossibleErrors, String[] actualErros) {
        List<String> validErrors= new ArrayList<>(Arrays.asList(totalPossibleErrors));
        List<String> actualErrors= new ArrayList<>(Arrays.asList(actualErros));
        List<String> commoanElements= new ArrayList<>();
        commoanElements.addAll(validErrors);
        commoanElements.retainAll(actualErrors);
        boolean doesValidErrosContainActual=false;
        for(int i=0 ; i<commoanElements.size(); i++){
            if(actualErrors.contains(actualErrors.get(i))&& (commoanElements.size()==actualErrors.size())){
                doesValidErrosContainActual=true;
            }
            System.out.println(":::: "+doesValidErrosContainActual);
            System.out.println(actualErrors.get(i));
        }
        return doesValidErrosContainActual;
    }

}
