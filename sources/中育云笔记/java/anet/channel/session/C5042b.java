package anet.channel.session;

import android.os.Build;
import android.util.Pair;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C4983a;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.C5083a;
import anet.channel.util.C5084b;
import anet.channel.util.C5089g;
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
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: anet.channel.session.b */
/* loaded from: classes3.dex */
public class C5042b {

    /* renamed from: anet.channel.session.b$a */
    public static class a {

        /* renamed from: a */
        public int f2566a;

        /* renamed from: b */
        public byte[] f2567b;

        /* renamed from: c */
        public Map<String, List<String>> f2568c;

        /* renamed from: d */
        public int f2569d;

        /* renamed from: e */
        public boolean f2570e;
    }

    private C5042b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021c A[Catch: all -> 0x007a, IOException -> 0x0083, CancellationException -> 0x0086, ConnectException -> 0x0092, ConnectTimeoutException -> 0x0095, SocketTimeoutException -> 0x0098, UnknownHostException -> 0x009b, Exception -> 0x017e, SSLException -> 0x0181, SSLHandshakeException -> 0x0184, TryCatch #15 {ConnectException -> 0x0092, blocks: (B:11:0x0033, B:13:0x0038, B:15:0x003e, B:37:0x009e, B:39:0x010a, B:41:0x0114, B:43:0x011a, B:47:0x0128, B:62:0x0193, B:64:0x01a9, B:66:0x01cb, B:75:0x01de, B:77:0x01f9, B:79:0x0207, B:80:0x020e, B:84:0x022b, B:87:0x0242, B:89:0x025c, B:82:0x021c, B:83:0x0223), top: B:187:0x0033, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0242 A[Catch: all -> 0x007a, IOException -> 0x0083, CancellationException -> 0x0086, ConnectException -> 0x0092, ConnectTimeoutException -> 0x0095, SocketTimeoutException -> 0x0098, UnknownHostException -> 0x009b, Exception -> 0x017e, SSLException -> 0x0181, SSLHandshakeException -> 0x0184, TRY_ENTER, TryCatch #15 {ConnectException -> 0x0092, blocks: (B:11:0x0033, B:13:0x0038, B:15:0x003e, B:37:0x009e, B:39:0x010a, B:41:0x0114, B:43:0x011a, B:47:0x0128, B:62:0x0193, B:64:0x01a9, B:66:0x01cb, B:75:0x01de, B:77:0x01f9, B:79:0x0207, B:80:0x020e, B:84:0x022b, B:87:0x0242, B:89:0x025c, B:82:0x021c, B:83:0x0223), top: B:187:0x0033, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025c A[Catch: all -> 0x007a, IOException -> 0x0083, CancellationException -> 0x0086, ConnectException -> 0x0092, ConnectTimeoutException -> 0x0095, SocketTimeoutException -> 0x0098, UnknownHostException -> 0x009b, Exception -> 0x017e, SSLException -> 0x0181, SSLHandshakeException -> 0x0184, TRY_LEAVE, TryCatch #15 {ConnectException -> 0x0092, blocks: (B:11:0x0033, B:13:0x0038, B:15:0x003e, B:37:0x009e, B:39:0x010a, B:41:0x0114, B:43:0x011a, B:47:0x0128, B:62:0x0193, B:64:0x01a9, B:66:0x01cb, B:75:0x01de, B:77:0x01f9, B:79:0x0207, B:80:0x020e, B:84:0x022b, B:87:0x0242, B:89:0x025c, B:82:0x021c, B:83:0x0223), top: B:187:0x0033, outer: #7 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static anet.channel.session.C5042b.a m2431a(anet.channel.request.Request r20, anet.channel.RequestCb r21) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.C5042b.m2431a(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.session.b$a");
    }

