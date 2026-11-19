package anet.channel.strategy;

import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: anet.channel.strategy.l */
/* loaded from: classes.dex */
public class C0947l {

    /* renamed from: anet.channel.strategy.l$a */
    public static class a {

        /* renamed from: a */
        public final int f5410a;

        /* renamed from: b */
        public final String f5411b;

        /* renamed from: c */
        public final int f5412c;

        /* renamed from: d */
        public final int f5413d;

        /* renamed from: e */
        public final int f5414e;

        /* renamed from: f */
        public final int f5415f;

        /* renamed from: g */
        public final String f5416g;

        /* renamed from: h */
        public final String f5417h;

        public a(JSONObject jSONObject) {
            this.f5410a = jSONObject.optInt("port");
            this.f5411b = jSONObject.optString("protocol");
            this.f5412c = jSONObject.optInt("cto");
            this.f5413d = jSONObject.optInt("rto");
            this.f5414e = jSONObject.optInt("retry");
            this.f5415f = jSONObject.optInt("heartbeat");
            this.f5416g = jSONObject.optString("rtt", "");
            this.f5417h = jSONObject.optString("publickey");
        }
    }

    /* renamed from: anet.channel.strategy.l$b */
    public static class b {

        /* renamed from: a */
        public final String f5418a;

        /* renamed from: b */
        public final int f5419b;

        /* renamed from: c */
        public final String f5420c;

        /* renamed from: d */
        public final String f5421d;

        /* renamed from: e */
        public final String f5422e;

        /* renamed from: f */
        public final String[] f5423f;

        /* renamed from: g */
        public final String[] f5424g;

        /* renamed from: h */
        public final a[] f5425h;

        /* renamed from: i */
        public final e[] f5426i;

        /* renamed from: j */
        public final boolean f5427j;

        /* renamed from: k */
        public final boolean f5428k;

        /* renamed from: l */
        public final int f5429l;

        public b(JSONObject jSONObject) {
            this.f5418a = jSONObject.optString(Constants.KEY_HOST);
            this.f5419b = jSONObject.optInt("ttl");
            this.f5420c = jSONObject.optString("safeAisles");
            this.f5421d = jSONObject.optString("cname", null);
            this.f5422e = jSONObject.optString("unit", null);
            this.f5427j = jSONObject.optInt("clear") == 1;
            this.f5428k = jSONObject.optBoolean("effectNow");
            this.f5429l = jSONObject.optInt(Constants.SP_KEY_VERSION);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.f5423f = new String[length];
                for (int i4 = 0; i4 < length; i4++) {
                    this.f5423f[i4] = jSONArrayOptJSONArray.optString(i4);
                }
            } else {
                this.f5423f = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("sips");
            if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                this.f5424g = null;
            } else {
                int length2 = jSONArrayOptJSONArray2.length();
                this.f5424g = new String[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    this.f5424g[i5] = jSONArrayOptJSONArray2.optString(i5);
                }
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("aisles");
            if (jSONArrayOptJSONArray3 != null) {
                int length3 = jSONArrayOptJSONArray3.length();
                this.f5425h = new a[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    this.f5425h[i6] = new a(jSONArrayOptJSONArray3.optJSONObject(i6));
                }
            } else {
                this.f5425h = null;
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("strategies");
            if (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() <= 0) {
                this.f5426i = null;
                return;
            }
            int length4 = jSONArrayOptJSONArray4.length();
            this.f5426i = new e[length4];
            for (int i7 = 0; i7 < length4; i7++) {
                this.f5426i[i7] = new e(jSONArrayOptJSONArray4.optJSONObject(i7));
            }
        }
    }

    /* renamed from: anet.channel.strategy.l$c */
    public static class c {

        /* renamed from: a */
        public final String f5430a;

        /* renamed from: b */
        public final e[] f5431b;

        public c(JSONObject jSONObject) {
            this.f5430a = jSONObject.optString(Constants.KEY_HOST);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("strategies");
            if (jSONArrayOptJSONArray == null) {
                this.f5431b = null;
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            this.f5431b = new e[length];
            for (int i4 = 0; i4 < length; i4++) {
                this.f5431b[i4] = new e(jSONArrayOptJSONArray.optJSONObject(i4));
            }
        }
    }

    /* renamed from: anet.channel.strategy.l$d */
    public static class d {

        /* renamed from: a */
        public final String f5432a;

        /* renamed from: b */
        public final b[] f5433b;

        /* renamed from: c */
        public final c[] f5434c;

        /* renamed from: d */
        public final String f5435d;

        /* renamed from: e */
        public final String f5436e;

        /* renamed from: f */
        public final int f5437f;

        /* renamed from: g */
        public final int f5438g;

        /* renamed from: h */
        public final int f5439h;

        public d(JSONObject jSONObject) {
            this.f5432a = jSONObject.optString("ip");
            this.f5435d = jSONObject.optString("uid", null);
            this.f5436e = jSONObject.optString("utdid", null);
            this.f5437f = jSONObject.optInt(DispatchConstants.CONFIG_VERSION);
            this.f5438g = jSONObject.optInt("fcl");
            this.f5439h = jSONObject.optInt("fct");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BaseMonitor.COUNT_POINT_DNS);
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.f5433b = new b[length];
                for (int i4 = 0; i4 < length; i4++) {
                    this.f5433b[i4] = new b(jSONArrayOptJSONArray.optJSONObject(i4));
                }
            } else {
                this.f5433b = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("hrTask");
            if (jSONArrayOptJSONArray2 == null) {
                this.f5434c = null;
                return;
            }
            int length2 = jSONArrayOptJSONArray2.length();
            this.f5434c = new c[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                this.f5434c[i5] = new c(jSONArrayOptJSONArray2.optJSONObject(i5));
            }
        }
    }

    /* renamed from: anet.channel.strategy.l$e */
    public static class e {

        /* renamed from: a */
        public final String f5440a;

        /* renamed from: b */
        public final a f5441b;

        /* renamed from: c */
        public final String f5442c;

        public e(JSONObject jSONObject) {
            this.f5440a = jSONObject.optString("ip");
            this.f5442c = jSONObject.optString("path");
            this.f5441b = new a(jSONObject);
        }
    }

    /* renamed from: a */
    public static d m4613a(JSONObject jSONObject) {
        try {
            return new d(jSONObject);
        } catch (Exception e4) {
            ALog.m4637e("StrategyResultParser", "Parse HttpDns response failed.", null, e4, "JSON Content", jSONObject.toString());
            return null;
        }
    }
}
