package anet.channel.session;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.entity.C0889a;
import anet.channel.entity.C0890b;
import anet.channel.entity.ConnType;
import anet.channel.request.C0911b;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.utils.C0953c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0962c;
import anet.channel.util.C0967h;
import anet.channel.util.C0969j;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.Utils;
import com.taobao.accs.common.Constants;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: anet.channel.session.d */
/* loaded from: classes.dex */
public class C0921d extends Session {

    /* renamed from: w */
    private SSLSocketFactory f5294w;

    public C0921d(Context context, C0889a c0889a) {
        super(context, c0889a);
        if (this.f5000k == null) {
            String str = this.f4992c;
            this.f4999j = (str == null || !str.startsWith(HttpConstant.HTTPS)) ? ConnType.HTTP : ConnType.HTTPS;
        } else if (AwcnConfig.isHttpsSniEnable() && this.f4999j.equals(ConnType.HTTPS)) {
            this.f5294w = new C0969j(this.f4993d);
        }
    }

    @Override // anet.channel.Session
    public void close() {
        notifyStatus(6, null);
    }

    @Override // anet.channel.Session
    public void connect() {
        try {
            IConnStrategy iConnStrategy = this.f5000k;
            if (iConnStrategy != null && iConnStrategy.getIpSource() == 1) {
                notifyStatus(4, new C0890b(1));
                return;
            }
            Request.Builder redirectEnable = new Request.Builder().setUrl(this.f4992c).setSeq(this.f5005p).setConnectTimeout((int) (this.f5007r * Utils.getNetworkTimeFactor())).setReadTimeout((int) (this.f5008s * Utils.getNetworkTimeFactor())).setRedirectEnable(false);
            SSLSocketFactory sSLSocketFactory = this.f5294w;
            if (sSLSocketFactory != null) {
                redirectEnable.setSslSocketFactory(sSLSocketFactory);
            }
            if (this.f5002m) {
                redirectEnable.addHeader("Host", this.f4994e);
            }
            if (C0962c.m4646a() && C0953c.m4630a(this.f4994e)) {
                try {
                    this.f4995f = C0962c.m4644a(this.f4994e);
                } catch (Exception unused) {
                }
            }
            ALog.m4639i("awcn.HttpSession", "HttpSession connect", null, Constants.KEY_HOST, this.f4992c, "ip", this.f4995f, "port", Integer.valueOf(this.f4996g));
            Request requestBuild = redirectEnable.build();
            requestBuild.setDnsOptimize(this.f4995f, this.f4996g);
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0922e(this, requestBuild), ThreadPoolExecutorFactory.Priority.LOW);
        } catch (Throwable th) {
            ALog.m4637e("awcn.HttpSession", "HTTP connect fail.", null, th, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return null;
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        return this.f5003n == 4;
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) {
        C0911b c0911b = C0911b.NULL;
        Request.Builder builderNewBuilder = null;
        RequestStatistic requestStatistic = request != null ? request.f5223a : new RequestStatistic(this.f4993d, null);
        requestStatistic.setConnType(this.f4999j);
        if (requestStatistic.start == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = jCurrentTimeMillis;
            requestStatistic.start = jCurrentTimeMillis;
        }
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return c0911b;
        }
        try {
            if (request.getSslSocketFactory() == null && this.f5294w != null) {
                builderNewBuilder = request.newBuilder().setSslSocketFactory(this.f5294w);
            }
            if (this.f5002m) {
                if (builderNewBuilder == null) {
                    builderNewBuilder = request.newBuilder();
                }
                builderNewBuilder.addHeader("Host", this.f4994e);
            }
            if (builderNewBuilder != null) {
                request = builderNewBuilder.build();
            }
            if (this.f4995f == null) {
                String strHost = request.getHttpUrl().host();
                if (C0962c.m4646a() && C0953c.m4630a(strHost)) {
                    try {
                        this.f4995f = C0962c.m4644a(strHost);
                    } catch (Exception unused) {
                    }
                }
            }
            request.setDnsOptimize(this.f4995f, this.f4996g);
            request.setUrlScheme(this.f4999j.isSSL());
            IConnStrategy iConnStrategy = this.f5000k;
            if (iConnStrategy != null) {
                request.f5223a.setIpInfo(iConnStrategy.getIpSource(), this.f5000k.getIpType());
            } else {
                request.f5223a.setIpInfo(1, 1);
            }
            request.f5223a.unit = this.f5001l;
            return new C0911b(ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0923f(this, request, requestCb, requestStatistic), C0967h.m4662a(request)), request.getSeq());
        } catch (Throwable th) {
            requestCb.onFinish(-101, ErrorConstant.formatMsg(-101, th.toString()), requestStatistic);
            return c0911b;
        }
    }

    @Override // anet.channel.Session
    public void close(boolean z3) {
        this.f5009t = false;
        close();
    }
}
