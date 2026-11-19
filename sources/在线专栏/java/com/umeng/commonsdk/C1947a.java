package com.umeng.commonsdk;

import android.content.Context;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;

/* renamed from: com.umeng.commonsdk.a */
/* loaded from: classes.dex */
public class C1947a {

    /* renamed from: a */
    private static Class<?> f9014a;

    /* renamed from: b */
    private static Method f9015b;

    static {
        try {
            int i4 = UMInnerImpl.f9011a;
            f9014a = UMInnerImpl.class;
            Method declaredMethod = UMInnerImpl.class.getDeclaredMethod("initAndSendInternal", Context.class);
            if (declaredMethod != null) {
                f9015b = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m7327a(Context context) {
        Method method;
        if (context == null || !UMUtils.isMainProgress(context)) {
            return;
        }
        if (SdkVersion.SDK_TYPE == 1) {
            UMConfigureInternation.sendInternal(context);
            return;
        }
        Class<?> cls = f9014a;
        if (cls == null || (method = f9015b) == null) {
            return;
        }
        try {
            method.invoke(cls, context);
        } catch (Throwable unused) {
        }
    }
}
