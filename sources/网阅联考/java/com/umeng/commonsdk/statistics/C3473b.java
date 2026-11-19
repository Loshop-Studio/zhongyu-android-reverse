package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3352az;
import com.umeng.analytics.pro.C3380c;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.C3468a;
import com.umeng.commonsdk.stateless.C3469b;
import com.umeng.commonsdk.stateless.C3471d;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.C3484e;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3510b;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.statistics.b */
/* loaded from: classes2.dex */
public class C3473b {

    /* renamed from: a */
    public static String f2729a = null;

    /* renamed from: b */
    public static String f2730b = "";

    /* renamed from: c */
    private static final String f2731c = "EnvelopeManager";

    /* renamed from: d */
    private static final String f2732d = "debug.umeng.umTaskId";

    /* renamed from: e */
    private static final String f2733e = "debug.umeng.umCaseId";

    /* renamed from: f */
    private static final String f2734f = "empty";

    /* renamed from: g */
    private static String f2735g = "";

    /* renamed from: h */
    private static String f2736h = "";

    /* renamed from: i */
    private static String f2737i;

    /* renamed from: k */
    private static boolean f2738k;

    /* renamed from: j */
    private int f2739j = 0;

    /* renamed from: a */
    public static void m3631a() {
        if (f2737i != null) {
            f2737i = null;
            C3484e.m3768a();
        }
    }

    /* renamed from: b */
    private static boolean m3634b() {
        f2735g = UMUtils.getSystemProperty(f2732d, "");
        f2736h = UMUtils.getSystemProperty(f2733e, "");
        return (!TextUtils.isEmpty(f2735g) && !f2734f.equals(f2735g)) && (!TextUtils.isEmpty(f2736h) && !f2734f.equals(f2736h));
    }

    /* renamed from: a */
    public static long m3627a(Context context) {
        long j4 = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        if (ULog.DEBUG) {
            Log.i(f2731c, "free size is " + j4);
        }
        return j4;
    }

