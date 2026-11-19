package com.zykj.mistake.feature.collection.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.list.f */
/* loaded from: classes3.dex */
public final class C4707f extends AbstractC4708g {

    /* renamed from: a */
    public final String f6760a;

    public C4707f(String str) {
        this.f6760a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4707f) && AbstractC5830k.m5325b(this.f6760a, ((C4707f) obj).f6760a);
    }

    public final int hashCode() {
        return this.f6760a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ShowTip(message=", this.f6760a, ")");
    }
}
