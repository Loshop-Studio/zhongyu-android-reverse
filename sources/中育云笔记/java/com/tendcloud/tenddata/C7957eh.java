package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.eh */
/* loaded from: classes5.dex */
final class C7957eh extends BroadcastReceiver {

    /* renamed from: b */
    ArrayList<ScanResult> f14841b;

    /* renamed from: c */
    JSONArray f14842c;

    /* renamed from: d */
    C7936dn f14843d;

    /* renamed from: e */
    C7936dn f14844e;

    /* renamed from: i */
    private WifiManager f14848i;

    /* renamed from: a */
    C7937do f14840a = new C7937do();

    /* renamed from: f */
    long f14845f = 0;

    /* renamed from: g */
    long f14846g = 0;

    /* renamed from: h */
    private long f14847h = 180000;

    public C7957eh(WifiManager wifiManager) {
        this.f14848i = wifiManager;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C7951eb.f14813a.post(new Runnable() { // from class: com.tendcloud.tenddata.eh.1
            @Override // java.lang.Runnable
            public void run() {
                C7936dn c7936dn;
                try {
                    C7957eh.this.f14845f = System.currentTimeMillis();
                    C7957eh c7957eh = C7957eh.this;
                    if (c7957eh.f14845f - c7957eh.f14846g > c7957eh.f14847h) {
                        C7957eh c7957eh2 = C7957eh.this;
                        c7957eh2.f14846g = c7957eh2.f14845f;
                        c7957eh2.f14843d = c7957eh2.m11879b();
                        C7957eh c7957eh3 = C7957eh.this;
                        if (c7957eh3.f14843d == null) {
                            c7957eh3.m11878a();
                            C7957eh c7957eh4 = C7957eh.this;
                            c7957eh4.f14843d = c7957eh4.m11881c();
                        }
                        C7957eh c7957eh5 = C7957eh.this;
                        c7957eh5.f14844e = c7957eh5.m11881c();
                        C7957eh c7957eh6 = C7957eh.this;
                        C7936dn c7936dn2 = c7957eh6.f14843d;
                        if (c7936dn2 == null || (c7936dn = c7957eh6.f14844e) == null || c7957eh6.f14840a.m11742a(c7936dn2, c7936dn) >= 0.8d) {
                            return;
                        }
                        C7957eh.this.m11878a();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m11878a() {
        try {
            C7961el c7961el = new C7961el();
            c7961el.f14869b = "env";
            c7961el.f14870c = "wifiUpdate";
            c7961el.f14868a = AbstractC7841a.ENV;
            C7913cr.m11625a().post(c7961el);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public C7936dn m11879b() {
        try {
            this.f14843d = m11877a(this.f14842c);
        } catch (Throwable unused) {
        }
        return this.f14843d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public C7936dn m11881c() {
        try {
            ArrayList<ScanResult> arrayList = (ArrayList) this.f14848i.getScanResults();
            this.f14841b = arrayList;
            if (arrayList != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.f14841b.size(); i10++) {
                    if (this.f14841b.get(i10).level >= -75) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("SSID", this.f14841b.get(i10).SSID);
                        jSONObject.put("BSSID", this.f14841b.get(i10).BSSID);
                        jSONObject.put("level", this.f14841b.get(i10).level);
                        jSONArray.put(jSONObject);
                    }
                }
                this.f14842c = jSONArray;
                this.f14844e = m11877a(jSONArray);
            }
        } catch (Throwable unused) {
        }
        return this.f14844e;
    }

    /* renamed from: a */
    private C7936dn m11877a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                arrayList.add(new C7933dk(jSONObject.getString("SSID"), jSONObject.getString("BSSID"), (byte) jSONObject.getInt("level"), (byte) 0, (byte) 0));
            } catch (Throwable unused) {
            }
        }
        C7936dn c7936dn = new C7936dn();
        c7936dn.setBsslist(arrayList);
        return c7936dn;
    }
}
