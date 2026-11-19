package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.c */
/* loaded from: classes3.dex */
public final class C5025c extends AbstractC5057l {

    /* renamed from: a */
    public final C5066p f7836a;

    public C5025c(C5066p c5066p) {
        this.f7836a = c5066p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5025c) && AbstractC5830k.m5325b(this.f7836a, ((C5025c) obj).f7836a);
    }

    public final int hashCode() {
        return this.f7836a.hashCode();
    }

    public final String toString() {
        return "NotebookFilter(draft=" + this.f7836a + ")";
    }
}
