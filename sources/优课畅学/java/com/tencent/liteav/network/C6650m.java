package com.tencent.liteav.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p049d.C6573c;
import com.tencent.liteav.basic.util.C6592e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.liteav.network.m */
/* loaded from: classes4.dex */
public class C6650m {

    /* renamed from: a */
    protected static C6650m f5903a = new C6650m();

    /* renamed from: b */
    private Context f5904b = null;

    /* renamed from: c */
    private long f5905c = 3;

    /* renamed from: com.tencent.liteav.network.m$a */
    public class a {

        /* renamed from: a */
        public float f5906a = 0.0f;

        /* renamed from: b */
        public float f5907b = 0.0f;

        /* renamed from: c */
        public float f5908c = 0.0f;

        /* renamed from: d */
        public float f5909d = 0.0f;

        /* renamed from: e */
        public long f5910e = 0;

        public a() {
        }
    }

    /* renamed from: a */
    public static C6650m m5328a() {
        return f5903a;
    }

    /* renamed from: d */
    private void m5331d() {
        long jM4908a = C6573c.m4883a().m4908a("Network", "QualityDataCacheCount");
        this.f5905c = jM4908a;
        if (jM4908a == -1 || jM4908a < 3) {
            this.f5905c = 3L;
        }
    }

    /* renamed from: b */
    public String m5336b() {
        try {
            Context context = this.f5904b;
            if (context != null) {
                int iM5053c = C6592e.m5053c(context);
                return iM5053c == 0 ? "" : iM5053c == 1 ? "wifi:" : iM5053c == 2 ? "4g:" : iM5053c == 3 ? "3g:" : iM5053c == 4 ? "2g:" : iM5053c == 5 ? "ethernet:" : "xg:";
            }
        } catch (Exception e10) {
            TXCLog.m4991e("UploadQualityData", "get network type failed." + e10.getMessage());
        }
        return "";
    }

