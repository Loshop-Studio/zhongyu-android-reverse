package androidx.compose.p013ui.layout;

import java.util.Map;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public interface MeasureResult {
    Map<AlignmentLine, Integer> getAlignmentLines();

    int getHeight();

    default InterfaceC10570l getRulers() {
        return null;
    }

    int getWidth();

    void placeChildren();
}
