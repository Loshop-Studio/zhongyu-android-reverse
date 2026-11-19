package anetwork.channel.unified;

import anet.channel.bytes.ByteArray;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.entity.C5121g;
import anetwork.channel.interceptor.Callback;
import com.tendcloud.tenddata.C7979fc;

/* renamed from: anetwork.channel.unified.a */
/* loaded from: classes3.dex */
public class C5123a implements IUnifiedTask {

    /* renamed from: a */
    private C5132j f2915a;

    /* renamed from: b */
    private Cache f2916b;

    /* renamed from: c */
    private volatile boolean f2917c = false;

    public C5123a(C5132j c5132j, Cache cache) {
        this.f2915a = null;
        this.f2916b = null;
        this.f2915a = c5132j;
        this.f2916b = cache;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.f2917c = true;
        this.f2915a.f2960a.f2904b.ret = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        Cache.Entry entry;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        Cache.Entry entry2;
        ?? r12;
        if (this.f2917c) {
            return;
        }
        C5121g c5121g = this.f2915a.f2960a;
        RequestStatistic requestStatistic = c5121g.f2904b;
        if (this.f2916b != null) {
            String strM2624g = c5121g.m2624g();
            Request requestM2615a = this.f2915a.f2960a.m2615a();
            String str = requestM2615a.getHeaders().get("Cache-Control");
            boolean zEquals = "no-store".equals(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z14 = false;
            if (zEquals) {
                this.f2916b.remove(strM2624g);
                z11 = zEquals;
                j10 = jCurrentTimeMillis;
                entry2 = null;
                r12 = 1;
                z13 = false;
            } else {
                boolean zEquals2 = "no-cache".equals(str);
                Cache.Entry entry3 = this.f2916b.get(strM2624g);
                if (ALog.isPrintLog(2)) {
                    entry = entry3;
                    z10 = zEquals2;
                    z11 = zEquals;
                    z12 = true;
                    z13 = false;
                    j10 = jCurrentTimeMillis;
                    ALog.m2530i("anet.CacheTask", "read cache", this.f2915a.f2962c, "hit", Boolean.valueOf(entry3 != null), "cost", Long.valueOf(requestStatistic.cacheTime), C7979fc.a.LENGTH, Integer.valueOf(entry3 != null ? entry3.data.length : 0), "key", strM2624g);
                } else {
                    z10 = zEquals2;
                    entry = entry3;
                    z11 = zEquals;
                    j10 = jCurrentTimeMillis;
                    z12 = true;
                    z13 = false;
                }
                z14 = z10;
                entry2 = entry;
                r12 = z12;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            requestStatistic.cacheTime = jCurrentTimeMillis2 - j10;
            if (entry2 == null || z14 || !entry2.isFresh()) {
                if (this.f2917c) {
                    return;
                }
                C5127e c5127e = new C5127e(this.f2915a, z11 ? null : this.f2916b, entry2);
                this.f2915a.f2964e = c5127e;
                c5127e.run();
                return;
            }
            if (this.f2915a.f2963d.compareAndSet(z13, r12)) {
                this.f2915a.m2648a();
                requestStatistic.ret = r12;
                requestStatistic.statusCode = 200;
                requestStatistic.msg = HttpConstant.SUCCESS;
                requestStatistic.protocolType = "cache";
                requestStatistic.rspEnd = jCurrentTimeMillis2;
                requestStatistic.processTime = jCurrentTimeMillis2 - requestStatistic.start;
                if (ALog.isPrintLog(2)) {
                    C5132j c5132j = this.f2915a;
                    ALog.m2530i("anet.CacheTask", "hit fresh cache", c5132j.f2962c, "URL", c5132j.f2960a.m2623f().urlString());
                }
                this.f2915a.f2961b.onResponseCode(200, entry2.responseHeaders);
                Callback callback = this.f2915a.f2961b;
                byte[] bArr = entry2.data;
                callback.onDataReceiveSize(r12, bArr.length, ByteArray.wrap(bArr));
                this.f2915a.f2961b.onFinish(new DefaultFinishEvent(200, HttpConstant.SUCCESS, requestM2615a));
            }
        }
    }
}
