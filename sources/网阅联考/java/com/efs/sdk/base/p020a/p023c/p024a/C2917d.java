package com.efs.sdk.base.p020a.p023c.p024a;

import android.support.annotation.NonNull;
import com.efs.sdk.base.p020a.p031h.C2957d;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.c.a.d */
/* loaded from: classes2.dex */
public final class C2917d {

    /* renamed from: a */
    private static final SimpleDateFormat f1072a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);

    /* renamed from: a */
    public static boolean m2116a(@NonNull String str, @NonNull C2915b c2915b) {
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("config");
            int i4 = jSONObject.getInt("cver");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("common");
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObjectOptJSONObject2.optString(next, ""));
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("app_configs");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(i5);
                        if (jSONObject2 != null && jSONObject2.length() == 2) {
                            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("conditions");
                            JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("actions");
                            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                                m2115a(map, jSONArrayOptJSONArray2, jSONArrayOptJSONArray3);
                            }
                        }
                    }
                }
            }
            c2915b.m2096a(map);
            c2915b.f1056a = i4;
            return true;
        } catch (Throwable th) {
            C2957d.m2214b("efs.config", "parseConfig error, data is ".concat(String.valueOf(str)), th);
            return false;
        }
    }

    /* renamed from: b */
    private static int m2117b(String str, String str2) {
        if (str == null) {
            str = "1970/01/01 00:00:00";
        }
        if (str2 == null) {
            str2 = "1970/01/01 00:00:00";
        }
        String[] strArrSplit = str.split("[:/\\s]");
        String[] strArrSplit2 = str2.split("[:/\\s]");
        int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
        int i4 = 0;
        while (i4 < iMax) {
            int i5 = i4 < strArrSplit.length ? Integer.parseInt(strArrSplit[i4]) : 0;
            int i6 = i4 < strArrSplit2.length ? Integer.parseInt(strArrSplit2[i4]) : 0;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            i4++;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x01de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01df A[Catch: all -> 0x0244, LOOP:1: B:140:0x01df->B:156:0x0240, LOOP_START, PHI: r1
      0x01df: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:138:0x01dc, B:156:0x0240] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0244, blocks: (B:3:0x0004, B:5:0x000c, B:7:0x0014, B:10:0x001d, B:15:0x0036, B:17:0x0048, B:31:0x008b, B:137:0x01d8, B:34:0x0094, B:35:0x0098, B:84:0x0143, B:86:0x0148, B:87:0x014e, B:88:0x0154, B:89:0x015a, B:90:0x0160, B:91:0x0166, B:92:0x016c, B:93:0x0172, B:95:0x0178, B:101:0x0186, B:103:0x018c, B:108:0x0196, B:110:0x019c, B:115:0x01a6, B:117:0x01ac, B:122:0x01b6, B:124:0x01bc, B:129:0x01c6, B:131:0x01cc, B:37:0x009d, B:40:0x00a9, B:43:0x00b5, B:46:0x00c1, B:49:0x00cd, B:52:0x00d8, B:55:0x00e3, B:58:0x00ed, B:61:0x00f7, B:64:0x0101, B:67:0x010b, B:70:0x0115, B:73:0x011f, B:76:0x012a, B:79:0x0135, B:18:0x004d, B:20:0x0055, B:21:0x0068, B:23:0x0070, B:24:0x0075, B:26:0x007b, B:28:0x0081, B:140:0x01df, B:142:0x01e5, B:144:0x01ed, B:146:0x01f3, B:149:0x0203, B:152:0x0213, B:154:0x0227, B:155:0x0239), top: B:161:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m2115a(java.util.Map<java.lang.String, java.lang.String> r13, org.json.JSONArray r14, org.json.JSONArray r15) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p020a.p023c.p024a.C2917d.m2115a(java.util.Map, org.json.JSONArray, org.json.JSONArray):void");
    }

    /* renamed from: a */
    private static int m2114a(String str, String str2, String str3) {
        if ("ver".equals(str)) {
            return m2113a(str2, str3);
        }
        if ("datetime".equals(str)) {
            return m2117b(str2, str3);
        }
        return -100;
    }

    /* renamed from: a */
    private static int m2113a(String str, String str2) {
        if (str == null) {
            str = "0";
        }
        if (str2 == null) {
            str2 = "0";
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
        int i4 = 0;
        while (i4 < iMax) {
            int i5 = i4 < strArrSplit.length ? Integer.parseInt(strArrSplit[i4]) : 0;
            int i6 = i4 < strArrSplit2.length ? Integer.parseInt(strArrSplit2[i4]) : 0;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            i4++;
        }
        return 0;
    }
}
