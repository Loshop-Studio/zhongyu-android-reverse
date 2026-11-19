package p245t6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p245t6.AbstractC9454q0;

/* renamed from: t6.o0 */
/* loaded from: classes4.dex */
public final class C9450o0 {

    /* renamed from: a */
    public final long f16464a;

    /* renamed from: b */
    public final String f16465b;

    /* renamed from: c */
    public final String f16466c;

    /* renamed from: d */
    public final boolean f16467d;

    /* renamed from: e */
    public final boolean f16468e;

    /* renamed from: f */
    public final boolean f16469f;

    /* renamed from: g */
    public final int f16470g;

    /* renamed from: h */
    public final String f16471h;

    /* renamed from: i */
    public final boolean f16472i;

    /* renamed from: j */
    public final AbstractC9454q0 f16473j;

    /* renamed from: k */
    public final boolean f16474k;

    /* renamed from: l */
    public final boolean f16475l;

    /* renamed from: m */
    public final boolean f16476m;

    /* renamed from: n */
    public final boolean f16477n;

    /* renamed from: o */
    public final int f16478o;

    /* renamed from: p */
    public final boolean f16479p;

    /* renamed from: q */
    public final boolean f16480q;

    /* renamed from: r */
    public final int f16481r;

    /* renamed from: s */
    public final String f16482s;

    /* renamed from: t */
    public final long f16483t;

    /* renamed from: u */
    public final int f16484u;

    public C9450o0(long j10, String title, String topic, boolean z9, boolean z10, boolean z11, int i10, String time, boolean z12, AbstractC9454q0 taskButtonState, boolean z13, boolean z14, boolean z15, boolean z16, int i11, boolean z17, boolean z18, int i12, String address, long j11, int i13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(taskButtonState, "taskButtonState");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f16464a = j10;
        this.f16465b = title;
        this.f16466c = topic;
        this.f16467d = z9;
        this.f16468e = z10;
        this.f16469f = z11;
        this.f16470g = i10;
        this.f16471h = time;
        this.f16472i = z12;
        this.f16473j = taskButtonState;
        this.f16474k = z13;
        this.f16475l = z14;
        this.f16476m = z15;
        this.f16477n = z16;
        this.f16478o = i11;
        this.f16479p = z17;
        this.f16480q = z18;
        this.f16481r = i12;
        this.f16482s = address;
        this.f16483t = j11;
        this.f16484u = i13;
    }

    /* renamed from: b */
    public static /* synthetic */ C9450o0 m15733b(C9450o0 c9450o0, long j10, String str, String str2, boolean z9, boolean z10, boolean z11, int i10, String str3, boolean z12, AbstractC9454q0 abstractC9454q0, boolean z13, boolean z14, boolean z15, boolean z16, int i11, boolean z17, boolean z18, int i12, String str4, long j11, int i13, int i14, Object obj) {
        int i15;
        long j12;
        long j13 = (i14 & 1) != 0 ? c9450o0.f16464a : j10;
        String str5 = (i14 & 2) != 0 ? c9450o0.f16465b : str;
        String str6 = (i14 & 4) != 0 ? c9450o0.f16466c : str2;
        boolean z19 = (i14 & 8) != 0 ? c9450o0.f16467d : z9;
        boolean z20 = (i14 & 16) != 0 ? c9450o0.f16468e : z10;
        boolean z21 = (i14 & 32) != 0 ? c9450o0.f16469f : z11;
        int i16 = (i14 & 64) != 0 ? c9450o0.f16470g : i10;
        String str7 = (i14 & 128) != 0 ? c9450o0.f16471h : str3;
        boolean z22 = (i14 & 256) != 0 ? c9450o0.f16472i : z12;
        AbstractC9454q0 abstractC9454q02 = (i14 & 512) != 0 ? c9450o0.f16473j : abstractC9454q0;
        boolean z23 = (i14 & 1024) != 0 ? c9450o0.f16474k : z13;
        boolean z24 = (i14 & 2048) != 0 ? c9450o0.f16475l : z14;
        boolean z25 = (i14 & 4096) != 0 ? c9450o0.f16476m : z15;
        long j14 = j13;
        boolean z26 = (i14 & 8192) != 0 ? c9450o0.f16477n : z16;
        int i17 = (i14 & 16384) != 0 ? c9450o0.f16478o : i11;
        boolean z27 = (i14 & 32768) != 0 ? c9450o0.f16479p : z17;
        boolean z28 = (i14 & 65536) != 0 ? c9450o0.f16480q : z18;
        int i18 = (i14 & 131072) != 0 ? c9450o0.f16481r : i12;
        String str8 = (i14 & 262144) != 0 ? c9450o0.f16482s : str4;
        boolean z29 = z26;
        long j15 = (i14 & 524288) != 0 ? c9450o0.f16483t : j11;
        if ((i14 & 1048576) != 0) {
            j12 = j15;
            i15 = c9450o0.f16484u;
        } else {
            i15 = i13;
            j12 = j15;
        }
        return c9450o0.m15734a(j14, str5, str6, z19, z20, z21, i16, str7, z22, abstractC9454q02, z23, z24, z25, z29, i17, z27, z28, i18, str8, j12, i15);
    }

