package androidx.compose.foundation.layout;

import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.layout.IntrinsicMeasurable;
import androidx.compose.p012ui.layout.IntrinsicMeasureScope;
import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.node.LayoutModifierNode;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001e\u0010&\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u001e\u0010,\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010)J\u001e\u0010.\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, m13413d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,242:1\n54#2:243\n59#2:245\n85#3:244\n90#3:246\n80#3:254\n80#3:257\n80#3:260\n80#3:263\n26#4:247\n26#4:248\n26#4:249\n26#4:250\n26#4:252\n26#4:255\n26#4:258\n26#4:261\n1#5:251\n30#6:253\n30#6:256\n30#6:259\n30#6:262\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n*L\n117#1:243\n117#1:245\n117#1:244\n117#1:246\n194#1:254\n207#1:257\n219#1:260\n230#1:263\n130#1:247\n140#1:248\n150#1:249\n160#1:250\n191#1:252\n204#1:255\n216#1:258\n227#1:261\n194#1:253\n207#1:256\n219#1:259\n230#1:262\n*E\n"})
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f10, boolean z9) {
        this.aspectRatio = f10;
        this.matchHeightConstraintsFirst = z9;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m18013findSizeToXhtMw(long j9) {
        if (this.matchHeightConstraintsFirst) {
            long jM18014tryMaxHeightJN0ABg = m18014tryMaxHeightJN0ABg(j9, true);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m24163equalsimpl0(jM18014tryMaxHeightJN0ABg, companion.m24170getZeroYbymL2g())) {
                return jM18014tryMaxHeightJN0ABg;
            }
            long jM18015tryMaxWidthJN0ABg = m18015tryMaxWidthJN0ABg(j9, true);
            if (!IntSize.m24163equalsimpl0(jM18015tryMaxWidthJN0ABg, companion.m24170getZeroYbymL2g())) {
                return jM18015tryMaxWidthJN0ABg;
            }
            long jM18016tryMinHeightJN0ABg = m18016tryMinHeightJN0ABg(j9, true);
            if (!IntSize.m24163equalsimpl0(jM18016tryMinHeightJN0ABg, companion.m24170getZeroYbymL2g())) {
                return jM18016tryMinHeightJN0ABg;
            }
            long jM18017tryMinWidthJN0ABg = m18017tryMinWidthJN0ABg(j9, true);
            if (!IntSize.m24163equalsimpl0(jM18017tryMinWidthJN0ABg, companion.m24170getZeroYbymL2g())) {
                return jM18017tryMinWidthJN0ABg;
            }
            long jM18014tryMaxHeightJN0ABg2 = m18014tryMaxHeightJN0ABg(j9, false);
            if (!IntSize.m24163equalsimpl0(jM18014tryMaxHeightJN0ABg2, companion.m24170getZeroYbymL2g())) {
                return jM18014tryMaxHeightJN0ABg2;
            }
            long jM18015tryMaxWidthJN0ABg2 = m18015tryMaxWidthJN0ABg(j9, false);
            if (!IntSize.m24163equalsimpl0(jM18015tryMaxWidthJN0ABg2, companion.m24170getZeroYbymL2g())) {
                return jM18015tryMaxWidthJN0ABg2;
            }
            long jM18016tryMinHeightJN0ABg2 = m18016tryMinHeightJN0ABg(j9, false);
            if (!IntSize.m24163equalsimpl0(jM18016tryMinHeightJN0ABg2, companion.m24170getZeroYbymL2g())) {
                return jM18016tryMinHeightJN0ABg2;
            }
            long jM18017tryMinWidthJN0ABg2 = m18017tryMinWidthJN0ABg(j9, false);
            if (!IntSize.m24163equalsimpl0(jM18017tryMinWidthJN0ABg2, companion.m24170getZeroYbymL2g())) {
                return jM18017tryMinWidthJN0ABg2;
            }
        } else {
            long jM18015tryMaxWidthJN0ABg3 = m18015tryMaxWidthJN0ABg(j9, true);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m24163equalsimpl0(jM18015tryMaxWidthJN0ABg3, companion2.m24170getZeroYbymL2g())) {
                return jM18015tryMaxWidthJN0ABg3;
            }
            long jM18014tryMaxHeightJN0ABg3 = m18014tryMaxHeightJN0ABg(j9, true);
            if (!IntSize.m24163equalsimpl0(jM18014tryMaxHeightJN0ABg3, companion2.m24170getZeroYbymL2g())) {
                return jM18014tryMaxHeightJN0ABg3;
            }
            long jM18017tryMinWidthJN0ABg3 = m18017tryMinWidthJN0ABg(j9, true);
            if (!IntSize.m24163equalsimpl0(jM18017tryMinWidthJN0ABg3, companion2.m24170getZeroYbymL2g())) {
                return jM18017tryMinWidthJN0ABg3;
            }
            long jM18016tryMinHeightJN0ABg3 = m18016tryMinHeightJN0ABg(j9, true);
            if (!IntSize.m24163equalsimpl0(jM18016tryMinHeightJN0ABg3, companion2.m24170getZeroYbymL2g())) {
                return jM18016tryMinHeightJN0ABg3;
            }
            long jM18015tryMaxWidthJN0ABg4 = m18015tryMaxWidthJN0ABg(j9, false);
            if (!IntSize.m24163equalsimpl0(jM18015tryMaxWidthJN0ABg4, companion2.m24170getZeroYbymL2g())) {
                return jM18015tryMaxWidthJN0ABg4;
            }
            long jM18014tryMaxHeightJN0ABg4 = m18014tryMaxHeightJN0ABg(j9, false);
            if (!IntSize.m24163equalsimpl0(jM18014tryMaxHeightJN0ABg4, companion2.m24170getZeroYbymL2g())) {
                return jM18014tryMaxHeightJN0ABg4;
            }
            long jM18017tryMinWidthJN0ABg4 = m18017tryMinWidthJN0ABg(j9, false);
            if (!IntSize.m24163equalsimpl0(jM18017tryMinWidthJN0ABg4, companion2.m24170getZeroYbymL2g())) {
                return jM18017tryMinWidthJN0ABg4;
            }
            long jM18016tryMinHeightJN0ABg4 = m18016tryMinHeightJN0ABg(j9, false);
            if (!IntSize.m24163equalsimpl0(jM18016tryMinHeightJN0ABg4, companion2.m24170getZeroYbymL2g())) {
                return jM18016tryMinHeightJN0ABg4;
            }
        }
        return IntSize.INSTANCE.m24170getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m18014tryMaxHeightJN0ABg(long j9, boolean z9) {
        int iRound;
        int iM23946getMaxHeightimpl = Constraints.m23946getMaxHeightimpl(j9);
        return (iM23946getMaxHeightimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM23946getMaxHeightimpl) * this.aspectRatio)) <= 0 || (z9 && !AspectRatioKt.m18012isSatisfiedByNN6EwU(j9, iRound, iM23946getMaxHeightimpl))) ? IntSize.INSTANCE.m24170getZeroYbymL2g() : IntSize.m24160constructorimpl((iRound << 32) | (iM23946getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m18015tryMaxWidthJN0ABg(long j9, boolean z9) {
        int iRound;
        int iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
        return (iM23947getMaxWidthimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM23947getMaxWidthimpl) / this.aspectRatio)) <= 0 || (z9 && !AspectRatioKt.m18012isSatisfiedByNN6EwU(j9, iM23947getMaxWidthimpl, iRound))) ? IntSize.INSTANCE.m24170getZeroYbymL2g() : IntSize.m24160constructorimpl((iM23947getMaxWidthimpl << 32) | (iRound & 4294967295L));
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m18016tryMinHeightJN0ABg(long j9, boolean z9) {
        int iM23948getMinHeightimpl = Constraints.m23948getMinHeightimpl(j9);
        int iRound = Math.round(iM23948getMinHeightimpl * this.aspectRatio);
        return (iRound <= 0 || (z9 && !AspectRatioKt.m18012isSatisfiedByNN6EwU(j9, iRound, iM23948getMinHeightimpl))) ? IntSize.INSTANCE.m24170getZeroYbymL2g() : IntSize.m24160constructorimpl((iRound << 32) | (iM23948getMinHeightimpl & 4294967295L));
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m18017tryMinWidthJN0ABg(long j9, boolean z9) {
        int iM23949getMinWidthimpl = Constraints.m23949getMinWidthimpl(j9);
        int iRound = Math.round(iM23949getMinWidthimpl / this.aspectRatio);
        return (iRound <= 0 || (z9 && !AspectRatioKt.m18012isSatisfiedByNN6EwU(j9, iM23949getMinWidthimpl, iRound))) ? IntSize.INSTANCE.m24170getZeroYbymL2g() : IntSize.m24160constructorimpl((iM23949getMinWidthimpl << 32) | (iRound & 4294967295L));
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        return i9 != Integer.MAX_VALUE ? Math.round(i9 / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i9);
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        return i9 != Integer.MAX_VALUE ? Math.round(i9 * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i9);
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17449measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j9) {
        long jM18013findSizeToXhtMw = m18013findSizeToXhtMw(j9);
        if (!IntSize.m24163equalsimpl0(jM18013findSizeToXhtMw, IntSize.INSTANCE.m24170getZeroYbymL2g())) {
            j9 = Constraints.INSTANCE.m23957fixedJhjzzOo((int) (jM18013findSizeToXhtMw >> 32), (int) (jM18013findSizeToXhtMw & 4294967295L));
        }
        final Placeable placeableMo22757measureBRTryo0 = measurable.mo22757measureBRTryo0(j9);
        return MeasureScope.layout$default(measureScope, placeableMo22757measureBRTryo0.getWidth(), placeableMo22757measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo22757measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        return i9 != Integer.MAX_VALUE ? Math.round(i9 / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i9);
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        return i9 != Integer.MAX_VALUE ? Math.round(i9 * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i9);
    }

    public final void setAspectRatio(float f10) {
        this.aspectRatio = f10;
    }

    public final void setMatchHeightConstraintsFirst(boolean z9) {
        this.matchHeightConstraintsFirst = z9;
    }
}
