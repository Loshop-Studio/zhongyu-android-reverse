package anetwork.channel.unified;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.aidl.DefaultFinishEvent;

/* renamed from: anetwork.channel.unified.n */
/* loaded from: classes3.dex */
class RunnableC5136n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5133k f2973a;

    public RunnableC5136n(C5133k c5133k) {
        this.f2973a = c5133k;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2973a.f2966a.f2963d.compareAndSet(false, true)) {
            RequestStatistic requestStatistic = this.f2973a.f2966a.f2960a.f2904b;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_TIME_OUT;
                requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_TIME_OUT);
                requestStatistic.rspEnd = System.currentTimeMillis();
                ALog.m2529e("anet.UnifiedRequestTask", "task time out", this.f2973a.f2966a.f2962c, "rs", requestStatistic);
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_TIME_OUT, null, requestStatistic, null));
            }
            this.f2973a.f2966a.m2649b();
            this.f2973a.f2966a.f2961b.onFinish(new DefaultFinishEvent(ErrorConstant.ERROR_REQUEST_TIME_OUT, (String) null, this.f2973a.f2966a.f2960a.m2615a()));
        }
    }
}
