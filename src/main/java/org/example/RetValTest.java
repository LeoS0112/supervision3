package org.example;

public class RetValTest {
    public static String sEmail = "@cam.ac.uk";
    public static void extractCamEmail(String sentence) throws Exception{
        if (sentence==null){
            throw new Exception("null");
        }
        if (sentence.length() == 0){
            throw new Exception("sentence length 0");
        }
        String tokens[] = sentence.split(" "); // split into tokens
        for (int i=0; i< tokens.length; i++) {
            if (tokens[i].endsWith("@cam.ac.uk")) {
                sEmail=tokens[i];
                return;
            }
            else {
                throw new Exception("not Cambridge");
            }
        }
        throw new Exception("none found");
    }
    public static void main(String[] args) throws Exception {
        RetValTest.extractCamEmail("l@cam.ac.uk");
        System.out.println("Success: "+RetValTest.sEmail);
    }
}