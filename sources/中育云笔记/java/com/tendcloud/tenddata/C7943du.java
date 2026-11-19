package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.CoroutineLiveDataKt;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.HttpConstant;
import com.taobao.accs.AccsState;
import com.tendcloud.tenddata.C7902cg;
import com.tendcloud.tenddata.C7924db;
import com.tendcloud.tenddata.C7960ek;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.du */
/* loaded from: classes5.dex */
public class C7943du {

    /* renamed from: a */
    private static final int f14774a = 0;

    /* renamed from: b */
    private static final int f14775b = 1;

    /* renamed from: c */
    private static final int f14776c = 3;

    /* renamed from: i */
    private static String f14777i = null;

    /* renamed from: j */
    private static String f14778j = "TDpref_cloudcontrol";

    /* renamed from: k */
    private static final String f14779k = "TDpref_config";

    /* renamed from: l */
    private static final String f14780l = "TDpref_last_request_time";

    /* renamed from: m */
    private static final String f14781m = "TDpref_cloud_cv";

    /* renamed from: o */
    private static boolean f14783o;

    /* renamed from: s */
    private static String f14787s;

    /* renamed from: t */
    private static String f14788t;

    /* renamed from: u */
    private static String f14789u;

    /* renamed from: v */
    private static String f14790v;

    /* renamed from: d */
    private long f14793d = 720;

    /* renamed from: e */
    private long f14794e = 604800000;

    /* renamed from: f */
    private HashMap<String, JSONObject> f14795f = new HashMap<>();

    /* renamed from: g */
    private HashSet<String> f14796g = new HashSet<>();

    /* renamed from: h */
    private JSONObject f14797h = new JSONObject();

    /* renamed from: x */
    private int f14798x;

    /* renamed from: y */
    private Handler f14799y;

    /* renamed from: n */
    private static String[] f14782n = {"232", "206", "284", "280", "219", "230", "238", "248", "244", "208", "308", "340", "543", "546", "547", "647", "742", "262", "202", "216", "272", "222", "247", "246", "270", "278", "204", "363", "362", "260", "268", "226", "231", "293", "214", "240", "234", "235", "266", "346", "348", "350", "354", "376", "750", "454", "455", "466", "525", "310", "311", "312", "313", "314", "315", "316", "330", "332", "534", "535", "544", "302", "505", "530", "548"};

    /* renamed from: p */
    private static boolean f14784p = true;

    /* renamed from: q */
    private static boolean f14785q = false;

    /* renamed from: r */
    private static boolean f14786r = true;

    /* renamed from: w */
    private static boolean f14791w = false;

    /* renamed from: z */
    private static boolean f14792z = true;

    /* renamed from: A */
    private static volatile C7943du f14773A = null;

