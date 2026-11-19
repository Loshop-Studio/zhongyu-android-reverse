package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.umeng.analytics.pro.aa */
/* loaded from: classes2.dex */
public class C3327aa {
    /* renamed from: a */
    public static InterfaceC3408y m2825a(Context context) {
        String str = Build.BRAND;
        C3334ah.m2835a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new C3328ab();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米")) {
            return new C3333ag();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new C3332af();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus")) {
            return new C3330ad();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new C3329ac();
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG")) {
            return new C3331ae();
        }
        return null;
    }
}
