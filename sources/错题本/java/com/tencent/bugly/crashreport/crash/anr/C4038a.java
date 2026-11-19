package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.proguard.C4055al;
import java.util.HashMap;

/* renamed from: com.tencent.bugly.crashreport.crash.anr.a */
/* loaded from: classes3.dex */
public final class C4038a implements TraceFileHelper.InterfaceC4037b {

    /* renamed from: a */
    public final /* synthetic */ TraceFileHelper.C4036a f3349a;

    /* renamed from: b */
    public final /* synthetic */ String f3350b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3351c;

    public C4038a(TraceFileHelper.C4036a c4036a, String str, boolean z8) {
        this.f3349a = c4036a;
        this.f3350b = str;
        this.f3351c = z8;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC4037b
    /* renamed from: a */
    public final boolean mo2866a(String str, int i, String str2, String str3) {
        C4055al.m3025c("new thread %s", str);
        TraceFileHelper.C4036a c4036a = this.f3349a;
        if (c4036a.f3345a > 0 && c4036a.f3347c > 0 && c4036a.f3346b != null) {
            if (c4036a.f3348d == null) {
                c4036a.f3348d = new HashMap();
            }
            c4036a.f3348d.put(str, new String[]{str2, str3, String.valueOf(i)});
        }
        return true;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC4037b
    /* renamed from: a */
    public final boolean mo2865a(long j7, long j8, String str) {
        C4055al.m3025c("new process %s", str);
        if (!str.equals(this.f3350b)) {
            return true;
        }
        TraceFileHelper.C4036a c4036a = this.f3349a;
        c4036a.f3345a = j7;
        c4036a.f3346b = str;
        c4036a.f3347c = j8;
        return this.f3351c;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC4037b
    /* renamed from: a */
    public final boolean mo2864a(long j7) {
        C4055al.m3025c("process end %d", Long.valueOf(j7));
        TraceFileHelper.C4036a c4036a = this.f3349a;
        return c4036a.f3345a <= 0 || c4036a.f3347c <= 0 || c4036a.f3346b == null;
    }
}
