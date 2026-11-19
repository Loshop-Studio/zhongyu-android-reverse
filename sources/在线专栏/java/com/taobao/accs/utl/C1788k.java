package com.taobao.accs.utl;

import anet.channel.util.ALog;

/* renamed from: com.taobao.accs.utl.k */
/* loaded from: classes.dex */
public class C1788k implements ALog.ILog {

    /* renamed from: a */
    private final ALog.ILog f7842a;

    /* renamed from: b */
    private final a f7843b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.taobao.accs.utl.k$a */
    public interface a {
        /* renamed from: a */
        void mo6156a(String str);
    }

    public C1788k(ALog.ILog iLog, a aVar) {
        this.f7842a = iLog;
        this.f7843b = aVar;
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: d */
    public void mo4394d(String str, String str2) {
        this.f7842a.mo4394d(str, str2);
        this.f7843b.mo6156a(str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo4395e(String str, String str2) {
        this.f7842a.mo4395e(str, str2);
        this.f7843b.mo6156a(str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: i */
    public void mo4397i(String str, String str2) {
        this.f7842a.mo4397i(str, str2);
        this.f7843b.mo6156a(str2);
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isPrintLog(int i4) {
        return true;
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isValid() {
        return true;
    }

    @Override // anet.channel.util.ALog.ILog
    public void setLogLevel(int i4) {
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo4398w(String str, String str2) {
        this.f7842a.mo4398w(str, str2);
        this.f7843b.mo6156a(str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo4396e(String str, String str2, Throwable th) {
        this.f7842a.mo4396e(str, str2, th);
        this.f7843b.mo6156a(str2 + " " + th.getMessage());
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo4399w(String str, String str2, Throwable th) {
        this.f7842a.mo4399w(str, str2, th);
        this.f7843b.mo6156a(str2 + " " + th.getMessage());
    }
}
