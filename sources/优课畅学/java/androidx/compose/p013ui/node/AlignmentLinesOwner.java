package androidx.compose.p013ui.node;

import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.Measurable;
import java.util.Map;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public interface AlignmentLinesOwner extends Measurable {
    Map<AlignmentLine, Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(InterfaceC10570l interfaceC10570l);

    AlignmentLines getAlignmentLines();

    NodeCoordinator getInnerCoordinator();

    AlignmentLinesOwner getParentAlignmentLinesOwner();

    boolean isPlaced();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
