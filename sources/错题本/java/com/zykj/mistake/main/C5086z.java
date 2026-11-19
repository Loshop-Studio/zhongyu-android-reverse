package com.zykj.mistake.main;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.z */
/* loaded from: classes3.dex */
public final class C5086z extends AbstractC5020a0 {

    /* renamed from: a */
    public final String f7979a;

    /* renamed from: b */
    public final String f7980b;

    public C5086z(String str, String str2) {
        this.f7979a = str;
        this.f7980b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5086z)) {
            return false;
        }
        C5086z c5086z = (C5086z) obj;
        return AbstractC5830k.m5325b(this.f7979a, c5086z.f7979a) && AbstractC5830k.m5325b(this.f7980b, c5086z.f7980b);
    }

    public final int hashCode() {
        String str = this.f7979a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7980b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC0037f.m87l("ShowNotebookDatePicker(startTime=", this.f7979a, ", endTime=", this.f7980b, ")");
    }
}
