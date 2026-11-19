package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8227w;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.board.v */
/* loaded from: classes5.dex */
public final class C8226v {

    /* renamed from: a */
    public final AbstractC8227w f15113a;

    /* renamed from: b */
    public final boolean f15114b;

    /* renamed from: c */
    public final String f15115c;

    public C8226v(AbstractC8227w recordStatus, boolean z10, String progress) {
        AbstractC9133u.m16133g(recordStatus, "recordStatus");
        AbstractC9133u.m16133g(progress, "progress");
        this.f15113a = recordStatus;
        this.f15114b = z10;
        this.f15115c = progress;
    }

    /* renamed from: b */
    public static /* synthetic */ C8226v m12913b(C8226v c8226v, AbstractC8227w abstractC8227w, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC8227w = c8226v.f15113a;
        }
        if ((i10 & 2) != 0) {
            z10 = c8226v.f15114b;
        }
        if ((i10 & 4) != 0) {
            str = c8226v.f15115c;
        }
        return c8226v.m12914a(abstractC8227w, z10, str);
    }

    /* renamed from: a */
    public final C8226v m12914a(AbstractC8227w recordStatus, boolean z10, String progress) {
        AbstractC9133u.m16133g(recordStatus, "recordStatus");
        AbstractC9133u.m16133g(progress, "progress");
        return new C8226v(recordStatus, z10, progress);
    }

    /* renamed from: c */
    public final String m12915c() {
        return this.f15115c;
    }

    /* renamed from: d */
    public final AbstractC8227w m12916d() {
        return this.f15113a;
    }

    /* renamed from: e */
    public final boolean m12917e() {
        return this.f15114b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8226v)) {
            return false;
        }
        C8226v c8226v = (C8226v) obj;
        return AbstractC9133u.m16128b(this.f15113a, c8226v.f15113a) && this.f15114b == c8226v.f15114b && AbstractC9133u.m16128b(this.f15115c, c8226v.f15115c);
    }

    public int hashCode() {
        return (((this.f15113a.hashCode() * 31) + Boolean.hashCode(this.f15114b)) * 31) + this.f15115c.hashCode();
    }

    public String toString() {
        return "RecordState(recordStatus=" + this.f15113a + ", isMicrophoneOn=" + this.f15114b + ", progress=" + this.f15115c + ")";
    }

    public /* synthetic */ C8226v(AbstractC8227w abstractC8227w, boolean z10, String str, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? AbstractC8227w.b.f15122f : abstractC8227w, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? "00:00" : str);
    }
}
