package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.analytics.pro.C1868az;
import com.umeng.analytics.pro.C1896c;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.C1965a;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.C1984a;
import com.umeng.commonsdk.stateless.C1985b;
import com.umeng.commonsdk.stateless.C1987d;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.C2000e;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C2026b;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.statistics.b */
/* loaded from: classes.dex */
public class C1989b {

    /* renamed from: a */
    public static String f9321a = null;

    /* renamed from: b */
    public static String f9322b = "";

    /* renamed from: c */
    private static final String f9323c = "EnvelopeManager";

    /* renamed from: d */
    private static final String f9324d = "debug.umeng.umTaskId";

    /* renamed from: e */
    private static final String f9325e = "debug.umeng.umCaseId";

    /* renamed from: f */
    private static final String f9326f = "empty";

    /* renamed from: g */
    private static String f9327g = "";

    /* renamed from: h */
    private static String f9328h = "";

    /* renamed from: i */
    private static String f9329i;

    /* renamed from: k */
    private static boolean f9330k;

    /* renamed from: j */
    private int f9331j = 0;

    /* renamed from: a */
    public static void m7554a() {
        if (f9329i != null) {
            f9329i = null;
            C2000e.m7691a();
        }
    }

    /* renamed from: b */
    private static boolean m7557b() {
        f9327g = UMUtils.getSystemProperty(f9324d, "");
        f9328h = UMUtils.getSystemProperty(f9325e, "");
        return (!TextUtils.isEmpty(f9327g) && !f9326f.equals(f9327g)) && (!TextUtils.isEmpty(f9328h) && !f9326f.equals(f9328h));
    }

    /* renamed from: a */
    public static long m7550a(Context context) {
        long j4 = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        if (ULog.DEBUG) {
            Log.i(f9323c, "free size is " + j4);
        }
        return j4;
    }

