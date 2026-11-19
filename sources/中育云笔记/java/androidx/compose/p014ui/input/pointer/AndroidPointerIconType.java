package androidx.compose.p014ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidPointerIconType implements PointerIcon {
    public static final int $stable = 0;
    private final int type;

    public AndroidPointerIconType(int i10) {
        this.type = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC9979u.m20289b(AndroidPointerIconType.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.type == ((AndroidPointerIconType) obj).type;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.type + ')';
    }
}
