package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8206b;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.board.a */
/* loaded from: classes5.dex */
public final class C8205a {

    /* renamed from: a */
    public final boolean f14996a;

    /* renamed from: b */
    public final AbstractC8206b f14997b;

    public C8205a(boolean z10, AbstractC8206b backgroundType) {
        AbstractC9133u.m16133g(backgroundType, "backgroundType");
        this.f14996a = z10;
        this.f14997b = backgroundType;
    }

    /* renamed from: b */
    public static /* synthetic */ C8205a m12827b(C8205a c8205a, boolean z10, AbstractC8206b abstractC8206b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c8205a.f14996a;
        }
        if ((i10 & 2) != 0) {
            abstractC8206b = c8205a.f14997b;
        }
        return c8205a.m12828a(z10, abstractC8206b);
    }

    /* renamed from: a */
    public final C8205a m12828a(boolean z10, AbstractC8206b backgroundType) {
        AbstractC9133u.m16133g(backgroundType, "backgroundType");
        return new C8205a(z10, backgroundType);
    }

    /* renamed from: c */
    public final boolean m12829c() {
        return this.f14996a;
    }

    /* renamed from: d */
    public final AbstractC8206b m12830d() {
        return this.f14997b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8205a)) {
            return false;
        }
        C8205a c8205a = (C8205a) obj;
        return this.f14996a == c8205a.f14996a && AbstractC9133u.m16128b(this.f14997b, c8205a.f14997b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f14996a) * 31) + this.f14997b.hashCode();
    }

    public String toString() {
        return "BackgroundToolState(backgroundLineVisible=" + this.f14996a + ", backgroundType=" + this.f14997b + ")";
    }

    public /* synthetic */ C8205a(boolean z10, AbstractC8206b abstractC8206b, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? AbstractC8206b.d.f15006f : abstractC8206b);
    }
}
