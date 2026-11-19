package anet.channel.session;

import android.os.Build;
import android.util.Pair;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C0860a;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.C0960a;
import anet.channel.util.C0961b;
import anet.channel.util.C0966g;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import com.taobao.accs.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.android.agoo.common.AgooConstants;

/* renamed from: anet.channel.session.b */
/* loaded from: classes.dex */
public class C0919b {

    /* renamed from: anet.channel.session.b$a */
    public static class a {

        /* renamed from: a */
        public int f5288a;

        /* renamed from: b */
        public byte[] f5289b;

        /* renamed from: c */
        public Map<String, List<String>> f5290c;

        /* renamed from: d */
        public int f5291d;

        /* renamed from: e */
        public boolean f5292e;
    }

    private C0919b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ab A[Catch: all -> 0x028e, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ba A[Catch: all -> 0x028e, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0367 A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03cf A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x038d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220 A[Catch: Exception -> 0x0276, SSLException -> 0x0278, SSLHandshakeException -> 0x027b, all -> 0x028e, IOException -> 0x02dc, CancellationException -> 0x0311, ConnectException -> 0x0405, ConnectTimeoutException -> 0x042d, SocketTimeoutException -> 0x0453, UnknownHostException -> 0x0479, TryCatch #3 {Exception -> 0x0276, blocks: (B:36:0x0132, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227), top: B:197:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0246 A[Catch: Exception -> 0x0276, SSLException -> 0x0278, SSLHandshakeException -> 0x027b, all -> 0x028e, IOException -> 0x02dc, CancellationException -> 0x0311, ConnectException -> 0x0405, ConnectTimeoutException -> 0x042d, SocketTimeoutException -> 0x0453, UnknownHostException -> 0x0479, TRY_ENTER, TryCatch #3 {Exception -> 0x0276, blocks: (B:36:0x0132, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227), top: B:197:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025f A[Catch: Exception -> 0x0276, SSLException -> 0x0278, SSLHandshakeException -> 0x027b, all -> 0x028e, IOException -> 0x02dc, CancellationException -> 0x0311, ConnectException -> 0x0405, ConnectTimeoutException -> 0x042d, SocketTimeoutException -> 0x0453, UnknownHostException -> 0x0479, TRY_LEAVE, TryCatch #3 {Exception -> 0x0276, blocks: (B:36:0x0132, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227), top: B:197:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029c A[Catch: all -> 0x028e, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a1  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static anet.channel.session.C0919b.a m4540a(anet.channel.request.Request r21, anet.channel.RequestCb r22) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.C0919b.m4540a(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.session.b$a");
    }

    /* renamed from: a */
    private static void m4542a(Request request, a aVar, RequestCb requestCb, int i4, Throwable th) {
        String errMsg = ErrorConstant.getErrMsg(i4);
        ALog.m4638e("awcn.HttpConnector", "onException", request.getSeq(), Constants.KEY_ERROR_CODE, Integer.valueOf(i4), "errMsg", errMsg, AgooConstants.OPEN_URL, request.getUrlString(), Constants.KEY_HOST, request.getHost());
        if (aVar != null) {
            aVar.f5288a = i4;
        }
        if (!request.f5223a.isDone.get()) {
            request.f5223a.statusCode = i4;
            request.f5223a.msg = errMsg;
            request.f5223a.rspEnd = System.currentTimeMillis();
            if (i4 != -204) {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(i4, errMsg, request.f5223a, th));
            }
        }
        if (requestCb != null) {
            requestCb.onFinish(i4, errMsg, request.f5223a);
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m4541a(Request request) throws IOException {
        HttpURLConnection httpURLConnection;
        Pair<String, Integer> wifiProxy = NetworkStatusHelper.getWifiProxy();
        Proxy proxy = wifiProxy != null ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) wifiProxy.first, ((Integer) wifiProxy.second).intValue())) : null;
        C0966g c0966gM4659a = C0966g.m4659a();
        if (NetworkStatusHelper.getStatus().isMobile() && c0966gM4659a != null) {
            proxy = c0966gM4659a.m4660b();
        }
        URL url = request.getUrl();
        if (proxy != null) {
            httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(request.getConnectTimeout());
        httpURLConnection.setReadTimeout(request.getReadTimeout());
        httpURLConnection.setRequestMethod(request.getMethod());
        if (request.containsBody()) {
            httpURLConnection.setDoOutput(true);
        }
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        String host = headers.get("Host");
        if (host == null) {
            host = request.getHost();
        }
        String strConcatString = request.getHttpUrl().containsNonDefaultPort() ? StringUtils.concatString(host, ":", String.valueOf(request.getHttpUrl().getPort())) : host;
        httpURLConnection.setRequestProperty("Host", strConcatString);
        if (NetworkStatusHelper.getApn().equals("cmwap")) {
            httpURLConnection.setRequestProperty(HttpConstant.X_ONLINE_HOST, strConcatString);
        }
        if (!headers.containsKey(HttpConstant.ACCEPT_ENCODING)) {
            httpURLConnection.setRequestProperty(HttpConstant.ACCEPT_ENCODING, "gzip");
        }
        if (c0966gM4659a != null) {
            httpURLConnection.setRequestProperty("Authorization", c0966gM4659a.m4661c());
        }
        if (url.getProtocol().equalsIgnoreCase(HttpConstant.HTTPS)) {
            m4544a(httpURLConnection, request, host);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* renamed from: a */
    private static void m4544a(HttpURLConnection httpURLConnection, Request request, String str) {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.m4638e("awcn.HttpConnector", "supportHttps", "[supportHttps]Froyo 以下版本不支持https", new Object[0]);
            return;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        if (request.getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(request.getSslSocketFactory());
        } else {
            SSLSocketFactory sSLSocketFactory = C0961b.f5472a;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                if (ALog.isPrintLog(2)) {
                    ALog.m4639i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "SslSocketFactory", C0961b.f5472a);
                }
            }
        }
        if (request.getHostnameVerifier() != null) {
            httpsURLConnection.setHostnameVerifier(request.getHostnameVerifier());
            return;
        }
        HostnameVerifier hostnameVerifier = C0961b.f5473b;
        if (hostnameVerifier != null) {
            httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            if (ALog.isPrintLog(2)) {
                ALog.m4639i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "HostnameVerifier", C0961b.f5473b);
                return;
            }
            return;
        }
        httpsURLConnection.setHostnameVerifier(new C0920c(str));
    }

