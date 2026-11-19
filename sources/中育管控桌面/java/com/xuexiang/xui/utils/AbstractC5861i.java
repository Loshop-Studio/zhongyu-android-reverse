package com.xuexiang.xui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.xuexiang.xui.utils.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5861i {
    /* renamed from: a */
    public static Activity m4410a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m4410a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: b */
    public static void m4411b(Activity activity) {
        activity.requestWindowFeature(1);
        activity.getWindow().setFlags(1024, 1024);
    }
}
