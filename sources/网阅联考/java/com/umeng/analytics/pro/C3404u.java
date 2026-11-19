package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3391h;
import com.umeng.analytics.vshelper.InterfaceC3420a;
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
/* loaded from: classes2.dex */
public class C3404u {

    /* renamed from: c */
    private static final int f2335c = 5;

    /* renamed from: d */
    private static JSONArray f2336d = new JSONArray();

    /* renamed from: e */
    private static Object f2337e = new Object();

    /* renamed from: f */
    private final Map<String, Long> f2340f = new HashMap();

    /* renamed from: a */
    Stack<String> f2338a = new Stack<>();

    /* renamed from: b */
    InterfaceC3420a f2339b = PageNameMonitor.getInstance();

    /* renamed from: a */
    public int mo3193a() {
        return 2;
    }

    /* renamed from: b */
    public void m3337b(String str) {
        Long l4;
        Context appContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.f2340f.containsKey(str)) {
            if (UMConfigure.isDebugLog() && this.f2338a.size() == 0) {
                UMLog.m3428aq(C3392i.f2147G, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
                return;
            }
            return;
        }
        synchronized (this.f2340f) {
            l4 = this.f2340f.get(str);
        }
        if (l4 == null) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f2338a.size() > 0 && str.equals(this.f2338a.peek())) {
            this.f2338a.pop();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l4.longValue();
        synchronized (f2337e) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3380c.f2029v, str);
                jSONObject.put("duration", jCurrentTimeMillis);
                jSONObject.put(C3380c.f2031x, l4);
                jSONObject.put("type", mo3193a());
                f2336d.put(jSONObject);
                if (f2336d.length() >= 5 && (appContext = UMGlobalContext.getAppContext(null)) != null) {
                    UMWorkDispatch.sendEvent(appContext, 4099, CoreProtocol.getInstance(appContext), null);
                }
            } catch (Throwable unused) {
            }
        }
        if (!UMConfigure.isDebugLog() || this.f2338a.size() == 0) {
            return;
        }
        UMLog.m3428aq(C3392i.f2145E, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
    }

    /* renamed from: a */
    public static void m3334a(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f2337e) {
                    string = f2336d.toString();
                    f2336d = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put("__a", new JSONArray(string));
                    if (jSONObject.length() > 0) {
                        C3391h.m3158a(context).m3177a(C3403t.m3314a().m3330c(), jSONObject, C3391h.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m3335a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f2338a.size() != 0) {
            String[] strArr = {this.f2338a.peek()};
            UMLog.m3428aq(C3392i.f2146F, 0, "\\|", new String[]{"@"}, strArr, null, null);
        }
        this.f2339b.customPageBegin(str);
        synchronized (this.f2340f) {
            this.f2340f.put(str, Long.valueOf(System.currentTimeMillis()));
            if (UMConfigure.isDebugLog()) {
                this.f2338a.push(str);
            }
        }
    }

    /* renamed from: b */
    public void m3336b() {
        String key;
        synchronized (this.f2340f) {
            key = null;
            long j4 = 0;
            for (Map.Entry<String, Long> entry : this.f2340f.entrySet()) {
                if (entry.getValue().longValue() > j4) {
                    long jLongValue = entry.getValue().longValue();
                    key = entry.getKey();
                    j4 = jLongValue;
                }
            }
        }
        if (key != null) {
            m3337b(key);
        }
    }
}
