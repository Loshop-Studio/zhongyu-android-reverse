package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7225l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.k */
/* loaded from: classes5.dex */
public final class C7224k {

    /* renamed from: a */
    public final boolean f11044a;

    /* renamed from: b */
    public final boolean f11045b;

    /* renamed from: c */
    public final boolean f11046c;

    /* renamed from: d */
    public final boolean f11047d;

    /* renamed from: e */
    public final AbstractC7225l f11048e;

    public C7224k(boolean z9, boolean z10, boolean z11, boolean z12, AbstractC7225l graphType) {
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        this.f11044a = z9;
        this.f11045b = z10;
        this.f11046c = z11;
        this.f11047d = z12;
        this.f11048e = graphType;
    }

    /* renamed from: b */
    public static /* synthetic */ C7224k m10993b(C7224k c7224k, boolean z9, boolean z10, boolean z11, boolean z12, AbstractC7225l abstractC7225l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = c7224k.f11044a;
        }
        if ((i10 & 2) != 0) {
            z10 = c7224k.f11045b;
        }
        if ((i10 & 4) != 0) {
            z11 = c7224k.f11046c;
        }
        if ((i10 & 8) != 0) {
            z12 = c7224k.f11047d;
        }
        if ((i10 & 16) != 0) {
            abstractC7225l = c7224k.f11048e;
        }
        AbstractC7225l abstractC7225l2 = abstractC7225l;
        boolean z13 = z11;
        return c7224k.m10994a(z9, z10, z13, z12, abstractC7225l2);
    }

    /* renamed from: a */
    public final C7224k m10994a(boolean z9, boolean z10, boolean z11, boolean z12, AbstractC7225l graphType) {
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        return new C7224k(z9, z10, z11, z12, graphType);
    }

    /* renamed from: c */
    public final boolean m10995c() {
        return this.f11045b;
    }

    /* renamed from: d */
    public final boolean m10996d() {
        return this.f11044a;
    }

    /* renamed from: e */
    public final AbstractC7225l m10997e() {
        return this.f11048e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7224k)) {
            return false;
        }
        C7224k c7224k = (C7224k) obj;
        return this.f11044a == c7224k.f11044a && this.f11045b == c7224k.f11045b && this.f11046c == c7224k.f11046c && this.f11047d == c7224k.f11047d && Intrinsics.areEqual(this.f11048e, c7224k.f11048e);
    }

    /* renamed from: f */
    public final boolean m10998f() {
        return this.f11047d;
    }

    /* renamed from: g */
    public final boolean m10999g() {
        return this.f11046c;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f11044a) * 31) + Boolean.hashCode(this.f11045b)) * 31) + Boolean.hashCode(this.f11046c)) * 31) + Boolean.hashCode(this.f11047d)) * 31) + this.f11048e.hashCode();
    }

    public String toString() {
        return "GraphToolState(galleryVisible=" + this.f11044a + ", cameraVisible=" + this.f11045b + ", textVisible=" + this.f11046c + ", graphVisible=" + this.f11047d + ", graphType=" + this.f11048e + ")";
    }

    public /* synthetic */ C7224k(boolean z9, boolean z10, boolean z11, boolean z12, AbstractC7225l abstractC7225l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? AbstractC7225l.a.f11053e : abstractC7225l);
    }
}
