package androidx.compose.p014ui.layout;

import java.util.Map;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public interface MeasureResult {
    Map<AlignmentLine, Integer> getAlignmentLines();

    int getHeight();

    default InterfaceC9540l getRulers() {
        return null;
    }

    int getWidth();

    void placeChildren();
}
