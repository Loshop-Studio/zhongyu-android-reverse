package p114g2;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.umeng.analytics.pro.C6772g;
import com.umeng.commonsdk.framework.AbstractC6782a;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p092e2.C7840b;
import p176m2.C8957f;
import p186n2.AbstractC9089c;
import p240s2.C9468a;
import p270v2.AbstractC9755c;
import p270v2.AbstractC9756d;
import p270v2.AbstractC9758f;
import p290x2.AbstractC9866a;
import p310z2.AbstractC9993d;

/* renamed from: g2.o0 */
/* loaded from: classes4.dex */
public class C8032o0 {

    /* renamed from: f */
    public static Context f13614f;

    /* renamed from: a */
    public final int f13615a;

    /* renamed from: b */
    public final int f13616b;

    /* renamed from: c */
    public final int f13617c;

    /* renamed from: d */
    public final int f13618d;

    /* renamed from: e */
    public JSONObject f13619e;

    /* renamed from: g2.o0$b */
    public static class b {

        /* renamed from: a */
        public static final C8032o0 f13620a = new C8032o0();
    }

    /* renamed from: a */
    public static C8032o0 m12705a(Context context) {
        if (f13614f == null && context != null) {
            f13614f = context.getApplicationContext();
        }
        return b.f13620a;
    }

