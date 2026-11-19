package anetwork.channel.cache;

import anet.channel.util.ALog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public class CacheManager {

    /* renamed from: a */
    private static List<C5105a> f2809a = new ArrayList();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f2810b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock.ReadLock f2811c;

    /* renamed from: d */
    private static final ReentrantReadWriteLock.WriteLock f2812d;

    /* renamed from: anetwork.channel.cache.CacheManager$a */
    public static class C5105a implements Comparable<C5105a> {

        /* renamed from: a */
        final Cache f2813a;

        /* renamed from: b */
        final CachePrediction f2814b;

        /* renamed from: c */
        final int f2815c;

        public C5105a(Cache cache, CachePrediction cachePrediction, int i10) {
            this.f2813a = cache;
            this.f2814b = cachePrediction;
            this.f2815c = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C5105a c5105a) {
            return this.f2815c - c5105a.f2815c;
        }
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f2810b = reentrantReadWriteLock;
        f2811c = reentrantReadWriteLock.readLock();
        f2812d = reentrantReadWriteLock.writeLock();
    }

    public static void addCache(Cache cache, CachePrediction cachePrediction, int i10) {
        try {
            if (cache == null) {
                throw new IllegalArgumentException("cache is null");
            }
            if (cachePrediction == null) {
                throw new IllegalArgumentException("prediction is null");
            }
            ReentrantReadWriteLock.WriteLock writeLock = f2812d;
            writeLock.lock();
            f2809a.add(new C5105a(cache, cachePrediction, i10));
            Collections.sort(f2809a);
            writeLock.unlock();
        } catch (Throwable th) {
            f2812d.unlock();
            throw th;
        }
    }

    public static void clearAllCache() {
        ALog.m2532w("anet.CacheManager", "clearAllCache", null, new Object[0]);
        Iterator<C5105a> it = f2809a.iterator();
        while (it.hasNext()) {
            try {
                it.next().f2813a.clear();
            } catch (Exception unused) {
            }
        }
    }

    public static Cache getCache(String str, Map<String, String> map) {
        try {
            f2811c.lock();
            for (C5105a c5105a : f2809a) {
                if (c5105a.f2814b.handleCache(str, map)) {
                    return c5105a.f2813a;
                }
            }
            f2811c.unlock();
            return null;
        } finally {
            f2811c.unlock();
        }
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
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = anetwork.channel.cache.CacheManager.f2812d     // Catch: java.lang.Throwable -> L24
            r0.lock()     // Catch: java.lang.Throwable -> L24
            java.util.List<anetwork.channel.cache.CacheManager$a> r0 = anetwork.channel.cache.CacheManager.f2809a     // Catch: java.lang.Throwable -> L24
            java.util.ListIterator r0 = r0.listIterator()     // Catch: java.lang.Throwable -> L24
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L24
            anetwork.channel.cache.CacheManager$a r1 = (anetwork.channel.cache.CacheManager.C5105a) r1     // Catch: java.lang.Throwable -> L24
            anetwork.channel.cache.Cache r1 = r1.f2813a     // Catch: java.lang.Throwable -> L24
            if (r1 != r2) goto Lb
            r0.remove()     // Catch: java.lang.Throwable -> L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = anetwork.channel.cache.CacheManager.f2812d
            r2.unlock()
            return
        L24:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = anetwork.channel.cache.CacheManager.f2812d
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.cache.CacheManager.removeCache(anetwork.channel.cache.Cache):void");
    }
}
