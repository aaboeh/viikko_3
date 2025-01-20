package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder;

    public Safe(String pinCode) {
        this.pinCode = pinCode;
        this.safeFolder = new ArrayList<>();
    }

    public void changePinCode(String newPinCode) {
        this.pinCode = newPinCode;
    }

    public void addToSafe(String info) {
        safeFolder.add(info);
    }

    public ArrayList<String> getContentsFromSafe(String inputPinCode) {
        if (this.pinCode.equals(inputPinCode)) {
            return this.safeFolder;
        } else {
            System.out.println("Väärä PIN-koodi!");
            return null;
        }
    }

}
