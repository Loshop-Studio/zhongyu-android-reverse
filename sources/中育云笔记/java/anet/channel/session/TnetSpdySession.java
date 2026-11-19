package anet.channel.session;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.DataFrameCb;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C4983a;
import anet.channel.entity.C5012a;
import anet.channel.entity.C5013b;
import anet.channel.entity.ConnType;
import anet.channel.heartbeat.HeartbeatManager;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.heartbeat.RunnableC5022c;
import anet.channel.request.C5035c;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.security.ISecurity;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.SessionMonitor;
import anet.channel.statist.SessionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C5076c;
import anet.channel.util.ALog;
import anet.channel.util.C5085c;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.Utils;
import anetwork.channel.util.RequestConstant;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;
import com.tendcloud.tenddata.C7863av;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.android.spdy.RequestPriority;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyDataProvider;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdyRequest;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;
import org.json.JSONException;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes3.dex */
public class TnetSpdySession extends Session implements SessionCb {

    /* renamed from: A */
    protected long f2548A;

    /* renamed from: B */
    protected int f2549B;

    /* renamed from: C */
    protected DataFrameCb f2550C;

    /* renamed from: D */
    protected IHeartbeat f2551D;

    /* renamed from: E */
    protected IAuth f2552E;

    /* renamed from: F */
    protected String f2553F;

    /* renamed from: G */
    protected ISecurity f2554G;

    /* renamed from: H */
    private int f2555H;

    /* renamed from: I */
    private boolean f2556I;

    /* renamed from: w */
    protected SpdyAgent f2557w;

    /* renamed from: x */
    protected SpdySession f2558x;

    /* renamed from: y */
    protected volatile boolean f2559y;

    /* renamed from: z */
    protected long f2560z;

    /* renamed from: anet.channel.session.TnetSpdySession$a */
    public class C5040a extends C5041a {

        /* renamed from: b */
        private Request f2562b;

        /* renamed from: c */
        private RequestCb f2563c;

        /* renamed from: d */
        private int f2564d = 0;

        /* renamed from: e */
        private long f2565e = 0;

        public C5040a(Request request, RequestCb requestCb) {
            this.f2562b = request;
            this.f2563c = requestCb;
        }

