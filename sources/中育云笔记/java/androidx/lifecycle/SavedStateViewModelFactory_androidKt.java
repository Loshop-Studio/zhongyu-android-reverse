package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class SavedStateViewModelFactory_androidKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = AbstractC10978w.m24139q(Application.class, SavedStateHandle.class);
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = AbstractC10976v.m24126e(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        AbstractC9979u.m20294g(signature, "signature");
        Iterator itM20268a = AbstractC9963e.m20268a(modelClass.getConstructors());
        while (itM20268a.hasNext()) {
            Constructor<T> constructor = (Constructor) itM20268a.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC9979u.m20293f(parameterTypes, "getParameterTypes(...)");
            List listM24097p1 = AbstractC10968r.m24097p1(parameterTypes);
            if (AbstractC9979u.m20289b(signature, listM24097p1)) {
                AbstractC9979u.m20292e(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listM24097p1.size() && listM24097p1.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        AbstractC9979u.m20294g(constructor, "constructor");
        AbstractC9979u.m20294g(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
