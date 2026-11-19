package androidx.work;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public abstract class InputMergerFactory {
    public abstract InputMerger createInputMerger(String str);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final InputMerger createInputMergerWithDefaultFallback(String className) {
        AbstractC9979u.m20294g(className, "className");
        InputMerger inputMergerCreateInputMerger = createInputMerger(className);
        return inputMergerCreateInputMerger == null ? InputMergerKt.fromClassName(className) : inputMergerCreateInputMerger;
    }
}
