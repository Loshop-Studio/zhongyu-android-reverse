package com.umeng.commonsdk;

import android.content.Context;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;

/* renamed from: com.umeng.commonsdk.a */
/* loaded from: classes2.dex */
public class C3431a {

    /* renamed from: a */
    private static Class<?> f2422a;

    /* renamed from: b */
    private static Method f2423b;

    static {
        try {
            int i4 = UMInnerImpl.f2419a;
            f2422a = UMInnerImpl.class;
            Method declaredMethod = UMInnerImpl.class.getDeclaredMethod("initAndSendInternal", Context.class);
            if (declaredMethod != null) {
                f2423b = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m3404a(Context context) {
        Method method;
        if (context == null || !UMUtils.isMainProgress(context)) {
            return;
        }
        if (SdkVersion.SDK_TYPE == 1) {
            UMConfigureInternation.sendInternal(context);
            return;
        }
        Class<?> cls = f2422a;
        if (cls == null || (method = f2423b) == null) {
            return;
        }
        try {
            method.invoke(cls, context);
        } catch (Throwable unused) {
        }
    }
}
