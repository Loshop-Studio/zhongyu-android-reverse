package com.tencent.bugly.crashreport.crash.p100h5;

import android.webkit.JavascriptInterface;
import androidx.autofill.HintConstants;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.C7779al;
import com.tencent.bugly.proguard.C7783ap;
import com.tencent.bugly.proguard.C7796bb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes5.dex */
public class H5JavaScriptInterface {

    /* renamed from: a */
    private static HashSet<Integer> f13562a = new HashSet<>();

    /* renamed from: b */
    private String f13563b = null;

    /* renamed from: c */
    private Thread f13564c = null;

    /* renamed from: d */
    private String f13565d = null;

    /* renamed from: e */
    private Map<String, String> f13566e = null;

    private H5JavaScriptInterface() {
    }

    /* renamed from: a */
    private static C7796bb m10458a(String str) {
        String string;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C7796bb c7796bb = new C7796bb();
                String string2 = jSONObject.getString("projectRoot");
                c7796bb.f13892a = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString("context");
                c7796bb.f13893b = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                c7796bb.f13894c = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString("userAgent");
                c7796bb.f13895d = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString(IjkMediaMeta.IJKM_KEY_LANGUAGE);
                c7796bb.f13896e = string6;
                if (string6 == null) {
                    return null;
                }
                String string7 = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                c7796bb.f13897f = string7;
                if (string7 == null || string7.equals("null") || (string = jSONObject.getString("stacktrace")) == null) {
                    return null;
                }
                int iIndexOf = string.indexOf(SignParameters.NEW_LINE);
                if (iIndexOf < 0) {
                    C7779al.m10618d("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                c7796bb.f13899h = string.substring(iIndexOf + 1);
                String strSubstring = string.substring(0, iIndexOf);
                c7796bb.f13898g = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(":");
                if (iIndexOf2 > 0) {
                    c7796bb.f13898g = c7796bb.f13898g.substring(iIndexOf2 + 1);
                }
                c7796bb.f13900i = jSONObject.getString("file");
                if (c7796bb.f13897f == null) {
                    return null;
                }
                long j10 = jSONObject.getLong("lineNumber");
                c7796bb.f13901j = j10;
                if (j10 < 0) {
                    return null;
                }
                long j11 = jSONObject.getLong("columnNumber");
                c7796bb.f13902k = j11;
                if (j11 < 0) {
                    return null;
                }
                C7779al.m10613a("H5 crash information is following: ", new Object[0]);
                C7779al.m10613a("[projectRoot]: " + c7796bb.f13892a, new Object[0]);
                C7779al.m10613a("[context]: " + c7796bb.f13893b, new Object[0]);
                C7779al.m10613a("[url]: " + c7796bb.f13894c, new Object[0]);
                C7779al.m10613a("[userAgent]: " + c7796bb.f13895d, new Object[0]);
                C7779al.m10613a("[language]: " + c7796bb.f13896e, new Object[0]);
                C7779al.m10613a("[name]: " + c7796bb.f13897f, new Object[0]);
                C7779al.m10613a("[message]: " + c7796bb.f13898g, new Object[0]);
                C7779al.m10613a("[stacktrace]: \n" + c7796bb.f13899h, new Object[0]);
                C7779al.m10613a("[file]: " + c7796bb.f13900i, new Object[0]);
                C7779al.m10613a("[lineNumber]: " + c7796bb.f13901j, new Object[0]);
                C7779al.m10613a("[columnNumber]: " + c7796bb.f13902k, new Object[0]);
                return c7796bb;
            } catch (Throwable th) {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static H5JavaScriptInterface getInstance(CrashReport.InterfaceC7755a interfaceC7755a) {
        String string = null;
        if (interfaceC7755a == null || f13562a.contains(Integer.valueOf(interfaceC7755a.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f13562a.add(Integer.valueOf(interfaceC7755a.hashCode()));
        Thread threadCurrentThread = Thread.currentThread();
        h5JavaScriptInterface.f13564c = threadCurrentThread;
        if (threadCurrentThread != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SignParameters.NEW_LINE);
            for (int i10 = 2; i10 < threadCurrentThread.getStackTrace().length; i10++) {
                StackTraceElement stackTraceElement = threadCurrentThread.getStackTrace()[i10];
                if (!stackTraceElement.toString().contains("crashreport")) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append(SignParameters.NEW_LINE);
                }
            }
            string = sb2.toString();
        }
        h5JavaScriptInterface.f13565d = string;
        HashMap map = new HashMap();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) interfaceC7755a.mo10451c());
        map.put("[WebView] ContentDescription", sb3.toString());
        h5JavaScriptInterface.f13566e = map;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        C7779al.m10618d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            C7779al.m10618d("Payload from JS is null.", new Object[0]);
            return;
        }
        String strM10678c = C7783ap.m10678c(str.getBytes());
        String str2 = this.f13563b;
        if (str2 != null && str2.equals(strM10678c)) {
            C7779al.m10618d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f13563b = strM10678c;
        C7779al.m10618d("Handling JS exception ...", new Object[0]);
        C7796bb c7796bbM10458a = m10458a(str);
        if (c7796bbM10458a == null) {
            C7779al.m10618d("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = c7796bbM10458a.f13892a;
        if (str3 != null) {
            linkedHashMap2.put("[JS] projectRoot", str3);
        }
        String str4 = c7796bbM10458a.f13893b;
        if (str4 != null) {
            linkedHashMap2.put("[JS] context", str4);
        }
        String str5 = c7796bbM10458a.f13894c;
        if (str5 != null) {
            linkedHashMap2.put("[JS] url", str5);
        }
        String str6 = c7796bbM10458a.f13895d;
        if (str6 != null) {
            linkedHashMap2.put("[JS] userAgent", str6);
        }
        String str7 = c7796bbM10458a.f13900i;
        if (str7 != null) {
            linkedHashMap2.put("[JS] file", str7);
        }
        long j10 = c7796bbM10458a.f13901j;
        if (j10 != 0) {
            linkedHashMap2.put("[JS] lineNumber", Long.toString(j10));
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.putAll(this.f13566e);
        linkedHashMap.put("Java Stack", this.f13565d);
        InnerApi.postH5CrashAsync(this.f13564c, c7796bbM10458a.f13897f, c7796bbM10458a.f13898g, c7796bbM10458a.f13899h, linkedHashMap);
    }
}
