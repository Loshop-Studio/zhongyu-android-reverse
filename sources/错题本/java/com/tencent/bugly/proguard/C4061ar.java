package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.ar */
/* loaded from: classes3.dex */
public final class C4061ar implements Comparable<C4061ar> {

    /* renamed from: a */
    public long f3552a = -1;

    /* renamed from: b */
    public long f3553b = -1;

    /* renamed from: c */
    public String f3554c = null;

    /* renamed from: d */
    public boolean f3555d = false;

    /* renamed from: e */
    public boolean f3556e = false;

    /* renamed from: f */
    public int f3557f = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C4061ar c4061ar) {
        C4061ar c4061ar2 = c4061ar;
        if (c4061ar2 == null) {
            return 1;
        }
        long j7 = this.f3553b - c4061ar2.f3553b;
        if (j7 <= 0) {
            return j7 < 0 ? -1 : 0;
        }
        return 1;
    }
}
