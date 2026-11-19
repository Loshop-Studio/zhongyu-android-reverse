package androidx.compose.p014ui.node;

import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.node.NodeMeasuringIntrinsics;

/* loaded from: classes2.dex */
public interface LayoutModifierNode extends DelegatableNode {
    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo32401measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                return LayoutModifierNode.this.mo26769measure3p2s80s(measureScope, measurable, j10);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo32401measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                return LayoutModifierNode.this.mo26769measure3p2s80s(measureScope, measurable, j10);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    /* renamed from: measure-3p2s80s */
    MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo32401measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                return LayoutModifierNode.this.mo26769measure3p2s80s(measureScope, measurable, j10);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo32401measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                return LayoutModifierNode.this.mo26769measure3p2s80s(measureScope, measurable, j10);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }
}
