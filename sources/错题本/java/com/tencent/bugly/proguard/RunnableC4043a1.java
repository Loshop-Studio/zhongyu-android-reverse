package com.tencent.bugly.proguard;

import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.a1 */
/* loaded from: classes3.dex */
public final class RunnableC4043a1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Thread f3374a;

    /* renamed from: b */
    public final /* synthetic */ int f3375b;

    /* renamed from: c */
    public final /* synthetic */ String f3376c;

    /* renamed from: d */
    public final /* synthetic */ String f3377d;

    /* renamed from: e */
    public final /* synthetic */ String f3378e;

    /* renamed from: f */
    public final /* synthetic */ Map f3379f;

    public RunnableC4043a1(Thread thread, int i, String str, String str2, String str3, Map map) {
        this.f3374a = thread;
        this.f3375b = i;
        this.f3376c = str;
        this.f3377d = str2;
        this.f3378e = str3;
        this.f3379f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (C4064au.f3608a == null) {
                C4055al.m3027e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
            } else {
                C4064au.m3163a(C4064au.f3608a, this.f3374a, this.f3375b, this.f3376c, this.f3377d, this.f3378e, this.f3379f);
            }
        } catch (Throwable th) {
            if (!C4055al.m3024b(th)) {
                th.printStackTrace();
            }
            C4055al.m3027e("[ExtraCrashManager] Crash error %s %s %s", this.f3376c, this.f3377d, this.f3378e);
        }
    }
}
