package anetwork.channel.aidl.adapter;

import anet.channel.util.ALog;

/* renamed from: anetwork.channel.aidl.adapter.f */
/* loaded from: classes.dex */
final class RunnableC0977f implements Runnable {
    RunnableC0977f() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C0975d.f5527c) {
            C0975d.f5527c = false;
            ALog.m4638e("anet.RemoteGetter", "binding service timeout. reset status!", null, new Object[0]);
        }
    }
}
