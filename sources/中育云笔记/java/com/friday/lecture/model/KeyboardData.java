package com.friday.lecture.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p243m1.InterfaceC10191a;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class KeyboardData implements InterfaceC10191a {
    public static final int $stable = 0;
    private final String value;

    public KeyboardData(String value) {
        AbstractC9979u.m20294g(value, "value");
        this.value = value;
    }

    public static /* synthetic */ KeyboardData copy$default(KeyboardData keyboardData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = keyboardData.value;
        }
        return keyboardData.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final KeyboardData copy(String value) {
        AbstractC9979u.m20294g(value, "value");
        return new KeyboardData(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KeyboardData) && AbstractC9979u.m20289b(this.value, ((KeyboardData) obj).value);
    }

    @Override // p243m1.InterfaceC10191a
    public int getItemType() {
        return (this.value.length() > 0 ? 1 : 0) ^ 1;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final boolean isValue() {
        return this.value.length() > 0;
    }

    public String toString() {
        return "KeyboardData(value=" + this.value + ")";
    }
}
