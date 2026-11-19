package p272o5;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p259n5.AbstractC10317a;
import p289p5.AbstractC10631a;

/* renamed from: o5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10444a {
    /* renamed from: a */
    public static HttpsURLConnection m21825a(String str, Context context, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
            Logger.m8588w("URLConnectionHelper", "urlConnection is not an instance of HttpsURLConnection");
            return null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        try {
            httpsURLConnection.setSSLSocketFactory(AbstractC10631a.m22481b(context));
            httpsURLConnection.setHostnameVerifier(AbstractC10631a.m22480a());
        } catch (IllegalArgumentException unused) {
            Logger.m8588w("URLConnectionHelper", "init https ssl socket failed.");
        }
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        String strM21524d = AbstractC10317a.m21524d(context, "NetworkKit-grs", str2);
        Logger.m8571d("URLConnectionHelper", "request to grs server with a User-Agent header is: " + strM21524d);
        httpsURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, strM21524d);
        return httpsURLConnection;
    }

    /* renamed from: b */
    public static void m21826b(HttpsURLConnection httpsURLConnection, String str) throws Throwable {
        OutputStream outputStream;
        String str2;
        if (str == null) {
            str2 = "sendHttpBody: The Body Data is Null";
        } else if (httpsURLConnection == null) {
            str2 = "sendHttpBody: HttpsURLConnection is Null";
        } else {
            try {
                outputStream = httpsURLConnection.getOutputStream();
                try {
                    outputStream.write(str.getBytes(Request.DEFAULT_CHARSET));
                    outputStream.flush();
                    IoUtils.closeSecure(outputStream);
                    return;
                } catch (Throwable th) {
                    th = th;
                    IoUtils.closeSecure(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
            }
        }
        Logger.m8580i("URLConnectionHelper", str2);
    }
}
