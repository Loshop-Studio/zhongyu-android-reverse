package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;

@Stable
/* loaded from: classes.dex */
public final class ValueInsets implements WindowInsets {
    public static final int $stable = 0;
    private final String name;
    private final MutableState value$delegate;

    public ValueInsets(InsetsValues insetsValues, String str) {
        this.name = str;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insetsValues, null, 2, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueInsets) {
            return AbstractC9979u.m20289b(getValue$foundation_layout_release(), ((ValueInsets) obj).getValue$foundation_layout_release());
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return getValue$foundation_layout_release().getBottom();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return getValue$foundation_layout_release().getLeft();
    }

    public final String getName() {
        return this.name;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return getValue$foundation_layout_release().getRight();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return getValue$foundation_layout_release().getTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InsetsValues getValue$foundation_layout_release() {
        return (InsetsValues) this.value$delegate.getValue();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setValue$foundation_layout_release(InsetsValues insetsValues) {
        this.value$delegate.setValue(insetsValues);
    }

    public String toString() {
        return this.name + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + ')';
    }
}
