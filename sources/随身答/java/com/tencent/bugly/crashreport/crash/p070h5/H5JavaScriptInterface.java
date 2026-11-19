package com.tencent.bugly.crashreport.crash.p070h5;

import android.webkit.JavascriptInterface;
import androidx.autofill.HintConstants;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.C6674al;
import com.tencent.bugly.proguard.C6678ap;
import com.tencent.bugly.proguard.C6691bb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class H5JavaScriptInterface {

    /* renamed from: a */
    private static HashSet<Integer> f5697a = new HashSet<>();

    /* renamed from: b */
    private String f5698b = null;

    /* renamed from: c */
    private Thread f5699c = null;

    /* renamed from: d */
    private String f5700d = null;

    /* renamed from: e */
    private Map<String, String> f5701e = null;

    private H5JavaScriptInterface() {
    }

    /* renamed from: a */
    private static C6691bb m4947a(String str) {
        String string;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C6691bb c6691bb = new C6691bb();
                String string2 = jSONObject.getString("projectRoot");
                c6691bb.f6027a = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString("context");
                c6691bb.f6028b = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                c6691bb.f6029c = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString("userAgent");
                c6691bb.f6030d = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString("language");
                c6691bb.f6031e = string6;
                if (string6 == null) {
                    return null;
                }
                String string7 = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                c6691bb.f6032f = string7;
                if (string7 == null || string7.equals("null") || (string = jSONObject.getString("stacktrace")) == null) {
                    return null;
                }
                int iIndexOf = string.indexOf(AbsSection.SEP_ORIGIN_LINE_BREAK);
                if (iIndexOf < 0) {
                    C6674al.m5107d("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                c6691bb.f6034h = string.substring(iIndexOf + 1);
                String strSubstring = string.substring(0, iIndexOf);
                c6691bb.f6033g = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(":");
                if (iIndexOf2 > 0) {
                    c6691bb.f6033g = c6691bb.f6033g.substring(iIndexOf2 + 1);
                }
                c6691bb.f6035i = jSONObject.getString("file");
                if (c6691bb.f6032f == null) {
                    return null;
                }
                long j9 = jSONObject.getLong("lineNumber");
                c6691bb.f6036j = j9;
                if (j9 < 0) {
                    return null;
                }
                long j10 = jSONObject.getLong("columnNumber");
                c6691bb.f6037k = j10;
                if (j10 < 0) {
                    return null;
                }
                C6674al.m5102a("H5 crash information is following: ", new Object[0]);
                C6674al.m5102a("[projectRoot]: " + c6691bb.f6027a, new Object[0]);
                C6674al.m5102a("[context]: " + c6691bb.f6028b, new Object[0]);
                C6674al.m5102a("[url]: " + c6691bb.f6029c, new Object[0]);
                C6674al.m5102a("[userAgent]: " + c6691bb.f6030d, new Object[0]);
                C6674al.m5102a("[language]: " + c6691bb.f6031e, new Object[0]);
                C6674al.m5102a("[name]: " + c6691bb.f6032f, new Object[0]);
                C6674al.m5102a("[message]: " + c6691bb.f6033g, new Object[0]);
                C6674al.m5102a("[stacktrace]: \n" + c6691bb.f6034h, new Object[0]);
                C6674al.m5102a("[file]: " + c6691bb.f6035i, new Object[0]);
                C6674al.m5102a("[lineNumber]: " + c6691bb.f6036j, new Object[0]);
                C6674al.m5102a("[columnNumber]: " + c6691bb.f6037k, new Object[0]);
                return c6691bb;
            } catch (Throwable th) {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static H5JavaScriptInterface getInstance(CrashReport.InterfaceC6651a interfaceC6651a) {
        String string = null;
        if (interfaceC6651a == null || f5697a.contains(Integer.valueOf(interfaceC6651a.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f5697a.add(Integer.valueOf(interfaceC6651a.hashCode()));
        Thread threadCurrentThread = Thread.currentThread();
        h5JavaScriptInterface.f5699c = threadCurrentThread;
        if (threadCurrentThread != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            for (int i9 = 2; i9 < threadCurrentThread.getStackTrace().length; i9++) {
                StackTraceElement stackTraceElement = threadCurrentThread.getStackTrace()[i9];
                if (!stackTraceElement.toString().contains("crashreport")) {
                    sb.append(stackTraceElement.toString());
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                }
            }
            string = sb.toString();
        }
        h5JavaScriptInterface.f5700d = string;
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) interfaceC6651a.mo4940c());
        map.put("[WebView] ContentDescription", sb2.toString());
        h5JavaScriptInterface.f5701e = map;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        C6674al.m5107d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            C6674al.m5107d("Payload from JS is null.", new Object[0]);
            return;
        }
        String strM5167c = C6678ap.m5167c(str.getBytes());
        String str2 = this.f5698b;
        if (str2 != null && str2.equals(strM5167c)) {
            C6674al.m5107d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f5698b = strM5167c;
        C6674al.m5107d("Handling JS exception ...", new Object[0]);
        C6691bb c6691bbM4947a = m4947a(str);
        if (c6691bbM4947a == null) {
            C6674al.m5107d("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = c6691bbM4947a.f6027a;
        if (str3 != null) {
            linkedHashMap2.put("[JS] projectRoot", str3);
        }
        String str4 = c6691bbM4947a.f6028b;
        if (str4 != null) {
            linkedHashMap2.put("[JS] context", str4);
        }
        String str5 = c6691bbM4947a.f6029c;
        if (str5 != null) {
            linkedHashMap2.put("[JS] url", str5);
        }
        String str6 = c6691bbM4947a.f6030d;
        if (str6 != null) {
            linkedHashMap2.put("[JS] userAgent", str6);
        }
        String str7 = c6691bbM4947a.f6035i;
        if (str7 != null) {
            linkedHashMap2.put("[JS] file", str7);
        }
        long j9 = c6691bbM4947a.f6036j;
        if (j9 != 0) {
            linkedHashMap2.put("[JS] lineNumber", Long.toString(j9));
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.putAll(this.f5701e);
        linkedHashMap.put("Java Stack", this.f5700d);
        InnerApi.postH5CrashAsync(this.f5699c, c6691bbM4947a.f6032f, c6691bbM4947a.f6033g, c6691bbM4947a.f6034h, linkedHashMap);
    }
}
