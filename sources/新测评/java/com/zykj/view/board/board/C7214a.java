package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7215b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.a */
/* loaded from: classes5.dex */
public final class C7214a {

    /* renamed from: a */
    public final boolean f11002a;

    /* renamed from: b */
    public final AbstractC7215b f11003b;

    public C7214a(boolean z9, AbstractC7215b backgroundType) {
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f11002a = z9;
        this.f11003b = backgroundType;
    }

    /* renamed from: b */
    public static /* synthetic */ C7214a m10958b(C7214a c7214a, boolean z9, AbstractC7215b abstractC7215b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = c7214a.f11002a;
        }
        if ((i10 & 2) != 0) {
            abstractC7215b = c7214a.f11003b;
        }
        return c7214a.m10959a(z9, abstractC7215b);
    }

    /* renamed from: a */
    public final C7214a m10959a(boolean z9, AbstractC7215b backgroundType) {
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        return new C7214a(z9, backgroundType);
    }

    /* renamed from: c */
    public final boolean m10960c() {
        return this.f11002a;
    }

    /* renamed from: d */
    public final AbstractC7215b m10961d() {
        return this.f11003b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7214a)) {
            return false;
        }
        C7214a c7214a = (C7214a) obj;
        return this.f11002a == c7214a.f11002a && Intrinsics.areEqual(this.f11003b, c7214a.f11003b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f11002a) * 31) + this.f11003b.hashCode();
    }

    public String toString() {
        return "BackgroundToolState(backgroundLineVisible=" + this.f11002a + ", backgroundType=" + this.f11003b + ")";
    }

    public /* synthetic */ C7214a(boolean z9, AbstractC7215b abstractC7215b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? AbstractC7215b.d.f11012f : abstractC7215b);
    }
}
