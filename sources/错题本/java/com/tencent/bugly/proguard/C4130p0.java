package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.p0 */
/* loaded from: classes3.dex */
public final class C4130p0 implements InterfaceC4051ah {

    /* renamed from: a */
    public final /* synthetic */ long f3867a;

    /* renamed from: b */
    public final /* synthetic */ List f3868b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3869c;

    public C4130p0(long j7, List list, boolean z8) {
        this.f3867a = j7;
        this.f3868b = list;
        this.f3869c = z8;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC4051ah
    /* renamed from: a */
    public final void mo106a(boolean z8, String str) {
        C4062as.m3118a(this.f3868b, z8, System.currentTimeMillis() - this.f3867a, this.f3869c ? "realtime" : "cache", str);
        C4062as.m3120a(z8, (List<CrashDetailBean>) this.f3868b);
    }
}
