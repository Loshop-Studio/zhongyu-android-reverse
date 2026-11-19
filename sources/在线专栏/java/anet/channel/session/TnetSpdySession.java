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
import anet.channel.bytes.C0860a;
import anet.channel.entity.C0889a;
import anet.channel.entity.C0890b;
import anet.channel.entity.ConnType;
import anet.channel.heartbeat.HeartbeatManager;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.heartbeat.RunnableC0899c;
import anet.channel.request.C0912c;
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
import anet.channel.strategy.utils.C0953c;
import anet.channel.util.ALog;
import anet.channel.util.C0962c;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.Utils;
import anetwork.channel.util.RequestConstant;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.C1896c;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

/* loaded from: classes.dex */
public class TnetSpdySession extends Session implements SessionCb {

    /* renamed from: A */
    protected long f5270A;

    /* renamed from: B */
    protected int f5271B;

    /* renamed from: C */
    protected DataFrameCb f5272C;

    /* renamed from: D */
    protected IHeartbeat f5273D;

    /* renamed from: E */
    protected IAuth f5274E;

    /* renamed from: F */
    protected String f5275F;

    /* renamed from: G */
    protected ISecurity f5276G;

    /* renamed from: H */
    private int f5277H;

    /* renamed from: I */
    private boolean f5278I;

    /* renamed from: w */
    protected SpdyAgent f5279w;

    /* renamed from: x */
    protected SpdySession f5280x;

    /* renamed from: y */
    protected volatile boolean f5281y;

    /* renamed from: z */
    protected long f5282z;

    /* renamed from: anet.channel.session.TnetSpdySession$a */
    private class C0917a extends C0918a {

        /* renamed from: b */
        private Request f5284b;

        /* renamed from: c */
        private RequestCb f5285c;

        /* renamed from: d */
        private int f5286d = 0;

        /* renamed from: e */
        private long f5287e = 0;

        public C0917a(Request request, RequestCb requestCb) {
            this.f5284b = request;
            this.f5285c = requestCb;
        }

