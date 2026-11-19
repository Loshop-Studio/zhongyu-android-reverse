package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.LayoutIdKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(m13557d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\"\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\"\u0010\u0018\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J,\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m13558d2 = {"Landroidx/compose/material3/StartIconMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "animationProgress", "Lkotlin/Function0;", "", "indicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "indicatorVerticalPadding", "startIconToLabelHorizontalPadding", "(Lkotlin/jvm/functions/Function0;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimationProgress", "()Lkotlin/jvm/functions/Function0;", "getIndicatorHorizontalPadding-D9Ej5fM", "()F", "F", "getIndicatorVerticalPadding-D9Ej5fM", "getStartIconToLabelHorizontalPadding-D9Ej5fM", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/StartIconMeasurePolicy\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,731:1\n86#2:732\n86#2:733\n86#2:752\n50#2:753\n86#2:754\n86#2:791\n50#2:792\n86#2:811\n544#3,2:734\n33#3,6:736\n546#3:742\n544#3,2:743\n33#3,6:745\n546#3:751\n544#3,2:755\n33#3,6:757\n546#3:763\n544#3,2:764\n33#3,6:766\n546#3:772\n544#3,2:773\n33#3,6:775\n546#3:781\n544#3,2:782\n33#3,6:784\n546#3:790\n544#3,2:793\n33#3,6:795\n546#3:801\n544#3,2:802\n33#3,6:804\n546#3:810\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/StartIconMeasurePolicy\n*L\n511#1:732\n512#1:733\n531#1:752\n531#1:753\n534#1:754\n573#1:791\n573#1:792\n586#1:811\n515#1:734,2\n515#1:736,6\n515#1:742\n520#1:743,2\n520#1:745,6\n520#1:751\n539#1:755,2\n539#1:757,6\n539#1:763\n547#1:764,2\n547#1:766,6\n547#1:772\n569#1:773,2\n569#1:775,6\n569#1:781\n571#1:782,2\n571#1:784,6\n571#1:790\n583#1:793,2\n583#1:795,6\n583#1:801\n585#1:802,2\n585#1:804,6\n585#1:810\n*E\n"})
/* loaded from: classes2.dex */
final class StartIconMeasurePolicy implements MeasurePolicy {
    private final Function0<Float> animationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;

    public /* synthetic */ StartIconMeasurePolicy(Function0 function0, float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, f10, f11, f12);
    }

    public final Function0<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIndicatorHorizontalPadding() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIndicatorVerticalPadding() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartIconToLabelHorizontalPadding() {
        return this.startIconToLabelHorizontalPadding;
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i11);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i10);
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i12);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return Math.max(iMaxIntrinsicHeight, intrinsicMeasurable2.maxIntrinsicHeight(i10)) + intrinsicMeasureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(this.indicatorVerticalPadding * 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i11);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i10);
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i12);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return iMaxIntrinsicWidth + intrinsicMeasurable2.maxIntrinsicWidth(i10) + intrinsicMeasureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(C3127Dp.m23561constructorimpl(this.indicatorHorizontalPadding * 2) + this.startIconToLabelHorizontalPadding));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        MeasureScope measureScope2 = measureScope;
        float fFloatValue = this.animationProgress.invoke().floatValue();
        long jM23504copyZbe2FdA$default = Constraints.m23504copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        float f10 = 2;
        long jM23533offsetNN6EwU = ConstraintsKt.m23533offsetNN6EwU(jM23504copyZbe2FdA$default, -measureScope2.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(this.indicatorHorizontalPadding * f10)), -measureScope2.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(this.indicatorVerticalPadding * f10)));
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Measurable measurable = list.get(i10);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(jM23533offsetNN6EwU);
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    Measurable measurable2 = list.get(i11);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "label")) {
                        Placeable placeableMo22324measureBRTryo02 = measurable2.mo22324measureBRTryo0(ConstraintsKt.m23534offsetNN6EwU$default(jM23533offsetNN6EwU, -(placeableMo22324measureBRTryo0.getWidth() + measureScope2.mo17326roundToPx0680j_4(this.startIconToLabelHorizontalPadding)), 0, 2, null));
                        int width = placeableMo22324measureBRTryo0.getWidth() + placeableMo22324measureBRTryo02.getWidth() + measureScope2.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(this.startIconToLabelHorizontalPadding + C3127Dp.m23561constructorimpl(this.indicatorHorizontalPadding * f10)));
                        int iMax = Math.max(placeableMo22324measureBRTryo0.getHeight(), placeableMo22324measureBRTryo02.getHeight()) + measureScope2.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(this.indicatorVerticalPadding * f10));
                        int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                        int size3 = list.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Measurable measurable3 = list.get(i12);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable placeableMo22324measureBRTryo03 = measurable3.mo22324measureBRTryo0(ConstraintsKt.m23529constrainN9IONVI(jM23504copyZbe2FdA$default, Constraints.INSTANCE.m23524fixedJhjzzOo(width, iMax)));
                                int size4 = list.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    Measurable measurable4 = list.get(i13);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return NavigationItemKt.m19055placeLabelAndStartIconnru01g4(measureScope2, placeableMo22324measureBRTryo02, placeableMo22324measureBRTryo0, placeableMo22324measureBRTryo03, measurable4.mo22324measureBRTryo0(ConstraintsKt.m23529constrainN9IONVI(jM23504copyZbe2FdA$default, Constraints.INSTANCE.m23524fixedJhjzzOo(iRoundToInt, iMax))), j10, this.startIconToLabelHorizontalPadding);
                                    }
                                    i13++;
                                    placeableMo22324measureBRTryo0 = placeableMo22324measureBRTryo0;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i12++;
                            placeableMo22324measureBRTryo0 = placeableMo22324measureBRTryo0;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i11++;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i10++;
            measureScope2 = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private StartIconMeasurePolicy(Function0<Float> function0, float f10, float f11, float f12) {
        this.animationProgress = function0;
        this.indicatorHorizontalPadding = f10;
        this.indicatorVerticalPadding = f11;
        this.startIconToLabelHorizontalPadding = f12;
    }
}
