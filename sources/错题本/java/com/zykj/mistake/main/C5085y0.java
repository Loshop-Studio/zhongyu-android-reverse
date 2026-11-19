package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.y0 */
/* loaded from: classes3.dex */
public final class C5085y0 extends AbstractC5057l {

    /* renamed from: a */
    public final RemoveDialogTarget f7978a;

    public C5085y0(RemoveDialogTarget target) {
        AbstractC5830k.m5330g(target, "target");
        this.f7978a = target;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5085y0) && this.f7978a == ((C5085y0) obj).f7978a;
    }

    public final int hashCode() {
        return this.f7978a.hashCode();
    }

    public final String toString() {
        return "ShowRemoveDialog(target=" + this.f7978a + ")";
    }
}