        /* renamed from: a */
        private void m2429a(SuperviseData superviseData, int i10, String str) {
            try {
                this.f2562b.f2501a.rspEnd = System.currentTimeMillis();
                if (this.f2562b.f2501a.isDone.get()) {
                    return;
                }
                if (i10 > 0) {
                    this.f2562b.f2501a.ret = 1;
                }
                this.f2562b.f2501a.statusCode = i10;
                this.f2562b.f2501a.msg = str;
                if (superviseData != null) {
                    this.f2562b.f2501a.rspEnd = superviseData.responseEnd;
                    this.f2562b.f2501a.sendBeforeTime = superviseData.sendStart - superviseData.requestStart;
                    RequestStatistic requestStatistic = this.f2562b.f2501a;
                    requestStatistic.sendDataTime = superviseData.sendEnd - requestStatistic.sendStart;
                    this.f2562b.f2501a.firstDataTime = superviseData.responseStart - superviseData.sendEnd;
                    this.f2562b.f2501a.recDataTime = superviseData.responseEnd - superviseData.responseStart;
                    this.f2562b.f2501a.sendDataSize = superviseData.bodySize + superviseData.compressSize;
                    this.f2562b.f2501a.recDataSize = this.f2565e + superviseData.recvUncompressSize;
                    this.f2562b.f2501a.reqHeadInflateSize = superviseData.uncompressSize;
                    this.f2562b.f2501a.reqHeadDeflateSize = superviseData.compressSize;
                    this.f2562b.f2501a.reqBodyInflateSize = superviseData.bodySize;
                    this.f2562b.f2501a.reqBodyDeflateSize = superviseData.bodySize;
                    this.f2562b.f2501a.rspHeadDeflateSize = superviseData.recvCompressSize;
                    this.f2562b.f2501a.rspHeadInflateSize = superviseData.recvUncompressSize;
                    this.f2562b.f2501a.rspBodyDeflateSize = superviseData.recvBodySize;
                    this.f2562b.f2501a.rspBodyInflateSize = this.f2565e;
                    if (this.f2562b.f2501a.contentLength == 0) {
                        this.f2562b.f2501a.contentLength = superviseData.originContentLength;
                    }
                    SessionStatistic sessionStatistic = TnetSpdySession.this.f2284q;
                    sessionStatistic.recvSizeCount += superviseData.recvBodySize + superviseData.recvCompressSize;
                    sessionStatistic.sendSizeCount += superviseData.bodySize + superviseData.compressSize;
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.session.C5041a, org.android.spdy.Spdycb
        public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, Object obj) {
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.TnetSpdySession", "spdyDataChunkRecvCB", this.f2562b.getSeq(), "len", Integer.valueOf(spdyByteArray.getDataLength()), "fin", Boolean.valueOf(z10));
            }
            this.f2565e += spdyByteArray.getDataLength();
            this.f2562b.f2501a.recDataSize += spdyByteArray.getDataLength();
            IHeartbeat iHeartbeat = TnetSpdySession.this.f2551D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
            if (this.f2563c != null) {
                ByteArray byteArrayM2276a = C4983a.a.f2350a.m2276a(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                spdyByteArray.recycle();
                this.f2563c.onDataReceive(byteArrayM2276a, z10);
            }
            TnetSpdySession.this.handleCallbacks(32, null);
        }

        @Override // anet.channel.session.C5041a, org.android.spdy.Spdycb
        public void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, Object obj) {
            this.f2562b.f2501a.firstDataTime = System.currentTimeMillis() - this.f2562b.f2501a.sendStart;
            this.f2564d = HttpHelper.parseStatusCode(map);
            TnetSpdySession.this.f2555H = 0;
            ALog.m2530i("awcn.TnetSpdySession", "", this.f2562b.getSeq(), HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(this.f2564d));
            ALog.m2530i("awcn.TnetSpdySession", "", this.f2562b.getSeq(), "response headers", map);
            RequestCb requestCb = this.f2563c;
            if (requestCb != null) {
                requestCb.onResponseCode(this.f2564d, HttpHelper.cloneMap(map));
            }
            TnetSpdySession.this.handleCallbacks(16, null);
            this.f2562b.f2501a.contentEncoding = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Encoding");
            this.f2562b.f2501a.contentType = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Type");
            this.f2562b.f2501a.contentLength = HttpHelper.parseContentLength(map);
            this.f2562b.f2501a.serverRT = HttpHelper.parseServerRT(map);
            TnetSpdySession.this.handleResponseCode(this.f2562b, this.f2564d);
            TnetSpdySession.this.handleResponseHeaders(this.f2562b, map);
            IHeartbeat iHeartbeat = TnetSpdySession.this.f2551D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
        }

        @Override // anet.channel.session.C5041a, org.android.spdy.Spdycb
        public void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, Object obj, SuperviseData superviseData) {
            String msg;
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.TnetSpdySession", "spdyStreamCloseCallback", this.f2562b.getSeq(), "streamId", Long.valueOf(j10), Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
            }
            if (i10 != 0) {
                this.f2564d = ErrorConstant.ERROR_TNET_REQUEST_FAIL;
                msg = ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_REQUEST_FAIL, String.valueOf(i10));
                if (i10 != -2005) {
                    AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_TNET_EXCEPTION, msg, this.f2562b.f2501a, null));
                }
                ALog.m2529e("awcn.TnetSpdySession", "spdyStreamCloseCallback error", this.f2562b.getSeq(), "session", TnetSpdySession.this.f2283p, "status code", Integer.valueOf(i10), "URL", this.f2562b.getHttpUrl().simpleUrlString());
            } else {
                msg = HttpConstant.SUCCESS;
            }
            this.f2562b.f2501a.tnetErrorCode = i10;
            m2429a(superviseData, this.f2564d, msg);
            RequestCb requestCb = this.f2563c;
            if (requestCb != null) {
                requestCb.onFinish(this.f2564d, msg, this.f2562b.f2501a);
            }
            if (i10 == -2004) {
                if (!TnetSpdySession.this.f2559y) {
                    TnetSpdySession.this.ping(true);
                }
                if (TnetSpdySession.m2424e(TnetSpdySession.this) >= 2) {
                    ConnEvent connEvent = new ConnEvent();
                    connEvent.isSuccess = false;
                    connEvent.isAccs = TnetSpdySession.this.f2556I;
                    StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.this.f2271d, TnetSpdySession.this.f2278k, connEvent);
                    TnetSpdySession.this.close(true);
                }
            }
        }
    }

    public TnetSpdySession(Context context, C5012a c5012a) {
        super(context, c5012a);
        this.f2559y = false;
        this.f2548A = 0L;
        this.f2555H = 0;
        this.f2549B = -1;
        this.f2550C = null;
        this.f2551D = null;
        this.f2552E = null;
        this.f2553F = null;
        this.f2554G = null;
        this.f2556I = false;
    }

    /* renamed from: e */
    public static /* synthetic */ int m2424e(TnetSpdySession tnetSpdySession) {
        int i10 = tnetSpdySession.f2555H + 1;
        tnetSpdySession.f2555H = i10;
        return i10;
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i10) {
    }

    @Override // anet.channel.Session
    public void close() {
        ALog.m2529e("awcn.TnetSpdySession", "force close!", this.f2283p, "session", this);
        notifyStatus(7, null);
        try {
            IHeartbeat iHeartbeat = this.f2551D;
            if (iHeartbeat != null) {
                iHeartbeat.stop();
                this.f2551D = null;
            }
            SpdySession spdySession = this.f2558x;
            if (spdySession != null) {
                spdySession.closeSession();
            }
        } catch (Exception unused) {
        }
    }

    @Override // anet.channel.Session
    public void connect() {
        int xquicCongControl;
        int i10 = this.f2281n;
        if (i10 == 1 || i10 == 0 || i10 == 4) {
            return;
        }
        try {
            if (this.f2557w == null) {
                m2420c();
            }
            if (C5085c.m2537a() && C5076c.m2521a(this.f2272e)) {
                try {
                    this.f2273f = C5085c.m2535a(this.f2272e);
                } catch (Exception unused) {
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis());
            ALog.m2529e("awcn.TnetSpdySession", BaseMonitor.ALARM_POINT_CONNECT, this.f2283p, Constants.KEY_HOST, this.f2270c, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f2273f, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(this.f2274g), "sessionId", strValueOf, "SpdyProtocol,", this.f2277j, "proxyIp,", this.f2275h, "proxyPort,", Integer.valueOf(this.f2276i));
            SessionInfo sessionInfo = new SessionInfo(this.f2273f, this.f2274g, this.f2270c + BundleUtil.UNDERLINE_TAG + this.f2553F, this.f2275h, this.f2276i, strValueOf, this, this.f2277j.getTnetConType());
            sessionInfo.setConnectionTimeoutMs((int) (((float) this.f2285r) * Utils.getNetworkTimeFactor()));
            if (this.f2277j.isPublicKeyAuto() || this.f2277j.isH2S() || this.f2277j.isHTTP3()) {
                sessionInfo.setCertHost(this.f2280m ? this.f2272e : this.f2271d);
            } else {
                int i11 = this.f2549B;
                if (i11 >= 0) {
                    sessionInfo.setPubKeySeqNum(i11);
                } else {
                    ConnType connType = this.f2277j;
                    ISecurity iSecurity = this.f2554G;
                    int tnetPublicKey = connType.getTnetPublicKey(iSecurity != null ? iSecurity.isSecOff() : true);
                    this.f2549B = tnetPublicKey;
                    sessionInfo.setPubKeySeqNum(tnetPublicKey);
                }
            }
            if (this.f2277j.isHTTP3() && (xquicCongControl = AwcnConfig.getXquicCongControl()) >= 0) {
                sessionInfo.setXquicCongControl(xquicCongControl);
            }
            SpdySession spdySessionCreateSession = this.f2557w.createSession(sessionInfo);
            this.f2558x = spdySessionCreateSession;
            if (spdySessionCreateSession.getRefCount() > 1) {
                ALog.m2529e("awcn.TnetSpdySession", "get session ref count > 1!!!", this.f2283p, new Object[0]);
                notifyStatus(0, new C5013b(1));
                m2428b();
                return;
            }
            notifyStatus(1, null);
            this.f2560z = System.currentTimeMillis();
            this.f2284q.isProxy = !TextUtils.isEmpty(this.f2275h) ? 1 : 0;
            SessionStatistic sessionStatistic = this.f2284q;
            sessionStatistic.isTunnel = RequestConstant.FALSE;
            sessionStatistic.isBackground = GlobalAppRuntimeInfo.isAppBackground();
            this.f2548A = 0L;
        } catch (Throwable th) {
            notifyStatus(2, null);
            ALog.m2528e("awcn.TnetSpdySession", "connect exception ", this.f2283p, th, new Object[0]);
        }
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return new RunnableC5048h(this);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            ALog.m2530i("awcn.TnetSpdySession", "get sslticket host is null", null, new Object[0]);
            return null;
        }
        try {
            ISecurity iSecurity = this.f2554G;
            if (iSecurity == null) {
                return null;
            }
            return iSecurity.getBytes(this.f2268a, "accs_ssl_key2_" + domain);
        } catch (Throwable th) {
            ALog.m2528e("awcn.TnetSpdySession", "getSSLMeta", null, th, new Object[0]);
            return null;
        }
    }

    public void initConfig(Config config) {
        if (config != null) {
            this.f2553F = config.getAppkey();
            this.f2554G = config.getSecurity();
        }
    }

    public void initSessionInfo(anet.channel.SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            this.f2550C = sessionInfo.dataFrameCb;
            this.f2552E = sessionInfo.auth;
            if (sessionInfo.isKeepAlive) {
                this.f2284q.isKL = 1L;
                this.f2287t = true;
                IHeartbeat iHeartbeat = sessionInfo.heartbeat;
                this.f2551D = iHeartbeat;
                boolean z10 = sessionInfo.isAccs;
                this.f2556I = z10;
                if (iHeartbeat == null) {
                    if (!z10 || AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                        this.f2551D = HeartbeatManager.getDefaultHeartbeat();
                    } else {
                        this.f2551D = HeartbeatManager.getDefaultBackgroundAccsHeartbeat();
                    }
                }
            }
        }
        if (AwcnConfig.isIdleSessionCloseEnable() && this.f2551D == null) {
            this.f2551D = new RunnableC5022c();
        }
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        return this.f2281n == 4;
    }

    @Override // anet.channel.Session
    public void onDisconnect() {
        this.f2559y = false;
    }

    @Override // anet.channel.Session
    public void ping(boolean z10) {
        ping(z10, this.f2286s);
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        String domain = spdySession.getDomain();
        if (!TextUtils.isEmpty(domain)) {
            try {
                ISecurity iSecurity = this.f2554G;
                if (iSecurity != null) {
                    Context context = this.f2268a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("accs_ssl_key2_");
                    sb2.append(domain);
                    return iSecurity.saveBytes(context, sb2.toString(), bArr) ? 0 : -1;
                }
            } catch (Throwable th) {
                ALog.m2528e("awcn.TnetSpdySession", "putSSLMeta", null, th, new Object[0]);
                return -1;
            }
        }
        return -1;
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) throws JSONException {
        int i10;
        String str;
        SpdyRequest spdyRequest;
        C5035c c5035c = C5035c.NULL;
        RequestStatistic requestStatistic = request != null ? request.f2501a : new RequestStatistic(this.f2271d, null);
        requestStatistic.setConnType(this.f2277j);
        if (requestStatistic.start == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = jCurrentTimeMillis;
            requestStatistic.start = jCurrentTimeMillis;
        }
        requestStatistic.setIPAndPort(this.f2273f, this.f2274g);
        requestStatistic.ipRefer = this.f2278k.getIpSource();
        requestStatistic.ipType = this.f2278k.getIpType();
        requestStatistic.unit = this.f2279l;
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return c5035c;
        }
        try {
            if (this.f2558x == null || !((i10 = this.f2281n) == 0 || i10 == 4)) {
                requestCb.onFinish(ErrorConstant.ERROR_SESSION_INVALID, ErrorConstant.getErrMsg(ErrorConstant.ERROR_SESSION_INVALID), request.f2501a);
                return c5035c;
            }
            if (this.f2280m) {
                request.setDnsOptimize(this.f2272e, this.f2274g);
            }
            request.setUrlScheme(this.f2277j.isSSL());
            URL url = request.getUrl();
            if (ALog.isPrintLog(2)) {
                ALog.m2530i("awcn.TnetSpdySession", "", request.getSeq(), "request URL", url.toString());
                ALog.m2530i("awcn.TnetSpdySession", "", request.getSeq(), "request Method", request.getMethod());
                ALog.m2530i("awcn.TnetSpdySession", "", request.getSeq(), "request headers", request.getHeaders());
            }
            if (TextUtils.isEmpty(this.f2275h) || this.f2276i <= 0) {
                str = "";
                spdyRequest = new SpdyRequest(url, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout());
            } else {
                str = "";
                spdyRequest = new SpdyRequest(url, url.getHost(), url.getPort(), this.f2275h, this.f2276i, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout(), 0);
            }
            spdyRequest.setRequestRdTimeoutMs(request.getReadTimeout());
            Map<String, String> headers = request.getHeaders();
            if (headers.containsKey("Host")) {
                HashMap map = new HashMap(request.getHeaders());
                String strRemove = map.remove("Host");
                if (this.f2280m) {
                    strRemove = this.f2272e;
                }
                map.put(":host", strRemove);
                spdyRequest.addHeaders(map);
            } else {
                spdyRequest.addHeaders(headers);
                spdyRequest.addHeader(":host", this.f2280m ? this.f2272e : request.getHost());
            }
            SpdyDataProvider spdyDataProvider = new SpdyDataProvider(request.getBodyBytes());
            request.f2501a.sendStart = System.currentTimeMillis();
            RequestStatistic requestStatistic2 = request.f2501a;
            requestStatistic2.processTime = requestStatistic2.sendStart - request.f2501a.start;
            int iSubmitRequest = this.f2558x.submitRequest(spdyRequest, spdyDataProvider, this, new C5040a(request, requestCb));
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.TnetSpdySession", str, request.getSeq(), "streamId", Integer.valueOf(iSubmitRequest));
            }
            C5035c c5035c2 = new C5035c(this.f2558x, iSubmitRequest, request.getSeq());
            try {
                SessionStatistic sessionStatistic = this.f2284q;
                sessionStatistic.requestCount++;
                sessionStatistic.stdRCount++;
                this.f2560z = System.currentTimeMillis();
                IHeartbeat iHeartbeat = this.f2551D;
                if (iHeartbeat == null) {
                    return c5035c2;
                }
                iHeartbeat.reSchedule();
                return c5035c2;
            } catch (SpdyErrorException e10) {
                e = e10;
                c5035c = c5035c2;
                if (e.SpdyErrorGetCode() == -1104 || e.SpdyErrorGetCode() == -1103) {
                    ALog.m2529e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f2283p, new Object[0]);
                    notifyStatus(6, new C5013b(2));
                }
                requestCb.onFinish(ErrorConstant.ERROR_TNET_EXCEPTION, ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_EXCEPTION, String.valueOf(e.SpdyErrorGetCode())), requestStatistic);
                return c5035c;
            } catch (Exception unused) {
                c5035c = c5035c2;
                requestCb.onFinish(-101, ErrorConstant.getErrMsg(-101), requestStatistic);
                return c5035c;
            }
        } catch (SpdyErrorException e11) {
            e = e11;
        } catch (Exception unused2) {
        }
    }

    @Override // anet.channel.Session
    public void sendCustomFrame(int i10, byte[] bArr, int i11) {
        SpdySession spdySession;
        try {
            if (this.f2550C == null) {
                return;
            }
            ALog.m2529e("awcn.TnetSpdySession", "sendCustomFrame", this.f2283p, Constants.KEY_DATA_ID, Integer.valueOf(i10), "type", Integer.valueOf(i11));
            if (this.f2281n != 4 || (spdySession = this.f2558x) == null) {
                ALog.m2529e("awcn.TnetSpdySession", "sendCustomFrame", this.f2283p, "sendCustomFrame con invalid mStatus:" + this.f2281n);
                m2412a(i10, ErrorConstant.ERROR_SESSION_INVALID, true, "session invalid");
                return;
            }
            if (bArr != null && bArr.length > 16384) {
                m2412a(i10, ErrorConstant.ERROR_DATA_TOO_LARGE, false, null);
                return;
            }
            spdySession.sendCustomControlFrame(i10, i11, 0, bArr == null ? 0 : bArr.length, bArr);
            SessionStatistic sessionStatistic = this.f2284q;
            sessionStatistic.requestCount++;
            sessionStatistic.cfRCount++;
            this.f2560z = System.currentTimeMillis();
            IHeartbeat iHeartbeat = this.f2551D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
        } catch (SpdyErrorException e10) {
            ALog.m2528e("awcn.TnetSpdySession", "sendCustomFrame error", this.f2283p, e10, new Object[0]);
            m2412a(i10, ErrorConstant.ERROR_TNET_EXCEPTION, true, "SpdyErrorException: " + e10.toString());
        } catch (Exception e11) {
            ALog.m2528e("awcn.TnetSpdySession", "sendCustomFrame error", this.f2283p, e11, new Object[0]);
            m2412a(i10, -101, true, e11.toString());
        }
    }

    public void setTnetPublicKey(int i10) {
        this.f2549B = i10;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11) {
        ALog.m2529e("awcn.TnetSpdySession", "spdyCustomControlFrameFailCallback", this.f2283p, Constants.KEY_DATA_ID, Integer.valueOf(i10));
        m2412a(i10, i11, true, "tnet error");
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr) {
        ALog.m2529e("awcn.TnetSpdySession", "[spdyCustomControlFrameRecvCallback]", this.f2283p, "len", Integer.valueOf(i13), "frameCb", this.f2550C);
        if (ALog.isPrintLog(1) && i13 < 512) {
            String str = "";
            for (byte b10 : bArr) {
                str = str + Integer.toHexString(b10 & C7863av.f14384i) + " ";
            }
            ALog.m2529e("awcn.TnetSpdySession", null, this.f2283p, "str", str);
        }
        DataFrameCb dataFrameCb = this.f2550C;
        if (dataFrameCb != null) {
            dataFrameCb.onDataReceive(this, bArr, i10, i11);
        } else {
            ALog.m2529e("awcn.TnetSpdySession", "AccsFrameCb is null", this.f2283p, new Object[0]);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-105, null, "rt"));
        }
        this.f2284q.inceptCount++;
        IHeartbeat iHeartbeat = this.f2551D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j10, Object obj) {
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("awcn.TnetSpdySession", "ping receive", this.f2283p, "Host", this.f2270c, AgooConstants.MESSAGE_ID, Long.valueOf(j10));
        }
        if (j10 < 0) {
            return;
        }
        this.f2559y = false;
        this.f2555H = 0;
        IHeartbeat iHeartbeat = this.f2551D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
        handleCallbacks(128, null);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10) {
        ALog.m2529e("awcn.TnetSpdySession", "spdySessionCloseCallback", this.f2283p, " errorCode:", Integer.valueOf(i10));
        IHeartbeat iHeartbeat = this.f2551D;
        if (iHeartbeat != null) {
            iHeartbeat.stop();
            this.f2551D = null;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.m2528e("awcn.TnetSpdySession", "session clean up failed!", null, e10, new Object[0]);
            }
        }
        if (i10 == -3516) {
            ConnEvent connEvent = new ConnEvent();
            connEvent.isSuccess = false;
            StrategyCenter.getInstance().notifyConnEvent(this.f2271d, this.f2278k, connEvent);
        }
        notifyStatus(6, new C5013b(2));
        if (superviseConnectInfo != null) {
            SessionStatistic sessionStatistic = this.f2284q;
            sessionStatistic.requestCount = superviseConnectInfo.reused_counter;
            sessionStatistic.liveTime = superviseConnectInfo.keepalive_period_second;
            try {
                if (this.f2277j.isHTTP3()) {
                    if (spdySession != null) {
                        ALog.m2529e("awcn.TnetSpdySession", "[HTTP3 spdySessionCloseCallback]", this.f2283p, "connectInfo", spdySession.getConnectInfoOnDisConnected());
                    }
                    this.f2284q.xqc0RttStatus = superviseConnectInfo.xqc0RttStatus;
                    this.f2284q.retransmissionRate = superviseConnectInfo.retransmissionRate;
                    this.f2284q.lossRate = superviseConnectInfo.lossRate;
                    this.f2284q.tlpCount = superviseConnectInfo.tlpCount;
                    this.f2284q.rtoCount = superviseConnectInfo.rtoCount;
                    this.f2284q.srtt = superviseConnectInfo.srtt;
                }
            } catch (Exception unused) {
            }
        }
        SessionStatistic sessionStatistic2 = this.f2284q;
        if (sessionStatistic2.errorCode == 0) {
            sessionStatistic2.errorCode = i10;
        }
        sessionStatistic2.lastPingInterval = (int) (System.currentTimeMillis() - this.f2560z);
        AppMonitor.getInstance().commitStat(this.f2284q);
        if (C5076c.m2522b(this.f2284q.f2589ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f2284q));
        }
        AppMonitor.getInstance().commitAlarm(this.f2284q.getAlarmObject());
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        SessionStatistic sessionStatistic = this.f2284q;
        sessionStatistic.connectionTime = superviseConnectInfo.connectTime;
        sessionStatistic.sslTime = superviseConnectInfo.handshakeTime;
        sessionStatistic.sslCalTime = superviseConnectInfo.doHandshakeTime;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        this.f2548A = System.currentTimeMillis();
        notifyStatus(0, new C5013b(1));
        m2428b();
        ALog.m2529e("awcn.TnetSpdySession", "spdySessionConnectCB connect", this.f2283p, "connectTime", Integer.valueOf(superviseConnectInfo.connectTime), "sslTime", Integer.valueOf(superviseConnectInfo.handshakeTime));
        if (this.f2277j.isHTTP3()) {
            this.f2284q.scid = superviseConnectInfo.scid;
            this.f2284q.dcid = superviseConnectInfo.dcid;
            this.f2284q.congControlKind = superviseConnectInfo.congControlKind;
            ALog.m2529e("awcn.TnetSpdySession", "[HTTP3 spdySessionConnectCB]", this.f2283p, "connectInfo", spdySession.getConnectInfoOnConnected());
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i10, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.m2528e("awcn.TnetSpdySession", "[spdySessionFailedError]session clean up failed!", null, e10, new Object[0]);
            }
        }
        notifyStatus(2, new C5013b(256, i10, "tnet connect fail"));
        ALog.m2529e("awcn.TnetSpdySession", null, this.f2283p, " errorId:", Integer.valueOf(i10));
        SessionStatistic sessionStatistic = this.f2284q;
        sessionStatistic.errorCode = i10;
        sessionStatistic.ret = 0;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        AppMonitor.getInstance().commitStat(this.f2284q);
        if (C5076c.m2522b(this.f2284q.f2589ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f2284q));
        }
        AppMonitor.getInstance().commitAlarm(this.f2284q.getAlarmObject());
    }

    @Override // anet.channel.Session
    public void ping(boolean z10, int i10) {
        if (ALog.isPrintLog(1)) {
            ALog.m2527d("awcn.TnetSpdySession", "ping", this.f2283p, Constants.KEY_HOST, this.f2270c, "thread", Thread.currentThread().getName());
        }
        if (z10) {
            try {
                if (this.f2558x == null) {
                    SessionStatistic sessionStatistic = this.f2284q;
                    if (sessionStatistic != null) {
                        sessionStatistic.closeReason = "session null";
                    }
                    ALog.m2529e("awcn.TnetSpdySession", this.f2270c + " session null", this.f2283p, new Object[0]);
                    close();
                    return;
                }
                int i11 = this.f2281n;
                if (i11 == 0 || i11 == 4) {
                    handleCallbacks(64, null);
                    if (this.f2559y) {
                        return;
                    }
                    this.f2559y = true;
                    this.f2284q.ppkgCount++;
                    this.f2558x.submitPing();
                    if (ALog.isPrintLog(1)) {
                        ALog.m2527d("awcn.TnetSpdySession", this.f2270c + " submit ping ms:" + (System.currentTimeMillis() - this.f2560z) + " force:" + z10, this.f2283p, new Object[0]);
                    }
                    setPingTimeout(i10);
                    this.f2560z = System.currentTimeMillis();
                    IHeartbeat iHeartbeat = this.f2551D;
                    if (iHeartbeat != null) {
                        iHeartbeat.reSchedule();
                    }
                }
            } catch (SpdyErrorException e10) {
                if (e10.SpdyErrorGetCode() == -1104 || e10.SpdyErrorGetCode() == -1103) {
                    ALog.m2529e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f2283p, new Object[0]);
                    notifyStatus(6, new C5013b(2));
                }
                ALog.m2528e("awcn.TnetSpdySession", "ping", this.f2283p, e10, new Object[0]);
            } catch (Exception e11) {
                ALog.m2528e("awcn.TnetSpdySession", "ping", this.f2283p, e11, new Object[0]);
            }
        }
    }

    /* renamed from: c */
    private void m2420c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SpdyAgent.enableDebug = false;
        this.f2557w = SpdyAgent.getInstance(this.f2268a, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        ISecurity iSecurity = this.f2554G;
        if (iSecurity != null && !iSecurity.isSecOff()) {
            this.f2557w.setAccsSslCallback(new C5050j(this));
        }
        if (AwcnConfig.isTnetHeaderCacheEnable()) {
            return;
        }
        try {
            this.f2557w.getClass().getDeclaredMethod("disableHeaderCache", null).invoke(this.f2557w, null);
            ALog.m2530i("awcn.TnetSpdySession", "tnet disableHeaderCache", null, new Object[0]);
        } catch (Exception e10) {
            ALog.m2528e("awcn.TnetSpdySession", "tnet disableHeaderCache", null, e10, new Object[0]);
        }
    }

    /* renamed from: b */
    public void m2428b() {
        IAuth iAuth = this.f2552E;
        if (iAuth != null) {
            iAuth.auth(this, new C5049i(this));
            return;
        }
        notifyStatus(4, null);
        this.f2284q.ret = 1;
        IHeartbeat iHeartbeat = this.f2551D;
        if (iHeartbeat != null) {
            iHeartbeat.start(this);
        }
    }

    /* renamed from: a */
    private void m2412a(int i10, int i11, boolean z10, String str) {
        DataFrameCb dataFrameCb = this.f2550C;
        if (dataFrameCb != null) {
            dataFrameCb.onException(i10, i11, z10, str);
        }
    }
}
