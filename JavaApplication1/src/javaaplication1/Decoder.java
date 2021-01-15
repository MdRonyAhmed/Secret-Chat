package javaapplication1;

import java.util.HashMap;

public class Decoder {

    private String decodedStr;
    private final HashMap<String, Character> hashMap;
    public HashMap<String, Character> hmapCodeR;

    public Decoder(String decodedStr, HashMap<String, Character> huffmanTree) {
        this.decodedStr = decodedStr;
        this.hashMap = huffmanTree;
    }

    public String decode() {
        StringBuilder sb = new StringBuilder();
        String t = "";

        for (int i = 0; i < decodedStr.length(); i++) {
            t += decodedStr.charAt(i);
            if (hashMap.containsKey(t)) {
                sb.append(hashMap.get(t));
                t = "";
            }
        }
        decodedStr = sb.toString();
        return decodedStr;
    }

}
