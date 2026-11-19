package com.taobao.agoo.p066a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C1851ai;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.agoo.a.a */
/* loaded from: classes.dex */
public class C1805a {
    public static final String SP_AGOO_BIND_FILE_NAME = "EMAS_AGOO_BIND";

    /* renamed from: a */
    private ConcurrentMap<String, Integer> f7854a = new ConcurrentHashMap();

    /* renamed from: b */
    private long f7855b;

    /* renamed from: c */
    private Context f7856c;

    /* renamed from: d */
    private String f7857d;

    public C1805a(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        this.f7856c = context.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("EMAS_AGOO_BIND");
            sb.append(Config.m10020d(context));
            sb.append(AccsClientConfig.getConfigByTag(Config.m10020d(context)).getInappHost());
            this.f7857d = sb.toString();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m6167a(String str) throws JSONException {
        Integer num = this.f7854a.get(str);
        if (num == null || num.intValue() != 2) {
            this.f7854a.put(str, 2);
            m6164a(this.f7856c, this.f7857d, this.f7855b, this.f7854a);
        }
    }

    /* renamed from: b */
    public boolean m6168b(String str) throws JSONException {
        if (this.f7854a.isEmpty()) {
            m6165b();
        }
        Integer num = this.f7854a.get(str);
        ALog.m6093i("AgooBindCache", "isAgooRegistered", Constants.KEY_PACKAGE_NAME, str, "appStatus", num, "agooBindStatus", this.f7854a);
        return (UtilityImpl.utdidChanged(Config.PREFERENCES, this.f7856c) || num == null || num.intValue() != 2) ? false : true;
    }

    /* renamed from: a */
    private void m6164a(Context context, String str, long j4, Map<String, Integer> map) throws JSONException {
        try {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            JSONArray jSONArray = new JSONArray();
            if (j4 > 0 && j4 < System.currentTimeMillis()) {
                jSONArray.put(j4);
            } else {
                jSONArray.put(System.currentTimeMillis() - (Math.random() * 8.64E7d));
            }
            for (String str2 : strArr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C1851ai.f8299av, str2);
                jSONObject.put(C1851ai.f8303az, map.get(str2).intValue());
                jSONArray.put(jSONObject);
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putString("bind_status", jSONArray.toString());
            editorEdit.apply();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m6165b() throws JSONException {
        try {
            String string = this.f7856c.getSharedPreferences(this.f7857d, 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.m6096w("AgooBindCache", "restoreAgooClients packs null return", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f7855b = jSONArray.getLong(0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j4 = this.f7855b;
            if (jCurrentTimeMillis < 86400000 + j4) {
                for (int i4 = 1; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    this.f7854a.put(jSONObject.getString(C1851ai.f8299av), Integer.valueOf(jSONObject.getInt(C1851ai.f8303az)));
                }
                ALog.m6093i("AgooBindCache", "restoreAgooClients", "mAgooBindStatus", this.f7854a);
                return;
            }
            ALog.m6093i("AgooBindCache", "restoreAgooClients expired", "agooLastFlushTime", Long.valueOf(j4));
            this.f7855b = 0L;
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m6166a() {
        this.f7854a.clear();
        this.f7855b = 0L;
        try {
            this.f7856c.getSharedPreferences(this.f7857d, 0).edit().clear().commit();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
