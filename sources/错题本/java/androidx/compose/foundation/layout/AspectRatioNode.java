package androidx.compose.foundation.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001e\u0010&\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u001e\u0010,\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010)J\u001e\u0010.\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, m5110d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,242:1\n54#2:243\n59#2:245\n85#3:244\n90#3:246\n80#3:254\n80#3:257\n80#3:260\n80#3:263\n26#4:247\n26#4:248\n26#4:249\n26#4:250\n26#4:252\n26#4:255\n26#4:258\n26#4:261\n1#5:251\n30#6:253\n30#6:256\n30#6:259\n30#6:262\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n*L\n117#1:243\n117#1:245\n117#1:244\n117#1:246\n194#1:254\n207#1:257\n219#1:260\n230#1:263\n130#1:247\n140#1:248\n150#1:249\n160#1:250\n191#1:252\n204#1:255\n216#1:258\n227#1:261\n194#1:253\n207#1:256\n219#1:259\n230#1:262\n*E\n"})
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f, boolean z8) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z8;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m7161findSizeToXhtMw(long j7) {
        if (this.matchHeightConstraintsFirst) {
            long jM7162tryMaxHeightJN0ABg = m7162tryMaxHeightJN0ABg(j7, true);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m13474equalsimpl0(jM7162tryMaxHeightJN0ABg, companion.m13481getZeroYbymL2g())) {
                return jM7162tryMaxHeightJN0ABg;
            }
            long jM7163tryMaxWidthJN0ABg = m7163tryMaxWidthJN0ABg(j7, true);
            if (!IntSize.m13474equalsimpl0(jM7163tryMaxWidthJN0ABg, companion.m13481getZeroYbymL2g())) {
                return jM7163tryMaxWidthJN0ABg;
            }
            long jM7164tryMinHeightJN0ABg = m7164tryMinHeightJN0ABg(j7, true);
            if (!IntSize.m13474equalsimpl0(jM7164tryMinHeightJN0ABg, companion.m13481getZeroYbymL2g())) {
                return jM7164tryMinHeightJN0ABg;
            }
            long jM7165tryMinWidthJN0ABg = m7165tryMinWidthJN0ABg(j7, true);
            if (!IntSize.m13474equalsimpl0(jM7165tryMinWidthJN0ABg, companion.m13481getZeroYbymL2g())) {
                return jM7165tryMinWidthJN0ABg;
            }
            long jM7162tryMaxHeightJN0ABg2 = m7162tryMaxHeightJN0ABg(j7, false);
            if (!IntSize.m13474equalsimpl0(jM7162tryMaxHeightJN0ABg2, companion.m13481getZeroYbymL2g())) {
                return jM7162tryMaxHeightJN0ABg2;
            }
            long jM7163tryMaxWidthJN0ABg2 = m7163tryMaxWidthJN0ABg(j7, false);
            if (!IntSize.m13474equalsimpl0(jM7163tryMaxWidthJN0ABg2, companion.m13481getZeroYbymL2g())) {
                return jM7163tryMaxWidthJN0ABg2;
            }
            long jM7164tryMinHeightJN0ABg2 = m7164tryMinHeightJN0ABg(j7, false);
            if (!IntSize.m13474equalsimpl0(jM7164tryMinHeightJN0ABg2, companion.m13481getZeroYbymL2g())) {
                return jM7164tryMinHeightJN0ABg2;
            }
            long jM7165tryMinWidthJN0ABg2 = m7165tryMinWidthJN0ABg(j7, false);
            if (!IntSize.m13474equalsimpl0(jM7165tryMinWidthJN0ABg2, companion.m13481getZeroYbymL2g())) {
                return jM7165tryMinWidthJN0ABg2;
            }
        } else {
            long jM7163tryMaxWidthJN0ABg3 = m7163tryMaxWidthJN0ABg(j7, true);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m13474equalsimpl0(jM7163tryMaxWidthJN0ABg3, companion2.m13481getZeroYbymL2g())) {
                return jM7163tryMaxWidthJN0ABg3;
            }
            long jM7162tryMaxHeightJN0ABg3 = m7162tryMaxHeightJN0ABg(j7, true);
            if (!IntSize.m13474equalsimpl0(jM7162tryMaxHeightJN0ABg3, companion2.m13481getZeroYbymL2g())) {
                return jM7162tryMaxHeightJN0ABg3;
            }
            long jM7165tryMinWidthJN0ABg3 = m7165tryMinWidthJN0ABg(j7, true);
            if (!IntSize.m13474equalsimpl0(jM7165tryMinWidthJN0ABg3, companion2.m13481getZeroYbymL2g())) {
                return jM7165tryMinWidthJN0ABg3;
            }
            long jM7164tryMinHeightJN0ABg3 = m7164tryMinHeightJN0ABg(j7, true);
            if (!IntSize.m13474equalsimpl0(jM7164tryMinHeightJN0ABg3, companion2.m13481getZeroYbymL2g())) {
                return jM7164tryMinHeightJN0ABg3;
            }
            long jM7163tryMaxWidthJN0ABg4 = m7163tryMaxWidthJN0ABg(j7, false);
            if (!IntSize.m13474equalsimpl0(jM7163tryMaxWidthJN0ABg4, companion2.m13481getZeroYbymL2g())) {
                return jM7163tryMaxWidthJN0ABg4;
            }
            long jM7162tryMaxHeightJN0ABg4 = m7162tryMaxHeightJN0ABg(j7, false);
            if (!IntSize.m13474equalsimpl0(jM7162tryMaxHeightJN0ABg4, companion2.m13481getZeroYbymL2g())) {
                return jM7162tryMaxHeightJN0ABg4;
            }
            long jM7165tryMinWidthJN0ABg4 = m7165tryMinWidthJN0ABg(j7, false);
            if (!IntSize.m13474equalsimpl0(jM7165tryMinWidthJN0ABg4, companion2.m13481getZeroYbymL2g())) {
                return jM7165tryMinWidthJN0ABg4;
            }
            long jM7164tryMinHeightJN0ABg4 = m7164tryMinHeightJN0ABg(j7, false);
            if (!IntSize.m13474equalsimpl0(jM7164tryMinHeightJN0ABg4, companion2.m13481getZeroYbymL2g())) {
                return jM7164tryMinHeightJN0ABg4;
            }
        }
        return IntSize.INSTANCE.m13481getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m7162tryMaxHeightJN0ABg(long j7, boolean z8) {
        int iRound;
        int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
        return (iM13257getMaxHeightimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM13257getMaxHeightimpl) * this.aspectRatio)) <= 0 || (z8 && !AspectRatioKt.m7160isSatisfiedByNN6EwU(j7, iRound, iM13257getMaxHeightimpl))) ? IntSize.INSTANCE.m13481getZeroYbymL2g() : IntSize.m13471constructorimpl((iRound << 32) | (iM13257getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m7163tryMaxWidthJN0ABg(long j7, boolean z8) {
        int iRound;
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        return (iM13258getMaxWidthimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM13258getMaxWidthimpl) / this.aspectRatio)) <= 0 || (z8 && !AspectRatioKt.m7160isSatisfiedByNN6EwU(j7, iM13258getMaxWidthimpl, iRound))) ? IntSize.INSTANCE.m13481getZeroYbymL2g() : IntSize.m13471constructorimpl((iM13258getMaxWidthimpl << 32) | (iRound & 4294967295L));
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m7164tryMinHeightJN0ABg(long j7, boolean z8) {
        int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
        int iRound = Math.round(iM13259getMinHeightimpl * this.aspectRatio);
        return (iRound <= 0 || (z8 && !AspectRatioKt.m7160isSatisfiedByNN6EwU(j7, iRound, iM13259getMinHeightimpl))) ? IntSize.INSTANCE.m13481getZeroYbymL2g() : IntSize.m13471constructorimpl((iRound << 32) | (iM13259getMinHeightimpl & 4294967295L));
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m7165tryMinWidthJN0ABg(long j7, boolean z8) {
        int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
        int iRound = Math.round(iM13260getMinWidthimpl / this.aspectRatio);
        return (iRound <= 0 || (z8 && !AspectRatioKt.m7160isSatisfiedByNN6EwU(j7, iM13260getMinWidthimpl, iRound))) ? IntSize.INSTANCE.m13481getZeroYbymL2g() : IntSize.m13471constructorimpl((iM13260getMinWidthimpl << 32) | (iRound & 4294967295L));
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        long jM7161findSizeToXhtMw = m7161findSizeToXhtMw(j7);
        if (!IntSize.m13474equalsimpl0(jM7161findSizeToXhtMw, IntSize.INSTANCE.m13481getZeroYbymL2g())) {
            j7 = Constraints.INSTANCE.m13268fixedJhjzzOo((int) (jM7161findSizeToXhtMw >> 32), (int) (jM7161findSizeToXhtMw & 4294967295L));
        }
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
        return MeasureScope.layout$default(measureScope, placeableMo12033measureBRTryo0.getWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final void setMatchHeightConstraintsFirst(boolean z8) {
        this.matchHeightConstraintsFirst = z8;
    }
}
