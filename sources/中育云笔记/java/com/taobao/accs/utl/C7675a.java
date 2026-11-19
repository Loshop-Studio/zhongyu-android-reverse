package com.taobao.accs.utl;

import anet.channel.util.ALog;
import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* renamed from: com.taobao.accs.utl.a */
/* loaded from: classes5.dex */
final class C7675a implements ILogger {

    /* renamed from: a */
    final /* synthetic */ ALog.ILog f13225a;

    public C7675a(ALog.ILog iLog) {
        this.f13225a = iLog;
    }

    @Override // com.alibaba.sdk.android.logger.ILogger
    public void print(LogLevel logLevel, String str, String str2) {
        try {
            int i10 = C7676b.f13226a[logLevel.ordinal()];
            if (i10 == 1) {
                this.f13225a.mo2285d(str, str2);
                return;
            }
            if (i10 == 2) {
                this.f13225a.mo2288i(str, str2);
            } else if (i10 == 3) {
                this.f13225a.mo2289w(str, str2);
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f13225a.mo2286e(str, str2);
            }
        } catch (Throwable unused) {
        }
    }
}
