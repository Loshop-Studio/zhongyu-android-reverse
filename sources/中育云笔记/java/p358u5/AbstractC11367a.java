package p358u5;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: u5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11367a {
    /* renamed from: a */
    public static void m25283a(JSONObject jSONObject, String str, Object obj, Bundle bundle) {
        if (obj == null) {
            HMSLog.m8728w("JsonUtil", "transfer jsonObject to bundle failed, defaultValue is null.");
            return;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            bundle.putString(str, m25287e(jSONObject, str, TextUtils.isEmpty(str2) ? null : str2));
            return;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, m25284b(jSONObject, str, ((Integer) obj).intValue()));
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            bundle.putIntArray(str, m25285c(jSONObject, str, iArr.length != 0 ? iArr : null));
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            bundle.putLongArray(str, m25286d(jSONObject, str, jArr.length != 0 ? jArr : null));
        } else if (!(obj instanceof String[])) {
            HMSLog.m8728w("JsonUtil", "transfer jsonObject to bundle failed, invalid data type.");
        } else {
            String[] strArr = (String[]) obj;
            bundle.putStringArray(str, m25288f(jSONObject, str, strArr.length != 0 ? strArr : null));
        }
    }

    /* renamed from: b */
    public static int m25284b(JSONObject jSONObject, String str, int i10) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has(str)) {
                    return jSONObject.getInt(str);
                }
            } catch (JSONException unused) {
                HMSLog.m8728w("JsonUtil", "JSONException: get " + str + " error.");
            }
        }
        return i10;
    }

    /* renamed from: c */
    public static int[] m25285c(JSONObject jSONObject, String str, int[] iArr) throws JSONException {
        int[] iArr2 = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.has(str)) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    iArr2 = new int[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        iArr2[i10] = ((Integer) jSONArray.get(i10)).intValue();
                    }
                }
            } catch (JSONException unused) {
                HMSLog.m8728w("JsonUtil", "JSONException: get " + str + " error.");
            }
        }
        return iArr2 == null ? iArr : iArr2;
    }

    /* renamed from: d */
    public static long[] m25286d(JSONObject jSONObject, String str, long[] jArr) throws JSONException {
        long[] jArr2 = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.has(str)) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    jArr2 = new long[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        jArr2[i10] = jSONArray.getLong(i10);
                    }
                }
            } catch (JSONException unused) {
                HMSLog.m8728w("JsonUtil", "JSONException: get " + str + " error.");
            }
        }
        return jArr2 == null ? jArr : jArr2;
    }

    /* renamed from: e */
    public static String m25287e(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has(str) && jSONObject.get(str) != null) {
                    return String.valueOf(jSONObject.get(str));
                }
            } catch (JSONException unused) {
                HMSLog.m8728w("JsonUtil", "JSONException: get " + str + " error.");
            }
        }
        return str2;
    }

    /* renamed from: f */
    public static String[] m25288f(JSONObject jSONObject, String str, String[] strArr) throws JSONException {
        String[] strArr2 = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.has(str)) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = (String) jSONArray.get(i10);
                    }
                    return strArr2;
                }
            } catch (JSONException unused) {
                HMSLog.m8728w("JsonUtil", "JSONException: get " + str + " error.");
            }
        }
        return strArr2;
    }

    /* renamed from: g */
    public static void m25289g(JSONObject jSONObject, Bundle bundle, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            m25283a(jSONObject, (String) entry.getKey(), entry.getValue(), bundle);
        }
    }
}
