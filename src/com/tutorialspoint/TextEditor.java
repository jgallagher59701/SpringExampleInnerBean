package com.tutorialspoint;

public class TextEditor {
    private SpellChecker spellChecker;

    // dependency injection via ctor. This can be done using a setter as well.
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
