package com.huawei.hms.framework.common;

import android.content.Context;

/* loaded from: classes5.dex */
public class ContextHolder {

    /* renamed from: a */
    public static Context f11627a;

    /* renamed from: b */
    public static Context f11628b;

    public static Context getAppContext() {
        return f11627a;
    }

    public static Context getKitContext() {
        return f11628b;
    }

    public static Context getResourceContext() {
        return getKitContext() != null ? getKitContext() : getAppContext();
    }

    public static void setAppContext(Context context) {
        if (f11627a != null) {
            return;
        }
        CheckParamUtils.checkNotNull(context, "sAppContext == null");
        f11627a = context.getApplicationContext();
    }

    public static void setKitContext(Context context) {
        CheckParamUtils.checkNotNull(context, "sKitContext == null");
        f11628b = context;
    }
}