    /* renamed from: a */
    private static void m2433a(Request request, a aVar, RequestCb requestCb, int i10, Throwable th) {
        String errMsg = ErrorConstant.getErrMsg(i10);
        ALog.m2529e("awcn.HttpConnector", "onException", request.getSeq(), Constants.KEY_ERROR_CODE, Integer.valueOf(i10), "errMsg", errMsg, "url", request.getUrlString(), Constants.KEY_HOST, request.getHost());
        if (aVar != null) {
            aVar.f2566a = i10;
        }
        if (!request.f2501a.isDone.get()) {
            request.f2501a.statusCode = i10;
            request.f2501a.msg = errMsg;
            request.f2501a.rspEnd = System.currentTimeMillis();
            if (i10 != -204) {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(i10, errMsg, request.f2501a, th));
            }
        }
        if (requestCb != null) {
            requestCb.onFinish(i10, errMsg, request.f2501a);
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m2432a(Request request) throws ProtocolException {
        HttpURLConnection httpURLConnection;
        Pair<String, Integer> wifiProxy = NetworkStatusHelper.getWifiProxy();
        Proxy proxy = wifiProxy != null ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) wifiProxy.first, ((Integer) wifiProxy.second).intValue())) : null;
        C5089g c5089gM2550a = C5089g.m2550a();
        if (NetworkStatusHelper.getStatus().isMobile() && c5089gM2550a != null) {
            proxy = c5089gM2550a.m2551b();
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
            httpURLConnection.setRequestProperty(HttpConstant.ACCEPT_ENCODING, HttpConstant.GZIP);
        }
        if (c5089gM2550a != null) {
            httpURLConnection.setRequestProperty("Authorization", c5089gM2550a.m2552c());
        }
        if (url.getProtocol().equalsIgnoreCase("https")) {
            m2435a(httpURLConnection, request, host);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* renamed from: a */
    private static void m2435a(HttpURLConnection httpURLConnection, Request request, String str) {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.m2529e("awcn.HttpConnector", "supportHttps", "[supportHttps]Froyo 以下版本不支持https", new Object[0]);
            return;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        if (request.getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(request.getSslSocketFactory());
        } else {
            SSLSocketFactory sSLSocketFactory = C5084b.f2750a;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                if (ALog.isPrintLog(2)) {
                    ALog.m2530i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "SslSocketFactory", C5084b.f2750a);
                }
            }
        }
        if (request.getHostnameVerifier() != null) {
            httpsURLConnection.setHostnameVerifier(request.getHostnameVerifier());
            return;
        }
        HostnameVerifier hostnameVerifier = C5084b.f2751b;
        if (hostnameVerifier != null) {
            httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            if (ALog.isPrintLog(2)) {
                ALog.m2530i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "HostnameVerifier", C5084b.f2751b);
                return;
            }
            return;
        }
        httpsURLConnection.setHostnameVerifier(new C5043c(str));
    }

    /* renamed from: a */
    private static int m2430a(HttpURLConnection httpURLConnection, Request request) throws IOException {
        int i10 = 0;
        if (!request.containsBody()) {
            return 0;
        }
        OutputStream outputStream = null;
        try {
            try {
                outputStream = httpURLConnection.getOutputStream();
                int iPostBody = request.postBody(outputStream);
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e10) {
                        ALog.m2528e("awcn.HttpConnector", "postData", request.getSeq(), e10, new Object[0]);
                    }
                }
                i10 = iPostBody;
            } catch (Exception e11) {
                ALog.m2528e("awcn.HttpConnector", "postData error", request.getSeq(), e11, new Object[0]);
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e12) {
                        ALog.m2528e("awcn.HttpConnector", "postData", request.getSeq(), e12, new Object[0]);
                    }
                }
            }
            long j10 = i10;
            request.f2501a.reqBodyInflateSize = j10;
            request.f2501a.reqBodyDeflateSize = j10;
            request.f2501a.sendDataSize = j10;
            return i10;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e13) {
                    ALog.m2528e("awcn.HttpConnector", "postData", request.getSeq(), e13, new Object[0]);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static void m2434a(HttpURLConnection httpURLConnection, Request request, a aVar, RequestCb requestCb) throws Throwable {
        InputStream errorStream;
        ByteArrayOutputStream byteArrayOutputStream;
        C5083a c5083a;
        httpURLConnection.getURL().toString();
        C5083a c5083a2 = null;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                ALog.m2532w("awcn.HttpConnector", "File not found", request.getSeq(), "url", request.getUrlString());
            }
            try {
                errorStream = httpURLConnection.getErrorStream();
            } catch (Exception e11) {
                ALog.m2528e("awcn.HttpConnector", "get error stream failed.", request.getSeq(), e11, new Object[0]);
                errorStream = null;
            }
        }
        if (errorStream == null) {
            m2433a(request, aVar, requestCb, ErrorConstant.ERROR_IO_EXCEPTION, null);
            return;
        }
        if (requestCb == null) {
            int i10 = aVar.f2569d;
            if (i10 <= 0) {
                i10 = 1024;
            } else if (aVar.f2570e) {
                i10 *= 2;
            }
            byteArrayOutputStream = new ByteArrayOutputStream(i10);
        } else {
            byteArrayOutputStream = null;
        }
        try {
            c5083a = new C5083a(errorStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            InputStream gZIPInputStream = aVar.f2570e ? new GZIPInputStream(c5083a) : c5083a;
            ByteArray byteArrayM2275a = null;
            while (!Thread.currentThread().isInterrupted()) {
                if (byteArrayM2275a == null) {
                    byteArrayM2275a = C4983a.a.f2350a.m2275a(2048);
                }
                int from = byteArrayM2275a.readFrom(gZIPInputStream);
                if (from != -1) {
                    if (byteArrayOutputStream != null) {
                        byteArrayM2275a.writeTo(byteArrayOutputStream);
                    } else {
                        requestCb.onDataReceive(byteArrayM2275a, false);
                        byteArrayM2275a = null;
                    }
                    long j10 = from;
                    request.f2501a.recDataSize += j10;
                    request.f2501a.rspBodyInflateSize += j10;
                } else {
                    if (byteArrayOutputStream != null) {
                        byteArrayM2275a.recycle();
                    } else {
                        requestCb.onDataReceive(byteArrayM2275a, true);
                    }
                    if (byteArrayOutputStream != null) {
                        aVar.f2567b = byteArrayOutputStream.toByteArray();
                    }
                    request.f2501a.recDataTime = System.currentTimeMillis() - request.f2501a.rspStart;
                    request.f2501a.rspBodyDeflateSize = c5083a.m2533a();
                    try {
                        gZIPInputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            throw new CancellationException("task cancelled");
        } catch (Throwable th2) {
            th = th2;
            c5083a2 = c5083a;
            request.f2501a.recDataTime = System.currentTimeMillis() - request.f2501a.rspStart;
            request.f2501a.rspBodyDeflateSize = c5083a2.m2533a();
            try {
                errorStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
