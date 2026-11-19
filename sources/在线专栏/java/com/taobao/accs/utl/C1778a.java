package com.taobao.accs.utl;

import anet.channel.util.ALog;
import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* renamed from: com.taobao.accs.utl.a */
/* loaded from: classes.dex */
final class C1778a implements ILogger {

    /* renamed from: a */
    final /* synthetic */ ALog.ILog f7827a;

    C1778a(ALog.ILog iLog) {
        this.f7827a = iLog;
    }

    @Override // com.alibaba.sdk.android.logger.ILogger
    public void print(LogLevel logLevel, String str, String str2) {
        try {
            int i4 = C1779b.f7828a[logLevel.ordinal()];
            if (i4 == 1) {
                this.f7827a.mo4394d(str, str2);
            } else if (i4 == 2) {
                this.f7827a.mo4397i(str, str2);
            } else if (i4 == 3) {
                this.f7827a.mo4398w(str, str2);
            } else if (i4 == 4) {
                this.f7827a.mo4395e(str, str2);
            }
        } catch (Throwable unused) {
        }
    }
}
