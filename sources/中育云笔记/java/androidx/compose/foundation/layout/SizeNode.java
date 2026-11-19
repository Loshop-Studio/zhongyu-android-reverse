package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f10, float f11, float f12, float f13, boolean z10, AbstractC9972n abstractC9972n) {
        this(f10, f11, f12, f13, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m27513getTargetConstraintsOenEA2s(androidx.compose.p014ui.unit.Density r7) {
        /*
            r6 = this;
            float r0 = r6.maxWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.maxWidth
            int r0 = r7.mo27093roundToPx0680j_4(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.maxHeight
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.maxHeight
            int r3 = r7.mo27093roundToPx0680j_4(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.minWidth
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.minWidth
            int r4 = r7.mo27093roundToPx0680j_4(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.minHeight
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.minHeight
            int r7 = r7.mo27093roundToPx0680j_4(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = androidx.compose.p014ui.unit.ConstraintsKt.Constraints(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.m27513getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m27514getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m27515getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m27516getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m27517getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM27513getTargetConstraintsOenEA2s = m27513getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m33451getHasFixedHeightimpl(jM27513getTargetConstraintsOenEA2s)) {
            return Constraints.m33453getMaxHeightimpl(jM27513getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m33471constrainWidthK40F9xA(jM27513getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m33470constrainHeightK40F9xA(jM27513getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM27513getTargetConstraintsOenEA2s = m27513getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m33452getHasFixedWidthimpl(jM27513getTargetConstraintsOenEA2s)) {
            return Constraints.m33454getMaxWidthimpl(jM27513getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m33470constrainHeightK40F9xA(jM27513getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m33471constrainWidthK40F9xA(jM27513getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        int iM33456getMinWidthimpl;
        int iM33454getMaxWidthimpl;
        int iM33455getMinHeightimpl;
        int iM33453getMaxHeightimpl;
        long jConstraints;
        long jM27513getTargetConstraintsOenEA2s = m27513getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m33469constrainN9IONVI(j10, jM27513getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.minWidth)) {
                iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(j10);
                int iM33454getMaxWidthimpl2 = Constraints.m33454getMaxWidthimpl(jM27513getTargetConstraintsOenEA2s);
                if (iM33456getMinWidthimpl > iM33454getMaxWidthimpl2) {
                    iM33456getMinWidthimpl = iM33454getMaxWidthimpl2;
                }
            } else {
                iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(jM27513getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxWidth)) {
                iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
                int iM33456getMinWidthimpl2 = Constraints.m33456getMinWidthimpl(jM27513getTargetConstraintsOenEA2s);
                if (iM33454getMaxWidthimpl < iM33456getMinWidthimpl2) {
                    iM33454getMaxWidthimpl = iM33456getMinWidthimpl2;
                }
            } else {
                iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(jM27513getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.minHeight)) {
                iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
                int iM33453getMaxHeightimpl2 = Constraints.m33453getMaxHeightimpl(jM27513getTargetConstraintsOenEA2s);
                if (iM33455getMinHeightimpl > iM33453getMaxHeightimpl2) {
                    iM33455getMinHeightimpl = iM33453getMaxHeightimpl2;
                }
            } else {
                iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(jM27513getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxHeight)) {
                iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
                int iM33455getMinHeightimpl2 = Constraints.m33455getMinHeightimpl(jM27513getTargetConstraintsOenEA2s);
                if (iM33453getMaxHeightimpl < iM33455getMinHeightimpl2) {
                    iM33453getMaxHeightimpl = iM33455getMinHeightimpl2;
                }
            } else {
                iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(jM27513getTargetConstraintsOenEA2s);
            }
            jConstraints = ConstraintsKt.Constraints(iM33456getMinWidthimpl, iM33454getMaxWidthimpl, iM33455getMinHeightimpl, iM33453getMaxHeightimpl);
        }
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM27513getTargetConstraintsOenEA2s = m27513getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m33451getHasFixedHeightimpl(jM27513getTargetConstraintsOenEA2s)) {
            return Constraints.m33453getMaxHeightimpl(jM27513getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m33471constrainWidthK40F9xA(jM27513getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m33470constrainHeightK40F9xA(jM27513getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM27513getTargetConstraintsOenEA2s = m27513getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m33452getHasFixedWidthimpl(jM27513getTargetConstraintsOenEA2s)) {
            return Constraints.m33454getMaxWidthimpl(jM27513getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m33470constrainHeightK40F9xA(jM27513getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m33471constrainWidthK40F9xA(jM27513getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i10));
    }

    public final void setEnforceIncoming(boolean z10) {
        this.enforceIncoming = z10;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m27518setMaxHeight0680j_4(float f10) {
        this.maxHeight = f10;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m27519setMaxWidth0680j_4(float f10) {
        this.maxWidth = f10;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m27520setMinHeight0680j_4(float f10) {
        this.minHeight = f10;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m27521setMinWidth0680j_4(float f10) {
        this.minWidth = f10;
    }

    public /* synthetic */ SizeNode(float f10, float f11, float f12, float f13, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f11, (i10 & 4) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f12, (i10 & 8) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f13, z10, null);
    }

    private SizeNode(float f10, float f11, float f12, float f13, boolean z10) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
    }
}
