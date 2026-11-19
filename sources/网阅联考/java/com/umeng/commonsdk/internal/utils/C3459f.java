package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.internal.utils.C3454a;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.f */
/* loaded from: classes2.dex */
public class C3459f {

    /* renamed from: a */
    private static final String f2662a = "info";

    /* renamed from: b */
    private static final String f2663b = "a_dc";

    /* renamed from: c */
    private static final String f2664c = "bssid";

    /* renamed from: d */
    private static final String f2665d = "ssid";

    /* renamed from: e */
    private static final String f2666e = "a_fcy";

    /* renamed from: f */
    private static final String f2667f = "a_hssid";

    /* renamed from: g */
    private static final String f2668g = "a_ip";

    /* renamed from: h */
    private static final String f2669h = "a_ls";

    /* renamed from: i */
    private static final String f2670i = "a_mac";

    /* renamed from: j */
    private static final String f2671j = "a_nid";

    /* renamed from: k */
    private static final String f2672k = "rssi";

    /* renamed from: l */
    private static final String f2673l = "sta";

    /* renamed from: m */
    private static final String f2674m = "ts";

    /* renamed from: n */
    private static final String f2675n = "wifiinfo";

    /* renamed from: o */
    private static final String f2676o = "ua";

    /* renamed from: a */
    public static JSONArray m3550a(Context context) {
        String string;
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f2662a, 0);
            if (sharedPreferences == null || (string = sharedPreferences.getString(f2675n, null)) == null) {
                return null;
            }
            return new JSONArray(string);
        } catch (Exception e4) {
            ULog.m3677e(e4.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static void m3553b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f2662a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(f2675n).commit();
        }
    }

    /* renamed from: c */
    public static String m3554c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f2662a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(f2676o, null);
        }
        return null;
    }

    /* renamed from: a */
    public static void m3551a(Context context, C3454a.b bVar) {
        JSONArray jSONArray;
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f2662a, 0);
            String string = null;
            if (sharedPreferences != null) {
                String string2 = sharedPreferences.getString(f2675n, null);
                if (string2 == null) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(string2);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f2663b, bVar.f2622a);
                jSONObject.put(f2664c, bVar.f2623b);
                jSONObject.put(f2665d, bVar.f2624c);
                jSONObject.put(f2666e, bVar.f2625d);
                jSONObject.put(f2667f, bVar.f2626e);
                jSONObject.put(f2668g, bVar.f2627f);
                jSONObject.put(f2669h, bVar.f2628g);
                jSONObject.put(f2670i, bVar.f2629h);
                jSONObject.put(f2671j, bVar.f2630i);
                jSONObject.put(f2672k, bVar.f2631j);
                jSONObject.put(f2673l, bVar.f2632k);
                jSONObject.put("ts", bVar.f2633l);
                jSONArray.put(jSONObject);
                string = jSONArray.toString();
            }
            if (string != null) {
                sharedPreferences.edit().putString(f2675n, string).commit();
            }
        } catch (Exception e4) {
            ULog.m3677e(e4.getMessage());
        }
    }

    /* renamed from: a */
    public static void m3552a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f2662a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(f2676o, str).commit();
        }
    }
}
