package anet.channel.session;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.entity.C5012a;
import anet.channel.entity.C5013b;
import anet.channel.entity.ConnType;
import anet.channel.request.C5034b;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.utils.C5076c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C5085c;
import anet.channel.util.C5090h;
import anet.channel.util.C5092j;
import anet.channel.util.ErrorConstant;
import anet.channel.util.Utils;
import com.taobao.accs.common.Constants;
import javax.net.ssl.SSLSocketFactory;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: anet.channel.session.d */
/* loaded from: classes3.dex */
public class C5044d extends Session {

    /* renamed from: w */
    private SSLSocketFactory f2572w;

    public C5044d(Context context, C5012a c5012a) {
        super(context, c5012a);
        if (this.f2278k == null) {
            String str = this.f2270c;
            this.f2277j = (str == null || !str.startsWith("https")) ? ConnType.HTTP : ConnType.HTTPS;
        } else if (AwcnConfig.isHttpsSniEnable() && this.f2277j.equals(ConnType.HTTPS)) {
            this.f2572w = new C5092j(this.f2271d);
        }
    }

    @Override // anet.channel.Session
    public void close() {
        notifyStatus(6, null);
    }

    @Override // anet.channel.Session
    public void connect() {
        try {
            IConnStrategy iConnStrategy = this.f2278k;
            if (iConnStrategy != null && iConnStrategy.getIpSource() == 1) {
                notifyStatus(4, new C5013b(1));
                return;
            }
            Request.Builder redirectEnable = new Request.Builder().setUrl(this.f2270c).setSeq(this.f2283p).setConnectTimeout((int) (this.f2285r * Utils.getNetworkTimeFactor())).setReadTimeout((int) (this.f2286s * Utils.getNetworkTimeFactor())).setRedirectEnable(false);
            SSLSocketFactory sSLSocketFactory = this.f2572w;
            if (sSLSocketFactory != null) {
                redirectEnable.setSslSocketFactory(sSLSocketFactory);
            }
            if (this.f2280m) {
                redirectEnable.addHeader("Host", this.f2272e);
            }
            if (C5085c.m2537a() && C5076c.m2521a(this.f2272e)) {
                try {
                    this.f2273f = C5085c.m2535a(this.f2272e);
                } catch (Exception unused) {
                }
            }
            ALog.m2530i("awcn.HttpSession", "HttpSession connect", null, Constants.KEY_HOST, this.f2270c, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f2273f, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(this.f2274g));
            Request requestBuild = redirectEnable.build();
            requestBuild.setDnsOptimize(this.f2273f, this.f2274g);
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC5045e(this, requestBuild), ThreadPoolExecutorFactory.Priority.LOW);
        } catch (Throwable th) {
            ALog.m2528e("awcn.HttpSession", "HTTP connect fail.", null, th, new Object[0]);
        }
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return null;
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        return this.f2281n == 4;
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) {
        C5034b c5034b = C5034b.NULL;
        Request.Builder builderNewBuilder = null;
        RequestStatistic requestStatistic = request != null ? request.f2501a : new RequestStatistic(this.f2271d, null);
        requestStatistic.setConnType(this.f2277j);
        if (requestStatistic.start == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = jCurrentTimeMillis;
            requestStatistic.start = jCurrentTimeMillis;
        }
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return c5034b;
        }
        try {
            if (request.getSslSocketFactory() == null && this.f2572w != null) {
                builderNewBuilder = request.newBuilder().setSslSocketFactory(this.f2572w);
            }
            if (this.f2280m) {
                if (builderNewBuilder == null) {
                    builderNewBuilder = request.newBuilder();
                }
                builderNewBuilder.addHeader("Host", this.f2272e);
            }
            if (builderNewBuilder != null) {
                request = builderNewBuilder.build();
            }
            if (this.f2273f == null) {
                String strHost = request.getHttpUrl().host();
                if (C5085c.m2537a() && C5076c.m2521a(strHost)) {
                    try {
                        this.f2273f = C5085c.m2535a(strHost);
                    } catch (Exception unused) {
                    }
                }
            }
            request.setDnsOptimize(this.f2273f, this.f2274g);
            request.setUrlScheme(this.f2277j.isSSL());
            IConnStrategy iConnStrategy = this.f2278k;
            if (iConnStrategy != null) {
                request.f2501a.setIpInfo(iConnStrategy.getIpSource(), this.f2278k.getIpType());
            } else {
                request.f2501a.setIpInfo(1, 1);
            }
            request.f2501a.unit = this.f2279l;
            return new C5034b(ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC5046f(this, request, requestCb, requestStatistic), C5090h.m2553a(request)), request.getSeq());
        } catch (Throwable th) {
            requestCb.onFinish(-101, ErrorConstant.formatMsg(-101, th.toString()), requestStatistic);
            return c5034b;
        }
    }

    @Override // anet.channel.Session
    public void close(boolean z10) {
        this.f2287t = false;
        close();
    }
}
