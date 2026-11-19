package com.alibaba.sdk.android.push.common.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public class AppInfoUtil {
    private static final String TAG = "MPS:AppInfoUtil";
    private static final AmsLogger LOGGER = AmsLogger.getLogger(TAG);

    public static String getAppVersionName(Context context) {
        if (context == null) {
            LOGGER.m5019e("Get app version name failed: context null");
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e4) {
            LOGGER.m5020e("version name not found!", e4);
            return null;
        }
    }

    public static boolean isComponentExists(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        if (context == null) {
            LOGGER.m5019e("Get component info failed: context null");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context.getPackageName(), str);
        char c4 = 65535;
        try {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1655966961) {
                if (iHashCode != -808719889) {
                    if (iHashCode == 1984153269 && str2.equals("service")) {
                        c4 = 0;
                    }
                } else if (str2.equals("receiver")) {
                    c4 = 2;
                }
            } else if (str2.equals(AgooConstants.OPEN_ACTIIVTY_NAME)) {
                c4 = 1;
            }
            if (c4 == 0) {
                packageManager.getServiceInfo(componentName, 131584);
            } else if (c4 == 1) {
                packageManager.getActivityInfo(componentName, 131584);
            } else {
                if (c4 != 2) {
                    return false;
                }
                packageManager.getReceiverInfo(componentName, 131584);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            LOGGER.m5019e("component:" + str + " not found!");
            return false;
        }
    }
}
