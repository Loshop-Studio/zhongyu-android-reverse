package com.zykj.mistake.feature.ask;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.ask.i */
/* loaded from: classes3.dex */
public final class C4526i extends AbstractC4528j {

    /* renamed from: a */
    public final String f6250a;

    public C4526i(String str) {
        this.f6250a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4526i) && AbstractC5830k.m5325b(this.f6250a, ((C4526i) obj).f6250a);
    }

    public final int hashCode() {
        return this.f6250a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ShowTip(message=", this.f6250a, ")");
    }
}
