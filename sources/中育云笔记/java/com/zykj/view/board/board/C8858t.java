package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8857s;
import com.zykj.view.board.board.AbstractC8859u;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.board.t */
/* loaded from: classes6.dex */
public final class C8858t {

    /* renamed from: a */
    public final boolean f20314a;

    /* renamed from: b */
    public final boolean f20315b;

    /* renamed from: c */
    public final AbstractC8859u f20316c;

    /* renamed from: d */
    public final int f20317d;

    /* renamed from: e */
    public final AbstractC8857s f20318e;

    public C8858t(boolean z10, boolean z11, AbstractC8859u penType, int i10, AbstractC8857s penColor) {
        AbstractC9979u.m20294g(penType, "penType");
        AbstractC9979u.m20294g(penColor, "penColor");
        this.f20314a = z10;
        this.f20315b = z11;
        this.f20316c = penType;
        this.f20317d = i10;
        this.f20318e = penColor;
    }

    /* renamed from: b */
    public static /* synthetic */ C8858t m17017b(C8858t c8858t, boolean z10, boolean z11, AbstractC8859u abstractC8859u, int i10, AbstractC8857s abstractC8857s, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = c8858t.f20314a;
        }
        if ((i11 & 2) != 0) {
            z11 = c8858t.f20315b;
        }
        if ((i11 & 4) != 0) {
            abstractC8859u = c8858t.f20316c;
        }
        if ((i11 & 8) != 0) {
            i10 = c8858t.f20317d;
        }
        if ((i11 & 16) != 0) {
            abstractC8857s = c8858t.f20318e;
        }
        AbstractC8857s abstractC8857s2 = abstractC8857s;
        AbstractC8859u abstractC8859u2 = abstractC8859u;
        return c8858t.m17018a(z10, z11, abstractC8859u2, i10, abstractC8857s2);
    }

    /* renamed from: a */
    public final C8858t m17018a(boolean z10, boolean z11, AbstractC8859u penType, int i10, AbstractC8857s penColor) {
        AbstractC9979u.m20294g(penType, "penType");
        AbstractC9979u.m20294g(penColor, "penColor");
        return new C8858t(z10, z11, penType, i10, penColor);
    }

    /* renamed from: c */
    public final boolean m17019c() {
        return this.f20314a;
    }

    /* renamed from: d */
    public final boolean m17020d() {
        return this.f20315b;
    }

    /* renamed from: e */
    public final AbstractC8857s m17021e() {
        return this.f20318e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8858t)) {
            return false;
        }
        C8858t c8858t = (C8858t) obj;
        return this.f20314a == c8858t.f20314a && this.f20315b == c8858t.f20315b && AbstractC9979u.m20289b(this.f20316c, c8858t.f20316c) && this.f20317d == c8858t.f20317d && AbstractC9979u.m20289b(this.f20318e, c8858t.f20318e);
    }

    /* renamed from: f */
    public final int m17022f() {
        return this.f20317d;
    }

    /* renamed from: g */
    public final AbstractC8859u m17023g() {
        return this.f20316c;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f20314a) * 31) + Boolean.hashCode(this.f20315b)) * 31) + this.f20316c.hashCode()) * 31) + Integer.hashCode(this.f20317d)) * 31) + this.f20318e.hashCode();
    }

    public String toString() {
        return "PenToolState(dotVisible=" + this.f20314a + ", highlighterVisible=" + this.f20315b + ", penType=" + this.f20316c + ", penSizeLevel=" + this.f20317d + ", penColor=" + this.f20318e + ")";
    }

    public /* synthetic */ C8858t(boolean z10, boolean z11, AbstractC8859u abstractC8859u, int i10, AbstractC8857s abstractC8857s, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? AbstractC8859u.b.f20325f : abstractC8859u, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? AbstractC8857s.a.f20306c : abstractC8857s);
    }
}