    /* renamed from: b */
    private static JSONObject m3633b(Context context) {
        SharedPreferences sharedPreferences;
        JSONObject jSONObject;
        try {
            sharedPreferences = PreferenceWrapper.getDefault(context);
            if (!TextUtils.isEmpty(f2737i)) {
                try {
                    jSONObject = new JSONObject(f2737i);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            } else {
                UMUtils.saveSDKComponent();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C3335ai.f1736p, DeviceConfig.getAppMD5Signature(context));
                jSONObject2.put(C3335ai.f1737q, DeviceConfig.getAppSHA1Key(context));
                jSONObject2.put(C3335ai.f1738r, DeviceConfig.getAppHashKey(context));
                jSONObject2.put("app_version", DeviceConfig.getAppVersionName(context));
                jSONObject2.put("version_code", Integer.parseInt(DeviceConfig.getAppVersionCode(context)));
                jSONObject2.put(C3335ai.f1742v, DeviceConfig.getDeviceIdUmengMD5(context));
                jSONObject2.put(C3335ai.f1743w, DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(context);
                if (!TextUtils.isEmpty(mccmnc)) {
                    jSONObject2.put(C3335ai.f1634B, mccmnc);
                    f2730b = mccmnc;
                } else {
                    jSONObject2.put(C3335ai.f1634B, "");
                }
                String subOSName = DeviceConfig.getSubOSName(context);
                if (!TextUtils.isEmpty(subOSName)) {
                    jSONObject2.put(C3335ai.f1643K, subOSName);
                }
                String subOSVersion = DeviceConfig.getSubOSVersion(context);
                if (!TextUtils.isEmpty(subOSVersion)) {
                    jSONObject2.put(C3335ai.f1644L, subOSVersion);
                }
                String deviceType = DeviceConfig.getDeviceType(context);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject2.put(C3335ai.f1694ai, deviceType);
                }
                jSONObject2.put(C3335ai.f1735o, DeviceConfig.getPackageName(context));
                jSONObject2.put(C3335ai.f1741u, AnalyticsConstants.SDK_TYPE);
                jSONObject2.put("device_id", DeviceConfig.getDeviceId(context));
                jSONObject2.put("device_model", Build.MODEL);
                jSONObject2.put(C3335ai.f1637E, Build.BOARD);
                jSONObject2.put(C3335ai.f1638F, Build.BRAND);
                jSONObject2.put(C3335ai.f1639G, Build.TIME);
                jSONObject2.put(C3335ai.f1640H, Build.MANUFACTURER);
                jSONObject2.put(C3335ai.f1641I, Build.ID);
                jSONObject2.put(C3335ai.f1642J, Build.DEVICE);
                jSONObject2.put(C3335ai.f1745y, Build.VERSION.RELEASE);
                jSONObject2.put(C3335ai.f1744x, AnalyticsConstants.SDK_TYPE);
                int[] resolutionArray = DeviceConfig.getResolutionArray(context);
                if (resolutionArray != null) {
                    jSONObject2.put(C3335ai.f1746z, resolutionArray[1] + "*" + resolutionArray[0]);
                }
                jSONObject2.put(C3335ai.f1633A, DeviceConfig.getMac(context));
                jSONObject2.put(C3335ai.f1645M, DeviceConfig.getTimeZone(context));
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                jSONObject2.put(C3335ai.f1647O, localeInfo[0]);
                jSONObject2.put(C3335ai.f1646N, localeInfo[1]);
                jSONObject2.put(C3335ai.f1648P, DeviceConfig.getNetworkOperatorName(context));
                jSONObject2.put(C3335ai.f1739s, DeviceConfig.getAppName(context));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    jSONObject2.put(C3335ai.f1649Q, "wifi");
                } else if ("2G/3G".equals(networkAccessMode[0])) {
                    jSONObject2.put(C3335ai.f1649Q, "2G/3G");
                } else {
                    jSONObject2.put(C3335ai.f1649Q, "unknow");
                }
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject2.put(C3335ai.f1650R, networkAccessMode[1]);
                }
                if (FieldManager.allow(C3510b.f2973H)) {
                    jSONObject2.put(C3335ai.f1651S, DeviceConfig.getIPAddress(context));
                }
                jSONObject2.put(C3335ai.f1652T, DeviceConfig.getNetworkType(context));
                jSONObject2.put(C3335ai.f1712b, "9.3.7");
                jSONObject2.put(C3335ai.f1723c, SdkVersion.SDK_TYPE);
                jSONObject2.put(C3335ai.f1724d, SdkVersion.MINI_VERSION);
                if (!TextUtils.isEmpty(f2729a)) {
                    jSONObject2.put(C3335ai.f1725e, f2729a);
                }
                jSONObject2.put(C3335ai.f1695aj, Build.VERSION.SDK_INT);
                if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                    jSONObject2.put(C3335ai.f1691af, UMUtils.VALUE_REC_VERSION_NAME);
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
                f2737i = jSONObject2.toString();
                jSONObject = jSONObject2;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put(C3335ai.f1696ak, UMUtils.getOaidRequiredTime(context));
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put(C3335ai.f1653U, sharedPreferences.getInt("successful_request", 0));
            jSONObject.put(C3335ai.f1654V, sharedPreferences.getInt(C3335ai.f1654V, 0));
            jSONObject.put(C3335ai.f1655W, sharedPreferences.getInt("last_request_spent_ms", 0));
            String zid = UMUtils.getZid(context);
            if (!TextUtils.isEmpty(zid)) {
                jSONObject.put(C3335ai.f1697al, zid);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                jSONObject.put(C3335ai.f1698am, UMUtils.VALUE_ASMS_VERSION);
            }
        } catch (Exception unused4) {
        }
        jSONObject.put("channel", UMUtils.getChannel(context));
        jSONObject.put("appkey", UMUtils.getAppkey(context));
        try {
            String deviceToken = UMUtils.getDeviceToken(context);
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject.put(C3335ai.f1659a, deviceToken);
            }
        } catch (Exception e4) {
            UMCrashManager.reportCrash(context, e4);
        }
        try {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, C3335ai.f1727g, null);
            if (!TextUtils.isEmpty(strImprintProperty)) {
                jSONObject.put(C3335ai.f1727g, strImprintProperty);
            }
        } catch (Exception e5) {
            UMCrashManager.reportCrash(context, e5);
        }
        try {
            jSONObject.put("wrapper_type", C3472a.f2726a);
            jSONObject.put("wrapper_version", C3472a.f2727b);
        } catch (Exception unused5) {
        }
        try {
            int targetSdkVersion = UMUtils.getTargetSdkVersion(context);
            boolean zCheckPermission = UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE");
            jSONObject.put(C3335ai.f1678aS, targetSdkVersion);
            if (zCheckPermission) {
                jSONObject.put(C3335ai.f1679aT, "yes");
            } else {
                jSONObject.put(C3335ai.f1679aT, "no");
            }
        } catch (Throwable unused6) {
        }
        try {
            if (m3634b()) {
                jSONObject.put("umTaskId", f2735g);
                jSONObject.put("umCaseId", f2736h);
            }
        } catch (Throwable unused7) {
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C3335ai.f1683aX, C3449a.f2580e);
            if (!TextUtils.isEmpty(UMUtils.VALUE_ANALYTICS_VERSION)) {
                jSONObject3.put(C3335ai.f1684aY, UMUtils.VALUE_ANALYTICS_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_GAME_VERSION)) {
                jSONObject3.put(C3335ai.f1685aZ, UMUtils.VALUE_GAME_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_PUSH_VERSION)) {
                jSONObject3.put(C3335ai.f1713ba, UMUtils.VALUE_PUSH_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_SHARE_VERSION)) {
                jSONObject3.put(C3335ai.f1714bb, UMUtils.VALUE_SHARE_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_APM_VERSION)) {
                jSONObject3.put(C3335ai.f1715bc, UMUtils.VALUE_APM_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_VERIFY_VERSION)) {
                jSONObject3.put(C3335ai.f1716bd, UMUtils.VALUE_VERIFY_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_SMS_VERSION)) {
                jSONObject3.put(C3335ai.f1717be, UMUtils.VALUE_SMS_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                jSONObject3.put(C3335ai.f1718bf, UMUtils.VALUE_REC_VERSION_NAME);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_VISUAL_VERSION)) {
                jSONObject3.put(C3335ai.f1719bg, UMUtils.VALUE_VISUAL_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                jSONObject3.put(C3335ai.f1720bh, UMUtils.VALUE_ASMS_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_LINK_VERSION)) {
                jSONObject3.put(C3335ai.f1721bi, UMUtils.VALUE_LINK_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ABTEST_VERSION)) {
                jSONObject3.put(C3335ai.f1722bj, UMUtils.VALUE_ABTEST_VERSION);
            }
            jSONObject.put(C3335ai.f1682aW, jSONObject3);
        } catch (Throwable unused8) {
        }
        byte[] bArrM3746a = ImprintHandler.getImprintService(context).m3746a();
        if (bArrM3746a != null && bArrM3746a.length > 0) {
            try {
                jSONObject.put(C3335ai.f1656X, Base64.encodeToString(bArrM3746a, 0));
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
    private JSONObject m3629a(int i4, JSONObject jSONObject) throws JSONException {
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
    public JSONObject m3636a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject3;
        String str4;
        Envelope envelope;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            Log.i(f2731c, "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i(f2731c, "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        JSONObject jSONObject4 = null;
        if (context != null && jSONObject2 != null) {
            try {
                JSONObject jSONObjectM3633b = m3633b(context);
                if (jSONObjectM3633b != null && jSONObject != null) {
                    jSONObjectM3633b = m3630a(jSONObjectM3633b, jSONObject);
                }
                JSONObject jSONObject5 = jSONObjectM3633b;
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
                String str6 = C3335ai.f1664aE;
                if (!TextUtils.isEmpty(str2)) {
                    str6 = str2;
                }
                String str7 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
                if (jSONObject5 != null) {
                    String strSubstring = str6 + "==" + str7 + "&=";
                    if (TextUtils.isEmpty(strSubstring)) {
                        return m3629a(101, jSONObject5);
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
                        C3484e c3484eM3767a = C3484e.m3767a(context);
                        if (c3484eM3767a != null) {
                            c3484eM3767a.m3775b();
                            String strEncodeToString = Base64.encodeToString(new C3352az().m3000a(c3484eM3767a.m3776c()), 0);
                            if (!TextUtils.isEmpty(strEncodeToString)) {
                                JSONObject jSONObject6 = jSONObject5.getJSONObject("header");
                                jSONObject6.put(C3335ai.f1657Y, strEncodeToString);
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
                    return m3629a(UMErrorCode.E_UM_BE_RAW_OVERSIZE, jSONObject5);
                }
                if (jSONObject5 != null) {
                    Envelope envelopeM3628a = m3628a(context, jSONObject5.toString().getBytes());
                    if (envelopeM3628a == null) {
                        return m3629a(UMErrorCode.E_UM_BE_CREATE_FAILED, jSONObject5);
                    }
                    envelope = envelopeM3628a;
                } else {
                    envelope = null;
                }
                if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                    return m3629a(UMErrorCode.E_UM_BE_FILE_OVERSIZE, jSONObject5);
                }
                String str8 = str4;
                int iM3626a = m3626a(context, envelope, str4, jSONObject5 != null ? jSONObject5.optJSONObject("header").optString("app_version") : null, str);
                if (iM3626a != 0) {
                    return m3629a(iM3626a, jSONObject5);
                }
                if (ULog.DEBUG) {
                    Log.i(f2731c, "constructHeader size is " + jSONObject5.toString().getBytes().length);
                }
                if (!str8.startsWith(C3335ai.f1661aB) && !str8.startsWith(C3335ai.f1660aA) && !str8.startsWith(C3335ai.f1665aF) && !str8.startsWith(C3335ai.f1705at) && !C3469b.m3579a()) {
                    new C3469b(context);
                    C3469b.m3581b();
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
                        return m3629a(UMErrorCode.E_UM_BE_JSON_FAILED, jSONObject4);
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
                return m3629a(UMErrorCode.E_UM_BE_JSON_FAILED, jSONObject4);
            }
        }
        return m3629a(UMErrorCode.E_UM_BE_JSON_FAILED, (JSONObject) null);
    }

    /* renamed from: a */
    public JSONObject m3635a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("header", new JSONObject());
            try {
                if (m3634b()) {
                    jSONObject.put("umTaskId", f2735g);
                    jSONObject.put("umCaseId", f2736h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = m3630a(jSONObject3, jSONObject);
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
                return m3629a(UMErrorCode.E_UM_BE_RAW_OVERSIZE, jSONObject3);
            }
            if (jSONObject3 != null) {
                Envelope envelopeM3628a = m3628a(context, jSONObject3.toString().getBytes());
                if (envelopeM3628a == null) {
                    return m3629a(UMErrorCode.E_UM_BE_CREATE_FAILED, jSONObject3);
                }
                envelope = envelopeM3628a;
            } else {
                envelope = null;
            }
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m3629a(UMErrorCode.E_UM_BE_FILE_OVERSIZE, jSONObject3);
            }
            int iM3626a = m3626a(context, envelope, "z==1.2.0", jSONObject3 != null ? jSONObject3.optJSONObject("header").optString("app_version") : null, str);
            if (iM3626a != 0) {
                return m3629a(iM3626a, jSONObject3);
            }
            if (ULog.DEBUG) {
                Log.i(f2731c, "constructHeader size is " + jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return m3629a(UMErrorCode.E_UM_BE_JSON_FAILED, new JSONObject());
        }
    }

    /* renamed from: a */
    private JSONObject m3630a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
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
                            if (str.equals(C3380c.f2016i) && (jSONObject2.opt(str) instanceof Integer)) {
                                this.f2739j = ((Integer) jSONObject2.opt(str)).intValue();
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
    private Envelope m3628a(Context context, byte[] bArr) {
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
        if (f2738k) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    /* renamed from: a */
    private int m3626a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String strM3614b = C3471d.m3614b(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(strM3614b);
        sb.append(".log");
        byte[] binary = envelope.toBinary();
        if (!str.startsWith(C3335ai.f1661aB) && !str.startsWith(C3335ai.f1660aA) && !str.startsWith(C3335ai.f1705at) && !str.startsWith(C3335ai.f1665aF)) {
            return C3471d.m3603a(context, C3468a.f2698f, sb.toString(), binary);
        }
        return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
    }

    /* renamed from: a */
    public static void m3632a(boolean z3) {
        f2738k = z3;
    }
}
