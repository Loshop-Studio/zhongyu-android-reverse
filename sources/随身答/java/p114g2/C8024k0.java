package p114g2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.p071uc.crashsdk.export.LogType;
import com.umeng.analytics.C6752a;
import com.umeng.analytics.pro.C6769d;
import com.umeng.analytics.pro.C6770e;
import com.umeng.analytics.pro.C6771f;
import com.umeng.analytics.pro.C6772g;
import com.umeng.analytics.pro.C6773h;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.commonsdk.config.C6780a;
import com.umeng.commonsdk.framework.AbstractC6782a;
import com.umeng.commonsdk.framework.AbstractC6783b;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p021b3.AbstractC5108b;
import p092e2.AbstractC7839a;
import p092e2.AbstractC7841c;
import p092e2.C7840b;
import p154k2.AbstractC8263a;
import p176m2.AbstractC8959h;
import p176m2.C8957f;
import p186n2.AbstractC9089c;
import p240s2.C9468a;
import p270v2.AbstractC9754b;
import p270v2.AbstractC9755c;
import p270v2.AbstractC9756d;
import p270v2.AbstractC9757e;
import p290x2.AbstractC9866a;
import p290x2.C9867b;
import p300y2.C9945a;
import p300y2.C9946b;
import p310z2.AbstractC9993d;
import p310z2.C9992c;

/* renamed from: g2.k0 */
/* loaded from: classes4.dex */
public class C8024k0 {

    /* renamed from: o */
    public static Context f13582o;

    /* renamed from: p */
    public static Class f13583p;

    /* renamed from: q */
    public static Method f13584q;

    /* renamed from: a */
    public c f13585a;

    /* renamed from: b */
    public SharedPreferences f13586b;

    /* renamed from: c */
    public String f13587c;

    /* renamed from: d */
    public String f13588d;

    /* renamed from: e */
    public int f13589e;

    /* renamed from: f */
    public JSONArray f13590f;

    /* renamed from: g */
    public final int f13591g;

    /* renamed from: h */
    public int f13592h;

    /* renamed from: i */
    public int f13593i;

    /* renamed from: j */
    public long f13594j;

    /* renamed from: k */
    public final long f13595k;

    /* renamed from: l */
    public boolean f13596l;

    /* renamed from: m */
    public boolean f13597m;

    /* renamed from: n */
    public Object f13598n;

    /* renamed from: g2.k0$b */
    public static class b {

        /* renamed from: a */
        public static final C8024k0 f13599a = new C8024k0();
    }

    /* renamed from: g2.k0$c */
    public static class c {

        /* renamed from: a */
        public AbstractC9757e.h f13600a = null;

        /* renamed from: b */
        public int f13601b = -1;

        /* renamed from: c */
        public int f13602c = -1;

        /* renamed from: d */
        public int f13603d = -1;

        /* renamed from: e */
        public int f13604e = -1;

        /* renamed from: f */
        public C9945a f13605f;

        public c() {
            this.f13605f = null;
            this.f13605f = C9945a.m17137c(C8024k0.f13582o);
        }

        /* renamed from: a */
        public int m12669a(int i9) {
            int iIntValue = Integer.valueOf(AbstractC6782a.m6274h(C8024k0.f13582o, "test_report_interval", "-1")).intValue();
            return (iIntValue == -1 || iIntValue < 90 || iIntValue > 86400) ? i9 : iIntValue * 1000;
        }

        /* renamed from: b */
        public void m12670b() {
            try {
                int[] iArrM12671c = m12671c(-1, -1);
                this.f13601b = iArrM12671c[0];
                this.f13602c = iArrM12671c[1];
            } catch (Throwable unused) {
            }
        }

        /* renamed from: c */
        public int[] m12671c(int i9, int i10) {
            int iIntValue = Integer.valueOf(AbstractC6782a.m6274h(C8024k0.f13582o, "report_policy", "-1")).intValue();
            int iIntValue2 = Integer.valueOf(AbstractC6782a.m6274h(C8024k0.f13582o, "report_interval", "-1")).intValue();
            if (iIntValue == -1 || !AbstractC9757e.m16418a(iIntValue)) {
                return new int[]{i9, i10};
            }
            if (6 == iIntValue) {
                if (iIntValue2 == -1 || iIntValue2 < 90 || iIntValue2 > 86400) {
                    iIntValue2 = 90;
                }
                return new int[]{iIntValue, iIntValue2 * 1000};
            }
            if (11 != iIntValue) {
                return new int[]{i9, i10};
            }
            if (iIntValue2 == -1 || iIntValue2 < 15 || iIntValue2 > 3600) {
                iIntValue2 = 15;
            }
            return new int[]{iIntValue, iIntValue2 * 1000};
        }

        /* renamed from: d */
        public final AbstractC9757e.h m12672d(int i9, int i10) {
            if (i9 == 0) {
                AbstractC9757e.h hVar = this.f13600a;
                return hVar instanceof AbstractC9757e.g ? hVar : new AbstractC9757e.g();
            }
            if (i9 == 1) {
                AbstractC9757e.h hVar2 = this.f13600a;
                return hVar2 instanceof AbstractC9757e.c ? hVar2 : new AbstractC9757e.c();
            }
            if (i9 == 4) {
                AbstractC9757e.h hVar3 = this.f13600a;
                return hVar3 instanceof AbstractC9757e.e ? hVar3 : new AbstractC9757e.e(C9867b.m16842e(C8024k0.f13582o));
            }
            if (i9 == 5) {
                AbstractC9757e.h hVar4 = this.f13600a;
                return hVar4 instanceof AbstractC9757e.i ? hVar4 : new AbstractC9757e.i(C8024k0.f13582o);
            }
            if (i9 == 6) {
                AbstractC9757e.h hVar5 = this.f13600a;
                if (!(hVar5 instanceof AbstractC9757e.d)) {
                    return new AbstractC9757e.d(C9867b.m16842e(C8024k0.f13582o), i10);
                }
                ((AbstractC9757e.d) hVar5).m16423d(i10);
                return hVar5;
            }
            if (i9 == 8) {
                AbstractC9757e.h hVar6 = this.f13600a;
                return hVar6 instanceof AbstractC9757e.j ? hVar6 : new AbstractC9757e.j(C9867b.m16842e(C8024k0.f13582o));
            }
            if (i9 != 11) {
                AbstractC9757e.h hVar7 = this.f13600a;
                return hVar7 instanceof AbstractC9757e.c ? hVar7 : new AbstractC9757e.c();
            }
            AbstractC9757e.h hVar8 = this.f13600a;
            if (hVar8 instanceof AbstractC9757e.f) {
                ((AbstractC9757e.f) hVar8).m16425d(i10);
                return hVar8;
            }
            AbstractC9757e.f fVar = new AbstractC9757e.f();
            fVar.m16425d(i10);
            return fVar;
        }

