package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.ar */
/* loaded from: classes4.dex */
public final class C6420ar implements Comparable<C6420ar> {

    /* renamed from: a */
    public long f5331a = -1;

    /* renamed from: b */
    public long f5332b = -1;

    /* renamed from: c */
    public String f5333c = null;

    /* renamed from: d */
    public boolean f5334d = false;

    /* renamed from: e */
    public boolean f5335e = false;

    /* renamed from: f */
    public int f5336f = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C6420ar c6420ar) {
        C6420ar c6420ar2 = c6420ar;
        if (c6420ar2 == null) {
            return 1;
        }
        long j10 = this.f5332b - c6420ar2.f5332b;
        if (j10 <= 0) {
            return j10 < 0 ? -1 : 0;
        }
        return 1;
    }
}
