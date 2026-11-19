package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8216l;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.board.k */
/* loaded from: classes5.dex */
public final class C8215k {

    /* renamed from: a */
    public final AbstractC8216l f15039a;

    public C8215k(AbstractC8216l expandStatus) {
        AbstractC9133u.m16133g(expandStatus, "expandStatus");
        this.f15039a = expandStatus;
    }

    /* renamed from: a */
    public final C8215k m12858a(AbstractC8216l expandStatus) {
        AbstractC9133u.m16133g(expandStatus, "expandStatus");
        return new C8215k(expandStatus);
    }

    /* renamed from: b */
    public final AbstractC8216l m12859b() {
        return this.f15039a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8215k) && AbstractC9133u.m16128b(this.f15039a, ((C8215k) obj).f15039a);
    }

    public int hashCode() {
        return this.f15039a.hashCode();
    }

    public String toString() {
        return "ExpandState(expandStatus=" + this.f15039a + ")";
    }

    public /* synthetic */ C8215k(AbstractC8216l abstractC8216l, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? AbstractC8216l.b.f15042b : abstractC8216l);
    }
}
