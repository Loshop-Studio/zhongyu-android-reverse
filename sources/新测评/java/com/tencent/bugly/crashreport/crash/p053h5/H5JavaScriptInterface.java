package com.tencent.bugly.crashreport.crash.p053h5;

import android.webkit.JavascriptInterface;
import androidx.autofill.HintConstants;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.C6414al;
import com.tencent.bugly.proguard.C6418ap;
import com.tencent.bugly.proguard.C6431bb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class H5JavaScriptInterface {

    /* renamed from: a */
    private static HashSet<Integer> f5120a = new HashSet<>();

    /* renamed from: b */
    private String f5121b = null;

    /* renamed from: c */
    private Thread f5122c = null;

    /* renamed from: d */
    private String f5123d = null;

    /* renamed from: e */
    private Map<String, String> f5124e = null;

    private H5JavaScriptInterface() {
    }

    /* renamed from: a */
    private static C6431bb m4768a(String str) {
        String string;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C6431bb c6431bb = new C6431bb();
                String string2 = jSONObject.getString("projectRoot");
                c6431bb.f5450a = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString("context");
                c6431bb.f5451b = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                c6431bb.f5452c = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString("userAgent");
                c6431bb.f5453d = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString("language");
                c6431bb.f5454e = string6;
                if (string6 == null) {
                    return null;
                }
                String string7 = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                c6431bb.f5455f = string7;
                if (string7 == null || string7.equals("null") || (string = jSONObject.getString("stacktrace")) == null) {
                    return null;
                }
                int iIndexOf = string.indexOf(SignParameters.NEW_LINE);
                if (iIndexOf < 0) {
                    C6414al.m4928d("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                c6431bb.f5457h = string.substring(iIndexOf + 1);
                String strSubstring = string.substring(0, iIndexOf);
                c6431bb.f5456g = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(":");
                if (iIndexOf2 > 0) {
                    c6431bb.f5456g = c6431bb.f5456g.substring(iIndexOf2 + 1);
                }
                c6431bb.f5458i = jSONObject.getString("file");
                if (c6431bb.f5455f == null) {
                    return null;
                }
                long j10 = jSONObject.getLong("lineNumber");
                c6431bb.f5459j = j10;
                if (j10 < 0) {
                    return null;
                }
                long j11 = jSONObject.getLong("columnNumber");
                c6431bb.f5460k = j11;
                if (j11 < 0) {
                    return null;
                }
                C6414al.m4923a("H5 crash information is following: ", new Object[0]);
                C6414al.m4923a("[projectRoot]: " + c6431bb.f5450a, new Object[0]);
                C6414al.m4923a("[context]: " + c6431bb.f5451b, new Object[0]);
                C6414al.m4923a("[url]: " + c6431bb.f5452c, new Object[0]);
                C6414al.m4923a("[userAgent]: " + c6431bb.f5453d, new Object[0]);
                C6414al.m4923a("[language]: " + c6431bb.f5454e, new Object[0]);
                C6414al.m4923a("[name]: " + c6431bb.f5455f, new Object[0]);
                C6414al.m4923a("[message]: " + c6431bb.f5456g, new Object[0]);
                C6414al.m4923a("[stacktrace]: \n" + c6431bb.f5457h, new Object[0]);
                C6414al.m4923a("[file]: " + c6431bb.f5458i, new Object[0]);
                C6414al.m4923a("[lineNumber]: " + c6431bb.f5459j, new Object[0]);
                C6414al.m4923a("[columnNumber]: " + c6431bb.f5460k, new Object[0]);
                return c6431bb;
            } catch (Throwable th) {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static H5JavaScriptInterface getInstance(CrashReport.InterfaceC6391a interfaceC6391a) {
        String string = null;
        if (interfaceC6391a == null || f5120a.contains(Integer.valueOf(interfaceC6391a.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f5120a.add(Integer.valueOf(interfaceC6391a.hashCode()));
        Thread threadCurrentThread = Thread.currentThread();
        h5JavaScriptInterface.f5122c = threadCurrentThread;
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
        h5JavaScriptInterface.f5123d = string;
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) interfaceC6391a.mo4761c());
        map.put("[WebView] ContentDescription", sb2.toString());
        h5JavaScriptInterface.f5124e = map;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        C6414al.m4928d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            C6414al.m4928d("Payload from JS is null.", new Object[0]);
            return;
        }
        String strM4988c = C6418ap.m4988c(str.getBytes());
        String str2 = this.f5121b;
        if (str2 != null && str2.equals(strM4988c)) {
            C6414al.m4928d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f5121b = strM4988c;
        C6414al.m4928d("Handling JS exception ...", new Object[0]);
        C6431bb c6431bbM4768a = m4768a(str);
        if (c6431bbM4768a == null) {
            C6414al.m4928d("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = c6431bbM4768a.f5450a;
        if (str3 != null) {
            linkedHashMap2.put("[JS] projectRoot", str3);
        }
        String str4 = c6431bbM4768a.f5451b;
        if (str4 != null) {
            linkedHashMap2.put("[JS] context", str4);
        }
        String str5 = c6431bbM4768a.f5452c;
        if (str5 != null) {
            linkedHashMap2.put("[JS] url", str5);
        }
        String str6 = c6431bbM4768a.f5453d;
        if (str6 != null) {
            linkedHashMap2.put("[JS] userAgent", str6);
        }
        String str7 = c6431bbM4768a.f5458i;
        if (str7 != null) {
            linkedHashMap2.put("[JS] file", str7);
        }
        long j10 = c6431bbM4768a.f5459j;
        if (j10 != 0) {
            linkedHashMap2.put("[JS] lineNumber", Long.toString(j10));
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.putAll(this.f5124e);
        linkedHashMap.put("Java Stack", this.f5123d);
        InnerApi.postH5CrashAsync(this.f5122c, c6431bbM4768a.f5455f, c6431bbM4768a.f5456g, c6431bbM4768a.f5457h, linkedHashMap);
    }
}
