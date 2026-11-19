package anetwork.channel.unified;

import android.support.v4.media.session.PlaybackStateCompat;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.monitor.C0904b;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.HttpUrl;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.C0983a;
import anetwork.channel.cache.Cache;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.unified.C1004e;
import com.taobao.accs.common.Constants;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anetwork.channel.unified.i */
/* loaded from: classes.dex */
class C1008i implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ Request f5679a;

    /* renamed from: b */
    final /* synthetic */ RequestStatistic f5680b;

    /* renamed from: c */
    final /* synthetic */ C1004e f5681c;

    C1008i(C1004e c1004e, Request request, RequestStatistic requestStatistic) {
        this.f5681c = c1004e;
        this.f5679a = request;
        this.f5680b = requestStatistic;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z3) {
        if (this.f5681c.f5656h.get()) {
            return;
        }
        C1004e c1004e = this.f5681c;
        if (c1004e.f5658j == 0) {
            ALog.m4639i(C1004e.TAG, "[onDataReceive] receive first data chunk!", c1004e.f5649a.f5684c, new Object[0]);
        }
        if (z3) {
            ALog.m4639i(C1004e.TAG, "[onDataReceive] receive last data chunk!", this.f5681c.f5649a.f5684c, new Object[0]);
        }
        C1004e c1004e2 = this.f5681c;
        int i4 = c1004e2.f5658j + 1;
        c1004e2.f5658j = i4;
        try {
            C1004e.a aVar = c1004e2.f5661m;
            if (aVar != null) {
                aVar.f5664c.add(byteArray);
                if (this.f5680b.recDataSize > PlaybackStateCompat.ACTION_PREPARE_FROM_URI || z3) {
                    C1004e c1004e3 = this.f5681c;
                    c1004e3.f5658j = c1004e3.f5661m.m4755a(c1004e3.f5649a.f5683b, c1004e3.f5657i);
                    C1004e c1004e4 = this.f5681c;
                    c1004e4.f5659k = true;
                    c1004e4.f5660l = c1004e4.f5658j > 1;
                    c1004e4.f5661m = null;
                }
            } else {
                c1004e2.f5649a.f5683b.onDataReceiveSize(i4, c1004e2.f5657i, byteArray);
                this.f5681c.f5660l = true;
            }
            ByteArrayOutputStream byteArrayOutputStream = this.f5681c.f5652d;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.write(byteArray.getBuffer(), 0, byteArray.getDataLength());
                if (z3) {
                    String strM4733g = this.f5681c.f5649a.f5682a.m4733g();
                    C1004e c1004e5 = this.f5681c;
                    c1004e5.f5651c.data = c1004e5.f5652d.toByteArray();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1004e c1004e6 = this.f5681c;
                    c1004e6.f5650b.put(strM4733g, c1004e6.f5651c);
                    ALog.m4639i(C1004e.TAG, "write cache", this.f5681c.f5649a.f5684c, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "size", Integer.valueOf(this.f5681c.f5651c.data.length), "key", strM4733g);
                }
            }
        } catch (Exception e4) {
            ALog.m4640w(C1004e.TAG, "[onDataReceive] error.", this.f5681c.f5649a.f5684c, e4, new Object[0]);
        }
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i4, String str, RequestStatistic requestStatistic) {
        String strValueOf;
        DefaultFinishEvent defaultFinishEvent;
        if (this.f5681c.f5656h.getAndSet(true)) {
            return;
        }
        int i5 = 3;
        if (ALog.isPrintLog(2)) {
            ALog.m4639i(C1004e.TAG, "[onFinish]", this.f5681c.f5649a.f5684c, Constants.KEY_HTTP_CODE, Integer.valueOf(i4), "msg", str);
        }
        if (i4 < 0) {
            try {
                if (this.f5681c.f5649a.f5682a.m4730d()) {
                    C1004e c1004e = this.f5681c;
                    if (!c1004e.f5659k && !c1004e.f5660l) {
                        ALog.m4638e(C1004e.TAG, "clear response buffer and retry", c1004e.f5649a.f5684c, new Object[0]);
                        C1004e.a aVar = this.f5681c.f5661m;
                        if (aVar != null) {
                            if (!aVar.f5664c.isEmpty()) {
                                i5 = 4;
                            }
                            requestStatistic.roaming = i5;
                            this.f5681c.f5661m.m4756a();
                            this.f5681c.f5661m = null;
                        }
                        if (this.f5681c.f5649a.f5682a.f5625a == 0) {
                            requestStatistic.firstProtocol = requestStatistic.protocolType;
                            requestStatistic.firstErrorCode = requestStatistic.tnetErrorCode != 0 ? requestStatistic.tnetErrorCode : i4;
                        }
                        this.f5681c.f5649a.f5682a.m4737k();
                        this.f5681c.f5649a.f5685d = new AtomicBoolean();
                        C1004e c1004e2 = this.f5681c;
                        C1009j c1009j = c1004e2.f5649a;
                        c1009j.f5686e = new C1004e(c1009j, c1004e2.f5650b, c1004e2.f5651c);
                        if (requestStatistic.tnetErrorCode != 0) {
                            strValueOf = i4 + "|" + requestStatistic.protocolType + "|" + requestStatistic.tnetErrorCode;
                            requestStatistic.tnetErrorCode = 0;
                        } else {
                            strValueOf = String.valueOf(i4);
                        }
                        requestStatistic.appendErrorTrace(strValueOf);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        requestStatistic.retryCostTime += jCurrentTimeMillis - requestStatistic.start;
                        requestStatistic.start = jCurrentTimeMillis;
                        ThreadPoolExecutorFactory.submitPriorityTask(this.f5681c.f5649a.f5686e, ThreadPoolExecutorFactory.Priority.HIGH);
                        return;
                    }
                    requestStatistic.msg += ":回调后触发重试";
                    C1004e c1004e3 = this.f5681c;
                    if (c1004e3.f5660l) {
                        requestStatistic.roaming = 2;
                    } else if (c1004e3.f5659k) {
                        requestStatistic.roaming = 1;
                    }
                    ALog.m4638e(C1004e.TAG, "Cannot retry request after onHeader/onDataReceived callback!", c1004e3.f5649a.f5684c, new Object[0]);
                }
            } catch (Exception unused) {
                return;
            }
        }
        C1004e c1004e4 = this.f5681c;
        C1004e.a aVar2 = c1004e4.f5661m;
        if (aVar2 != null) {
            aVar2.m4755a(c1004e4.f5649a.f5683b, c1004e4.f5657i);
        }
        this.f5681c.f5649a.m4757a();
        requestStatistic.isDone.set(true);
        if (this.f5681c.f5649a.f5682a.m4736j() && requestStatistic.contentLength != 0 && requestStatistic.contentLength != requestStatistic.rspBodyDeflateSize) {
            requestStatistic.ret = 0;
            requestStatistic.statusCode = ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH;
            str = ErrorConstant.getErrMsg(ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH);
            requestStatistic.msg = str;
            C1004e c1004e5 = this.f5681c;
            ALog.m4638e(C1004e.TAG, "received data length not match with content-length", c1004e5.f5649a.f5684c, "content-length", Integer.valueOf(c1004e5.f5657i), "recDataLength", Long.valueOf(requestStatistic.rspBodyDeflateSize));
            ExceptionStatistic exceptionStatistic = new ExceptionStatistic(ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH, str, "rt");
            exceptionStatistic.url = this.f5681c.f5649a.f5682a.m4733g();
            AppMonitor.getInstance().commitStat(exceptionStatistic);
            i4 = ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH;
        }
        if (i4 != 304 || this.f5681c.f5651c == null) {
            defaultFinishEvent = new DefaultFinishEvent(i4, str, this.f5679a);
        } else {
            requestStatistic.protocolType = "cache";
            defaultFinishEvent = new DefaultFinishEvent(200, str, this.f5679a);
        }
        this.f5681c.f5649a.f5683b.onFinish(defaultFinishEvent);
        if (i4 >= 0) {
            C0904b.m4464a().m4469a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize);
        } else {
            requestStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        }
        NetworkAnalysis.getInstance().commitFlow(new FlowStat(this.f5681c.f5653e, requestStatistic));
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i4, Map<String, List<String>> map) {
        String singleHeaderFieldByKey;
        if (this.f5681c.f5656h.get()) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.m4639i(C1004e.TAG, "onResponseCode", this.f5679a.getSeq(), Constants.KEY_HTTP_CODE, Integer.valueOf(i4));
            ALog.m4639i(C1004e.TAG, "onResponseCode", this.f5679a.getSeq(), "headers", map);
        }
        if (HttpHelper.checkRedirect(this.f5679a, i4) && (singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Location")) != null) {
            HttpUrl httpUrl = HttpUrl.parse(singleHeaderFieldByKey);
            if (httpUrl != null) {
                if (this.f5681c.f5656h.compareAndSet(false, true)) {
                    httpUrl.lockScheme();
                    this.f5681c.f5649a.f5682a.m4727a(httpUrl);
                    this.f5681c.f5649a.f5685d = new AtomicBoolean();
                    C1009j c1009j = this.f5681c.f5649a;
                    c1009j.f5686e = new C1004e(c1009j, null, null);
                    this.f5680b.recordRedirect(i4, httpUrl.simpleUrlString());
                    this.f5680b.locationUrl = singleHeaderFieldByKey;
                    ThreadPoolExecutorFactory.submitPriorityTask(this.f5681c.f5649a.f5686e, ThreadPoolExecutorFactory.Priority.HIGH);
                    return;
                }
                return;
            }
            ALog.m4638e(C1004e.TAG, "redirect url is invalid!", this.f5679a.getSeq(), "redirect url", singleHeaderFieldByKey);
        }
        try {
            this.f5681c.f5649a.m4757a();
            CookieManager.setCookie(this.f5681c.f5649a.f5682a.m4733g(), map);
            this.f5681c.f5657i = HttpHelper.parseContentLength(map);
            String strM4733g = this.f5681c.f5649a.f5682a.m4733g();
            C1004e c1004e = this.f5681c;
            Cache.Entry entry = c1004e.f5651c;
            if (entry != null && i4 == 304) {
                entry.responseHeaders.putAll(map);
                Cache.Entry entryM4685a = C0983a.m4685a(map);
                if (entryM4685a != null) {
                    long j4 = entryM4685a.ttl;
                    Cache.Entry entry2 = this.f5681c.f5651c;
                    if (j4 > entry2.ttl) {
                        entry2.ttl = j4;
                    }
                }
                C1004e c1004e2 = this.f5681c;
                c1004e2.f5649a.f5683b.onResponseCode(200, c1004e2.f5651c.responseHeaders);
                C1004e c1004e3 = this.f5681c;
                Callback callback = c1004e3.f5649a.f5683b;
                byte[] bArr = c1004e3.f5651c.data;
                callback.onDataReceiveSize(1, bArr.length, ByteArray.wrap(bArr));
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1004e c1004e4 = this.f5681c;
                c1004e4.f5650b.put(strM4733g, c1004e4.f5651c);
                ALog.m4639i(C1004e.TAG, "update cache", this.f5681c.f5649a.f5684c, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "key", strM4733g);
                return;
            }
            if (c1004e.f5650b != null) {
                if ("no-store".equals(HttpHelper.getSingleHeaderFieldByKey(map, "Cache-Control"))) {
                    this.f5681c.f5650b.remove(strM4733g);
                } else {
                    C1004e c1004e5 = this.f5681c;
                    Cache.Entry entryM4685a2 = C0983a.m4685a(map);
                    c1004e5.f5651c = entryM4685a2;
                    if (entryM4685a2 != null) {
                        HttpHelper.removeHeaderFiledByKey(map, "Cache-Control");
                        map.put("Cache-Control", Arrays.asList("no-store"));
                        C1004e c1004e6 = this.f5681c;
                        int i5 = this.f5681c.f5657i;
                        if (i5 == 0) {
                            i5 = 5120;
                        }
                        c1004e6.f5652d = new ByteArrayOutputStream(i5);
                    }
                }
            }
            map.put(HttpConstant.X_PROTOCOL, Arrays.asList(this.f5680b.protocolType));
            if (!"open".equalsIgnoreCase(HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.STREAMING_PARSER)) && NetworkConfigCenter.isResponseBufferEnable()) {
                C1004e c1004e7 = this.f5681c;
                if (c1004e7.f5657i <= 131072) {
                    c1004e7.f5661m = new C1004e.a(i4, map);
                    return;
                }
            }
            this.f5681c.f5649a.f5683b.onResponseCode(i4, map);
            this.f5681c.f5659k = true;
        } catch (Exception e4) {
            ALog.m4640w(C1004e.TAG, "[onResponseCode] error.", this.f5681c.f5649a.f5684c, e4, new Object[0]);
        }
    }
}
