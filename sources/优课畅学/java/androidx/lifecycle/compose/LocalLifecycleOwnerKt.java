package androidx.lifecycle.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class LocalLifecycleOwnerKt {
    private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner;

    static {
        Object objM15909b;
        ProvidableCompositionLocal providableCompositionLocal;
        try {
            Result.C9076a c9076a = Result.f17350b;
            ClassLoader classLoader = LifecycleOwner.class.getClassLoader();
            AbstractC9133u.m16130d(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof ProvidableCompositionLocal) {
                        providableCompositionLocal = (ProvidableCompositionLocal) objInvoke;
                    }
                } else if (annotations[i10] instanceof InterfaceC8721a) {
                    break;
                } else {
                    i10++;
                }
            }
            providableCompositionLocal = null;
            objM15909b = Result.m15909b(providableCompositionLocal);
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        ProvidableCompositionLocal<LifecycleOwner> providableCompositionLocalStaticCompositionLocalOf = (ProvidableCompositionLocal) (Result.m15913g(objM15909b) ? null : objM15909b);
        if (providableCompositionLocalStaticCompositionLocalOf == null) {
            providableCompositionLocalStaticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC10559a() { // from class: androidx.lifecycle.compose.u
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return LocalLifecycleOwnerKt.LocalLifecycleOwner$lambda$3$lambda$2();
                }
            });
        }
        LocalLifecycleOwner = providableCompositionLocalStaticCompositionLocalOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleOwner LocalLifecycleOwner$lambda$3$lambda$2() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }
}
