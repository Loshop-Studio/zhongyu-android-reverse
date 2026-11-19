package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.g0 */
/* loaded from: classes3.dex */
public final class C5048g0 extends AbstractC5057l {

    /* renamed from: a */
    public final C5066p f7914a;

    public C5048g0(C5066p draft) {
        AbstractC5830k.m5330g(draft, "draft");
        this.f7914a = draft;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5048g0) && AbstractC5830k.m5325b(this.f7914a, ((C5048g0) obj).f7914a);
    }

    public final int hashCode() {
        return this.f7914a.hashCode();
    }

    public final String toString() {
        return "ConfirmNotebookFilter(draft=" + this.f7914a + ")";
    }
}
