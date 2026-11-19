package androidx.compose.foundation.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.modifier.ModifierLocalMap;
import androidx.compose.p011ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p011ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p011ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNodeKt;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffsetKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u000f\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J#\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J#\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, m5110d2 = {"Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "<init>", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "width", "minIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "height", "minIntrinsicWidth", "maxIntrinsicHeight", "maxIntrinsicWidth", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Ld6/s;", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/foundation/layout/ValueInsets;", "insets", "Landroidx/compose/foundation/layout/ValueInsets;", "getInsets", "()Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/ui/unit/IntOffset;", "oldPosition", "J", "getOldPosition-nOcc-ac", "()J", "setOldPosition--gyyYBs", "(J)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutModifierNode, GlobalPositionAwareModifierNode {

    @NotNull
    private final ValueInsets insets;
    private long oldPosition;

    @NotNull
    private final ModifierLocalMap providedValues;

    public RecalculateWindowInsetsModifierNode() {
        ValueInsets valueInsets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");
        this.insets = valueInsets;
        this.oldPosition = IntOffset.INSTANCE.m13444getZeronOccac();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(new Pair(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), valueInsets));
    }

    @NotNull
    public final ValueInsets getInsets() {
        return this.insets;
    }

    /* renamed from: getOldPosition-nOcc-ac, reason: not valid java name and from getter */
    public final long getOldPosition() {
        return this.oldPosition;
    }

    @Override // androidx.compose.p011ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull final Measurable measurable, long j7) {
        if (Constraints.m13256getHasFixedWidthimpl(j7) && Constraints.m13255getHasFixedHeightimpl(j7)) {
            final int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
            final int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
            return MeasureScope.layout$default(measureScope, iM13258getMaxWidthimpl, iM13257getMaxHeightimpl, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    WindowInsets insets;
                    LayoutCoordinates coordinates = placementScope.getCoordinates();
                    if (coordinates != null) {
                        this.this$0.m7288setOldPositiongyyYBs(IntOffsetKt.m13450roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates)));
                    }
                    if (coordinates == null) {
                        insets = (WindowInsets) this.this$0.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
                    } else {
                        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
                        long jMo12041getSizeYbymL2g = coordinates.mo12041getSizeYbymL2g();
                        long jMo12044localToRootMKHz9U = coordinates.mo12044localToRootMKHz9U(Offset.m10433constructorimpl((Float.floatToRawIntBits((int) (jMo12041getSizeYbymL2g & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jMo12041getSizeYbymL2g >> 32)) << 32)));
                        long jMo12041getSizeYbymL2g2 = LayoutCoordinatesKt.findRootCoordinates(coordinates).mo12041getSizeYbymL2g();
                        int iRound = Math.round(Float.intBitsToFloat((int) (jPositionInRoot >> 32)));
                        int iRound2 = Math.round(Float.intBitsToFloat((int) (jPositionInRoot & 4294967295L)));
                        int iRound3 = ((int) (jMo12041getSizeYbymL2g2 >> 32)) - Math.round(Float.intBitsToFloat((int) (jMo12044localToRootMKHz9U >> 32)));
                        int iRound4 = ((int) (jMo12041getSizeYbymL2g2 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (jMo12044localToRootMKHz9U & 4294967295L)));
                        InsetsValues value$foundation_layout_release = this.this$0.getInsets().getValue$foundation_layout_release();
                        if (value$foundation_layout_release.getLeft() != iRound || value$foundation_layout_release.getTop() != iRound2 || value$foundation_layout_release.getRight() != iRound3 || value$foundation_layout_release.getBottom() != iRound4) {
                            this.this$0.getInsets().setValue$foundation_layout_release(new InsetsValues(iRound, iRound2, iRound3, iRound4));
                        }
                        insets = this.this$0.getInsets();
                    }
                    this.this$0.provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), insets);
                    Placeable.PlacementScope.place$default(placementScope, measurable.mo12033measureBRTryo0(Constraints.INSTANCE.m13268fixedJhjzzOo(iM13258getMaxWidthimpl, iM13257getMaxHeightimpl)), 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets()));
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
        return MeasureScope.layout$default(measureScope, placeableMo12033measureBRTryo0.getWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        long jM13450roundk4lQ0M = IntOffsetKt.m13450roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates));
        boolean zM13432equalsimpl0 = IntOffset.m13432equalsimpl0(this.oldPosition, jM13450roundk4lQ0M);
        this.oldPosition = jM13450roundk4lQ0M;
        if (zM13432equalsimpl0) {
            return;
        }
        LayoutModifierNodeKt.invalidatePlacement(this);
    }

    /* renamed from: setOldPosition--gyyYBs, reason: not valid java name */
    public final void m7288setOldPositiongyyYBs(long j7) {
        this.oldPosition = j7;
    }
}
