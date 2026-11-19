package anet.channel.strategy;

import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: anet.channel.strategy.l */
/* loaded from: classes3.dex */
public class C5070l {

    /* renamed from: anet.channel.strategy.l$a */
    public static class a {

        /* renamed from: a */
        public final int f2688a;

        /* renamed from: b */
        public final String f2689b;

        /* renamed from: c */
        public final int f2690c;

        /* renamed from: d */
        public final int f2691d;

        /* renamed from: e */
        public final int f2692e;

        /* renamed from: f */
        public final int f2693f;

        /* renamed from: g */
        public final String f2694g;

        /* renamed from: h */
        public final String f2695h;

        public a(JSONObject jSONObject) {
            this.f2688a = jSONObject.optInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
            this.f2689b = jSONObject.optString("protocol");
            this.f2690c = jSONObject.optInt("cto");
            this.f2691d = jSONObject.optInt("rto");
            this.f2692e = jSONObject.optInt("retry");
            this.f2693f = jSONObject.optInt("heartbeat");
            this.f2694g = jSONObject.optString("rtt", "");
            this.f2695h = jSONObject.optString("publickey");
        }
    }

    /* renamed from: anet.channel.strategy.l$b */
    public static class b {

        /* renamed from: a */
        public final String f2696a;

        /* renamed from: b */
        public final int f2697b;

        /* renamed from: c */
        public final String f2698c;

        /* renamed from: d */
        public final String f2699d;

        /* renamed from: e */
        public final String f2700e;

        /* renamed from: f */
        public final String[] f2701f;

        /* renamed from: g */
        public final String[] f2702g;

        /* renamed from: h */
        public final a[] f2703h;

        /* renamed from: i */
        public final e[] f2704i;

        /* renamed from: j */
        public final boolean f2705j;

        /* renamed from: k */
        public final boolean f2706k;

        /* renamed from: l */
        public final int f2707l;

        public b(JSONObject jSONObject) {
            this.f2696a = jSONObject.optString(Constants.KEY_HOST);
            this.f2697b = jSONObject.optInt("ttl");
            this.f2698c = jSONObject.optString("safeAisles");
            this.f2699d = jSONObject.optString("cname", null);
            this.f2700e = jSONObject.optString("unit", null);
            this.f2705j = jSONObject.optInt("clear") == 1;
            this.f2706k = jSONObject.optBoolean("effectNow");
            this.f2707l = jSONObject.optInt("version");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.f2701f = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.f2701f[i10] = jSONArrayOptJSONArray.optString(i10);
                }
            } else {
                this.f2701f = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("sips");
            if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                this.f2702g = null;
            } else {
                int length2 = jSONArrayOptJSONArray2.length();
                this.f2702g = new String[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    this.f2702g[i11] = jSONArrayOptJSONArray2.optString(i11);
                }
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("aisles");
            if (jSONArrayOptJSONArray3 != null) {
                int length3 = jSONArrayOptJSONArray3.length();
                this.f2703h = new a[length3];
                for (int i12 = 0; i12 < length3; i12++) {
                    this.f2703h[i12] = new a(jSONArrayOptJSONArray3.optJSONObject(i12));
                }
            } else {
                this.f2703h = null;
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("strategies");
            if (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() <= 0) {
                this.f2704i = null;
                return;
            }
            int length4 = jSONArrayOptJSONArray4.length();
            this.f2704i = new e[length4];
            for (int i13 = 0; i13 < length4; i13++) {
                this.f2704i[i13] = new e(jSONArrayOptJSONArray4.optJSONObject(i13));
            }
        }
    }

    /* renamed from: anet.channel.strategy.l$c */
    public static class c {

        /* renamed from: a */
        public final String f2708a;

        /* renamed from: b */
        public final e[] f2709b;

        public c(JSONObject jSONObject) {
            this.f2708a = jSONObject.optString(Constants.KEY_HOST);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("strategies");
            if (jSONArrayOptJSONArray == null) {
                this.f2709b = null;
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            this.f2709b = new e[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.f2709b[i10] = new e(jSONArrayOptJSONArray.optJSONObject(i10));
            }
        }
    }

    /* renamed from: anet.channel.strategy.l$d */
    public static class d {

        /* renamed from: a */
        public final String f2710a;

        /* renamed from: b */
        public final b[] f2711b;

        /* renamed from: c */
        public final c[] f2712c;

        /* renamed from: d */
        public final String f2713d;

        /* renamed from: e */
        public final String f2714e;

        /* renamed from: f */
        public final int f2715f;

        /* renamed from: g */
        public final int f2716g;

        /* renamed from: h */
        public final int f2717h;

        public d(JSONObject jSONObject) {
            this.f2710a = jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            this.f2713d = jSONObject.optString("uid", null);
            this.f2714e = jSONObject.optString("utdid", null);
            this.f2715f = jSONObject.optInt(DispatchConstants.CONFIG_VERSION);
            this.f2716g = jSONObject.optInt("fcl");
            this.f2717h = jSONObject.optInt("fct");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BaseMonitor.COUNT_POINT_DNS);
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.f2711b = new b[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.f2711b[i10] = new b(jSONArrayOptJSONArray.optJSONObject(i10));
                }
            } else {
                this.f2711b = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("hrTask");
            if (jSONArrayOptJSONArray2 == null) {
                this.f2712c = null;
                return;
            }
            int length2 = jSONArrayOptJSONArray2.length();
            this.f2712c = new c[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                this.f2712c[i11] = new c(jSONArrayOptJSONArray2.optJSONObject(i11));
            }
        }
    }

    /* renamed from: anet.channel.strategy.l$e */
    public static class e {

        /* renamed from: a */
        public final String f2718a;

        /* renamed from: b */
        public final a f2719b;

        /* renamed from: c */
        public final String f2720c;

        public e(JSONObject jSONObject) {
            this.f2718a = jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            this.f2720c = jSONObject.optString("path");
            this.f2719b = new a(jSONObject);
        }
    }

    /* renamed from: a */
    public static d m2504a(JSONObject jSONObject) {
        try {
            return new d(jSONObject);
        } catch (Exception e10) {
            ALog.m2528e("StrategyResultParser", "Parse HttpDns response failed.", null, e10, "JSON Content", jSONObject.toString());
            return null;
        }
    }
}