    private C7943du() {
        this.f14799y = null;
        HandlerThread handlerThread = new HandlerThread("ModuleCloudControl", 10);
        handlerThread.start();
        this.f14799y = new Handler(handlerThread.getLooper()) { // from class: com.tendcloud.tenddata.du.1
            String appId;
            String channelId;
            AbstractC7841a features;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                try {
                    Object obj = message.obj;
                    if (obj != null) {
                        HashMap map = (HashMap) obj;
                        this.appId = String.valueOf(map.get("appId"));
                        this.channelId = String.valueOf(map.get("channelId"));
                        this.features = (AbstractC7841a) map.get("Features");
                    }
                    int i10 = message.what;
                    if (i10 == 0) {
                        C7943du.this.m11796b(this.appId, this.channelId, this.features);
                        return;
                    }
                    if (i10 == 1) {
                        boolean unused = C7943du.f14792z = false;
                        C7943du.this.m11796b(this.appId, this.channelId, this.features);
                        return;
                    }
                    if (i10 != 3) {
                        return;
                    }
                    C7961el c7961el = new C7961el();
                    c7961el.f14869b = "app";
                    c7961el.f14870c = "initaddition";
                    c7961el.f14868a = this.features;
                    C7913cr.m11625a().post(c7961el);
                    C7960ek c7960ek = new C7960ek();
                    c7960ek.f14866a = this.features;
                    c7960ek.f14867b = C7960ek.a.IMMEDIATELY;
                    C7913cr.m11625a().post(c7960ek);
                } catch (Throwable unused2) {
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m11796b(String str, String str2, AbstractC7841a abstractC7841a) {
        try {
            JSONObject jSONObject = new JSONObject();
            m11794a(jSONObject, "bl", Integer.valueOf(this.f14798x));
            m11794a(jSONObject, "pl", (Object) 1);
            m11794a(jSONObject, AccsState.SDK_VERSION, "5.0.17");
            m11794a(jSONObject, "smcc", f14787s);
            m11794a(jSONObject, "smnc", f14788t);
            m11794a(jSONObject, "bmcc", f14789u);
            m11794a(jSONObject, "bmnc", f14790v);
            m11794a(jSONObject, "dt", "Mobile");
            m11794a(jSONObject, "ov", C7899cd.m11427a());
            m11794a(jSONObject, "av", C7897cb.m11400k());
            m11794a(jSONObject, "px", C7899cd.m11444e(C7843ab.f14307g));
            m11794a(jSONObject, "nt", C7903ch.m11544l(C7843ab.f14307g));
            m11794a(jSONObject, "op", C7903ch.m11551s(C7843ab.f14307g));
            m11794a(jSONObject, "ch", str2);
            m11794a(jSONObject, DispatchConstants.CONFIG_VERSION, Long.valueOf(C7906ck.m11568b(C7843ab.f14307g, f14778j, f14781m, 0L)));
            m11794a(jSONObject, "TDID", C7898cc.m11411a(C7843ab.f14307g));
            if (!C7912cq.m11608b(str)) {
                m11794a(jSONObject, "AppID", str);
            }
            C7927de c7927deM11668b = C7921cz.m11668b(C7921cz.m11665a().url(C7842aa.f14229M).host("cloud.cpatrk.net").body(new C7924db(C7924db.a.JSON, jSONObject.toString().getBytes())).header(new C7925dc().m11677a(HttpConstant.ACCEPT_ENCODING, "")).method(EnumC7926dd.POST).build());
            C7902cg.getFileLock(f14777i);
            String strM11613c = C7912cq.m11613c(c7927deM11668b.m11687c());
            if (c7927deM11668b.m11686b() == 200) {
                m11797b(m11789a(new JSONObject(strM11613c)));
                C7906ck.m11566a(C7843ab.f14307g, f14778j, f14780l, System.currentTimeMillis());
            } else if (f14792z) {
                HashMap map = new HashMap();
                if (!C7912cq.m11608b(str)) {
                    map.put("appId", str);
                }
                map.put("channelId", str2);
                map.put("Features", abstractC7841a);
                this.f14799y.sendMessageDelayed(this.f14799y.obtainMessage(1, map), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
            }
        } catch (Throwable unused) {
        }
        C7902cg.releaseFileLock(f14777i);
    }

    /* renamed from: d */
    private void m11799d() {
        try {
            f14778j += this.f14798x;
            f14777i = C7902cg.b.Cloud_Control_Lock_File.toString() + this.f14798x;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private boolean m11800e() {
        long jM11568b = C7906ck.m11568b(C7843ab.f14307g, f14778j, f14780l, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jM11568b == 0) {
            return true;
        }
        long j10 = jCurrentTimeMillis - jM11568b;
        return j10 > this.f14793d * 60000 || j10 > this.f14794e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m11801f() {
        try {
            C7927de c7927deM11668b = C7921cz.m11668b(C7921cz.m11665a().host("cloud.cpatrk.net").url(C7842aa.f14235S).method(EnumC7926dd.GET).build());
            if (c7927deM11668b != null && c7927deM11668b.m11686b() == 200) {
                f14784p = new JSONObject(new String(c7927deM11668b.m11687c())).optBoolean("GDPRregion");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m11802g() {
        try {
            if (this.f14797h.length() == 0) {
                String strM11788a = m11788a(C7902cg.m11502b(f14777i));
                JSONObject jSONObject = !C7912cq.m11608b(strM11788a) ? new JSONObject(strM11788a) : null;
                if (jSONObject == null || jSONObject.length() <= 0) {
                    return;
                }
                this.f14797h = jSONObject;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    private void m11803h() {
        try {
            C7902cg.getFileLock(f14777i);
            String strM11569b = C7906ck.m11569b(C7843ab.f14307g, f14778j, f14779k, "");
            m11797b(!C7912cq.m11608b(strM11569b) ? new JSONObject(strM11569b) : null);
        } catch (Throwable unused) {
        }
        C7902cg.releaseFileLock(f14777i);
    }

    /* renamed from: i */
    private void m11804i() {
        try {
            Iterator<String> itKeys = this.f14797h.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObject = this.f14797h.getJSONObject(itKeys.next());
                Iterator<String> itKeys2 = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    if (!this.f14796g.contains(next)) {
                        arrayList.add(next);
                    }
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    jSONObject.remove((String) arrayList.get(i10));
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void m11809c() {
        m11792a(C7902cg.m11502b(f14777i), this.f14797h.toString());
        this.f14797h = new JSONObject();
    }

    /* renamed from: a */
    public static C7943du m11787a() {
        if (f14773A == null) {
            synchronized (C7943du.class) {
                try {
                    if (f14773A == null) {
                        f14773A = new C7943du();
                    }
                } finally {
                }
            }
        }
        return f14773A;
    }

    /* renamed from: a */
    public void m11807a(String str, String str2, AbstractC7841a abstractC7841a) {
        HashMap map = new HashMap();
        map.put("appId", str);
        if (C7912cq.m11608b(str2)) {
            str2 = "Default";
        }
        map.put("channelId", str2);
        map.put("Features", abstractC7841a);
        this.f14798x = m11786a(abstractC7841a);
        m11799d();
        boolean z10 = C7897cb.m11393e(abstractC7841a) == 1;
        f14785q = z10;
        if (z10) {
            if (!C7903ch.m11540h(C7843ab.f14307g)) {
                C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.du.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C7943du.this.m11801f();
                    }
                });
                Handler handler = this.f14799y;
                handler.sendMessageDelayed(handler.obtainMessage(3, map), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                f14791w = true;
                return;
            }
            f14786r = false;
        }
        String strM11548p = C7903ch.m11548p(C7843ab.f14307g);
        String strM11547o = C7903ch.m11547o(C7843ab.f14307g);
        f14787s = C7912cq.m11608b(strM11548p) ? "" : strM11548p.substring(0, 3);
        f14788t = C7912cq.m11608b(strM11548p) ? "" : strM11548p.substring(3);
        f14789u = C7912cq.m11608b(strM11547o) ? "" : strM11547o.substring(0, 3);
        f14790v = C7912cq.m11608b(strM11547o) ? "" : strM11547o.substring(3);
        f14783o = m11798b(f14787s) || m11798b(f14789u);
        m11803h();
        try {
            if (C7843ab.f14317q || m11800e()) {
                this.f14799y.sendMessage(this.f14799y.obtainMessage(0, map));
            }
        } catch (Throwable unused) {
        }
        f14791w = true;
    }

    /* renamed from: a */
    private void m11794a(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if ((obj instanceof String) && ((String) obj).length() == 0) {
                return;
            }
            jSONObject.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private JSONObject m11789a(JSONObject jSONObject) {
        try {
            String strM11569b = C7906ck.m11569b(C7843ab.f14307g, f14778j, f14779k, "");
            if (!C7912cq.m11608b(strM11569b)) {
                JSONObject jSONObject2 = new JSONObject(strM11569b);
                if (jSONObject.has(DispatchConstants.CONFIG_VERSION) && jSONObject2.getInt(DispatchConstants.CONFIG_VERSION) == jSONObject.getInt(DispatchConstants.CONFIG_VERSION)) {
                    if (jSONObject.has("r")) {
                        jSONObject2.put("r", jSONObject.getJSONArray("r"));
                    }
                    C7906ck.m11567a(C7843ab.f14307g, f14778j, f14779k, jSONObject2.toString());
                    return jSONObject2;
                }
                C7906ck.m11567a(C7843ab.f14307g, f14778j, f14779k, jSONObject.toString());
                if (jSONObject.has(DispatchConstants.CONFIG_VERSION)) {
                    C7906ck.m11566a(C7843ab.f14307g, f14778j, f14781m, jSONObject.getLong(DispatchConstants.CONFIG_VERSION));
                }
                return jSONObject;
            }
            C7906ck.m11567a(C7843ab.f14307g, f14778j, f14779k, jSONObject.toString());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private void m11797b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("i")) {
                this.f14793d = jSONObject.getInt("i");
            }
            this.f14796g = new HashSet<>();
            if (jSONObject.has("c") && jSONObject.has("r")) {
                JSONArray jSONArray = jSONObject.getJSONArray("c");
                JSONArray jSONArray2 = jSONObject.getJSONArray("r");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    int i11 = jSONObject2.getInt(AgooConstants.MESSAGE_ID);
                    for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                        if (i11 == jSONArray2.getInt(i12)) {
                            m11793a(jSONObject2, String.valueOf(i11));
                        }
                        this.f14796g.add(String.valueOf(i11));
                    }
                }
                if (jSONArray.length() == 0) {
                    this.f14795f = new HashMap<>();
                }
                m11802g();
                m11804i();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m11793a(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = (JSONArray) jSONObject.remove("clt");
            jSONObject.remove(AgooConstants.MESSAGE_ID);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (!C7912cq.m11608b(string)) {
                    if (this.f14795f.containsKey(string)) {
                        this.f14795f.get(string).put(str, jSONObject);
                    } else {
                        this.f14795f.put(string, new JSONObject().put(str, jSONObject));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public JSONArray m11805a(String str) {
        return m11806a(str, (JSONObject) null, (JSONObject) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f A[Catch: all -> 0x00eb, TryCatch #0 {all -> 0x00eb, blocks: (B:5:0x000b, B:8:0x0011, B:10:0x0016, B:12:0x001a, B:15:0x001f, B:17:0x0027, B:24:0x0033, B:27:0x003b, B:30:0x0042, B:31:0x0045, B:32:0x0059, B:34:0x005f, B:40:0x008d, B:42:0x0095, B:44:0x00a1, B:46:0x00a7, B:47:0x00bc, B:48:0x00cd, B:49:0x00e4), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONArray m11806a(java.lang.String r13, org.json.JSONObject r14, org.json.JSONObject r15) {
        /*
            r12 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            boolean r1 = com.tendcloud.tenddata.C7943du.f14791w
            if (r1 != 0) goto Lb
            goto Leb
        Lb:
            boolean r1 = com.tendcloud.tenddata.C7843ab.f14317q     // Catch: java.lang.Throwable -> Leb
            if (r1 == 0) goto L11
            goto Leb
        L11:
            boolean r1 = com.tendcloud.tenddata.C7943du.f14785q     // Catch: java.lang.Throwable -> Leb
            r2 = 0
            if (r1 == 0) goto L1f
            boolean r1 = com.tendcloud.tenddata.C7943du.f14786r     // Catch: java.lang.Throwable -> Leb
            if (r1 == 0) goto L1f
            boolean r13 = com.tendcloud.tenddata.C7943du.f14784p     // Catch: java.lang.Throwable -> Leb
            if (r13 == 0) goto Leb
            return r2
        L1f:
            java.util.HashMap<java.lang.String, org.json.JSONObject> r1 = r12.f14795f     // Catch: java.lang.Throwable -> Leb
            boolean r1 = r1.containsKey(r13)     // Catch: java.lang.Throwable -> Leb
            if (r1 != 0) goto L2e
            boolean r13 = com.tendcloud.tenddata.C7943du.f14783o     // Catch: java.lang.Throwable -> Leb
            if (r13 == 0) goto L2d
            goto Leb
        L2d:
            return r2
        L2e:
            r1 = 1
            if (r14 == 0) goto L45
            if (r15 == 0) goto L45
            boolean r14 = r14.has(r13)     // Catch: java.lang.Throwable -> Leb
            if (r14 == 0) goto L3b
            goto Leb
        L3b:
            boolean r14 = r15.has(r13)     // Catch: java.lang.Throwable -> Leb
            if (r14 == 0) goto L42
            return r2
        L42:
            r15.put(r13, r1)     // Catch: java.lang.Throwable -> Leb
        L45:
            java.util.HashMap<java.lang.String, org.json.JSONObject> r14 = r12.f14795f     // Catch: java.lang.Throwable -> Leb
            java.lang.Object r14 = r14.get(r13)     // Catch: java.lang.Throwable -> Leb
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r15 = r14.keys()     // Catch: java.lang.Throwable -> Leb
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Leb
            r3.<init>()     // Catch: java.lang.Throwable -> Leb
            r12.m11802g()     // Catch: java.lang.Throwable -> Leb
        L59:
            boolean r4 = r15.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r4 == 0) goto Le4
            java.lang.Object r4 = r15.next()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Leb
            r3.add(r4)     // Catch: java.lang.Throwable -> Leb
            org.json.JSONObject r5 = r14.getJSONObject(r4)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = "st"
            long r6 = r5.getLong(r6)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r8 = "et"
            long r8 = r5.getLong(r8)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r10 = "cn"
            int r5 = r5.getInt(r10)     // Catch: java.lang.Throwable -> Leb
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Leb
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 < 0) goto L59
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 > 0) goto L59
            if (r5 > 0) goto L8d
            goto L59
        L8d:
            org.json.JSONObject r6 = r12.f14797h     // Catch: java.lang.Throwable -> Leb
            boolean r6 = r6.has(r13)     // Catch: java.lang.Throwable -> Leb
            if (r6 == 0) goto Lcd
            org.json.JSONObject r6 = r12.f14797h     // Catch: java.lang.Throwable -> Leb
            org.json.JSONObject r6 = r6.getJSONObject(r13)     // Catch: java.lang.Throwable -> Leb
            boolean r7 = r6.has(r4)     // Catch: java.lang.Throwable -> Leb
            if (r7 == 0) goto Lbc
            int r7 = r6.getInt(r4)     // Catch: java.lang.Throwable -> Leb
            if (r7 >= r5) goto L59
            int r5 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> Leb
            r0.put(r5)     // Catch: java.lang.Throwable -> Leb
            int r5 = r6.getInt(r4)     // Catch: java.lang.Throwable -> Leb
            int r5 = r5 + r1
            r6.put(r4, r5)     // Catch: java.lang.Throwable -> Leb
            org.json.JSONObject r4 = r12.f14797h     // Catch: java.lang.Throwable -> Leb
            r4.put(r13, r6)     // Catch: java.lang.Throwable -> Leb
            goto L59
        Lbc:
            org.json.JSONObject r5 = r12.f14797h     // Catch: java.lang.Throwable -> Leb
            org.json.JSONObject r6 = r6.put(r4, r1)     // Catch: java.lang.Throwable -> Leb
            r5.put(r13, r6)     // Catch: java.lang.Throwable -> Leb
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> Leb
            r0.put(r4)     // Catch: java.lang.Throwable -> Leb
            goto L59
        Lcd:
            org.json.JSONObject r5 = r12.f14797h     // Catch: java.lang.Throwable -> Leb
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Leb
            r6.<init>()     // Catch: java.lang.Throwable -> Leb
            org.json.JSONObject r6 = r6.put(r4, r1)     // Catch: java.lang.Throwable -> Leb
            r5.put(r13, r6)     // Catch: java.lang.Throwable -> Leb
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> Leb
            r0.put(r4)     // Catch: java.lang.Throwable -> Leb
            goto L59
        Le4:
            int r13 = r0.length()     // Catch: java.lang.Throwable -> Leb
            if (r13 != 0) goto Leb
            return r2
        Leb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7943du.m11806a(java.lang.String, org.json.JSONObject, org.json.JSONObject):org.json.JSONArray");
    }

    /* renamed from: b */
    public String m11808b() {
        return f14777i;
    }

    /* renamed from: b */
    private boolean m11798b(String str) {
        try {
            if (C7912cq.m11608b(str)) {
                return false;
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f14782n;
                if (i10 >= strArr.length) {
                    return true;
                }
                if (str.equals(strArr[i10])) {
                    return false;
                }
                i10++;
            }
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    private int m11786a(AbstractC7841a abstractC7841a) {
        int iIndex = abstractC7841a.index();
        if (iIndex == 0) {
            return 1;
        }
        if (iIndex == 1) {
            return 2;
        }
        if (iIndex != 3) {
            return iIndex != 99 ? -1 : 4;
        }
        return 3;
    }

    /* renamed from: a */
    private void m11792a(RandomAccessFile randomAccessFile, String str) {
        try {
            randomAccessFile.setLength(0L);
            randomAccessFile.seek(0L);
            randomAccessFile.write(str.getBytes());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private String m11788a(RandomAccessFile randomAccessFile) {
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.seek(0L);
            randomAccessFile.read(bArr);
            return new String(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
