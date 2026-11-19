package androidx.compose.p014ui.input.pointer;

import android.view.PointerIcon;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidPointerIcon implements PointerIcon {
    public static final int $stable = 0;
    private final PointerIcon pointerIcon;

    public AndroidPointerIcon(PointerIcon pointerIcon) {
        this.pointerIcon = pointerIcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC9979u.m20289b(AndroidPointerIcon.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return AbstractC9979u.m20289b(this.pointerIcon, ((AndroidPointerIcon) obj).pointerIcon);
    }

    public final PointerIcon getPointerIcon() {
        return this.pointerIcon;
    }

    public int hashCode() {
        return this.pointerIcon.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.pointerIcon + ')';
    }
}
