package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.ar */
/* loaded from: classes4.dex */
public final class C6442ar implements Comparable<C6442ar> {

    /* renamed from: a */
    public long f4674a = -1;

    /* renamed from: b */
    public long f4675b = -1;

    /* renamed from: c */
    public String f4676c = null;

    /* renamed from: d */
    public boolean f4677d = false;

    /* renamed from: e */
    public boolean f4678e = false;

    /* renamed from: f */
    public int f4679f = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C6442ar c6442ar) {
        C6442ar c6442ar2 = c6442ar;
        if (c6442ar2 == null) {
            return 1;
        }
        long j10 = this.f4675b - c6442ar2.f4675b;
        if (j10 <= 0) {
            return j10 < 0 ? -1 : 0;
        }
        return 1;
    }
}
