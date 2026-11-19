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

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ,\u0010\u0014\u001a\u00020\u0011*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u0017*\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\u00020\u0017*\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\b\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, m5110d2 = {"Landroidx/compose/material3/StartIconMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "", "animationProgress", "Landroidx/compose/ui/unit/Dp;", "indicatorHorizontalPadding", "indicatorVerticalPadding", "startIconToLabelHorizontalPadding", "<init>", "(Lr6/a;FFFLkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "maxIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "maxIntrinsicHeight", "Lr6/a;", "getAnimationProgress", "()Lr6/a;", "F", "getIndicatorHorizontalPadding-D9Ej5fM", "()F", "getIndicatorVerticalPadding-D9Ej5fM", "getStartIconToLabelHorizontalPadding-D9Ej5fM", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/StartIconMeasurePolicy\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,731:1\n86#2:732\n86#2:733\n86#2:752\n50#2:753\n86#2:754\n86#2:791\n50#2:792\n86#2:811\n544#3,2:734\n33#3,6:736\n546#3:742\n544#3,2:743\n33#3,6:745\n546#3:751\n544#3,2:755\n33#3,6:757\n546#3:763\n544#3,2:764\n33#3,6:766\n546#3:772\n544#3,2:773\n33#3,6:775\n546#3:781\n544#3,2:782\n33#3,6:784\n546#3:790\n544#3,2:793\n33#3,6:795\n546#3:801\n544#3,2:802\n33#3,6:804\n546#3:810\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/StartIconMeasurePolicy\n*L\n511#1:732\n512#1:733\n531#1:752\n531#1:753\n534#1:754\n573#1:791\n573#1:792\n586#1:811\n515#1:734,2\n515#1:736,6\n515#1:742\n520#1:743,2\n520#1:745,6\n520#1:751\n539#1:755,2\n539#1:757,6\n539#1:763\n547#1:764,2\n547#1:766,6\n547#1:772\n569#1:773,2\n569#1:775,6\n569#1:781\n571#1:782,2\n571#1:784,6\n571#1:790\n583#1:793,2\n583#1:795,6\n583#1:801\n585#1:802,2\n585#1:804,6\n585#1:810\n*E\n"})
/* loaded from: classes.dex */
final class StartIconMeasurePolicy implements MeasurePolicy {

    @NotNull
    private final InterfaceC6469a animationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;

    public /* synthetic */ StartIconMeasurePolicy(InterfaceC6469a interfaceC6469a, float f, float f7, float f8, AbstractC5824e abstractC5824e) {
        this(interfaceC6469a, f, f7, f8);
    }

    @NotNull
    public final InterfaceC6469a getAnimationProgress() {
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

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i8);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
                int size2 = list.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i9);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return Math.max(iMaxIntrinsicHeight, intrinsicMeasurable2.maxIntrinsicHeight(i)) + intrinsicMeasureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(this.indicatorVerticalPadding * 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i8);
            if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
                int size2 = list.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i9);
                    if (AbstractC5830k.m5325b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return iMaxIntrinsicWidth + intrinsicMeasurable2.maxIntrinsicWidth(i) + intrinsicMeasureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(this.indicatorHorizontalPadding * 2) + this.startIconToLabelHorizontalPadding));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
        float f = 2;
        long jM13277offsetNN6EwU = ConstraintsKt.m13277offsetNN6EwU(jM13248copyZbe2FdA$default, -measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(this.indicatorHorizontalPadding * f)), -measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(this.indicatorVerticalPadding * f)));
        int size = list.size();
        int i = 0;
        while (i < size) {
            Measurable measurable = list.get(i);
            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(jM13277offsetNN6EwU);
                int size2 = list.size();
                int i8 = 0;
                while (i8 < size2) {
                    Measurable measurable2 = list.get(i8);
                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), "label")) {
                        Placeable placeableMo12033measureBRTryo02 = measurable2.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(jM13277offsetNN6EwU, -(measureScope2.mo6897roundToPx0680j_4(this.startIconToLabelHorizontalPadding) + placeableMo12033measureBRTryo0.getWidth()), 0, 2, null));
                        int iMo6897roundToPx0680j_4 = measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(this.indicatorHorizontalPadding * f) + this.startIconToLabelHorizontalPadding)) + placeableMo12033measureBRTryo02.getWidth() + placeableMo12033measureBRTryo0.getWidth();
                        int iMo6897roundToPx0680j_42 = measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(this.indicatorVerticalPadding * f)) + Math.max(placeableMo12033measureBRTryo0.getHeight(), placeableMo12033measureBRTryo02.getHeight());
                        int iM6241q = AbstractC6600a.m6241q(iMo6897roundToPx0680j_4 * fFloatValue);
                        int size3 = list.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            Measurable measurable3 = list.get(i9);
                            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable placeableMo12033measureBRTryo03 = measurable3.mo12033measureBRTryo0(ConstraintsKt.m13273constrainN9IONVI(jM13248copyZbe2FdA$default, Constraints.INSTANCE.m13268fixedJhjzzOo(iMo6897roundToPx0680j_4, iMo6897roundToPx0680j_42)));
                                int size4 = list.size();
                                int i10 = 0;
                                while (i10 < size4) {
                                    Measurable measurable4 = list.get(i10);
                                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return NavigationItemKt.m8724placeLabelAndStartIconnru01g4(measureScope2, placeableMo12033measureBRTryo02, placeableMo12033measureBRTryo0, placeableMo12033measureBRTryo03, measurable4.mo12033measureBRTryo0(ConstraintsKt.m13273constrainN9IONVI(jM13248copyZbe2FdA$default, Constraints.INSTANCE.m13268fixedJhjzzOo(iM6241q, iMo6897roundToPx0680j_42))), j7, this.startIconToLabelHorizontalPadding);
                                    }
                                    i10++;
                                    placeableMo12033measureBRTryo02 = placeableMo12033measureBRTryo02;
                                    placeableMo12033measureBRTryo0 = placeableMo12033measureBRTryo0;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i9++;
                            placeableMo12033measureBRTryo0 = placeableMo12033measureBRTryo0;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i8++;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i++;
            measureScope2 = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private StartIconMeasurePolicy(InterfaceC6469a interfaceC6469a, float f, float f7, float f8) {
        this.animationProgress = interfaceC6469a;
        this.indicatorHorizontalPadding = f;
        this.indicatorVerticalPadding = f7;
        this.startIconToLabelHorizontalPadding = f8;
    }
}
