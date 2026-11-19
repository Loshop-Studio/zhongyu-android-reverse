package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0017\u001a\u00020\u0014*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\u001a*\u00020\u00182\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\t\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010&R\u001d\u0010\n\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b(\u0010&R\u001d\u0010\u000b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b)\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, m5110d2 = {"Landroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "hasLabel", "Lkotlin/Function0;", "", "animationProgress", "Landroidx/compose/ui/unit/Dp;", "indicatorHorizontalPadding", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "topIconItemVerticalPadding", "<init>", "(ZLr6/a;FFFFLkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "width", "maxIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "Z", "getHasLabel", "()Z", "Lr6/a;", "getAnimationProgress", "()Lr6/a;", "F", "getIndicatorHorizontalPadding-D9Ej5fM", "()F", "getIndicatorVerticalPadding-D9Ej5fM", "getIndicatorToLabelVerticalPadding-D9Ej5fM", "getTopIconItemVerticalPadding-D9Ej5fM", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,731:1\n544#2,2:732\n33#2,6:734\n546#2:740\n544#2,2:745\n33#2,6:747\n546#2:753\n544#2,2:754\n33#2,6:756\n546#2:762\n544#2,2:763\n33#2,6:765\n546#2:771\n544#2,2:772\n33#2,6:774\n546#2:780\n116#2,2:781\n33#2,6:783\n118#2:789\n86#3:741\n86#3:742\n86#3:743\n86#3:744\n86#3:790\n86#3:791\n50#3:792\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy\n*L\n419#1:732,2\n419#1:734,6\n419#1:740\n432#1:745,2\n432#1:747,6\n432#1:753\n440#1:754,2\n440#1:756,6\n440#1:762\n452#1:763,2\n452#1:765,6\n452#1:771\n481#1:772,2\n481#1:774,6\n481#1:780\n484#1:781,2\n484#1:783,6\n484#1:789\n422#1:741\n423#1:742\n427#1:743\n428#1:744\n487#1:790\n488#1:791\n487#1:792\n*E\n"})
/* loaded from: classes.dex */
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {

    @NotNull
    private final InterfaceC6469a animationProgress;
    private final boolean hasLabel;
    private final float indicatorHorizontalPadding;
    private final float indicatorToLabelVerticalPadding;
    private final float indicatorVerticalPadding;
    private final float topIconItemVerticalPadding;

    public /* synthetic */ TopIconOrIconOnlyMeasurePolicy(boolean z8, InterfaceC6469a interfaceC6469a, float f, float f7, float f8, float f9, AbstractC5824e abstractC5824e) {
        this(z8, interfaceC6469a, f, f7, f8, f9);
    }

    @NotNull
    public final InterfaceC6469a getAnimationProgress() {
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

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        IntrinsicMeasurable intrinsicMeasurable;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i8);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable2.maxIntrinsicHeight(i);
                int size2 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        intrinsicMeasurable = null;
                        break;
                    }
                    intrinsicMeasurable = list.get(i9);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "label")) {
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = intrinsicMeasurable;
                int iMaxIntrinsicHeight2 = intrinsicMeasurable3 != null ? intrinsicMeasurable3.maxIntrinsicHeight(i) : 0;
                float f = 2;
                return iMaxIntrinsicHeight + iMaxIntrinsicHeight2 + intrinsicMeasureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(this.indicatorVerticalPadding * f) + C2331Dp.m13305constructorimpl(this.topIconItemVerticalPadding * f)) + this.indicatorToLabelVerticalPadding));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
        MeasureScope measureScope2 = measureScope;
        float fFloatValue = ((Number) this.animationProgress.invoke()).floatValue();
        long jM13248copyZbe2FdA$default = Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            Measurable measurable = list.get(i8);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), "icon")) {
                float f = 2;
                Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(ConstraintsKt.m13277offsetNN6EwU(jM13248copyZbe2FdA$default, -measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(this.indicatorHorizontalPadding * f)), -measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(this.indicatorVerticalPadding * f))));
                int iMo6897roundToPx0680j_4 = measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(this.indicatorHorizontalPadding * f)) + placeableMo12033measureBRTryo0.getWidth();
                int iMo6897roundToPx0680j_42 = measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(this.indicatorVerticalPadding * f)) + placeableMo12033measureBRTryo0.getHeight();
                int iM6241q = AbstractC6600a.m6241q(iMo6897roundToPx0680j_4 * fFloatValue);
                int size2 = list.size();
                int i9 = 0;
                while (i9 < size2) {
                    Measurable measurable2 = list.get(i9);
                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                        Placeable placeableMo12033measureBRTryo02 = measurable2.mo12033measureBRTryo0(ConstraintsKt.m13273constrainN9IONVI(jM13248copyZbe2FdA$default, Constraints.INSTANCE.m13268fixedJhjzzOo(iMo6897roundToPx0680j_4, iMo6897roundToPx0680j_42)));
                        int size3 = list.size();
                        int i10 = 0;
                        while (i10 < size3) {
                            Measurable measurable3 = list.get(i10);
                            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable3), "indicator")) {
                                Placeable placeableMo12033measureBRTryo03 = measurable3.mo12033measureBRTryo0(ConstraintsKt.m13273constrainN9IONVI(jM13248copyZbe2FdA$default, Constraints.INSTANCE.m13268fixedJhjzzOo(iM6241q, iMo6897roundToPx0680j_42)));
                                if (!this.hasLabel) {
                                    return NavigationItemKt.m8723placeIconX9ElhV4(measureScope2, placeableMo12033measureBRTryo0, placeableMo12033measureBRTryo02, placeableMo12033measureBRTryo03, j7);
                                }
                                int size4 = list.size();
                                while (i < size4) {
                                    Measurable measurable4 = list.get(i);
                                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable4), "label")) {
                                        return NavigationItemKt.m8725placeLabelAndTopIconqoqLrGI(measureScope2, measurable4.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(jM13248copyZbe2FdA$default, 0, -(measureScope2.mo6897roundToPx0680j_4(this.indicatorToLabelVerticalPadding) + placeableMo12033measureBRTryo03.getHeight()), 1, null)), placeableMo12033measureBRTryo0, placeableMo12033measureBRTryo02, placeableMo12033measureBRTryo03, j7, this.indicatorToLabelVerticalPadding, this.indicatorVerticalPadding, this.topIconItemVerticalPadding);
                                    }
                                    i++;
                                    placeableMo12033measureBRTryo0 = placeableMo12033measureBRTryo0;
                                    placeableMo12033measureBRTryo03 = placeableMo12033measureBRTryo03;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i10++;
                            placeableMo12033measureBRTryo0 = placeableMo12033measureBRTryo0;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i9++;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i8++;
            measureScope2 = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private TopIconOrIconOnlyMeasurePolicy(boolean z8, InterfaceC6469a interfaceC6469a, float f, float f7, float f8, float f9) {
        this.hasLabel = z8;
        this.animationProgress = interfaceC6469a;
        this.indicatorHorizontalPadding = f;
        this.indicatorVerticalPadding = f7;
        this.indicatorToLabelVerticalPadding = f8;
        this.topIconItemVerticalPadding = f9;
    }
}
