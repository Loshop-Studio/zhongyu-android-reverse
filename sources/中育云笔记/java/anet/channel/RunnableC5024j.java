package anet.channel;

import anet.channel.p021b.C4979a;
import anetwork.channel.cache.CacheManager;

/* renamed from: anet.channel.j */
/* loaded from: classes3.dex */
final class RunnableC5024j implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            C4979a c4979a = new C4979a();
            c4979a.m2274a();
            CacheManager.addCache(c4979a, new C5025k(this), 1);
        } catch (Exception unused) {
        }
    }
}
