package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.filter.o */
/* loaded from: classes3.dex */
public final class C4667o extends AbstractC4671q {

    /* renamed from: a */
    public final String f6667a;

    /* renamed from: b */
    public final String f6668b;

    public C4667o(String str, String str2) {
        this.f6667a = str;
        this.f6668b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4667o)) {
            return false;
        }
        C4667o c4667o = (C4667o) obj;
        return AbstractC5830k.m5325b(this.f6667a, c4667o.f6667a) && AbstractC5830k.m5325b(this.f6668b, c4667o.f6668b);
    }

    public final int hashCode() {
        String str = this.f6667a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6668b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC0037f.m87l("OpenCustomTimePicker(startTime=", this.f6667a, ", endTime=", this.f6668b, ")");
    }
}
