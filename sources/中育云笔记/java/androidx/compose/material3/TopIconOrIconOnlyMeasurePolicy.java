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
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {
    private final InterfaceC9529a animationProgress;
    private final boolean hasLabel;
    private final float indicatorHorizontalPadding;
    private final float indicatorToLabelVerticalPadding;
    private final float indicatorVerticalPadding;
    private final float topIconItemVerticalPadding;

    public /* synthetic */ TopIconOrIconOnlyMeasurePolicy(boolean z10, InterfaceC9529a interfaceC9529a, float f10, float f11, float f12, float f13, AbstractC9972n abstractC9972n) {
        this(z10, interfaceC9529a, f10, f11, f12, f13);
    }

    public final InterfaceC9529a getAnimationProgress() {
        return this.animationProgress;
    }

    public final boolean getHasLabel() {
        return this.hasLabel;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m29476getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorToLabelVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m29477getIndicatorToLabelVerticalPaddingD9Ej5fM() {
        return this.indicatorToLabelVerticalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m29478getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getTopIconItemVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m29479getTopIconItemVerticalPaddingD9Ej5fM() {
        return this.topIconItemVerticalPadding;
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        IntrinsicMeasurable intrinsicMeasurable;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i11);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable2.maxIntrinsicHeight(i10);
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        intrinsicMeasurable = null;
                        break;
                    }
                    intrinsicMeasurable = list.get(i12);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "label")) {
                        break;
                    }
                    i12++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = intrinsicMeasurable;
                int iMaxIntrinsicHeight2 = intrinsicMeasurable3 != null ? intrinsicMeasurable3.maxIntrinsicHeight(i10) : 0;
                float f10 = 2;
                return iMaxIntrinsicHeight + iMaxIntrinsicHeight2 + intrinsicMeasureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(this.topIconItemVerticalPadding * f10) + C3186Dp.m33501constructorimpl(this.indicatorVerticalPadding * f10)) + this.indicatorToLabelVerticalPadding));
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
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Measurable measurable = list.get(i11);
            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable), "icon")) {
                float f10 = 2;
                Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(jM33444copyZbe2FdA$default, -measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(this.indicatorHorizontalPadding * f10)), -measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(this.indicatorVerticalPadding * f10))));
                int width = placeableMo32229measureBRTryo0.getWidth() + measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(this.indicatorHorizontalPadding * f10));
                int height = placeableMo32229measureBRTryo0.getHeight() + measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(this.indicatorVerticalPadding * f10));
                int iM19282d = AbstractC9719c.m19282d(width * fFloatValue);
                int size2 = list.size();
                int i12 = 0;
                while (i12 < size2) {
                    Measurable measurable2 = list.get(i12);
                    if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                        Placeable placeableMo32229measureBRTryo02 = measurable2.mo32229measureBRTryo0(ConstraintsKt.m33469constrainN9IONVI(jM33444copyZbe2FdA$default, Constraints.Companion.m33464fixedJhjzzOo(width, height)));
                        int size3 = list.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Measurable measurable3 = list.get(i13);
                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable3), "indicator")) {
                                Placeable placeableMo32229measureBRTryo03 = measurable3.mo32229measureBRTryo0(ConstraintsKt.m33469constrainN9IONVI(jM33444copyZbe2FdA$default, Constraints.Companion.m33464fixedJhjzzOo(iM19282d, height)));
                                if (!this.hasLabel) {
                                    return NavigationItemKt.m28919placeIconX9ElhV4(measureScope2, placeableMo32229measureBRTryo0, placeableMo32229measureBRTryo02, placeableMo32229measureBRTryo03, j10);
                                }
                                int size4 = list.size();
                                while (i10 < size4) {
                                    Measurable measurable4 = list.get(i10);
                                    if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable4), "label")) {
                                        return NavigationItemKt.m28921placeLabelAndTopIconqoqLrGI(measureScope2, measurable4.mo32229measureBRTryo0(ConstraintsKt.m33474offsetNN6EwU$default(jM33444copyZbe2FdA$default, 0, -(placeableMo32229measureBRTryo03.getHeight() + measureScope2.mo27093roundToPx0680j_4(this.indicatorToLabelVerticalPadding)), 1, null)), placeableMo32229measureBRTryo0, placeableMo32229measureBRTryo02, placeableMo32229measureBRTryo03, j10, this.indicatorToLabelVerticalPadding, this.indicatorVerticalPadding, this.topIconItemVerticalPadding);
                                    }
                                    i10++;
                                    placeableMo32229measureBRTryo0 = placeableMo32229measureBRTryo0;
                                    placeableMo32229measureBRTryo03 = placeableMo32229measureBRTryo03;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i13++;
                            placeableMo32229measureBRTryo0 = placeableMo32229measureBRTryo0;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i12++;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i11++;
            measureScope2 = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private TopIconOrIconOnlyMeasurePolicy(boolean z10, InterfaceC9529a interfaceC9529a, float f10, float f11, float f12, float f13) {
        this.hasLabel = z10;
        this.animationProgress = interfaceC9529a;
        this.indicatorHorizontalPadding = f10;
        this.indicatorVerticalPadding = f11;
        this.indicatorToLabelVerticalPadding = f12;
        this.topIconItemVerticalPadding = f13;
    }
}
