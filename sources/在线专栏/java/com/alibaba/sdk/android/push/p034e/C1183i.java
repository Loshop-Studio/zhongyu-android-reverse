package com.alibaba.sdk.android.push.p034e;

import android.util.Log;
import com.alibaba.sdk.android.push.common.global.C1163c;
import com.alibaba.sdk.android.push.common.util.p031a.EnumC1169d;
import com.alibaba.sdk.android.push.p028a.C1158f;
import com.taobao.accs.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.push.e.i */
/* loaded from: classes.dex */
public class C1183i {
    /* renamed from: a */
    public static String m5265a(int i4, int i5, String str) throws JSONException, C1158f {
        try {
            if (i5 == 200) {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(Constants.KEY_HTTP_CODE);
                if (string.equals("OK")) {
                    return jSONObject.has(Constants.KEY_DATA) ? m5266a(i4, jSONObject.getString(Constants.KEY_DATA)) : "";
                }
                throw new C1158f(C1163c.m5175b(string, jSONObject.getString(Constants.SHARED_MESSAGE_ID_FILE)));
            }
            throw new C1158f(C1163c.f6733p.copy().msg("请求失败" + i5).detail("requestType:" + i4).build());
        } catch (JSONException e4) {
            throw new C1158f(C1163c.f6726i.copy().msg(e4.getMessage()).detail("content: " + str).build());
        }
    }

    /* renamed from: a */
    public static String m5266a(int i4, String str) throws C1158f {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (i4 == EnumC1169d.LIST_TAGS.m5185a()) {
                return jSONObject.getString("tags");
            }
            if (i4 == EnumC1169d.LIST_ALIASES.m5185a()) {
                return jSONObject.getString("alias");
            }
            if (i4 == EnumC1169d.CONFIG.m5185a()) {
                return jSONObject.getString("deviceId");
            }
            if (i4 == EnumC1169d.CHECK_PUSH_STATUS.m5185a()) {
                return jSONObject.getBoolean("status") ? "on" : "off";
            }
            throw new C1158f(C1163c.f6726i.copy().detail("unknown request type " + i4).detail("data : " + str).build());
        } catch (JSONException e4) {
            throw new C1158f(C1163c.f6726i.copy().detail(e4.getMessage()).detail("data : " + str).build());
        }
    }

    /* renamed from: a */
    public static String m5267a(int i4, HttpURLConnection httpURLConnection) throws JSONException, C1158f {
        try {
            if (httpURLConnection.getResponseCode() == 200) {
                JSONObject jSONObject = new JSONObject(m5268a(httpURLConnection));
                String string = jSONObject.getString(Constants.KEY_HTTP_CODE);
                if (string.equals("OK")) {
                    return jSONObject.has(Constants.KEY_DATA) ? m5266a(i4, jSONObject.getString(Constants.KEY_DATA)) : "";
                }
                throw new C1158f(C1163c.m5175b(string, jSONObject.getString(Constants.SHARED_MESSAGE_ID_FILE)));
            }
            throw new C1158f(C1163c.f6733p.copy().msg("请求失败" + httpURLConnection.getResponseCode()).detail("requestType:" + i4).build());
        } catch (IOException e4) {
            throw new C1158f(C1163c.f6725h.copy().msg(e4.getMessage()).detail(Log.getStackTraceString(e4)).build());
        } catch (JSONException e5) {
            throw new C1158f(C1163c.f6726i.copy().msg(e5.getMessage()).detail("content: " + ((String) null)).build());
        }
    }

    /* renamed from: a */
    private static String m5268a(HttpURLConnection httpURLConnection) {
        int i4;
        InputStream inputStream = httpURLConnection.getInputStream();
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        while (!Thread.interrupted() && (i4 = inputStream.read(bArr)) != -1) {
            byteArrayOutputStream.write(bArr, 0, i4);
        }
        return byteArrayOutputStream.toString("utf-8");
    }
}