    /* renamed from: a */
    private static int m4539a(HttpURLConnection httpURLConnection, Request request) throws IOException {
        int i4 = 0;
        if (request.containsBody()) {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    int iPostBody = request.postBody(outputStream);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e4) {
                            ALog.m4637e("awcn.HttpConnector", "postData", request.getSeq(), e4, new Object[0]);
                        }
                    }
                    i4 = iPostBody;
                } catch (Exception e5) {
                    ALog.m4637e("awcn.HttpConnector", "postData error", request.getSeq(), e5, new Object[0]);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e6) {
                            ALog.m4637e("awcn.HttpConnector", "postData", request.getSeq(), e6, new Object[0]);
                        }
                    }
                }
                long j4 = i4;
                request.f5223a.reqBodyInflateSize = j4;
                request.f5223a.reqBodyDeflateSize = j4;
                request.f5223a.sendDataSize = j4;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e7) {
                        ALog.m4637e("awcn.HttpConnector", "postData", request.getSeq(), e7, new Object[0]);
                    }
                }
                throw th;
            }
        }
        return i4;
    }

    /* renamed from: a */
    private static void m4543a(HttpURLConnection httpURLConnection, Request request, a aVar, RequestCb requestCb) throws Throwable {
        InputStream errorStream;
        ByteArrayOutputStream byteArrayOutputStream;
        httpURLConnection.getURL().toString();
        C0960a c0960a = null;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException e4) {
            if (e4 instanceof FileNotFoundException) {
                ALog.m4641w("awcn.HttpConnector", "File not found", request.getSeq(), AgooConstants.OPEN_URL, request.getUrlString());
            }
            try {
                errorStream = httpURLConnection.getErrorStream();
            } catch (Exception e5) {
                ALog.m4637e("awcn.HttpConnector", "get error stream failed.", request.getSeq(), e5, new Object[0]);
                errorStream = null;
            }
        }
        if (errorStream == null) {
            m4542a(request, aVar, requestCb, ErrorConstant.ERROR_IO_EXCEPTION, null);
            return;
        }
        if (requestCb == null) {
            int i4 = aVar.f5291d;
            if (i4 <= 0) {
                i4 = 1024;
            } else if (aVar.f5292e) {
                i4 *= 2;
            }
            byteArrayOutputStream = new ByteArrayOutputStream(i4);
        } else {
            byteArrayOutputStream = null;
        }
        try {
            C0960a c0960a2 = new C0960a(errorStream);
            try {
                InputStream gZIPInputStream = aVar.f5292e ? new GZIPInputStream(c0960a2) : c0960a2;
                ByteArray byteArrayM4384a = null;
                while (!Thread.currentThread().isInterrupted()) {
                    if (byteArrayM4384a == null) {
                        byteArrayM4384a = C0860a.a.f5072a.m4384a(2048);
                    }
                    int from = byteArrayM4384a.readFrom(gZIPInputStream);
                    if (from != -1) {
                        if (byteArrayOutputStream != null) {
                            byteArrayM4384a.writeTo(byteArrayOutputStream);
                        } else {
                            requestCb.onDataReceive(byteArrayM4384a, false);
                            byteArrayM4384a = null;
                        }
                        long j4 = from;
                        request.f5223a.recDataSize += j4;
                        request.f5223a.rspBodyInflateSize += j4;
                    } else {
                        if (byteArrayOutputStream != null) {
                            byteArrayM4384a.recycle();
                        } else {
                            requestCb.onDataReceive(byteArrayM4384a, true);
                        }
                        if (byteArrayOutputStream != null) {
                            aVar.f5289b = byteArrayOutputStream.toByteArray();
                        }
                        request.f5223a.recDataTime = System.currentTimeMillis() - request.f5223a.rspStart;
                        request.f5223a.rspBodyDeflateSize = c0960a2.m4642a();
                        try {
                            gZIPInputStream.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                }
                throw new CancellationException("task cancelled");
            } catch (Throwable th) {
                th = th;
                c0960a = c0960a2;
                request.f5223a.recDataTime = System.currentTimeMillis() - request.f5223a.rspStart;
                request.f5223a.rspBodyDeflateSize = c0960a.m4642a();
                try {
                    errorStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
