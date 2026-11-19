package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
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
