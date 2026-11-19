package com.alibaba.sdk.android.push.p064e;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.push.common.global.C5654c;
import com.alibaba.sdk.android.push.common.util.p061a.EnumC5660d;
import com.alibaba.sdk.android.push.p058a.C5649f;
import com.taobao.accs.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.push.e.i */
/* loaded from: classes3.dex */
public class C5674i {
    /* renamed from: a */
    public static String m3716a(int i10, int i11, String str) throws JSONException, C5649f {
        try {
            if (i11 == 200) {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(Constants.KEY_HTTP_CODE);
                if (string.equals("OK")) {
                    return jSONObject.has("data") ? m3717a(i10, jSONObject.getString("data")) : "";
                }
                throw new C5649f(C5654c.m3626b(string, jSONObject.getString("message")));
            }
            throw new C5649f(C5654c.f4257p.copy().msg("请求失败" + i11).detail("requestType:" + i10).build());
        } catch (JSONException e10) {
            throw new C5649f(C5654c.f4250i.copy().msg(e10.getMessage()).detail("content: " + str).build());
        }
    }

    /* renamed from: a */
    public static String m3717a(int i10, String str) throws C5649f {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (i10 == EnumC5660d.LIST_TAGS.m3636a()) {
                str2 = "tags";
            } else if (i10 == EnumC5660d.LIST_ALIASES.m3636a()) {
                str2 = "alias";
            } else {
                if (i10 != EnumC5660d.CONFIG.m3636a()) {
                    if (i10 == EnumC5660d.CHECK_PUSH_STATUS.m3636a()) {
                        return jSONObject.getBoolean(NotificationCompat.CATEGORY_STATUS) ? "on" : "off";
                    }
                    throw new C5649f(C5654c.f4250i.copy().detail("unknown request type " + i10).detail("data : " + str).build());
                }
                str2 = "deviceId";
            }
            return jSONObject.getString(str2);
        } catch (JSONException e10) {
            throw new C5649f(C5654c.f4250i.copy().detail(e10.getMessage()).detail("data : " + str).build());
        }
    }

    /* renamed from: a */
    public static String m3718a(int i10, HttpURLConnection httpURLConnection) throws JSONException, C5649f {
        try {
            if (httpURLConnection.getResponseCode() == 200) {
                JSONObject jSONObject = new JSONObject(m3719a(httpURLConnection));
                String string = jSONObject.getString(Constants.KEY_HTTP_CODE);
                if (string.equals("OK")) {
                    return jSONObject.has("data") ? m3717a(i10, jSONObject.getString("data")) : "";
                }
                throw new C5649f(C5654c.m3626b(string, jSONObject.getString("message")));
            }
            throw new C5649f(C5654c.f4257p.copy().msg("请求失败" + httpURLConnection.getResponseCode()).detail("requestType:" + i10).build());
        } catch (IOException e10) {
            throw new C5649f(C5654c.f4249h.copy().msg(e10.getMessage()).detail(Log.getStackTraceString(e10)).build());
        } catch (JSONException e11) {
            throw new C5649f(C5654c.f4250i.copy().msg(e11.getMessage()).detail("content: " + ((String) null)).build());
        }
    }

    /* renamed from: a */
    private static String m3719a(HttpURLConnection httpURLConnection) throws IOException {
        int i10;
        InputStream inputStream = httpURLConnection.getInputStream();
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        while (!Thread.interrupted() && (i10 = inputStream.read(bArr)) != -1) {
            byteArrayOutputStream.write(bArr, 0, i10);
        }
        return byteArrayOutputStream.toString("utf-8");
    }
}
