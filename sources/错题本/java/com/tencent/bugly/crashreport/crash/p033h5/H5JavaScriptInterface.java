package com.tencent.bugly.crashreport.crash.p033h5;

import android.webkit.JavascriptInterface;
import androidx.autofill.HintConstants;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.C4055al;
import com.tencent.bugly.proguard.C4059ap;
import com.tencent.bugly.proguard.C4074bb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class H5JavaScriptInterface {

    /* renamed from: a */
    private static HashSet<Integer> f3354a = new HashSet<>();

    /* renamed from: b */
    private String f3355b = null;

    /* renamed from: c */
    private Thread f3356c = null;

    /* renamed from: d */
    private String f3357d = null;

    /* renamed from: e */
    private Map<String, String> f3358e = null;

    private H5JavaScriptInterface() {
    }

    /* renamed from: a */
    private static C4074bb m2867a(String str) {
        String string;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C4074bb c4074bb = new C4074bb();
                String string2 = jSONObject.getString("projectRoot");
                c4074bb.f3652a = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString("context");
                c4074bb.f3653b = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                c4074bb.f3654c = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString("userAgent");
                c4074bb.f3655d = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString("language");
                c4074bb.f3656e = string6;
                if (string6 == null) {
                    return null;
                }
                String string7 = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                c4074bb.f3657f = string7;
                if (string7 == null || string7.equals("null") || (string = jSONObject.getString("stacktrace")) == null) {
                    return null;
                }
                int iIndexOf = string.indexOf(SignParameters.NEW_LINE);
                if (iIndexOf < 0) {
                    C4055al.m3026d("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                c4074bb.f3659h = string.substring(iIndexOf + 1);
                String strSubstring = string.substring(0, iIndexOf);
                c4074bb.f3658g = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(":");
                if (iIndexOf2 > 0) {
                    c4074bb.f3658g = c4074bb.f3658g.substring(iIndexOf2 + 1);
                }
                c4074bb.f3660i = jSONObject.getString("file");
                if (c4074bb.f3657f == null) {
                    return null;
                }
                long j7 = jSONObject.getLong("lineNumber");
                c4074bb.f3661j = j7;
                if (j7 < 0) {
                    return null;
                }
                long j8 = jSONObject.getLong("columnNumber");
                c4074bb.f3662k = j8;
                if (j8 < 0) {
                    return null;
                }
                C4055al.m3021a("H5 crash information is following: ", new Object[0]);
                C4055al.m3021a("[projectRoot]: " + c4074bb.f3652a, new Object[0]);
                C4055al.m3021a("[context]: " + c4074bb.f3653b, new Object[0]);
                C4055al.m3021a("[url]: " + c4074bb.f3654c, new Object[0]);
                C4055al.m3021a("[userAgent]: " + c4074bb.f3655d, new Object[0]);
                C4055al.m3021a("[language]: " + c4074bb.f3656e, new Object[0]);
                C4055al.m3021a("[name]: " + c4074bb.f3657f, new Object[0]);
                C4055al.m3021a("[message]: " + c4074bb.f3658g, new Object[0]);
                C4055al.m3021a("[stacktrace]: \n" + c4074bb.f3659h, new Object[0]);
                C4055al.m3021a("[file]: " + c4074bb.f3660i, new Object[0]);
                C4055al.m3021a("[lineNumber]: " + c4074bb.f3661j, new Object[0]);
                C4055al.m3021a("[columnNumber]: " + c4074bb.f3662k, new Object[0]);
                return c4074bb;
            } catch (Throwable th) {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static H5JavaScriptInterface getInstance(CrashReport.InterfaceC4034a interfaceC4034a) {
        String string = null;
        if (interfaceC4034a == null || f3354a.contains(Integer.valueOf(interfaceC4034a.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f3354a.add(Integer.valueOf(interfaceC4034a.hashCode()));
        Thread threadCurrentThread = Thread.currentThread();
        h5JavaScriptInterface.f3356c = threadCurrentThread;
        if (threadCurrentThread != null) {
            StringBuilder sb = new StringBuilder(SignParameters.NEW_LINE);
            for (int i = 2; i < threadCurrentThread.getStackTrace().length; i++) {
                StackTraceElement stackTraceElement = threadCurrentThread.getStackTrace()[i];
                if (!stackTraceElement.toString().contains("crashreport")) {
                    sb.append(stackTraceElement.toString());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            string = sb.toString();
        }
        h5JavaScriptInterface.f3357d = string;
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) interfaceC4034a.mo2860c());
        map.put("[WebView] ContentDescription", sb2.toString());
        h5JavaScriptInterface.f3358e = map;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        C4055al.m3026d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            C4055al.m3026d("Payload from JS is null.", new Object[0]);
            return;
        }
        String strM3086c = C4059ap.m3086c(str.getBytes());
        String str2 = this.f3355b;
        if (str2 != null && str2.equals(strM3086c)) {
            C4055al.m3026d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f3355b = strM3086c;
        C4055al.m3026d("Handling JS exception ...", new Object[0]);
        C4074bb c4074bbM2867a = m2867a(str);
        if (c4074bbM2867a == null) {
            C4055al.m3026d("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = c4074bbM2867a.f3652a;
        if (str3 != null) {
            linkedHashMap2.put("[JS] projectRoot", str3);
        }
        String str4 = c4074bbM2867a.f3653b;
        if (str4 != null) {
            linkedHashMap2.put("[JS] context", str4);
        }
        String str5 = c4074bbM2867a.f3654c;
        if (str5 != null) {
            linkedHashMap2.put("[JS] url", str5);
        }
        String str6 = c4074bbM2867a.f3655d;
        if (str6 != null) {
            linkedHashMap2.put("[JS] userAgent", str6);
        }
        String str7 = c4074bbM2867a.f3660i;
        if (str7 != null) {
            linkedHashMap2.put("[JS] file", str7);
        }
        long j7 = c4074bbM2867a.f3661j;
        if (j7 != 0) {
            linkedHashMap2.put("[JS] lineNumber", Long.toString(j7));
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.putAll(this.f3358e);
        linkedHashMap.put("Java Stack", this.f3357d);
        InnerApi.postH5CrashAsync(this.f3356c, c4074bbM2867a.f3657f, c4074bbM2867a.f3658g, c4074bbM2867a.f3659h, linkedHashMap);
    }
}
