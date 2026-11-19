package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.ar */
/* loaded from: classes3.dex */
public final class C5797ar implements Comparable<C5797ar> {

    /* renamed from: a */
    public long f4052a = -1;

    /* renamed from: b */
    public long f4053b = -1;

    /* renamed from: c */
    public String f4054c = null;

    /* renamed from: d */
    public boolean f4055d = false;

    /* renamed from: e */
    public boolean f4056e = false;

    /* renamed from: f */
    public int f4057f = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C5797ar c5797ar) {
        C5797ar c5797ar2 = c5797ar;
        if (c5797ar2 == null) {
            return 1;
        }
        long j6 = this.f4053b - c5797ar2.f4053b;
        if (j6 <= 0) {
            return j6 < 0 ? -1 : 0;
        }
        return 1;
    }
}
