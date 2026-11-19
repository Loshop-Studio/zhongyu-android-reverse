package com.tencent.liteav.network.p051a;

/* renamed from: com.tencent.liteav.network.a.e */
/* loaded from: classes4.dex */
public final class C6638e {

    /* renamed from: a */
    public final String f5789a;

    /* renamed from: b */
    public final int f5790b;

    /* renamed from: c */
    public final int f5791c;

    /* renamed from: d */
    public final long f5792d;

    public C6638e(String str, int i10, int i11, long j10) {
        this.f5789a = str;
        this.f5790b = i10;
        this.f5791c = i11 < 600 ? 600 : i11;
        this.f5792d = j10;
    }

    /* renamed from: a */
    public boolean m5254a() {
        return this.f5790b == 5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C6638e)) {
            C6638e c6638e = (C6638e) obj;
            if (this.f5789a.equals(c6638e.f5789a) && this.f5790b == c6638e.f5790b && this.f5791c == c6638e.f5791c && this.f5792d == c6638e.f5792d) {
                return true;
            }
        }
        return false;
    }
}
