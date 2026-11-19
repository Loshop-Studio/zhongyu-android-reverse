package com.alibaba.sdk.android.push.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;

/* loaded from: classes3.dex */
public class AppInfoUtil {
    private static final String TAG = "MPS:AppInfoUtil";
    private static final AmsLogger LOGGER = AmsLogger.getLogger(TAG);

    public static String getAppVersionName(Context context) {
        if (context == null) {
            LOGGER.m3420e("Get app version name failed: context null");
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            LOGGER.m3421e("version name not found!", e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isComponentExists(android.content.Context r6, java.lang.String r7, java.lang.String r8) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r0 = 0
            if (r6 == 0) goto L77
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r6, r7)
            int r6 = r8.hashCode()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r3 = -1655966961(0xffffffff9d4bf30f, float:-2.6992485E-21)
            r4 = 2
            r5 = 1
            if (r6 == r3) goto L3a
            r3 = -808719889(0xffffffffcfcbe9ef, float:-6.842212E9)
            if (r6 == r3) goto L30
            r3 = 1984153269(0x7643c6b5, float:9.927033E32)
            if (r6 == r3) goto L26
            goto L44
        L26:
            java.lang.String r6 = "service"
            boolean r6 = r8.equals(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            if (r6 == 0) goto L44
            r6 = r0
            goto L45
        L30:
            java.lang.String r6 = "receiver"
            boolean r6 = r8.equals(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            if (r6 == 0) goto L44
            r6 = r4
            goto L45
        L3a:
            java.lang.String r6 = "activity"
            boolean r6 = r8.equals(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            if (r6 == 0) goto L44
            r6 = r5
            goto L45
        L44:
            r6 = -1
        L45:
            r8 = 131584(0x20200, float:1.84388E-40)
            if (r6 == 0) goto L57
            if (r6 == r5) goto L53
            if (r6 == r4) goto L4f
            return r0
        L4f:
            r1.getReceiverInfo(r2, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            return r5
        L53:
            r1.getActivityInfo(r2, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            return r5
        L57:
            r1.getServiceInfo(r2, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            return r5
        L5b:
            com.alibaba.sdk.android.ams.common.logger.AmsLogger r6 = com.alibaba.sdk.android.push.common.util.AppInfoUtil.LOGGER
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "component:"
            r8.append(r1)
            r8.append(r7)
            java.lang.String r7 = " not found!"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
        L73:
            r6.m3420e(r7)
            return r0
        L77:
            com.alibaba.sdk.android.ams.common.logger.AmsLogger r6 = com.alibaba.sdk.android.push.common.util.AppInfoUtil.LOGGER
            java.lang.String r7 = "Get component info failed: context null"
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.push.common.util.AppInfoUtil.isComponentExists(android.content.Context, java.lang.String, java.lang.String):boolean");
    }
}
