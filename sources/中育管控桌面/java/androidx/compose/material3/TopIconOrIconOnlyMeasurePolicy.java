package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p009ui.layout.IntrinsicMeasurable;
import androidx.compose.p009ui.layout.IntrinsicMeasureScope;
import androidx.compose.p009ui.layout.LayoutIdKt;
import androidx.compose.p009ui.layout.Measurable;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.MeasureScope;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.p009ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(m7879d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\"\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J,\u0010\u001e\u001a\u00020\u001f*\u00020 2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020!0\u001b2\u0006\u0010\"\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m7880d2 = {"Landroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "hasLabel", "", "animationProgress", "Lkotlin/Function0;", "", "indicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "topIconItemVerticalPadding", "(ZLkotlin/jvm/functions/Function0;FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimationProgress", "()Lkotlin/jvm/functions/Function0;", "getHasLabel", "()Z", "getIndicatorHorizontalPadding-D9Ej5fM", "()F", "F", "getIndicatorToLabelVerticalPadding-D9Ej5fM", "getIndicatorVerticalPadding-D9Ej5fM", "getTopIconItemVerticalPadding-D9Ej5fM", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,731:1\n544#2,2:732\n33#2,6:734\n546#2:740\n544#2,2:745\n33#2,6:747\n546#2:753\n544#2,2:754\n33#2,6:756\n546#2:762\n544#2,2:763\n33#2,6:765\n546#2:771\n544#2,2:772\n33#2,6:774\n546#2:780\n116#2,2:781\n33#2,6:783\n118#2:789\n86#3:741\n86#3:742\n86#3:743\n86#3:744\n86#3:790\n86#3:791\n50#3:792\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy\n*L\n419#1:732,2\n419#1:734,6\n419#1:740\n432#1:745,2\n432#1:747,6\n432#1:753\n440#1:754,2\n440#1:756,6\n440#1:762\n452#1:763,2\n452#1:765,6\n452#1:771\n481#1:772,2\n481#1:774,6\n481#1:780\n484#1:781,2\n484#1:783,6\n484#1:789\n422#1:741\n423#1:742\n427#1:743\n428#1:744\n487#1:790\n488#1:791\n487#1:792\n*E\n"})
/* loaded from: classes.dex */
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {
    private final Function0<Float> animationProgress;
    private final boolean hasLabel;
    private final float indicatorHorizontalPadding;
    private final float indicatorToLabelVerticalPadding;
    private final float indicatorVerticalPadding;
    private final float topIconItemVerticalPadding;

    public /* synthetic */ TopIconOrIconOnlyMeasurePolicy(boolean z6, Function0 function0, float f6, float f7, float f8, float f9, DefaultConstructorMarker defaultConstructorMarker) {
        this(z6, function0, f6, f7, f8, f9);
    }

    public final Function0<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    public final boolean getHasLabel() {
        return this.hasLabel;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIndicatorHorizontalPadding() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorToLabelVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIndicatorToLabelVerticalPadding() {
        return this.indicatorToLabelVerticalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIndicatorVerticalPadding() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getTopIconItemVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopIconItemVerticalPadding() {
        return this.topIconItemVerticalPadding;
    }

    @Override // androidx.compose.p009ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i6) {
        IntrinsicMeasurable intrinsicMeasurable;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable2.maxIntrinsicHeight(i6);
                int size2 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size2) {
                        intrinsicMeasurable = null;
                        break;
                    }
                    intrinsicMeasurable = list.get(i8);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "label")) {
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = intrinsicMeasurable;
                int iMaxIntrinsicHeight2 = intrinsicMeasurable3 != null ? intrinsicMeasurable3.maxIntrinsicHeight(i6) : 0;
                float f6 = 2;
                return iMaxIntrinsicHeight + iMaxIntrinsicHeight2 + intrinsicMeasureScope.mo10249roundToPx0680j_4(C2452Dp.m16484constructorimpl(C2452Dp.m16484constructorimpl(C2452Dp.m16484constructorimpl(this.topIconItemVerticalPadding * f6) + C2452Dp.m16484constructorimpl(this.indicatorVerticalPadding * f6)) + this.indicatorToLabelVerticalPadding));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p009ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9911measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j6) {
        MeasureScope measureScope2 = measureScope;
        float fFloatValue = this.animationProgress.invoke().floatValue();
        long jM16427copyZbe2FdA$default = Constraints.m16427copyZbe2FdA$default(j6, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Measurable measurable = list.get(i7);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                float f6 = 2;
                Placeable placeableMo15247measureBRTryo0 = measurable.mo15247measureBRTryo0(ConstraintsKt.m16456offsetNN6EwU(jM16427copyZbe2FdA$default, -measureScope2.mo10249roundToPx0680j_4(C2452Dp.m16484constructorimpl(this.indicatorHorizontalPadding * f6)), -measureScope2.mo10249roundToPx0680j_4(C2452Dp.m16484constructorimpl(this.indicatorVerticalPadding * f6))));
                int width = placeableMo15247measureBRTryo0.getWidth() + measureScope2.mo10249roundToPx0680j_4(C2452Dp.m16484constructorimpl(this.indicatorHorizontalPadding * f6));
                int height = placeableMo15247measureBRTryo0.getHeight() + measureScope2.mo10249roundToPx0680j_4(C2452Dp.m16484constructorimpl(this.indicatorVerticalPadding * f6));
                int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                int size2 = list.size();
                int i8 = 0;
                while (i8 < size2) {
                    Measurable measurable2 = list.get(i8);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                        Placeable placeableMo15247measureBRTryo02 = measurable2.mo15247measureBRTryo0(ConstraintsKt.m16452constrainN9IONVI(jM16427copyZbe2FdA$default, Constraints.INSTANCE.m16447fixedJhjzzOo(width, height)));
                        int size3 = list.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            Measurable measurable3 = list.get(i9);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicator")) {
                                Placeable placeableMo15247measureBRTryo03 = measurable3.mo15247measureBRTryo0(ConstraintsKt.m16452constrainN9IONVI(jM16427copyZbe2FdA$default, Constraints.INSTANCE.m16447fixedJhjzzOo(iRoundToInt, height)));
                                if (!this.hasLabel) {
                                    return NavigationItemKt.m11977placeIconX9ElhV4(measureScope2, placeableMo15247measureBRTryo0, placeableMo15247measureBRTryo02, placeableMo15247measureBRTryo03, j6);
                                }
                                int size4 = list.size();
                                while (i6 < size4) {
                                    Measurable measurable4 = list.get(i6);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "label")) {
                                        return NavigationItemKt.m11979placeLabelAndTopIconqoqLrGI(measureScope2, measurable4.mo15247measureBRTryo0(ConstraintsKt.m16457offsetNN6EwU$default(jM16427copyZbe2FdA$default, 0, -(placeableMo15247measureBRTryo03.getHeight() + measureScope2.mo10249roundToPx0680j_4(this.indicatorToLabelVerticalPadding)), 1, null)), placeableMo15247measureBRTryo0, placeableMo15247measureBRTryo02, placeableMo15247measureBRTryo03, j6, this.indicatorToLabelVerticalPadding, this.indicatorVerticalPadding, this.topIconItemVerticalPadding);
                                    }
                                    i6++;
                                    placeableMo15247measureBRTryo0 = placeableMo15247measureBRTryo0;
                                    placeableMo15247measureBRTryo03 = placeableMo15247measureBRTryo03;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i9++;
                            placeableMo15247measureBRTryo0 = placeableMo15247measureBRTryo0;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i8++;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i7++;
            measureScope2 = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private TopIconOrIconOnlyMeasurePolicy(boolean z6, Function0<Float> function0, float f6, float f7, float f8, float f9) {
        this.hasLabel = z6;
        this.animationProgress = function0;
        this.indicatorHorizontalPadding = f6;
        this.indicatorVerticalPadding = f7;
        this.indicatorToLabelVerticalPadding = f8;
        this.topIconItemVerticalPadding = f9;
    }
}
