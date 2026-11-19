package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
public interface IntrinsicMeasureScope extends Density {
    LayoutDirection getLayoutDirection();

    default boolean isLookingAhead() {
        return false;
    }
}
