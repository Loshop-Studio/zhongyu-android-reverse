package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import java.util.List;

/* loaded from: classes2.dex */
public interface LayoutInfo {
    LayoutCoordinates getCoordinates();

    Density getDensity();

    int getHeight();

    LayoutDirection getLayoutDirection();

    List<ModifierInfo> getModifierInfo();

    LayoutInfo getParentInfo();

    int getSemanticsId();

    ViewConfiguration getViewConfiguration();

    int getWidth();

    boolean isAttached();

    default boolean isDeactivated() {
        return false;
    }

    boolean isPlaced();
}
