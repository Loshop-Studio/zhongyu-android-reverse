package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.x */
/* loaded from: classes3.dex */
public final class C4986x extends AbstractC4988y {

    /* renamed from: a */
    public final String f7622a;

    public C4986x(String str) {
        this.f7622a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4986x) && AbstractC5830k.m5325b(this.f7622a, ((C4986x) obj).f7622a);
    }

    public final int hashCode() {
        return this.f7622a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ShowTip(message=", this.f7622a, ")");
    }
}
