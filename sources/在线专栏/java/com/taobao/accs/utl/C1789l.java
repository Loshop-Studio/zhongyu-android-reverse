package com.taobao.accs.utl;

import anet.channel.util.ALog;
import com.alibaba.sdk.android.logger.ILog;

/* renamed from: com.taobao.accs.utl.l */
/* loaded from: classes.dex */
public class C1789l implements ALog.ILog {

    /* renamed from: a */
    private ILog f7844a = AccsLogger.getLogger("NetworkSdk");

    /* renamed from: a */
    private String m6160a(String str, String str2) {
        return "[" + str + "]" + str2;
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: d */
    public void mo4394d(String str, String str2) {
        this.f7844a.mo5083d(m6160a(str, str2));
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo4395e(String str, String str2) {
        this.f7844a.mo5085e(m6160a(str, str2));
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: i */
    public void mo4397i(String str, String str2) {
        this.f7844a.mo5088i(m6160a(str, str2));
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
        this.f7844a.mo5090w(m6160a(str, str2));
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo4396e(String str, String str2, Throwable th) {
        this.f7844a.mo5086e(m6160a(str, str2), th);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo4399w(String str, String str2, Throwable th) {
        this.f7844a.mo5091w(m6160a(str, str2), th);
    }
}
