package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
public interface IntrinsicMeasureScope extends Density {
    LayoutDirection getLayoutDirection();

    default boolean isLookingAhead() {
        return false;
    }
}
