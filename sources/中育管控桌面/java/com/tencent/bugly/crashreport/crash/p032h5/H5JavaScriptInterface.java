package com.tencent.bugly.crashreport.crash.p032h5;

import android.webkit.JavascriptInterface;
import androidx.autofill.HintConstants;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.C5791al;
import com.tencent.bugly.proguard.C5795ap;
import com.tencent.bugly.proguard.C5808bb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class H5JavaScriptInterface {

    /* renamed from: a */
    private static HashSet<Integer> f3841a = new HashSet<>();

    /* renamed from: b */
    private String f3842b = null;

    /* renamed from: c */
    private Thread f3843c = null;

    /* renamed from: d */
    private String f3844d = null;

    /* renamed from: e */
    private Map<String, String> f3845e = null;

    private H5JavaScriptInterface() {
    }

    /* renamed from: a */
    private static C5808bb m3773a(String str) {
        String string;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C5808bb c5808bb = new C5808bb();
                String string2 = jSONObject.getString("projectRoot");
                c5808bb.f4171a = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString("context");
                c5808bb.f4172b = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                c5808bb.f4173c = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString("userAgent");
                c5808bb.f4174d = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString("language");
                c5808bb.f4175e = string6;
                if (string6 == null) {
                    return null;
                }
                String string7 = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                c5808bb.f4176f = string7;
                if (string7 == null || string7.equals("null") || (string = jSONObject.getString("stacktrace")) == null) {
                    return null;
                }
                int iIndexOf = string.indexOf(SignParameters.NEW_LINE);
                if (iIndexOf < 0) {
                    C5791al.m3933d("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                c5808bb.f4178h = string.substring(iIndexOf + 1);
                String strSubstring = string.substring(0, iIndexOf);
                c5808bb.f4177g = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(":");
                if (iIndexOf2 > 0) {
                    c5808bb.f4177g = c5808bb.f4177g.substring(iIndexOf2 + 1);
                }
                c5808bb.f4179i = jSONObject.getString("file");
                if (c5808bb.f4176f == null) {
                    return null;
                }
                long j6 = jSONObject.getLong("lineNumber");
                c5808bb.f4180j = j6;
                if (j6 < 0) {
                    return null;
                }
                long j7 = jSONObject.getLong("columnNumber");
                c5808bb.f4181k = j7;
                if (j7 < 0) {
                    return null;
                }
                C5791al.m3928a("H5 crash information is following: ", new Object[0]);
                C5791al.m3928a("[projectRoot]: " + c5808bb.f4171a, new Object[0]);
                C5791al.m3928a("[context]: " + c5808bb.f4172b, new Object[0]);
                C5791al.m3928a("[url]: " + c5808bb.f4173c, new Object[0]);
                C5791al.m3928a("[userAgent]: " + c5808bb.f4174d, new Object[0]);
                C5791al.m3928a("[language]: " + c5808bb.f4175e, new Object[0]);
                C5791al.m3928a("[name]: " + c5808bb.f4176f, new Object[0]);
                C5791al.m3928a("[message]: " + c5808bb.f4177g, new Object[0]);
                C5791al.m3928a("[stacktrace]: \n" + c5808bb.f4178h, new Object[0]);
                C5791al.m3928a("[file]: " + c5808bb.f4179i, new Object[0]);
                C5791al.m3928a("[lineNumber]: " + c5808bb.f4180j, new Object[0]);
                C5791al.m3928a("[columnNumber]: " + c5808bb.f4181k, new Object[0]);
                return c5808bb;
            } catch (Throwable th) {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static H5JavaScriptInterface getInstance(CrashReport.InterfaceC5768a interfaceC5768a) {
        String string = null;
        if (interfaceC5768a == null || f3841a.contains(Integer.valueOf(interfaceC5768a.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f3841a.add(Integer.valueOf(interfaceC5768a.hashCode()));
        Thread threadCurrentThread = Thread.currentThread();
        h5JavaScriptInterface.f3843c = threadCurrentThread;
        if (threadCurrentThread != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(SignParameters.NEW_LINE);
            for (int i6 = 2; i6 < threadCurrentThread.getStackTrace().length; i6++) {
                StackTraceElement stackTraceElement = threadCurrentThread.getStackTrace()[i6];
                if (!stackTraceElement.toString().contains("crashreport")) {
                    sb.append(stackTraceElement.toString());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            string = sb.toString();
        }
        h5JavaScriptInterface.f3844d = string;
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) interfaceC5768a.mo3766c());
        map.put("[WebView] ContentDescription", sb2.toString());
        h5JavaScriptInterface.f3845e = map;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        C5791al.m3933d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            C5791al.m3933d("Payload from JS is null.", new Object[0]);
            return;
        }
        String strM3993c = C5795ap.m3993c(str.getBytes());
        String str2 = this.f3842b;
        if (str2 != null && str2.equals(strM3993c)) {
            C5791al.m3933d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f3842b = strM3993c;
        C5791al.m3933d("Handling JS exception ...", new Object[0]);
        C5808bb c5808bbM3773a = m3773a(str);
        if (c5808bbM3773a == null) {
            C5791al.m3933d("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = c5808bbM3773a.f4171a;
        if (str3 != null) {
            linkedHashMap2.put("[JS] projectRoot", str3);
        }
        String str4 = c5808bbM3773a.f4172b;
        if (str4 != null) {
            linkedHashMap2.put("[JS] context", str4);
        }
        String str5 = c5808bbM3773a.f4173c;
        if (str5 != null) {
            linkedHashMap2.put("[JS] url", str5);
        }
        String str6 = c5808bbM3773a.f4174d;
        if (str6 != null) {
            linkedHashMap2.put("[JS] userAgent", str6);
        }
        String str7 = c5808bbM3773a.f4179i;
        if (str7 != null) {
            linkedHashMap2.put("[JS] file", str7);
        }
        long j6 = c5808bbM3773a.f4180j;
        if (j6 != 0) {
            linkedHashMap2.put("[JS] lineNumber", Long.toString(j6));
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.putAll(this.f3845e);
        linkedHashMap.put("Java Stack", this.f3844d);
        InnerApi.postH5CrashAsync(this.f3843c, c5808bbM3773a.f4176f, c5808bbM3773a.f4177g, c5808bbM3773a.f4178h, linkedHashMap);
    }
}
