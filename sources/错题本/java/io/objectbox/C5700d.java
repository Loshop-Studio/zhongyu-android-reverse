package io.objectbox;

import com.google.flatbuffers.C3821a;

/* renamed from: io.objectbox.d */
/* loaded from: classes3.dex */
public final class C5700d {

    /* renamed from: a */
    public final int f8947a;

    /* renamed from: b */
    public final int f8948b;

    /* renamed from: c */
    public final int f8949c;

    /* renamed from: d */
    public final int f8950d;

    /* renamed from: e */
    public boolean f8951e;

    /* renamed from: f */
    public int f8952f;

    /* renamed from: g */
    public int f8953g;

    /* renamed from: h */
    public long f8954h;

    /* renamed from: i */
    public int f8955i;

    /* renamed from: j */
    public long f8956j;

    /* renamed from: k */
    public final /* synthetic */ C5701e f8957k;

    public C5700d(C5701e c5701e, String str, String str2, String str3, int i) {
        this.f8957k = c5701e;
        this.f8947a = i;
        C3821a c3821a = c5701e.f8958a;
        this.f8949c = c3821a.m2770e(str);
        this.f8950d = str2 != null ? c3821a.m2770e(str2) : 0;
        this.f8948b = str3 != null ? c3821a.m2770e(str3) : 0;
    }

    /* renamed from: a */
    public final void m5055a() {
        if (this.f8951e) {
            throw new IllegalStateException("Already finished");
        }
    }

    /* renamed from: b */
    public final void m5056b(int i) {
        m5055a();
        this.f8952f = i;
    }

    /* renamed from: c */
    public final void m5057c(int i, long j7) {
        m5055a();
        this.f8953g = i;
        this.f8954h = j7;
    }

    /* renamed from: d */
    public final void m5058d(int i, long j7) {
        m5055a();
        this.f8955i = i;
        this.f8956j = j7;
    }
}
