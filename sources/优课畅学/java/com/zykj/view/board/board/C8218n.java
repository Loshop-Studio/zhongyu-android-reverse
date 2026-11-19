package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8219o;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.board.n */
/* loaded from: classes5.dex */
public final class C8218n {

    /* renamed from: a */
    public final boolean f15052a;

    /* renamed from: b */
    public final boolean f15053b;

    /* renamed from: c */
    public final boolean f15054c;

    /* renamed from: d */
    public final boolean f15055d;

    /* renamed from: e */
    public final AbstractC8219o f15056e;

    public C8218n(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC8219o graphType) {
        AbstractC9133u.m16133g(graphType, "graphType");
        this.f15052a = z10;
        this.f15053b = z11;
        this.f15054c = z12;
        this.f15055d = z13;
        this.f15056e = graphType;
    }

    /* renamed from: b */
    public static /* synthetic */ C8218n m12872b(C8218n c8218n, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC8219o abstractC8219o, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c8218n.f15052a;
        }
        if ((i10 & 2) != 0) {
            z11 = c8218n.f15053b;
        }
        if ((i10 & 4) != 0) {
            z12 = c8218n.f15054c;
        }
        if ((i10 & 8) != 0) {
            z13 = c8218n.f15055d;
        }
        if ((i10 & 16) != 0) {
            abstractC8219o = c8218n.f15056e;
        }
        AbstractC8219o abstractC8219o2 = abstractC8219o;
        boolean z14 = z12;
        return c8218n.m12873a(z10, z11, z14, z13, abstractC8219o2);
    }

    /* renamed from: a */
    public final C8218n m12873a(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC8219o graphType) {
        AbstractC9133u.m16133g(graphType, "graphType");
        return new C8218n(z10, z11, z12, z13, graphType);
    }

    /* renamed from: c */
    public final boolean m12874c() {
        return this.f15053b;
    }

    /* renamed from: d */
    public final boolean m12875d() {
        return this.f15052a;
    }

    /* renamed from: e */
    public final AbstractC8219o m12876e() {
        return this.f15056e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8218n)) {
            return false;
        }
        C8218n c8218n = (C8218n) obj;
        return this.f15052a == c8218n.f15052a && this.f15053b == c8218n.f15053b && this.f15054c == c8218n.f15054c && this.f15055d == c8218n.f15055d && AbstractC9133u.m16128b(this.f15056e, c8218n.f15056e);
    }

    /* renamed from: f */
    public final boolean m12877f() {
        return this.f15055d;
    }

    /* renamed from: g */
    public final boolean m12878g() {
        return this.f15054c;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f15052a) * 31) + Boolean.hashCode(this.f15053b)) * 31) + Boolean.hashCode(this.f15054c)) * 31) + Boolean.hashCode(this.f15055d)) * 31) + this.f15056e.hashCode();
    }

    public String toString() {
        return "GraphToolState(galleryVisible=" + this.f15052a + ", cameraVisible=" + this.f15053b + ", textVisible=" + this.f15054c + ", graphVisible=" + this.f15055d + ", graphType=" + this.f15056e + ")";
    }

    public /* synthetic */ C8218n(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC8219o abstractC8219o, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? AbstractC8219o.a.f15061e : abstractC8219o);
    }
}
