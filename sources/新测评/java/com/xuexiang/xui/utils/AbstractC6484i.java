package com.xuexiang.xui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.xuexiang.xui.utils.i */
/* loaded from: classes4.dex */
public abstract class AbstractC6484i {
    /* renamed from: a */
    public static Activity m5404a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m5404a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: b */
    public static void m5405b(Activity activity) {
        activity.requestWindowFeature(1);
        activity.getWindow().setFlags(1024, 1024);
    }
}
