package com.alibaba.sdk.android.ams.common.util;

import android.content.Context;
import android.util.Base64;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.taobao.accs.ErrorCode;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.ams.common.util.a */
/* loaded from: classes.dex */
public class C1107a {

    /* renamed from: a */
    private static final AmsLogger f6518a = AmsLogger.getLogger("MPS:httpClient");

    /* renamed from: com.alibaba.sdk.android.ams.common.util.a$a */
    private static class a extends IOException {
        public a(IOException iOException, int i4) {
            super(iOException.getMessage() + " code " + i4, iOException);
        }
    }

    /* renamed from: a */
    public static HttpURLConnection m5033a(String str, Map<String, String> map, String str2) {
        return "POST".equals(str2) ? m5035a(str, map, str2, 0, null) : m5034a(str, map, str2, 0);
    }

    @Deprecated
    /* renamed from: a */
    private static HttpURLConnection m5034a(String str, Map<String, String> map, String str2, int i4) throws IOException {
        if (i4 >= 3) {
            throw new a(new IOException("redirectCount > 3"), ErrorCode.APP_NOT_BIND);
        }
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() == null) {
                    f6518a.m5025w("skip empty entry " + entry.getKey());
                } else {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(URLEncoder.encode(entry.getValue(), "utf-8"));
                    sb.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
                }
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str + "?" + ((Object) sb)).openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod(str2 == null ? "GET" : str2);
        httpURLConnection.setReadTimeout(6000);
        httpURLConnection.setConnectTimeout(6000);
        httpURLConnection.connect();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            f6518a.m5016d("responseCode: " + responseCode);
            return (responseCode != 200 && responseCode / 3 == 100) ? m5034a(httpURLConnection.getHeaderField("Location"), map, str2, i4) : httpURLConnection;
        } catch (IOException e4) {
            f6518a.m5017d("openConnection: ", e4);
            throw new a(e4, httpURLConnection.getResponseCode());
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m5035a(String str, Map<String, String> map, String str2, int i4, Context context) throws IOException {
        if (i4 >= 3) {
            throw new a(new IOException("redirectCount > 3"), ErrorCode.APP_NOT_BIND);
        }
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() == null) {
                    f6518a.m5025w("skip empty entry " + entry.getKey());
                } else {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(Base64.encodeToString(entry.getValue().getBytes(), 8));
                    sb.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setReadTimeout(6000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(6000);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(sb.toString().getBytes("UTF-8"));
        outputStream.flush();
        outputStream.close();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            f6518a.m5016d("responseCode: " + responseCode);
            return (responseCode != 200 && responseCode / 3 == 100) ? m5035a(httpURLConnection.getHeaderField("Location"), map, str2, i4, context) : httpURLConnection;
        } catch (IOException e4) {
            f6518a.m5017d("openConnection: ", e4);
            throw new a(e4, httpURLConnection.getResponseCode());
        }
    }
}
