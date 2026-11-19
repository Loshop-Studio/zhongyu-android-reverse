package com.alibaba.sdk.android.push.common.util.p061a;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.util.C5582a;
import com.alibaba.sdk.android.push.common.global.C5654c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.push.common.util.a.c */
/* loaded from: classes3.dex */
public abstract class AbstractAsyncTaskC5659c extends AsyncTask<Map<String, String>, Void, C5658b> {

    /* renamed from: a */
    static AmsLogger f4273a = AmsLogger.getLogger("MPS:SendRequestTask");

    /* renamed from: c */
    private Context f4275c;

    /* renamed from: d */
    private String f4276d;

    /* renamed from: b */
    public String f4274b = "POST";

    /* renamed from: e */
    private int f4277e = 0;

    public AbstractAsyncTaskC5659c(Context context, String str) {
        this.f4275c = context;
        this.f4276d = str;
    }

    /* renamed from: a */
    public int m3630a() {
        return this.f4277e;
    }

    /* renamed from: a */
    public abstract Map<String, String> mo3633a(Context context, Map<String, String> map);

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5658b doInBackground(Map<String, String>... mapArr) {
        C5658b c5658b;
        Map<String, String> map = mapArr[0];
        if (map.containsKey("VipRequestType")) {
            this.f4277e = Integer.parseInt(map.get("VipRequestType"));
            c5658b = new C5658b(Integer.parseInt(map.get("VipRequestType")));
        } else {
            c5658b = new C5658b();
        }
        try {
            String strM3632a = m3632a(this.f4275c, this.f4276d, map);
            c5658b.f4270b = 200;
            c5658b.f4269a = strM3632a;
            return c5658b;
        } catch (C5657a e10) {
            c5658b.f4271c = e10.m3628a();
            c5658b.f4270b = -1;
            c5658b.f4269a = e10.getMessage();
            return c5658b;
        }
    }

    /* renamed from: a */
    public String m3632a(Context context, String str, Map<String, String> map) {
        int i10;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    Map<String, String> mapMo3633a = mo3633a(context, map);
                    m3629a(str, mapMo3633a);
                    HttpURLConnection httpURLConnectionM3434a = C5582a.m3434a(str, mapMo3633a, this.f4274b);
                    if (httpURLConnectionM3434a == null) {
                        f4273a.m3420e("failed to access VIP service.");
                        throw new C5657a(C5654c.f4257p.copy().msg("创建请求连接失败").build());
                    }
                    if (httpURLConnectionM3434a.getResponseCode() != 200) {
                        throw new C5657a(C5654c.f4257p.copy().msg("请求失败：" + httpURLConnectionM3434a.getResponseCode()).build());
                    }
                    InputStream inputStream = httpURLConnectionM3434a.getInputStream();
                    byte[] bArr = new byte[1024];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                    while (!Thread.interrupted() && (i10 = inputStream.read(bArr)) != -1) {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                    String string = byteArrayOutputStream.toString("utf-8");
                    httpURLConnectionM3434a.disconnect();
                    return string;
                } catch (C5657a e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                f4273a.m3421e("VIP API failed! error: ", th);
                throw new C5657a(C5654c.f4257p.copy().msg(th.getMessage()).detail(Log.getStackTraceString(th)).build());
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C5658b c5658b) {
        f4273a.m3423i("HTTP Return code: " + c5658b.f4270b);
    }

    /* renamed from: a */
    private void m3629a(String str, Map<String, String> map) {
        try {
            f4273a.m3417d("request url :" + str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                f4273a.m3417d("key: " + entry.getKey() + " value: " + entry.getValue());
            }
        } catch (Throwable unused) {
        }
    }
}
