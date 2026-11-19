package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentTransaction;
import com.umeng.analytics.pro.C6773h;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;
import p092e2.C7840b;
import p114g2.AbstractC8016g0;
import p134i2.C8130a;
import p134i2.InterfaceC8131b;
import p154k2.AbstractC8263a;
import p176m2.C8957f;
import p186n2.AbstractC9089c;
import p240s2.C9468a;

/* renamed from: com.umeng.analytics.pro.f */
/* loaded from: classes4.dex */
public class C6771f {

    /* renamed from: d */
    public static JSONArray f6683d = new JSONArray();

    /* renamed from: e */
    public static Object f6684e = new Object();

    /* renamed from: a */
    public final Map f6685a = new HashMap();

    /* renamed from: b */
    public Stack f6686b = new Stack();

    /* renamed from: c */
    public InterfaceC8131b f6687c = C8130a.m13025b();

    /* renamed from: b */
    public static void m6175b(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f6684e) {
                    string = f6683d.toString();
                    f6683d = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put("__a", new JSONArray(string));
                    if (jSONObject.length() > 0) {
                        C6773h.m6194b(context).m6211l(C6770e.m6155d().m6168o(), jSONObject, C6773h.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public int mo6176a() {
        return 2;
    }

    /* renamed from: c */
    public void m6177c() {
        String str;
        synchronized (this.f6685a) {
            try {
                str = null;
                long j9 = 0;
                for (Map.Entry entry : this.f6685a.entrySet()) {
                    if (((Long) entry.getValue()).longValue() > j9) {
                        long jLongValue = ((Long) entry.getValue()).longValue();
                        str = (String) entry.getKey();
                        j9 = jLongValue;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            m6178d(str);
        }
    }

    /* renamed from: d */
    public void m6178d(String str) {
        Long l9;
        Context contextM15647b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.f6685a.containsKey(str)) {
            if (AbstractC8263a.m13312e() && this.f6686b.size() == 0) {
                C8957f.m14281b(AbstractC8016g0.f13505D, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
                return;
            }
            return;
        }
        synchronized (this.f6685a) {
            l9 = (Long) this.f6685a.get(str);
        }
        if (l9 == null) {
            return;
        }
        if (AbstractC8263a.m13312e() && this.f6686b.size() > 0 && str.equals(this.f6686b.peek())) {
            this.f6686b.pop();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l9.longValue();
        synchronized (f6684e) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page_name", str);
                jSONObject.put(TypedValues.TransitionType.S_DURATION, jCurrentTimeMillis);
                jSONObject.put("page_start", l9);
                jSONObject.put("type", mo6176a());
                f6683d.put(jSONObject);
                if (f6683d.length() >= 5 && (contextM15647b = C9468a.m15647b(null)) != null) {
                    AbstractC9089c.m14596m(contextM15647b, FragmentTransaction.TRANSIT_FRAGMENT_FADE, C7840b.m12281f(contextM15647b), null);
                }
            } catch (Throwable unused) {
            }
        }
        if (!AbstractC8263a.m13312e() || this.f6686b.size() == 0) {
            return;
        }
        C8957f.m14281b(AbstractC8016g0.f13503B, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
    }
}
