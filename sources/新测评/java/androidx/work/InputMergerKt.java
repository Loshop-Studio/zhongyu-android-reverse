package androidx.work;

import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m13558d2 = {"TAG", "", "fromClassName", "Landroidx/work/InputMerger;", "className", "work-runtime_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class InputMergerKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("InputMerger");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"InputMerger\")");
        TAG = strTagWithPrefix;
    }

    public static final InputMerger fromClassName(String className) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (InputMerger) objNewInstance;
        } catch (Exception e10) {
            Logger.get().error(TAG, "Trouble instantiating " + className, e10);
            return null;
        }
    }
}