    /* renamed from: b */
    private static JSONObject m7556b(Context context) {
        SharedPreferences sharedPreferences;
        JSONObject jSONObject;
        try {
            sharedPreferences = PreferenceWrapper.getDefault(context);
            if (!TextUtils.isEmpty(f9329i)) {
                try {
                    jSONObject = new JSONObject(f9329i);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            } else {
                UMUtils.saveSDKComponent();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C1851ai.f8328p, DeviceConfig.getAppMD5Signature(context));
                jSONObject2.put(C1851ai.f8329q, DeviceConfig.getAppSHA1Key(context));
                jSONObject2.put(C1851ai.f8330r, DeviceConfig.getAppHashKey(context));
                jSONObject2.put("app_version", DeviceConfig.getAppVersionName(context));
                jSONObject2.put("version_code", Integer.parseInt(DeviceConfig.getAppVersionCode(context)));
                jSONObject2.put(C1851ai.f8334v, DeviceConfig.getDeviceIdUmengMD5(context));
                jSONObject2.put(C1851ai.f8335w, DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(context);
                if (!TextUtils.isEmpty(mccmnc)) {
                    jSONObject2.put(C1851ai.f8226B, mccmnc);
                    f9322b = mccmnc;
                } else {
                    jSONObject2.put(C1851ai.f8226B, "");
                }
                String subOSName = DeviceConfig.getSubOSName(context);
                if (!TextUtils.isEmpty(subOSName)) {
                    jSONObject2.put(C1851ai.f8235K, subOSName);
                }
                String subOSVersion = DeviceConfig.getSubOSVersion(context);
                if (!TextUtils.isEmpty(subOSVersion)) {
                    jSONObject2.put(C1851ai.f8236L, subOSVersion);
                }
                String deviceType = DeviceConfig.getDeviceType(context);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject2.put(C1851ai.f8286ai, deviceType);
                }
                jSONObject2.put(C1851ai.f8327o, DeviceConfig.getPackageName(context));
                jSONObject2.put(C1851ai.f8333u, "Android");
                jSONObject2.put("device_id", DeviceConfig.getDeviceId(context));
                jSONObject2.put("device_model", Build.MODEL);
                jSONObject2.put(C1851ai.f8229E, Build.BOARD);
                jSONObject2.put(C1851ai.f8230F, Build.BRAND);
                jSONObject2.put(C1851ai.f8231G, Build.TIME);
                jSONObject2.put(C1851ai.f8232H, Build.MANUFACTURER);
                jSONObject2.put(C1851ai.f8233I, Build.ID);
                jSONObject2.put(C1851ai.f8234J, Build.DEVICE);
                jSONObject2.put(C1851ai.f8337y, Build.VERSION.RELEASE);
                jSONObject2.put("os", "Android");
                int[] resolutionArray = DeviceConfig.getResolutionArray(context);
                if (resolutionArray != null) {
                    jSONObject2.put(C1851ai.f8338z, resolutionArray[1] + "*" + resolutionArray[0]);
                }
                jSONObject2.put(C1851ai.f8225A, DeviceConfig.getMac(context));
                jSONObject2.put(C1851ai.f8237M, DeviceConfig.getTimeZone(context));
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                jSONObject2.put(C1851ai.f8239O, localeInfo[0]);
                jSONObject2.put(C1851ai.f8238N, localeInfo[1]);
                jSONObject2.put("carrier", DeviceConfig.getNetworkOperatorName(context));
                jSONObject2.put(C1851ai.f8331s, DeviceConfig.getAppName(context));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    jSONObject2.put(C1851ai.f8241Q, UtilityImpl.NET_TYPE_WIFI);
                } else if ("2G/3G".equals(networkAccessMode[0])) {
                    jSONObject2.put(C1851ai.f8241Q, "2G/3G");
                } else {
                    jSONObject2.put(C1851ai.f8241Q, "unknow");
                }
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject2.put(C1851ai.f8242R, networkAccessMode[1]);
                }
                if (FieldManager.allow(C2026b.f9565H)) {
                    jSONObject2.put(C1851ai.f8243S, DeviceConfig.getIPAddress(context));
                }
                jSONObject2.put(C1851ai.f8244T, DeviceConfig.getNetworkType(context));
                jSONObject2.put(C1851ai.f8304b, "9.3.7");
                jSONObject2.put(C1851ai.f8315c, SdkVersion.SDK_TYPE);
                jSONObject2.put(C1851ai.f8316d, "1");
                if (!TextUtils.isEmpty(f9321a)) {
                    jSONObject2.put(C1851ai.f8317e, f9321a);
                }
                jSONObject2.put(C1851ai.f8287aj, Build.VERSION.SDK_INT);
                if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                    jSONObject2.put(C1851ai.f8283af, UMUtils.VALUE_REC_VERSION_NAME);
                }
                try {
                    String uUIDForZid = UMUtils.getUUIDForZid(context);
                    if (TextUtils.isEmpty(uUIDForZid)) {
                        UMUtils.setUUIDForZid(context);
                        uUIDForZid = UMUtils.getUUIDForZid(context);
                    }
                    jSONObject2.put("session_id", uUIDForZid);
                } catch (Throwable unused2) {
                }
                f9329i = jSONObject2.toString();
                jSONObject = jSONObject2;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put(C1851ai.f8288ak, UMUtils.getOaidRequiredTime(context));
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put(C1851ai.f8245U, sharedPreferences.getInt("successful_request", 0));
            jSONObject.put(C1851ai.f8246V, sharedPreferences.getInt(C1851ai.f8246V, 0));
            jSONObject.put(C1851ai.f8247W, sharedPreferences.getInt("last_request_spent_ms", 0));
            String zid = UMUtils.getZid(context);
            if (!TextUtils.isEmpty(zid)) {
                jSONObject.put(C1851ai.f8289al, zid);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                jSONObject.put(C1851ai.f8290am, UMUtils.VALUE_ASMS_VERSION);
            }
        } catch (Exception unused4) {
        }
        jSONObject.put("channel", UMUtils.getChannel(context));
        jSONObject.put("appkey", UMUtils.getAppkey(context));
        try {
            String deviceToken = UMUtils.getDeviceToken(context);
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject.put(C1851ai.f8251a, deviceToken);
            }
        } catch (Exception e4) {
            UMCrashManager.reportCrash(context, e4);
        }
        try {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, C1851ai.f8319g, null);
            if (!TextUtils.isEmpty(strImprintProperty)) {
                jSONObject.put(C1851ai.f8319g, strImprintProperty);
            }
        } catch (Exception e5) {
            UMCrashManager.reportCrash(context, e5);
        }
        try {
            jSONObject.put("wrapper_type", C1988a.f9318a);
            jSONObject.put("wrapper_version", C1988a.f9319b);
        } catch (Exception unused5) {
        }
        try {
            int targetSdkVersion = UMUtils.getTargetSdkVersion(context);
            boolean zCheckPermission = UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE");
            jSONObject.put(C1851ai.f8270aS, targetSdkVersion);
            if (zCheckPermission) {
                jSONObject.put(C1851ai.f8271aT, "yes");
            } else {
                jSONObject.put(C1851ai.f8271aT, "no");
            }
        } catch (Throwable unused6) {
        }
        try {
            if (m7557b()) {
                jSONObject.put("umTaskId", f9327g);
                jSONObject.put("umCaseId", f9328h);
            }
        } catch (Throwable unused7) {
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C1851ai.f8275aX, C1965a.f9172e);
            if (!TextUtils.isEmpty(UMUtils.VALUE_ANALYTICS_VERSION)) {
                jSONObject3.put(C1851ai.f8276aY, UMUtils.VALUE_ANALYTICS_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_GAME_VERSION)) {
                jSONObject3.put(C1851ai.f8277aZ, UMUtils.VALUE_GAME_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_PUSH_VERSION)) {
                jSONObject3.put(C1851ai.f8305ba, UMUtils.VALUE_PUSH_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_SHARE_VERSION)) {
                jSONObject3.put(C1851ai.f8306bb, UMUtils.VALUE_SHARE_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_APM_VERSION)) {
                jSONObject3.put(C1851ai.f8307bc, UMUtils.VALUE_APM_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_VERIFY_VERSION)) {
                jSONObject3.put(C1851ai.f8308bd, UMUtils.VALUE_VERIFY_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_SMS_VERSION)) {
                jSONObject3.put(C1851ai.f8309be, UMUtils.VALUE_SMS_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                jSONObject3.put(C1851ai.f8310bf, UMUtils.VALUE_REC_VERSION_NAME);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_VISUAL_VERSION)) {
                jSONObject3.put(C1851ai.f8311bg, UMUtils.VALUE_VISUAL_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                jSONObject3.put(C1851ai.f8312bh, UMUtils.VALUE_ASMS_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_LINK_VERSION)) {
                jSONObject3.put(C1851ai.f8313bi, UMUtils.VALUE_LINK_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ABTEST_VERSION)) {
                jSONObject3.put(C1851ai.f8314bj, UMUtils.VALUE_ABTEST_VERSION);
            }
            jSONObject.put(C1851ai.f8274aW, jSONObject3);
        } catch (Throwable unused8) {
        }
        byte[] bArrM7669a = ImprintHandler.getImprintService(context).m7669a();
        if (bArrM7669a != null && bArrM7669a.length > 0) {
            try {
                jSONObject.put(C1851ai.f8248X, Base64.encodeToString(bArrM7669a, 0));
            } catch (JSONException e6) {
                UMCrashManager.reportCrash(context, e6);
            }
        }
        if (jSONObject.length() > 0) {
            return new JSONObject().put("header", jSONObject);
        }
        return null;
    }

    /* renamed from: a */
    private JSONObject m7552a(int i4, JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i4);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i4);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public JSONObject m7559a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject3;
        String str4;
        Envelope envelope;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            Log.i(f9323c, "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i(f9323c, "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        JSONObject jSONObject4 = null;
        if (context != null && jSONObject2 != null) {
            try {
                JSONObject jSONObjectM7556b = m7556b(context);
                if (jSONObjectM7556b != null && jSONObject != null) {
                    jSONObjectM7556b = m7553a(jSONObjectM7556b, jSONObject);
                }
                JSONObject jSONObject5 = jSONObjectM7556b;
                if (jSONObject5 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (next != null && (next instanceof String)) {
                            String str5 = next;
                            if (jSONObject2.opt(str5) != null) {
                                try {
                                    jSONObject5.put(str5, jSONObject2.opt(str5));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                String str6 = C1851ai.f8256aE;
                if (!TextUtils.isEmpty(str2)) {
                    str6 = str2;
                }
                String str7 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
                if (jSONObject5 != null) {
                    String strSubstring = str6 + "==" + str7 + "&=";
                    if (TextUtils.isEmpty(strSubstring)) {
                        return m7552a(101, jSONObject5);
                    }
                    if (strSubstring.endsWith("&=")) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    }
                    str4 = strSubstring;
                } else {
                    str4 = null;
                }
                if (jSONObject5 != null) {
                    try {
                        C2000e c2000eM7690a = C2000e.m7690a(context);
                        if (c2000eM7690a != null) {
                            c2000eM7690a.m7698b();
                            String strEncodeToString = Base64.encodeToString(new C1868az().m6923a(c2000eM7690a.m7699c()), 0);
                            if (!TextUtils.isEmpty(strEncodeToString)) {
                                JSONObject jSONObject6 = jSONObject5.getJSONObject("header");
                                jSONObject6.put(C1851ai.f8249Y, strEncodeToString);
                                jSONObject5.put("header", jSONObject6);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (jSONObject5 != null && DataHelper.largeThanMaxSize(jSONObject5.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                    SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                    }
                    return m7552a(113, jSONObject5);
                }
                if (jSONObject5 != null) {
                    Envelope envelopeM7551a = m7551a(context, jSONObject5.toString().getBytes());
                    if (envelopeM7551a == null) {
                        return m7552a(111, jSONObject5);
                    }
                    envelope = envelopeM7551a;
                } else {
                    envelope = null;
                }
                if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                    return m7552a(114, jSONObject5);
                }
                String str8 = str4;
                int iM7549a = m7549a(context, envelope, str4, jSONObject5 != null ? jSONObject5.optJSONObject("header").optString("app_version") : null, str);
                if (iM7549a != 0) {
                    return m7552a(iM7549a, jSONObject5);
                }
                if (ULog.DEBUG) {
                    Log.i(f9323c, "constructHeader size is " + jSONObject5.toString().getBytes().length);
                }
                if (!str8.startsWith(C1851ai.f8253aB) && !str8.startsWith(C1851ai.f8252aA) && !str8.startsWith("t") && !str8.startsWith(C1851ai.f8297at) && !C1985b.m7502a()) {
                    new C1985b(context);
                    C1985b.m7504b();
                }
                return jSONObject5;
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
                if (jSONObject != null) {
                    try {
                        jSONObject3 = new JSONObject();
                    } catch (Exception e4) {
                        e = e4;
                    }
                    try {
                        jSONObject3.put("header", jSONObject);
                    } catch (JSONException unused3) {
                    } catch (Exception e5) {
                        e = e5;
                        jSONObject4 = jSONObject3;
                        UMCrashManager.reportCrash(context, e);
                        return m7552a(110, jSONObject4);
                    }
                    jSONObject4 = jSONObject3;
                }
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                }
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (next2 != null && (next2 instanceof String)) {
                        String str9 = next2;
                        if (jSONObject2.opt(str9) != null) {
                            try {
                                jSONObject4.put(str9, jSONObject2.opt(str9));
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
                return m7552a(110, jSONObject4);
            }
        }
        return m7552a(110, (JSONObject) null);
    }

    /* renamed from: a */
    public JSONObject m7558a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("header", new JSONObject());
            try {
                if (m7557b()) {
                    jSONObject.put("umTaskId", f9327g);
                    jSONObject.put("umCaseId", f9328h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = m7553a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return m7552a(113, jSONObject3);
            }
            if (jSONObject3 != null) {
                Envelope envelopeM7551a = m7551a(context, jSONObject3.toString().getBytes());
                if (envelopeM7551a == null) {
                    return m7552a(111, jSONObject3);
                }
                envelope = envelopeM7551a;
            } else {
                envelope = null;
            }
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m7552a(114, jSONObject3);
            }
            int iM7549a = m7549a(context, envelope, "z==1.2.0", jSONObject3 != null ? jSONObject3.optJSONObject("header").optString("app_version") : null, str);
            if (iM7549a != 0) {
                return m7552a(iM7549a, jSONObject3);
            }
            if (ULog.DEBUG) {
                Log.i(f9323c, "constructHeader size is " + jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return m7552a(110, new JSONObject());
        }
    }

    /* renamed from: a */
    private JSONObject m7553a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt("header") != null && (jSONObject.opt("header") instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt("header");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (jSONObject2.opt(str) != null) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals(C1896c.f8608i) && (jSONObject2.opt(str) instanceof Integer)) {
                                this.f9331j = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private Envelope m7551a(Context context, byte[] bArr) {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int iIntValue = -1;
        try {
            if (!TextUtils.isEmpty(strImprintProperty)) {
                iIntValue = Integer.valueOf(strImprintProperty).intValue();
            }
        } catch (NumberFormatException e4) {
            UMCrashManager.reportCrash(context, e4);
        }
        if (iIntValue == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (iIntValue == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (f9330k) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    /* renamed from: a */
    private int m7549a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String strM7537b = C1987d.m7537b(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(strM7537b);
        sb.append(".log");
        byte[] binary = envelope.toBinary();
        if (!str.startsWith(C1851ai.f8253aB) && !str.startsWith(C1851ai.f8252aA) && !str.startsWith(C1851ai.f8297at) && !str.startsWith("t")) {
            return C1987d.m7526a(context, C1984a.f9290f, sb.toString(), binary);
        }
        return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
    }

    /* renamed from: a */
    public static void m7555a(boolean z3) {
        f9330k = z3;
    }
}
