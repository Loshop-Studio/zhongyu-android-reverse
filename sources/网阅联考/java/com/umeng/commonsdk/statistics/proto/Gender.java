package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.InterfaceC3347au;

/* loaded from: classes2.dex */
public enum Gender implements InterfaceC3347au {
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

    @Override // com.umeng.analytics.pro.InterfaceC3347au
    public int getValue() {
        return this.value;
    }
}
