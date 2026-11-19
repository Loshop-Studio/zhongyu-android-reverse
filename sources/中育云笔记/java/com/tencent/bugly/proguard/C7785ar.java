package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.ar */
/* loaded from: classes5.dex */
public final class C7785ar implements Comparable<C7785ar> {

    /* renamed from: a */
    public long f13773a = -1;

    /* renamed from: b */
    public long f13774b = -1;

    /* renamed from: c */
    public String f13775c = null;

    /* renamed from: d */
    public boolean f13776d = false;

    /* renamed from: e */
    public boolean f13777e = false;

    /* renamed from: f */
    public int f13778f = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C7785ar c7785ar) {
        C7785ar c7785ar2 = c7785ar;
        if (c7785ar2 == null) {
            return 1;
        }
        long j10 = this.f13774b - c7785ar2.f13774b;
        if (j10 <= 0) {
            return j10 < 0 ? -1 : 0;
        }
        return 1;
    }
}
