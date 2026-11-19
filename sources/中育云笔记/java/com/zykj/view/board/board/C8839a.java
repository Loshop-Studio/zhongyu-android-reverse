package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8840b;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.board.a */
/* loaded from: classes6.dex */
public final class C8839a {

    /* renamed from: a */
    public final boolean f20213a;

    /* renamed from: b */
    public final AbstractC8840b f20214b;

    public C8839a(boolean z10, AbstractC8840b backgroundType) {
        AbstractC9979u.m20294g(backgroundType, "backgroundType");
        this.f20213a = z10;
        this.f20214b = backgroundType;
    }

    /* renamed from: b */
    public static /* synthetic */ C8839a m16943b(C8839a c8839a, boolean z10, AbstractC8840b abstractC8840b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c8839a.f20213a;
        }
        if ((i10 & 2) != 0) {
            abstractC8840b = c8839a.f20214b;
        }
        return c8839a.m16944a(z10, abstractC8840b);
    }

    /* renamed from: a */
    public final C8839a m16944a(boolean z10, AbstractC8840b backgroundType) {
        AbstractC9979u.m20294g(backgroundType, "backgroundType");
        return new C8839a(z10, backgroundType);
    }

    /* renamed from: c */
    public final boolean m16945c() {
        return this.f20213a;
    }

    /* renamed from: d */
    public final AbstractC8840b m16946d() {
        return this.f20214b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8839a)) {
            return false;
        }
        C8839a c8839a = (C8839a) obj;
        return this.f20213a == c8839a.f20213a && AbstractC9979u.m20289b(this.f20214b, c8839a.f20214b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f20213a) * 31) + this.f20214b.hashCode();
    }

    public String toString() {
        return "BackgroundToolState(backgroundLineVisible=" + this.f20213a + ", backgroundType=" + this.f20214b + ")";
    }

    public /* synthetic */ C8839a(boolean z10, AbstractC8840b abstractC8840b, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? AbstractC8840b.d.f20223f : abstractC8840b);
    }
}
