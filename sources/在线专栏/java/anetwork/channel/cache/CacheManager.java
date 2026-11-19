package anetwork.channel.cache;

import anet.channel.util.ALog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class CacheManager {

    /* renamed from: a */
    private static List<C0982a> f5531a = new ArrayList();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f5532b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock.ReadLock f5533c;

    /* renamed from: d */
    private static final ReentrantReadWriteLock.WriteLock f5534d;

    /* renamed from: anetwork.channel.cache.CacheManager$a */
    private static class C0982a implements Comparable<C0982a> {

        /* renamed from: a */
        final Cache f5535a;

        /* renamed from: b */
        final CachePrediction f5536b;

        /* renamed from: c */
        final int f5537c;

        C0982a(Cache cache, CachePrediction cachePrediction, int i4) {
            this.f5535a = cache;
            this.f5536b = cachePrediction;
            this.f5537c = i4;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0982a c0982a) {
            return this.f5537c - c0982a.f5537c;
        }
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f5532b = reentrantReadWriteLock;
        f5533c = reentrantReadWriteLock.readLock();
        f5534d = reentrantReadWriteLock.writeLock();
    }

    public static void addCache(Cache cache, CachePrediction cachePrediction, int i4) {
        try {
            if (cache == null) {
                throw new IllegalArgumentException("cache is null");
            }
            if (cachePrediction == null) {
                throw new IllegalArgumentException("prediction is null");
            }
            ReentrantReadWriteLock.WriteLock writeLock = f5534d;
            writeLock.lock();
            f5531a.add(new C0982a(cache, cachePrediction, i4));
            Collections.sort(f5531a);
            writeLock.unlock();
        } catch (Throwable th) {
            f5534d.unlock();
            throw th;
        }
    }

    public static void clearAllCache() {
        ALog.m4641w("anet.CacheManager", "clearAllCache", null, new Object[0]);
        Iterator<C0982a> it = f5531a.iterator();
        while (it.hasNext()) {
            try {
                it.next().f5535a.clear();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r3 = r1.f5535a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static anetwork.channel.cache.Cache getCache(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = anetwork.channel.cache.CacheManager.f5533c     // Catch: java.lang.Throwable -> L29
            r0.lock()     // Catch: java.lang.Throwable -> L29
            java.util.List<anetwork.channel.cache.CacheManager$a> r0 = anetwork.channel.cache.CacheManager.f5531a     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L29
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L29
            anetwork.channel.cache.CacheManager$a r1 = (anetwork.channel.cache.CacheManager.C0982a) r1     // Catch: java.lang.Throwable -> L29
            anetwork.channel.cache.CachePrediction r2 = r1.f5536b     // Catch: java.lang.Throwable -> L29
            boolean r2 = r2.handleCache(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto Lb
            anetwork.channel.cache.Cache r3 = r1.f5535a     // Catch: java.lang.Throwable -> L29
        L21:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = anetwork.channel.cache.CacheManager.f5533c
            r4.unlock()
            return r3
        L27:
            r3 = 0
            goto L21
        L29:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = anetwork.channel.cache.CacheManager.f5533c
            r4.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.cache.CacheManager.getCache(java.lang.String, java.util.Map):anetwork.channel.cache.Cache");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r0.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void removeCache(anetwork.channel.cache.Cache r2) {
        /*
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = anetwork.channel.cache.CacheManager.f5534d     // Catch: java.lang.Throwable -> L24
            r0.lock()     // Catch: java.lang.Throwable -> L24
            java.util.List<anetwork.channel.cache.CacheManager$a> r0 = anetwork.channel.cache.CacheManager.f5531a     // Catch: java.lang.Throwable -> L24
            java.util.ListIterator r0 = r0.listIterator()     // Catch: java.lang.Throwable -> L24
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L24
            anetwork.channel.cache.CacheManager$a r1 = (anetwork.channel.cache.CacheManager.C0982a) r1     // Catch: java.lang.Throwable -> L24
            anetwork.channel.cache.Cache r1 = r1.f5535a     // Catch: java.lang.Throwable -> L24
            if (r1 != r2) goto Lb
            r0.remove()     // Catch: java.lang.Throwable -> L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = anetwork.channel.cache.CacheManager.f5534d
            r2.unlock()
            return
        L24:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = anetwork.channel.cache.CacheManager.f5534d
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.cache.CacheManager.removeCache(anetwork.channel.cache.Cache):void");
    }
}
