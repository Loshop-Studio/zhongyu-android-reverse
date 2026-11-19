package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.ar */
/* loaded from: classes4.dex */
public final class C6680ar implements Comparable<C6680ar> {

    /* renamed from: a */
    public long f5908a = -1;

    /* renamed from: b */
    public long f5909b = -1;

    /* renamed from: c */
    public String f5910c = null;

    /* renamed from: d */
    public boolean f5911d = false;

    /* renamed from: e */
    public boolean f5912e = false;

    /* renamed from: f */
    public int f5913f = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C6680ar c6680ar) {
        C6680ar c6680ar2 = c6680ar;
        if (c6680ar2 == null) {
            return 1;
        }
        long j9 = this.f5909b - c6680ar2.f5909b;
        if (j9 <= 0) {
            return j9 < 0 ? -1 : 0;
        }
        return 1;
    }
}
