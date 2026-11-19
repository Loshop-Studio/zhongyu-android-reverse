package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7233t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.s */
/* loaded from: classes5.dex */
public final class C7232s {

    /* renamed from: a */
    public final AbstractC7233t f11104a;

    /* renamed from: b */
    public final boolean f11105b;

    /* renamed from: c */
    public final String f11106c;

    public C7232s(AbstractC7233t recordStatus, boolean z9, String progress) {
        Intrinsics.checkNotNullParameter(recordStatus, "recordStatus");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f11104a = recordStatus;
        this.f11105b = z9;
        this.f11106c = progress;
    }

    /* renamed from: b */
    public static /* synthetic */ C7232s m11037b(C7232s c7232s, AbstractC7233t abstractC7233t, boolean z9, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC7233t = c7232s.f11104a;
        }
        if ((i10 & 2) != 0) {
            z9 = c7232s.f11105b;
        }
        if ((i10 & 4) != 0) {
            str = c7232s.f11106c;
        }
        return c7232s.m11038a(abstractC7233t, z9, str);
    }

    /* renamed from: a */
    public final C7232s m11038a(AbstractC7233t recordStatus, boolean z9, String progress) {
        Intrinsics.checkNotNullParameter(recordStatus, "recordStatus");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new C7232s(recordStatus, z9, progress);
    }

    /* renamed from: c */
    public final String m11039c() {
        return this.f11106c;
    }

    /* renamed from: d */
    public final AbstractC7233t m11040d() {
        return this.f11104a;
    }

    /* renamed from: e */
    public final boolean m11041e() {
        return this.f11105b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7232s)) {
            return false;
        }
        C7232s c7232s = (C7232s) obj;
        return Intrinsics.areEqual(this.f11104a, c7232s.f11104a) && this.f11105b == c7232s.f11105b && Intrinsics.areEqual(this.f11106c, c7232s.f11106c);
    }

    public int hashCode() {
        return (((this.f11104a.hashCode() * 31) + Boolean.hashCode(this.f11105b)) * 31) + this.f11106c.hashCode();
    }

    public String toString() {
        return "RecordState(recordStatus=" + this.f11104a + ", isMicrophoneOn=" + this.f11105b + ", progress=" + this.f11106c + ")";
    }

    public /* synthetic */ C7232s(AbstractC7233t abstractC7233t, boolean z9, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC7233t.b.f11113f : abstractC7233t, (i10 & 2) != 0 ? false : z9, (i10 & 4) != 0 ? "00:00" : str);
    }
}