    /* renamed from: c */
    public boolean m5337c() throws JSONException {
        m5331d();
        String strM5336b = m5336b();
        String str = "isDomainAddressBetter: accessID = " + strM5336b + " minQualityDataCount = " + this.f5905c;
        a aVarM5327a = m5327a(strM5336b, true);
        a aVarM5327a2 = m5327a(strM5336b, false);
        if (aVarM5327a != null) {
            str = String.format("%s \n isDomainAddressBetter：domainQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str, Long.valueOf(aVarM5327a.f5910e), Float.valueOf(aVarM5327a.f5906a), Float.valueOf(aVarM5327a.f5907b), Float.valueOf(aVarM5327a.f5908c), Float.valueOf(aVarM5327a.f5909d));
        }
        String str2 = str;
        if (aVarM5327a2 != null) {
            str2 = String.format("%s \n isDomainAddressBetter：originQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str2, Long.valueOf(aVarM5327a2.f5910e), Float.valueOf(aVarM5327a2.f5906a), Float.valueOf(aVarM5327a2.f5907b), Float.valueOf(aVarM5327a2.f5908c), Float.valueOf(aVarM5327a2.f5909d));
        }
        TXCLog.m4991e("UploadQualityData", str2);
        if (aVarM5327a != null) {
            long j10 = aVarM5327a.f5910e;
            long j11 = this.f5905c;
            if (j10 >= j11 && aVarM5327a2 != null && aVarM5327a2.f5910e >= j11 && aVarM5327a.f5907b < aVarM5327a2.f5907b && aVarM5327a.f5908c < aVarM5327a2.f5908c && aVarM5327a.f5909d < aVarM5327a2.f5909d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m5333a(Context context) {
        if (this.f5904b == null) {
            this.f5904b = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public void m5335a(String str, long j10, long j11, long j12, float f10, float f11, float f12) throws JSONException {
        if (C6573c.m4883a().m4908a("Network", "QualityDataCacheCount") > 0) {
            TXCLog.m4991e("UploadQualityData", String.format("updateQualityData: accessID = %s serverType = %d totalTime = %d networkRTT = %d avgBlockCnt = %f avgVideoQue = %f avgAudioQue = %f", str, Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12)));
            if (m5329b(str)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f5904b.getSharedPreferences("com.tencent.liteav.network", 0);
                JSONObject jSONObjectM5330c = m5330c(sharedPreferences.getString("34238512-C08C-4931-A000-40E1D8B5BA5B", ""));
                JSONObject jSONObjectOptJSONObject = jSONObjectM5330c.optJSONObject(str);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                String str2 = j10 == 3 ? "DomainArrayData" : "OriginArrayData";
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("totalTime", j11);
                jSONObject.put("networkRTT", j12);
                jSONObject.put("avgBlockCnt", f10);
                jSONObject.put("avgVideoQue", f11);
                jSONObject.put("avgAudioQue", f12);
                jSONArrayOptJSONArray.put(jSONObject);
                int length = jSONArrayOptJSONArray.length();
                long j13 = length;
                if (j13 > this.f5905c) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = (int) (j13 - this.f5905c); i10 < length; i10++) {
                        jSONArray.put(jSONArrayOptJSONArray.get(i10));
                    }
                    jSONArrayOptJSONArray = jSONArray;
                }
                jSONObjectOptJSONObject.put(str2, jSONArrayOptJSONArray);
                jSONObjectM5330c.put(str, jSONObjectOptJSONObject);
                sharedPreferences.edit().putString("34238512-C08C-4931-A000-40E1D8B5BA5B", jSONObjectM5330c.toString()).commit();
            } catch (Exception e10) {
                TXCLog.m4992e("UploadQualityData", "build json object failed.", e10);
            }
        }
    }

    /* renamed from: b */
    private boolean m5329b(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    private JSONObject m5330c(String str) {
        if (!m5329b(str)) {
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                TXCLog.m4992e("UploadQualityData", "failed to parse json string", e10);
            }
        }
        return new JSONObject();
    }

    /* renamed from: a */
    private a m5327a(String str, boolean z10) throws JSONException {
        a aVar;
        JSONObject jSONObjectOptJSONObject;
        String str2 = "avgAudioQue";
        if (m5329b(str)) {
            return null;
        }
        try {
            String string = this.f5904b.getSharedPreferences("com.tencent.liteav.network", 0).getString("34238512-C08C-4931-A000-40E1D8B5BA5B", "");
            if (m5329b(string) || (jSONObjectOptJSONObject = new JSONObject(string).optJSONObject(str)) == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(z10 ? "DomainArrayData" : "OriginArrayData");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            long length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                return null;
            }
            String str3 = "";
            aVar = null;
            float fOptLong = 0.0f;
            float fOptDouble = 0.0f;
            float f10 = 0.0f;
            int i10 = 0;
            float fOptDouble2 = 0.0f;
            while (i10 < length) {
                try {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                    fOptDouble = (float) (fOptDouble + jSONObject.optDouble("avgBlockCnt"));
                    fOptDouble2 = (float) (fOptDouble2 + jSONObject.optDouble("avgVideoQue"));
                    float fOptDouble3 = (float) (f10 + jSONObject.optDouble(str2));
                    str3 = String.format("%s \n isDomainAddressBetter：itemData domain = %b NetworkRTT = %d avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str3, Boolean.valueOf(z10), Long.valueOf(jSONObject.optLong("networkRTT")), Double.valueOf(jSONObject.optDouble("avgBlockCnt")), Double.valueOf(jSONObject.optDouble("avgVideoQue")), Double.valueOf(jSONObject.optDouble(str2)));
                    i10++;
                    f10 = fOptDouble3;
                    fOptLong += jSONObject.optLong("networkRTT");
                    str2 = str2;
                } catch (Exception e10) {
                    e = e10;
                    TXCLog.m4992e("UploadQualityData", "get quality data failed.", e);
                    return aVar;
                }
            }
            float f11 = length;
            float f12 = fOptLong / f11;
            float f13 = fOptDouble / f11;
            float f14 = fOptDouble2 / f11;
            float f15 = f10 / f11;
            a aVar2 = new a();
            aVar2.f5906a = f12;
            aVar2.f5907b = f13;
            aVar2.f5908c = f14;
            aVar2.f5909d = f15;
            aVar2.f5910e = length;
            return aVar2;
        } catch (Exception e11) {
            e = e11;
            aVar = null;
        }
    }

    /* renamed from: a */
    public long m5332a(String str) {
        Context context = this.f5904b;
        if (context != null) {
            return context.getSharedPreferences("com.tencent.liteav.network", 0).getLong(str, 0L);
        }
        return 0L;
    }

    /* renamed from: a */
    public void m5334a(String str, long j10) {
        Context context = this.f5904b;
        if (context != null) {
            context.getSharedPreferences("com.tencent.liteav.network", 0).edit().putLong(str, j10).commit();
        }
    }
}
