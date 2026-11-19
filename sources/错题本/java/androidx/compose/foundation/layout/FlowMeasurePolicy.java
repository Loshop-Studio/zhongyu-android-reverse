package androidx.compose.foundation.layout;

import androidx.collection.AbstractC0584a;
import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p200x6.C6755e;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u001e\u001a\u00020\u001b*\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J/\u0010%\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010#J/\u0010&\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010#J/\u0010'\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010#JK\u0010*\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J+\u0010-\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.JK\u00100\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b0\u0010+J\u0019\u00102\u001a\u00020\u000e*\u00020 2\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000e*\u00020 2\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b4\u00103J\u0019\u00105\u001a\u00020\u000e*\u00020 2\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b5\u00103J\u0010\u00106\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u0010=Jm\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IJ\u0016\u0010L\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u0016\u0010N\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010KJ\u0010\u0010O\u001a\u00020\u000eHÂ\u0003¢\u0006\u0004\bO\u0010EJ\u0010\u0010P\u001a\u00020\u000eHÂ\u0003¢\u0006\u0004\bP\u0010EJ\u0010\u0010Q\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\bQ\u0010RR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\b\u0004\u00107R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010T\u001a\u0004\bU\u00109R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010;R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010XR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010Y\u001a\u0004\bZ\u0010=R\u001a\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010[R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010[R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "", "isHorizontal", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflow", "<init>", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "maxIntrinsicWidth", "crossAxisAvailable", "crossAxisSpacing", "minIntrinsicMainAxisSize", "(Ljava/util/List;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)I", "arrangementSpacing", "maxIntrinsicMainAxisSize", "(Ljava/util/List;II)I", "mainAxisAvailable", "intrinsicCrossAxisSize", "size", "maxMainAxisIntrinsicItemSize", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minCrossAxisIntrinsicItemSize", "minMainAxisIntrinsicItemSize", "component1", "()Z", "component2", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "component3", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component5", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "copy-QuyCDyQ", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component4-D9Ej5fM", "()F", "component4", "component6-D9Ej5fM", "component6", "component7", "component8", "component9", "()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "Z", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "F", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "I", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n+ 2 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1594:1\n989#2,33:1595\n1022#2,40:1629\n954#2,4:1669\n958#2,11:1677\n969#2:1689\n1107#2,115:1690\n1#3:1628\n70#4,4:1673\n75#4:1688\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n*L\n890#1:1595,33\n890#1:1629,40\n907#1:1669,4\n907#1:1677,11\n907#1:1689\n924#1:1690,115\n890#1:1628\n907#1:1673,4\n907#1:1688\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {

    @NotNull
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;

    @NotNull
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;

    @NotNull
    private final FlowLayoutOverflowState overflow;

    @NotNull
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(boolean z8, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f7, int i, int i8, FlowLayoutOverflowState flowLayoutOverflowState, AbstractC5824e abstractC5824e) {
        this(z8, horizontal, vertical, f, crossAxisAlignment, f7, i, i8, flowLayoutOverflowState);
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    private final float getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    private final float getCrossAxisArrangementSpacing() {
        return this.crossAxisArrangementSpacing;
    }

    /* renamed from: component7, reason: from getter */
    private final int getMaxItemsInMainAxis() {
        return this.maxItemsInMainAxis;
    }

    /* renamed from: component8, reason: from getter */
    private final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component9, reason: from getter */
    private final FlowLayoutOverflowState getOverflow() {
        return this.overflow;
    }

    /* renamed from: copy-QuyCDyQ$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasurePolicy m7207copyQuyCDyQ$default(FlowMeasurePolicy flowMeasurePolicy, boolean z8, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f7, int i, int i8, FlowLayoutOverflowState flowLayoutOverflowState, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = flowMeasurePolicy.isHorizontal;
        }
        if ((i9 & 2) != 0) {
            horizontal = flowMeasurePolicy.horizontalArrangement;
        }
        if ((i9 & 4) != 0) {
            vertical = flowMeasurePolicy.verticalArrangement;
        }
        if ((i9 & 8) != 0) {
            f = flowMeasurePolicy.mainAxisSpacing;
        }
        if ((i9 & 16) != 0) {
            crossAxisAlignment = flowMeasurePolicy.crossAxisAlignment;
        }
        if ((i9 & 32) != 0) {
            f7 = flowMeasurePolicy.crossAxisArrangementSpacing;
        }
        if ((i9 & 64) != 0) {
            i = flowMeasurePolicy.maxItemsInMainAxis;
        }
        if ((i9 & 128) != 0) {
            i8 = flowMeasurePolicy.maxLines;
        }
        if ((i9 & 256) != 0) {
            flowLayoutOverflowState = flowMeasurePolicy.overflow;
        }
        int i10 = i8;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        float f8 = f7;
        int i11 = i;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        Arrangement.Vertical vertical2 = vertical;
        return flowMeasurePolicy.m7208copyQuyCDyQ(z8, horizontal, vertical2, f, crossAxisAlignment2, f8, i11, i10, flowLayoutOverflowState2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @NotNull
    /* renamed from: copy-QuyCDyQ, reason: not valid java name */
    public final FlowMeasurePolicy m7208copyQuyCDyQ(boolean isHorizontal, @NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Arrangement.Vertical verticalArrangement, float mainAxisSpacing, @NotNull CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflow) {
        return new FlowMeasurePolicy(isHorizontal, horizontalArrangement, verticalArrangement, mainAxisSpacing, crossAxisAlignment, crossAxisArrangementSpacing, maxItemsInMainAxis, maxLines, overflow, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) other;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && AbstractC5830k.m5325b(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && AbstractC5830k.m5325b(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && C2331Dp.m13310equalsimpl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && AbstractC5830k.m5325b(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && C2331Dp.m13310equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && AbstractC5830k.m5325b(this.overflow, flowMeasurePolicy.overflow);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @NotNull
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @NotNull
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @NotNull
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return this.overflow.hashCode() + AbstractC0584a.m902c(this.maxLines, AbstractC0584a.m902c(this.maxItemsInMainAxis, AbstractC0584a.m896A(this.crossAxisArrangementSpacing, (this.crossAxisAlignment.hashCode() + AbstractC0584a.m896A(this.mainAxisSpacing, (this.verticalArrangement.hashCode() + ((this.horizontalArrangement.hashCode() + (Boolean.hashCode(this.isHorizontal) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    public final int intrinsicCrossAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflow) {
        long jM6529constructorimpl;
        int i = 0;
        if (measurables.isEmpty()) {
            jM6529constructorimpl = IntIntPair.m6529constructorimpl(0, 0);
        } else {
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, OrientationIndependentConstraints.m7229constructorimpl(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC5805t.m5230j0(0, measurables);
            int iMinCrossAxisIntrinsicItemSize = intrinsicMeasurable != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable, mainAxisAvailable) : 0;
            int iMinMainAxisIntrinsicItemSize = intrinsicMeasurable != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable, iMinCrossAxisIntrinsicItemSize) : 0;
            int i8 = 0;
            if (flowLayoutBuildingBlocks.m7184getWrapInfoOpUlnko(measurables.size() > 1, 0, IntIntPair.m6529constructorimpl(mainAxisAvailable, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m6526boximpl(IntIntPair.m6529constructorimpl(iMinMainAxisIntrinsicItemSize, iMinCrossAxisIntrinsicItemSize)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
                IntIntPair intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release = overflow.m7189ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
                jM6529constructorimpl = IntIntPair.m6529constructorimpl(intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m6534getSecondimpl(intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
            } else {
                int size = measurables.size();
                int i9 = mainAxisAvailable;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    int i15 = i9 - iMinMainAxisIntrinsicItemSize;
                    int i16 = i10 + 1;
                    int iMax = Math.max(i14, iMinCrossAxisIntrinsicItemSize);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC5805t.m5230j0(i16, measurables);
                    int iMinCrossAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable2, mainAxisAvailable) : i;
                    int iMinMainAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable2, iMinCrossAxisIntrinsicItemSize2) + mainAxisSpacing : i;
                    boolean z8 = i10 + 2 < measurables.size();
                    int i17 = i16 - i12;
                    int i18 = i13;
                    int i19 = iMinMainAxisIntrinsicItemSize2;
                    int i20 = iMinCrossAxisIntrinsicItemSize2;
                    FlowLayoutBuildingBlocks.WrapInfo wrapInfoM7184getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m7184getWrapInfoOpUlnko(z8, i17, IntIntPair.m6529constructorimpl(i15, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m6526boximpl(IntIntPair.m6529constructorimpl(iMinMainAxisIntrinsicItemSize2, iMinCrossAxisIntrinsicItemSize2)), i18, i8, iMax, false, false);
                    if (wrapInfoM7184getWrapInfoOpUlnko.getIsLastItemInLine()) {
                        int iM6534getSecondimpl = iMax + crossAxisSpacing + i8;
                        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM7184getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i18, iM6534getSecondimpl, i15, i17);
                        int i21 = i19 - mainAxisSpacing;
                        i13 = i18 + 1;
                        if (wrapInfoM7184getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                            if (wrapEllipsisInfo != null) {
                                long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                                if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                                    iM6534getSecondimpl += IntIntPair.m6534getSecondimpl(ellipsisSize) + crossAxisSpacing;
                                }
                            }
                            i8 = iM6534getSecondimpl;
                            i11 = i16;
                        } else {
                            i8 = iM6534getSecondimpl;
                            iMinMainAxisIntrinsicItemSize = i21;
                            i12 = i16;
                            i14 = 0;
                            i9 = mainAxisAvailable;
                        }
                    } else {
                        i9 = i15;
                        i13 = i18;
                        i14 = iMax;
                        iMinMainAxisIntrinsicItemSize = i19;
                    }
                    iMinCrossAxisIntrinsicItemSize = i20;
                    i10 = i16;
                    i11 = i10;
                    i = 0;
                }
                jM6529constructorimpl = IntIntPair.m6529constructorimpl(i8 - crossAxisSpacing, i11);
            }
        }
        return IntIntPair.m6533getFirstimpl(jM6529constructorimpl);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) AbstractC5805t.m5230j0(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) AbstractC5805t.m5229i0(list2) : null;
        List list3 = (List) AbstractC5805t.m5230j0(2, list);
        flowLayoutOverflowState.m7191setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) AbstractC5805t.m5229i0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> list4 = (List) AbstractC5805t.m5229i0(list);
            if (list4 == null) {
                list4 = EmptyList.INSTANCE;
            }
            return intrinsicCrossAxisSize(list4, i, intrinsicMeasureScope.mo6897roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo6897roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> list5 = (List) AbstractC5805t.m5229i0(list);
        if (list5 == null) {
            list5 = EmptyList.INSTANCE;
        }
        return maxIntrinsicMainAxisSize(list5, i, intrinsicMeasureScope.mo6897roundToPx0680j_4(this.mainAxisSpacing));
    }

    public final int maxIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int height, int arrangementSpacing) {
        int i = this.maxItemsInMainAxis;
        int size = measurables.size();
        int i8 = 0;
        int iMax = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < size) {
            int iMaxMainAxisIntrinsicItemSize = maxMainAxisIntrinsicItemSize(measurables.get(i8), height) + arrangementSpacing;
            int i11 = i8 + 1;
            if (i11 - i9 == i || i11 == measurables.size()) {
                iMax = Math.max(iMax, (i10 + iMaxMainAxisIntrinsicItemSize) - arrangementSpacing);
                i10 = 0;
                i9 = i8;
            } else {
                i10 += iMaxMainAxisIntrinsicItemSize;
            }
            i8 = i11;
        }
        return iMax;
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) AbstractC5805t.m5230j0(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) AbstractC5805t.m5229i0(list2) : null;
        List list3 = (List) AbstractC5805t.m5230j0(2, list);
        flowLayoutOverflowState.m7191setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) AbstractC5805t.m5229i0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> list4 = (List) AbstractC5805t.m5229i0(list);
            if (list4 == null) {
                list4 = EmptyList.INSTANCE;
            }
            return maxIntrinsicMainAxisSize(list4, i, intrinsicMeasureScope.mo6897roundToPx0680j_4(this.mainAxisSpacing));
        }
        List<? extends IntrinsicMeasurable> list5 = (List) AbstractC5805t.m5229i0(list);
        if (list5 == null) {
            list5 = EmptyList.INSTANCE;
        }
        return intrinsicCrossAxisSize(list5, i, intrinsicMeasureScope.mo6897roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo6897roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int maxMainAxisIntrinsicItemSize(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return isHorizontal() ? intrinsicMeasurable.maxIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo7209measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends List<? extends Measurable>> list, long j7) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (Constraints.m13257getMaxHeightimpl(j7) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }
            }, 4, null);
        }
        List list2 = (List) AbstractC5805t.m5228h0(list);
        if (list2.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$2
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }
            }, 4, null);
        }
        List list3 = (List) AbstractC5805t.m5230j0(1, list);
        Measurable measurable = list3 != null ? (Measurable) AbstractC5805t.m5229i0(list3) : null;
        List list4 = (List) AbstractC5805t.m5230j0(2, list);
        Measurable measurable2 = list4 != null ? (Measurable) AbstractC5805t.m5229i0(list4) : null;
        this.overflow.setItemCount$foundation_layout_release(list2.size());
        this.overflow.m7190setOverflowMeasurableshBUhpc$foundation_layout_release(this, measurable, measurable2, j7);
        return FlowLayoutKt.m7186breakDownItemsdi9J0FM(measureScope, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m7231constructorimpl(j7, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minCrossAxisIntrinsicItemSize(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) AbstractC5805t.m5230j0(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) AbstractC5805t.m5229i0(list2) : null;
        List list3 = (List) AbstractC5805t.m5230j0(2, list);
        flowLayoutOverflowState.m7191setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) AbstractC5805t.m5229i0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> list4 = (List) AbstractC5805t.m5229i0(list);
            if (list4 == null) {
                list4 = EmptyList.INSTANCE;
            }
            return intrinsicCrossAxisSize(list4, i, intrinsicMeasureScope.mo6897roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo6897roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> list5 = (List) AbstractC5805t.m5229i0(list);
        if (list5 == null) {
            list5 = EmptyList.INSTANCE;
        }
        return minIntrinsicMainAxisSize(list5, i, intrinsicMeasureScope.mo6897roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo6897roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflow) {
        int i = maxItemsInMainAxis;
        int i8 = maxLines;
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int[] iArr = new int[size];
        int size2 = measurables.size();
        int[] iArr2 = new int[size2];
        int size3 = measurables.size();
        for (int i9 = 0; i9 < size3; i9++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i9);
            int iMinMainAxisIntrinsicItemSize = minMainAxisIntrinsicItemSize(intrinsicMeasurable, crossAxisAvailable);
            iArr[i9] = iMinMainAxisIntrinsicItemSize;
            iArr2[i9] = minCrossAxisIntrinsicItemSize(intrinsicMeasurable, iMinMainAxisIntrinsicItemSize);
        }
        List<? extends IntrinsicMeasurable> list = measurables;
        int i10 = Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE && i != Integer.MAX_VALUE) {
            i10 = i * i8;
        }
        int iMin = Math.min(i10 - (((i10 >= list.size() || !(overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i10 < list.size() || i8 < overflow.getMinLinesToShowCollapse$foundation_layout_release() || overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += iArr[i12];
        }
        int size4 = ((list.size() - 1) * mainAxisSpacing) + i11;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iM6533getFirstimpl = iArr2[0];
        C6755e it = new C6756f(1, size2 - 1, 1).iterator();
        while (it.f11425c) {
            int i13 = iArr2[it.nextInt()];
            if (iM6533getFirstimpl < i13) {
                iM6533getFirstimpl = i13;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i14 = iArr[0];
        C6755e it2 = new C6756f(1, size - 1, 1).iterator();
        while (it2.f11425c) {
            int i15 = iArr[it2.nextInt()];
            if (i14 < i15) {
                i14 = i15;
            }
        }
        int i16 = i14;
        int i17 = size4;
        while (i16 <= i17 && iM6533getFirstimpl != crossAxisAvailable) {
            int i18 = (i16 + i17) / 2;
            long jIntrinsicCrossAxisSize = FlowLayoutKt.intrinsicCrossAxisSize(list, iArr, iArr2, i18, mainAxisSpacing, crossAxisSpacing, i, i8, overflow);
            iM6533getFirstimpl = IntIntPair.m6533getFirstimpl(jIntrinsicCrossAxisSize);
            int iM6534getSecondimpl = IntIntPair.m6534getSecondimpl(jIntrinsicCrossAxisSize);
            if (iM6533getFirstimpl > crossAxisAvailable || iM6534getSecondimpl < iMin) {
                i16 = i18 + 1;
                if (i16 > i17) {
                    return i16;
                }
            } else {
                if (iM6533getFirstimpl >= crossAxisAvailable) {
                    return i18;
                }
                i17 = i18 - 1;
            }
            list = measurables;
            i = maxItemsInMainAxis;
            i8 = maxLines;
            size4 = i18;
        }
        return size4;
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) AbstractC5805t.m5230j0(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) AbstractC5805t.m5229i0(list2) : null;
        List list3 = (List) AbstractC5805t.m5230j0(2, list);
        flowLayoutOverflowState.m7191setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) AbstractC5805t.m5229i0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> list4 = (List) AbstractC5805t.m5229i0(list);
            if (list4 == null) {
                list4 = EmptyList.INSTANCE;
            }
            return minIntrinsicMainAxisSize(list4, i, intrinsicMeasureScope.mo6897roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo6897roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> list5 = (List) AbstractC5805t.m5229i0(list);
        if (list5 == null) {
            list5 = EmptyList.INSTANCE;
        }
        return intrinsicCrossAxisSize(list5, i, intrinsicMeasureScope.mo6897roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo6897roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minMainAxisIntrinsicItemSize(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=");
        sb.append(this.isHorizontal);
        sb.append(", horizontalArrangement=");
        sb.append(this.horizontalArrangement);
        sb.append(", verticalArrangement=");
        sb.append(this.verticalArrangement);
        sb.append(", mainAxisSpacing=");
        AbstractC0584a.m922w(sb, ", crossAxisAlignment=", this.mainAxisSpacing);
        sb.append(this.crossAxisAlignment);
        sb.append(", crossAxisArrangementSpacing=");
        AbstractC0584a.m922w(sb, ", maxItemsInMainAxis=", this.crossAxisArrangementSpacing);
        sb.append(this.maxItemsInMainAxis);
        sb.append(", maxLines=");
        sb.append(this.maxLines);
        sb.append(", overflow=");
        sb.append(this.overflow);
        sb.append(')');
        return sb.toString();
    }

    private FlowMeasurePolicy(boolean z8, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f7, int i, int i8, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z8;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f7;
        this.maxItemsInMainAxis = i;
        this.maxLines = i8;
        this.overflow = flowLayoutOverflowState;
    }
}
