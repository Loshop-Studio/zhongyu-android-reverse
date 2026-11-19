package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import java.io.IOException;
import p317r4.AbstractC10840c;
import p317r4.C10842e;

/* loaded from: classes5.dex */
public class AGCUtils {
    /* renamed from: a */
    public static String m8501a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.m8725e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.appid")) == null) {
                HMSLog.m8725e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
                return "";
            }
            String strValueOf = String.valueOf(obj);
            return strValueOf.startsWith("appid=") ? strValueOf.substring(6) : strValueOf;
        } catch (AndroidException unused) {
            HMSLog.m8725e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (RuntimeException e10) {
            HMSLog.m8726e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.", e10);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m8502b(android.content.Context r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Get "
            java.lang.String r1 = "AGCUtils"
            java.lang.String r2 = ""
            r3 = 0
            r4.e r4 = new r4.e     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            r4.<init>()     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            android.content.res.Resources r5 = r7.getResources()     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            java.lang.String r6 = "agconnect-services.json"
            java.io.InputStream r3 = r5.open(r6)     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            r4.m23329b(r3)     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            r4.d r7 = r4.m23328a(r7)     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            java.lang.String r7 = r7.getString(r8)     // Catch: java.lang.Throwable -> L26 java.lang.NullPointerException -> L28 java.io.IOException -> L2a
            goto L63
        L26:
            r7 = move-exception
            goto L87
        L28:
            r7 = move-exception
            goto L2c
        L2a:
            r7 = move-exception
            goto L48
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r4.<init>()     // Catch: java.lang.Throwable -> L26
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            r4.append(r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = " with AGConnectServicesConfig failed: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            r4.append(r7)     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L26
            com.huawei.hms.support.log.HMSLog.m8725e(r1, r7)     // Catch: java.lang.Throwable -> L26
        L46:
            r7 = r2
            goto L63
        L48:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r4.<init>()     // Catch: java.lang.Throwable -> L26
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            r4.append(r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = " failed: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            r4.append(r7)     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L26
            com.huawei.hms.support.log.HMSLog.m8725e(r1, r7)     // Catch: java.lang.Throwable -> L26
            goto L46
        L63:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L6d
            return r7
        L6d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "The "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = " is null."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.hms.support.log.HMSLog.m8725e(r1, r7)
            return r2
        L87:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.util.AGCUtils.m8502b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static String m8503c(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.m8725e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.m8727i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String strValueOf = String.valueOf(obj);
            return strValueOf.startsWith("cpid=") ? strValueOf.substring(5) : strValueOf;
        } catch (AndroidException unused) {
            HMSLog.m8725e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (RuntimeException e10) {
            HMSLog.m8726e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.", e10);
            return "";
        }
    }

    /* renamed from: d */
    public static boolean m8504d(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    public static String getAppId(Context context) throws IOException {
        String string;
        if (context == null) {
            HMSLog.m8728w("AGCUtils", "getAppId context is null");
            return "";
        }
        if (m8504d(context)) {
            string = m8502b(context, "client/app_id");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        } else {
            string = null;
        }
        try {
            AbstractC10840c abstractC10840cM23323c = AbstractC10840c.m23323c();
            if (abstractC10840cM23323c.mo23325b() != context) {
                abstractC10840cM23323c = AbstractC10840c.m23322a(new C10842e().m23328a(context));
            }
            string = abstractC10840cM23323c.mo23326d().getString("client/app_id");
        } catch (NullPointerException unused) {
            HMSLog.m8725e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM8501a = m8501a(context);
        return !TextUtils.isEmpty(strM8501a) ? strM8501a : m8502b(context, "client/app_id");
    }

    public static String getCpId(Context context) {
        String string;
        if (context == null) {
            HMSLog.m8728w("AGCUtils", "getCpId context is null");
            return "";
        }
        if (m8504d(context)) {
            return m8502b(context, "client/cp_id");
        }
        try {
            AbstractC10840c abstractC10840cM23323c = AbstractC10840c.m23323c();
            if (abstractC10840cM23323c.mo23325b() != context) {
                abstractC10840cM23323c = AbstractC10840c.m23322a(new C10842e().m23328a(context));
            }
            string = abstractC10840cM23323c.mo23326d().getString("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.m8725e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
            string = null;
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM8503c = m8503c(context);
        return !TextUtils.isEmpty(strM8503c) ? strM8503c : m8502b(context, "client/cp_id");
    }
}
