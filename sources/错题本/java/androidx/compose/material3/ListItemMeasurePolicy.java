package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p011ui.layout.AlignmentLineKt;
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
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u000f\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\t\u001a\u00020\b2,\u0010\u000e\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0012\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\u0011\u001a\u00020\b2,\u0010\u000e\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J2\u0010\u001a\u001a\u00020\u0017*\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ/\u0010\u001e\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ/\u0010\u001f\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m5110d2 = {"Landroidx/compose/material3/ListItemMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "<init>", "()V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/ExtensionFunctionType;", "intrinsicMeasure", "calculateIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILr6/e;)I", "width", "calculateIntrinsicHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "maxIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "maxIntrinsicWidth", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,731:1\n50#2:732\n86#2:733\n86#2:734\n50#2:735\n50#2:736\n86#2:737\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n*L\n213#1:732\n243#1:733\n299#1:734\n376#1:735\n395#1:736\n433#1:737\n*E\n"})
/* loaded from: classes.dex */
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicHeight$1 */
    public /* synthetic */ class C17001 extends FunctionReferenceImpl implements InterfaceC6473e {
        public static final C17001 INSTANCE = new C17001();

        public C17001() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        @NotNull
        public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i));
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicWidth$1 */
    public /* synthetic */ class C17011 extends FunctionReferenceImpl implements InterfaceC6473e {
        public static final C17011 INSTANCE = new C17011();

        public C17011() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        @NotNull
        public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i));
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1 */
    public /* synthetic */ class C17021 extends FunctionReferenceImpl implements InterfaceC6473e {
        public static final C17021 INSTANCE = new C17021();

        public C17021() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        @NotNull
        public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i));
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicWidth$1 */
    public /* synthetic */ class C17031 extends FunctionReferenceImpl implements InterfaceC6473e {
        public static final C17031 INSTANCE = new C17031();

        public C17031() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
        }

        @NotNull
        public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i));
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    private final int calculateIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i, InterfaceC6473e interfaceC6473e) {
        int iIntValue;
        int iIntValue2;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(i, intrinsicMeasureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(ListItemKt.getListItemEndPadding() + ListItemKt.getListItemStartPadding())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list5);
        if (intrinsicMeasurable != null) {
            iIntValue = ((Number) interfaceC6473e.invoke(intrinsicMeasurable, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list6);
        if (intrinsicMeasurable2 != null) {
            iIntValue2 = ((Number) interfaceC6473e.invoke(intrinsicMeasurable2, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list3);
        int iIntValue3 = obj != null ? ((Number) interfaceC6473e.invoke(obj, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        Object obj2 = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list2);
        int iIntValue4 = obj2 != null ? ((Number) interfaceC6473e.invoke(obj2, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        Object obj3 = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list4);
        int iIntValue5 = obj3 != null ? ((Number) interfaceC6473e.invoke(obj3, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        int iM8616invokeZLSjz4$material3_release = ListItemType.INSTANCE.m8616invokeZLSjz4$material3_release(iIntValue3 > 0, iIntValue5 > 0, ListItemKt.isSupportingMultilineHeuristic(intrinsicMeasureScope, iIntValue5));
        return ListItemKt.m8601calculateHeightN4Jib3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iM8616invokeZLSjz4$material3_release, intrinsicMeasureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(ListItemKt.m8603verticalPaddingyh95HIg(iM8616invokeZLSjz4$material3_release) * 2)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i, InterfaceC6473e interfaceC6473e) {
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list5);
        int iIntValue = intrinsicMeasurable != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list6);
        int iIntValue2 = intrinsicMeasurable2 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list2);
        int iIntValue3 = intrinsicMeasurable3 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list3);
        int iIntValue4 = intrinsicMeasurable4 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) AbstractC5805t.m5229i0(list4);
        return ListItemKt.m8602calculateWidthyeHjK3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? ((Number) interfaceC6473e.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue() : 0, intrinsicMeasureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(ListItemKt.getListItemEndPadding() + ListItemKt.getListItemStartPadding())), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i, C17001.INSTANCE);
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i, C17011.INSTANCE);
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7209measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends List<? extends Measurable>> list, long j7) {
        long j8;
        Placeable placeableMo12033measureBRTryo0;
        float f;
        List<? extends Measurable> list2;
        long j9;
        Placeable placeableMo12033measureBRTryo02;
        float f7;
        Placeable placeableMo12033measureBRTryo03;
        List<? extends Measurable> list3 = list.get(0);
        List<? extends Measurable> list4 = list.get(1);
        List<? extends Measurable> list5 = list.get(2);
        List<? extends Measurable> list6 = list.get(3);
        List<? extends Measurable> list7 = list.get(4);
        long jM13248copyZbe2FdA$default = Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null);
        float listItemStartPadding = ListItemKt.getListItemStartPadding();
        float listItemEndPadding = ListItemKt.getListItemEndPadding();
        int iMo6897roundToPx0680j_4 = measureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(listItemStartPadding + listItemEndPadding));
        Measurable measurable = (Measurable) AbstractC5805t.m5229i0(list6);
        int iMinIntrinsicWidth = measurable != null ? measurable.minIntrinsicWidth(Constraints.m13257getMaxHeightimpl(j7)) : 0;
        Measurable measurable2 = (Measurable) AbstractC5805t.m5229i0(list7);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(Constraints.m13258getMaxWidthimpl(jM13248copyZbe2FdA$default), iMinIntrinsicWidth + (measurable2 != null ? measurable2.minIntrinsicWidth(Constraints.m13257getMaxHeightimpl(j7)) : 0) + iMo6897roundToPx0680j_4);
        Measurable measurable3 = (Measurable) AbstractC5805t.m5229i0(list5);
        boolean zIsSupportingMultilineHeuristic = ListItemKt.isSupportingMultilineHeuristic(measureScope, measurable3 != null ? measurable3.minIntrinsicHeight(iSubtractConstraintSafely) : 0);
        ListItemType.Companion companion = ListItemType.INSTANCE;
        float f8 = 2;
        long jM13277offsetNN6EwU = ConstraintsKt.m13277offsetNN6EwU(jM13248copyZbe2FdA$default, -iMo6897roundToPx0680j_4, -measureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(ListItemKt.m8603verticalPaddingyh95HIg(companion.m8616invokeZLSjz4$material3_release(AbstractC5805t.m5229i0(list4) != null, AbstractC5805t.m5229i0(list5) != null, zIsSupportingMultilineHeuristic)) * f8)));
        Measurable measurable4 = (Measurable) AbstractC5805t.m5229i0(list6);
        Placeable placeableMo12033measureBRTryo04 = measurable4 != null ? measurable4.mo12033measureBRTryo0(jM13277offsetNN6EwU) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo04);
        Measurable measurable5 = (Measurable) AbstractC5805t.m5229i0(list7);
        if (measurable5 != null) {
            j8 = jM13277offsetNN6EwU;
            placeableMo12033measureBRTryo0 = measurable5.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(j8, -iWidthOrZero, 0, 2, null));
        } else {
            j8 = jM13277offsetNN6EwU;
            placeableMo12033measureBRTryo0 = null;
        }
        int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo0) + iWidthOrZero;
        Measurable measurable6 = (Measurable) AbstractC5805t.m5229i0(list3);
        if (measurable6 != null) {
            list2 = list5;
            f = f8;
            j9 = j8;
            placeableMo12033measureBRTryo02 = measurable6.mo12033measureBRTryo0(ConstraintsKt.m13278offsetNN6EwU$default(j8, -iWidthOrZero2, 0, 2, null));
        } else {
            f = f8;
            list2 = list5;
            j9 = j8;
            placeableMo12033measureBRTryo02 = null;
        }
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo02);
        Measurable measurable7 = (Measurable) AbstractC5805t.m5229i0(list2);
        if (measurable7 != null) {
            f7 = f;
            placeableMo12033measureBRTryo03 = measurable7.mo12033measureBRTryo0(ConstraintsKt.m13277offsetNN6EwU(j9, -iWidthOrZero2, -iHeightOrZero));
        } else {
            f7 = f;
            placeableMo12033measureBRTryo03 = null;
        }
        int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo03) + iHeightOrZero;
        boolean z8 = (placeableMo12033measureBRTryo03 == null || placeableMo12033measureBRTryo03.get(AlignmentLineKt.getFirstBaseline()) == placeableMo12033measureBRTryo03.get(AlignmentLineKt.getLastBaseline())) ? false : true;
        Measurable measurable8 = (Measurable) AbstractC5805t.m5229i0(list4);
        Placeable placeableMo12033measureBRTryo05 = measurable8 != null ? measurable8.mo12033measureBRTryo0(ConstraintsKt.m13277offsetNN6EwU(j9, -iWidthOrZero2, -iHeightOrZero2)) : null;
        int iM8616invokeZLSjz4$material3_release = companion.m8616invokeZLSjz4$material3_release(placeableMo12033measureBRTryo05 != null, placeableMo12033measureBRTryo03 != null, z8);
        float fM8603verticalPaddingyh95HIg = ListItemKt.m8603verticalPaddingyh95HIg(iM8616invokeZLSjz4$material3_release);
        return ListItemKt.place(measureScope, ListItemKt.m8602calculateWidthyeHjK3Y(measureScope, TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo04), TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo02), TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo12033measureBRTryo03), iMo6897roundToPx0680j_4, j7), ListItemKt.m8601calculateHeightN4Jib3Y(measureScope, TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo04), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo02), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo12033measureBRTryo03), iM8616invokeZLSjz4$material3_release, measureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(fM8603verticalPaddingyh95HIg * f7)), j7), placeableMo12033measureBRTryo04, placeableMo12033measureBRTryo0, placeableMo12033measureBRTryo02, placeableMo12033measureBRTryo05, placeableMo12033measureBRTryo03, ListItemType.m8608equalsimpl0(iM8616invokeZLSjz4$material3_release, companion.m8614getThreeLineAlXitO8()), measureScope.mo6897roundToPx0680j_4(listItemStartPadding), measureScope.mo6897roundToPx0680j_4(listItemEndPadding), measureScope.mo6897roundToPx0680j_4(fM8603verticalPaddingyh95HIg));
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i, C17021.INSTANCE);
    }

    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i, C17031.INSTANCE);
    }
}
