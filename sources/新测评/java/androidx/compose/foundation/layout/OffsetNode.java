package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNodeKt;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m13558d2 = {"Landroidx/compose/foundation/layout/OffsetNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "x", "Landroidx/compose/ui/unit/Dp;", "y", "rtlAware", "", "(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "getX-D9Ej5fM", "()F", "setX-0680j_4", "(F)V", "F", "getY-D9Ej5fM", "setY-0680j_4", "update", "", "update-Md-fbLM", "(FFZ)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;
    private float x;
    private float y;

    public /* synthetic */ OffsetNode(float f10, float f11, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z9);
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name and from getter */
    public final float getY() {
        return this.y;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17016measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo22324measureBRTryo0.getWidth(), placeableMo22324measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.OffsetNode$measure$1
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
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo22324measureBRTryo0, measureScope.mo17326roundToPx0680j_4(this.this$0.getX()), measureScope.mo17326roundToPx0680j_4(this.this$0.getY()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo22324measureBRTryo0, measureScope.mo17326roundToPx0680j_4(this.this$0.getX()), measureScope.mo17326roundToPx0680j_4(this.this$0.getY()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public final void setRtlAware(boolean z9) {
        this.rtlAware = z9;
    }

    /* renamed from: setX-0680j_4, reason: not valid java name */
    public final void m17644setX0680j_4(float f10) {
        this.x = f10;
    }

    /* renamed from: setY-0680j_4, reason: not valid java name */
    public final void m17645setY0680j_4(float f10) {
        this.y = f10;
    }

    /* renamed from: update-Md-fbLM, reason: not valid java name */
    public final void m17646updateMdfbLM(float x9, float y9, boolean rtlAware) {
        if (!C3127Dp.m23566equalsimpl0(this.x, x9) || !C3127Dp.m23566equalsimpl0(this.y, y9) || this.rtlAware != rtlAware) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.x = x9;
        this.y = y9;
        this.rtlAware = rtlAware;
    }

    private OffsetNode(float f10, float f11, boolean z9) {
        this.x = f10;
        this.y = f11;
        this.rtlAware = z9;
    }
}
