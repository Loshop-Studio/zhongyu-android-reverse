package anetwork.channel.unified;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.aidl.DefaultFinishEvent;

/* renamed from: anetwork.channel.unified.n */
/* loaded from: classes.dex */
class RunnableC1013n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1010k f5695a;

    RunnableC1013n(C1010k c1010k) {
        this.f5695a = c1010k;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5695a.f5688a.f5685d.compareAndSet(false, true)) {
            RequestStatistic requestStatistic = this.f5695a.f5688a.f5682a.f5626b;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_TIME_OUT;
                requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_TIME_OUT);
                requestStatistic.rspEnd = System.currentTimeMillis();
                ALog.m4638e("anet.UnifiedRequestTask", "task time out", this.f5695a.f5688a.f5684c, "rs", requestStatistic);
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_TIME_OUT, null, requestStatistic, null));
            }
            this.f5695a.f5688a.m4758b();
            this.f5695a.f5688a.f5683b.onFinish(new DefaultFinishEvent(ErrorConstant.ERROR_REQUEST_TIME_OUT, (String) null, this.f5695a.f5688a.f5682a.m4724a()));
        }
    }
}
