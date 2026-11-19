package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(m13557d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u0016\u0010\u001f\u001a\u00020\nHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u0016\u0010#\u001a\u00020\nHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010!J\t\u0010%\u001a\u00020\u000fHÂ\u0003J\t\u0010&\u001a\u00020\u000fHÂ\u0003J\t\u0010'\u001a\u00020\u0012HÂ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001JD\u0010/\u001a\u00020\u000f2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J$\u00105\u001a\u00020\u000f2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000fJD\u00108\u001a\u00020\u000f2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00109\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010:\u001a\u00020;HÖ\u0001J(\u0010<\u001a\u00020\u000f*\u00020=2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201012\u0006\u0010>\u001a\u00020\u000fH\u0016J(\u0010?\u001a\u00020\u000f*\u00020=2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201012\u0006\u00106\u001a\u00020\u000fH\u0016J\u0012\u0010@\u001a\u00020\u000f*\u0002022\u0006\u0010A\u001a\u00020\u000fJ2\u0010B\u001a\u00020C*\u00020D2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E01012\u0006\u0010F\u001a\u00020GH\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u00020\u000f*\u0002022\u0006\u0010A\u001a\u00020\u000fJ(\u0010K\u001a\u00020\u000f*\u00020=2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201012\u0006\u0010>\u001a\u00020\u000fH\u0016J(\u0010L\u001a\u00020\u000f*\u00020=2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201012\u0006\u00106\u001a\u00020\u000fH\u0016J\u0012\u0010M\u001a\u00020\u000f*\u0002022\u0006\u0010A\u001a\u00020\u000fR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0019R\u0016\u0010\t\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, m13558d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "isHorizontal", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangementSpacing", "maxItemsInMainAxis", "", "maxLines", "overflow", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "F", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "()Z", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "component6-D9Ej5fM", "component7", "component8", "component9", "copy", "copy-QuyCDyQ", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "equals", "other", "", "hashCode", "intrinsicCrossAxisSize", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisAvailable", "crossAxisSpacing", "maxIntrinsicMainAxisSize", "height", "arrangementSpacing", "minIntrinsicMainAxisSize", "crossAxisAvailable", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicWidth", "maxMainAxisIntrinsicItemSize", "size", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minCrossAxisIntrinsicItemSize", "minIntrinsicHeight", "minIntrinsicWidth", "minMainAxisIntrinsicItemSize", "foundation-layout_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n+ 2 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1594:1\n989#2,33:1595\n1022#2,40:1629\n954#2,4:1669\n958#2,11:1677\n969#2:1689\n1107#2,115:1690\n1#3:1628\n70#4,4:1673\n75#4:1688\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n*L\n890#1:1595,33\n890#1:1629,40\n907#1:1669,4\n907#1:1677,11\n907#1:1689\n924#1:1690,115\n890#1:1628\n907#1:1673,4\n907#1:1688\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(boolean z9, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, horizontal, vertical, f10, crossAxisAlignment, f11, i10, i11, flowLayoutOverflowState);
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
    public static /* synthetic */ FlowMeasurePolicy m17626copyQuyCDyQ$default(FlowMeasurePolicy flowMeasurePolicy, boolean z9, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z9 = flowMeasurePolicy.isHorizontal;
        }
        if ((i12 & 2) != 0) {
            horizontal = flowMeasurePolicy.horizontalArrangement;
        }
        if ((i12 & 4) != 0) {
            vertical = flowMeasurePolicy.verticalArrangement;
        }
        if ((i12 & 8) != 0) {
            f10 = flowMeasurePolicy.mainAxisSpacing;
        }
        if ((i12 & 16) != 0) {
            crossAxisAlignment = flowMeasurePolicy.crossAxisAlignment;
        }
        if ((i12 & 32) != 0) {
            f11 = flowMeasurePolicy.crossAxisArrangementSpacing;
        }
        if ((i12 & 64) != 0) {
            i10 = flowMeasurePolicy.maxItemsInMainAxis;
        }
        if ((i12 & 128) != 0) {
            i11 = flowMeasurePolicy.maxLines;
        }
        if ((i12 & 256) != 0) {
            flowLayoutOverflowState = flowMeasurePolicy.overflow;
        }
        int i13 = i11;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        float f12 = f11;
        int i14 = i10;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        Arrangement.Vertical vertical2 = vertical;
        return flowMeasurePolicy.m17627copyQuyCDyQ(z9, horizontal, vertical2, f10, crossAxisAlignment2, f12, i14, i13, flowLayoutOverflowState2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    /* renamed from: component2, reason: from getter */
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* renamed from: component3, reason: from getter */
    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: component5, reason: from getter */
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-QuyCDyQ, reason: not valid java name */
    public final FlowMeasurePolicy m17627copyQuyCDyQ(boolean isHorizontal, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, float mainAxisSpacing, CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        return new FlowMeasurePolicy(isHorizontal, horizontalArrangement, verticalArrangement, mainAxisSpacing, crossAxisAlignment, crossAxisArrangementSpacing, maxItemsInMainAxis, maxLines, overflow, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) other;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && Intrinsics.areEqual(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && C3127Dp.m23566equalsimpl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && Intrinsics.areEqual(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && C3127Dp.m23566equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && Intrinsics.areEqual(this.overflow, flowMeasurePolicy.overflow);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + C3127Dp.m23567hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + C3127Dp.m23567hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        long jM16972constructorimpl;
        int i10 = 0;
        if (measurables.isEmpty()) {
            jM16972constructorimpl = IntIntPair.m16972constructorimpl(0, 0);
        } else {
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, OrientationIndependentConstraints.m17648constructorimpl(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(measurables, 0);
            int iMinCrossAxisIntrinsicItemSize = intrinsicMeasurable != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable, mainAxisAvailable) : 0;
            int iMinMainAxisIntrinsicItemSize = intrinsicMeasurable != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable, iMinCrossAxisIntrinsicItemSize) : 0;
            int i11 = 0;
            if (flowLayoutBuildingBlocks.m17603getWrapInfoOpUlnko(measurables.size() > 1, 0, IntIntPair.m16972constructorimpl(mainAxisAvailable, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m16969boximpl(IntIntPair.m16972constructorimpl(iMinMainAxisIntrinsicItemSize, iMinCrossAxisIntrinsicItemSize)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
                IntIntPair intIntPairM17608ellipsisSizeF35zmw$foundation_layout_release = overflow.m17608ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
                jM16972constructorimpl = IntIntPair.m16972constructorimpl(intIntPairM17608ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m16977getSecondimpl(intIntPairM17608ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
            } else {
                int size = measurables.size();
                int i12 = mainAxisAvailable;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (i13 >= size) {
                        break;
                    }
                    int i18 = i12 - iMinMainAxisIntrinsicItemSize;
                    int i19 = i13 + 1;
                    int iMax = Math.max(i17, iMinCrossAxisIntrinsicItemSize);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(measurables, i19);
                    int iMinCrossAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable2, mainAxisAvailable) : i10;
                    int iMinMainAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable2, iMinCrossAxisIntrinsicItemSize2) + mainAxisSpacing : i10;
                    boolean z9 = i13 + 2 < measurables.size();
                    int i20 = i19 - i15;
                    int i21 = i16;
                    int i22 = iMinMainAxisIntrinsicItemSize2;
                    int i23 = iMinCrossAxisIntrinsicItemSize2;
                    FlowLayoutBuildingBlocks.WrapInfo wrapInfoM17603getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m17603getWrapInfoOpUlnko(z9, i20, IntIntPair.m16972constructorimpl(i18, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m16969boximpl(IntIntPair.m16972constructorimpl(iMinMainAxisIntrinsicItemSize2, iMinCrossAxisIntrinsicItemSize2)), i21, i11, iMax, false, false);
                    if (wrapInfoM17603getWrapInfoOpUlnko.getIsLastItemInLine()) {
                        int iM16977getSecondimpl = i11 + iMax + crossAxisSpacing;
                        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM17603getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i21, iM16977getSecondimpl, i18, i20);
                        int i24 = i22 - mainAxisSpacing;
                        i16 = i21 + 1;
                        if (wrapInfoM17603getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                            if (wrapEllipsisInfo != null) {
                                long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                                if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                                    iM16977getSecondimpl += IntIntPair.m16977getSecondimpl(ellipsisSize) + crossAxisSpacing;
                                }
                            }
                            i11 = iM16977getSecondimpl;
                            i14 = i19;
                        } else {
                            i11 = iM16977getSecondimpl;
                            iMinMainAxisIntrinsicItemSize = i24;
                            i15 = i19;
                            i17 = 0;
                            i12 = mainAxisAvailable;
                        }
                    } else {
                        i12 = i18;
                        i16 = i21;
                        i17 = iMax;
                        iMinMainAxisIntrinsicItemSize = i22;
                    }
                    iMinCrossAxisIntrinsicItemSize = i23;
                    i13 = i19;
                    i14 = i13;
                    i10 = 0;
                }
                jM16972constructorimpl = IntIntPair.m16972constructorimpl(i11 - crossAxisSpacing, i14);
            }
        }
        return IntIntPair.m16976getFirstimpl(jM16972constructorimpl);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m17610setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return intrinsicCrossAxisSize(listEmptyList, i10, intrinsicMeasureScope.mo17326roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo17326roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return maxIntrinsicMainAxisSize(listEmptyList2, i10, intrinsicMeasureScope.mo17326roundToPx0680j_4(this.mainAxisSpacing));
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int height, int arrangementSpacing) {
        int i10 = this.maxItemsInMainAxis;
        int size = measurables.size();
        int i11 = 0;
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int iMaxMainAxisIntrinsicItemSize = maxMainAxisIntrinsicItemSize(measurables.get(i11), height) + arrangementSpacing;
            int i14 = i11 + 1;
            if (i14 - i12 == i10 || i14 == measurables.size()) {
                iMax = Math.max(iMax, (i13 + iMaxMainAxisIntrinsicItemSize) - arrangementSpacing);
                i13 = 0;
                i12 = i11;
            } else {
                i13 += iMaxMainAxisIntrinsicItemSize;
            }
            i11 = i14;
        }
        return iMax;
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m17610setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return maxIntrinsicMainAxisSize(listEmptyList, i10, intrinsicMeasureScope.mo17326roundToPx0680j_4(this.mainAxisSpacing));
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return intrinsicCrossAxisSize(listEmptyList2, i10, intrinsicMeasureScope.mo17326roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo17326roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int maxMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return isHorizontal() ? intrinsicMeasurable.maxIntrinsicWidth(i10) : intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo17628measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j10) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (Constraints.m23513getMaxHeightimpl(j10) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        List list2 = (List) CollectionsKt.first((List) list);
        if (list2.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        List list3 = (List) CollectionsKt.getOrNull(list, 1);
        Measurable measurable = list3 != null ? (Measurable) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.getOrNull(list, 2);
        Measurable measurable2 = list4 != null ? (Measurable) CollectionsKt.firstOrNull(list4) : null;
        this.overflow.setItemCount$foundation_layout_release(list2.size());
        this.overflow.m17609setOverflowMeasurableshBUhpc$foundation_layout_release(this, measurable, measurable2, j10);
        return FlowLayoutKt.m17605breakDownItemsdi9J0FM(measureScope, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m17650constructorimpl(j10, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minCrossAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicHeight(i10) : intrinsicMeasurable.minIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m17610setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return intrinsicCrossAxisSize(listEmptyList, i10, intrinsicMeasureScope.mo17326roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo17326roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return minIntrinsicMainAxisSize(listEmptyList2, i10, intrinsicMeasureScope.mo17326roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo17326roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        int i10 = maxItemsInMainAxis;
        int i11 = maxLines;
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int[] iArr = new int[size];
        int size2 = measurables.size();
        int[] iArr2 = new int[size2];
        int size3 = measurables.size();
        for (int i12 = 0; i12 < size3; i12++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i12);
            int iMinMainAxisIntrinsicItemSize = minMainAxisIntrinsicItemSize(intrinsicMeasurable, crossAxisAvailable);
            iArr[i12] = iMinMainAxisIntrinsicItemSize;
            iArr2[i12] = minCrossAxisIntrinsicItemSize(intrinsicMeasurable, iMinMainAxisIntrinsicItemSize);
        }
        List<? extends IntrinsicMeasurable> list = measurables;
        int i13 = Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
            i13 = i10 * i11;
        }
        int iMin = Math.min(i13 - (((i13 >= list.size() || !(overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i13 < list.size() || i11 < overflow.getMinLinesToShowCollapse$foundation_layout_release() || overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int iSum = ArraysKt.sum(iArr) + ((list.size() - 1) * mainAxisSpacing);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i14 = iArr2[0];
        ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
        while (it.hasNext()) {
            int i15 = iArr2[it.nextInt()];
            if (i14 < i15) {
                i14 = i15;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i16 = iArr[0];
        ?? it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
        while (it2.hasNext()) {
            int i17 = iArr[it2.nextInt()];
            if (i16 < i17) {
                i16 = i17;
            }
        }
        int i18 = i16;
        int i19 = iSum;
        while (i18 <= i19 && i14 != crossAxisAvailable) {
            int i20 = (i18 + i19) / 2;
            long jIntrinsicCrossAxisSize = FlowLayoutKt.intrinsicCrossAxisSize(list, iArr, iArr2, i20, mainAxisSpacing, crossAxisSpacing, i10, i11, overflow);
            int iM16976getFirstimpl = IntIntPair.m16976getFirstimpl(jIntrinsicCrossAxisSize);
            int iM16977getSecondimpl = IntIntPair.m16977getSecondimpl(jIntrinsicCrossAxisSize);
            if (iM16976getFirstimpl > crossAxisAvailable || iM16977getSecondimpl < iMin) {
                i18 = i20 + 1;
                if (i18 > i19) {
                    return i18;
                }
            } else {
                if (iM16976getFirstimpl >= crossAxisAvailable) {
                    return i20;
                }
                i19 = i20 - 1;
            }
            list = measurables;
            i10 = maxItemsInMainAxis;
            i11 = maxLines;
            iSum = i20;
            i14 = iM16976getFirstimpl;
        }
        return iSum;
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m17610setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return minIntrinsicMainAxisSize(listEmptyList, i10, intrinsicMeasureScope.mo17326roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo17326roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return intrinsicCrossAxisSize(listEmptyList2, i10, intrinsicMeasureScope.mo17326roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo17326roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicWidth(i10) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) C3127Dp.m23572toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) C3127Dp.m23572toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    private FlowMeasurePolicy(boolean z9, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z9;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f10;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f11;
        this.maxItemsInMainAxis = i10;
        this.maxLines = i11;
        this.overflow = flowLayoutOverflowState;
    }
}
