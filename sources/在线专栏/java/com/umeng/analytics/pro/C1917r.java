package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C1913n;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.r */
/* loaded from: classes.dex */
public class C1917r {

    /* renamed from: a */
    private static final String f8904a = "fs_lc_tl_uapp";

    /* renamed from: f */
    private static final String f8905f = "-1";

    /* renamed from: g */
    private static Context f8906g;

    /* renamed from: b */
    private final int f8907b;

    /* renamed from: c */
    private final int f8908c;

    /* renamed from: d */
    private final int f8909d;

    /* renamed from: e */
    private final int f8910e;

    /* renamed from: h */
    private JSONObject f8911h;

    /* renamed from: com.umeng.analytics.pro.r$a */
    private static class a {

        /* renamed from: a */
        private static final C1917r f8912a = new C1917r();

        private a() {
        }
    }

    /* renamed from: a */
    public static C1917r m7220a(Context context) {
        if (f8906g == null && context != null) {
            f8906g = context.getApplicationContext();
        }
        return a.f8912a;
    }

    /* renamed from: b */
    private void m7226b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f8904a, null);
            if (!TextUtils.isEmpty(string)) {
                this.f8911h = new JSONObject(string);
            }
            m7222a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m7229c(Context context) {
        try {
            if (this.f8911h != null) {
                PreferenceWrapper.getDefault(f8906g).edit().putString(f8904a, this.f8911h.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private C1917r() {
        this.f8907b = 128;
        this.f8908c = 256;
        this.f8909d = 1024;
        this.f8910e = 10;
        this.f8911h = null;
        try {
            m7226b(f8906g);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private boolean m7230c(String str) {
        if (str == null) {
            return true;
        }
        try {
            return str.trim().getBytes().length <= 1024;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void m7231a(String str, String str2, long j4, int i4, String str3) {
        String strM7275a;
        try {
            if (m7225a(str) && m7227b(str2)) {
                if (Arrays.asList(C1896c.f8573aG).contains(str)) {
                    MLog.m7570e("key is " + str + ", please check key, illegal");
                    UMLog.m7349aq(C1908i.f8789m, 0, "\\|");
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", jCurrentTimeMillis);
                if (j4 > 0) {
                    jSONObject.put(C1896c.f8562W, j4);
                }
                jSONObject.put("__t", C1907h.f8713a);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(str, str2);
                }
                if (UMUtils.isMainProgress(f8906g)) {
                    strM7275a = C1923x.m7267a().m7282d(UMGlobalContext.getAppContext(f8906g));
                } else {
                    strM7275a = C1923x.m7267a().m7275a(UMGlobalContext.getAppContext(f8906g), jCurrentTimeMillis);
                }
                if (TextUtils.isEmpty(strM7275a)) {
                    strM7275a = f8905f;
                }
                jSONObject.put("__i", strM7275a);
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C1896c.f8595au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f8906g).getProcessName(f8906g));
                m7222a();
                JSONObject jSONObject3 = this.f8911h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f8911h.get(str)).booleanValue()) {
                    jSONObject.put(C1896c.f8564Y, 1);
                    this.f8911h.put(str, true);
                    m7229c(f8906g);
                }
                Context context = f8906g;
                UMWorkDispatch.sendEvent(context, C1913n.a.f8859a, CoreProtocol.getInstance(context), jSONObject);
                return;
            }
            UMLog.m7349aq(C1908i.f8788l, 0, "\\|");
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    private boolean m7227b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
        } catch (Exception unused) {
        }
        MLog.m7570e("value is " + str + ", please check value, illegal");
        return false;
    }

    /* renamed from: b */
    private boolean m7228b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!m7225a(entry.getKey())) {
                            UMLog.m7349aq(C1908i.f8784h, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() == null) {
                            UMLog.m7349aq(C1908i.f8785i, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() instanceof String) {
                            if (C1896c.f8571aE.equals(entry.getKey())) {
                                if (!m7230c(entry.getValue().toString())) {
                                    UMLog.m7349aq(C1908i.f8748P, 0, "\\|");
                                    return false;
                                }
                            } else if ("_$!url".equals(entry.getKey())) {
                                if (!m7230c(entry.getValue().toString())) {
                                    UMLog.m7349aq("url参数长度超过限制。|参数url长度不能超过1024字符。", 0, "\\|");
                                    return false;
                                }
                            } else if (!m7227b(entry.getValue().toString())) {
                                UMLog.m7349aq(C1908i.f8786j, 0, "\\|");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                return true;
            }
        }
        UMLog.m7349aq(C1908i.f8783g, 0, "\\|");
        return false;
    }

    /* renamed from: a */
    public void m7232a(String str, Map<String, Object> map, long j4, String str2, boolean z3) {
        String strM7275a;
        try {
            if (!m7225a(str)) {
                UMLog.m7349aq(C1908i.f8782f, 0, "\\|");
                return;
            }
            if (m7228b(map)) {
                if (map.size() > 100) {
                    MLog.m7570e("map size is " + map.size() + ", please check");
                    return;
                }
                if (Arrays.asList(C1896c.f8573aG).contains(str)) {
                    MLog.m7570e("key is " + str + ", please check key, illegal");
                    UMLog.m7349aq(C1908i.f8778b, 0, "\\|");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j4 > 0) {
                    jSONObject.put(C1896c.f8562W, j4);
                }
                jSONObject.put("__t", C1907h.f8713a);
                ULog.m7606i("befort ekv map, event is " + jSONObject.toString());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!Arrays.asList(C1896c.f8573aG).contains(entry.getKey())) {
                        Object value = entry.getValue();
                        if (!(value instanceof String) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Short) && !(value instanceof Float) && !(value instanceof Double)) {
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    if (iArr.length > 10) {
                                        MLog.m7570e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray = new JSONArray();
                                    for (int i4 : iArr) {
                                        jSONArray.put(i4);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    if (dArr.length > 10) {
                                        MLog.m7570e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray2 = new JSONArray();
                                    for (double d4 : dArr) {
                                        jSONArray2.put(d4);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    if (jArr.length > 10) {
                                        MLog.m7570e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray3 = new JSONArray();
                                    for (long j5 : jArr) {
                                        jSONArray3.put(j5);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    if (fArr.length > 10) {
                                        MLog.m7570e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray4 = new JSONArray();
                                    for (float f4 : fArr) {
                                        jSONArray4.put(f4);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    if (sArr.length > 10) {
                                        MLog.m7570e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray5 = new JSONArray();
                                    for (short s3 : sArr) {
                                        jSONArray5.put((int) s3);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray5);
                                } else if (value instanceof String[]) {
                                    String[] strArr = (String[]) value;
                                    if (strArr.length > 10) {
                                        MLog.m7570e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray6 = new JSONArray();
                                    for (int i5 = 0; i5 < strArr.length; i5++) {
                                        if (strArr[i5] == null) {
                                            MLog.m7570e("please check array, null item!");
                                            return;
                                        } else {
                                            if (!m7227b(strArr[i5])) {
                                                return;
                                            }
                                            jSONArray6.put(strArr[i5]);
                                        }
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray6);
                                } else {
                                    MLog.m7570e("please check key or value, illegal type!");
                                    return;
                                }
                            } else {
                                MLog.m7570e("please check key or value, illegal type!");
                                return;
                            }
                        } else {
                            jSONObject.put(entry.getKey(), value);
                        }
                    } else {
                        UMLog.m7349aq(C1908i.f8781e, 0, "\\|");
                        return;
                    }
                }
                if (UMUtils.isMainProgress(f8906g)) {
                    strM7275a = C1923x.m7267a().m7282d(UMGlobalContext.getAppContext(f8906g));
                } else {
                    strM7275a = C1923x.m7267a().m7275a(UMGlobalContext.getAppContext(f8906g), jSONObject.getLong("ts"));
                }
                if (TextUtils.isEmpty(strM7275a)) {
                    strM7275a = f8905f;
                }
                jSONObject.put("__i", strM7275a);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C1896c.f8595au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f8906g).getProcessName(f8906g));
                m7222a();
                JSONObject jSONObject3 = this.f8911h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f8911h.get(str)).booleanValue()) {
                    jSONObject.put(C1896c.f8564Y, 1);
                    this.f8911h.put(str, true);
                    m7229c(f8906g);
                }
                ULog.m7606i("----->>>>>ekv event json is " + jSONObject.toString());
                if (!z3) {
                    Context context = f8906g;
                    UMWorkDispatch.sendEvent(context, C1913n.a.f8859a, CoreProtocol.getInstance(context), jSONObject);
                } else {
                    Context context2 = f8906g;
                    UMWorkDispatch.sendEvent(context2, C1913n.a.f8872n, CoreProtocol.getInstance(context2), jSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void m7233a(String str, Map<String, Object> map, String str2) {
        try {
            if (m7225a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(C1896c.f8562W, 0);
                jSONObject.put("__t", 2050);
                ULog.m7606i("befort gkv map, event is " + jSONObject.toString());
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                for (int i4 = 0; i4 < 10 && it.hasNext(); i4++) {
                    Map.Entry<String, Object> next = it.next();
                    if (!C1896c.f8564Y.equals(next.getKey()) && !C1896c.f8562W.equals(next.getKey()) && !"id".equals(next.getKey()) && !"ts".equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    }
                }
                String strM7282d = C1923x.m7267a().m7282d(UMGlobalContext.getAppContext(f8906g));
                if (TextUtils.isEmpty(strM7282d)) {
                    strM7282d = f8905f;
                }
                jSONObject.put("__i", strM7282d);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C1896c.f8595au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f8906g).getProcessName(f8906g));
                ULog.m7606i("----->>>>>gkv event json is " + jSONObject.toString());
                Context context = f8906g;
                UMWorkDispatch.sendEvent(context, C1913n.a.f8860b, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private void m7222a() throws JSONException {
        try {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(f8906g, "track_list", "");
            if (TextUtils.isEmpty(strImprintProperty)) {
                return;
            }
            String[] strArrSplit = strImprintProperty.split("!");
            JSONObject jSONObject = new JSONObject();
            int i4 = 0;
            if (this.f8911h != null) {
                for (String str : strArrSplit) {
                    String strSubStr = HelperUtils.subStr(str, 128);
                    if (this.f8911h.has(strSubStr)) {
                        jSONObject.put(strSubStr, this.f8911h.get(strSubStr));
                    }
                }
            }
            this.f8911h = new JSONObject();
            if (strArrSplit.length >= 10) {
                while (i4 < 10) {
                    m7223a(strArrSplit[i4], jSONObject);
                    i4++;
                }
            } else {
                while (i4 < strArrSplit.length) {
                    m7223a(strArrSplit[i4], jSONObject);
                    i4++;
                }
            }
            m7229c(f8906g);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m7223a(String str, JSONObject jSONObject) throws JSONException {
        String strSubStr = HelperUtils.subStr(str, 128);
        if (jSONObject.has(strSubStr)) {
            m7224a(strSubStr, ((Boolean) jSONObject.get(strSubStr)).booleanValue());
        } else {
            m7224a(strSubStr, false);
        }
    }

    /* renamed from: a */
    private void m7224a(String str, boolean z3) throws JSONException {
        try {
            if (C1896c.f8564Y.equals(str) || C1896c.f8562W.equals(str) || "id".equals(str) || "ts".equals(str) || this.f8911h.has(str)) {
                return;
            }
            this.f8911h.put(str, z3);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void m7234a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    m7222a();
                    JSONObject jSONObject = this.f8911h;
                    if (jSONObject == null) {
                        this.f8911h = new JSONObject();
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            JSONObject jSONObject2 = this.f8911h;
                            if (jSONObject2 == null) {
                                this.f8911h = new JSONObject();
                            } else if (jSONObject2.length() >= 5) {
                                break;
                            }
                            String str = list.get(i4);
                            if (!TextUtils.isEmpty(str)) {
                                m7224a(HelperUtils.subStr(str, 128), false);
                            }
                        }
                        m7229c(f8906g);
                        return;
                    }
                    if (jSONObject.length() >= 5) {
                        MLog.m7564d("already setFistLaunchEvent, igone.");
                        return;
                    }
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        if (this.f8911h.length() >= 5) {
                            MLog.m7564d(" add setFistLaunchEvent over.");
                            return;
                        }
                        m7224a(HelperUtils.subStr(list.get(i5), 128), false);
                    }
                    m7229c(f8906g);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        UMLog.m7349aq(C1908i.f8770ak, 0, "\\|");
    }

    /* renamed from: a */
    private JSONObject m7221a(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    String key = entry.getKey();
                    if (key != null) {
                        String strSubStr = HelperUtils.subStr(key, 128);
                        Object value = entry.getValue();
                        if (value != null) {
                            int i4 = 0;
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    JSONArray jSONArray = new JSONArray();
                                    while (i4 < iArr.length) {
                                        jSONArray.put(iArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    JSONArray jSONArray2 = new JSONArray();
                                    while (i4 < dArr.length) {
                                        jSONArray2.put(dArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    JSONArray jSONArray3 = new JSONArray();
                                    while (i4 < jArr.length) {
                                        jSONArray3.put(jArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    JSONArray jSONArray4 = new JSONArray();
                                    while (i4 < fArr.length) {
                                        jSONArray4.put(fArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    JSONArray jSONArray5 = new JSONArray();
                                    while (i4 < sArr.length) {
                                        jSONArray5.put((int) sArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray5);
                                }
                            } else if (value instanceof List) {
                                List list = (List) value;
                                JSONArray jSONArray6 = new JSONArray();
                                while (i4 < list.size()) {
                                    Object obj = list.get(i4);
                                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                                        jSONArray6.put(list.get(i4));
                                    }
                                    i4++;
                                }
                                if (jSONArray6.length() > 0) {
                                    jSONObject.put(strSubStr, jSONArray6);
                                }
                            } else if (value instanceof String) {
                                jSONObject.put(strSubStr, HelperUtils.subStr(value.toString(), 256));
                            } else if (!(value instanceof Long) && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof Double) && !(value instanceof Short)) {
                                MLog.m7570e("The param has not support type. please check !");
                            } else {
                                jSONObject.put(strSubStr, value);
                            }
                        }
                    }
                } catch (Exception e4) {
                    MLog.m7574e(e4);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private boolean m7225a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        MLog.m7570e("key is " + str + ", please check key, illegal");
        return false;
    }
}
