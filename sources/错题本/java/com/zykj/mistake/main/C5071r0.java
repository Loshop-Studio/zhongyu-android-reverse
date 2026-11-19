package com.zykj.mistake.main;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.r0 */
/* loaded from: classes3.dex */
public final class C5071r0 extends AbstractC5057l {

    /* renamed from: a */
    public final List f7959a;

    public C5071r0(List customTags) {
        AbstractC5830k.m5330g(customTags, "customTags");
        this.f7959a = customTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5071r0) && AbstractC5830k.m5325b(this.f7959a, ((C5071r0) obj).f7959a);
    }

    public final int hashCode() {
        return this.f7959a.hashCode();
    }

    public final String toString() {
        return "OpenNotebookTagEditor(customTags=" + this.f7959a + ")";
    }
}
