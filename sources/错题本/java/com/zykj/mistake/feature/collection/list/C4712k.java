package com.zykj.mistake.feature.collection.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.list.k */
/* loaded from: classes3.dex */
public final class C4712k extends AbstractC4722u {

    /* renamed from: a */
    public final String f6764a;

    public C4712k(String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f6764a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4712k) && AbstractC5830k.m5325b(this.f6764a, ((C4712k) obj).f6764a);
    }

    public final int hashCode() {
        return this.f6764a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ChangeCreateName(name=", this.f6764a, ")");
    }
}
