package p344t5;

import android.text.TextUtils;
import com.huawei.hms.push.EnumC7321k;
import com.huawei.hms.support.log.HMSLog;
import com.taobao.agoo.p087a.p088a.AbstractC7706b;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
import p038c0.AbstractC5206b;

/* renamed from: t5.m */
/* loaded from: classes5.dex */
public class C11239m {

    /* renamed from: B */
    public int f26947B;

    /* renamed from: D */
    public String f26949D;

    /* renamed from: b */
    public int f26953b;

    /* renamed from: c */
    public String f26954c;

    /* renamed from: d */
    public String f26955d;

    /* renamed from: l */
    public String f26963l;

    /* renamed from: m */
    public String f26964m;

    /* renamed from: n */
    public String f26965n;

    /* renamed from: o */
    public String f26966o;

    /* renamed from: p */
    public String f26967p;

    /* renamed from: r */
    public String f26969r;

    /* renamed from: s */
    public String f26970s;

    /* renamed from: z */
    public String f26977z;

    /* renamed from: a */
    public String f26952a = "";

    /* renamed from: e */
    public String f26956e = "";

    /* renamed from: f */
    public String f26957f = "";

    /* renamed from: g */
    public String f26958g = "";

    /* renamed from: h */
    public String f26959h = "";

    /* renamed from: i */
    public String f26960i = "";

    /* renamed from: j */
    public String f26961j = "";

    /* renamed from: k */
    public String f26962k = "";

    /* renamed from: q */
    public String f26968q = "";

    /* renamed from: t */
    public int f26971t = EnumC7321k.STYLE_DEFAULT.ordinal();

    /* renamed from: u */
    public String f26972u = "";

    /* renamed from: v */
    public String f26973v = "";

    /* renamed from: w */
    public String f26974w = "";

    /* renamed from: x */
    public int f26975x = 0;

    /* renamed from: y */
    public int f26976y = 0;

    /* renamed from: A */
    public String f26946A = "";

    /* renamed from: C */
    public String f26948C = "";

    /* renamed from: E */
    public String f26950E = "";

    /* renamed from: F */
    public String f26951F = "";

    public C11239m(byte[] bArr, byte[] bArr2) {
        Charset charset = AbstractC11237k.f26944a;
        this.f26969r = new String(bArr, charset);
        this.f26970s = new String(bArr2, charset);
    }

    /* renamed from: A */
    public byte[] m25028A() {
        try {
            return m25041b(m25042c(m25045f(m25035H()), m25031D())).toString().getBytes(AbstractC11237k.f26944a);
        } catch (JSONException e10) {
            HMSLog.m8726e("PushSelfShowLog", "getMsgData failed JSONException:", e10);
            return new byte[0];
        }
    }

    /* renamed from: B */
    public String m25029B() {
        HMSLog.m8722d("PushSelfShowLog", "msgId =" + this.f26956e);
        return this.f26956e;
    }

    /* renamed from: C */
    public String m25030C() {
        return this.f26946A;
    }

