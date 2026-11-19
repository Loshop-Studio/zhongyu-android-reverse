package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;

/* loaded from: classes5.dex */
public class RegionUtils {
    /* renamed from: a */
    public static String m8827a(Context context) {
        return (context == null || context.getApplicationContext() == null) ? "" : GrsApp.getInstance().getIssueCountryCode(context);
    }

    public static boolean isChinaROM(Context context) {
        return "CN".equalsIgnoreCase(m8827a(context));
    }
}
