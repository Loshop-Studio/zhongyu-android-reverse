package androidx.compose.p013ui.node;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Ref<T> {
    public static final int $stable = 8;
    private T value;

    public final T getValue() {
        return this.value;
    }

    public final void setValue(T t10) {
        this.value = t10;
    }
}
