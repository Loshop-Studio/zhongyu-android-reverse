package anet.channel;

import android.content.Intent;
import anet.channel.util.ALog;
import java.util.Iterator;

/* renamed from: anet.channel.a */
/* loaded from: classes3.dex */
class RunnableC4973a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f2328a;

    /* renamed from: b */
    final /* synthetic */ AccsSessionManager f2329b;

    public RunnableC4973a(AccsSessionManager accsSessionManager, Intent intent) {
        this.f2329b = accsSessionManager;
        this.f2328a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = AccsSessionManager.f2217c.iterator();
        while (it.hasNext()) {
            try {
                ((ISessionListener) it.next()).onConnectionChanged(this.f2328a);
            } catch (Exception e10) {
                ALog.m2528e("awcn.AccsSessionManager", "notifyListener exception.", null, e10, new Object[0]);
            }
        }
    }
}
