package com.zykj.blackboard.enums;

/* loaded from: classes4.dex */
public enum TranslationType {
    ROTATE(0),
    DELETE(1),
    TRANSLATE(2),
    SCALE(3);

    private int value;

    TranslationType(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i10) {
        this.value = i10;
    }
}
