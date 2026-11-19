package anetwork.channel.unified;

import android.os.Looper;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.monitor.C0904b;
import anet.channel.request.C0911b;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.cache.CacheManager;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.entity.C0994c;
import anetwork.channel.entity.C0998g;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.interceptor.Interceptor;
import anetwork.channel.interceptor.InterceptorManager;
import anetwork.channel.util.RequestConstant;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;

/* renamed from: anetwork.channel.unified.k */
/* loaded from: classes.dex */
class C1010k {

    /* renamed from: a */
    protected C1009j f5688a;

    /* renamed from: anetwork.channel.unified.k$a */
    class a implements Interceptor.Chain {

        /* renamed from: b */
        private int f5690b;

        /* renamed from: c */
        private Request f5691c;

        /* renamed from: d */
        private Callback f5692d;

        a(int i4, Request request, Callback callback) {
            this.f5690b = i4;
            this.f5691c = request;
            this.f5692d = callback;
        }

        @Override // anetwork.channel.interceptor.Interceptor.Chain
        public Callback callback() {
            return this.f5692d;
        }

        @Override // anetwork.channel.interceptor.Interceptor.Chain
        public Future proceed(Request request, Callback callback) {
            if (C1010k.this.f5688a.f5685d.get()) {
                ALog.m4639i("anet.UnifiedRequestTask", "request canneled or timeout in processing interceptor", request.getSeq(), new Object[0]);
                return null;
            }
            if (this.f5690b < InterceptorManager.getSize()) {
                return InterceptorManager.getInterceptor(this.f5690b).intercept(C1010k.this.new a(this.f5690b + 1, request, callback));
            }
            C1010k.this.f5688a.f5682a.m4726a(request);
            C1010k.this.f5688a.f5683b = callback;
            Cache cache = NetworkConfigCenter.isHttpCacheEnable() ? CacheManager.getCache(C1010k.this.f5688a.f5682a.m4733g(), C1010k.this.f5688a.f5682a.m4734h()) : null;
            C1009j c1009j = C1010k.this.f5688a;
            c1009j.f5686e = cache != null ? new C1000a(c1009j, cache) : new C1004e(c1009j, null, null);
            C1010k.this.f5688a.f5686e.run();
            C1010k.this.m4760c();
            return null;
        }

        @Override // anetwork.channel.interceptor.Interceptor.Chain
        public Request request() {
            return this.f5691c;
        }
    }

    public C1010k(C0998g c0998g, C0994c c0994c) {
        c0994c.m4720a(c0998g.f5629e);
        this.f5688a = new C1009j(c0998g, c0994c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m4760c() {
        this.f5688a.f5687f = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC1013n(this), this.f5688a.f5682a.m4728b(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    void m4762b() {
        if (this.f5688a.f5685d.compareAndSet(false, true)) {
            ALog.m4638e("anet.UnifiedRequestTask", "task cancelled", this.f5688a.f5684c, "URL", this.f5688a.f5682a.m4732f().simpleUrlString());
            RequestStatistic requestStatistic = this.f5688a.f5682a.f5626b;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.ret = 2;
                requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_CANCEL;
                requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_CANCEL);
                requestStatistic.rspEnd = System.currentTimeMillis();
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_CANCEL, null, requestStatistic, null));
                if (requestStatistic.recDataSize > OSSConstants.MIN_PART_SIZE_LIMIT) {
                    C0904b.m4464a().m4469a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.recDataSize);
                }
            }
            this.f5688a.m4758b();
            this.f5688a.m4757a();
            this.f5688a.f5683b.onFinish(new DefaultFinishEvent(ErrorConstant.ERROR_REQUEST_CANCEL, (String) null, this.f5688a.f5682a.m4724a()));
        }
    }

    /* renamed from: a */
    public Future m4761a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f5688a.f5682a.f5626b.reqServiceTransmissionEnd = jCurrentTimeMillis;
        this.f5688a.f5682a.f5626b.start = jCurrentTimeMillis;
        C0998g c0998g = this.f5688a.f5682a;
        c0998g.f5626b.isReqSync = c0998g.m4729c();
        this.f5688a.f5682a.f5626b.isReqMain = Looper.myLooper() == Looper.getMainLooper();
        try {
            C0998g c0998g2 = this.f5688a.f5682a;
            c0998g2.f5626b.netReqStart = Long.valueOf(c0998g2.m4725a(RequestConstant.KEY_REQ_START)).longValue();
        } catch (Exception unused) {
        }
        String strM4725a = this.f5688a.f5682a.m4725a(RequestConstant.KEY_TRACE_ID);
        if (!TextUtils.isEmpty(strM4725a)) {
            this.f5688a.f5682a.f5626b.traceId = strM4725a;
        }
        String strM4725a2 = this.f5688a.f5682a.m4725a(RequestConstant.KEY_REQ_PROCESS);
        C0998g c0998g3 = this.f5688a.f5682a;
        RequestStatistic requestStatistic = c0998g3.f5626b;
        requestStatistic.process = strM4725a2;
        requestStatistic.pTraceId = c0998g3.m4725a(RequestConstant.KEY_PARENT_TRACE_ID);
        C1009j c1009j = this.f5688a;
        ALog.m4638e("anet.UnifiedRequestTask", "[traceId:" + strM4725a + "]start", c1009j.f5684c, "bizId", c1009j.f5682a.m4724a().getBizId(), "processFrom", strM4725a2, AgooConstants.OPEN_URL, this.f5688a.f5682a.m4733g());
        if (!NetworkConfigCenter.isUrlInDegradeList(this.f5688a.f5682a.m4732f())) {
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC1012m(this), ThreadPoolExecutorFactory.Priority.HIGH);
            return new FutureC1003d(this);
        }
        C1001b c1001b = new C1001b(this.f5688a);
        this.f5688a.f5686e = c1001b;
        c1001b.f5640a = new C0911b(ThreadPoolExecutorFactory.submitBackupTask(new RunnableC1011l(this)), this.f5688a.f5682a.m4724a().getSeq());
        m4760c();
        return new FutureC1003d(this);
    }
}
