package com.taobao.agoo.p087a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.agoo.a.a */
/* loaded from: classes5.dex */
public class C7704a {
    public static final String SP_AGOO_BIND_FILE_NAME = "EMAS_AGOO_BIND";

    /* renamed from: a */
    private ConcurrentMap<String, Integer> f13252a = new ConcurrentHashMap();

    /* renamed from: b */
    private long f13253b;

    /* renamed from: c */
    private Context f13254c;

    /* renamed from: d */
    private String f13255d;

    public C7704a(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        this.f13254c = context.getApplicationContext();
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("EMAS_AGOO_BIND");
            sb2.append(Config.m22238d(context));
            sb2.append(AccsClientConfig.getConfigByTag(Config.m22238d(context)).getInappHost());
            this.f13255d = sb2.toString();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m10193a(String str) throws JSONException {
        Integer num = this.f13252a.get(str);
        if (num == null || num.intValue() != 2) {
            this.f13252a.put(str, 2);
            m10190a(this.f13254c, this.f13255d, this.f13253b, this.f13252a);
        }
    }

    /* renamed from: b */
    public boolean m10194b(String str) throws JSONException {
        if (this.f13252a.isEmpty()) {
            m10191b();
        }
        Integer num = this.f13252a.get(str);
        ALog.m10119i("AgooBindCache", "isAgooRegistered", Constants.KEY_PACKAGE_NAME, str, "appStatus", num, "agooBindStatus", this.f13252a);
        return (UtilityImpl.utdidChanged(Config.PREFERENCES, this.f13254c) || num == null || num.intValue() != 2) ? false : true;
    }

    /* renamed from: a */
    private void m10190a(Context context, String str, long j10, Map<String, Integer> map) throws JSONException {
        try {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            JSONArray jSONArray = new JSONArray();
            if (j10 > 0 && j10 < System.currentTimeMillis()) {
                jSONArray.put(j10);
            } else {
                jSONArray.put(System.currentTimeMillis() - (Math.random() * 8.64E7d));
            }
            for (String str2 : strArr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("p", str2);
                jSONObject.put("s", map.get(str2).intValue());
                jSONArray.put(jSONObject);
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putString("bind_status", jSONArray.toString());
            editorEdit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m10191b() throws JSONException {
        try {
            String string = this.f13254c.getSharedPreferences(this.f13255d, 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.m10122w("AgooBindCache", "restoreAgooClients packs null return", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f13253b = jSONArray.getLong(0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f13253b;
            if (jCurrentTimeMillis < 86400000 + j10) {
                for (int i10 = 1; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    this.f13252a.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt("s")));
                }
                ALog.m10119i("AgooBindCache", "restoreAgooClients", "mAgooBindStatus", this.f13252a);
                return;
            }
            ALog.m10119i("AgooBindCache", "restoreAgooClients expired", "agooLastFlushTime", Long.valueOf(j10));
            this.f13253b = 0L;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m10192a() {
        this.f13252a.clear();
        this.f13253b = 0L;
        try {
            this.f13254c.getSharedPreferences(this.f13255d, 0).edit().clear().commit();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
