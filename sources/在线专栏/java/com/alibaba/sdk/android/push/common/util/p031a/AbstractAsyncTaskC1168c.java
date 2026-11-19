package com.alibaba.sdk.android.push.common.util.p031a;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.util.C1107a;
import com.alibaba.sdk.android.push.common.global.C1163c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.push.common.util.a.c */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC1168c extends AsyncTask<Map<String, String>, Void, C1167b> {

    /* renamed from: a */
    static AmsLogger f6749a = AmsLogger.getLogger("MPS:SendRequestTask");

    /* renamed from: c */
    private Context f6751c;

    /* renamed from: d */
    private String f6752d;

    /* renamed from: b */
    public String f6750b = "POST";

    /* renamed from: e */
    private int f6753e = 0;

    public AbstractAsyncTaskC1168c(Context context, String str) {
        this.f6751c = context;
        this.f6752d = str;
    }

    /* renamed from: a */
    private void m5178a(String str, Map<String, String> map) {
        try {
            f6749a.m5016d("request url :" + str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                f6749a.m5016d("key: " + entry.getKey() + " value: " + entry.getValue());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public int m5179a() {
        return this.f6753e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1167b doInBackground(Map<String, String>... mapArr) {
        C1167b c1167b;
        Map<String, String> map = mapArr[0];
        if (map.containsKey("VipRequestType")) {
            this.f6753e = Integer.parseInt(map.get("VipRequestType"));
            c1167b = new C1167b(Integer.parseInt(map.get("VipRequestType")));
        } else {
            c1167b = new C1167b();
        }
        try {
            String strM5181a = m5181a(this.f6751c, this.f6752d, map);
            c1167b.f6746b = 200;
            c1167b.f6745a = strM5181a;
        } catch (C1166a e4) {
            c1167b.f6747c = e4.m5177a();
            c1167b.f6746b = -1;
            c1167b.f6745a = e4.getMessage();
        }
        return c1167b;
    }

    /* renamed from: a */
    public String m5181a(Context context, String str, Map<String, String> map) {
        int i4;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    Map<String, String> mapMo5182a = mo5182a(context, map);
                    m5178a(str, mapMo5182a);
                    HttpURLConnection httpURLConnectionM5033a = C1107a.m5033a(str, mapMo5182a, this.f6750b);
                    if (httpURLConnectionM5033a == null) {
                        f6749a.m5019e("failed to access VIP service.");
                        throw new C1166a(C1163c.f6733p.copy().msg("创建请求连接失败").build());
                    }
                    if (httpURLConnectionM5033a.getResponseCode() != 200) {
                        throw new C1166a(C1163c.f6733p.copy().msg("请求失败：" + httpURLConnectionM5033a.getResponseCode()).build());
                    }
                    InputStream inputStream = httpURLConnectionM5033a.getInputStream();
                    byte[] bArr = new byte[1024];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                    while (!Thread.interrupted() && (i4 = inputStream.read(bArr)) != -1) {
                        byteArrayOutputStream.write(bArr, 0, i4);
                    }
                    String string = byteArrayOutputStream.toString("utf-8");
                    httpURLConnectionM5033a.disconnect();
                    return string;
                } catch (Throwable th) {
                    f6749a.m5020e("VIP API failed! error: ", th);
                    throw new C1166a(C1163c.f6733p.copy().msg(th.getMessage()).detail(Log.getStackTraceString(th)).build());
                }
            } catch (C1166a e4) {
                throw e4;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    /* renamed from: a */
    protected abstract Map<String, String> mo5182a(Context context, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C1167b c1167b) {
        f6749a.m5022i("HTTP Return code: " + c1167b.f6746b);
    }
}