        /* renamed from: a */
        private void m4538a(SuperviseData superviseData, int i4, String str) {
            try {
                this.f5284b.f5223a.rspEnd = System.currentTimeMillis();
                if (this.f5284b.f5223a.isDone.get()) {
                    return;
                }
                if (i4 > 0) {
                    this.f5284b.f5223a.ret = 1;
                }
                this.f5284b.f5223a.statusCode = i4;
                this.f5284b.f5223a.msg = str;
                if (superviseData != null) {
                    this.f5284b.f5223a.rspEnd = superviseData.responseEnd;
                    this.f5284b.f5223a.sendBeforeTime = superviseData.sendStart - superviseData.requestStart;
                    RequestStatistic requestStatistic = this.f5284b.f5223a;
                    requestStatistic.sendDataTime = superviseData.sendEnd - requestStatistic.sendStart;
                    this.f5284b.f5223a.firstDataTime = superviseData.responseStart - superviseData.sendEnd;
                    this.f5284b.f5223a.recDataTime = superviseData.responseEnd - superviseData.responseStart;
                    this.f5284b.f5223a.sendDataSize = superviseData.bodySize + superviseData.compressSize;
                    this.f5284b.f5223a.recDataSize = this.f5287e + superviseData.recvUncompressSize;
                    this.f5284b.f5223a.reqHeadInflateSize = superviseData.uncompressSize;
                    this.f5284b.f5223a.reqHeadDeflateSize = superviseData.compressSize;
                    this.f5284b.f5223a.reqBodyInflateSize = superviseData.bodySize;
                    this.f5284b.f5223a.reqBodyDeflateSize = superviseData.bodySize;
                    this.f5284b.f5223a.rspHeadDeflateSize = superviseData.recvCompressSize;
                    this.f5284b.f5223a.rspHeadInflateSize = superviseData.recvUncompressSize;
                    this.f5284b.f5223a.rspBodyDeflateSize = superviseData.recvBodySize;
                    this.f5284b.f5223a.rspBodyInflateSize = this.f5287e;
                    if (this.f5284b.f5223a.contentLength == 0) {
                        this.f5284b.f5223a.contentLength = superviseData.originContentLength;
                    }
                    SessionStatistic sessionStatistic = TnetSpdySession.this.f5006q;
                    sessionStatistic.recvSizeCount += superviseData.recvBodySize + superviseData.recvCompressSize;
                    sessionStatistic.sendSizeCount += superviseData.bodySize + superviseData.compressSize;
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.session.C0918a, org.android.spdy.Spdycb
        public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z3, long j4, SpdyByteArray spdyByteArray, Object obj) {
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.TnetSpdySession", "spdyDataChunkRecvCB", this.f5284b.getSeq(), "len", Integer.valueOf(spdyByteArray.getDataLength()), "fin", Boolean.valueOf(z3));
            }
            this.f5287e += spdyByteArray.getDataLength();
            this.f5284b.f5223a.recDataSize += spdyByteArray.getDataLength();
            IHeartbeat iHeartbeat = TnetSpdySession.this.f5273D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
            if (this.f5285c != null) {
                ByteArray byteArrayM4385a = C0860a.a.f5072a.m4385a(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                spdyByteArray.recycle();
                this.f5285c.onDataReceive(byteArrayM4385a, z3);
            }
            TnetSpdySession.this.handleCallbacks(32, null);
        }

        @Override // anet.channel.session.C0918a, org.android.spdy.Spdycb
        public void spdyOnStreamResponse(SpdySession spdySession, long j4, Map<String, List<String>> map, Object obj) {
            this.f5284b.f5223a.firstDataTime = System.currentTimeMillis() - this.f5284b.f5223a.sendStart;
            this.f5286d = HttpHelper.parseStatusCode(map);
            TnetSpdySession.this.f5277H = 0;
            ALog.m4639i("awcn.TnetSpdySession", "", this.f5284b.getSeq(), "statusCode", Integer.valueOf(this.f5286d));
            ALog.m4639i("awcn.TnetSpdySession", "", this.f5284b.getSeq(), "response headers", map);
            RequestCb requestCb = this.f5285c;
            if (requestCb != null) {
                requestCb.onResponseCode(this.f5286d, HttpHelper.cloneMap(map));
            }
            TnetSpdySession.this.handleCallbacks(16, null);
            this.f5284b.f5223a.contentEncoding = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Encoding");
            this.f5284b.f5223a.contentType = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Type");
            this.f5284b.f5223a.contentLength = HttpHelper.parseContentLength(map);
            this.f5284b.f5223a.serverRT = HttpHelper.parseServerRT(map);
            TnetSpdySession.this.handleResponseCode(this.f5284b, this.f5286d);
            TnetSpdySession.this.handleResponseHeaders(this.f5284b, map);
            IHeartbeat iHeartbeat = TnetSpdySession.this.f5273D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
        }

        @Override // anet.channel.session.C0918a, org.android.spdy.Spdycb
        public void spdyStreamCloseCallback(SpdySession spdySession, long j4, int i4, Object obj, SuperviseData superviseData) {
            String msg;
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.TnetSpdySession", "spdyStreamCloseCallback", this.f5284b.getSeq(), "streamId", Long.valueOf(j4), Constants.KEY_ERROR_CODE, Integer.valueOf(i4));
            }
            if (i4 != 0) {
                this.f5286d = ErrorConstant.ERROR_TNET_REQUEST_FAIL;
                msg = ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_REQUEST_FAIL, String.valueOf(i4));
                if (i4 != -2005) {
                    AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_TNET_EXCEPTION, msg, this.f5284b.f5223a, null));
                }
                ALog.m4638e("awcn.TnetSpdySession", "spdyStreamCloseCallback error", this.f5284b.getSeq(), C1896c.f8597aw, TnetSpdySession.this.f5005p, "status code", Integer.valueOf(i4), "URL", this.f5284b.getHttpUrl().simpleUrlString());
            } else {
                msg = HttpConstant.SUCCESS;
            }
            this.f5284b.f5223a.tnetErrorCode = i4;
            m4538a(superviseData, this.f5286d, msg);
            RequestCb requestCb = this.f5285c;
            if (requestCb != null) {
                requestCb.onFinish(this.f5286d, msg, this.f5284b.f5223a);
            }
            if (i4 == -2004) {
                if (!TnetSpdySession.this.f5281y) {
                    TnetSpdySession.this.ping(true);
                }
                if (TnetSpdySession.m4533e(TnetSpdySession.this) >= 2) {
                    ConnEvent connEvent = new ConnEvent();
                    connEvent.isSuccess = false;
                    connEvent.isAccs = TnetSpdySession.this.f5278I;
                    StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.this.f4993d, TnetSpdySession.this.f5000k, connEvent);
                    TnetSpdySession.this.close(true);
                }
            }
        }
    }

    public TnetSpdySession(Context context, C0889a c0889a) {
        super(context, c0889a);
        this.f5281y = false;
        this.f5270A = 0L;
        this.f5277H = 0;
        this.f5271B = -1;
        this.f5272C = null;
        this.f5273D = null;
        this.f5274E = null;
        this.f5275F = null;
        this.f5276G = null;
        this.f5278I = false;
    }

    /* renamed from: e */
    static /* synthetic */ int m4533e(TnetSpdySession tnetSpdySession) {
        int i4 = tnetSpdySession.f5277H + 1;
        tnetSpdySession.f5277H = i4;
        return i4;
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i4) {
    }

    @Override // anet.channel.Session
    public void close() {
        ALog.m4638e("awcn.TnetSpdySession", "force close!", this.f5005p, C1896c.f8597aw, this);
        notifyStatus(7, null);
        try {
            IHeartbeat iHeartbeat = this.f5273D;
            if (iHeartbeat != null) {
                iHeartbeat.stop();
                this.f5273D = null;
            }
            SpdySession spdySession = this.f5280x;
            if (spdySession != null) {
                spdySession.closeSession();
            }
        } catch (Exception unused) {
        }
    }

    @Override // anet.channel.Session
    public void connect() {
        int xquicCongControl;
        int i4 = this.f5003n;
        int i5 = 1;
        if (i4 == 1 || i4 == 0 || i4 == 4) {
            return;
        }
        try {
            if (this.f5279w == null) {
                m4529c();
            }
            if (C0962c.m4646a() && C0953c.m4630a(this.f4994e)) {
                try {
                    this.f4995f = C0962c.m4644a(this.f4994e);
                } catch (Exception unused) {
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis());
            ALog.m4638e("awcn.TnetSpdySession", BaseMonitor.ALARM_POINT_CONNECT, this.f5005p, Constants.KEY_HOST, this.f4992c, "ip", this.f4995f, "port", Integer.valueOf(this.f4996g), "sessionId", strValueOf, "SpdyProtocol,", this.f4999j, "proxyIp,", this.f4997h, "proxyPort,", Integer.valueOf(this.f4998i));
            SessionInfo sessionInfo = new SessionInfo(this.f4995f, this.f4996g, this.f4992c + "_" + this.f5275F, this.f4997h, this.f4998i, strValueOf, this, this.f4999j.getTnetConType());
            sessionInfo.setConnectionTimeoutMs((int) (((float) this.f5007r) * Utils.getNetworkTimeFactor()));
            if (this.f4999j.isPublicKeyAuto() || this.f4999j.isH2S() || this.f4999j.isHTTP3()) {
                sessionInfo.setCertHost(this.f5002m ? this.f4994e : this.f4993d);
            } else {
                int i6 = this.f5271B;
                if (i6 >= 0) {
                    sessionInfo.setPubKeySeqNum(i6);
                } else {
                    ConnType connType = this.f4999j;
                    ISecurity iSecurity = this.f5276G;
                    int tnetPublicKey = connType.getTnetPublicKey(iSecurity != null ? iSecurity.isSecOff() : true);
                    this.f5271B = tnetPublicKey;
                    sessionInfo.setPubKeySeqNum(tnetPublicKey);
                }
            }
            if (this.f4999j.isHTTP3() && (xquicCongControl = AwcnConfig.getXquicCongControl()) >= 0) {
                sessionInfo.setXquicCongControl(xquicCongControl);
            }
            SpdySession spdySessionCreateSession = this.f5279w.createSession(sessionInfo);
            this.f5280x = spdySessionCreateSession;
            if (spdySessionCreateSession.getRefCount() > 1) {
                ALog.m4638e("awcn.TnetSpdySession", "get session ref count > 1!!!", this.f5005p, new Object[0]);
                notifyStatus(0, new C0890b(1));
                m4537b();
                return;
            }
            notifyStatus(1, null);
            this.f5282z = System.currentTimeMillis();
            SessionStatistic sessionStatistic = this.f5006q;
            if (TextUtils.isEmpty(this.f4997h)) {
                i5 = 0;
            }
            sessionStatistic.isProxy = i5;
            SessionStatistic sessionStatistic2 = this.f5006q;
            sessionStatistic2.isTunnel = RequestConstant.FALSE;
            sessionStatistic2.isBackground = GlobalAppRuntimeInfo.isAppBackground();
            this.f5270A = 0L;
        } catch (Throwable th) {
            notifyStatus(2, null);
            ALog.m4637e("awcn.TnetSpdySession", "connect exception ", this.f5005p, th, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return new RunnableC0925h(this);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            ALog.m4639i("awcn.TnetSpdySession", "get sslticket host is null", null, new Object[0]);
            return null;
        }
        try {
            ISecurity iSecurity = this.f5276G;
            if (iSecurity == null) {
                return null;
            }
            return iSecurity.getBytes(this.f4990a, "accs_ssl_key2_" + domain);
        } catch (Throwable th) {
            ALog.m4637e("awcn.TnetSpdySession", "getSSLMeta", null, th, new Object[0]);
            return null;
        }
    }

    public void initConfig(Config config) {
        if (config != null) {
            this.f5275F = config.getAppkey();
            this.f5276G = config.getSecurity();
        }
    }

    public void initSessionInfo(anet.channel.SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            this.f5272C = sessionInfo.dataFrameCb;
            this.f5274E = sessionInfo.auth;
            if (sessionInfo.isKeepAlive) {
                this.f5006q.isKL = 1L;
                this.f5009t = true;
                IHeartbeat iHeartbeat = sessionInfo.heartbeat;
                this.f5273D = iHeartbeat;
                boolean z3 = sessionInfo.isAccs;
                this.f5278I = z3;
                if (iHeartbeat == null) {
                    if (!z3 || AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                        this.f5273D = HeartbeatManager.getDefaultHeartbeat();
                    } else {
                        this.f5273D = HeartbeatManager.getDefaultBackgroundAccsHeartbeat();
                    }
                }
            }
        }
        if (AwcnConfig.isIdleSessionCloseEnable() && this.f5273D == null) {
            this.f5273D = new RunnableC0899c();
        }
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        return this.f5003n == 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // anet.channel.Session
    public void onDisconnect() {
        this.f5281y = false;
    }

    @Override // anet.channel.Session
    public void ping(boolean z3) {
        ping(z3, this.f5008s);
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            return -1;
        }
        try {
            ISecurity iSecurity = this.f5276G;
            if (iSecurity == null) {
                return -1;
            }
            Context context = this.f4990a;
            StringBuilder sb = new StringBuilder();
            sb.append("accs_ssl_key2_");
            sb.append(domain);
            return iSecurity.saveBytes(context, sb.toString(), bArr) ? 0 : -1;
        } catch (Throwable th) {
            ALog.m4637e("awcn.TnetSpdySession", "putSSLMeta", null, th, new Object[0]);
            return -1;
        }
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) throws JSONException {
        int i4;
        String str;
        SpdyRequest spdyRequest;
        C0912c c0912c = C0912c.NULL;
        RequestStatistic requestStatistic = request != null ? request.f5223a : new RequestStatistic(this.f4993d, null);
        requestStatistic.setConnType(this.f4999j);
        if (requestStatistic.start == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = jCurrentTimeMillis;
            requestStatistic.start = jCurrentTimeMillis;
        }
        requestStatistic.setIPAndPort(this.f4995f, this.f4996g);
        requestStatistic.ipRefer = this.f5000k.getIpSource();
        requestStatistic.ipType = this.f5000k.getIpType();
        requestStatistic.unit = this.f5001l;
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return c0912c;
        }
        try {
            if (this.f5280x == null || !((i4 = this.f5003n) == 0 || i4 == 4)) {
                requestCb.onFinish(ErrorConstant.ERROR_SESSION_INVALID, ErrorConstant.getErrMsg(ErrorConstant.ERROR_SESSION_INVALID), request.f5223a);
                return c0912c;
            }
            if (this.f5002m) {
                request.setDnsOptimize(this.f4994e, this.f4996g);
            }
            request.setUrlScheme(this.f4999j.isSSL());
            URL url = request.getUrl();
            if (ALog.isPrintLog(2)) {
                ALog.m4639i("awcn.TnetSpdySession", "", request.getSeq(), "request URL", url.toString());
                ALog.m4639i("awcn.TnetSpdySession", "", request.getSeq(), "request Method", request.getMethod());
                ALog.m4639i("awcn.TnetSpdySession", "", request.getSeq(), "request headers", request.getHeaders());
            }
            if (TextUtils.isEmpty(this.f4997h) || this.f4998i <= 0) {
                str = "";
                spdyRequest = new SpdyRequest(url, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout());
            } else {
                str = "";
                spdyRequest = new SpdyRequest(url, url.getHost(), url.getPort(), this.f4997h, this.f4998i, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout(), 0);
            }
            spdyRequest.setRequestRdTimeoutMs(request.getReadTimeout());
            Map<String, String> headers = request.getHeaders();
            if (headers.containsKey("Host")) {
                HashMap map = new HashMap(request.getHeaders());
                String strRemove = map.remove("Host");
                if (this.f5002m) {
                    strRemove = this.f4994e;
                }
                map.put(":host", strRemove);
                spdyRequest.addHeaders(map);
            } else {
                spdyRequest.addHeaders(headers);
                spdyRequest.addHeader(":host", this.f5002m ? this.f4994e : request.getHost());
            }
            SpdyDataProvider spdyDataProvider = new SpdyDataProvider(request.getBodyBytes());
            request.f5223a.sendStart = System.currentTimeMillis();
            RequestStatistic requestStatistic2 = request.f5223a;
            requestStatistic2.processTime = requestStatistic2.sendStart - request.f5223a.start;
            int iSubmitRequest = this.f5280x.submitRequest(spdyRequest, spdyDataProvider, this, new C0917a(request, requestCb));
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.TnetSpdySession", str, request.getSeq(), "streamId", Integer.valueOf(iSubmitRequest));
            }
            C0912c c0912c2 = new C0912c(this.f5280x, iSubmitRequest, request.getSeq());
            try {
                SessionStatistic sessionStatistic = this.f5006q;
                sessionStatistic.requestCount++;
                sessionStatistic.stdRCount++;
                this.f5282z = System.currentTimeMillis();
                IHeartbeat iHeartbeat = this.f5273D;
                if (iHeartbeat != null) {
                    iHeartbeat.reSchedule();
                }
                return c0912c2;
            } catch (SpdyErrorException e4) {
                e = e4;
                c0912c = c0912c2;
                if (e.SpdyErrorGetCode() == -1104 || e.SpdyErrorGetCode() == -1103) {
                    ALog.m4638e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f5005p, new Object[0]);
                    notifyStatus(6, new C0890b(2));
                }
                requestCb.onFinish(ErrorConstant.ERROR_TNET_EXCEPTION, ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_EXCEPTION, String.valueOf(e.SpdyErrorGetCode())), requestStatistic);
                return c0912c;
            } catch (Exception unused) {
                c0912c = c0912c2;
                requestCb.onFinish(-101, ErrorConstant.getErrMsg(-101), requestStatistic);
                return c0912c;
            }
        } catch (SpdyErrorException e5) {
            e = e5;
        } catch (Exception unused2) {
        }
    }

    @Override // anet.channel.Session
    public void sendCustomFrame(int i4, byte[] bArr, int i5) {
        SpdySession spdySession;
        try {
            if (this.f5272C == null) {
                return;
            }
            ALog.m4638e("awcn.TnetSpdySession", "sendCustomFrame", this.f5005p, Constants.KEY_DATA_ID, Integer.valueOf(i4), "type", Integer.valueOf(i5));
            if (this.f5003n != 4 || (spdySession = this.f5280x) == null) {
                ALog.m4638e("awcn.TnetSpdySession", "sendCustomFrame", this.f5005p, "sendCustomFrame con invalid mStatus:" + this.f5003n);
                m4521a(i4, ErrorConstant.ERROR_SESSION_INVALID, true, "session invalid");
                return;
            }
            if (bArr != null && bArr.length > 16384) {
                m4521a(i4, ErrorConstant.ERROR_DATA_TOO_LARGE, false, null);
                return;
            }
            spdySession.sendCustomControlFrame(i4, i5, 0, bArr == null ? 0 : bArr.length, bArr);
            SessionStatistic sessionStatistic = this.f5006q;
            sessionStatistic.requestCount++;
            sessionStatistic.cfRCount++;
            this.f5282z = System.currentTimeMillis();
            IHeartbeat iHeartbeat = this.f5273D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
        } catch (SpdyErrorException e4) {
            ALog.m4637e("awcn.TnetSpdySession", "sendCustomFrame error", this.f5005p, e4, new Object[0]);
            m4521a(i4, ErrorConstant.ERROR_TNET_EXCEPTION, true, "SpdyErrorException: " + e4.toString());
        } catch (Exception e5) {
            ALog.m4637e("awcn.TnetSpdySession", "sendCustomFrame error", this.f5005p, e5, new Object[0]);
            m4521a(i4, -101, true, e5.toString());
        }
    }

    public void setTnetPublicKey(int i4) {
        this.f5271B = i4;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i4, int i5) {
        ALog.m4638e("awcn.TnetSpdySession", "spdyCustomControlFrameFailCallback", this.f5005p, Constants.KEY_DATA_ID, Integer.valueOf(i4));
        m4521a(i4, i5, true, "tnet error");
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i4, int i5, int i6, int i7, byte[] bArr) {
        ALog.m4638e("awcn.TnetSpdySession", "[spdyCustomControlFrameRecvCallback]", this.f5005p, "len", Integer.valueOf(i7), "frameCb", this.f5272C);
        if (ALog.isPrintLog(1) && i7 < 512) {
            String str = "";
            for (byte b4 : bArr) {
                str = str + Integer.toHexString(b4 & 255) + " ";
            }
            ALog.m4638e("awcn.TnetSpdySession", null, this.f5005p, "str", str);
        }
        DataFrameCb dataFrameCb = this.f5272C;
        if (dataFrameCb != null) {
            dataFrameCb.onDataReceive(this, bArr, i4, i5);
        } else {
            ALog.m4638e("awcn.TnetSpdySession", "AccsFrameCb is null", this.f5005p, new Object[0]);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-105, null, "rt"));
        }
        this.f5006q.inceptCount++;
        IHeartbeat iHeartbeat = this.f5273D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j4, Object obj) {
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("awcn.TnetSpdySession", "ping receive", this.f5005p, "Host", this.f4992c, "id", Long.valueOf(j4));
        }
        if (j4 < 0) {
            return;
        }
        this.f5281y = false;
        this.f5277H = 0;
        IHeartbeat iHeartbeat = this.f5273D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
        handleCallbacks(128, null);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i4) {
        ALog.m4638e("awcn.TnetSpdySession", "spdySessionCloseCallback", this.f5005p, " errorCode:", Integer.valueOf(i4));
        IHeartbeat iHeartbeat = this.f5273D;
        if (iHeartbeat != null) {
            iHeartbeat.stop();
            this.f5273D = null;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e4) {
                ALog.m4637e("awcn.TnetSpdySession", "session clean up failed!", null, e4, new Object[0]);
            }
        }
        if (i4 == -3516) {
            ConnEvent connEvent = new ConnEvent();
            connEvent.isSuccess = false;
            StrategyCenter.getInstance().notifyConnEvent(this.f4993d, this.f5000k, connEvent);
        }
        notifyStatus(6, new C0890b(2));
        if (superviseConnectInfo != null) {
            SessionStatistic sessionStatistic = this.f5006q;
            sessionStatistic.requestCount = superviseConnectInfo.reused_counter;
            sessionStatistic.liveTime = superviseConnectInfo.keepalive_period_second;
            try {
                if (this.f4999j.isHTTP3()) {
                    if (spdySession != null) {
                        ALog.m4638e("awcn.TnetSpdySession", "[HTTP3 spdySessionCloseCallback]", this.f5005p, "connectInfo", spdySession.getConnectInfoOnDisConnected());
                    }
                    this.f5006q.xqc0RttStatus = superviseConnectInfo.xqc0RttStatus;
                    this.f5006q.retransmissionRate = superviseConnectInfo.retransmissionRate;
                    this.f5006q.lossRate = superviseConnectInfo.lossRate;
                    this.f5006q.tlpCount = superviseConnectInfo.tlpCount;
                    this.f5006q.rtoCount = superviseConnectInfo.rtoCount;
                    this.f5006q.srtt = superviseConnectInfo.srtt;
                }
            } catch (Exception unused) {
            }
        }
        SessionStatistic sessionStatistic2 = this.f5006q;
        if (sessionStatistic2.errorCode == 0) {
            sessionStatistic2.errorCode = i4;
        }
        sessionStatistic2.lastPingInterval = (int) (System.currentTimeMillis() - this.f5282z);
        AppMonitor.getInstance().commitStat(this.f5006q);
        if (C0953c.m4631b(this.f5006q.f5311ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f5006q));
        }
        AppMonitor.getInstance().commitAlarm(this.f5006q.getAlarmObject());
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        SessionStatistic sessionStatistic = this.f5006q;
        sessionStatistic.connectionTime = superviseConnectInfo.connectTime;
        sessionStatistic.sslTime = superviseConnectInfo.handshakeTime;
        sessionStatistic.sslCalTime = superviseConnectInfo.doHandshakeTime;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        this.f5270A = System.currentTimeMillis();
        notifyStatus(0, new C0890b(1));
        m4537b();
        ALog.m4638e("awcn.TnetSpdySession", "spdySessionConnectCB connect", this.f5005p, "connectTime", Integer.valueOf(superviseConnectInfo.connectTime), "sslTime", Integer.valueOf(superviseConnectInfo.handshakeTime));
        if (this.f4999j.isHTTP3()) {
            this.f5006q.scid = superviseConnectInfo.scid;
            this.f5006q.dcid = superviseConnectInfo.dcid;
            this.f5006q.congControlKind = superviseConnectInfo.congControlKind;
            ALog.m4638e("awcn.TnetSpdySession", "[HTTP3 spdySessionConnectCB]", this.f5005p, "connectInfo", spdySession.getConnectInfoOnConnected());
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i4, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e4) {
                ALog.m4637e("awcn.TnetSpdySession", "[spdySessionFailedError]session clean up failed!", null, e4, new Object[0]);
            }
        }
        notifyStatus(2, new C0890b(256, i4, "tnet connect fail"));
        ALog.m4638e("awcn.TnetSpdySession", null, this.f5005p, " errorId:", Integer.valueOf(i4));
        SessionStatistic sessionStatistic = this.f5006q;
        sessionStatistic.errorCode = i4;
        sessionStatistic.ret = 0;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        AppMonitor.getInstance().commitStat(this.f5006q);
        if (C0953c.m4631b(this.f5006q.f5311ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f5006q));
        }
        AppMonitor.getInstance().commitAlarm(this.f5006q.getAlarmObject());
    }

    @Override // anet.channel.Session
    public void ping(boolean z3, int i4) {
        if (ALog.isPrintLog(1)) {
            ALog.m4636d("awcn.TnetSpdySession", "ping", this.f5005p, Constants.KEY_HOST, this.f4992c, "thread", Thread.currentThread().getName());
        }
        if (z3) {
            try {
                if (this.f5280x == null) {
                    SessionStatistic sessionStatistic = this.f5006q;
                    if (sessionStatistic != null) {
                        sessionStatistic.closeReason = "session null";
                    }
                    ALog.m4638e("awcn.TnetSpdySession", this.f4992c + " session null", this.f5005p, new Object[0]);
                    close();
                    return;
                }
                int i5 = this.f5003n;
                if (i5 == 0 || i5 == 4) {
                    handleCallbacks(64, null);
                    if (this.f5281y) {
                        return;
                    }
                    this.f5281y = true;
                    this.f5006q.ppkgCount++;
                    this.f5280x.submitPing();
                    if (ALog.isPrintLog(1)) {
                        ALog.m4636d("awcn.TnetSpdySession", this.f4992c + " submit ping ms:" + (System.currentTimeMillis() - this.f5282z) + " force:" + z3, this.f5005p, new Object[0]);
                    }
                    setPingTimeout(i4);
                    this.f5282z = System.currentTimeMillis();
                    IHeartbeat iHeartbeat = this.f5273D;
                    if (iHeartbeat != null) {
                        iHeartbeat.reSchedule();
                    }
                }
            } catch (SpdyErrorException e4) {
                if (e4.SpdyErrorGetCode() == -1104 || e4.SpdyErrorGetCode() == -1103) {
                    ALog.m4638e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f5005p, new Object[0]);
                    notifyStatus(6, new C0890b(2));
                }
                ALog.m4637e("awcn.TnetSpdySession", "ping", this.f5005p, e4, new Object[0]);
            } catch (Exception e5) {
                ALog.m4637e("awcn.TnetSpdySession", "ping", this.f5005p, e5, new Object[0]);
            }
        }
    }

    /* renamed from: c */
    private void m4529c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SpdyAgent.enableDebug = false;
        this.f5279w = SpdyAgent.getInstance(this.f4990a, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        ISecurity iSecurity = this.f5276G;
        if (iSecurity != null && !iSecurity.isSecOff()) {
            this.f5279w.setAccsSslCallback(new C0927j(this));
        }
        if (AwcnConfig.isTnetHeaderCacheEnable()) {
            return;
        }
        try {
            this.f5279w.getClass().getDeclaredMethod("disableHeaderCache", new Class[0]).invoke(this.f5279w, new Object[0]);
            ALog.m4639i("awcn.TnetSpdySession", "tnet disableHeaderCache", null, new Object[0]);
        } catch (Exception e4) {
            ALog.m4637e("awcn.TnetSpdySession", "tnet disableHeaderCache", null, e4, new Object[0]);
        }
    }

    /* renamed from: b */
    protected void m4537b() {
        IAuth iAuth = this.f5274E;
        if (iAuth != null) {
            iAuth.auth(this, new C0926i(this));
            return;
        }
        notifyStatus(4, null);
        this.f5006q.ret = 1;
        IHeartbeat iHeartbeat = this.f5273D;
        if (iHeartbeat != null) {
            iHeartbeat.start(this);
        }
    }

    /* renamed from: a */
    private void m4521a(int i4, int i5, boolean z3, String str) {
        DataFrameCb dataFrameCb = this.f5272C;
        if (dataFrameCb != null) {
            dataFrameCb.onException(i4, i5, z3, str);
        }
    }
}
