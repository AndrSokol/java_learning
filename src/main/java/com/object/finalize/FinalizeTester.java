package com.object.finalize;

public class FinalizeTester {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Fin");
    }

    public static void main(String[] args) {
        FinalizeTester ft = null;
        for (int i = 0; i < 1000000; i++) {
            ft = new FinalizeTester();
            System.out.println("i");
        }
    }
}
