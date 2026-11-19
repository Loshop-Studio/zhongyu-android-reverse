package com.umeng.commonsdk.framework;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3337ak;
import com.umeng.analytics.pro.C3339am;
import com.umeng.analytics.pro.C3391h;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.C3450b;
import com.umeng.commonsdk.statistics.C3473b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UMEnvelopeBuild {
    public static boolean transmissionSendFlag = false;

    private static JSONObject add2CacheTable(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) throws JSONException {
        if (jSONObject == null || jSONObject2 == null) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]构建信封传入 header 或 body 字段为空，直接返回");
            return null;
        }
        C3391h c3391hM3158a = C3391h.m3158a(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        UUID uuidRandomUUID = UUID.randomUUID();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3339am.f1807e, str2);
        contentValues.put(C3339am.f1808f, c3391hM3158a.m3182c(jSONObject.toString()));
        contentValues.put(C3339am.f1809g, c3391hM3158a.m3182c(jSONObject2.toString()));
        contentValues.put(C3339am.f1810h, String.valueOf(jCurrentTimeMillis));
        contentValues.put(C3339am.f1811i, uuidRandomUUID.toString());
        contentValues.put(C3339am.f1812j, str);
        contentValues.put(C3339am.f1813k, str3);
        C3337ak.m2924a(context).m2930a(C3339am.f1805c, contentValues);
        if (C3335ai.f1660aA.equalsIgnoreCase(str2)) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]inner业务，返回空 JSONObject。");
        } else if (C3335ai.f1711az.equalsIgnoreCase(str2)) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]分享业务 返回body。");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("header", new JSONObject());
                jSONObject3.put("share", jSONObject2.getJSONObject("share"));
                return jSONObject3;
            } catch (JSONException unused) {
            }
        } else if (!C3335ai.f1707av.equalsIgnoreCase(str2)) {
            try {
                if ("st".equalsIgnoreCase(str2)) {
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 半开报文，返回body。");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("header", new JSONObject());
                    jSONObject4.put("analytics", jSONObject2.getJSONObject("analytics"));
                    return jSONObject4;
                }
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 闭合报文，返回body。");
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("header", new JSONObject());
                jSONObject5.put("analytics", jSONObject2.getJSONObject("analytics"));
                return jSONObject5;
            } catch (JSONException unused2) {
                return jSONObject2;
            }
        }
        return new JSONObject();
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        return buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2, UMServerURL.PATH_ANALYTICS, jSONObject.has("st") ? C3335ai.f1665aF : jSONObject2.has(C3335ai.f1704as) ? C3335ai.f1660aA : C3335ai.f1705at, "9.3.7");
    }

    public static JSONObject buildZeroEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        if (UMUtils.isMainProgress(context)) {
            return new C3473b().m3635a(context.getApplicationContext(), jSONObject, jSONObject2, str);
        }
        JSONObject jSONObject3 = null;
        try {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("exception", 120);
                return jSONObject4;
            } catch (JSONException unused) {
                jSONObject3 = jSONObject4;
                return jSONObject3;
            }
        } catch (JSONException unused2) {
        }
    }

    public static long getLastInstantBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastInstantBuildTime(context.getApplicationContext());
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastSuccessfulBuildTime(context.getApplicationContext());
    }

    public static synchronized boolean getTransmissionSendFlag() {
        return transmissionSendFlag;
    }

    public static String imprintProperty(Context context, String str, String str2) {
        return context == null ? str2 : ImprintHandler.getImprintService(context.getApplicationContext()).m3750c().m3753a(str, str2);
    }

    public static boolean isOnline(Context context) {
        return UMFrUtils.isOnline(context) && (UMConfigure.needSendZcfgEnv(context) ^ true);
    }

    public static boolean isReadyBuild(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        return isRet(context, uMBusinessType, false);
    }

    public static boolean isReadyBuildNew(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        if (getTransmissionSendFlag()) {
            return isRet(context, uMBusinessType, false);
        }
        return false;
    }

    public static boolean isReadyBuildStateless() {
        return getTransmissionSendFlag();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean isRet(android.content.Context r5, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r6, boolean r7) {
        /*
            if (r5 == 0) goto L43
            android.content.Context r0 = r5.getApplicationContext()
            boolean r1 = com.umeng.commonsdk.framework.UMFrUtils.isOnline(r0)
            int r2 = com.umeng.commonsdk.framework.UMFrUtils.envelopeFileNumber(r0)
            if (r1 == 0) goto L3c
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r7 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            r3 = 1
            r4 = 0
            if (r6 != r7) goto L1f
            boolean r5 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6)
            if (r5 == 0) goto L1d
            goto L2d
        L1d:
            r7 = r3
            goto L3c
        L1f:
            boolean r7 = com.umeng.commonsdk.framework.C3448a.m3448a()
            if (r7 == 0) goto L2f
            int r5 = com.umeng.commonsdk.framework.C3448a.m3450b()
            long r5 = (long) r5
            com.umeng.commonsdk.framework.UMWorkDispatch.sendDelayProcessMsg(r5)
        L2d:
            r7 = r4
            goto L3c
        L2f:
            boolean r6 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6)
            if (r6 != 0) goto L2d
            boolean r5 = com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r5)
            if (r5 == 0) goto L1d
            goto L2d
        L3c:
            if (r1 == 0) goto L43
            if (r2 <= 0) goto L43
            com.umeng.commonsdk.framework.C3448a.m3454d()
        L43:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMEnvelopeBuild.isRet(android.content.Context, com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType, boolean):boolean");
    }

    public static long maxDataSpace(Context context) {
        if (context == null) {
            return 0L;
        }
        return C3473b.m3627a(context.getApplicationContext());
    }

    public static synchronized void setTransmissionSendFlag(boolean z3) {
        transmissionSendFlag = z3;
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) throws JSONException {
        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]业务发起构建普通有状态信封请求。");
        JSONObject jSONObject3 = null;
        if (TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("exception", UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
                    return jSONObject4;
                } catch (JSONException unused) {
                    jSONObject3 = jSONObject4;
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
            }
        } else if (!UMUtils.isMainProgress(context)) {
            try {
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("exception", 120);
                    return jSONObject5;
                } catch (JSONException unused3) {
                    jSONObject3 = jSONObject5;
                    return jSONObject3;
                }
            } catch (JSONException unused4) {
            }
        } else {
            if (UMConfigure.needSendZcfgEnv(context)) {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 未获取到，写入二级缓存");
                return add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
            }
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 已获取到，判断二级缓存是否为空");
            if (C3337ak.m2924a(context).m2935c()) {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存为空，直接打信封");
                return new C3473b().m3636a(context.getApplicationContext(), jSONObject, jSONObject2, str, str2, str3);
            }
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存不为空，写入二级缓存");
            JSONObject jSONObjectAdd2CacheTable = add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
            if (!UMWorkDispatch.eventHasExist(C3449a.f2595t)) {
                UMWorkDispatch.sendEvent(context, C3449a.f2595t, C3450b.m3469a(context).m3470a(), null);
            }
            return jSONObjectAdd2CacheTable;
        }
    }
}
