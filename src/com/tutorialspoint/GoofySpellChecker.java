package com.tutorialspoint;

public class GoofySpellChecker extends SpellChecker {
    public GoofySpellChecker() {
        System.out.println("Inside GoofySpellChecker constructor.");
    }

    public void checkSpelling() {
        System.out.println("Only errors...");
        super.checkSpelling();
    }
}
