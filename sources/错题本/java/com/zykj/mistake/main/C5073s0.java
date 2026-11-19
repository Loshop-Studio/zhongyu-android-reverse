package com.zykj.mistake.main;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.s0 */
/* loaded from: classes3.dex */
public final class C5073s0 extends AbstractC5057l {

    /* renamed from: a */
    public final List f7961a;

    public C5073s0(List customTags) {
        AbstractC5830k.m5330g(customTags, "customTags");
        this.f7961a = customTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5073s0) && AbstractC5830k.m5325b(this.f7961a, ((C5073s0) obj).f7961a);
    }

    public final int hashCode() {
        return this.f7961a.hashCode();
    }

    public final String toString() {
        return "RefreshTagEditorCustomTags(customTags=" + this.f7961a + ")";
    }
}
