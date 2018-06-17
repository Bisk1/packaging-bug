package org.daniel;

public class Main {

    public void main(String[] args) throws Exception {
        try {
            System.out.println("Hello");
        } catch (IllegalAccessError | IllegalArgumentException e) {
            System.out.println("Catched");
        }
    }
}
