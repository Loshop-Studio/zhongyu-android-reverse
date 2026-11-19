package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.proguard.C4055al;
import java.util.HashMap;

/* renamed from: com.tencent.bugly.crashreport.crash.anr.b */
/* loaded from: classes3.dex */
public final class C4039b implements TraceFileHelper.InterfaceC4037b {

    /* renamed from: a */
    public final /* synthetic */ TraceFileHelper.C4036a f3352a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3353b;

    public C4039b(TraceFileHelper.C4036a c4036a, boolean z8) {
        this.f3352a = c4036a;
        this.f3353b = z8;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC4037b
    /* renamed from: a */
    public final boolean mo2866a(String str, int i, String str2, String str3) {
        C4055al.m3025c("new thread %s", str);
        TraceFileHelper.C4036a c4036a = this.f3352a;
        if (c4036a.f3348d == null) {
            c4036a.f3348d = new HashMap();
        }
        c4036a.f3348d.put(str, new String[]{str2, str3, String.valueOf(i)});
        return true;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC4037b
    /* renamed from: a */
    public final boolean mo2865a(long j7, long j8, String str) {
        C4055al.m3025c("new process %s", str);
        TraceFileHelper.C4036a c4036a = this.f3352a;
        c4036a.f3345a = j7;
        c4036a.f3346b = str;
        c4036a.f3347c = j8;
        return this.f3353b;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC4037b
    /* renamed from: a */
    public final boolean mo2864a(long j7) {
        C4055al.m3025c("process end %d", Long.valueOf(j7));
        return false;
    }
}
