package anetwork.channel.unified;

import anet.channel.bytes.ByteArray;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.entity.C0998g;
import anetwork.channel.interceptor.Callback;

/* renamed from: anetwork.channel.unified.a */
/* loaded from: classes.dex */
public class C1000a implements IUnifiedTask {

    /* renamed from: a */
    private C1009j f5637a;

    /* renamed from: b */
    private Cache f5638b;

    /* renamed from: c */
    private volatile boolean f5639c = false;

    public C1000a(C1009j c1009j, Cache cache) {
        this.f5637a = null;
        this.f5638b = null;
        this.f5637a = c1009j;
        this.f5638b = cache;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.f5639c = true;
        this.f5637a.f5682a.f5626b.ret = 2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zEquals;
        Cache.Entry entry;
        if (this.f5639c) {
            return;
        }
        C0998g c0998g = this.f5637a.f5682a;
        RequestStatistic requestStatistic = c0998g.f5626b;
        if (this.f5638b != null) {
            String strM4733g = c0998g.m4733g();
            Request requestM4724a = this.f5637a.f5682a.m4724a();
            String str = requestM4724a.getHeaders().get("Cache-Control");
            boolean zEquals2 = "no-store".equals(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zEquals2) {
                this.f5638b.remove(strM4733g);
                zEquals = false;
                entry = null;
            } else {
                zEquals = "no-cache".equals(str);
                entry = this.f5638b.get(strM4733g);
                if (ALog.isPrintLog(2)) {
                    String str2 = this.f5637a.f5684c;
                    Object[] objArr = new Object[8];
                    objArr[0] = "hit";
                    objArr[1] = Boolean.valueOf(entry != null);
                    objArr[2] = "cost";
                    objArr[3] = Long.valueOf(requestStatistic.cacheTime);
                    objArr[4] = "length";
                    objArr[5] = Integer.valueOf(entry != null ? entry.data.length : 0);
                    objArr[6] = "key";
                    objArr[7] = strM4733g;
                    ALog.m4639i("anet.CacheTask", "read cache", str2, objArr);
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            requestStatistic.cacheTime = jCurrentTimeMillis2 - jCurrentTimeMillis;
            if (entry == null || zEquals || !entry.isFresh()) {
                if (this.f5639c) {
                    return;
                }
                C1004e c1004e = new C1004e(this.f5637a, zEquals2 ? null : this.f5638b, entry);
                this.f5637a.f5686e = c1004e;
                c1004e.run();
                return;
            }
            if (this.f5637a.f5685d.compareAndSet(false, true)) {
                this.f5637a.m4757a();
                requestStatistic.ret = 1;
                requestStatistic.statusCode = 200;
                requestStatistic.msg = HttpConstant.SUCCESS;
                requestStatistic.protocolType = "cache";
                requestStatistic.rspEnd = jCurrentTimeMillis2;
                requestStatistic.processTime = jCurrentTimeMillis2 - requestStatistic.start;
                if (ALog.isPrintLog(2)) {
                    C1009j c1009j = this.f5637a;
                    ALog.m4639i("anet.CacheTask", "hit fresh cache", c1009j.f5684c, "URL", c1009j.f5682a.m4732f().urlString());
                }
                this.f5637a.f5683b.onResponseCode(200, entry.responseHeaders);
                Callback callback = this.f5637a.f5683b;
                byte[] bArr = entry.data;
                callback.onDataReceiveSize(1, bArr.length, ByteArray.wrap(bArr));
                this.f5637a.f5683b.onFinish(new DefaultFinishEvent(200, HttpConstant.SUCCESS, requestM4724a));
            }
        }
    }
}