    /* renamed from: a */
    public final C9450o0 m15734a(long j10, String title, String topic, boolean z9, boolean z10, boolean z11, int i10, String time, boolean z12, AbstractC9454q0 taskButtonState, boolean z13, boolean z14, boolean z15, boolean z16, int i11, boolean z17, boolean z18, int i12, String address, long j11, int i13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(taskButtonState, "taskButtonState");
        Intrinsics.checkNotNullParameter(address, "address");
        return new C9450o0(j10, title, topic, z9, z10, z11, i10, time, z12, taskButtonState, z13, z14, z15, z16, i11, z17, z18, i12, address, j11, i13);
    }

    /* renamed from: c */
    public final String m15735c() {
        return this.f16482s;
    }

    /* renamed from: d */
    public final int m15736d() {
        return this.f16484u;
    }

    /* renamed from: e */
    public final AbstractC9454q0 m15737e() {
        return this.f16473j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9450o0)) {
            return false;
        }
        C9450o0 c9450o0 = (C9450o0) obj;
        return this.f16464a == c9450o0.f16464a && Intrinsics.areEqual(this.f16465b, c9450o0.f16465b) && Intrinsics.areEqual(this.f16466c, c9450o0.f16466c) && this.f16467d == c9450o0.f16467d && this.f16468e == c9450o0.f16468e && this.f16469f == c9450o0.f16469f && this.f16470g == c9450o0.f16470g && Intrinsics.areEqual(this.f16471h, c9450o0.f16471h) && this.f16472i == c9450o0.f16472i && Intrinsics.areEqual(this.f16473j, c9450o0.f16473j) && this.f16474k == c9450o0.f16474k && this.f16475l == c9450o0.f16475l && this.f16476m == c9450o0.f16476m && this.f16477n == c9450o0.f16477n && this.f16478o == c9450o0.f16478o && this.f16479p == c9450o0.f16479p && this.f16480q == c9450o0.f16480q && this.f16481r == c9450o0.f16481r && Intrinsics.areEqual(this.f16482s, c9450o0.f16482s) && this.f16483t == c9450o0.f16483t && this.f16484u == c9450o0.f16484u;
    }

    /* renamed from: f */
    public final long m15738f() {
        return this.f16464a;
    }

    /* renamed from: g */
    public final int m15739g() {
        return this.f16478o;
    }

    /* renamed from: h */
    public final long m15740h() {
        return this.f16483t;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Long.hashCode(this.f16464a) * 31) + this.f16465b.hashCode()) * 31) + this.f16466c.hashCode()) * 31) + Boolean.hashCode(this.f16467d)) * 31) + Boolean.hashCode(this.f16468e)) * 31) + Boolean.hashCode(this.f16469f)) * 31) + Integer.hashCode(this.f16470g)) * 31) + this.f16471h.hashCode()) * 31) + Boolean.hashCode(this.f16472i)) * 31) + this.f16473j.hashCode()) * 31) + Boolean.hashCode(this.f16474k)) * 31) + Boolean.hashCode(this.f16475l)) * 31) + Boolean.hashCode(this.f16476m)) * 31) + Boolean.hashCode(this.f16477n)) * 31) + Integer.hashCode(this.f16478o)) * 31) + Boolean.hashCode(this.f16479p)) * 31) + Boolean.hashCode(this.f16480q)) * 31) + Integer.hashCode(this.f16481r)) * 31) + this.f16482s.hashCode()) * 31) + Long.hashCode(this.f16483t)) * 31) + Integer.hashCode(this.f16484u);
    }

    /* renamed from: i */
    public final String m15741i() {
        return this.f16471h;
    }

    /* renamed from: j */
    public final String m15742j() {
        return this.f16465b;
    }

    /* renamed from: k */
    public final String m15743k() {
        return this.f16466c;
    }

    /* renamed from: l */
    public final int m15744l() {
        return this.f16470g;
    }

    /* renamed from: m */
    public final boolean m15745m() {
        return this.f16476m;
    }

    /* renamed from: n */
    public final boolean m15746n() {
        return this.f16467d;
    }

    /* renamed from: o */
    public final boolean m15747o() {
        return this.f16472i;
    }

    /* renamed from: p */
    public final boolean m15748p() {
        return this.f16480q;
    }

    /* renamed from: q */
    public final boolean m15749q() {
        return this.f16469f;
    }

    /* renamed from: r */
    public final boolean m15750r() {
        return this.f16479p;
    }

    /* renamed from: s */
    public final boolean m15751s() {
        return this.f16477n;
    }

    /* renamed from: t */
    public final boolean m15752t() {
        return this.f16468e;
    }

    public String toString() {
        return "HomeDataInfo(taskId=" + this.f16464a + ", title=" + this.f16465b + ", topic=" + this.f16466c + ", isCorrectSelf=" + this.f16467d + ", isOnline=" + this.f16468e + ", isNoNeedCommit=" + this.f16469f + ", urgeCount=" + this.f16470g + ", time=" + this.f16471h + ", isFavorite=" + this.f16472i + ", taskButtonState=" + this.f16473j + ", isUnread=" + this.f16474k + ", isTimeOver=" + this.f16475l + ", isCameraNewConfig=" + this.f16476m + ", isNormalTrainingType=" + this.f16477n + ", taskState=" + this.f16478o + ", isNoStem=" + this.f16479p + ", isFinish=" + this.f16480q + ", specialType=" + this.f16481r + ", address=" + this.f16482s + ", testPaperId=" + this.f16483t + ", serialNum=" + this.f16484u + ")";
    }

    /* renamed from: u */
    public final boolean m15753u() {
        return this.f16475l;
    }

    /* renamed from: v */
    public final boolean m15754v() {
        return this.f16474k;
    }

    public /* synthetic */ C9450o0(long j10, String str, String str2, boolean z9, boolean z10, boolean z11, int i10, String str3, boolean z12, AbstractC9454q0 abstractC9454q0, boolean z13, boolean z14, boolean z15, boolean z16, int i11, boolean z17, boolean z18, int i12, String str4, long j11, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j10, (i14 & 2) != 0 ? "测试" : str, (i14 & 4) != 0 ? "数学" : str2, (i14 & 8) != 0 ? true : z9, (i14 & 16) != 0 ? true : z10, (i14 & 32) == 0 ? z11 : true, (i14 & 64) != 0 ? 99 : i10, (i14 & 128) != 0 ? "开始时间：2022-04-10 16:05    截止时间：2022-04-11 16:05" : str3, (i14 & 256) != 0 ? false : z12, (i14 & 512) != 0 ? AbstractC9454q0.a.d.f16502e : abstractC9454q0, (i14 & 1024) != 0 ? false : z13, (i14 & 2048) != 0 ? false : z14, (i14 & 4096) != 0 ? false : z15, (i14 & 8192) != 0 ? false : z16, (i14 & 16384) != 0 ? -1 : i11, (i14 & 32768) != 0 ? false : z17, (i14 & 65536) != 0 ? false : z18, (i14 & 131072) != 0 ? 0 : i12, (i14 & 262144) != 0 ? "" : str4, (i14 & 524288) != 0 ? 0L : j11, (i14 & 1048576) != 0 ? 0 : i13);
    }
}
