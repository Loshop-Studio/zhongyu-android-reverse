package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.window.core.Bounds;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WindowMetrics {
    private final Bounds _bounds;

    public WindowMetrics(Bounds _bounds) {
        AbstractC9979u.m20294g(_bounds, "_bounds");
        this._bounds = _bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC9979u.m20289b(WindowMetrics.class, obj.getClass())) {
            return false;
        }
        return AbstractC9979u.m20289b(this._bounds, ((WindowMetrics) obj)._bounds);
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public WindowMetrics(Rect bounds) {
        this(new Bounds(bounds));
        AbstractC9979u.m20294g(bounds, "bounds");
    }
}
