package androidx.compose.foundation.layout;

import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0017J2\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0006H\u0002J(\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0002J3\u00106\u001a\u0002072\u0006\u00104\u001a\u0002052\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J&\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\bJ\n\u0010\r\u001a\u00020\u0006*\u00020\u0016J\n\u0010C\u001a\u00020\u0006*\u00020\u0016R5\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, m5175d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "arrangement", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArrangement", "()Lkotlin/jvm/functions/Function5;", "getArrangementSpacing-D9Ej5fM", "()F", "F", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "getMeasurables", "()Ljava/util/List;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "[Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "[Landroidx/compose/foundation/layout/RowColumnParentData;", "getCrossAxisPosition", "placeable", "parentData", "crossAxisLayoutSize", "layoutDirection", "beforeCrossAxisAlignmentLine", "mainAxisPositions", "mainAxisLayoutSize", "childrenMainAxisSize", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measureWithoutPlacing", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "startIndex", "endIndex", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "placeHelper", "placeableScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "measureResult", "crossAxisOffset", "mainAxisSize", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
/* loaded from: classes.dex */
public final class RowColumnMeasurementHelper {
    private final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> arrangement;
    private final float arrangementSpacing;
    private final CrossAxisAlignment crossAxisAlignment;
    private final SizeMode crossAxisSize;
    private final List<Measurable> measurables;
    private final LayoutOrientation orientation;
    private final Placeable[] placeables;
    private final RowColumnParentData[] rowColumnParentData;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Function5 function5, float f4, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, function5, f4, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData parentData, int crossAxisLayoutSize, LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
        CrossAxisAlignment crossAxisAlignment;
        if (parentData == null || (crossAxisAlignment = parentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int iCrossAxisSize = crossAxisLayoutSize - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(iCrossAxisSize, layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    private final int[] mainAxisPositions(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, MeasureScope measureScope) {
        this.arrangement.invoke(Integer.valueOf(mainAxisLayoutSize), childrenMainAxisSize, measureScope.getLayoutDirection(), measureScope, mainAxisPositions);
        return mainAxisPositions;
    }

    public final int crossAxisSize(Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    public final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> getArrangement() {
        return this.arrangement;
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    /* renamed from: measureWithoutPlacing-_EkL_-Y, reason: not valid java name */
    public final RowColumnMeasureHelperResult m7339measureWithoutPlacing_EkL_Y(MeasureScope measureScope, long constraints, int startIndex, int endIndex) {
        int i4;
        int iMax;
        int iCoerceAtMost;
        float f4;
        int i5;
        int iMax2;
        int i6;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(constraints, this.orientation, null);
        int iMo7200roundToPx0680j_4 = measureScope.mo7200roundToPx0680j_4(this.arrangementSpacing);
        int i10 = endIndex - startIndex;
        float f5 = 0.0f;
        int i11 = startIndex;
        float f6 = 0.0f;
        int i12 = 0;
        int iMax3 = 0;
        int i13 = 0;
        int iMainAxisSize = 0;
        boolean z3 = false;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i11 >= endIndex) {
                break;
            }
            Measurable measurable = this.measurables.get(i11);
            RowColumnParentData rowColumnParentData = this.rowColumnParentData[i11];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > 0.0f) {
                f6 += weight;
                i13++;
                i9 = i11;
            } else {
                int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                Placeable placeableMo10585measureBRTryo0 = this.placeables[i11];
                if (placeableMo10585measureBRTryo0 == null) {
                    i7 = mainAxisMax;
                    i8 = iMax3;
                    i9 = i11;
                    placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, mainAxisMax == Integer.MAX_VALUE ? Integer.MAX_VALUE : mainAxisMax - iMainAxisSize, 0, 0, 8, null).m7308toBoxConstraintsOenEA2s(this.orientation));
                } else {
                    i7 = mainAxisMax;
                    i8 = iMax3;
                    i9 = i11;
                }
                int iMin = Math.min(iMo7200roundToPx0680j_4, (i7 - iMainAxisSize) - mainAxisSize(placeableMo10585measureBRTryo0));
                iMainAxisSize += mainAxisSize(placeableMo10585measureBRTryo0) + iMin;
                iMax3 = Math.max(i8, crossAxisSize(placeableMo10585measureBRTryo0));
                z3 = z3 || RowColumnImplKt.isRelative(rowColumnParentData);
                this.placeables[i9] = placeableMo10585measureBRTryo0;
                i12 = iMin;
            }
            i11 = i9 + 1;
        }
        int i14 = iMax3;
        if (i13 == 0) {
            iMainAxisSize -= i12;
            iMax = i14;
            iCoerceAtMost = 0;
        } else {
            int i15 = iMo7200roundToPx0680j_4 * (i13 - 1);
            int mainAxisMin = (((f6 <= 0.0f || orientationIndependentConstraints.getMainAxisMax() == Integer.MAX_VALUE) ? orientationIndependentConstraints.getMainAxisMin() : orientationIndependentConstraints.getMainAxisMax()) - iMainAxisSize) - i15;
            float f7 = f6 > 0.0f ? mainAxisMin / f6 : 0.0f;
            Iterator<Integer> it = RangesKt___RangesKt.until(startIndex, endIndex).iterator();
            int iRoundToInt = 0;
            while (it.hasNext()) {
                iRoundToInt += MathKt__MathJVMKt.roundToInt(RowColumnImplKt.getWeight(this.rowColumnParentData[((IntIterator) it).nextInt()]) * f7);
            }
            int i16 = mainAxisMin - iRoundToInt;
            int i17 = startIndex;
            iMax = i14;
            int iMainAxisSize2 = 0;
            while (i17 < endIndex) {
                if (this.placeables[i17] == null) {
                    Measurable measurable2 = this.measurables.get(i17);
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i17];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (!(weight2 > f5)) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int sign = MathKt__MathJVMKt.getSign(i16);
                    int i18 = i16 - sign;
                    int iMax4 = Math.max(0, MathKt__MathJVMKt.roundToInt(weight2 * f7) + sign);
                    if (!RowColumnImplKt.getFill(rowColumnParentData2) || iMax4 == i4) {
                        f4 = f7;
                        i5 = 0;
                    } else {
                        f4 = f7;
                        i5 = iMax4;
                    }
                    Placeable placeableMo10585measureBRTryo02 = measurable2.mo10585measureBRTryo0(new OrientationIndependentConstraints(i5, iMax4, 0, orientationIndependentConstraints.getCrossAxisMax()).m7308toBoxConstraintsOenEA2s(this.orientation));
                    iMainAxisSize2 += mainAxisSize(placeableMo10585measureBRTryo02);
                    iMax = Math.max(iMax, crossAxisSize(placeableMo10585measureBRTryo02));
                    z3 = z3 || RowColumnImplKt.isRelative(rowColumnParentData2);
                    this.placeables[i17] = placeableMo10585measureBRTryo02;
                    i16 = i18;
                } else {
                    f4 = f7;
                }
                i17++;
                f7 = f4;
                i4 = Integer.MAX_VALUE;
                f5 = 0.0f;
            }
            iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(iMainAxisSize2 + i15, orientationIndependentConstraints.getMainAxisMax() - iMainAxisSize);
        }
        if (z3) {
            int iMax5 = 0;
            iMax2 = 0;
            for (int i19 = startIndex; i19 < endIndex; i19++) {
                Placeable placeable = this.placeables[i19];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i19]);
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = 0;
                    }
                    iMax5 = Math.max(iMax5, iIntValue);
                    int iCrossAxisSize = crossAxisSize(placeable);
                    int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = crossAxisSize(placeable);
                    }
                    iMax2 = Math.max(iMax2, iCrossAxisSize - iIntValue2);
                }
            }
            i6 = iMax5;
        } else {
            iMax2 = 0;
            i6 = 0;
        }
        int iMax6 = Math.max(iMainAxisSize + iCoerceAtMost, orientationIndependentConstraints.getMainAxisMin());
        int iMax7 = (orientationIndependentConstraints.getCrossAxisMax() == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) ? Math.max(iMax, Math.max(orientationIndependentConstraints.getCrossAxisMin(), iMax2 + i6)) : orientationIndependentConstraints.getCrossAxisMax();
        int[] iArr = new int[i10];
        for (int i20 = 0; i20 < i10; i20++) {
            iArr[i20] = 0;
        }
        int[] iArr2 = new int[i10];
        for (int i21 = 0; i21 < i10; i21++) {
            Placeable placeable2 = this.placeables[i21 + startIndex];
            Intrinsics.checkNotNull(placeable2);
            iArr2[i21] = mainAxisSize(placeable2);
        }
        return new RowColumnMeasureHelperResult(iMax7, iMax6, startIndex, endIndex, i6, mainAxisPositions(iMax6, iArr2, iArr, measureScope));
    }

    public final void placeHelper(Placeable.PlacementScope placeableScope, RowColumnMeasureHelperResult measureResult, int crossAxisOffset, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(placeableScope, "placeableScope");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            Intrinsics.checkNotNull(placeable);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int crossAxisPosition = getCrossAxisPosition(placeable, parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null, measureResult.getCrossAxisSize(), layoutDirection, measureResult.getBeforeCrossAxisAlignmentLine()) + crossAxisOffset;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placeableScope, placeable, mainAxisPositions[startIndex - measureResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placeableScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, float f4, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> list, Placeable[] placeableArr) {
        this.orientation = layoutOrientation;
        this.arrangement = function5;
        this.arrangementSpacing = f4;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = list;
        this.placeables = placeableArr;
        int size = list.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i4 = 0; i4 < size; i4++) {
            rowColumnParentDataArr[i4] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i4));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }
}
