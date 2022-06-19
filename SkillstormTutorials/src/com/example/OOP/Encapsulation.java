package com.example.OOP; //must be first line of code

class Door {
    Key key; // must import key because it's in a diff package
    Frame frame; // No need for import since Frame is in same package as Door
    String string; //String is in java.lang and will never have to import
}
    class Frame {
        Door door; // No need for import since Frame is in same package as Door
        String string; //String is in java.lang and will never have to import
    }

   class Key {
    }

