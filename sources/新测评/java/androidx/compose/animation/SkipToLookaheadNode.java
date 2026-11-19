package androidx.compose.animation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.TransformOriginKt;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.layout.ScaleFactor;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001aH\u0016J&\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001c\u0010(\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010)\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001aH\u0016R7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u00020\u0012X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0013R/\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, m13558d2 = {"Landroidx/compose/animation/SkipToLookaheadNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "scaleToBounds", "Landroidx/compose/animation/ScaleToBoundsImpl;", "isEnabled", "Lkotlin/Function0;", "", "(Landroidx/compose/animation/ScaleToBoundsImpl;Lkotlin/jvm/functions/Function0;)V", "<set-?>", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "isEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "lookaheadConstraints", "Landroidx/compose/ui/unit/Constraints;", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "J", "getScaleToBounds", "()Landroidx/compose/animation/ScaleToBoundsImpl;", "setScaleToBounds", "(Landroidx/compose/animation/ScaleToBoundsImpl;)V", "scaleToBounds$delegate", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSkipToLookaheadNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,179:1\n85#2:180\n113#2,2:181\n85#2:183\n113#2,2:184\n30#3:186\n80#4:187\n85#4:189\n90#4:191\n85#4:193\n85#4:195\n90#4:197\n90#4:199\n54#5:188\n59#5:190\n54#5:192\n54#5:194\n59#5:196\n59#5:198\n*S KotlinDebug\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n*L\n44#1:180\n44#1:181,2\n45#1:183\n45#1:184,2\n58#1:186\n58#1:187\n60#1:189\n60#1:191\n100#1:193\n113#1:195\n126#1:197\n139#1:199\n60#1:188\n60#1:190\n100#1:192\n113#1:194\n126#1:196\n139#1:198\n*E\n"})
/* loaded from: classes.dex */
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;

    /* renamed from: isEnabled$delegate, reason: from kotlin metadata */
    private final MutableState isEnabled;
    private Constraints lookaheadConstraints;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();

    /* renamed from: scaleToBounds$delegate, reason: from kotlin metadata */
    private final MutableState scaleToBounds;

    public SkipToLookaheadNode(ScaleToBoundsImpl scaleToBoundsImpl, Function0<Boolean> function0) {
        this.scaleToBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(scaleToBoundsImpl, null, 2, null);
        this.isEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function0, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScaleToBoundsImpl getScaleToBounds() {
        return (ScaleToBoundsImpl) this.scaleToBounds.getValue();
    }

    public final Function0<Boolean> isEnabled() {
        return (Function0) this.isEnabled.getValue();
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m17020isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicHeight(i10) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m17020isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicWidth(i10) : (int) (this.lookaheadSize >> 32);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17016measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        if (measureScope.isLookingAhead()) {
            this.lookaheadConstraints = Constraints.m23501boximpl(j10);
        }
        Constraints constraints = this.lookaheadConstraints;
        Intrinsics.checkNotNull(constraints);
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(constraints.getValue());
        long jM23727constructorimpl = IntSize.m23727constructorimpl((placeableMo22324measureBRTryo0.getWidth() << 32) | (placeableMo22324measureBRTryo0.getHeight() & 4294967295L));
        this.lookaheadSize = jM23727constructorimpl;
        final long jM23528constrain4WqzIAM = ConstraintsKt.m23528constrain4WqzIAM(j10, jM23727constructorimpl);
        return MeasureScope.layout$default(measureScope, (int) (jM23528constrain4WqzIAM >> 32), (int) (jM23528constrain4WqzIAM & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1
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
                final long jM22407constructorimpl;
                ScaleToBoundsImpl scaleToBounds = this.this$0.getScaleToBounds();
                if (!this.this$0.isEnabled().invoke().booleanValue() || scaleToBounds == null) {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo22324measureBRTryo0, 0, 0, 0.0f, 4, null);
                    return;
                }
                ContentScale contentScale = scaleToBounds.getContentScale();
                if (((int) (this.this$0.lookaheadSize >> 32)) == 0 || ((int) (this.this$0.lookaheadSize & 4294967295L)) == 0) {
                    jM22407constructorimpl = ScaleFactor.m22407constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                } else {
                    jM22407constructorimpl = contentScale.mo22317computeScaleFactorH7hwNQA(IntSizeKt.m23744toSizeozmzZPI(this.this$0.lookaheadSize), IntSizeKt.m23744toSizeozmzZPI(jM23528constrain4WqzIAM));
                }
                long jMo20552alignKFBX0sM = scaleToBounds.getAlignment().mo20552alignKFBX0sM(IntSize.m23727constructorimpl((MathKt.roundToInt(((int) (this.this$0.lookaheadSize & 4294967295L)) * Float.intBitsToFloat((int) (jM22407constructorimpl & 4294967295L))) & 4294967295L) | (MathKt.roundToInt(((int) (this.this$0.lookaheadSize >> 32)) * Float.intBitsToFloat((int) (jM22407constructorimpl >> 32))) << 32)), jM23528constrain4WqzIAM, measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo22324measureBRTryo0, IntOffset.m23689getXimpl(jMo20552alignKFBX0sM), IntOffset.m23690getYimpl(jMo20552alignKFBX0sM), 0.0f, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setScaleX(Float.intBitsToFloat((int) (jM22407constructorimpl >> 32)));
                        graphicsLayerScope.setScaleY(Float.intBitsToFloat((int) (jM22407constructorimpl & 4294967295L)));
                        graphicsLayerScope.mo21168setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 0.0f));
                    }
                }, 4, (Object) null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m17020isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicHeight(i10) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m17020isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicWidth(i10) : (int) (this.lookaheadSize >> 32);
    }

    public final void setEnabled(Function0<Boolean> function0) {
        this.isEnabled.setValue(function0);
    }

    public final void setScaleToBounds(ScaleToBoundsImpl scaleToBoundsImpl) {
        this.scaleToBounds.setValue(scaleToBoundsImpl);
    }
}
