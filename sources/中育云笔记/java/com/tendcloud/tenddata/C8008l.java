package com.tendcloud.tenddata;

import android.text.TextUtils;
import anet.channel.request.Request;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.l */
/* loaded from: classes5.dex */
public final class C8008l {

    /* renamed from: b */
    private static final long f15033b = 259200000;

    /* renamed from: c */
    private static final long f15034c = 5;

    /* renamed from: f */
    private static final String f15037f = "frequency";

    /* renamed from: g */
    private static final String f15038g = "interval";

    /* renamed from: h */
    private static final String f15039h = "configVersion";

    /* renamed from: i */
    private static final String f15040i = "lastGetCloudSettingsTime";

    /* renamed from: j */
    private static final String f15041j = "SDKInitNumber";

    /* renamed from: k */
    private static final String f15042k = "TD";

    /* renamed from: n */
    private static final String f15044n = "native";

    /* renamed from: o */
    private static final String f15045o = "hybrid";

    /* renamed from: l */
    private String f15046l = "TDCodelessGetConfig" + C7843ab.m11027a(C7843ab.f14307g, AbstractC7841a.UNIVERSAL);

    /* renamed from: a */
    private static final String f15032a = C7842aa.f14222F + "?";

    /* renamed from: d */
    private static long f15035d = 0;

    /* renamed from: e */
    private static long f15036e = 0;

    /* renamed from: m */
    private static volatile C8008l f15043m = null;

    static {
        try {
            C7913cr.m11625a().register(m12042a());
        } catch (Throwable unused) {
        }
    }