    /* renamed from: b */
    public final void m12706b() throws JSONException {
        try {
            String strM6274h = AbstractC6782a.m6274h(f13614f, "track_list", "");
            if (TextUtils.isEmpty(strM6274h)) {
                return;
            }
            String[] strArrSplit = strM6274h.split("!");
            JSONObject jSONObject = new JSONObject();
            int i9 = 0;
            if (this.f13619e != null) {
                for (String str : strArrSplit) {
                    String strM16399h = AbstractC9755c.m16399h(str, 128);
                    if (this.f13619e.has(strM16399h)) {
                        jSONObject.put(strM16399h, this.f13619e.get(strM16399h));
                    }
                }
            }
            this.f13619e = new JSONObject();
            if (strArrSplit.length >= 10) {
                while (i9 < 10) {
                    m12708d(strArrSplit[i9], jSONObject);
                    i9++;
                }
            } else {
                while (i9 < strArrSplit.length) {
                    m12708d(strArrSplit[i9], jSONObject);
                    i9++;
                }
            }
            m12714j(f13614f);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void m12707c(String str, Map map, long j9, String str2, boolean z9) {
        try {
            if (!m12710f(str)) {
                C8957f.m14280a(AbstractC8016g0.f13538f, 0, "\\|");
                return;
            }
            if (m12713i(map)) {
                if (map.size() > 100) {
                    AbstractC9756d.m16404c("map size is " + map.size() + ", please check");
                    return;
                }
                if (Arrays.asList(AbstractC8047y.f13637b).contains(str)) {
                    AbstractC9756d.m16404c("key is " + str + ", please check key, illegal");
                    C8957f.m14280a(AbstractC8016g0.f13530b, 0, "\\|");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j9 > 0) {
                    jSONObject.put("du", j9);
                }
                jSONObject.put("__t", 2049);
                AbstractC9758f.m16432g("befort ekv map, event is " + jSONObject.toString());
                for (Map.Entry entry : map.entrySet()) {
                    if (Arrays.asList(AbstractC8047y.f13637b).contains(entry.getKey())) {
                        C8957f.m14280a(AbstractC8016g0.f13536e, 0, "\\|");
                        return;
                    }
                    Object value = entry.getValue();
                    if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long) || (value instanceof Short) || (value instanceof Float) || (value instanceof Double)) {
                        jSONObject.put((String) entry.getKey(), value);
                    } else {
                        if (!value.getClass().isArray()) {
                            AbstractC9756d.m16404c("please check key or value, illegal type!");
                            return;
                        }
                        if (value instanceof int[]) {
                            int[] iArr = (int[]) value;
                            if (iArr.length > 10) {
                                AbstractC9756d.m16404c("please check key or value, size overlength!");
                                return;
                            }
                            JSONArray jSONArray = new JSONArray();
                            for (int i9 : iArr) {
                                jSONArray.put(i9);
                            }
                            jSONObject.put((String) entry.getKey(), jSONArray);
                        } else if (value instanceof double[]) {
                            double[] dArr = (double[]) value;
                            if (dArr.length > 10) {
                                AbstractC9756d.m16404c("please check key or value, size overlength!");
                                return;
                            }
                            JSONArray jSONArray2 = new JSONArray();
                            for (double d10 : dArr) {
                                jSONArray2.put(d10);
                            }
                            jSONObject.put((String) entry.getKey(), jSONArray2);
                        } else if (value instanceof long[]) {
                            long[] jArr = (long[]) value;
                            if (jArr.length > 10) {
                                AbstractC9756d.m16404c("please check key or value, size overlength!");
                                return;
                            }
                            JSONArray jSONArray3 = new JSONArray();
                            for (long j10 : jArr) {
                                jSONArray3.put(j10);
                            }
                            jSONObject.put((String) entry.getKey(), jSONArray3);
                        } else if (value instanceof float[]) {
                            float[] fArr = (float[]) value;
                            if (fArr.length > 10) {
                                AbstractC9756d.m16404c("please check key or value, size overlength!");
                                return;
                            }
                            JSONArray jSONArray4 = new JSONArray();
                            for (float f10 : fArr) {
                                jSONArray4.put(f10);
                            }
                            jSONObject.put((String) entry.getKey(), jSONArray4);
                        } else if (value instanceof short[]) {
                            short[] sArr = (short[]) value;
                            if (sArr.length > 10) {
                                AbstractC9756d.m16404c("please check key or value, size overlength!");
                                return;
                            }
                            JSONArray jSONArray5 = new JSONArray();
                            for (short s9 : sArr) {
                                jSONArray5.put((int) s9);
                            }
                            jSONObject.put((String) entry.getKey(), jSONArray5);
                        } else {
                            if (!(value instanceof String[])) {
                                AbstractC9756d.m16404c("please check key or value, illegal type!");
                                return;
                            }
                            String[] strArr = (String[]) value;
                            if (strArr.length > 10) {
                                AbstractC9756d.m16404c("please check key or value, size overlength!");
                                return;
                            }
                            JSONArray jSONArray6 = new JSONArray();
                            for (int i10 = 0; i10 < strArr.length; i10++) {
                                String str3 = strArr[i10];
                                if (str3 == null) {
                                    AbstractC9756d.m16404c("please check array, null item!");
                                    return;
                                } else {
                                    if (!m12712h(str3)) {
                                        return;
                                    }
                                    jSONArray6.put(strArr[i10]);
                                }
                            }
                            jSONObject.put((String) entry.getKey(), jSONArray6);
                        }
                    }
                }
                String strM6187i = AbstractC9993d.m17334s(f13614f) ? C6772g.m6179b().m6187i(C9468a.m15647b(f13614f)) : C6772g.m6179b().m6182d(C9468a.m15647b(f13614f), jSONObject.getLong("ts"));
                if (TextUtils.isEmpty(strM6187i)) {
                    strM6187i = "-1";
                }
                jSONObject.put("__i", strM6187i);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put("_$sp", jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", C9468a.m15648e(f13614f).m15651f(f13614f));
                m12706b();
                JSONObject jSONObject3 = this.f13619e;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f13619e.get(str)).booleanValue()) {
                    jSONObject.put("$st_fl", 1);
                    this.f13619e.put(str, true);
                    m12714j(f13614f);
                }
                AbstractC9758f.m16432g("----->>>>>ekv event json is " + jSONObject.toString());
                if (z9) {
                    Context context = f13614f;
                    AbstractC9089c.m14596m(context, 4355, C7840b.m12281f(context), jSONObject);
                } else {
                    Context context2 = f13614f;
                    AbstractC9089c.m14596m(context2, FragmentTransaction.TRANSIT_FRAGMENT_OPEN, C7840b.m12281f(context2), jSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: d */
    public final void m12708d(String str, JSONObject jSONObject) throws JSONException {
        String strM16399h = AbstractC9755c.m16399h(str, 128);
        if (jSONObject.has(strM16399h)) {
            m12709e(strM16399h, ((Boolean) jSONObject.get(strM16399h)).booleanValue());
        } else {
            m12709e(strM16399h, false);
        }
    }

    /* renamed from: e */
    public final void m12709e(String str, boolean z9) throws JSONException {
        try {
            if ("$st_fl".equals(str) || "du".equals(str) || "id".equals(str) || "ts".equals(str) || this.f13619e.has(str)) {
                return;
            }
            this.f13619e.put(str, z9);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final boolean m12710f(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        AbstractC9756d.m16404c("key is " + str + ", please check key, illegal");
        return false;
    }

    /* renamed from: g */
    public final void m12711g(Context context) {
        try {
            String string = AbstractC9866a.m16841a(context).getString("fs_lc_tl_uapp", null);
            if (!TextUtils.isEmpty(string)) {
                this.f13619e = new JSONObject(string);
            }
            m12706b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public final boolean m12712h(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
        } catch (Exception unused) {
        }
        AbstractC9756d.m16404c("value is " + str + ", please check value, illegal");
        return false;
    }

    /* renamed from: i */
    public final boolean m12713i(Map map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!m12710f((String) entry.getKey())) {
                            C8957f.m14280a(AbstractC8016g0.f13542h, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() == null) {
                            C8957f.m14280a(AbstractC8016g0.f13544i, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() instanceof String) {
                            if ("_$!link".equals(entry.getKey())) {
                                if (!m12715k(entry.getValue().toString())) {
                                    C8957f.m14280a("MobclickAgent.onDeepLinkReceived方法link参数长度超过限制。|参数link长度不能超过1024字符。", 0, "\\|");
                                    return false;
                                }
                            } else if ("_$!url".equals(entry.getKey())) {
                                if (!m12715k(entry.getValue().toString())) {
                                    C8957f.m14280a("url参数长度超过限制。|参数url长度不能超过1024字符。", 0, "\\|");
                                    return false;
                                }
                            } else if (!m12712h(entry.getValue().toString())) {
                                C8957f.m14280a(AbstractC8016g0.f13546j, 0, "\\|");
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
        C8957f.m14280a(AbstractC8016g0.f13540g, 0, "\\|");
        return false;
    }

    /* renamed from: j */
    public final void m12714j(Context context) {
        try {
            if (this.f13619e != null) {
                AbstractC9866a.m16841a(f13614f).edit().putString("fs_lc_tl_uapp", this.f13619e.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    public final boolean m12715k(String str) {
        if (str == null) {
            return true;
        }
        try {
            return str.trim().getBytes().length <= 1024;
        } catch (Exception unused) {
            return false;
        }
    }

    public C8032o0() {
        this.f13615a = 128;
        this.f13616b = 256;
        this.f13617c = 1024;
        this.f13618d = 10;
        this.f13619e = null;
        try {
            m12711g(f13614f);
        } catch (Throwable unused) {
        }
    }
}
