package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.umeng.analytics.pro.aa */
/* loaded from: classes.dex */
public class C1843aa {
    /* renamed from: a */
    public static InterfaceC1924y m6748a(Context context) {
        String str = Build.BRAND;
        C1850ah.m6758a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI) || str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_HONOR) || str.equalsIgnoreCase("华为")) {
            return new C1844ab();
        }
        if (str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_XIAOMI) || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米")) {
            return new C1849ag();
        }
        if (str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO)) {
            return new C1848af();
        }
        if (str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_OPPO) || str.equalsIgnoreCase("oneplus")) {
            return new C1846ad();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new C1845ac();
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG")) {
            return new C1847ae();
        }
        return null;
    }
}
