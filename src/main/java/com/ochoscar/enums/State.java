package com.ochoscar.enums;

public enum State {

    ACTIVE(1), UNAVAILABLE(2), ENABLED(3);

    int v;

    State(int value) {
        v = value;
    }

    public int getV() {
        return v;
    }

}
