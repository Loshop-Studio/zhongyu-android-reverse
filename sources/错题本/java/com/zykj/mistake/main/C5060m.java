package com.zykj.mistake.main;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.m */
/* loaded from: classes3.dex */
public final class C5060m {

    /* renamed from: a */
    public final AbstractC5057l f7930a;

    /* renamed from: b */
    public final RemoveDialogTarget f7931b;

    public C5060m(AbstractC5057l endDrawer, RemoveDialogTarget removeDialogTarget) {
        AbstractC5830k.m5330g(endDrawer, "endDrawer");
        this.f7930a = endDrawer;
        this.f7931b = removeDialogTarget;
    }

    /* renamed from: a */
    public static C5060m m4378a(C5060m c5060m, AbstractC5057l endDrawer, RemoveDialogTarget removeDialogTarget, int i) {
        if ((i & 1) != 0) {
            endDrawer = c5060m.f7930a;
        }
        if ((i & 2) != 0) {
            removeDialogTarget = c5060m.f7931b;
        }
        c5060m.getClass();
        AbstractC5830k.m5330g(endDrawer, "endDrawer");
        return new C5060m(endDrawer, removeDialogTarget);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5060m)) {
            return false;
        }
        C5060m c5060m = (C5060m) obj;
        return AbstractC5830k.m5325b(this.f7930a, c5060m.f7930a) && this.f7931b == c5060m.f7931b;
    }

    public final int hashCode() {
        int iHashCode = this.f7930a.hashCode() * 31;
        RemoveDialogTarget removeDialogTarget = this.f7931b;
        return iHashCode + (removeDialogTarget == null ? 0 : removeDialogTarget.hashCode());
    }

    public final String toString() {
        return "MainShellState(endDrawer=" + this.f7930a + ", removeDialogTarget=" + this.f7931b + ")";
    }
}
