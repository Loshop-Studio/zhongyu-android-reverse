package com.huawei.hms.framework.common.check;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;

/* loaded from: classes5.dex */
public class ProviderCheckUtil {
    /* renamed from: a */
    public static boolean m8609a(PackageManager packageManager, String str) {
        if (packageManager.checkSignatures("com.huawei.hwid", str) == 0) {
            Logger.m8586v("ProviderCheckUtil", "Valid Provider");
            return true;
        }
        if (packageManager.checkSignatures("com.huawei.hwid.tv", str) != 0) {
            return false;
        }
        Logger.m8586v("ProviderCheckUtil", "Valid Provider in tv");
        return true;
    }

    public static boolean isValid(Uri uri) {
        ApplicationInfo applicationInfo;
        if (uri == null) {
            return false;
        }
        PackageManager packageManager = ContextHolder.getAppContext().getPackageManager();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
        if (providerInfoResolveContentProvider == null || (applicationInfo = providerInfoResolveContentProvider.applicationInfo) == null) {
            Logger.m8588w("ProviderCheckUtil", "Invalid param");
            return false;
        }
        String str = applicationInfo.packageName;
        Logger.m8586v("ProviderCheckUtil", "Target provider service's package name is : " + str);
        if (str != null) {
            return m8609a(packageManager, str);
        }
        Logger.m8588w("ProviderCheckUtil", "Invalid packageName");
        return false;
    }
}
