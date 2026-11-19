package com.taobao.accs.utl;

import anet.channel.util.ALog;

/* renamed from: com.taobao.accs.utl.k */
/* loaded from: classes5.dex */
public class C7685k implements ALog.ILog {

    /* renamed from: a */
    private final ALog.ILog f13240a;

    /* renamed from: b */
    private final a f13241b;

    /* renamed from: com.taobao.accs.utl.k$a */
    public interface a {
        /* renamed from: a */
        void mo10182a(String str);
    }

    public C7685k(ALog.ILog iLog, a aVar) {
        this.f13240a = iLog;
        this.f13241b = aVar;
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: d */
    public void mo2285d(String str, String str2) {
        this.f13240a.mo2285d(str, str2);
        this.f13241b.mo10182a(str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo2286e(String str, String str2) {
        this.f13240a.mo2286e(str, str2);
        this.f13241b.mo10182a(str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: i */
    public void mo2288i(String str, String str2) {
        this.f13240a.mo2288i(str, str2);
        this.f13241b.mo10182a(str2);
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isPrintLog(int i10) {
        return true;
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isValid() {
        return true;
    }

    @Override // anet.channel.util.ALog.ILog
    public void setLogLevel(int i10) {
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo2289w(String str, String str2) {
        this.f13240a.mo2289w(str, str2);
        this.f13241b.mo10182a(str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo2287e(String str, String str2, Throwable th) {
        this.f13240a.mo2287e(str, str2, th);
        this.f13241b.mo10182a(str2 + " " + th.getMessage());
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo2290w(String str, String str2, Throwable th) {
        this.f13240a.mo2290w(str, str2, th);
        this.f13241b.mo10182a(str2 + " " + th.getMessage());
    }
}
