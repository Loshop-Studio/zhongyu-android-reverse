package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010%\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016J&\u0010'\u001a\u00020(*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001c\u0010.\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010/\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u001c8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m13558d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "getMaxHeight-D9Ej5fM", "()F", "setMaxHeight-0680j_4", "(F)V", "F", "getMaxWidth-D9Ej5fM", "setMaxWidth-0680j_4", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1137\n97#2:1139\n97#2:1150\n97#2:1161\n97#2:1163\n97#2:1165\n97#2:1167\n105#3:1136\n105#3:1138\n101#3,10:1140\n101#3,10:1151\n110#3:1162\n105#3:1164\n110#3:1166\n105#3:1168\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n*L\n789#1:1135\n795#1:1137\n801#1:1139\n809#1:1150\n834#1:1161\n840#1:1163\n846#1:1165\n852#1:1167\n790#1:1136\n796#1:1138\n802#1:1140,10\n810#1:1151,10\n837#1:1162\n843#1:1164\n849#1:1166\n855#1:1168\n*E\n"})
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f10, float f11, float f12, float f13, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m17736getTargetConstraintsOenEA2s(androidx.compose.p013ui.unit.Density r7) {
        /*
            r6 = this;
            float r0 = r6.maxWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.maxWidth
            int r0 = r7.mo17326roundToPx0680j_4(r0)
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
            int r3 = r7.mo17326roundToPx0680j_4(r3)
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
            int r4 = r7.mo17326roundToPx0680j_4(r4)
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
            int r7 = r7.mo17326roundToPx0680j_4(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.m17736getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
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

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM17736getTargetConstraintsOenEA2s = m17736getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m23511getHasFixedHeightimpl(jM17736getTargetConstraintsOenEA2s)) {
            return Constraints.m23513getMaxHeightimpl(jM17736getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m23531constrainWidthK40F9xA(jM17736getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m23530constrainHeightK40F9xA(jM17736getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM17736getTargetConstraintsOenEA2s = m17736getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m23512getHasFixedWidthimpl(jM17736getTargetConstraintsOenEA2s)) {
            return Constraints.m23514getMaxWidthimpl(jM17736getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m23530constrainHeightK40F9xA(jM17736getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m23531constrainWidthK40F9xA(jM17736getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17016measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        int iM23516getMinWidthimpl;
        int iM23514getMaxWidthimpl;
        int iM23515getMinHeightimpl;
        int iM23513getMaxHeightimpl;
        long jConstraints;
        long jM17736getTargetConstraintsOenEA2s = m17736getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m23529constrainN9IONVI(j10, jM17736getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.minWidth)) {
                iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(j10);
                int iM23514getMaxWidthimpl2 = Constraints.m23514getMaxWidthimpl(jM17736getTargetConstraintsOenEA2s);
                if (iM23516getMinWidthimpl > iM23514getMaxWidthimpl2) {
                    iM23516getMinWidthimpl = iM23514getMaxWidthimpl2;
                }
            } else {
                iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(jM17736getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxWidth)) {
                iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
                int iM23516getMinWidthimpl2 = Constraints.m23516getMinWidthimpl(jM17736getTargetConstraintsOenEA2s);
                if (iM23514getMaxWidthimpl < iM23516getMinWidthimpl2) {
                    iM23514getMaxWidthimpl = iM23516getMinWidthimpl2;
                }
            } else {
                iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(jM17736getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.minHeight)) {
                iM23515getMinHeightimpl = Constraints.m23515getMinHeightimpl(j10);
                int iM23513getMaxHeightimpl2 = Constraints.m23513getMaxHeightimpl(jM17736getTargetConstraintsOenEA2s);
                if (iM23515getMinHeightimpl > iM23513getMaxHeightimpl2) {
                    iM23515getMinHeightimpl = iM23513getMaxHeightimpl2;
                }
            } else {
                iM23515getMinHeightimpl = Constraints.m23515getMinHeightimpl(jM17736getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxHeight)) {
                iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(j10);
                int iM23515getMinHeightimpl2 = Constraints.m23515getMinHeightimpl(jM17736getTargetConstraintsOenEA2s);
                if (iM23513getMaxHeightimpl < iM23515getMinHeightimpl2) {
                    iM23513getMaxHeightimpl = iM23515getMinHeightimpl2;
                }
            } else {
                iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(jM17736getTargetConstraintsOenEA2s);
            }
            jConstraints = ConstraintsKt.Constraints(iM23516getMinWidthimpl, iM23514getMaxWidthimpl, iM23515getMinHeightimpl, iM23513getMaxHeightimpl);
        }
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measureScope, placeableMo22324measureBRTryo0.getWidth(), placeableMo22324measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo22324measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM17736getTargetConstraintsOenEA2s = m17736getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m23511getHasFixedHeightimpl(jM17736getTargetConstraintsOenEA2s)) {
            return Constraints.m23513getMaxHeightimpl(jM17736getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m23531constrainWidthK40F9xA(jM17736getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m23530constrainHeightK40F9xA(jM17736getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        long jM17736getTargetConstraintsOenEA2s = m17736getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m23512getHasFixedWidthimpl(jM17736getTargetConstraintsOenEA2s)) {
            return Constraints.m23514getMaxWidthimpl(jM17736getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i10 = ConstraintsKt.m23530constrainHeightK40F9xA(jM17736getTargetConstraintsOenEA2s, i10);
        }
        return ConstraintsKt.m23531constrainWidthK40F9xA(jM17736getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i10));
    }

    public final void setEnforceIncoming(boolean z9) {
        this.enforceIncoming = z9;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m17741setMaxHeight0680j_4(float f10) {
        this.maxHeight = f10;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m17742setMaxWidth0680j_4(float f10) {
        this.maxWidth = f10;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m17743setMinHeight0680j_4(float f10) {
        this.minHeight = f10;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m17744setMinWidth0680j_4(float f10) {
        this.minWidth = f10;
    }

    public /* synthetic */ SizeNode(float f10, float f11, float f12, float f13, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM() : f11, (i10 & 4) != 0 ? C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM() : f12, (i10 & 8) != 0 ? C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM() : f13, z9, null);
    }

    private SizeNode(float f10, float f11, float f12, float f13, boolean z9) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z9;
    }
}
