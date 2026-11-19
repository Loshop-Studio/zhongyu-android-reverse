package com.taobao.accs.utl;

import anet.channel.util.ALog;
import com.alibaba.sdk.android.logger.ILog;

/* renamed from: com.taobao.accs.utl.l */
/* loaded from: classes5.dex */
public class C7686l implements ALog.ILog {

    /* renamed from: a */
    private ILog f13242a = AccsLogger.getLogger("NetworkSdk");

    /* renamed from: a */
    private String m10186a(String str, String str2) {
        return "[" + str + "]" + str2;
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: d */
    public void mo2285d(String str, String str2) {
        this.f13242a.mo3533d(m10186a(str, str2));
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo2286e(String str, String str2) {
        this.f13242a.mo3535e(m10186a(str, str2));
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: i */
    public void mo2288i(String str, String str2) {
        this.f13242a.mo3538i(m10186a(str, str2));
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
        this.f13242a.mo3540w(m10186a(str, str2));
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo2287e(String str, String str2, Throwable th) {
        this.f13242a.mo3536e(m10186a(str, str2), th);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo2290w(String str, String str2, Throwable th) {
        this.f13242a.mo3541w(m10186a(str, str2), th);
    }
}
