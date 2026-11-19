package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p211jd.AbstractC9719c;

/* loaded from: classes2.dex */
final class StartIconMeasurePolicy implements MeasurePolicy {
    private final InterfaceC9529a animationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;

    public /* synthetic */ StartIconMeasurePolicy(InterfaceC9529a interfaceC9529a, float f10, float f11, float f12, AbstractC9972n abstractC9972n) {
        this(interfaceC9529a, f10, f11, f12);
    }

    public final InterfaceC9529a getAnimationProgress() {
        return this.animationProgress;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m29140getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m29141getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m29142getStartIconToLabelHorizontalPaddingD9Ej5fM() {
        return this.startIconToLabelHorizontalPadding;
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i11);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i10);
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i12);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return Math.max(iMaxIntrinsicHeight, intrinsicMeasurable2.maxIntrinsicHeight(i10)) + intrinsicMeasureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(this.indicatorVerticalPadding * 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i11);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i10);
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i12);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return iMaxIntrinsicWidth + intrinsicMeasurable2.maxIntrinsicWidth(i10) + intrinsicMeasureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(this.indicatorHorizontalPadding * 2) + this.startIconToLabelHorizontalPadding));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        MeasureScope measureScope2 = measureScope;
        float fFloatValue = ((Number) this.animationProgress.invoke()).floatValue();
        long jM33444copyZbe2FdA$default = Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        float f10 = 2;
        long jM33473offsetNN6EwU = ConstraintsKt.m33473offsetNN6EwU(jM33444copyZbe2FdA$default, -measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(this.indicatorHorizontalPadding * f10)), -measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(this.indicatorVerticalPadding * f10)));
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Measurable measurable = list.get(i10);
            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(jM33473offsetNN6EwU);
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    Measurable measurable2 = list.get(i11);
                    if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable2), "label")) {
                        Placeable placeableMo32229measureBRTryo02 = measurable2.mo32229measureBRTryo0(ConstraintsKt.m33474offsetNN6EwU$default(jM33473offsetNN6EwU, -(placeableMo32229measureBRTryo0.getWidth() + measureScope2.mo27093roundToPx0680j_4(this.startIconToLabelHorizontalPadding)), 0, 2, null));
                        int width = placeableMo32229measureBRTryo0.getWidth() + placeableMo32229measureBRTryo02.getWidth() + measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(this.startIconToLabelHorizontalPadding + C3186Dp.m33501constructorimpl(this.indicatorHorizontalPadding * f10)));
                        int iMax = Math.max(placeableMo32229measureBRTryo0.getHeight(), placeableMo32229measureBRTryo02.getHeight()) + measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(this.indicatorVerticalPadding * f10));
                        int iM19282d = AbstractC9719c.m19282d(width * fFloatValue);
                        int size3 = list.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Measurable measurable3 = list.get(i12);
                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable placeableMo32229measureBRTryo03 = measurable3.mo32229measureBRTryo0(ConstraintsKt.m33469constrainN9IONVI(jM33444copyZbe2FdA$default, Constraints.Companion.m33464fixedJhjzzOo(width, iMax)));
                                int size4 = list.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    Measurable measurable4 = list.get(i13);
                                    if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return NavigationItemKt.m28920placeLabelAndStartIconnru01g4(measureScope2, placeableMo32229measureBRTryo02, placeableMo32229measureBRTryo0, placeableMo32229measureBRTryo03, measurable4.mo32229measureBRTryo0(ConstraintsKt.m33469constrainN9IONVI(jM33444copyZbe2FdA$default, Constraints.Companion.m33464fixedJhjzzOo(iM19282d, iMax))), j10, this.startIconToLabelHorizontalPadding);
                                    }
                                    i13++;
                                    placeableMo32229measureBRTryo0 = placeableMo32229measureBRTryo0;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i12++;
                            placeableMo32229measureBRTryo0 = placeableMo32229measureBRTryo0;
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

    private StartIconMeasurePolicy(InterfaceC9529a interfaceC9529a, float f10, float f11, float f12) {
        this.animationProgress = interfaceC9529a;
        this.indicatorHorizontalPadding = f10;
        this.indicatorVerticalPadding = f11;
        this.startIconToLabelHorizontalPadding = f12;
    }
}
