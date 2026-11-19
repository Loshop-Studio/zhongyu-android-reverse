package androidx.compose.foundation.layout;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.layout.IntrinsicMeasurable;
import androidx.compose.p009ui.layout.IntrinsicMeasureScope;
import androidx.compose.p009ui.layout.Measurable;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.MeasureScope;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.node.LayoutModifierNode;
import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.p009ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001e\u0010&\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u001e\u0010,\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010)J\u001e\u0010.\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, m7880d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,242:1\n54#2:243\n59#2:245\n85#3:244\n90#3:246\n80#3:254\n80#3:257\n80#3:260\n80#3:263\n26#4:247\n26#4:248\n26#4:249\n26#4:250\n26#4:252\n26#4:255\n26#4:258\n26#4:261\n1#5:251\n30#6:253\n30#6:256\n30#6:259\n30#6:262\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n*L\n117#1:243\n117#1:245\n117#1:244\n117#1:246\n194#1:254\n207#1:257\n219#1:260\n230#1:263\n130#1:247\n140#1:248\n150#1:249\n160#1:250\n191#1:252\n204#1:255\n216#1:258\n227#1:261\n194#1:253\n207#1:256\n219#1:259\n230#1:262\n*E\n"})
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f6, boolean z6) {
        this.aspectRatio = f6;
        this.matchHeightConstraintsFirst = z6;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m10503findSizeToXhtMw(long j6) {
        if (this.matchHeightConstraintsFirst) {
            long jM10504tryMaxHeightJN0ABg = m10504tryMaxHeightJN0ABg(j6, true);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m16653equalsimpl0(jM10504tryMaxHeightJN0ABg, companion.m16660getZeroYbymL2g())) {
                return jM10504tryMaxHeightJN0ABg;
            }
            long jM10505tryMaxWidthJN0ABg = m10505tryMaxWidthJN0ABg(j6, true);
            if (!IntSize.m16653equalsimpl0(jM10505tryMaxWidthJN0ABg, companion.m16660getZeroYbymL2g())) {
                return jM10505tryMaxWidthJN0ABg;
            }
            long jM10506tryMinHeightJN0ABg = m10506tryMinHeightJN0ABg(j6, true);
            if (!IntSize.m16653equalsimpl0(jM10506tryMinHeightJN0ABg, companion.m16660getZeroYbymL2g())) {
                return jM10506tryMinHeightJN0ABg;
            }
            long jM10507tryMinWidthJN0ABg = m10507tryMinWidthJN0ABg(j6, true);
            if (!IntSize.m16653equalsimpl0(jM10507tryMinWidthJN0ABg, companion.m16660getZeroYbymL2g())) {
                return jM10507tryMinWidthJN0ABg;
            }
            long jM10504tryMaxHeightJN0ABg2 = m10504tryMaxHeightJN0ABg(j6, false);
            if (!IntSize.m16653equalsimpl0(jM10504tryMaxHeightJN0ABg2, companion.m16660getZeroYbymL2g())) {
                return jM10504tryMaxHeightJN0ABg2;
            }
            long jM10505tryMaxWidthJN0ABg2 = m10505tryMaxWidthJN0ABg(j6, false);
            if (!IntSize.m16653equalsimpl0(jM10505tryMaxWidthJN0ABg2, companion.m16660getZeroYbymL2g())) {
                return jM10505tryMaxWidthJN0ABg2;
            }
            long jM10506tryMinHeightJN0ABg2 = m10506tryMinHeightJN0ABg(j6, false);
            if (!IntSize.m16653equalsimpl0(jM10506tryMinHeightJN0ABg2, companion.m16660getZeroYbymL2g())) {
                return jM10506tryMinHeightJN0ABg2;
            }
            long jM10507tryMinWidthJN0ABg2 = m10507tryMinWidthJN0ABg(j6, false);
            if (!IntSize.m16653equalsimpl0(jM10507tryMinWidthJN0ABg2, companion.m16660getZeroYbymL2g())) {
                return jM10507tryMinWidthJN0ABg2;
            }
        } else {
            long jM10505tryMaxWidthJN0ABg3 = m10505tryMaxWidthJN0ABg(j6, true);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m16653equalsimpl0(jM10505tryMaxWidthJN0ABg3, companion2.m16660getZeroYbymL2g())) {
                return jM10505tryMaxWidthJN0ABg3;
            }
            long jM10504tryMaxHeightJN0ABg3 = m10504tryMaxHeightJN0ABg(j6, true);
            if (!IntSize.m16653equalsimpl0(jM10504tryMaxHeightJN0ABg3, companion2.m16660getZeroYbymL2g())) {
                return jM10504tryMaxHeightJN0ABg3;
            }
            long jM10507tryMinWidthJN0ABg3 = m10507tryMinWidthJN0ABg(j6, true);
            if (!IntSize.m16653equalsimpl0(jM10507tryMinWidthJN0ABg3, companion2.m16660getZeroYbymL2g())) {
                return jM10507tryMinWidthJN0ABg3;
            }
            long jM10506tryMinHeightJN0ABg3 = m10506tryMinHeightJN0ABg(j6, true);
            if (!IntSize.m16653equalsimpl0(jM10506tryMinHeightJN0ABg3, companion2.m16660getZeroYbymL2g())) {
                return jM10506tryMinHeightJN0ABg3;
            }
            long jM10505tryMaxWidthJN0ABg4 = m10505tryMaxWidthJN0ABg(j6, false);
            if (!IntSize.m16653equalsimpl0(jM10505tryMaxWidthJN0ABg4, companion2.m16660getZeroYbymL2g())) {
                return jM10505tryMaxWidthJN0ABg4;
            }
            long jM10504tryMaxHeightJN0ABg4 = m10504tryMaxHeightJN0ABg(j6, false);
            if (!IntSize.m16653equalsimpl0(jM10504tryMaxHeightJN0ABg4, companion2.m16660getZeroYbymL2g())) {
                return jM10504tryMaxHeightJN0ABg4;
            }
            long jM10507tryMinWidthJN0ABg4 = m10507tryMinWidthJN0ABg(j6, false);
            if (!IntSize.m16653equalsimpl0(jM10507tryMinWidthJN0ABg4, companion2.m16660getZeroYbymL2g())) {
                return jM10507tryMinWidthJN0ABg4;
            }
            long jM10506tryMinHeightJN0ABg4 = m10506tryMinHeightJN0ABg(j6, false);
            if (!IntSize.m16653equalsimpl0(jM10506tryMinHeightJN0ABg4, companion2.m16660getZeroYbymL2g())) {
                return jM10506tryMinHeightJN0ABg4;
            }
        }
        return IntSize.INSTANCE.m16660getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m10504tryMaxHeightJN0ABg(long j6, boolean z6) {
        int iRound;
        int iM16436getMaxHeightimpl = Constraints.m16436getMaxHeightimpl(j6);
        return (iM16436getMaxHeightimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM16436getMaxHeightimpl) * this.aspectRatio)) <= 0 || (z6 && !AspectRatioKt.m10502isSatisfiedByNN6EwU(j6, iRound, iM16436getMaxHeightimpl))) ? IntSize.INSTANCE.m16660getZeroYbymL2g() : IntSize.m16650constructorimpl((iRound << 32) | (iM16436getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m10505tryMaxWidthJN0ABg(long j6, boolean z6) {
        int iRound;
        int iM16437getMaxWidthimpl = Constraints.m16437getMaxWidthimpl(j6);
        return (iM16437getMaxWidthimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM16437getMaxWidthimpl) / this.aspectRatio)) <= 0 || (z6 && !AspectRatioKt.m10502isSatisfiedByNN6EwU(j6, iM16437getMaxWidthimpl, iRound))) ? IntSize.INSTANCE.m16660getZeroYbymL2g() : IntSize.m16650constructorimpl((iM16437getMaxWidthimpl << 32) | (iRound & 4294967295L));
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m10506tryMinHeightJN0ABg(long j6, boolean z6) {
        int iM16438getMinHeightimpl = Constraints.m16438getMinHeightimpl(j6);
        int iRound = Math.round(iM16438getMinHeightimpl * this.aspectRatio);
        return (iRound <= 0 || (z6 && !AspectRatioKt.m10502isSatisfiedByNN6EwU(j6, iRound, iM16438getMinHeightimpl))) ? IntSize.INSTANCE.m16660getZeroYbymL2g() : IntSize.m16650constructorimpl((iRound << 32) | (iM16438getMinHeightimpl & 4294967295L));
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m10507tryMinWidthJN0ABg(long j6, boolean z6) {
        int iM16439getMinWidthimpl = Constraints.m16439getMinWidthimpl(j6);
        int iRound = Math.round(iM16439getMinWidthimpl / this.aspectRatio);
        return (iRound <= 0 || (z6 && !AspectRatioKt.m10502isSatisfiedByNN6EwU(j6, iM16439getMinWidthimpl, iRound))) ? IntSize.INSTANCE.m16660getZeroYbymL2g() : IntSize.m16650constructorimpl((iM16439getMinWidthimpl << 32) | (iRound & 4294967295L));
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        return i6 != Integer.MAX_VALUE ? Math.round(i6 / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i6);
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        return i6 != Integer.MAX_VALUE ? Math.round(i6 * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i6);
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9939measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j6) {
        long jM10503findSizeToXhtMw = m10503findSizeToXhtMw(j6);
        if (!IntSize.m16653equalsimpl0(jM10503findSizeToXhtMw, IntSize.INSTANCE.m16660getZeroYbymL2g())) {
            j6 = Constraints.INSTANCE.m16447fixedJhjzzOo((int) (jM10503findSizeToXhtMw >> 32), (int) (jM10503findSizeToXhtMw & 4294967295L));
        }
        final Placeable placeableMo15247measureBRTryo0 = measurable.mo15247measureBRTryo0(j6);
        return MeasureScope.layout$default(measureScope, placeableMo15247measureBRTryo0.getWidth(), placeableMo15247measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
        return i6 != Integer.MAX_VALUE ? Math.round(i6 / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i6);
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        return i6 != Integer.MAX_VALUE ? Math.round(i6 * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i6);
    }

    public final void setAspectRatio(float f6) {
        this.aspectRatio = f6;
    }

    public final void setMatchHeightConstraintsFirst(boolean z6) {
        this.matchHeightConstraintsFirst = z6;
    }
}
