package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7674q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.p */
/* loaded from: classes5.dex */
public final class C7673p {

    /* renamed from: a */
    public final boolean f12263a;

    /* renamed from: b */
    public final boolean f12264b;

    /* renamed from: c */
    public final boolean f12265c;

    /* renamed from: d */
    public final boolean f12266d;

    /* renamed from: e */
    public final AbstractC7674q f12267e;

    public C7673p(boolean z9, boolean z10, boolean z11, boolean z12, AbstractC7674q graphType) {
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        this.f12263a = z9;
        this.f12264b = z10;
        this.f12265c = z11;
        this.f12266d = z12;
        this.f12267e = graphType;
    }

    /* renamed from: b */
    public static /* synthetic */ C7673p m11423b(C7673p c7673p, boolean z9, boolean z10, boolean z11, boolean z12, AbstractC7674q abstractC7674q, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = c7673p.f12263a;
        }
        if ((i9 & 2) != 0) {
            z10 = c7673p.f12264b;
        }
        if ((i9 & 4) != 0) {
            z11 = c7673p.f12265c;
        }
        if ((i9 & 8) != 0) {
            z12 = c7673p.f12266d;
        }
        if ((i9 & 16) != 0) {
            abstractC7674q = c7673p.f12267e;
        }
        AbstractC7674q abstractC7674q2 = abstractC7674q;
        boolean z13 = z11;
        return c7673p.m11424a(z9, z10, z13, z12, abstractC7674q2);
    }

    /* renamed from: a */
    public final C7673p m11424a(boolean z9, boolean z10, boolean z11, boolean z12, AbstractC7674q graphType) {
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        return new C7673p(z9, z10, z11, z12, graphType);
    }

    /* renamed from: c */
    public final boolean m11425c() {
        return this.f12264b;
    }

    /* renamed from: d */
    public final boolean m11426d() {
        return this.f12263a;
    }

    /* renamed from: e */
    public final AbstractC7674q m11427e() {
        return this.f12267e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7673p)) {
            return false;
        }
        C7673p c7673p = (C7673p) obj;
        return this.f12263a == c7673p.f12263a && this.f12264b == c7673p.f12264b && this.f12265c == c7673p.f12265c && this.f12266d == c7673p.f12266d && Intrinsics.areEqual(this.f12267e, c7673p.f12267e);
    }

    /* renamed from: f */
    public final boolean m11428f() {
        return this.f12266d;
    }

    /* renamed from: g */
    public final boolean m11429g() {
        return this.f12265c;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f12263a) * 31) + Boolean.hashCode(this.f12264b)) * 31) + Boolean.hashCode(this.f12265c)) * 31) + Boolean.hashCode(this.f12266d)) * 31) + this.f12267e.hashCode();
    }

    public String toString() {
        return "GraphToolState(galleryVisible=" + this.f12263a + ", cameraVisible=" + this.f12264b + ", textVisible=" + this.f12265c + ", graphVisible=" + this.f12266d + ", graphType=" + this.f12267e + ")";
    }

    public /* synthetic */ C7673p(boolean z9, boolean z10, boolean z11, boolean z12, AbstractC7674q abstractC7674q, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, (i9 & 4) != 0 ? false : z11, (i9 & 8) != 0 ? false : z12, (i9 & 16) != 0 ? AbstractC7674q.a.f12272e : abstractC7674q);
    }
}
