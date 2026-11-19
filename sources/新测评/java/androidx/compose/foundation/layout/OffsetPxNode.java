package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNodeKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B&\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ'\u0010\u0015\u001a\u00020\u00162\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\u0006\u0010\b\u001a\u00020\tJ&\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR+\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m13558d2 = {"Landroidx/compose/foundation/layout/OffsetPxNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "rtlAware", "", "(Lkotlin/jvm/functions/Function1;Z)V", "getOffset", "()Lkotlin/jvm/functions/Function1;", "setOffset", "(Lkotlin/jvm/functions/Function1;)V", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "update", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class OffsetPxNode extends Modifier.Node implements LayoutModifierNode {
    private Function1<? super Density, IntOffset> offset;
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;

    public OffsetPxNode(Function1<? super Density, IntOffset> function1, boolean z9) {
        this.offset = function1;
        this.rtlAware = z9;
    }

    public final Function1<Density, IntOffset> getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17016measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo22324measureBRTryo0.getWidth(), placeableMo22324measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.OffsetPxNode$measure$1
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
                long jM23698unboximpl = this.this$0.getOffset().invoke(measureScope).m23698unboximpl();
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeableMo22324measureBRTryo0, IntOffset.m23689getXimpl(jM23698unboximpl), IntOffset.m23690getYimpl(jM23698unboximpl), 0.0f, (Function1) null, 12, (Object) null);
                } else {
                    Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo22324measureBRTryo0, IntOffset.m23689getXimpl(jM23698unboximpl), IntOffset.m23690getYimpl(jM23698unboximpl), 0.0f, (Function1) null, 12, (Object) null);
                }
            }
        }, 4, null);
    }

    public final void setOffset(Function1<? super Density, IntOffset> function1) {
        this.offset = function1;
    }

    public final void setRtlAware(boolean z9) {
        this.rtlAware = z9;
    }

    public final void update(Function1<? super Density, IntOffset> offset, boolean rtlAware) {
        if (this.offset != offset || this.rtlAware != rtlAware) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.offset = offset;
        this.rtlAware = rtlAware;
    }
}
