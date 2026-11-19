package com.taobao.accs.data;

import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p064ut.monitor.AssembleMonitor;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.c */
/* loaded from: classes.dex */
class RunnableC1725c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1723a f7584a;

    RunnableC1725c(C1723a c1723a) {
        this.f7584a = c1723a;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f7584a) {
            if (this.f7584a.f7580f == 0) {
                ALog.m6092e("AssembleMessage", "timeout", Constants.KEY_DATA_ID, this.f7584a.f7576b);
                this.f7584a.f7580f = 1;
                this.f7584a.f7582h.clear();
                AppMonitor.getInstance().commitStat(new AssembleMonitor(this.f7584a.f7576b, String.valueOf(this.f7584a.f7580f)));
            }
        }
    }
}
