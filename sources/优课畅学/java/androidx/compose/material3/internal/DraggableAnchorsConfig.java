package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final Map<T, Float> anchors = new LinkedHashMap();

    /* renamed from: at */
    public final void m931at(T t10, float f10) {
        this.anchors.put(t10, Float.valueOf(f10));
    }

    public final Map<T, Float> getAnchors$material3_release() {
        return this.anchors;
    }
}