    private C8008l() {
        C8012p.f15063a.execute(new Runnable() { // from class: com.tendcloud.tenddata.l.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (C8008l.this.m12046c()) {
                        C8008l.this.m12047b();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m12046c() {
        try {
            if (C7843ab.m11036b()) {
                C7906ck.m11566a(C7843ab.f14307g, this.f15046l, f15041j, 0L);
                return true;
            }
            C7906ck.m11566a(C7843ab.f14307g, this.f15046l, f15041j, C7906ck.m11568b(C7843ab.f14307g, this.f15046l, f15041j, 0L) + 1);
            long jCurrentTimeMillis = System.currentTimeMillis() - C7906ck.m11568b(C7843ab.f14307g, this.f15046l, f15040i, System.currentTimeMillis());
            long jM11568b = C7906ck.m11568b(C7843ab.f14307g, this.f15046l, f15038g, 0L);
            long jM11568b2 = C7906ck.m11568b(C7843ab.f14307g, this.f15046l, f15037f, 1L);
            long jM11568b3 = C7906ck.m11568b(C7843ab.f14307g, this.f15046l, f15041j, 0L);
            if ((jM11568b2 != 1 || jCurrentTimeMillis < jM11568b) && (jM11568b2 == 1 || jM11568b3 < jM11568b2)) {
                return false;
            }
            C7906ck.m11566a(C7843ab.f14307g, this.f15046l, f15041j, 0L);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public void m12047b() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("id=" + C7843ab.m11027a(C7843ab.f14307g, AbstractC7841a.UNIVERSAL));
            sb2.append("&p=1");
            String strM11357c = C7894bz.m11353a().m11357c(C7843ab.f14307g);
            int iM11356b = C7894bz.m11353a().m11356b(C7843ab.f14307g);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("&v=");
            sb3.append(URLEncoder.encode(strM11357c + MqttTopic.SINGLE_LEVEL_WILDCARD + iM11356b, Request.DEFAULT_CHARSET));
            sb2.append(sb3.toString());
            sb2.append("&sv=" + URLEncoder.encode(".0.17 gp", Request.DEFAULT_CHARSET));
            sb2.append("&cv=" + C7906ck.m11568b(C7843ab.f14307g, this.f15046l, f15039h, 1L));
            C7927de c7927deM11668b = C7921cz.m11668b(C7921cz.m11665a().method(EnumC7926dd.GET).host(C7842aa.f14265z).url(f15032a + sb2.toString()).cert("").build());
            if (c7927deM11668b != null && c7927deM11668b.m11686b() == 200) {
                String strM11613c = C7912cq.m11613c(c7927deM11668b.m11687c());
                if ("null".equalsIgnoreCase(strM11613c) || "\"\"".equals(strM11613c.trim()) || C7912cq.m11608b(strM11613c)) {
                    return;
                }
                C7906ck.m11566a(C7843ab.f14307g, this.f15046l, f15040i, System.currentTimeMillis());
                C8020y.m12122a().onSaveConfig(new JSONObject(strM11613c));
            }
        } catch (Throwable unused) {
        }
    }

    public void saveConfig(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        try {
            if (m12045a(jSONObject)) {
                if (jSONObject.has(AgooConstants.MESSAGE_ID)) {
                    C7906ck.m11566a(C7843ab.f14307g, this.f15046l, f15039h, jSONObject.getInt(AgooConstants.MESSAGE_ID));
                }
                if (jSONObject.has("pipline_settings")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("pipline_settings");
                    if (jSONObject2.has(f15037f)) {
                        long j10 = jSONObject2.getLong(f15037f);
                        f15035d = j10;
                        if (j10 >= 5) {
                            j10 = 5;
                        } else if (j10 < 1) {
                            j10 = 1;
                        }
                        f15035d = j10;
                        C7906ck.m11566a(C7843ab.f14307g, this.f15046l, f15037f, f15035d);
                    }
                    if (jSONObject2.has(f15038g)) {
                        long j11 = jSONObject2.getLong(f15038g);
                        f15036e = j11;
                        if (f15035d > 1) {
                            j11 = 0;
                        } else if (j11 > f15033b) {
                            j11 = 259200000;
                        }
                        f15036e = j11;
                        C7906ck.m11566a(C7843ab.f14307g, this.f15046l, f15038g, f15036e);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C8008l m12042a() {
        if (f15043m == null) {
            synchronized (C8008l.class) {
                try {
                    if (f15043m == null) {
                        f15043m = new C8008l();
                    }
                } finally {
                }
            }
        }
        return f15043m;
    }

    /* renamed from: a */
    private boolean m12045a(JSONObject jSONObject) {
        boolean z10;
        String str;
        String str2;
        JSONArray jSONArray;
        int i10;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "currentEvents";
        String str9 = "eventParams";
        boolean z11 = false;
        try {
            if (!jSONObject.has("content")) {
                C7896ca.eForInternal("[CodelessGetConfig] content is empty");
                return false;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("content"));
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            Map<String, Object> linkedHashMap = new LinkedHashMap<>();
            String str10 = "events";
            if (!jSONObject2.has("native")) {
                str = "currentEvents";
                z10 = false;
                str2 = "events";
            } else {
                try {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("native");
                    int i11 = 0;
                    while (i11 < jSONArray2.length()) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                        z10 = z11;
                        try {
                            String strOptString = jSONObject3.optString("page");
                            if (C7912cq.m11608b(strOptString)) {
                                C7896ca.eForInternal("[CodelessGetConfig] native page is empty");
                                str3 = str8;
                                str4 = str9;
                                jSONArray = jSONArray2;
                                str5 = str10;
                                i10 = i11;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                JSONArray jSONArray3 = jSONObject3.getJSONArray(str10);
                                jSONArray = jSONArray2;
                                i10 = i11;
                                int i12 = z10 ? 1 : 0;
                                while (i12 < jSONArray3.length()) {
                                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i12);
                                    int i13 = i12;
                                    C8018w c8018w = new C8018w();
                                    JSONArray jSONArray4 = jSONArray3;
                                    c8018w.setEventId(jSONObject4.optString("eventId"));
                                    c8018w.setEventName(jSONObject4.optString("eventName"));
                                    String strOptString2 = jSONObject4.optString("eventValue");
                                    String str11 = str8;
                                    int iOptInt = jSONObject4.optInt("propagation");
                                    String str12 = str10;
                                    if (iOptInt == 1 && !C7912cq.m11608b(strOptString2)) {
                                        c8018w.setEventValue(strOptString2);
                                        arrayList.add(c8018w);
                                    }
                                    c8018w.setEventSame(jSONObject4.optString("eventSame"));
                                    c8018w.setEventSameRules(jSONObject4.optJSONObject("eventSameRules"));
                                    c8018w.setPagePath(jSONObject4.optString("pagePath"));
                                    c8018w.setEventPath(jSONObject4.optString("eventPath"));
                                    c8018w.setPropagation(iOptInt);
                                    if (jSONObject4.has(str9)) {
                                        JSONArray jSONArray5 = jSONObject4.getJSONArray(str9);
                                        ArrayList arrayList3 = new ArrayList();
                                        int i14 = z10 ? 1 : 0;
                                        while (i14 < jSONArray5.length()) {
                                            JSONObject jSONObject5 = jSONArray5.getJSONObject(i14);
                                            JSONArray jSONArray6 = jSONArray5;
                                            C8007k c8007k = new C8007k();
                                            String str13 = str9;
                                            c8007k.setKey(jSONObject5.optString("key"));
                                            c8007k.setXpath(jSONObject5.optString("xpath"));
                                            if (!c8007k.m12041c()) {
                                                arrayList3.add(c8007k);
                                            }
                                            i14++;
                                            jSONArray5 = jSONArray6;
                                            str9 = str13;
                                        }
                                        str6 = str9;
                                        if (!arrayList3.isEmpty()) {
                                            c8018w.setEventParams(arrayList3);
                                        }
                                    } else {
                                        str6 = str9;
                                    }
                                    if (!c8018w.m12121j()) {
                                        arrayList2.add(c8018w);
                                    }
                                    i12 = i13 + 1;
                                    jSONArray3 = jSONArray4;
                                    str8 = str11;
                                    str10 = str12;
                                    str9 = str6;
                                }
                                str3 = str8;
                                str4 = str9;
                                str5 = str10;
                                if (!arrayList2.isEmpty()) {
                                    map.put(strOptString, arrayList2);
                                }
                            }
                            i11 = i10 + 1;
                            z11 = z10 ? 1 : 0;
                            jSONArray2 = jSONArray;
                            str8 = str3;
                            str10 = str5;
                            str9 = str4;
                        } catch (Throwable unused) {
                            return z10;
                        }
                    }
                    str = str8;
                    z10 = z11;
                    str2 = str10;
                    linkedHashMap.put("native", map);
                    if (!arrayList.isEmpty()) {
                        linkedHashMap.put(C8011o.f15051c, arrayList);
                    }
                } catch (Throwable unused2) {
                    z10 = z11;
                    return z10;
                }
            }
            if (jSONObject2.has("hybrid")) {
                HashMap map2 = new HashMap();
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("hybrid");
                if (jSONObjectOptJSONObject.has("pageEvents")) {
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("pageEvents");
                    int i15 = z10 ? 1 : 0;
                    while (i15 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject6 = jSONArrayOptJSONArray.getJSONObject(i15);
                        String strOptString3 = jSONObject6.optString("page");
                        if (C7912cq.m11608b(strOptString3)) {
                            C7896ca.eForInternal("[CodelessGetConfig] hybrid page is empty");
                            str7 = str2;
                        } else {
                            str7 = str2;
                            jSONObject6.getJSONArray(str7);
                            C8009m.m12048c().m12054a(strOptString3, jSONObject6.toString());
                            map2.put(URLEncoder.encode(strOptString3, Request.DEFAULT_CHARSET), jSONObject6.toString());
                        }
                        i15++;
                        str2 = str7;
                    }
                }
                String str14 = str;
                if (jSONObjectOptJSONObject.has(str14)) {
                    String string = jSONObjectOptJSONObject.optJSONArray(str14).toString();
                    linkedHashMap.put("hybridCurrentEvents", string);
                    C8009m.m12048c().m12056b(string);
                }
                linkedHashMap.put("hybrid", map2);
            }
            try {
                m12043a(linkedHashMap);
                return true;
            } catch (Throwable unused3) {
                return z10;
            }
        } catch (Throwable unused4) {
            return false;
        }
    }

    /* renamed from: a */
    private void m12043a(Map<String, Object> map) {
        if (map == null) {
            C7896ca.eForInternal("[CodelessGetConfig] configMaps is null");
            return;
        }
        boolean zM12069e = C8011o.m12058a().m12069e();
        Map map2 = (Map) map.get("native");
        List list = (List) map.get(C8011o.f15051c);
        Map map3 = (Map) map.get("hybrid");
        String str = (String) map.get("hybridCurrentEvents");
        C8011o.m12058a().m12066b();
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                String str2 = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                if (zM12069e) {
                    C8011o.m12058a().m12063a(str2, list2.toString(), "native");
                } else {
                    C8011o.m12058a().m12065b(str2, list2.toString(), "native");
                }
            }
        }
        if (list != null) {
            if (zM12069e) {
                C8011o.m12058a().m12063a(C8011o.f15052d, list.toString(), C8011o.f15051c);
            } else {
                C8011o.m12058a().m12065b(C8011o.f15052d, list.toString(), C8011o.f15051c);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (zM12069e) {
                C8011o.m12058a().m12063a(C8011o.f15053e, str, C8011o.f15051c);
            } else {
                C8011o.m12058a().m12065b(C8011o.f15053e, str, C8011o.f15051c);
            }
        }
        if (map3 != null) {
            for (Map.Entry entry2 : map3.entrySet()) {
                String str3 = (String) entry2.getKey();
                String str4 = (String) entry2.getValue();
                if (zM12069e) {
                    C8011o.m12058a().m12063a(str3, str4, "hybrid");
                } else {
                    C8011o.m12058a().m12065b(str3, str4, "hybrid");
                }
            }
        }
        C8011o.m12058a().m12067c();
        C8020y.m12122a().m12129d().obtainMessage(5).sendToTarget();
    }
}
