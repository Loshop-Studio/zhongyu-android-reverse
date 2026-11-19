package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.unit.Density;

@MeasureScopeMarker
/* loaded from: classes2.dex */
public interface RulerScope extends Density {
    LayoutCoordinates getCoordinates();

    void provides(Ruler ruler, float f10);

    void providesRelative(VerticalRuler verticalRuler, float f10);
}
