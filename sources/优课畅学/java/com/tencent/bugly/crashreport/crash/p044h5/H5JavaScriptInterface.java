package com.tencent.bugly.crashreport.crash.p044h5;

import android.webkit.JavascriptInterface;
import androidx.autofill.HintConstants;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.C6436al;
import com.tencent.bugly.proguard.C6440ap;
import com.tencent.bugly.proguard.C6453bb;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class H5JavaScriptInterface {

    /* renamed from: a */
    private static HashSet<Integer> f4463a = new HashSet<>();

    /* renamed from: b */
    private String f4464b = null;

    /* renamed from: c */
    private Thread f4465c = null;

    /* renamed from: d */
    private String f4466d = null;

    /* renamed from: e */
    private Map<String, String> f4467e = null;

    private H5JavaScriptInterface() {
    }

    /* renamed from: a */
    private static C6453bb m4128a(String str) {
        String string;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C6453bb c6453bb = new C6453bb();
                String string2 = jSONObject.getString("projectRoot");
                c6453bb.f4793a = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString("context");
                c6453bb.f4794b = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
                c6453bb.f4795c = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString("userAgent");
                c6453bb.f4796d = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString(IjkMediaMeta.IJKM_KEY_LANGUAGE);
                c6453bb.f4797e = string6;
                if (string6 == null) {
                    return null;
                }
                String string7 = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                c6453bb.f4798f = string7;
                if (string7 == null || string7.equals("null") || (string = jSONObject.getString("stacktrace")) == null) {
                    return null;
                }
                int iIndexOf = string.indexOf(SignParameters.NEW_LINE);
                if (iIndexOf < 0) {
                    C6436al.m4288d("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                c6453bb.f4800h = string.substring(iIndexOf + 1);
                String strSubstring = string.substring(0, iIndexOf);
                c6453bb.f4799g = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(":");
                if (iIndexOf2 > 0) {
                    c6453bb.f4799g = c6453bb.f4799g.substring(iIndexOf2 + 1);
                }
                c6453bb.f4801i = jSONObject.getString("file");
                if (c6453bb.f4798f == null) {
                    return null;
                }
                long j10 = jSONObject.getLong("lineNumber");
                c6453bb.f4802j = j10;
                if (j10 < 0) {
                    return null;
                }
                long j11 = jSONObject.getLong("columnNumber");
                c6453bb.f4803k = j11;
                if (j11 < 0) {
                    return null;
                }
                C6436al.m4283a("H5 crash information is following: ", new Object[0]);
                C6436al.m4283a("[projectRoot]: " + c6453bb.f4793a, new Object[0]);
                C6436al.m4283a("[context]: " + c6453bb.f4794b, new Object[0]);
                C6436al.m4283a("[url]: " + c6453bb.f4795c, new Object[0]);
                C6436al.m4283a("[userAgent]: " + c6453bb.f4796d, new Object[0]);
                C6436al.m4283a("[language]: " + c6453bb.f4797e, new Object[0]);
                C6436al.m4283a("[name]: " + c6453bb.f4798f, new Object[0]);
                C6436al.m4283a("[message]: " + c6453bb.f4799g, new Object[0]);
                C6436al.m4283a("[stacktrace]: \n" + c6453bb.f4800h, new Object[0]);
                C6436al.m4283a("[file]: " + c6453bb.f4801i, new Object[0]);
                C6436al.m4283a("[lineNumber]: " + c6453bb.f4802j, new Object[0]);
                C6436al.m4283a("[columnNumber]: " + c6453bb.f4803k, new Object[0]);
                return c6453bb;
            } catch (Throwable th) {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static H5JavaScriptInterface getInstance(CrashReport.InterfaceC6413a interfaceC6413a) {
        String string = null;
        if (interfaceC6413a == null || f4463a.contains(Integer.valueOf(interfaceC6413a.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f4463a.add(Integer.valueOf(interfaceC6413a.hashCode()));
        Thread threadCurrentThread = Thread.currentThread();
        h5JavaScriptInterface.f4465c = threadCurrentThread;
        if (threadCurrentThread != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(SignParameters.NEW_LINE);
            for (int i10 = 2; i10 < threadCurrentThread.getStackTrace().length; i10++) {
                StackTraceElement stackTraceElement = threadCurrentThread.getStackTrace()[i10];
                if (!stackTraceElement.toString().contains("crashreport")) {
                    sb.append(stackTraceElement.toString());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            string = sb.toString();
        }
        h5JavaScriptInterface.f4466d = string;
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) interfaceC6413a.mo4121c());
        map.put("[WebView] ContentDescription", sb2.toString());
        h5JavaScriptInterface.f4467e = map;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        C6436al.m4288d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            C6436al.m4288d("Payload from JS is null.", new Object[0]);
            return;
        }
        String strM4348c = C6440ap.m4348c(str.getBytes());
        String str2 = this.f4464b;
        if (str2 != null && str2.equals(strM4348c)) {
            C6436al.m4288d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f4464b = strM4348c;
        C6436al.m4288d("Handling JS exception ...", new Object[0]);
        C6453bb c6453bbM4128a = m4128a(str);
        if (c6453bbM4128a == null) {
            C6436al.m4288d("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = c6453bbM4128a.f4793a;
        if (str3 != null) {
            linkedHashMap2.put("[JS] projectRoot", str3);
        }
        String str4 = c6453bbM4128a.f4794b;
        if (str4 != null) {
            linkedHashMap2.put("[JS] context", str4);
        }
        String str5 = c6453bbM4128a.f4795c;
        if (str5 != null) {
            linkedHashMap2.put("[JS] url", str5);
        }
        String str6 = c6453bbM4128a.f4796d;
        if (str6 != null) {
            linkedHashMap2.put("[JS] userAgent", str6);
        }
        String str7 = c6453bbM4128a.f4801i;
        if (str7 != null) {
            linkedHashMap2.put("[JS] file", str7);
        }
        long j10 = c6453bbM4128a.f4802j;
        if (j10 != 0) {
            linkedHashMap2.put("[JS] lineNumber", Long.toString(j10));
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.putAll(this.f4467e);
        linkedHashMap.put("Java Stack", this.f4466d);
        InnerApi.postH5CrashAsync(this.f4465c, c6453bbM4128a.f4798f, c6453bbM4128a.f4799g, c6453bbM4128a.f4800h, linkedHashMap);
    }
}
