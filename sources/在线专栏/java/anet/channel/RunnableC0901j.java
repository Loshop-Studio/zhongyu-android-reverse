package anet.channel;

import anet.channel.p006b.C0856a;
import anetwork.channel.cache.CacheManager;

/* renamed from: anet.channel.j */
/* loaded from: classes.dex */
final class RunnableC0901j implements Runnable {
    RunnableC0901j() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0856a c0856a = new C0856a();
            c0856a.m4383a();
            CacheManager.addCache(c0856a, new C0902k(this), 1);
        } catch (Exception unused) {
        }
    }
}
