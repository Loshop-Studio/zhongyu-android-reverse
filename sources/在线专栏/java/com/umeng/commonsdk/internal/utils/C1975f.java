package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.internal.utils.C1970a;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.f */
/* loaded from: classes.dex */
public class C1975f {

    /* renamed from: a */
    private static final String f9254a = "info";

    /* renamed from: b */
    private static final String f9255b = "a_dc";

    /* renamed from: c */
    private static final String f9256c = "bssid";

    /* renamed from: d */
    private static final String f9257d = "ssid";

    /* renamed from: e */
    private static final String f9258e = "a_fcy";

    /* renamed from: f */
    private static final String f9259f = "a_hssid";

    /* renamed from: g */
    private static final String f9260g = "a_ip";

    /* renamed from: h */
    private static final String f9261h = "a_ls";

    /* renamed from: i */
    private static final String f9262i = "a_mac";

    /* renamed from: j */
    private static final String f9263j = "a_nid";

    /* renamed from: k */
    private static final String f9264k = "rssi";

    /* renamed from: l */
    private static final String f9265l = "sta";

    /* renamed from: m */
    private static final String f9266m = "ts";

    /* renamed from: n */
    private static final String f9267n = "wifiinfo";

    /* renamed from: o */
    private static final String f9268o = "ua";

    /* renamed from: a */
    public static JSONArray m7473a(Context context) {
        String string;
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f9254a, 0);
            if (sharedPreferences == null || (string = sharedPreferences.getString(f9267n, null)) == null) {
                return null;
            }
            return new JSONArray(string);
        } catch (Exception e4) {
            ULog.m7600e(e4.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static void m7476b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f9254a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(f9267n).commit();
        }
    }

    /* renamed from: c */
    public static String m7477c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f9254a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(f9268o, null);
        }
        return null;
    }

    /* renamed from: a */
    public static void m7474a(Context context, C1970a.b bVar) {
        JSONArray jSONArray;
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f9254a, 0);
            String string = null;
            if (sharedPreferences != null) {
                String string2 = sharedPreferences.getString(f9267n, null);
                if (string2 == null) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(string2);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f9255b, bVar.f9214a);
                jSONObject.put("bssid", bVar.f9215b);
                jSONObject.put(f9257d, bVar.f9216c);
                jSONObject.put(f9258e, bVar.f9217d);
                jSONObject.put(f9259f, bVar.f9218e);
                jSONObject.put(f9260g, bVar.f9219f);
                jSONObject.put(f9261h, bVar.f9220g);
                jSONObject.put(f9262i, bVar.f9221h);
                jSONObject.put(f9263j, bVar.f9222i);
                jSONObject.put(f9264k, bVar.f9223j);
                jSONObject.put(f9265l, bVar.f9224k);
                jSONObject.put("ts", bVar.f9225l);
                jSONArray.put(jSONObject);
                string = jSONArray.toString();
            }
            if (string != null) {
                sharedPreferences.edit().putString(f9267n, string).commit();
            }
        } catch (Exception e4) {
            ULog.m7600e(e4.getMessage());
        }
    }

    /* renamed from: a */
    public static void m7475a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f9254a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(f9268o, str).commit();
        }
    }
}
