package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7659b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.a */
/* loaded from: classes5.dex */
public final class C7658a {

    /* renamed from: a */
    public final boolean f12204a;

    /* renamed from: b */
    public final AbstractC7659b f12205b;

    public C7658a(boolean z9, AbstractC7659b backgroundType) {
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f12204a = z9;
        this.f12205b = backgroundType;
    }

    /* renamed from: b */
    public static /* synthetic */ C7658a m11377b(C7658a c7658a, boolean z9, AbstractC7659b abstractC7659b, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = c7658a.f12204a;
        }
        if ((i9 & 2) != 0) {
            abstractC7659b = c7658a.f12205b;
        }
        return c7658a.m11378a(z9, abstractC7659b);
    }

    /* renamed from: a */
    public final C7658a m11378a(boolean z9, AbstractC7659b backgroundType) {
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        return new C7658a(z9, backgroundType);
    }

    /* renamed from: c */
    public final boolean m11379c() {
        return this.f12204a;
    }

    /* renamed from: d */
    public final AbstractC7659b m11380d() {
        return this.f12205b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7658a)) {
            return false;
        }
        C7658a c7658a = (C7658a) obj;
        return this.f12204a == c7658a.f12204a && Intrinsics.areEqual(this.f12205b, c7658a.f12205b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f12204a) * 31) + this.f12205b.hashCode();
    }

    public String toString() {
        return "BackgroundToolState(backgroundLineVisible=" + this.f12204a + ", backgroundType=" + this.f12205b + ")";
    }

    public /* synthetic */ C7658a(boolean z9, AbstractC7659b abstractC7659b, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? AbstractC7659b.d.f12214f : abstractC7659b);
    }
}
