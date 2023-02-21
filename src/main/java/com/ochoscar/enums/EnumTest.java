package com.ochoscar.enums;

public class EnumTest {

    public static void main(String[] args) {
        State s = State.ACTIVE;
        for(State sitr : State.values()) {
            System.out.println(sitr);
        }

        switch(s) {
            case ACTIVE:
                System.out.println("Valor por defecto");
                break;
            default:
                System.out.println("Valor por defecto");
        }

    }
}
