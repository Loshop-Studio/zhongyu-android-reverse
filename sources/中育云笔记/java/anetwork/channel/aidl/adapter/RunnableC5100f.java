package anetwork.channel.aidl.adapter;

import anet.channel.util.ALog;

/* renamed from: anetwork.channel.aidl.adapter.f */
/* loaded from: classes3.dex */
final class RunnableC5100f implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        if (C5098d.f2805c) {
            C5098d.f2805c = false;
            ALog.m2529e("anet.RemoteGetter", "binding service timeout. reset status!", null, new Object[0]);
        }
    }
}
