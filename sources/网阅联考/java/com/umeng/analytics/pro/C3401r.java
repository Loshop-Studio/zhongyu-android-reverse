package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3397n;
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
/* loaded from: classes2.dex */
public class C3401r {

    /* renamed from: a */
    private static final String f2312a = "fs_lc_tl_uapp";

    /* renamed from: f */
    private static final String f2313f = "-1";

    /* renamed from: g */
    private static Context f2314g;

    /* renamed from: b */
    private final int f2315b;

    /* renamed from: c */
    private final int f2316c;

    /* renamed from: d */
    private final int f2317d;

    /* renamed from: e */
    private final int f2318e;

    /* renamed from: h */
    private JSONObject f2319h;

    /* renamed from: com.umeng.analytics.pro.r$a */
    public static class a {

        /* renamed from: a */
        private static final C3401r f2320a = new C3401r();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3401r m3297a(Context context) {
        if (f2314g == null && context != null) {
            f2314g = context.getApplicationContext();
        }
        return a.f2320a;
    }

    /* renamed from: b */
    private void m3303b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f2312a, null);
            if (!TextUtils.isEmpty(string)) {
                this.f2319h = new JSONObject(string);
            }
            m3299a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m3306c(Context context) {
        try {
            if (this.f2319h != null) {
                PreferenceWrapper.getDefault(f2314g).edit().putString(f2312a, this.f2319h.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private C3401r() {
        this.f2315b = 128;
        this.f2316c = 256;
        this.f2317d = 1024;
        this.f2318e = 10;
        this.f2319h = null;
        try {
            m3303b(f2314g);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private boolean m3307c(String str) {
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
    public void m3308a(String str, String str2, long j4, int i4, String str3) {
        String strM3352a;
        try {
            if (m3302a(str) && m3304b(str2)) {
                if (Arrays.asList(C3380c.f1981aG).contains(str)) {
                    MLog.m3647e("key is " + str + ", please check key, illegal");
                    UMLog.m3426aq(C3392i.f2197m, 0, "\\|");
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", jCurrentTimeMillis);
                if (j4 > 0) {
                    jSONObject.put(C3380c.f1970W, j4);
                }
                jSONObject.put("__t", C3391h.f2121a);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(str, str2);
                }
                if (UMUtils.isMainProgress(f2314g)) {
                    strM3352a = C3407x.m3344a().m3359d(UMGlobalContext.getAppContext(f2314g));
                } else {
                    strM3352a = C3407x.m3344a().m3352a(UMGlobalContext.getAppContext(f2314g), jCurrentTimeMillis);
                }
                if (TextUtils.isEmpty(strM3352a)) {
                    strM3352a = f2313f;
                }
                jSONObject.put("__i", strM3352a);
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C3380c.f2003au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f2314g).getProcessName(f2314g));
                m3299a();
                JSONObject jSONObject3 = this.f2319h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f2319h.get(str)).booleanValue()) {
                    jSONObject.put(C3380c.f1972Y, 1);
                    this.f2319h.put(str, true);
                    m3306c(f2314g);
                }
                Context context = f2314g;
                UMWorkDispatch.sendEvent(context, 4097, CoreProtocol.getInstance(context), jSONObject);
                return;
            }
            UMLog.m3426aq(C3392i.f2196l, 0, "\\|");
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    private boolean m3304b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
        } catch (Exception unused) {
        }
        MLog.m3647e("value is " + str + ", please check value, illegal");
        return false;
    }

    /* renamed from: b */
    private boolean m3305b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!m3302a(entry.getKey())) {
                            UMLog.m3426aq(C3392i.f2192h, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() == null) {
                            UMLog.m3426aq(C3392i.f2193i, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() instanceof String) {
                            if (C3380c.f1979aE.equals(entry.getKey())) {
                                if (!m3307c(entry.getValue().toString())) {
                                    UMLog.m3426aq(C3392i.f2156P, 0, "\\|");
                                    return false;
                                }
                            } else if ("_$!url".equals(entry.getKey())) {
                                if (!m3307c(entry.getValue().toString())) {
                                    UMLog.m3426aq("url参数长度超过限制。|参数url长度不能超过1024字符。", 0, "\\|");
                                    return false;
                                }
                            } else if (!m3304b(entry.getValue().toString())) {
                                UMLog.m3426aq(C3392i.f2194j, 0, "\\|");
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
        UMLog.m3426aq(C3392i.f2191g, 0, "\\|");
        return false;
    }

    /* renamed from: a */
    public void m3309a(String str, Map<String, Object> map, long j4, String str2, boolean z3) {
        String strM3352a;
        try {
            if (!m3302a(str)) {
                UMLog.m3426aq(C3392i.f2190f, 0, "\\|");
                return;
            }
            if (m3305b(map)) {
                if (map.size() > 100) {
                    MLog.m3647e("map size is " + map.size() + ", please check");
                    return;
                }
                if (Arrays.asList(C3380c.f1981aG).contains(str)) {
                    MLog.m3647e("key is " + str + ", please check key, illegal");
                    UMLog.m3426aq(C3392i.f2186b, 0, "\\|");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j4 > 0) {
                    jSONObject.put(C3380c.f1970W, j4);
                }
                jSONObject.put("__t", C3391h.f2121a);
                ULog.m3683i("befort ekv map, event is " + jSONObject.toString());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!Arrays.asList(C3380c.f1981aG).contains(entry.getKey())) {
                        Object value = entry.getValue();
                        if (!(value instanceof String) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Short) && !(value instanceof Float) && !(value instanceof Double)) {
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    if (iArr.length > 10) {
                                        MLog.m3647e("please check key or value, size overlength!");
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
                                        MLog.m3647e("please check key or value, size overlength!");
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
                                        MLog.m3647e("please check key or value, size overlength!");
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
                                        MLog.m3647e("please check key or value, size overlength!");
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
                                        MLog.m3647e("please check key or value, size overlength!");
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
                                        MLog.m3647e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray6 = new JSONArray();
                                    for (int i5 = 0; i5 < strArr.length; i5++) {
                                        String str3 = strArr[i5];
                                        if (str3 == null) {
                                            MLog.m3647e("please check array, null item!");
                                            return;
                                        } else {
                                            if (!m3304b(str3)) {
                                                return;
                                            }
                                            jSONArray6.put(strArr[i5]);
                                        }
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray6);
                                } else {
                                    MLog.m3647e("please check key or value, illegal type!");
                                    return;
                                }
                            } else {
                                MLog.m3647e("please check key or value, illegal type!");
                                return;
                            }
                        } else {
                            jSONObject.put(entry.getKey(), value);
                        }
                    } else {
                        UMLog.m3426aq(C3392i.f2189e, 0, "\\|");
                        return;
                    }
                }
                if (UMUtils.isMainProgress(f2314g)) {
                    strM3352a = C3407x.m3344a().m3359d(UMGlobalContext.getAppContext(f2314g));
                } else {
                    strM3352a = C3407x.m3344a().m3352a(UMGlobalContext.getAppContext(f2314g), jSONObject.getLong("ts"));
                }
                if (TextUtils.isEmpty(strM3352a)) {
                    strM3352a = f2313f;
                }
                jSONObject.put("__i", strM3352a);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C3380c.f2003au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f2314g).getProcessName(f2314g));
                m3299a();
                JSONObject jSONObject3 = this.f2319h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f2319h.get(str)).booleanValue()) {
                    jSONObject.put(C3380c.f1972Y, 1);
                    this.f2319h.put(str, true);
                    m3306c(f2314g);
                }
                ULog.m3683i("----->>>>>ekv event json is " + jSONObject.toString());
                if (!z3) {
                    Context context = f2314g;
                    UMWorkDispatch.sendEvent(context, 4097, CoreProtocol.getInstance(context), jSONObject);
                } else {
                    Context context2 = f2314g;
                    UMWorkDispatch.sendEvent(context2, C3397n.a.f2280n, CoreProtocol.getInstance(context2), jSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void m3310a(String str, Map<String, Object> map, String str2) {
        try {
            if (m3302a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(C3380c.f1970W, 0);
                jSONObject.put("__t", C3391h.f2122b);
                ULog.m3683i("befort gkv map, event is " + jSONObject.toString());
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                for (int i4 = 0; i4 < 10 && it.hasNext(); i4++) {
                    Map.Entry<String, Object> next = it.next();
                    if (!C3380c.f1972Y.equals(next.getKey()) && !C3380c.f1970W.equals(next.getKey()) && !"id".equals(next.getKey()) && !"ts".equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    }
                }
                String strM3359d = C3407x.m3344a().m3359d(UMGlobalContext.getAppContext(f2314g));
                if (TextUtils.isEmpty(strM3359d)) {
                    strM3359d = f2313f;
                }
                jSONObject.put("__i", strM3359d);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C3380c.f2003au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f2314g).getProcessName(f2314g));
                ULog.m3683i("----->>>>>gkv event json is " + jSONObject.toString());
                Context context = f2314g;
                UMWorkDispatch.sendEvent(context, 4098, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private void m3299a() throws JSONException {
        try {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(f2314g, "track_list", "");
            if (TextUtils.isEmpty(strImprintProperty)) {
                return;
            }
            String[] strArrSplit = strImprintProperty.split("!");
            JSONObject jSONObject = new JSONObject();
            int i4 = 0;
            if (this.f2319h != null) {
                for (String str : strArrSplit) {
                    String strSubStr = HelperUtils.subStr(str, 128);
                    if (this.f2319h.has(strSubStr)) {
                        jSONObject.put(strSubStr, this.f2319h.get(strSubStr));
                    }
                }
            }
            this.f2319h = new JSONObject();
            if (strArrSplit.length >= 10) {
                while (i4 < 10) {
                    m3300a(strArrSplit[i4], jSONObject);
                    i4++;
                }
            } else {
                while (i4 < strArrSplit.length) {
                    m3300a(strArrSplit[i4], jSONObject);
                    i4++;
                }
            }
            m3306c(f2314g);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m3300a(String str, JSONObject jSONObject) throws JSONException {
        String strSubStr = HelperUtils.subStr(str, 128);
        if (jSONObject.has(strSubStr)) {
            m3301a(strSubStr, ((Boolean) jSONObject.get(strSubStr)).booleanValue());
        } else {
            m3301a(strSubStr, false);
        }
    }

    /* renamed from: a */
    private void m3301a(String str, boolean z3) throws JSONException {
        try {
            if (C3380c.f1972Y.equals(str) || C3380c.f1970W.equals(str) || "id".equals(str) || "ts".equals(str) || this.f2319h.has(str)) {
                return;
            }
            this.f2319h.put(str, z3);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void m3311a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    m3299a();
                    JSONObject jSONObject = this.f2319h;
                    if (jSONObject == null) {
                        this.f2319h = new JSONObject();
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            JSONObject jSONObject2 = this.f2319h;
                            if (jSONObject2 == null) {
                                this.f2319h = new JSONObject();
                            } else if (jSONObject2.length() >= 5) {
                                break;
                            }
                            String str = list.get(i4);
                            if (!TextUtils.isEmpty(str)) {
                                m3301a(HelperUtils.subStr(str, 128), false);
                            }
                        }
                        m3306c(f2314g);
                        return;
                    }
                    if (jSONObject.length() >= 5) {
                        MLog.m3641d("already setFistLaunchEvent, igone.");
                        return;
                    }
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        if (this.f2319h.length() >= 5) {
                            MLog.m3641d(" add setFistLaunchEvent over.");
                            return;
                        }
                        m3301a(HelperUtils.subStr(list.get(i5), 128), false);
                    }
                    m3306c(f2314g);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        UMLog.m3426aq(C3392i.f2178ak, 0, "\\|");
    }

    /* renamed from: a */
    private JSONObject m3298a(Map<String, Object> map) throws JSONException {
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
                                MLog.m3647e("The param has not support type. please check !");
                            } else {
                                jSONObject.put(strSubStr, value);
                            }
                        }
                    }
                } catch (Exception e4) {
                    MLog.m3651e(e4);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private boolean m3302a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        MLog.m3647e("key is " + str + ", please check key, illegal");
        return false;
    }
}
