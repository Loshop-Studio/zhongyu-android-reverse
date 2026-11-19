package androidx.compose.animation;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.TransformOriginKt;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.ScaleFactor;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0012\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J#\u0010\u001b\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J#\u0010\u001c\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018R/\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b\u0007\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m5110d2 = {"Landroidx/compose/animation/SkipToLookaheadNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "scaleToBounds", "Lkotlin/Function0;", "", "isEnabled", "<init>", "(Landroidx/compose/animation/ScaleToBoundsImpl;Lr6/a;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "maxIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntrinsicWidth", "width", "maxIntrinsicHeight", "minIntrinsicHeight", "<set-?>", "scaleToBounds$delegate", "Landroidx/compose/runtime/MutableState;", "getScaleToBounds", "()Landroidx/compose/animation/ScaleToBoundsImpl;", "setScaleToBounds", "(Landroidx/compose/animation/ScaleToBoundsImpl;)V", "isEnabled$delegate", "()Lr6/a;", "setEnabled", "(Lr6/a;)V", "lookaheadConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "J", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSkipToLookaheadNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,179:1\n85#2:180\n113#2,2:181\n85#2:183\n113#2,2:184\n30#3:186\n80#4:187\n85#4:189\n90#4:191\n85#4:193\n85#4:195\n90#4:197\n90#4:199\n54#5:188\n59#5:190\n54#5:192\n54#5:194\n59#5:196\n59#5:198\n*S KotlinDebug\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n*L\n44#1:180\n44#1:181,2\n45#1:183\n45#1:184,2\n58#1:186\n58#1:187\n60#1:189\n60#1:191\n100#1:193\n113#1:195\n126#1:197\n139#1:199\n60#1:188\n60#1:190\n100#1:192\n113#1:194\n126#1:196\n139#1:198\n*E\n"})
/* loaded from: classes.dex */
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;

    /* renamed from: isEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isEnabled;

    @Nullable
    private Constraints lookaheadConstraints;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();

    /* renamed from: scaleToBounds$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState scaleToBounds;

    public SkipToLookaheadNode(@Nullable ScaleToBoundsImpl scaleToBoundsImpl, @NotNull InterfaceC6469a interfaceC6469a) {
        this.scaleToBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(scaleToBoundsImpl, null, 2, null);
        this.isEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC6469a, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ScaleToBoundsImpl getScaleToBounds() {
        return (ScaleToBoundsImpl) this.scaleToBounds.getValue();
    }

    @NotNull
    public final InterfaceC6469a isEnabled() {
        return (InterfaceC6469a) this.isEnabled.getValue();
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m6577isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicHeight(i) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m6577isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicWidth(i) : (int) (this.lookaheadSize >> 32);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        if (measureScope.isLookingAhead()) {
            this.lookaheadConstraints = Constraints.m13245boximpl(j7);
        }
        Constraints constraints = this.lookaheadConstraints;
        AbstractC5830k.m5327d(constraints);
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(constraints.getValue());
        long jM13471constructorimpl = IntSize.m13471constructorimpl((placeableMo12033measureBRTryo0.getWidth() << 32) | (placeableMo12033measureBRTryo0.getHeight() & 4294967295L));
        this.lookaheadSize = jM13471constructorimpl;
        final long jM13272constrain4WqzIAM = ConstraintsKt.m13272constrain4WqzIAM(j7, jM13471constructorimpl);
        return MeasureScope.layout$default(measureScope, (int) (jM13272constrain4WqzIAM >> 32), (int) (jM13272constrain4WqzIAM & 4294967295L), null, new InterfaceC6471c() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1
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
                final long jM12116constructorimpl;
                ScaleToBoundsImpl scaleToBounds = this.this$0.getScaleToBounds();
                if (!((Boolean) this.this$0.isEnabled().invoke()).booleanValue() || scaleToBounds == null) {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
                    return;
                }
                ContentScale contentScale = scaleToBounds.getContentScale();
                if (((int) (this.this$0.lookaheadSize >> 32)) == 0 || ((int) (this.this$0.lookaheadSize & 4294967295L)) == 0) {
                    jM12116constructorimpl = ScaleFactor.m12116constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                } else {
                    jM12116constructorimpl = contentScale.mo12026computeScaleFactorH7hwNQA(IntSizeKt.m13488toSizeozmzZPI(this.this$0.lookaheadSize), IntSizeKt.m13488toSizeozmzZPI(jM13272constrain4WqzIAM));
                }
                long jMo10250alignKFBX0sM = scaleToBounds.getAlignment().mo10250alignKFBX0sM(IntSize.m13471constructorimpl((AbstractC6600a.m6241q(Float.intBitsToFloat((int) (jM12116constructorimpl & 4294967295L)) * ((int) (this.this$0.lookaheadSize & 4294967295L))) & 4294967295L) | (AbstractC6600a.m6241q(Float.intBitsToFloat((int) (jM12116constructorimpl >> 32)) * ((int) (this.this$0.lookaheadSize >> 32))) << 32)), jM13272constrain4WqzIAM, measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo12033measureBRTryo0, IntOffset.m13433getXimpl(jMo10250alignKFBX0sM), IntOffset.m13434getYimpl(jMo10250alignKFBX0sM), 0.0f, new InterfaceC6471c() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((GraphicsLayerScope) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setScaleX(Float.intBitsToFloat((int) (jM12116constructorimpl >> 32)));
                        graphicsLayerScope.setScaleY(Float.intBitsToFloat((int) (jM12116constructorimpl & 4294967295L)));
                        graphicsLayerScope.mo10874setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 0.0f));
                    }
                }, 4, (Object) null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m6577isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicHeight(i) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m6577isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicWidth(i) : (int) (this.lookaheadSize >> 32);
    }

    public final void setEnabled(@NotNull InterfaceC6469a interfaceC6469a) {
        this.isEnabled.setValue(interfaceC6469a);
    }

    public final void setScaleToBounds(@Nullable ScaleToBoundsImpl scaleToBoundsImpl) {
        this.scaleToBounds.setValue(scaleToBoundsImpl);
    }
}
