package com.umeng.commonsdk.framework;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.material3.MenuKt;
import com.taobao.sophix.PatchStatus;
import com.umeng.analytics.pro.C6773h;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p114g2.C8021j;
import p154k2.AbstractC8263a;
import p176m2.AbstractC8959h;
import p186n2.AbstractC9089c;
import p196o2.C9160b;
import p260u2.AbstractC9668c;
import p260u2.C9670e;
import p280w2.C9802b;
import p310z2.AbstractC9993d;

/* renamed from: com.umeng.commonsdk.framework.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6782a {

    /* renamed from: a */
    public static boolean f6851a = false;

    /* renamed from: a */
    public static JSONObject m6267a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) throws JSONException {
        if (jSONObject == null || jSONObject2 == null) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]构建信封传入 header 或 body 字段为空，直接返回");
            return null;
        }
        C6773h c6773hM6194b = C6773h.m6194b(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        UUID uuidRandomUUID = UUID.randomUUID();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_tp", str2);
        contentValues.put("_hd", c6773hM6194b.m6220u(jSONObject.toString()));
        contentValues.put("_bd", c6773hM6194b.m6220u(jSONObject2.toString()));
        contentValues.put("_ts", String.valueOf(jCurrentTimeMillis));
        contentValues.put("_uuid", uuidRandomUUID.toString());
        contentValues.put("_re1", str);
        contentValues.put("_re2", str3);
        C8021j.m12608c(context).m12612i("stf", contentValues);
        if ("i".equalsIgnoreCase(str2)) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]inner业务，返回空 JSONObject。");
        } else if ("s".equalsIgnoreCase(str2)) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]分享业务 返回body。");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("header", new JSONObject());
                jSONObject3.put("share", jSONObject2.getJSONObject("share"));
                return jSONObject3;
            } catch (JSONException unused) {
            }
        } else if (!"p".equalsIgnoreCase(str2)) {
            try {
                if ("st".equalsIgnoreCase(str2)) {
                    AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]统计业务 半开报文，返回body。");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("header", new JSONObject());
                    jSONObject4.put("analytics", jSONObject2.getJSONObject("analytics"));
                    return jSONObject4;
                }
                AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]统计业务 闭合报文，返回body。");
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("header", new JSONObject());
                jSONObject5.put("analytics", jSONObject2.getJSONObject("analytics"));
                return jSONObject5;
            } catch (JSONException unused2) {
                return jSONObject2;
            }
        }
        return new JSONObject();
    }

    /* renamed from: b */
    public static JSONObject m6268b(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        return m6269c(context, jSONObject, jSONObject2, AbstractC9668c.f17077d, jSONObject.has("st") ? "t" : jSONObject2.has("inner") ? "i" : "a", "9.3.7");
    }

    /* renamed from: c */
    public static JSONObject m6269c(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) throws JSONException {
        AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]业务发起构建普通有状态信封请求。");
        if (TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("exception", PatchStatus.CODE_LOAD_RES_INJECT_PATH);
                    return jSONObject3;
                } catch (JSONException unused) {
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
                return null;
            }
        }
        if (!AbstractC9993d.m17334s(context)) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("exception", MenuKt.InTransitionDuration);
                    return jSONObject4;
                } catch (JSONException unused3) {
                    return jSONObject4;
                }
            } catch (JSONException unused4) {
                return null;
            }
        }
        if (AbstractC8263a.m13314g(context)) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]零号报文应答数据 未获取到，写入二级缓存");
            return m6267a(context, jSONObject, jSONObject2, str, str2, str3);
        }
        AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]零号报文应答数据 已获取到，判断二级缓存是否为空");
        if (C8021j.m12608c(context).m12618o()) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]二级缓存为空，直接打信封");
            return new C9670e().m16123e(context.getApplicationContext(), jSONObject, jSONObject2, str, str2, str3);
        }
        AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]二级缓存不为空，写入二级缓存");
        JSONObject jSONObjectM6267a = m6267a(context, jSONObject, jSONObject2, str, str2, str3);
        if (!AbstractC9089c.m14589f(32785)) {
            AbstractC9089c.m14596m(context, 32785, C9160b.m14737a(context).m14738b(), null);
        }
        return jSONObjectM6267a;
    }

    /* renamed from: d */
    public static JSONObject m6270d(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        if (AbstractC9993d.m17334s(context)) {
            return new C9670e().m16122d(context.getApplicationContext(), jSONObject, jSONObject2, str);
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("exception", MenuKt.InTransitionDuration);
                return jSONObject3;
            } catch (JSONException unused) {
                return jSONObject3;
            }
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* renamed from: e */
    public static long m6271e(Context context) {
        if (context == null) {
            return 0L;
        }
        return AbstractC6783b.m6285f(context.getApplicationContext());
    }

    /* renamed from: f */
    public static long m6272f(Context context) {
        if (context == null) {
            return 0L;
        }
        return AbstractC6783b.m6286g(context.getApplicationContext());
    }

    /* renamed from: g */
    public static synchronized boolean m6273g() {
        return f6851a;
    }

    /* renamed from: h */
    public static String m6274h(Context context, String str, String str2) {
        return context == null ? str2 : C9802b.m16620u(context.getApplicationContext()).m16630o().m16638a(str, str2);
    }

    /* renamed from: i */
    public static boolean m6275i(Context context) {
        return AbstractC6783b.m6291l(context) && !AbstractC8263a.m13314g(context);
    }

    /* renamed from: j */
    public static boolean m6276j(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        return m6277k(context, uMBusinessType, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6277k(android.content.Context r5, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r6, boolean r7) {
        /*
            if (r5 == 0) goto L43
            android.content.Context r0 = r5.getApplicationContext()
            boolean r1 = com.umeng.commonsdk.framework.AbstractC6783b.m6291l(r0)
            int r2 = com.umeng.commonsdk.framework.AbstractC6783b.m6281b(r0)
            if (r1 == 0) goto L3c
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r7 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            r3 = 1
            r4 = 0
            if (r6 != r7) goto L20
            boolean r5 = com.umeng.commonsdk.framework.AbstractC6783b.m6290k(r0, r6)
            if (r5 == 0) goto L1e
        L1c:
            r7 = r4
            goto L3c
        L1e:
            r7 = r3
            goto L3c
        L20:
            boolean r7 = p186n2.C9090d.m14604f()
            if (r7 == 0) goto L2f
            int r5 = p186n2.C9090d.m14606h()
            long r5 = (long) r5
            p186n2.AbstractC9089c.m14595l(r5)
            goto L1c
        L2f:
            boolean r6 = com.umeng.commonsdk.framework.AbstractC6783b.m6290k(r0, r6)
            if (r6 != 0) goto L1c
            boolean r5 = p154k2.AbstractC8263a.m13314g(r5)
            if (r5 == 0) goto L1e
            goto L1c
        L3c:
            if (r1 == 0) goto L43
            if (r2 <= 0) goto L43
            p186n2.C9090d.m14610l()
        L43:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.AbstractC6782a.m6277k(android.content.Context, com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType, boolean):boolean");
    }

    /* renamed from: l */
    public static long m6278l(Context context) {
        if (context == null) {
            return 0L;
        }
        return C9670e.m16116b(context.getApplicationContext());
    }

    /* renamed from: m */
    public static synchronized void m6279m(boolean z9) {
        f6851a = z9;
    }
}
