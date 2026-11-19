package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C1907h;
import com.umeng.analytics.pro.C1913n;
import com.umeng.analytics.vshelper.InterfaceC1936a;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.u */
/* loaded from: classes.dex */
public class C1920u {

    /* renamed from: c */
    private static final int f8927c = 5;

    /* renamed from: d */
    private static JSONArray f8928d = new JSONArray();

    /* renamed from: e */
    private static Object f8929e = new Object();

    /* renamed from: f */
    private final Map<String, Long> f8932f = new HashMap();

    /* renamed from: a */
    Stack<String> f8930a = new Stack<>();

    /* renamed from: b */
    InterfaceC1936a f8931b = PageNameMonitor.getInstance();

    /* renamed from: a */
    public static void m7257a(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f8929e) {
                    string = f8928d.toString();
                    f8928d = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put("__a", new JSONArray(string));
                    if (jSONObject.length() > 0) {
                        C1907h.m7081a(context).m7100a(C1919t.m7237a().m7253c(), jSONObject, C1907h.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    protected int mo7116a() {
        return 2;
    }

    /* renamed from: b */
    public void m7260b(String str) {
        Long l3;
        Context appContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.f8932f.containsKey(str)) {
            if (UMConfigure.isDebugLog() && this.f8930a.size() == 0) {
                UMLog.m7351aq(C1908i.f8739G, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
                return;
            }
            return;
        }
        synchronized (this.f8932f) {
            l3 = this.f8932f.get(str);
        }
        if (l3 == null) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f8930a.size() > 0 && str.equals(this.f8930a.peek())) {
            this.f8930a.pop();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l3.longValue();
        synchronized (f8929e) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C1896c.f8621v, str);
                jSONObject.put("duration", jCurrentTimeMillis);
                jSONObject.put(C1896c.f8623x, l3);
                jSONObject.put("type", mo7116a());
                f8928d.put(jSONObject);
                if (f8928d.length() >= 5 && (appContext = UMGlobalContext.getAppContext(null)) != null) {
                    UMWorkDispatch.sendEvent(appContext, C1913n.a.f8861c, CoreProtocol.getInstance(appContext), null);
                }
            } catch (Throwable unused) {
            }
        }
        if (!UMConfigure.isDebugLog() || this.f8930a.size() == 0) {
            return;
        }
        UMLog.m7351aq(C1908i.f8737E, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
    }

    /* renamed from: a */
    public void m7258a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f8930a.size() != 0) {
            UMLog.m7351aq(C1908i.f8738F, 0, "\\|", new String[]{"@"}, new String[]{this.f8930a.peek()}, null, null);
        }
        this.f8931b.customPageBegin(str);
        synchronized (this.f8932f) {
            this.f8932f.put(str, Long.valueOf(System.currentTimeMillis()));
            if (UMConfigure.isDebugLog()) {
                this.f8930a.push(str);
            }
        }
    }

    /* renamed from: b */
    public void m7259b() {
        String key;
        synchronized (this.f8932f) {
            key = null;
            long j4 = 0;
            for (Map.Entry<String, Long> entry : this.f8932f.entrySet()) {
                if (entry.getValue().longValue() > j4) {
                    long jLongValue = entry.getValue().longValue();
                    key = entry.getKey();
                    j4 = jLongValue;
                }
            }
        }
        if (key != null) {
            m7260b(key);
        }
    }
}
