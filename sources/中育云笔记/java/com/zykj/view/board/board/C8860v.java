package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8861w;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.board.v */
/* loaded from: classes6.dex */
public final class C8860v {

    /* renamed from: a */
    public final AbstractC8861w f20329a;

    /* renamed from: b */
    public final boolean f20330b;

    /* renamed from: c */
    public final String f20331c;

    public C8860v(AbstractC8861w recordStatus, boolean z10, String progress) {
        AbstractC9979u.m20294g(recordStatus, "recordStatus");
        AbstractC9979u.m20294g(progress, "progress");
        this.f20329a = recordStatus;
        this.f20330b = z10;
        this.f20331c = progress;
    }

    /* renamed from: b */
    public static /* synthetic */ C8860v m17029b(C8860v c8860v, AbstractC8861w abstractC8861w, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC8861w = c8860v.f20329a;
        }
        if ((i10 & 2) != 0) {
            z10 = c8860v.f20330b;
        }
        if ((i10 & 4) != 0) {
            str = c8860v.f20331c;
        }
        return c8860v.m17030a(abstractC8861w, z10, str);
    }

    /* renamed from: a */
    public final C8860v m17030a(AbstractC8861w recordStatus, boolean z10, String progress) {
        AbstractC9979u.m20294g(recordStatus, "recordStatus");
        AbstractC9979u.m20294g(progress, "progress");
        return new C8860v(recordStatus, z10, progress);
    }

    /* renamed from: c */
    public final String m17031c() {
        return this.f20331c;
    }

    /* renamed from: d */
    public final AbstractC8861w m17032d() {
        return this.f20329a;
    }

    /* renamed from: e */
    public final boolean m17033e() {
        return this.f20330b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8860v)) {
            return false;
        }
        C8860v c8860v = (C8860v) obj;
        return AbstractC9979u.m20289b(this.f20329a, c8860v.f20329a) && this.f20330b == c8860v.f20330b && AbstractC9979u.m20289b(this.f20331c, c8860v.f20331c);
    }

    public int hashCode() {
        return (((this.f20329a.hashCode() * 31) + Boolean.hashCode(this.f20330b)) * 31) + this.f20331c.hashCode();
    }

    public String toString() {
        return "RecordState(recordStatus=" + this.f20329a + ", isMicrophoneOn=" + this.f20330b + ", progress=" + this.f20331c + ")";
    }

    public /* synthetic */ C8860v(AbstractC8861w abstractC8861w, boolean z10, String str, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? AbstractC8861w.b.f20338f : abstractC8861w, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? "00:00" : str);
    }
}
