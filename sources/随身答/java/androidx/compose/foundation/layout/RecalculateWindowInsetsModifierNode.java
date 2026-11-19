package androidx.compose.foundation.layout;

import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.layout.IntrinsicMeasurable;
import androidx.compose.p012ui.layout.IntrinsicMeasureScope;
import androidx.compose.p012ui.layout.LayoutCoordinates;
import androidx.compose.p012ui.layout.LayoutCoordinatesKt;
import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.modifier.ModifierLocalMap;
import androidx.compose.p012ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p012ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p012ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p012ui.node.LayoutModifierNode;
import androidx.compose.p012ui.node.LayoutModifierNodeKt;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntOffsetKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13412d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u001c\u0010#\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020\u001eH\u0016J&\u0010%\u001a\u00020&*\u00020'2\u0006\u0010 \u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u001c\u0010.\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020\u001eH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, m13413d2 = {"Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "()V", "insets", "Landroidx/compose/foundation/layout/ValueInsets;", "getInsets", "()Landroidx/compose/foundation/layout/ValueInsets;", "oldPosition", "Landroidx/compose/ui/unit/IntOffset;", "getOldPosition-nOcc-ac", "()J", "setOldPosition--gyyYBs", "(J)V", "J", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "shouldAutoInvalidate", "", "getShouldAutoInvalidate", "()Z", "onGloballyPositioned", "", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutModifierNode, GlobalPositionAwareModifierNode {
    private final ValueInsets insets;
    private long oldPosition;
    private final ModifierLocalMap providedValues;

    public RecalculateWindowInsetsModifierNode() {
        ValueInsets valueInsets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");
        this.insets = valueInsets;
        this.oldPosition = IntOffset.INSTANCE.m24133getZeronOccac();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.m13420to(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), valueInsets));
    }

    public final ValueInsets getInsets() {
        return this.insets;
    }

    /* renamed from: getOldPosition-nOcc-ac, reason: not valid java name and from getter */
    public final long getOldPosition() {
        return this.oldPosition;
    }

    @Override // androidx.compose.p012ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        return intrinsicMeasurable.maxIntrinsicHeight(i9);
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        return intrinsicMeasurable.maxIntrinsicWidth(i9);
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17449measure3p2s80s(MeasureScope measureScope, final Measurable measurable, long j9) {
        if (Constraints.m23945getHasFixedWidthimpl(j9) && Constraints.m23944getHasFixedHeightimpl(j9)) {
            final int iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
            final int iM23946getMaxHeightimpl = Constraints.m23946getMaxHeightimpl(j9);
            return MeasureScope.layout$default(measureScope, iM23947getMaxWidthimpl, iM23946getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    WindowInsets insets;
                    LayoutCoordinates coordinates = placementScope.getCoordinates();
                    if (coordinates != null) {
                        this.this$0.m18140setOldPositiongyyYBs(IntOffsetKt.m24139roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates)));
                    }
                    if (coordinates == null) {
                        insets = (WindowInsets) this.this$0.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
                    } else {
                        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
                        long jMo22765getSizeYbymL2g = coordinates.mo22765getSizeYbymL2g();
                        long jMo22768localToRootMKHz9U = coordinates.mo22768localToRootMKHz9U(Offset.m21160constructorimpl((Float.floatToRawIntBits((int) (jMo22765getSizeYbymL2g & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jMo22765getSizeYbymL2g >> 32)) << 32)));
                        long jMo22765getSizeYbymL2g2 = LayoutCoordinatesKt.findRootCoordinates(coordinates).mo22765getSizeYbymL2g();
                        int iRound = Math.round(Float.intBitsToFloat((int) (jPositionInRoot >> 32)));
                        int iRound2 = Math.round(Float.intBitsToFloat((int) (jPositionInRoot & 4294967295L)));
                        int iRound3 = ((int) (jMo22765getSizeYbymL2g2 >> 32)) - Math.round(Float.intBitsToFloat((int) (jMo22768localToRootMKHz9U >> 32)));
                        int iRound4 = ((int) (jMo22765getSizeYbymL2g2 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (jMo22768localToRootMKHz9U & 4294967295L)));
                        InsetsValues value$foundation_layout_release = this.this$0.getInsets().getValue$foundation_layout_release();
                        if (value$foundation_layout_release.getLeft() != iRound || value$foundation_layout_release.getTop() != iRound2 || value$foundation_layout_release.getRight() != iRound3 || value$foundation_layout_release.getBottom() != iRound4) {
                            this.this$0.getInsets().setValue$foundation_layout_release(new InsetsValues(iRound, iRound2, iRound3, iRound4));
                        }
                        insets = this.this$0.getInsets();
                    }
                    this.this$0.provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), insets);
                    Placeable.PlacementScope.place$default(placementScope, measurable.mo22757measureBRTryo0(Constraints.INSTANCE.m23957fixedJhjzzOo(iM23947getMaxWidthimpl, iM23946getMaxHeightimpl)), 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets()));
        final Placeable placeableMo22757measureBRTryo0 = measurable.mo22757measureBRTryo0(j9);
        return MeasureScope.layout$default(measureScope, placeableMo22757measureBRTryo0.getWidth(), placeableMo22757measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo22757measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        return intrinsicMeasurable.minIntrinsicHeight(i9);
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        return intrinsicMeasurable.minIntrinsicWidth(i9);
    }

    @Override // androidx.compose.p012ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        long jM24139roundk4lQ0M = IntOffsetKt.m24139roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates));
        boolean zM24121equalsimpl0 = IntOffset.m24121equalsimpl0(this.oldPosition, jM24139roundk4lQ0M);
        this.oldPosition = jM24139roundk4lQ0M;
        if (zM24121equalsimpl0) {
            return;
        }
        LayoutModifierNodeKt.invalidatePlacement(this);
    }

    /* renamed from: setOldPosition--gyyYBs, reason: not valid java name */
    public final void m18140setOldPositiongyyYBs(long j9) {
        this.oldPosition = j9;
    }
}
