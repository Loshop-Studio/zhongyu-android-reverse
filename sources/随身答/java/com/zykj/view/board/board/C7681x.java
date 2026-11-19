package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7682y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.x */
/* loaded from: classes5.dex */
public final class C7681x {

    /* renamed from: a */
    public final AbstractC7682y f12323a;

    /* renamed from: b */
    public final boolean f12324b;

    /* renamed from: c */
    public final String f12325c;

    public C7681x(AbstractC7682y recordStatus, boolean z9, String progress) {
        Intrinsics.checkNotNullParameter(recordStatus, "recordStatus");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f12323a = recordStatus;
        this.f12324b = z9;
        this.f12325c = progress;
    }

    /* renamed from: b */
    public static /* synthetic */ C7681x m11467b(C7681x c7681x, AbstractC7682y abstractC7682y, boolean z9, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            abstractC7682y = c7681x.f12323a;
        }
        if ((i9 & 2) != 0) {
            z9 = c7681x.f12324b;
        }
        if ((i9 & 4) != 0) {
            str = c7681x.f12325c;
        }
        return c7681x.m11468a(abstractC7682y, z9, str);
    }

    /* renamed from: a */
    public final C7681x m11468a(AbstractC7682y recordStatus, boolean z9, String progress) {
        Intrinsics.checkNotNullParameter(recordStatus, "recordStatus");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new C7681x(recordStatus, z9, progress);
    }

    /* renamed from: c */
    public final String m11469c() {
        return this.f12325c;
    }

    /* renamed from: d */
    public final AbstractC7682y m11470d() {
        return this.f12323a;
    }

    /* renamed from: e */
    public final boolean m11471e() {
        return this.f12324b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7681x)) {
            return false;
        }
        C7681x c7681x = (C7681x) obj;
        return Intrinsics.areEqual(this.f12323a, c7681x.f12323a) && this.f12324b == c7681x.f12324b && Intrinsics.areEqual(this.f12325c, c7681x.f12325c);
    }

    public int hashCode() {
        return (((this.f12323a.hashCode() * 31) + Boolean.hashCode(this.f12324b)) * 31) + this.f12325c.hashCode();
    }

    public String toString() {
        return "RecordState(recordStatus=" + this.f12323a + ", isMicrophoneOn=" + this.f12324b + ", progress=" + this.f12325c + ")";
    }

    public /* synthetic */ C7681x(AbstractC7682y abstractC7682y, boolean z9, String str, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? AbstractC7682y.b.f12332f : abstractC7682y, (i9 & 2) != 0 ? false : z9, (i9 & 4) != 0 ? "00:00" : str);
    }
}