        /* renamed from: e */
        public void m12673e() {
            C9946b c9946bM17146c = C9946b.m17146c(C8024k0.f13582o);
            if (c9946bM17146c.m17148d()) {
                AbstractC9757e.h hVar = this.f13600a;
                this.f13600a = ((hVar instanceof AbstractC9757e.b) && hVar.mo16420a()) ? this.f13600a : new AbstractC9757e.b(C9867b.m16842e(C8024k0.f13582o), c9946bM17146c);
            } else {
                int iM12669a = 0;
                boolean z9 = Integer.valueOf(AbstractC6782a.m6274h(C8024k0.f13582o, "integrated_test", "-1")).intValue() == 1;
                if (AbstractC8263a.m13312e() && z9 && !AbstractC9756d.f17273a) {
                    C8957f.m14287h(AbstractC8016g0.f13508G, 3, "\\|", null, null);
                }
                if (AbstractC9756d.f17273a && z9) {
                    this.f13600a = new AbstractC9757e.a(C9867b.m16842e(C8024k0.f13582o));
                } else if (this.f13605f.m17141f() && "RPT".equals(this.f13605f.m17139d())) {
                    if (this.f13605f.m17140e() == 6) {
                        if (Integer.valueOf(AbstractC6782a.m6274h(C8024k0.f13582o, "test_report_interval", "-1")).intValue() != -1) {
                            iM12669a = m12669a(90000);
                        } else {
                            iM12669a = this.f13602c;
                            if (iM12669a <= 0) {
                                iM12669a = this.f13604e;
                            }
                        }
                    }
                    this.f13600a = m12672d(this.f13605f.m17140e(), iM12669a);
                } else {
                    int i9 = this.f13603d;
                    int i10 = this.f13604e;
                    int i11 = this.f13601b;
                    if (i11 != -1) {
                        i10 = this.f13602c;
                        i9 = i11;
                    }
                    this.f13600a = m12672d(i9, i10);
                }
            }
            if (AbstractC8263a.m13312e()) {
                try {
                    AbstractC9757e.h hVar2 = this.f13600a;
                    if (hVar2 instanceof AbstractC9757e.c) {
                        C8957f.m14287h(AbstractC8016g0.f13506E, 3, "", null, null);
                        return;
                    }
                    if (hVar2 instanceof AbstractC9757e.d) {
                        C8957f.m14287h(AbstractC8016g0.f13507F, 3, "", new String[]{"@"}, new String[]{String.valueOf(((AbstractC9757e.d) hVar2).m16422c() / 1000)});
                    } else if (hVar2 instanceof AbstractC9757e.a) {
                        C8957f.m14287h(AbstractC8016g0.f13509H, 3, "", null, null);
                    } else if (hVar2 instanceof AbstractC9757e.f) {
                        C8957f.m14287h(AbstractC8016g0.f13510I, 3, "", new String[]{"@"}, new String[]{String.valueOf(((AbstractC9757e.f) hVar2).m16424c() / 1000)});
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: f */
        public AbstractC9757e.h m12674f() {
            m12673e();
            return this.f13600a;
        }
    }

    static {
        m12621J();
    }

    /* renamed from: J */
    public static void m12621J() {
        try {
            f13583p = AbstractC5108b.class;
            Method declaredMethod = AbstractC5108b.class.getDeclaredMethod("setPuidAndProvider", String.class, String.class);
            if (declaredMethod != null) {
                f13584q = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C8024k0 m12622a(Context context) {
        if (f13582o == null && context != null) {
            f13582o = context.getApplicationContext();
        }
        return b.f13599a;
    }

    /* renamed from: A */
    public final boolean m12623A(boolean z9) {
        if (this.f13585a == null) {
            this.f13585a = new c();
        }
        AbstractC9757e.h hVarM12674f = this.f13585a.m12674f();
        if (hVarM12674f instanceof AbstractC9757e.b) {
            return z9 ? ((AbstractC9757e.b) hVarM12674f).m16421c() : hVarM12674f.mo16419b(false);
        }
        return true;
    }

    /* renamed from: B */
    public void m12624B() {
        if (m12623A(false)) {
            m12633M();
        }
    }

    /* renamed from: C */
    public final void m12625C(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!m12651j(this.f13594j, this.f13592h)) {
                    return;
                } else {
                    this.f13592h++;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!m12651j(this.f13594j, this.f13593i)) {
                    return;
                } else {
                    this.f13593i++;
                }
            }
            if (this.f13590f.length() >= this.f13589e) {
                AbstractC8959h.m14293c("MobclickRT", "--->>>*** 超过10个事件，事件落库。");
                C6773h.m6194b(f13582o).m6207h(this.f13590f);
                this.f13590f = new JSONArray();
            }
            if (this.f13594j == 0) {
                this.f13594j = System.currentTimeMillis();
            }
            this.f13590f.put(jSONObject);
        } catch (Throwable th) {
            AbstractC9756d.m16408g(th);
        }
    }

    /* renamed from: D */
    public final void m12626D(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("analytics");
                if (jSONObject4.has("sessions")) {
                    JSONArray jSONArray = jSONObject4.getJSONArray("sessions");
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i9);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put("sessions", jSONArray2);
                    if (jSONObject3.length() > 0) {
                        AbstractC9756d.m16402a("本次启动会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has("active_user")) {
                    jSONObject3.put("active_user", jSONObject4.getJSONObject("active_user"));
                    if (jSONObject3.length() > 0) {
                        AbstractC9756d.m16402a("本次启动账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has("header") && jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has("sdk_version")) {
                    jSONObject3.put("sdk_version", jSONObject2.getString("sdk_version"));
                }
                if (jSONObject2.has("device_id")) {
                    jSONObject3.put("device_id", jSONObject2.getString("device_id"));
                }
                if (jSONObject2.has("device_model")) {
                    jSONObject3.put("device_model", jSONObject2.getString("device_model"));
                }
                if (jSONObject2.has("version_code")) {
                    jSONObject3.put("version", jSONObject2.getInt("version_code"));
                }
                if (jSONObject2.has("appkey")) {
                    jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                }
                if (jSONObject2.has("channel")) {
                    jSONObject3.put("channel", jSONObject2.getString("channel"));
                }
                if (jSONObject3.length() > 0) {
                    AbstractC9756d.m16402a("本次启动基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            AbstractC9756d.m16408g(th);
        }
    }

    /* renamed from: E */
    public final void m12627E(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                long j9 = jSONObject.getLong("ts");
                m12658q(f13582o);
                m12665x();
                String[] strArrM12286b = AbstractC7841c.m12286b(f13582o);
                if (strArrM12286b == null || TextUtils.isEmpty(strArrM12286b[0]) || TextUtils.isEmpty(strArrM12286b[1])) {
                    return;
                }
                C6770e.m6155d().m6160f(f13582o, j9);
                AbstractC8959h.m14293c("MobclickRT", "--->>> onProfileSignIn: force generate new session: session id = " + C6772g.m6179b().m6186h(f13582o));
                boolean zM6167n = C6770e.m6155d().m6167n(f13582o, j9, false);
                AbstractC7841c.m12287c(f13582o);
                C6770e.m6155d().m6159e(f13582o, j9, true);
                if (zM6167n) {
                    C6770e.m6155d().m6165l(f13582o, j9);
                }
            }
        } catch (Throwable th) {
            if (AbstractC9756d.f17273a) {
                AbstractC9756d.m16406e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: F */
    public final void m12628F(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            if (!jSONObject.getJSONObject("header").has("eof")) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.length() > 0 && jSONObjectOptJSONObject.has("sessions")) {
                    C6773h.m6194b(f13582o).m6209j(true, false);
                }
                C6773h.m6194b(f13582o).m6215p();
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("analytics");
                if (jSONObject2.has("sessions") && (jSONObjectOptJSONObject2 = jSONObject2.getJSONArray("sessions").optJSONObject(0)) != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("id");
                    if (!TextUtils.isEmpty(strOptString)) {
                        AbstractC8959h.m14293c("MobclickRT", "--->>> removeAllInstantData: really delete instant session data");
                        C6773h.m6194b(f13582o).m6216q(strOptString);
                    }
                }
            }
            C6773h.m6194b(f13582o).m6215p();
            AbstractC8959h.m14293c("MobclickRT", "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
            Context context = f13582o;
            AbstractC9089c.m14596m(context, 4353, C7840b.m12281f(context), null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: H */
    public final void m12629H(Object obj) {
        try {
            m12658q(f13582o);
            m12665x();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString("provider");
                String string2 = jSONObject.getString("uid");
                long j9 = jSONObject.getLong("ts");
                String[] strArrM12286b = AbstractC7841c.m12286b(f13582o);
                if (strArrM12286b != null && string.equals(strArrM12286b[0]) && string2.equals(strArrM12286b[1])) {
                    return;
                }
                C6770e.m6155d().m6160f(f13582o, j9);
                String strM6186h = C6772g.m6179b().m6186h(f13582o);
                boolean zM6167n = C6770e.m6155d().m6167n(f13582o, j9, false);
                AbstractC7841c.m12285a(f13582o, string, string2);
                AbstractC8959h.m14293c("MobclickRT", "--->>> onProfileSignIn: force generate new session: session id = " + strM6186h);
                C6770e.m6155d().m6159e(f13582o, j9, true);
                if (zM6167n) {
                    C6770e.m6155d().m6165l(f13582o, j9);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: I */
    public final void m12630I(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        try {
            if (jSONObject.getJSONObject("header").has("eof")) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics")) {
                    if (!jSONObject.getJSONObject("analytics").has("sessions")) {
                        AbstractC8959h.m14293c("MobclickRT", "--->>> Error, Should not go to this branch.");
                        return;
                    }
                    C6773h.m6194b(f13582o).m6198D();
                    C6773h.m6194b(f13582o).m6197C();
                    C6773h.m6194b(f13582o).m6219t(true, false);
                    C6773h.m6194b(f13582o).m6204e();
                    return;
                }
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.length() > 0) {
                if (jSONObjectOptJSONObject.has("sessions")) {
                    C6773h.m6194b(f13582o).m6219t(true, false);
                }
                if (jSONObjectOptJSONObject.has("ekv") || jSONObjectOptJSONObject.has("gkv")) {
                    C6773h.m6194b(f13582o).m6197C();
                }
                if (jSONObjectOptJSONObject.has("error")) {
                    C6773h.m6194b(f13582o).m6198D();
                }
            }
            C6773h.m6194b(f13582o).m6204e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: K */
    public final void m12631K(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("__ii")) {
                return;
            }
            String strOptString = jSONObject.optString("__ii");
            jSONObject.remove("__ii");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            C6773h.m6194b(f13582o).m6210k(strOptString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: L */
    public final void m12632L() {
        JSONObject jSONObjectM12654m = m12654m(AbstractC6782a.m6278l(f13582o));
        if (jSONObjectM12654m == null || jSONObjectM12654m.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectM12654m.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectM12654m.opt("content");
        if (f13582o == null || jSONObject == null || jSONObject2 == null) {
            return;
        }
        AbstractC8959h.m14293c("MobclickRT", "--->>> constructInstantMessage: request build envelope.");
        JSONObject jSONObjectM6268b = AbstractC6782a.m6268b(f13582o, jSONObject, jSONObject2);
        if (jSONObjectM6268b != null) {
            try {
                if (jSONObjectM6268b.has("exception")) {
                    AbstractC8959h.m14293c("MobclickRT", "Build envelope error code: " + jSONObjectM6268b.getInt("exception"));
                }
            } catch (Throwable unused) {
            }
            if (AbstractC8263a.m13312e()) {
                m12626D(jSONObjectM6268b);
            }
            m12659r(jSONObjectM6268b);
        }
    }

    /* renamed from: M */
    public final void m12633M() {
        JSONObject jSONObjectM6268b;
        JSONObject jSONObjectM12643b = m12643b(AbstractC6782a.m6278l(f13582o));
        if (jSONObjectM12643b == null || jSONObjectM12643b.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectM12643b.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectM12643b.opt("content");
        Context context = f13582o;
        if (context == null || jSONObject == null || jSONObject2 == null || (jSONObjectM6268b = AbstractC6782a.m6268b(context, jSONObject, jSONObject2)) == null) {
            return;
        }
        try {
            if (jSONObjectM6268b.has("exception")) {
                AbstractC8959h.m14293c("MobclickRT", "Build envelope error code: " + jSONObjectM6268b.getInt("exception"));
            }
        } catch (Throwable unused) {
        }
        if (AbstractC8263a.m13312e()) {
            m12667z(jSONObjectM6268b);
        }
        m12646e(jSONObjectM6268b);
    }

    /* renamed from: N */
    public final JSONObject m12634N() {
        JSONObject jSONObjectM12635O = m12635O();
        if (jSONObjectM12635O != null) {
            try {
                jSONObjectM12635O.put("st", "1");
            } catch (Throwable unused) {
            }
        }
        return jSONObjectM12635O;
    }

    /* renamed from: O */
    public final JSONObject m12635O() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (AbstractC7839a.f13165b != null && (str = AbstractC7839a.f13166c) != null) {
                jSONObject.put("wrapper_version", str);
                jSONObject.put("wrapper_type", AbstractC7839a.f13165b);
            }
            int iM12280d = AbstractC7839a.m12280d(f13582o);
            jSONObject.put("vertical_type", iM12280d);
            String str2 = "9.3.7";
            if (iM12280d == 1) {
                String strM12277a = AbstractC7839a.m12277a(f13582o);
                if (!TextUtils.isEmpty(strM12277a)) {
                    str2 = strM12277a;
                }
                jSONObject.put("sdk_version", str2);
            } else {
                jSONObject.put("sdk_version", "9.3.7");
            }
            String strM16392a = AbstractC9755c.m16392a(AbstractC7839a.m12279c(f13582o));
            if (!TextUtils.isEmpty(strM16392a)) {
                jSONObject.put("secret", strM16392a);
            }
            String strM6274h = AbstractC6782a.m6274h(f13582o, "pr_ve", null);
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f13582o);
            String strM6274h2 = AbstractC6782a.m6274h(f13582o, "ekv_bl_ver", "");
            if (!TextUtils.isEmpty(strM6274h2)) {
                if (AbstractC7839a.f13170g) {
                    jSONObject.put("$ekv_bl_ver", "");
                } else {
                    jSONObject.put("$ekv_bl_ver", strM6274h2);
                }
            }
            String strM6274h3 = AbstractC6782a.m6274h(f13582o, "ekv_wl_ver", "");
            if (!TextUtils.isEmpty(strM6274h3)) {
                if (AbstractC7839a.f13171h) {
                    jSONObject.put("$ekv_wl_ver", "");
                } else {
                    jSONObject.put("$ekv_wl_ver", strM6274h3);
                }
            }
            jSONObject.put("pro_ver", "1.0.0");
            if (m12642V()) {
                jSONObject.put("atm", "1");
                if (sharedPreferencesM16841a != null) {
                    sharedPreferencesM16841a.edit().putLong("ana_is_f", 0L).commit();
                }
            }
            jSONObject.put("$pr_ve", m12636P());
            jSONObject.put("$ud_da", m12637Q());
            if (sharedPreferencesM16841a != null) {
                String string = sharedPreferencesM16841a.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String str3 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(strM6274h)) {
                        jSONObject.put("$pr_ve", sharedPreferencesM16841a.getString("vers_pre_version", "0"));
                        jSONObject.put("$ud_da", sharedPreferencesM16841a.getString("vers_date", str3));
                    }
                    sharedPreferencesM16841a.edit().putString("pre_version", string).putString("cur_version", AbstractC9754b.m16374i(f13582o)).putString("pre_date", str3).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    /* renamed from: P */
    public final String m12636P() {
        String string = "0";
        String strM6274h = null;
        try {
            strM6274h = AbstractC6782a.m6274h(f13582o, "pr_ve", null);
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(strM6274h)) {
            string = strM6274h;
        } else {
            if (!TextUtils.isEmpty(this.f13587c)) {
                return this.f13587c;
            }
            if (this.f13586b == null) {
                this.f13586b = AbstractC9866a.m16841a(f13582o);
            }
            String string2 = this.f13586b.getString("pre_version", "");
            String strM16374i = AbstractC9754b.m16374i(f13582o);
            if (TextUtils.isEmpty(string2)) {
                this.f13586b.edit().putString("pre_version", "0").putString("cur_version", strM16374i).commit();
            } else {
                string = this.f13586b.getString("cur_version", "");
                if (strM16374i.equals(string)) {
                    string = string2;
                } else {
                    this.f13586b.edit().putString("pre_version", string).putString("cur_version", strM16374i).commit();
                }
            }
        }
        this.f13587c = string;
        return string;
    }

    /* renamed from: Q */
    public final String m12637Q() {
        String strM6274h = null;
        try {
            strM6274h = AbstractC6782a.m6274h(f13582o, "ud_da", null);
            if (TextUtils.isEmpty(strM6274h)) {
                if (!TextUtils.isEmpty(this.f13588d)) {
                    return this.f13588d;
                }
                if (this.f13586b == null) {
                    this.f13586b = AbstractC9866a.m16841a(f13582o);
                }
                String string = this.f13586b.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f13586b.edit().putString("pre_date", string).commit();
                } else {
                    String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(str)) {
                        this.f13586b.edit().putString("pre_date", str).commit();
                        strM6274h = str;
                    }
                }
                strM6274h = string;
            }
        } catch (Throwable unused) {
        }
        this.f13588d = strM6274h;
        return strM6274h;
    }

    /* renamed from: R */
    public final void m12638R() {
        try {
            this.f13592h = 0;
            this.f13593i = 0;
            this.f13594j = System.currentTimeMillis();
            AbstractC9866a.m16841a(f13582o).edit().putLong("dstk_last_time", System.currentTimeMillis()).putInt("dstk_cnt", 0).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: S */
    public final boolean m12639S() {
        try {
            if (!TextUtils.isEmpty(C6770e.m6155d().m6164j())) {
                m12658q(f13582o);
            }
            if (this.f13590f.length() <= 0) {
                return false;
            }
            for (int i9 = 0; i9 < this.f13590f.length(); i9++) {
                JSONObject jSONObjectOptJSONObject = this.f13590f.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    String strOptString = jSONObjectOptJSONObject.optString("__i");
                    if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: T */
    public final void m12640T() {
        if (this.f13590f.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i9 = 0; i9 < this.f13590f.length(); i9++) {
                try {
                    JSONObject jSONObject = this.f13590f.getJSONObject(i9);
                    if (jSONObject == null || jSONObject.length() <= 0) {
                        jSONArray.put(jSONObject);
                    } else {
                        String strOptString = jSONObject.optString("__i");
                        String str = "-1";
                        if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                            String strM6164j = C6770e.m6155d().m6164j();
                            if (!TextUtils.isEmpty(strM6164j)) {
                                str = strM6164j;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.f13590f = jSONArray;
        }
    }

    /* renamed from: U */
    public final void m12641U() {
        Context context;
        SharedPreferences sharedPreferencesM16841a;
        try {
            if (!m12642V() || (context = f13582o) == null || (sharedPreferencesM16841a = AbstractC9866a.m16841a(context)) == null || sharedPreferencesM16841a.getLong("first_activate_time", 0L) != 0) {
                return;
            }
            sharedPreferencesM16841a.edit().putLong("first_activate_time", System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: V */
    public final boolean m12642V() {
        SharedPreferences sharedPreferencesM16841a;
        try {
            Context context = f13582o;
            if (context == null || (sharedPreferencesM16841a = AbstractC9866a.m16841a(context)) == null) {
                return false;
            }
            return sharedPreferencesM16841a.getLong("ana_is_f", -1L) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public JSONObject m12643b(long j9) {
        if (TextUtils.isEmpty(C6772g.m6179b().m6187i(f13582o))) {
            return null;
        }
        JSONObject jSONObjectM12656o = m12656o(false);
        int iM12699a = C8030n0.m12698b().m12699a(f13582o);
        if (jSONObjectM12656o.length() > 0) {
            if (jSONObjectM12656o.length() == 1) {
                if (jSONObjectM12656o.optJSONObject("active_user") != null && iM12699a != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(jSONObjectM12656o.optString("userlevel")) && iM12699a != 3) {
                    return null;
                }
            } else if (jSONObjectM12656o.length() == 2 && jSONObjectM12656o.optJSONObject("active_user") != null && !TextUtils.isEmpty(jSONObjectM12656o.optString("userlevel")) && iM12699a != 3) {
                return null;
            }
            String strOptString = jSONObjectM12656o.optString("sessions");
            String strOptString2 = jSONObjectM12656o.optString("gkv");
            String strOptString3 = jSONObjectM12656o.optString("ekv");
            if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && m12653l(jSONObjectM12656o)) {
                return null;
            }
        } else if (iM12699a != 3) {
            return null;
        }
        JSONObject jSONObjectM12635O = m12635O();
        if (jSONObjectM12635O != null) {
            m12663v(jSONObjectM12635O);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (iM12699a == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (jSONObjectM12656o.length() > 0) {
                jSONObject2.put("analytics", jSONObjectM12656o);
            }
            if (jSONObjectM12635O != null && jSONObjectM12635O.length() > 0) {
                jSONObject.put("header", jSONObjectM12635O);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return m12644c(jSONObject, j9);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: c */
    public final JSONObject m12644c(JSONObject jSONObject, long j9) {
        try {
            if (AbstractC8028m0.m12687b(jSONObject) <= j9) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put("eof", AbstractC8028m0.m12687b(jSONObject));
            jSONObject.put("header", jSONObject2);
            return AbstractC8028m0.m12688c(f13582o, j9, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: d */
    public void m12645d() {
        if (f13582o != null) {
            synchronized (this.f13598n) {
                try {
                    if (this.f13596l) {
                        AbstractC8959h.m14293c("MobclickRT", "--->>> network is now available, rebuild instant session data packet.");
                        Context context = f13582o;
                        AbstractC9089c.m14596m(context, 4353, C7840b.m12281f(context), null);
                    }
                } finally {
                }
            }
            synchronized (this.f13598n) {
                try {
                    if (this.f13597m) {
                        Context context2 = f13582o;
                        AbstractC9089c.m14596m(context2, 4354, C7840b.m12281f(context2), null);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: e */
    public void m12646e(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (!jSONObject.has("exception")) {
                        m12630I(jSONObject);
                    } else {
                        if (101 == jSONObject.getInt("exception")) {
                            return;
                        }
                        m12630I(jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    public void m12647f(Object obj, int i9) {
        if (AbstractC7839a.f13172i) {
            if (i9 == 8213) {
                if (C6780a.m6260e("header_foreground_count")) {
                    if (AbstractC9754b.m16384s(f13582o) != null) {
                        C6770e.m6156k(f13582o);
                    }
                    Context context = f13582o;
                    AbstractC9089c.m14597n(context, 8213, C7840b.m12281f(context), null, CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    return;
                }
                return;
            }
            try {
                switch (i9) {
                    case FragmentTransaction.TRANSIT_FRAGMENT_OPEN /* 4097 */:
                        if (!AbstractC9993d.m17334s(f13582o)) {
                            UMProcessDBHelper.m6229h(f13582o).m6236j(AbstractC6783b.m6289j(f13582o), new JSONArray().put(obj));
                            return;
                        }
                        if (obj != null) {
                            m12625C(obj);
                        }
                        if ("-1".equals(((JSONObject) obj).optString("__i"))) {
                            return;
                        }
                        m12650i(false);
                        return;
                    case InputDeviceCompat.SOURCE_TOUCHSCREEN /* 4098 */:
                        if (obj != null) {
                            m12625C(obj);
                        }
                        if ("-1".equals(((JSONObject) obj).optString("__i"))) {
                            return;
                        }
                        m12650i(false);
                        return;
                    case FragmentTransaction.TRANSIT_FRAGMENT_FADE /* 4099 */:
                        C6771f.m6175b(f13582o);
                        return;
                    case FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN /* 4100 */:
                        C6769d.m6139p(f13582o);
                        return;
                    case 4101:
                        AbstractC8959h.m14293c("MobclickRT", "--->>> PROFILE_SIGNIN");
                        m12648g(null, true);
                        m12629H(obj);
                        return;
                    case 4102:
                        AbstractC8959h.m14293c("MobclickRT", "--->>> PROFILE_SIGNOFF");
                        m12648g(null, true);
                        m12627E(obj);
                        return;
                    case 4103:
                        AbstractC8959h.m14293c("MobclickRT", "--->>> START_SESSION");
                        C6770e.m6155d().m6161g(f13582o, obj);
                        synchronized (this.f13598n) {
                            this.f13597m = true;
                        }
                        return;
                    case 4104:
                        C6770e.m6155d().m6170q(f13582o, obj);
                        return;
                    case 4105:
                        m12665x();
                        return;
                    case 4106:
                        m12631K(obj);
                        return;
                    default:
                        switch (i9) {
                            case LogType.UNEXP_KILL_PROCESS /* 4352 */:
                                AbstractC8959h.m14293c("MobclickRT", "--->>> INSTANT_SESSION_START");
                                C6770e.m6155d().m6166m(f13582o, obj);
                                synchronized (this.f13598n) {
                                    this.f13596l = true;
                                }
                                return;
                            case 4353:
                                m12648g(obj, true);
                                return;
                            case 4354:
                                m12661t();
                                return;
                            case 4355:
                                if (!AbstractC9993d.m17334s(f13582o)) {
                                    UMProcessDBHelper.m6229h(f13582o).m6236j(AbstractC6783b.m6289j(f13582o), new JSONArray().put(obj));
                                    return;
                                } else {
                                    if (obj != null) {
                                        m12625C(obj);
                                        m12665x();
                                        return;
                                    }
                                    return;
                                }
                            case 4356:
                                if (obj == null || f13583p == null || f13584q == null) {
                                    return;
                                }
                                AbstractC8959h.m14293c("MobclickRT", "--->>> PROFILE_CHANGE_NOTIFY");
                                String string = "";
                                String string2 = "";
                                if (obj instanceof JSONObject) {
                                    JSONObject jSONObject = (JSONObject) obj;
                                    if (jSONObject.has("uid") && jSONObject.has("provider")) {
                                        string = jSONObject.getString("provider");
                                        string2 = jSONObject.getString("uid");
                                    }
                                    m12649h(string2, string);
                                    return;
                                }
                                return;
                            default:
                                switch (i9) {
                                    case 8195:
                                        C6752a.m5999b().m6005g(obj);
                                        return;
                                    case 8196:
                                        C6752a.m5999b().m6016r();
                                        return;
                                    case FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE /* 8197 */:
                                        C6752a.m5999b().m6015q();
                                        return;
                                    default:
                                        switch (i9) {
                                            case 8199:
                                            case 8200:
                                                C6752a.m5999b().m6007i(obj);
                                                return;
                                            case 8201:
                                                C6752a.m5999b().m6007i(null);
                                                return;
                                            default:
                                                switch (i9) {
                                                    case 8208:
                                                        AbstractC8959h.m14293c("MobclickRT", "--->>> receive DELAY_BUILD_ENVELOPE event.");
                                                        Context context2 = f13582o;
                                                        AbstractC9089c.m14596m(context2, 8209, C7840b.m12281f(context2), null);
                                                        Context context3 = f13582o;
                                                        AbstractC9089c.m14596m(context3, 4354, C7840b.m12281f(context3), null);
                                                        return;
                                                    case 8209:
                                                        m12648g(obj, false);
                                                        return;
                                                    case 8210:
                                                        AbstractC8959h.m14293c("MobclickRT", "--->>> recv BUILD_ENVELOPE_IMMEDIATELY.");
                                                        if (AbstractC9993d.m17334s(f13582o) && !(this.f13585a.m12674f() instanceof AbstractC9757e.f)) {
                                                            m12650i(true);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                        }
                                }
                        }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public void m12648g(Object obj, boolean z9) {
        if (z9) {
            if (m12623A(true)) {
                m12632L();
            }
        } else if (AbstractC6782a.m6275i(f13582o) && m12623A(true)) {
            m12632L();
        }
    }

    /* renamed from: h */
    public final void m12649h(String str, String str2) {
        Method method;
        Class cls = f13583p;
        if (cls == null || (method = f13584q) == null) {
            return;
        }
        try {
            method.invoke(cls, str, str2);
        } catch (Throwable unused) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> reflect call setPuidAndProvider method of crash lib failed.");
        }
    }

    /* renamed from: i */
    public void m12650i(boolean z9) {
        if (m12664w(z9)) {
            if (!(this.f13585a.m12674f() instanceof AbstractC9757e.f)) {
                if (AbstractC6782a.m6276j(f13582o, UMLogDataProtocol.UMBusinessType.U_APP)) {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> constructMessage()");
                    m12633M();
                    return;
                }
                return;
            }
            if (z9) {
                if (AbstractC6782a.m6275i(f13582o)) {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> send session start in policy ReportQuasiRealtime.");
                    m12633M();
                    return;
                }
                return;
            }
            if (AbstractC6782a.m6276j(f13582o, UMLogDataProtocol.UMBusinessType.U_APP)) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> send normal data in policy ReportQuasiRealtime.");
                m12633M();
            }
        }
    }

    /* renamed from: j */
    public final boolean m12651j(long j9, int i9) {
        if (j9 == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j9 <= 28800000) {
            return i9 < 5000;
        }
        m12638R();
        return true;
    }

    /* renamed from: k */
    public final boolean m12652k(JSONArray jSONArray) {
        int length = jSONArray.length();
        List listAsList = Arrays.asList("$$_onUMengEnterForeground", "$$_onUMengEnterBackground", "$$_onUMengEnterForegroundInitError");
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && listAsList.contains(jSONObjectOptJSONObject.optString("id"))) {
                    i9++;
                }
            } catch (Throwable unused) {
            }
        }
        return i9 >= length;
    }

    /* renamed from: l */
    public final boolean m12653l(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ekv");
        int length = jSONArrayOptJSONArray.length();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(itKeys.next());
                    if (jSONArrayOptJSONArray2 != null && m12652k(jSONArrayOptJSONArray2)) {
                        i9++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i9 >= length;
    }

    /* renamed from: m */
    public JSONObject m12654m(long j9) {
        if (TextUtils.isEmpty(C6772g.m6179b().m6187i(C9468a.m15647b(f13582o)))) {
            return null;
        }
        JSONObject jSONObjectM6214o = C6773h.m6194b(C9468a.m15647b(f13582o)).m6214o(false);
        String[] strArrM12286b = AbstractC7841c.m12286b(f13582o);
        if (strArrM12286b != null && !TextUtils.isEmpty(strArrM12286b[0]) && !TextUtils.isEmpty(strArrM12286b[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("provider", strArrM12286b[0]);
                jSONObject.put("puid", strArrM12286b[1]);
                if (jSONObject.length() > 0) {
                    jSONObjectM6214o.put("active_user", jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int iM12699a = C8030n0.m12698b().m12699a(f13582o);
        if (jSONObjectM6214o.length() == 1 && jSONObjectM6214o.optJSONObject("active_user") != null && iM12699a != 3) {
            return null;
        }
        C8030n0.m12698b().m12703f(jSONObjectM6214o, f13582o);
        if (jSONObjectM6214o.length() <= 0 && iM12699a != 3) {
            return null;
        }
        JSONObject jSONObjectM12634N = m12634N();
        if (jSONObjectM12634N != null) {
            m12660s(jSONObjectM12634N);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            if (iM12699a == 3) {
                jSONObject3.put("analytics", new JSONObject());
            } else if (jSONObjectM6214o.length() > 0) {
                jSONObject3.put("analytics", jSONObjectM6214o);
            }
            if (jSONObjectM12634N != null && jSONObjectM12634N.length() > 0) {
                jSONObject2.put("header", jSONObjectM12634N);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("content", jSONObject3);
            }
            return m12655n(jSONObject2, j9);
        } catch (Throwable unused2) {
            return jSONObject2;
        }
    }

    /* renamed from: n */
    public final JSONObject m12655n(JSONObject jSONObject, long j9) {
        try {
            if (AbstractC8028m0.m12687b(jSONObject) <= j9) {
                return jSONObject;
            }
            jSONObject = null;
            C6773h.m6194b(f13582o).m6209j(true, false);
            C6773h.m6194b(f13582o).m6215p();
            AbstractC8959h.m14293c("MobclickRT", "--->>> Instant session packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: o */
    public JSONObject m12656o(boolean z9) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObjectM6203d = null;
        try {
            jSONObjectM6203d = C6773h.m6194b(f13582o).m6203d(z9);
            if (jSONObjectM6203d == null) {
                jSONObjectM6203d = new JSONObject();
            } else {
                try {
                    boolean zHas = jSONObjectM6203d.has("sessions");
                    jSONObjectM6203d = jSONObjectM6203d;
                    if (zHas) {
                        JSONArray jSONArray3 = jSONObjectM6203d.getJSONArray("sessions");
                        JSONArray jSONArray4 = new JSONArray();
                        int i9 = 0;
                        while (i9 < jSONArray3.length()) {
                            JSONObject jSONObject = (JSONObject) jSONArray3.get(i9);
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pages");
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("autopages");
                            if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 != null) {
                                jSONObject.put("pages", jSONArrayOptJSONArray2);
                                jSONObject.remove("autopages");
                            }
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                    arrayList.add((JSONObject) jSONArrayOptJSONArray.get(i10));
                                }
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                                    arrayList.add((JSONObject) jSONArrayOptJSONArray2.get(i11));
                                }
                                C9992c c9992c = new C9992c();
                                c9992c.m17315b("page_start");
                                Collections.sort(arrayList, c9992c);
                                JSONArray jSONArray5 = new JSONArray();
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList.get(i12);
                                    i12++;
                                    jSONArray5.put((JSONObject) obj);
                                }
                                jSONObject.put("pages", jSONArray5);
                                jSONObject.remove("autopages");
                            }
                            if (jSONObject.has("pages")) {
                                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("pages");
                                int i13 = 0;
                                while (i13 < jSONArrayOptJSONArray3.length()) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i13);
                                    if (jSONObject2.has("page_start")) {
                                        jSONArray2 = jSONArray3;
                                        jSONObject2.put("ts", jSONObject2.getLong("page_start"));
                                        jSONObject2.remove("page_start");
                                    } else {
                                        jSONArray2 = jSONArray3;
                                    }
                                    i13++;
                                    jSONArray3 = jSONArray2;
                                }
                                jSONArray = jSONArray3;
                                jSONObject.put("pages", jSONArrayOptJSONArray3);
                                jSONObject.put("$page_num", jSONArrayOptJSONArray3.length());
                            } else {
                                jSONArray = jSONArray3;
                                jSONObject.put("$page_num", 0);
                            }
                            jSONArray4.put(jSONObject);
                            i9++;
                            jSONArray3 = jSONArray;
                        }
                        jSONObjectM6203d.put("sessions", jSONArray4);
                        jSONObjectM6203d = jSONObjectM6203d;
                    }
                } catch (Exception e10) {
                    AbstractC9756d.m16404c("merge pages error");
                    e10.printStackTrace();
                    jSONObjectM6203d = jSONObjectM6203d;
                }
            }
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f13582o);
            if (sharedPreferencesM16841a != null) {
                String string = sharedPreferencesM16841a.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObjectM6203d.put("userlevel", string);
                }
            }
            String[] strArrM12286b = AbstractC7841c.m12286b(f13582o);
            if (strArrM12286b != null && !TextUtils.isEmpty(strArrM12286b[0]) && !TextUtils.isEmpty(strArrM12286b[1])) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("provider", strArrM12286b[0]);
                jSONObject3.put("puid", strArrM12286b[1]);
                if (jSONObject3.length() > 0) {
                    jSONObjectM6203d.put("active_user", jSONObject3);
                }
            }
            if (C9945a.m17137c(f13582o).m17141f()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(C9945a.m17137c(f13582o).m17139d(), C9945a.m17137c(f13582o).m17138b());
                jSONObjectM6203d.put("group_info", jSONObject4);
            }
            C8030n0.m12698b().m12700c(jSONObjectM6203d, f13582o);
        } catch (Throwable unused) {
        }
        return jSONObjectM6203d;
    }

    /* renamed from: q */
    public void m12658q(Context context) {
        try {
            C6773h.m6194b(context).m6224y();
            m12640T();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: r */
    public void m12659r(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (!jSONObject.has("exception")) {
                        m12628F(jSONObject);
                    } else {
                        if (101 == jSONObject.getInt("exception")) {
                            return;
                        }
                        m12628F(jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: s */
    public final void m12660s(JSONObject jSONObject) {
        JSONObject jSONObjectM6195A;
        if (C6773h.m6194b(C9468a.m15647b(f13582o)).m6222w() || (jSONObjectM6195A = C6773h.m6194b(C9468a.m15647b(f13582o)).m6195A()) == null) {
            return;
        }
        String strOptString = jSONObjectM6195A.optString("__av");
        String strOptString2 = jSONObjectM6195A.optString("__vc");
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject.put("app_version", AbstractC9993d.m17320e(f13582o));
            } else {
                jSONObject.put("app_version", strOptString);
            }
            if (TextUtils.isEmpty(strOptString2)) {
                jSONObject.put("version_code", AbstractC9993d.m17319d(f13582o));
            } else {
                jSONObject.put("version_code", strOptString2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: t */
    public void m12661t() {
        m12658q(f13582o);
        m12665x();
        m12650i(true);
    }

    /* renamed from: u */
    public void m12662u(Object obj) {
        m12658q(f13582o);
        m12665x();
        if (m12623A(false)) {
            m12633M();
        }
    }

    /* renamed from: v */
    public final void m12663v(JSONObject jSONObject) {
        try {
            if (C6773h.m6194b(f13582o).m6225z()) {
                jSONObject.put("app_version", AbstractC9993d.m17320e(f13582o));
                jSONObject.put("version_code", AbstractC9993d.m17319d(f13582o));
                return;
            }
            JSONObject jSONObjectM6196B = C6773h.m6194b(f13582o).m6196B();
            if (jSONObjectM6196B != null) {
                String strOptString = jSONObjectM6196B.optString("__av");
                String strOptString2 = jSONObjectM6196B.optString("__vc");
                if (TextUtils.isEmpty(strOptString)) {
                    jSONObject.put("app_version", AbstractC9993d.m17320e(f13582o));
                } else {
                    jSONObject.put("app_version", strOptString);
                }
                if (TextUtils.isEmpty(strOptString2)) {
                    jSONObject.put("version_code", AbstractC9993d.m17319d(f13582o));
                } else {
                    jSONObject.put("version_code", strOptString2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: w */
    public final boolean m12664w(boolean z9) {
        if (m12642V()) {
            return true;
        }
        if (this.f13585a == null) {
            this.f13585a = new c();
        }
        this.f13585a.m12670b();
        AbstractC9757e.h hVarM12674f = this.f13585a.m12674f();
        boolean zMo16419b = hVarM12674f.mo16419b(z9);
        if (zMo16419b) {
            if (((hVarM12674f instanceof AbstractC9757e.d) || (hVarM12674f instanceof AbstractC9757e.a) || (hVarM12674f instanceof AbstractC9757e.f)) && m12639S()) {
                m12665x();
            }
            if ((hVarM12674f instanceof AbstractC9757e.b) && m12639S()) {
                m12665x();
            }
            if (AbstractC8263a.m13312e()) {
                AbstractC9756d.m16402a("数据发送策略 : " + hVarM12674f.getClass().getSimpleName());
            }
        }
        return zMo16419b;
    }

    /* renamed from: x */
    public void m12665x() {
        try {
            if (this.f13590f.length() > 0) {
                AbstractC8959h.m14293c("MobclickRT", "--->>>*** flushMemoryData: 事件落库。");
                C6773h.m6194b(f13582o).m6207h(this.f13590f);
                this.f13590f = new JSONArray();
            }
            AbstractC9866a.m16841a(f13582o).edit().putLong("thtstart", this.f13594j).putInt("gkvc", this.f13592h).putInt("ekvc", this.f13593i).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: y */
    public void m12666y(Object obj) {
        m12641U();
        m12636P();
        m12637Q();
        m12650i(true);
    }

    /* renamed from: z */
    public final void m12667z(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("analytics");
                if (jSONObject4.has("ekv")) {
                    str = "version_code";
                    jSONObject3.put("ekv", jSONObject4.getJSONArray("ekv"));
                    if (jSONObject3.length() > 0) {
                        AbstractC9756d.m16402a("事件:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    str = "version_code";
                }
                if (jSONObject4.has("gkv")) {
                    jSONObject3.put("gkv", jSONObject4.getJSONArray("gkv"));
                    if (jSONObject3.length() > 0) {
                        AbstractC9756d.m16402a("游戏事件:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has("error")) {
                    jSONObject3.put("error", jSONObject4.getJSONArray("error"));
                    if (jSONObject3.length() > 0) {
                        AbstractC9756d.m16402a("错误:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has("sessions")) {
                    JSONArray jSONArray = jSONObject4.getJSONArray("sessions");
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i9);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has("autopages")) {
                                jSONObject5.remove("autopages");
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put("sessions", jSONArray2);
                    if (jSONObject3.length() > 0) {
                        AbstractC9756d.m16402a("会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has("activate_msg")) {
                    jSONObject3.put("activate_msg", jSONObject4.getJSONObject("activate_msg"));
                }
                if (jSONObject4.has("active_user")) {
                    jSONObject3.put("active_user", jSONObject4.getJSONObject("active_user"));
                    if (jSONObject3.length() > 0) {
                        AbstractC9756d.m16402a("账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            } else {
                str = "version_code";
            }
            if (jSONObject.has("dplus")) {
                jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has("header") && jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has("sdk_version")) {
                    jSONObject3.put("sdk_version", jSONObject2.getString("sdk_version"));
                }
                if (jSONObject2.has("device_id")) {
                    jSONObject3.put("device_id", jSONObject2.getString("device_id"));
                }
                if (jSONObject2.has("device_model")) {
                    jSONObject3.put("device_model", jSONObject2.getString("device_model"));
                }
                String str2 = str;
                if (jSONObject2.has(str2)) {
                    jSONObject3.put("version", jSONObject2.getInt(str2));
                }
                if (jSONObject2.has("appkey")) {
                    jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                }
                if (jSONObject2.has("channel")) {
                    jSONObject3.put("channel", jSONObject2.getString("channel"));
                }
                if (jSONObject3.length() > 0) {
                    AbstractC9756d.m16402a("基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            AbstractC9756d.m16408g(th);
        }
    }

    public C8024k0() {
        this.f13585a = null;
        this.f13586b = null;
        this.f13587c = null;
        this.f13588d = null;
        this.f13589e = 10;
        this.f13590f = new JSONArray();
        this.f13591g = 5000;
        this.f13592h = 0;
        this.f13593i = 0;
        this.f13594j = 0L;
        this.f13595k = 28800000L;
        this.f13596l = false;
        this.f13597m = false;
        this.f13598n = new Object();
        try {
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f13582o);
            this.f13594j = sharedPreferencesM16841a.getLong("thtstart", 0L);
            this.f13592h = sharedPreferencesM16841a.getInt("gkvc", 0);
            this.f13593i = sharedPreferencesM16841a.getInt("ekvc", 0);
            this.f13585a = new c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    public void m12657p() {
    }
}