    /* renamed from: D */
    public final JSONObject m25031D() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("style", this.f26971t);
        jSONObject.put("bigTitle", this.f26972u);
        jSONObject.put("bigContent", this.f26973v);
        jSONObject.put("bigPic", this.f26974w);
        return jSONObject;
    }

    /* renamed from: E */
    public int m25032E() {
        return this.f26947B;
    }

    /* renamed from: F */
    public String m25033F() {
        return this.f26962k;
    }

    /* renamed from: G */
    public String m25034G() {
        return this.f26961j;
    }

    /* renamed from: H */
    public final JSONObject m25035H() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoClear", this.f26953b);
        jSONObject.put("url", this.f26965n);
        jSONObject.put("rpl", this.f26966o);
        jSONObject.put("rpt", this.f26967p);
        jSONObject.put("rpct", this.f26968q);
        jSONObject.put("appPackageName", this.f26963l);
        jSONObject.put("acn", this.f26964m);
        jSONObject.put("intentUri", this.f26954c);
        return jSONObject;
    }

    /* renamed from: I */
    public int m25036I() {
        return this.f26971t;
    }

    /* renamed from: J */
    public String m25037J() {
        return this.f26949D;
    }

    /* renamed from: K */
    public byte[] m25038K() {
        return this.f26970s.getBytes(AbstractC11237k.f26944a);
    }

    /* renamed from: L */
    public boolean m25039L() throws JSONException {
        try {
            if (TextUtils.isEmpty(this.f26969r)) {
                HMSLog.m8722d("PushSelfShowLog", "msg is null");
                return false;
            }
            JSONObject jSONObject = new JSONObject(this.f26969r);
            m25055p(jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject("msgContent");
            if (!m25051l(jSONObject2)) {
                return false;
            }
            this.f26957f = jSONObject2.optString("dispPkgName");
            m25047h(jSONObject2);
            this.f26947B = jSONObject2.optInt("notifyId", -1);
            this.f26948C = jSONObject2.optString("data");
            this.f26951F = jSONObject2.optString("analyticInfo");
            return m25059t(jSONObject2);
        } catch (JSONException unused) {
            HMSLog.m8722d("PushSelfShowLog", "parse message exception.");
            return false;
        } catch (Exception e10) {
            HMSLog.m8722d("PushSelfShowLog", e10.toString());
            return false;
        }
    }

    /* renamed from: a */
    public String m25040a() {
        return this.f26964m;
    }

    /* renamed from: b */
    public final JSONObject m25041b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("msgContent", jSONObject);
        jSONObject2.put(AbstractC5206b.NOTIFICATION_GROUP, this.f26952a);
        jSONObject2.put("tag", this.f26946A);
        jSONObject2.put("autoCancel", this.f26975x);
        jSONObject2.put("visibility", this.f26976y);
        jSONObject2.put("when", this.f26977z);
        return jSONObject2;
    }

    /* renamed from: c */
    public final JSONObject m25042c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("dispPkgName", this.f26957f);
        jSONObject3.put("msgId", this.f26956e);
        jSONObject3.put("ap", this.f26955d);
        jSONObject3.put("notifyId", this.f26947B);
        jSONObject3.put("psContent", jSONObject);
        jSONObject3.put("notifyDetail", jSONObject2);
        jSONObject3.put("ticker", this.f26949D);
        jSONObject3.put("data", this.f26948C);
        return jSONObject3;
    }

    /* renamed from: d */
    public void m25043d(int i10) {
        this.f26947B = i10;
    }

    /* renamed from: e */
    public String m25044e() {
        return this.f26951F;
    }

    /* renamed from: f */
    public final JSONObject m25045f(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(AbstractC7706b.JSON_CMD, this.f26958g);
        jSONObject2.put("content", this.f26959h);
        jSONObject2.put("notifyIcon", this.f26960i);
        jSONObject2.put("notifyTitle", this.f26961j);
        jSONObject2.put("notifySummary", this.f26962k);
        jSONObject2.put("param", jSONObject);
        return jSONObject2;
    }

    /* renamed from: g */
    public String m25046g() {
        return this.f26963l;
    }

    /* renamed from: h */
    public final void m25047h(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("ap")) {
            String string = jSONObject.getString("ap");
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(string) || string.length() >= 48) {
                this.f26955d = string.substring(0, 48);
                return;
            }
            int length = 48 - string.length();
            for (int i10 = 0; i10 < length; i10++) {
                sb2.append("0");
            }
            sb2.append(string);
            this.f26955d = sb2.toString();
        }
    }

    /* renamed from: i */
    public int m25048i() {
        return this.f26975x;
    }

    /* renamed from: j */
    public final boolean m25049j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("acn")) {
            this.f26964m = jSONObject.getString("acn");
        }
        if (jSONObject.has("intentUri")) {
            this.f26954c = jSONObject.getString("intentUri");
        }
        if (jSONObject.has("appPackageName")) {
            this.f26963l = jSONObject.getString("appPackageName");
            return true;
        }
        HMSLog.m8722d("PushSelfShowLog", "appPackageName is null");
        return false;
    }

    /* renamed from: k */
    public int m25050k() {
        return this.f26953b;
    }

    /* renamed from: l */
    public final boolean m25051l(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("msgId")) {
            HMSLog.m8727i("PushSelfShowLog", "msgId == null");
            return false;
        }
        Object obj = jSONObject.get("msgId");
        if (obj instanceof String) {
            this.f26956e = (String) obj;
            return true;
        }
        if (!(obj instanceof Integer)) {
            return true;
        }
        this.f26956e = String.valueOf(((Integer) obj).intValue());
        return true;
    }

    /* renamed from: m */
    public String m25052m() {
        return this.f26973v;
    }

    /* renamed from: n */
    public final boolean m25053n(JSONObject jSONObject) throws JSONException {
        HMSLog.m8722d("PushSelfShowLog", "enter parseNotifyParam");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("notifyDetail");
            if (jSONObject2.has("style")) {
                this.f26971t = jSONObject2.getInt("style");
            }
            this.f26972u = jSONObject2.optString("bigTitle");
            this.f26973v = jSONObject2.optString("bigContent");
            this.f26950E = jSONObject2.optString("icon");
            return true;
        } catch (JSONException e10) {
            HMSLog.m8727i("PushSelfShowLog", e10.toString());
            return false;
        }
    }

    /* renamed from: o */
    public String m25054o() {
        return this.f26972u;
    }

    /* renamed from: p */
    public final void m25055p(JSONObject jSONObject) {
        this.f26952a = jSONObject.optString(AbstractC5206b.NOTIFICATION_GROUP);
        HMSLog.m8722d("PushSelfShowLog", "NOTIFY_GROUP:" + this.f26952a);
        this.f26975x = jSONObject.optInt("autoCancel", 1);
        HMSLog.m8722d("PushSelfShowLog", "autoCancel: " + this.f26975x);
        this.f26976y = jSONObject.optInt("visibility", 0);
        this.f26977z = jSONObject.optString("when");
        this.f26946A = jSONObject.optString("tag");
    }

    /* renamed from: q */
    public String m25056q() {
        return this.f26958g;
    }

    /* renamed from: r */
    public final boolean m25057r(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("param");
            if (jSONObject2.has("autoClear")) {
                this.f26953b = jSONObject2.getInt("autoClear");
            } else {
                this.f26953b = 0;
            }
            if (!"app".equals(this.f26958g) && !"cosa".equals(this.f26958g)) {
                if ("url".equals(this.f26958g)) {
                    m25063x(jSONObject2);
                    return true;
                }
                if (!"rp".equals(this.f26958g)) {
                    return true;
                }
                m25061v(jSONObject2);
                return true;
            }
            m25049j(jSONObject2);
            return true;
        } catch (Exception e10) {
            HMSLog.m8726e("PushSelfShowLog", "ParseParam error ", e10);
            return false;
        }
    }

    /* renamed from: s */
    public String m25058s() {
        return this.f26959h;
    }

    /* renamed from: t */
    public final boolean m25059t(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("psContent")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("psContent");
            this.f26958g = jSONObject2.getString(AbstractC7706b.JSON_CMD);
            this.f26959h = jSONObject2.optString("content");
            this.f26960i = jSONObject2.optString("notifyIcon");
            this.f26961j = jSONObject2.optString("notifyTitle");
            this.f26962k = jSONObject2.optString("notifySummary");
            this.f26949D = jSONObject2.optString("ticker");
            if ((!jSONObject2.has("notifyDetail") || m25053n(jSONObject2)) && jSONObject2.has("param")) {
                return m25057r(jSONObject2);
            }
        }
        return false;
    }

    /* renamed from: u */
    public String m25060u() {
        return this.f26957f;
    }

    /* renamed from: v */
    public final boolean m25061v(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("appPackageName")) {
            this.f26963l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            HMSLog.m8722d("PushSelfShowLog", "rpl or rpt is null");
            return false;
        }
        this.f26966o = jSONObject.getString("rpl");
        this.f26967p = jSONObject.getString("rpt");
        if (!jSONObject.has("rpct")) {
            return true;
        }
        this.f26968q = jSONObject.getString("rpct");
        return true;
    }

    /* renamed from: w */
    public String m25062w() {
        return this.f26952a;
    }

    /* renamed from: x */
    public final boolean m25063x(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("url")) {
            HMSLog.m8722d("PushSelfShowLog", "url is null");
            return false;
        }
        this.f26965n = jSONObject.getString("url");
        if (jSONObject.has("appPackageName")) {
            this.f26963l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            return true;
        }
        this.f26966o = jSONObject.getString("rpl");
        this.f26967p = jSONObject.getString("rpt");
        if (!jSONObject.has("rpct")) {
            return true;
        }
        this.f26968q = jSONObject.getString("rpct");
        return true;
    }

    /* renamed from: y */
    public String m25064y() {
        return this.f26950E;
    }

    /* renamed from: z */
    public String m25065z() {
        return this.f26954c;
    }
}
