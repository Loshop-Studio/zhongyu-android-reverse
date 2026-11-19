package com.zykj.blackboard.enums;

/* loaded from: classes4.dex */
public enum TextActionType {
    DELETE(0),
    TRANSLATE(1),
    SCALE(2);

    private int value;

    TextActionType(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i10) {
        this.value = i10;
    }
}
