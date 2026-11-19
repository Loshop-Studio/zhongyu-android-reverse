package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8853o;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.board.n */
/* loaded from: classes6.dex */
public final class C8852n {

    /* renamed from: a */
    public final boolean f20268a;

    /* renamed from: b */
    public final boolean f20269b;

    /* renamed from: c */
    public final boolean f20270c;

    /* renamed from: d */
    public final boolean f20271d;

    /* renamed from: e */
    public final AbstractC8853o f20272e;

    public C8852n(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC8853o graphType) {
        AbstractC9979u.m20294g(graphType, "graphType");
        this.f20268a = z10;
        this.f20269b = z11;
        this.f20270c = z12;
        this.f20271d = z13;
        this.f20272e = graphType;
    }

    /* renamed from: b */
    public static /* synthetic */ C8852n m16988b(C8852n c8852n, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC8853o abstractC8853o, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c8852n.f20268a;
        }
        if ((i10 & 2) != 0) {
            z11 = c8852n.f20269b;
        }
        if ((i10 & 4) != 0) {
            z12 = c8852n.f20270c;
        }
        if ((i10 & 8) != 0) {
            z13 = c8852n.f20271d;
        }
        if ((i10 & 16) != 0) {
            abstractC8853o = c8852n.f20272e;
        }
        AbstractC8853o abstractC8853o2 = abstractC8853o;
        boolean z14 = z12;
        return c8852n.m16989a(z10, z11, z14, z13, abstractC8853o2);
    }

    /* renamed from: a */
    public final C8852n m16989a(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC8853o graphType) {
        AbstractC9979u.m20294g(graphType, "graphType");
        return new C8852n(z10, z11, z12, z13, graphType);
    }

    /* renamed from: c */
    public final boolean m16990c() {
        return this.f20269b;
    }

    /* renamed from: d */
    public final boolean m16991d() {
        return this.f20268a;
    }

    /* renamed from: e */
    public final AbstractC8853o m16992e() {
        return this.f20272e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8852n)) {
            return false;
        }
        C8852n c8852n = (C8852n) obj;
        return this.f20268a == c8852n.f20268a && this.f20269b == c8852n.f20269b && this.f20270c == c8852n.f20270c && this.f20271d == c8852n.f20271d && AbstractC9979u.m20289b(this.f20272e, c8852n.f20272e);
    }

    /* renamed from: f */
    public final boolean m16993f() {
        return this.f20271d;
    }

    /* renamed from: g */
    public final boolean m16994g() {
        return this.f20270c;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f20268a) * 31) + Boolean.hashCode(this.f20269b)) * 31) + Boolean.hashCode(this.f20270c)) * 31) + Boolean.hashCode(this.f20271d)) * 31) + this.f20272e.hashCode();
    }

    public String toString() {
        return "GraphToolState(galleryVisible=" + this.f20268a + ", cameraVisible=" + this.f20269b + ", textVisible=" + this.f20270c + ", graphVisible=" + this.f20271d + ", graphType=" + this.f20272e + ")";
    }

    public /* synthetic */ C8852n(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC8853o abstractC8853o, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? AbstractC8853o.a.f20277e : abstractC8853o);
    }
}
