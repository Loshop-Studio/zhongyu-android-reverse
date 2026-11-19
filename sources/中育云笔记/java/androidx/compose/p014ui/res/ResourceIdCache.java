package androidx.compose.p014ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ResourceIdCache {
    public static final int $stable = 8;
    private final MutableIntObjectMap<TypedValue> resIdPathMap = new MutableIntObjectMap<>(0, 1, null);

    public final void clear() {
        synchronized (this) {
            this.resIdPathMap.clear();
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public final TypedValue resolveResourcePath(Resources resources, @DrawableRes int i10) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = this.resIdPathMap.get(i10);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                this.resIdPathMap.put(i10, typedValue);
            }
        }
        return typedValue;
    }
}
