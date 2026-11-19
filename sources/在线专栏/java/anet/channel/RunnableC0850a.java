package anet.channel;

import android.content.Intent;
import anet.channel.util.ALog;
import java.util.Iterator;

/* renamed from: anet.channel.a */
/* loaded from: classes.dex */
class RunnableC0850a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f5050a;

    /* renamed from: b */
    final /* synthetic */ AccsSessionManager f5051b;

    RunnableC0850a(AccsSessionManager accsSessionManager, Intent intent) {
        this.f5051b = accsSessionManager;
        this.f5050a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = AccsSessionManager.f4939c.iterator();
        while (it.hasNext()) {
            try {
                ((ISessionListener) it.next()).onConnectionChanged(this.f5050a);
            } catch (Exception e4) {
                ALog.m4637e("awcn.AccsSessionManager", "notifyListener exception.", null, e4, new Object[0]);
            }
        }
    }
}
