package androidx.compose.p014ui.node;

import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.Measurable;
import java.util.Map;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public interface AlignmentLinesOwner extends Measurable {
    Map<AlignmentLine, Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(InterfaceC9540l interfaceC9540l);

    AlignmentLines getAlignmentLines();

    NodeCoordinator getInnerCoordinator();

    AlignmentLinesOwner getParentAlignmentLinesOwner();

    boolean isPlaced();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
