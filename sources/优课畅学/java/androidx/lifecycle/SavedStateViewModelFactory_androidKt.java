package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9117e;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class SavedStateViewModelFactory_androidKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = AbstractC8809v.m14774q(Application.class, SavedStateHandle.class);
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = AbstractC8807u.m14755e(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        AbstractC9133u.m16133g(modelClass, "modelClass");
        AbstractC9133u.m16133g(signature, "signature");
        Iterator itM16110a = AbstractC9117e.m16110a(modelClass.getConstructors());
        while (itM16110a.hasNext()) {
            Constructor<T> constructor = (Constructor) itM16110a.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC9133u.m16132f(parameterTypes, "getParameterTypes(...)");
            List listM14736u1 = AbstractC8801r.m14736u1(parameterTypes);
            if (AbstractC9133u.m16128b(signature, listM14736u1)) {
                AbstractC9133u.m16131e(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listM14736u1.size() && listM14736u1.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        AbstractC9133u.m16133g(modelClass, "modelClass");
        AbstractC9133u.m16133g(constructor, "constructor");
        AbstractC9133u.m16133g(params, "params");
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
