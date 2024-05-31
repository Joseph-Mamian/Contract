package com.mycompany.contracts;

import being.Human;

public class Contracts {

    public static void main(String[] args) {
        Human persona1 = new Human ("pipe", 12);
        
        persona1.run();
        persona1.fly();
        persona1.crawl();
    }
}
