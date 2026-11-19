package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f10, float f11, float f12, float f13, boolean z10, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m20911getTargetConstraintsOenEA2s(androidx.compose.p013ui.unit.Density r7) {
        /*
            r6 = this;
            float r0 = r6.maxWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.maxWidth
            int r0 = r7.mo20491roundToPx0680j_4(r0)
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
            int r3 = r7.mo20491roundToPx0680j_4(r3)
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
            int r4 = r7.mo20491roundToPx0680j_4(r4)
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
            int r7 = r7.mo20491roundToPx0680j_4(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = androidx.compose.p013ui.unit.ConstraintsKt.Constraints(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.m20911getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m20912getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m20913getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m20914getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m20915getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM20911getTargetConstraintsOenEA2s = m20911getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m26849getHasFixedHeightimpl(jM20911getTargetConstraintsOenEA2s)) {
            return Constraints.m26851getMaxHeightimpl(jM20911getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m26869constrainWidthK40F9xA(jM20911getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m26868constrainHeightK40F9xA(jM20911getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM20911getTargetConstraintsOenEA2s = m20911getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m26850getHasFixedWidthimpl(jM20911getTargetConstraintsOenEA2s)) {
            return Constraints.m26852getMaxWidthimpl(jM20911getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m26868constrainHeightK40F9xA(jM20911getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m26869constrainWidthK40F9xA(jM20911getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        int iM26854getMinWidthimpl;
        int iM26852getMaxWidthimpl;
        int iM26853getMinHeightimpl;
        int iM26851getMaxHeightimpl;
        long jConstraints;
        long jM20911getTargetConstraintsOenEA2s = m20911getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m26867constrainN9IONVI(j10, jM20911getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.minWidth)) {
                iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
                int iM26852getMaxWidthimpl2 = Constraints.m26852getMaxWidthimpl(jM20911getTargetConstraintsOenEA2s);
                if (iM26854getMinWidthimpl > iM26852getMaxWidthimpl2) {
                    iM26854getMinWidthimpl = iM26852getMaxWidthimpl2;
                }
            } else {
                iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(jM20911getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxWidth)) {
                iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
                int iM26854getMinWidthimpl2 = Constraints.m26854getMinWidthimpl(jM20911getTargetConstraintsOenEA2s);
                if (iM26852getMaxWidthimpl < iM26854getMinWidthimpl2) {
                    iM26852getMaxWidthimpl = iM26854getMinWidthimpl2;
                }
            } else {
                iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(jM20911getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.minHeight)) {
                iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
                int iM26851getMaxHeightimpl2 = Constraints.m26851getMaxHeightimpl(jM20911getTargetConstraintsOenEA2s);
                if (iM26853getMinHeightimpl > iM26851getMaxHeightimpl2) {
                    iM26853getMinHeightimpl = iM26851getMaxHeightimpl2;
                }
            } else {
                iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(jM20911getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxHeight)) {
                iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
                int iM26853getMinHeightimpl2 = Constraints.m26853getMinHeightimpl(jM20911getTargetConstraintsOenEA2s);
                if (iM26851getMaxHeightimpl < iM26853getMinHeightimpl2) {
                    iM26851getMaxHeightimpl = iM26853getMinHeightimpl2;
                }
            } else {
                iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(jM20911getTargetConstraintsOenEA2s);
            }
            jConstraints = ConstraintsKt.Constraints(iM26854getMinWidthimpl, iM26852getMaxWidthimpl, iM26853getMinHeightimpl, iM26851getMaxHeightimpl);
        }
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM20911getTargetConstraintsOenEA2s = m20911getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m26849getHasFixedHeightimpl(jM20911getTargetConstraintsOenEA2s)) {
            return Constraints.m26851getMaxHeightimpl(jM20911getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m26869constrainWidthK40F9xA(jM20911getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m26868constrainHeightK40F9xA(jM20911getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM20911getTargetConstraintsOenEA2s = m20911getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m26850getHasFixedWidthimpl(jM20911getTargetConstraintsOenEA2s)) {
            return Constraints.m26852getMaxWidthimpl(jM20911getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m26868constrainHeightK40F9xA(jM20911getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m26869constrainWidthK40F9xA(jM20911getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i10));
    }

    public final void setEnforceIncoming(boolean z10) {
        this.enforceIncoming = z10;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m20916setMaxHeight0680j_4(float f10) {
        this.maxHeight = f10;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m20917setMaxWidth0680j_4(float f10) {
        this.maxWidth = f10;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m20918setMinHeight0680j_4(float f10) {
        this.minHeight = f10;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m20919setMinWidth0680j_4(float f10) {
        this.minWidth = f10;
    }

    public /* synthetic */ SizeNode(float f10, float f11, float f12, float f13, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f11, (i10 & 4) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f12, (i10 & 8) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f13, z10, null);
    }

    private SizeNode(float f10, float f11, float f12, float f13, boolean z10) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
    }
}
