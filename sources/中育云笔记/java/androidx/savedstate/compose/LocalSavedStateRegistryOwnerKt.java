package androidx.savedstate.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;

/* loaded from: classes3.dex */
public final class LocalSavedStateRegistryOwnerKt {
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner;

    static {
        Object objM20054c;
        ProvidableCompositionLocal providableCompositionLocal;
        try {
            Result.C9921a c9921a = Result.f23263d;
            ClassLoader classLoader = SavedStateRegistryOwner.class.getClassLoader();
            AbstractC9979u.m20291d(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            AbstractC9979u.m20293f(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof ProvidableCompositionLocal) {
                        providableCompositionLocal = (ProvidableCompositionLocal) objInvoke;
                    }
                } else if (annotations[i10] instanceof InterfaceC10770a) {
                    break;
                } else {
                    i10++;
                }
            }
            providableCompositionLocal = null;
            objM20054c = Result.m20054c(providableCompositionLocal);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        ProvidableCompositionLocal<SavedStateRegistryOwner> providableCompositionLocalStaticCompositionLocalOf = (ProvidableCompositionLocal) (Result.m20058g(objM20054c) ? null : objM20054c);
        if (providableCompositionLocalStaticCompositionLocalOf == null) {
            providableCompositionLocalStaticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: j.a
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner$lambda$3$lambda$2();
                }
            });
        }
        LocalSavedStateRegistryOwner = providableCompositionLocalStaticCompositionLocalOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateRegistryOwner LocalSavedStateRegistryOwner$lambda$3$lambda$2() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }

    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }
}
