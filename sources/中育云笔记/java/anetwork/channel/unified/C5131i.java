package anetwork.channel.unified;

import androidx.core.app.NotificationCompat;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.monitor.C5027b;
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
import anetwork.channel.cache.C5106a;
import anetwork.channel.cache.Cache;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.unified.C5127e;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.Constants;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anetwork.channel.unified.i */
/* loaded from: classes3.dex */
class C5131i implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ Request f2957a;

    /* renamed from: b */
    final /* synthetic */ RequestStatistic f2958b;

    /* renamed from: c */
    final /* synthetic */ C5127e f2959c;

    public C5131i(C5127e c5127e, Request request, RequestStatistic requestStatistic) {
        this.f2959c = c5127e;
        this.f2957a = request;
        this.f2958b = requestStatistic;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
        if (this.f2959c.f2934h.get()) {
            return;
        }
        C5127e c5127e = this.f2959c;
        if (c5127e.f2936j == 0) {
            ALog.m2530i(C5127e.TAG, "[onDataReceive] receive first data chunk!", c5127e.f2927a.f2962c, new Object[0]);
        }
        if (z10) {
            ALog.m2530i(C5127e.TAG, "[onDataReceive] receive last data chunk!", this.f2959c.f2927a.f2962c, new Object[0]);
        }
        C5127e c5127e2 = this.f2959c;
        boolean z11 = true;
        int i10 = c5127e2.f2936j + 1;
        c5127e2.f2936j = i10;
        try {
            C5127e.a aVar = c5127e2.f2939m;
            if (aVar != null) {
                aVar.f2942c.add(byteArray);
                if (this.f2958b.recDataSize > 131072 || z10) {
                    C5127e c5127e3 = this.f2959c;
                    c5127e3.f2936j = c5127e3.f2939m.m2646a(c5127e3.f2927a.f2961b, c5127e3.f2935i);
                    C5127e c5127e4 = this.f2959c;
                    c5127e4.f2937k = true;
                    if (c5127e4.f2936j <= 1) {
                        z11 = false;
                    }
                    c5127e4.f2938l = z11;
                    c5127e4.f2939m = null;
                }
            } else {
                c5127e2.f2927a.f2961b.onDataReceiveSize(i10, c5127e2.f2935i, byteArray);
                this.f2959c.f2938l = true;
            }
            ByteArrayOutputStream byteArrayOutputStream = this.f2959c.f2930d;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.write(byteArray.getBuffer(), 0, byteArray.getDataLength());
                if (z10) {
                    String strM2624g = this.f2959c.f2927a.f2960a.m2624g();
                    C5127e c5127e5 = this.f2959c;
                    c5127e5.f2929c.data = c5127e5.f2930d.toByteArray();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C5127e c5127e6 = this.f2959c;
                    c5127e6.f2928b.put(strM2624g, c5127e6.f2929c);
                    ALog.m2530i(C5127e.TAG, "write cache", this.f2959c.f2927a.f2962c, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "size", Integer.valueOf(this.f2959c.f2929c.data.length), "key", strM2624g);
                }
            }
        } catch (Exception e10) {
            ALog.m2531w(C5127e.TAG, "[onDataReceive] error.", this.f2959c.f2927a.f2962c, e10, new Object[0]);
        }
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        String strValueOf;
        DefaultFinishEvent defaultFinishEvent;
        if (this.f2959c.f2934h.getAndSet(true)) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.m2530i(C5127e.TAG, "[onFinish]", this.f2959c.f2927a.f2962c, Constants.KEY_HTTP_CODE, Integer.valueOf(i10), NotificationCompat.CATEGORY_MESSAGE, str);
        }
        if (i10 < 0) {
            try {
                if (this.f2959c.f2927a.f2960a.m2621d()) {
                    C5127e c5127e = this.f2959c;
                    if (!c5127e.f2937k && !c5127e.f2938l) {
                        ALog.m2529e(C5127e.TAG, "clear response buffer and retry", c5127e.f2927a.f2962c, new Object[0]);
                        C5127e.a aVar = this.f2959c.f2939m;
                        if (aVar != null) {
                            requestStatistic.roaming = aVar.f2942c.isEmpty() ? 3 : 4;
                            this.f2959c.f2939m.m2647a();
                            this.f2959c.f2939m = null;
                        }
                        if (this.f2959c.f2927a.f2960a.f2903a == 0) {
                            requestStatistic.firstProtocol = requestStatistic.protocolType;
                            requestStatistic.firstErrorCode = requestStatistic.tnetErrorCode != 0 ? requestStatistic.tnetErrorCode : i10;
                        }
                        this.f2959c.f2927a.f2960a.m2628k();
                        this.f2959c.f2927a.f2963d = new AtomicBoolean();
                        C5127e c5127e2 = this.f2959c;
                        C5132j c5132j = c5127e2.f2927a;
                        c5132j.f2964e = new C5127e(c5132j, c5127e2.f2928b, c5127e2.f2929c);
                        if (requestStatistic.tnetErrorCode != 0) {
                            strValueOf = i10 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + requestStatistic.protocolType + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + requestStatistic.tnetErrorCode;
                            requestStatistic.tnetErrorCode = 0;
                        } else {
                            strValueOf = String.valueOf(i10);
                        }
                        requestStatistic.appendErrorTrace(strValueOf);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        requestStatistic.retryCostTime += jCurrentTimeMillis - requestStatistic.start;
                        requestStatistic.start = jCurrentTimeMillis;
                        ThreadPoolExecutorFactory.submitPriorityTask(this.f2959c.f2927a.f2964e, ThreadPoolExecutorFactory.Priority.HIGH);
                        return;
                    }
                    requestStatistic.msg += ":回调后触发重试";
                    C5127e c5127e3 = this.f2959c;
                    if (c5127e3.f2938l) {
                        requestStatistic.roaming = 2;
                    } else if (c5127e3.f2937k) {
                        requestStatistic.roaming = 1;
                    }
                    ALog.m2529e(C5127e.TAG, "Cannot retry request after onHeader/onDataReceived callback!", c5127e3.f2927a.f2962c, new Object[0]);
                }
            } catch (Exception unused) {
                return;
            }
        }
        C5127e c5127e4 = this.f2959c;
        C5127e.a aVar2 = c5127e4.f2939m;
        if (aVar2 != null) {
            aVar2.m2646a(c5127e4.f2927a.f2961b, c5127e4.f2935i);
        }
        this.f2959c.f2927a.m2648a();
        requestStatistic.isDone.set(true);
        if (this.f2959c.f2927a.f2960a.m2627j() && requestStatistic.contentLength != 0 && requestStatistic.contentLength != requestStatistic.rspBodyDeflateSize) {
            requestStatistic.ret = 0;
            i10 = ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH;
            requestStatistic.statusCode = ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH;
            str = ErrorConstant.getErrMsg(ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH);
            requestStatistic.msg = str;
            C5127e c5127e5 = this.f2959c;
            ALog.m2529e(C5127e.TAG, "received data length not match with content-length", c5127e5.f2927a.f2962c, "content-length", Integer.valueOf(c5127e5.f2935i), "recDataLength", Long.valueOf(requestStatistic.rspBodyDeflateSize));
            ExceptionStatistic exceptionStatistic = new ExceptionStatistic(ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH, str, "rt");
            exceptionStatistic.url = this.f2959c.f2927a.f2960a.m2624g();
            AppMonitor.getInstance().commitStat(exceptionStatistic);
        }
        if (i10 != 304 || this.f2959c.f2929c == null) {
            defaultFinishEvent = new DefaultFinishEvent(i10, str, this.f2957a);
        } else {
            requestStatistic.protocolType = "cache";
            defaultFinishEvent = new DefaultFinishEvent(200, str, this.f2957a);
        }
        this.f2959c.f2927a.f2961b.onFinish(defaultFinishEvent);
        if (i10 >= 0) {
            C5027b.m2355a().m2360a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize);
        } else {
            requestStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        }
        NetworkAnalysis.getInstance().commitFlow(new FlowStat(this.f2959c.f2931e, requestStatistic));
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        String singleHeaderFieldByKey;
        if (this.f2959c.f2934h.get()) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.m2530i(C5127e.TAG, "onResponseCode", this.f2957a.getSeq(), Constants.KEY_HTTP_CODE, Integer.valueOf(i10));
            ALog.m2530i(C5127e.TAG, "onResponseCode", this.f2957a.getSeq(), "headers", map);
        }
        if (HttpHelper.checkRedirect(this.f2957a, i10) && (singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Location")) != null) {
            HttpUrl httpUrl = HttpUrl.parse(singleHeaderFieldByKey);
            if (httpUrl != null) {
                if (this.f2959c.f2934h.compareAndSet(false, true)) {
                    httpUrl.lockScheme();
                    this.f2959c.f2927a.f2960a.m2618a(httpUrl);
                    this.f2959c.f2927a.f2963d = new AtomicBoolean();
                    C5132j c5132j = this.f2959c.f2927a;
                    c5132j.f2964e = new C5127e(c5132j, null, null);
                    this.f2958b.recordRedirect(i10, httpUrl.simpleUrlString());
                    this.f2958b.locationUrl = singleHeaderFieldByKey;
                    ThreadPoolExecutorFactory.submitPriorityTask(this.f2959c.f2927a.f2964e, ThreadPoolExecutorFactory.Priority.HIGH);
                    return;
                }
                return;
            }
            ALog.m2529e(C5127e.TAG, "redirect url is invalid!", this.f2957a.getSeq(), "redirect url", singleHeaderFieldByKey);
        }
        try {
            this.f2959c.f2927a.m2648a();
            CookieManager.setCookie(this.f2959c.f2927a.f2960a.m2624g(), map);
            this.f2959c.f2935i = HttpHelper.parseContentLength(map);
            String strM2624g = this.f2959c.f2927a.f2960a.m2624g();
            C5127e c5127e = this.f2959c;
            Cache.Entry entry = c5127e.f2929c;
            if (entry != null && i10 == 304) {
                entry.responseHeaders.putAll(map);
                Cache.Entry entryM2576a = C5106a.m2576a(map);
                if (entryM2576a != null) {
                    long j10 = entryM2576a.ttl;
                    Cache.Entry entry2 = this.f2959c.f2929c;
                    if (j10 > entry2.ttl) {
                        entry2.ttl = j10;
                    }
                }
                C5127e c5127e2 = this.f2959c;
                c5127e2.f2927a.f2961b.onResponseCode(200, c5127e2.f2929c.responseHeaders);
                C5127e c5127e3 = this.f2959c;
                Callback callback = c5127e3.f2927a.f2961b;
                byte[] bArr = c5127e3.f2929c.data;
                callback.onDataReceiveSize(1, bArr.length, ByteArray.wrap(bArr));
                long jCurrentTimeMillis = System.currentTimeMillis();
                C5127e c5127e4 = this.f2959c;
                c5127e4.f2928b.put(strM2624g, c5127e4.f2929c);
                ALog.m2530i(C5127e.TAG, "update cache", this.f2959c.f2927a.f2962c, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "key", strM2624g);
                return;
            }
            if (c5127e.f2928b != null) {
                if ("no-store".equals(HttpHelper.getSingleHeaderFieldByKey(map, "Cache-Control"))) {
                    this.f2959c.f2928b.remove(strM2624g);
                } else {
                    C5127e c5127e5 = this.f2959c;
                    Cache.Entry entryM2576a2 = C5106a.m2576a(map);
                    c5127e5.f2929c = entryM2576a2;
                    if (entryM2576a2 != null) {
                        HttpHelper.removeHeaderFiledByKey(map, "Cache-Control");
                        map.put("Cache-Control", Arrays.asList("no-store"));
                        C5127e c5127e6 = this.f2959c;
                        int i11 = this.f2959c.f2935i;
                        if (i11 == 0) {
                            i11 = 5120;
                        }
                        c5127e6.f2930d = new ByteArrayOutputStream(i11);
                    }
                }
            }
            map.put(HttpConstant.X_PROTOCOL, Arrays.asList(this.f2958b.protocolType));
            if (!"open".equalsIgnoreCase(HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.STREAMING_PARSER)) && NetworkConfigCenter.isResponseBufferEnable()) {
                C5127e c5127e7 = this.f2959c;
                if (c5127e7.f2935i <= 131072) {
                    c5127e7.f2939m = new C5127e.a(i10, map);
                    return;
                }
            }
            this.f2959c.f2927a.f2961b.onResponseCode(i10, map);
            this.f2959c.f2937k = true;
        } catch (Exception e10) {
            ALog.m2531w(C5127e.TAG, "[onResponseCode] error.", this.f2959c.f2927a.f2962c, e10, new Object[0]);
        }
    }
}
