package com.zykj.mistake.main;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.zykj.mistake.main.x0 */
/* loaded from: classes3.dex */
public final class C5083x0 extends AbstractC5057l {

    /* renamed from: a */
    public final int f7973a;

    public C5083x0(int i) {
        this.f7973a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5083x0) && this.f7973a == ((C5083x0) obj).f7973a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7973a);
    }

    public final String toString() {
        return AbstractC0037f.m82g(this.f7973a, "SelectNotebookTimeType(index=", ")");
    }
}
