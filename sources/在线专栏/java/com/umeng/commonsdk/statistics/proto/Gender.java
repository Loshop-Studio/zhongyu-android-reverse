package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.InterfaceC1863au;

/* loaded from: classes.dex */
public enum Gender implements InterfaceC1863au {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);

    private final int value;

    Gender(int i4) {
        this.value = i4;
    }

    public static Gender findByValue(int i4) {
        if (i4 == 0) {
            return MALE;
        }
        if (i4 == 1) {
            return FEMALE;
        }
        if (i4 != 2) {
            return null;
        }
        return UNKNOWN;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1863au
    public int getValue() {
        return this.value;
    }
}
