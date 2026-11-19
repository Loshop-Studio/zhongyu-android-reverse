package androidx.work;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class InputMergerKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("InputMerger");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"InputMerger\")");
        TAG = strTagWithPrefix;
    }

    public static final InputMerger fromClassName(String className) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            AbstractC9979u.m20292e(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (InputMerger) objNewInstance;
        } catch (Exception e10) {
            Logger.get().error(TAG, "Trouble instantiating " + className, e10);
            return null;
        }
    }
}
