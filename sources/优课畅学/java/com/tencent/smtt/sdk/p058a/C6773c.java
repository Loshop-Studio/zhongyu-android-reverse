package com.tencent.smtt.sdk.p058a;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.utils.C6859p;
import com.tencent.smtt.utils.C6867x;
import com.tencent.smtt.utils.TbsLog;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.tencent.smtt.sdk.a.c */
/* loaded from: classes4.dex */
final class C6773c extends Thread {

    /* renamed from: a */
    final /* synthetic */ Context f6747a;

    /* renamed from: b */
    final /* synthetic */ C0000a f6748b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6773c(String str, Context context, C0000a c0000a) {
        super(str);
        this.f6747a = context;
        this.f6748b = c0000a;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws ProtocolException {
        String strSubstring;
        StringBuilder sb;
        String str;
        String string;
        String str2;
        JSONObject jSONObjectM5993c = null;
        if (C6772b.f6746a == null) {
            try {
                C6772b.f6746a = "65dRa93L".getBytes("utf-8");
            } catch (UnsupportedEncodingException unused) {
                C6772b.f6746a = null;
                TbsLog.m6246e("sdkreport", "Post failed -- get POST_DATA_KEY failed!");
            }
        }
        if (C6772b.f6746a == null) {
            string = "Post failed -- POST_DATA_KEY is null!";
        } else {
            String strSubstring2 = "";
            String string2 = TbsDownloadConfig.getInstance(this.f6747a).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_DESkEY_TOKEN, "");
            if (TextUtils.isEmpty(string2)) {
                strSubstring = "";
            } else {
                strSubstring2 = string2.substring(0, string2.indexOf("&"));
                strSubstring = string2.substring(string2.indexOf("&") + 1, string2.length());
            }
            boolean z10 = TextUtils.isEmpty(strSubstring2) || strSubstring2.length() != 96 || TextUtils.isEmpty(strSubstring) || strSubstring.length() != 24;
            try {
                C6867x c6867xM6387a = C6867x.m6387a();
                if (z10) {
                    str2 = c6867xM6387a.m6391b() + C6859p.m6339a().m6344b();
                } else {
                    str2 = c6867xM6387a.m6395f() + strSubstring2;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                httpURLConnection.setRequestProperty("Connection", "close");
                try {
                    jSONObjectM5993c = C6772b.m5993c(this.f6748b, this.f6747a);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (jSONObjectM5993c != null) {
                    try {
                        byte[] bytes = jSONObjectM5993c.toString().getBytes("utf-8");
                        byte[] bArrM6343a = z10 ? C6859p.m6339a().m6343a(bytes) : C6859p.m6340a(bytes, strSubstring);
                        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
                        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArrM6343a.length));
                        try {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            outputStream.write(bArrM6343a);
                            outputStream.flush();
                            if (httpURLConnection.getResponseCode() == 200) {
                                return;
                            }
                            TbsLog.m6246e("sdkreport", "Post failed -- not 200");
                            return;
                        } catch (Throwable th) {
                            sb = new StringBuilder();
                            sb.append("Post failed -- exceptions:");
                            sb.append(th.getMessage());
                            string = sb.toString();
                            TbsLog.m6246e("sdkreport", string);
                        }
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                string = "post -- jsonData is null!";
            } catch (IOException e11) {
                e = e11;
                sb = new StringBuilder();
                str = "Post failed -- IOException:";
                sb.append(str);
                sb.append(e);
                string = sb.toString();
                TbsLog.m6246e("sdkreport", string);
            } catch (AssertionError e12) {
                e = e12;
                sb = new StringBuilder();
                str = "Post failed -- AssertionError:";
                sb.append(str);
                sb.append(e);
                string = sb.toString();
                TbsLog.m6246e("sdkreport", string);
            } catch (NoClassDefFoundError e13) {
                e = e13;
                sb = new StringBuilder();
                str = "Post failed -- NoClassDefFoundError:";
                sb.append(str);
                sb.append(e);
                string = sb.toString();
                TbsLog.m6246e("sdkreport", string);
            }
        }
        TbsLog.m6246e("sdkreport", string);
    }
}
