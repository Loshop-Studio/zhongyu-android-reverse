package com.tencent.bugly.proguard;

import android.util.Pair;
import anet.channel.request.Request;
import com.tendcloud.tenddata.C7843ab;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.bugly.proguard.ad */
/* loaded from: classes5.dex */
public final class C7771ad {
    /* renamed from: a */
    public static Pair<Integer, String> m10553a(List<String> list) {
        try {
            HashMap map = new HashMap();
            map.put("Atta-Type", "batch-report");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attaid", "0d000062340").put("token", "2273782735").put("type", "batch").put("version", C7843ab.f14281P);
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("datas", jSONArray);
            return m10552a("https://h.trace.qq.com/kv", jSONObject.toString(), map);
        } catch (Throwable th) {
            C7779al.m10616b(th);
            return new Pair<>(-1, th.getMessage());
        }
    }

    /* renamed from: a */
    private static Pair<Integer, String> m10552a(String str, String str2, Map<String, String> map) throws IOException {
        InputStream inputStream;
        DataOutputStream dataOutputStream;
        String message;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2;
        HttpURLConnection httpURLConnection2 = null;
        int responseCode = -1;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                m10555a(httpURLConnection, map);
                httpURLConnection.setConnectTimeout(DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT);
                httpURLConnection.setReadTimeout(DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT);
                httpURLConnection.connect();
                byte[] bytes = str2.getBytes(Request.DEFAULT_CHARSET);
                dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream.write(bytes);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 400) {
                        inputStream2 = httpURLConnection.getErrorStream();
                    } else {
                        inputStream2 = httpURLConnection.getInputStream();
                    }
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    inputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
                httpURLConnection2 = httpURLConnection;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            dataOutputStream = null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, Request.DEFAULT_CHARSET));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
                sb2.append("\r\n");
            }
            bufferedReader.close();
            message = sb2.toString();
            m10554a((Closeable) null);
            m10554a(inputStream2);
            httpURLConnection.disconnect();
        } catch (Throwable th4) {
            httpURLConnection2 = httpURLConnection;
            inputStream = inputStream2;
            th = th4;
            dataOutputStream = null;
            try {
                C7779al.m10616b(th);
                message = th.getMessage();
                return new Pair<>(Integer.valueOf(responseCode), message);
            } finally {
                m10554a(dataOutputStream);
                m10554a(inputStream);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
        return new Pair<>(Integer.valueOf(responseCode), message);
    }

    /* renamed from: a */
    private static void m10555a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (httpURLConnection == null || map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    private static void m10554a(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e10) {
            C7779al.m10616b(e10);
        }
    }
}
