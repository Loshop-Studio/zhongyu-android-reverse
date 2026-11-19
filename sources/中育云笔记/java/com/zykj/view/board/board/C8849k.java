package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8850l;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.board.k */
/* loaded from: classes6.dex */
public final class C8849k {

    /* renamed from: a */
    public final AbstractC8850l f20255a;

    public C8849k(AbstractC8850l expandStatus) {
        AbstractC9979u.m20294g(expandStatus, "expandStatus");
        this.f20255a = expandStatus;
    }

    /* renamed from: a */
    public final C8849k m16974a(AbstractC8850l expandStatus) {
        AbstractC9979u.m20294g(expandStatus, "expandStatus");
        return new C8849k(expandStatus);
    }

    /* renamed from: b */
    public final AbstractC8850l m16975b() {
        return this.f20255a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8849k) && AbstractC9979u.m20289b(this.f20255a, ((C8849k) obj).f20255a);
    }

    public int hashCode() {
        return this.f20255a.hashCode();
    }

    public String toString() {
        return "ExpandState(expandStatus=" + this.f20255a + ")";
    }

    public /* synthetic */ C8849k(AbstractC8850l abstractC8850l, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? AbstractC8850l.b.f20258b : abstractC8850l);
    }
}
