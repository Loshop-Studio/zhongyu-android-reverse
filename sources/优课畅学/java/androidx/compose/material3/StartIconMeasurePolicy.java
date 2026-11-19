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
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p322z7.AbstractC10729c;

/* loaded from: classes2.dex */
final class StartIconMeasurePolicy implements MeasurePolicy {
    private final InterfaceC10559a animationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;

    public /* synthetic */ StartIconMeasurePolicy(InterfaceC10559a interfaceC10559a, float f10, float f11, float f12, AbstractC9126n abstractC9126n) {
        this(interfaceC10559a, f10, f11, f12);
    }

    public final InterfaceC10559a getAnimationProgress() {
        return this.animationProgress;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m22538getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m22539getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m22540getStartIconToLabelHorizontalPaddingD9Ej5fM() {
        return this.startIconToLabelHorizontalPadding;
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i11);
            if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i10);
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i12);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return Math.max(iMaxIntrinsicHeight, intrinsicMeasurable2.maxIntrinsicHeight(i10)) + intrinsicMeasureScope.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(this.indicatorVerticalPadding * 2));
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
            if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i10);
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i12);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return iMaxIntrinsicWidth + intrinsicMeasurable2.maxIntrinsicWidth(i10) + intrinsicMeasureScope.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(C3156Dp.m26899constructorimpl(this.indicatorHorizontalPadding * 2) + this.startIconToLabelHorizontalPadding));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        MeasureScope measureScope2 = measureScope;
        float fFloatValue = ((Number) this.animationProgress.invoke()).floatValue();
        long jM26842copyZbe2FdA$default = Constraints.m26842copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        float f10 = 2;
        long jM26871offsetNN6EwU = ConstraintsKt.m26871offsetNN6EwU(jM26842copyZbe2FdA$default, -measureScope2.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(this.indicatorHorizontalPadding * f10)), -measureScope2.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(this.indicatorVerticalPadding * f10)));
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Measurable measurable = list.get(i10);
            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(jM26871offsetNN6EwU);
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    Measurable measurable2 = list.get(i11);
                    if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable2), "label")) {
                        Placeable placeableMo25627measureBRTryo02 = measurable2.mo25627measureBRTryo0(ConstraintsKt.m26872offsetNN6EwU$default(jM26871offsetNN6EwU, -(placeableMo25627measureBRTryo0.getWidth() + measureScope2.mo20491roundToPx0680j_4(this.startIconToLabelHorizontalPadding)), 0, 2, null));
                        int width = placeableMo25627measureBRTryo0.getWidth() + placeableMo25627measureBRTryo02.getWidth() + measureScope2.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(this.startIconToLabelHorizontalPadding + C3156Dp.m26899constructorimpl(this.indicatorHorizontalPadding * f10)));
                        int iMax = Math.max(placeableMo25627measureBRTryo0.getHeight(), placeableMo25627measureBRTryo02.getHeight()) + measureScope2.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(this.indicatorVerticalPadding * f10));
                        int iM20035d = AbstractC10729c.m20035d(width * fFloatValue);
                        int size3 = list.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Measurable measurable3 = list.get(i12);
                            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable placeableMo25627measureBRTryo03 = measurable3.mo25627measureBRTryo0(ConstraintsKt.m26867constrainN9IONVI(jM26842copyZbe2FdA$default, Constraints.Companion.m26862fixedJhjzzOo(width, iMax)));
                                int size4 = list.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    Measurable measurable4 = list.get(i13);
                                    if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return NavigationItemKt.m22318placeLabelAndStartIconnru01g4(measureScope2, placeableMo25627measureBRTryo02, placeableMo25627measureBRTryo0, placeableMo25627measureBRTryo03, measurable4.mo25627measureBRTryo0(ConstraintsKt.m26867constrainN9IONVI(jM26842copyZbe2FdA$default, Constraints.Companion.m26862fixedJhjzzOo(iM20035d, iMax))), j10, this.startIconToLabelHorizontalPadding);
                                    }
                                    i13++;
                                    placeableMo25627measureBRTryo0 = placeableMo25627measureBRTryo0;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i12++;
                            placeableMo25627measureBRTryo0 = placeableMo25627measureBRTryo0;
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

    private StartIconMeasurePolicy(InterfaceC10559a interfaceC10559a, float f10, float f11, float f12) {
        this.animationProgress = interfaceC10559a;
        this.indicatorHorizontalPadding = f10;
        this.indicatorVerticalPadding = f11;
        this.startIconToLabelHorizontalPadding = f12;
    }
}
