package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.h0 */
/* loaded from: classes3.dex */
public final class C5050h0 extends AbstractC5057l {

    /* renamed from: a */
    public final RemoveDialogTarget f7917a;

    public C5050h0(RemoveDialogTarget target) {
        AbstractC5830k.m5330g(target, "target");
        this.f7917a = target;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5050h0) && this.f7917a == ((C5050h0) obj).f7917a;
    }

    public final int hashCode() {
        return this.f7917a.hashCode();
    }

    public final String toString() {
        return "ConfirmRemoveDialog(target=" + this.f7917a + ")";
    }
}
