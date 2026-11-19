package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.h */
/* loaded from: classes3.dex */
public final class C4595h extends AbstractC4605m {

    /* renamed from: a */
    public final String f6483a;

    /* renamed from: b */
    public final String f6484b;

    public C4595h(String str, String str2) {
        this.f6483a = str;
        this.f6484b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4595h)) {
            return false;
        }
        C4595h c4595h = (C4595h) obj;
        return AbstractC5830k.m5325b(this.f6483a, c4595h.f6483a) && AbstractC5830k.m5325b(this.f6484b, c4595h.f6484b);
    }

    public final int hashCode() {
        String str = this.f6483a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6484b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC0037f.m87l("OpenCustomTimePicker(startTime=", this.f6483a, ", endTime=", this.f6484b, ")");
    }
}
