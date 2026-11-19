package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;

@Stable
/* loaded from: classes.dex */
public final class AndroidWindowInsets implements WindowInsets {
    public static final int $stable = 0;
    private final MutableState insets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Insets.NONE, null, 2, null);
    private final MutableState isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private final String name;
    private final int type;

    public AndroidWindowInsets(int i10, String str) {
        this.type = i10;
        this.name = str;
    }

    private final void setVisible(boolean z10) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidWindowInsets) && this.type == ((AndroidWindowInsets) obj).type;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return getInsets$foundation_layout_release().bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Insets getInsets$foundation_layout_release() {
        return (Insets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return getInsets$foundation_layout_release().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return getInsets$foundation_layout_release().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return getInsets$foundation_layout_release().f28530top;
    }

    public final int getType$foundation_layout_release() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout_release(Insets insets) {
        this.insets$delegate.setValue(insets);
    }

    public String toString() {
        return this.name + '(' + getInsets$foundation_layout_release().left + ", " + getInsets$foundation_layout_release().f28530top + ", " + getInsets$foundation_layout_release().right + ", " + getInsets$foundation_layout_release().bottom + ')';
    }

    public final void update$foundation_layout_release(WindowInsetsCompat windowInsetsCompat, int i10) {
        if (i10 == 0 || (i10 & this.type) != 0) {
            setInsets$foundation_layout_release(windowInsetsCompat.getInsets(this.type));
            setVisible(windowInsetsCompat.isVisible(this.type));
        }
    }
}
