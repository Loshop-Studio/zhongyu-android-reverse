package androidx.compose.foundation.layout;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.layout.IntrinsicMeasurable;
import androidx.compose.p009ui.layout.IntrinsicMeasureScope;
import androidx.compose.p009ui.layout.Measurable;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.MeasureScope;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.node.LayoutModifierNode;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.p009ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010%\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016J&\u0010'\u001a\u00020(*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001c\u0010.\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010/\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u001c8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m7880d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "getMaxHeight-D9Ej5fM", "()F", "setMaxHeight-0680j_4", "(F)V", "F", "getMaxWidth-D9Ej5fM", "setMaxWidth-0680j_4", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1137\n97#2:1139\n97#2:1150\n97#2:1161\n97#2:1163\n97#2:1165\n97#2:1167\n105#3:1136\n105#3:1138\n101#3,10:1140\n101#3,10:1151\n110#3:1162\n105#3:1164\n110#3:1166\n105#3:1168\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n*L\n789#1:1135\n795#1:1137\n801#1:1139\n809#1:1150\n834#1:1161\n840#1:1163\n846#1:1165\n852#1:1167\n790#1:1136\n796#1:1138\n802#1:1140,10\n810#1:1151,10\n837#1:1162\n843#1:1164\n849#1:1166\n855#1:1168\n*E\n"})
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f6, float f7, float f8, float f9, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f6, f7, f8, f9, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m10659getTargetConstraintsOenEA2s(androidx.compose.p009ui.unit.Density r7) {
        /*
            r6 = this;
            float r0 = r6.maxWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.maxWidth
            int r0 = r7.mo10249roundToPx0680j_4(r0)
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
            int r3 = r7.mo10249roundToPx0680j_4(r3)
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
            int r4 = r7.mo10249roundToPx0680j_4(r4)
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
            int r7 = r7.mo10249roundToPx0680j_4(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = androidx.compose.p009ui.unit.ConstraintsKt.Constraints(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.m10659getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxHeight() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        long jM10659getTargetConstraintsOenEA2s = m10659getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m16434getHasFixedHeightimpl(jM10659getTargetConstraintsOenEA2s)) {
            return Constraints.m16436getMaxHeightimpl(jM10659getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i6 = ConstraintsKt.m16454constrainWidthK40F9xA(jM10659getTargetConstraintsOenEA2s, i6);
        }
        return ConstraintsKt.m16453constrainHeightK40F9xA(jM10659getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i6));
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        long jM10659getTargetConstraintsOenEA2s = m10659getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m16435getHasFixedWidthimpl(jM10659getTargetConstraintsOenEA2s)) {
            return Constraints.m16437getMaxWidthimpl(jM10659getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i6 = ConstraintsKt.m16453constrainHeightK40F9xA(jM10659getTargetConstraintsOenEA2s, i6);
        }
        return ConstraintsKt.m16454constrainWidthK40F9xA(jM10659getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i6));
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9939measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j6) {
        int iM16439getMinWidthimpl;
        int iM16437getMaxWidthimpl;
        int iM16438getMinHeightimpl;
        int iM16436getMaxHeightimpl;
        long jConstraints;
        long jM10659getTargetConstraintsOenEA2s = m10659getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m16452constrainN9IONVI(j6, jM10659getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.minWidth)) {
                iM16439getMinWidthimpl = Constraints.m16439getMinWidthimpl(j6);
                int iM16437getMaxWidthimpl2 = Constraints.m16437getMaxWidthimpl(jM10659getTargetConstraintsOenEA2s);
                if (iM16439getMinWidthimpl > iM16437getMaxWidthimpl2) {
                    iM16439getMinWidthimpl = iM16437getMaxWidthimpl2;
                }
            } else {
                iM16439getMinWidthimpl = Constraints.m16439getMinWidthimpl(jM10659getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxWidth)) {
                iM16437getMaxWidthimpl = Constraints.m16437getMaxWidthimpl(j6);
                int iM16439getMinWidthimpl2 = Constraints.m16439getMinWidthimpl(jM10659getTargetConstraintsOenEA2s);
                if (iM16437getMaxWidthimpl < iM16439getMinWidthimpl2) {
                    iM16437getMaxWidthimpl = iM16439getMinWidthimpl2;
                }
            } else {
                iM16437getMaxWidthimpl = Constraints.m16437getMaxWidthimpl(jM10659getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.minHeight)) {
                iM16438getMinHeightimpl = Constraints.m16438getMinHeightimpl(j6);
                int iM16436getMaxHeightimpl2 = Constraints.m16436getMaxHeightimpl(jM10659getTargetConstraintsOenEA2s);
                if (iM16438getMinHeightimpl > iM16436getMaxHeightimpl2) {
                    iM16438getMinHeightimpl = iM16436getMaxHeightimpl2;
                }
            } else {
                iM16438getMinHeightimpl = Constraints.m16438getMinHeightimpl(jM10659getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxHeight)) {
                iM16436getMaxHeightimpl = Constraints.m16436getMaxHeightimpl(j6);
                int iM16438getMinHeightimpl2 = Constraints.m16438getMinHeightimpl(jM10659getTargetConstraintsOenEA2s);
                if (iM16436getMaxHeightimpl < iM16438getMinHeightimpl2) {
                    iM16436getMaxHeightimpl = iM16438getMinHeightimpl2;
                }
            } else {
                iM16436getMaxHeightimpl = Constraints.m16436getMaxHeightimpl(jM10659getTargetConstraintsOenEA2s);
            }
            jConstraints = ConstraintsKt.Constraints(iM16439getMinWidthimpl, iM16437getMaxWidthimpl, iM16438getMinHeightimpl, iM16436getMaxHeightimpl);
        }
        final Placeable placeableMo15247measureBRTryo0 = measurable.mo15247measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measureScope, placeableMo15247measureBRTryo0.getWidth(), placeableMo15247measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo15247measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        long jM10659getTargetConstraintsOenEA2s = m10659getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m16434getHasFixedHeightimpl(jM10659getTargetConstraintsOenEA2s)) {
            return Constraints.m16436getMaxHeightimpl(jM10659getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i6 = ConstraintsKt.m16454constrainWidthK40F9xA(jM10659getTargetConstraintsOenEA2s, i6);
        }
        return ConstraintsKt.m16453constrainHeightK40F9xA(jM10659getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i6));
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        long jM10659getTargetConstraintsOenEA2s = m10659getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m16435getHasFixedWidthimpl(jM10659getTargetConstraintsOenEA2s)) {
            return Constraints.m16437getMaxWidthimpl(jM10659getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i6 = ConstraintsKt.m16453constrainHeightK40F9xA(jM10659getTargetConstraintsOenEA2s, i6);
        }
        return ConstraintsKt.m16454constrainWidthK40F9xA(jM10659getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i6));
    }

    public final void setEnforceIncoming(boolean z6) {
        this.enforceIncoming = z6;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m10664setMaxHeight0680j_4(float f6) {
        this.maxHeight = f6;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m10665setMaxWidth0680j_4(float f6) {
        this.maxWidth = f6;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m10666setMinHeight0680j_4(float f6) {
        this.minHeight = f6;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m10667setMinWidth0680j_4(float f6) {
        this.minWidth = f6;
    }

    public /* synthetic */ SizeNode(float f6, float f7, float f8, float f9, boolean z6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM() : f6, (i6 & 2) != 0 ? C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM() : f7, (i6 & 4) != 0 ? C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM() : f8, (i6 & 8) != 0 ? C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM() : f9, z6, null);
    }

    private SizeNode(float f6, float f7, float f8, float f9, boolean z6) {
        this.minWidth = f6;
        this.minHeight = f7;
        this.maxWidth = f8;
        this.maxHeight = f9;
        this.enforceIncoming = z6;
    }
}
