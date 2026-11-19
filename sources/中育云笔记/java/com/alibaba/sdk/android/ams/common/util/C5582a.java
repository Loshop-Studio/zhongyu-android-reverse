package com.alibaba.sdk.android.ams.common.util;

import android.content.Context;
import android.util.Base64;
import anet.channel.request.Request;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.ams.common.util.a */
/* loaded from: classes3.dex */
public class C5582a {

    /* renamed from: a */
    private static final AmsLogger f4003a = AmsLogger.getLogger("MPS:httpClient");

    /* renamed from: com.alibaba.sdk.android.ams.common.util.a$a */
    public static class a extends IOException {
        public a(IOException iOException, int i10) {
            super(iOException.getMessage() + " code " + i10, iOException);
        }
    }

    /* renamed from: a */
    public static HttpURLConnection m3434a(String str, Map<String, String> map, String str2) {
        return "POST".equals(str2) ? m3436a(str, map, str2, 0, null) : m3435a(str, map, str2, 0);
    }

    @Deprecated
    /* renamed from: a */
    private static HttpURLConnection m3435a(String str, Map<String, String> map, String str2, int i10) throws IOException {
        if (i10 >= 3) {
            throw new a(new IOException("redirectCount > 3"), 300);
        }
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() == null) {
                    f4003a.m3426w("skip empty entry " + entry.getKey());
                } else {
                    sb2.append(entry.getKey());
                    sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb2.append(URLEncoder.encode(entry.getValue(), "utf-8"));
                    sb2.append("&");
                }
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str + "?" + ((Object) sb2)).openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod(str2 == null ? "GET" : str2);
        httpURLConnection.setReadTimeout(6000);
        httpURLConnection.setConnectTimeout(6000);
        httpURLConnection.connect();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            f4003a.m3417d("responseCode: " + responseCode);
            return (responseCode != 200 && responseCode / 3 == 100) ? m3435a(httpURLConnection.getHeaderField("Location"), map, str2, i10) : httpURLConnection;
        } catch (IOException e10) {
            f4003a.m3418d("openConnection: ", e10);
            throw new a(e10, httpURLConnection.getResponseCode());
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m3436a(String str, Map<String, String> map, String str2, int i10, Context context) throws IOException {
        if (i10 >= 3) {
            throw new a(new IOException("redirectCount > 3"), 300);
        }
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() == null) {
                    f4003a.m3426w("skip empty entry " + entry.getKey());
                } else {
                    sb2.append(entry.getKey());
                    sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb2.append(Base64.encodeToString(entry.getValue().getBytes(), 8));
                    sb2.append("&");
                }
            }
            sb2.deleteCharAt(sb2.length() - 1);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setReadTimeout(6000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(6000);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(sb2.toString().getBytes(Request.DEFAULT_CHARSET));
        outputStream.flush();
        outputStream.close();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            f4003a.m3417d("responseCode: " + responseCode);
            return (responseCode != 200 && responseCode / 3 == 100) ? m3436a(httpURLConnection.getHeaderField("Location"), map, str2, i10, context) : httpURLConnection;
        } catch (IOException e10) {
            f4003a.m3418d("openConnection: ", e10);
            throw new a(e10, httpURLConnection.getResponseCode());
        }
    }
}
