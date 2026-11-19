package com.taobao.accs.data;

import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p085ut.monitor.AssembleMonitor;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.c */
/* loaded from: classes5.dex */
class RunnableC7622c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7620a f12982a;

    public RunnableC7622c(C7620a c7620a) {
        this.f12982a = c7620a;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f12982a) {
            try {
                if (this.f12982a.f12978f == 0) {
                    ALog.m10118e("AssembleMessage", "timeout", Constants.KEY_DATA_ID, this.f12982a.f12974b);
                    this.f12982a.f12978f = 1;
                    this.f12982a.f12980h.clear();
                    AppMonitor.getInstance().commitStat(new AssembleMonitor(this.f12982a.f12974b, String.valueOf(this.f12982a.f12978f)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
