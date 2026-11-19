package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class JvmViewModelProviders {
    public static final JvmViewModelProviders INSTANCE = new JvmViewModelProviders();

    private JvmViewModelProviders() {
    }

    public final <T extends ViewModel> T createViewModel(Class<T> modelClass) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        try {
            Constructor<T> declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + modelClass);
            }
            try {
                T tNewInstance = declaredConstructor.newInstance(null);
                AbstractC9979u.m20291d(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            }
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        }
    }
}
