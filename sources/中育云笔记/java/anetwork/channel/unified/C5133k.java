package anetwork.channel.unified;

import android.os.Looper;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.monitor.C5027b;
import anet.channel.request.C5034b;
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
import anetwork.channel.entity.C5117c;
import anetwork.channel.entity.C5121g;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.interceptor.Interceptor;
import anetwork.channel.interceptor.InterceptorManager;
import anetwork.channel.util.RequestConstant;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: anetwork.channel.unified.k */
/* loaded from: classes3.dex */
class C5133k {

    /* renamed from: a */
    protected C5132j f2966a;

    /* renamed from: anetwork.channel.unified.k$a */
    public class a implements Interceptor.Chain {

        /* renamed from: b */
        private int f2968b;

        /* renamed from: c */
        private Request f2969c;

        /* renamed from: d */
        private Callback f2970d;

        public a(int i10, Request request, Callback callback) {
            this.f2968b = i10;
            this.f2969c = request;
            this.f2970d = callback;
        }

        @Override // anetwork.channel.interceptor.Interceptor.Chain
        public Callback callback() {
            return this.f2970d;
        }

        @Override // anetwork.channel.interceptor.Interceptor.Chain
        public Future proceed(Request request, Callback callback) {
            if (C5133k.this.f2966a.f2963d.get()) {
                ALog.m2530i("anet.UnifiedRequestTask", "request canneled or timeout in processing interceptor", request.getSeq(), new Object[0]);
                return null;
            }
            if (this.f2968b < InterceptorManager.getSize()) {
                return InterceptorManager.getInterceptor(this.f2968b).intercept(C5133k.this.new a(this.f2968b + 1, request, callback));
            }
            C5133k.this.f2966a.f2960a.m2617a(request);
            C5133k.this.f2966a.f2961b = callback;
            Cache cache = NetworkConfigCenter.isHttpCacheEnable() ? CacheManager.getCache(C5133k.this.f2966a.f2960a.m2624g(), C5133k.this.f2966a.f2960a.m2625h()) : null;
            C5132j c5132j = C5133k.this.f2966a;
            c5132j.f2964e = cache != null ? new C5123a(c5132j, cache) : new C5127e(c5132j, null, null);
            C5133k.this.f2966a.f2964e.run();
            C5133k.this.m2651c();
            return null;
        }

        @Override // anetwork.channel.interceptor.Interceptor.Chain
        public Request request() {
            return this.f2969c;
        }
    }

    public C5133k(C5121g c5121g, C5117c c5117c) {
        c5117c.m2611a(c5121g.f2907e);
        this.f2966a = new C5132j(c5121g, c5117c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m2651c() {
        this.f2966a.f2965f = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC5136n(this), this.f2966a.f2960a.m2619b(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public void m2653b() {
        if (this.f2966a.f2963d.compareAndSet(false, true)) {
            ALog.m2529e("anet.UnifiedRequestTask", "task cancelled", this.f2966a.f2962c, "URL", this.f2966a.f2960a.m2623f().simpleUrlString());
            RequestStatistic requestStatistic = this.f2966a.f2960a.f2904b;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.ret = 2;
                requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_CANCEL;
                requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_CANCEL);
                requestStatistic.rspEnd = System.currentTimeMillis();
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_CANCEL, null, requestStatistic, null));
                if (requestStatistic.recDataSize > OSSConstants.MIN_PART_SIZE_LIMIT) {
                    C5027b.m2355a().m2360a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.recDataSize);
                }
            }
            this.f2966a.m2649b();
            this.f2966a.m2648a();
            this.f2966a.f2961b.onFinish(new DefaultFinishEvent(ErrorConstant.ERROR_REQUEST_CANCEL, (String) null, this.f2966a.f2960a.m2615a()));
        }
    }

    /* renamed from: a */
    public Future m2652a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f2966a.f2960a.f2904b.reqServiceTransmissionEnd = jCurrentTimeMillis;
        this.f2966a.f2960a.f2904b.start = jCurrentTimeMillis;
        C5121g c5121g = this.f2966a.f2960a;
        c5121g.f2904b.isReqSync = c5121g.m2620c();
        this.f2966a.f2960a.f2904b.isReqMain = Looper.myLooper() == Looper.getMainLooper();
        try {
            C5121g c5121g2 = this.f2966a.f2960a;
            c5121g2.f2904b.netReqStart = Long.valueOf(c5121g2.m2616a(RequestConstant.KEY_REQ_START)).longValue();
        } catch (Exception unused) {
        }
        String strM2616a = this.f2966a.f2960a.m2616a(RequestConstant.KEY_TRACE_ID);
        if (!TextUtils.isEmpty(strM2616a)) {
            this.f2966a.f2960a.f2904b.traceId = strM2616a;
        }
        String strM2616a2 = this.f2966a.f2960a.m2616a(RequestConstant.KEY_REQ_PROCESS);
        C5121g c5121g3 = this.f2966a.f2960a;
        RequestStatistic requestStatistic = c5121g3.f2904b;
        requestStatistic.process = strM2616a2;
        requestStatistic.pTraceId = c5121g3.m2616a(RequestConstant.KEY_PARENT_TRACE_ID);
        C5132j c5132j = this.f2966a;
        ALog.m2529e("anet.UnifiedRequestTask", "[traceId:" + strM2616a + "]start", c5132j.f2962c, "bizId", c5132j.f2960a.m2615a().getBizId(), "processFrom", strM2616a2, "url", this.f2966a.f2960a.m2624g());
        if (!NetworkConfigCenter.isUrlInDegradeList(this.f2966a.f2960a.m2623f())) {
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC5135m(this), ThreadPoolExecutorFactory.Priority.HIGH);
            return new FutureC5126d(this);
        }
        C5124b c5124b = new C5124b(this.f2966a);
        this.f2966a.f2964e = c5124b;
        c5124b.f2918a = new C5034b(ThreadPoolExecutorFactory.submitBackupTask(new RunnableC5134l(this)), this.f2966a.f2960a.m2615a().getSeq());
        m2651c();
        return new FutureC5126d(this);
    }
}
