package androidx.compose.material3;

import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p014ui.layout.AlignmentLineKt;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10947g0;

/* loaded from: classes2.dex */
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {

    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicHeight$1 */
    public /* synthetic */ class C22201 extends FunctionReferenceImpl implements InterfaceC9544p {
        public static final C22201 INSTANCE = new C22201();

        public C22201() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i10));
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicWidth$1 */
    public /* synthetic */ class C22211 extends FunctionReferenceImpl implements InterfaceC9544p {
        public static final C22211 INSTANCE = new C22211();

        public C22211() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i10));
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1 */
    public /* synthetic */ class C22221 extends FunctionReferenceImpl implements InterfaceC9544p {
        public static final C22221 INSTANCE = new C22221();

        public C22221() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i10));
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicWidth$1 */
    public /* synthetic */ class C22231 extends FunctionReferenceImpl implements InterfaceC9544p {
        public static final C22231 INSTANCE = new C22231();

        public C22231() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i10));
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    private final int calculateIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10, InterfaceC9544p interfaceC9544p) {
        int iIntValue;
        int iIntValue2;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(i10, intrinsicMeasureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list5);
        if (intrinsicMeasurable != null) {
            iIntValue = ((Number) interfaceC9544p.invoke(intrinsicMeasurable, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list6);
        if (intrinsicMeasurable2 != null) {
            iIntValue2 = ((Number) interfaceC9544p.invoke(intrinsicMeasurable2, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list3);
        int iIntValue3 = obj != null ? ((Number) interfaceC9544p.invoke(obj, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        Object obj2 = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list2);
        int iIntValue4 = obj2 != null ? ((Number) interfaceC9544p.invoke(obj2, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        Object obj3 = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list4);
        int iIntValue5 = obj3 != null ? ((Number) interfaceC9544p.invoke(obj3, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        int iM28812invokeZLSjz4$material3_release = ListItemType.Companion.m28812invokeZLSjz4$material3_release(iIntValue3 > 0, iIntValue5 > 0, ListItemKt.isSupportingMultilineHeuristic(intrinsicMeasureScope, iIntValue5));
        return ListItemKt.m28797calculateHeightN4Jib3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iM28812invokeZLSjz4$material3_release, intrinsicMeasureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(ListItemKt.m28799verticalPaddingyh95HIg(iM28812invokeZLSjz4$material3_release) * 2)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10, InterfaceC9544p interfaceC9544p) {
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list5);
        int iIntValue = intrinsicMeasurable != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable, Integer.valueOf(i10))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list6);
        int iIntValue2 = intrinsicMeasurable2 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable2, Integer.valueOf(i10))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list2);
        int iIntValue3 = intrinsicMeasurable3 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable3, Integer.valueOf(i10))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list3);
        int iIntValue4 = intrinsicMeasurable4 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable4, Integer.valueOf(i10))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) AbstractC10947g0.m23946o0(list4);
        return ListItemKt.m28798calculateWidthyeHjK3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable5, Integer.valueOf(i10))).intValue() : 0, intrinsicMeasureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    @Override // androidx.compose.p014ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i10, C22201.INSTANCE);
    }

    @Override // androidx.compose.p014ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i10, C22211.INSTANCE);
    }

    @Override // androidx.compose.p014ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo27405measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j10) {
        long j11;
        Placeable placeableMo32229measureBRTryo0;
        float f10;
        List<? extends Measurable> list2;
        long j12;
        Placeable placeableMo32229measureBRTryo02;
        int i10;
        Placeable placeableMo32229measureBRTryo03;
        List<? extends Measurable> list3 = list.get(0);
        List<? extends Measurable> list4 = list.get(1);
        List<? extends Measurable> list5 = list.get(2);
        List<? extends Measurable> list6 = list.get(3);
        List<? extends Measurable> list7 = list.get(4);
        long jM33444copyZbe2FdA$default = Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        float listItemStartPadding = ListItemKt.getListItemStartPadding();
        float listItemEndPadding = ListItemKt.getListItemEndPadding();
        int iMo27093roundToPx0680j_4 = measureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(listItemStartPadding + listItemEndPadding));
        Measurable measurable = (Measurable) AbstractC10947g0.m23946o0(list6);
        int iMinIntrinsicWidth = measurable != null ? measurable.minIntrinsicWidth(Constraints.m33453getMaxHeightimpl(j10)) : 0;
        Measurable measurable2 = (Measurable) AbstractC10947g0.m23946o0(list7);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(Constraints.m33454getMaxWidthimpl(jM33444copyZbe2FdA$default), iMinIntrinsicWidth + (measurable2 != null ? measurable2.minIntrinsicWidth(Constraints.m33453getMaxHeightimpl(j10)) : 0) + iMo27093roundToPx0680j_4);
        Measurable measurable3 = (Measurable) AbstractC10947g0.m23946o0(list5);
        boolean zIsSupportingMultilineHeuristic = ListItemKt.isSupportingMultilineHeuristic(measureScope, measurable3 != null ? measurable3.minIntrinsicHeight(iSubtractConstraintSafely) : 0);
        ListItemType.Companion companion = ListItemType.Companion;
        float f11 = 2;
        long jM33473offsetNN6EwU = ConstraintsKt.m33473offsetNN6EwU(jM33444copyZbe2FdA$default, -iMo27093roundToPx0680j_4, -measureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(ListItemKt.m28799verticalPaddingyh95HIg(companion.m28812invokeZLSjz4$material3_release(AbstractC10947g0.m23946o0(list4) != null, AbstractC10947g0.m23946o0(list5) != null, zIsSupportingMultilineHeuristic)) * f11)));
        Measurable measurable4 = (Measurable) AbstractC10947g0.m23946o0(list6);
        Placeable placeableMo32229measureBRTryo04 = measurable4 != null ? measurable4.mo32229measureBRTryo0(jM33473offsetNN6EwU) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo04);
        Measurable measurable5 = (Measurable) AbstractC10947g0.m23946o0(list7);
        if (measurable5 != null) {
            j11 = jM33473offsetNN6EwU;
            placeableMo32229measureBRTryo0 = measurable5.mo32229measureBRTryo0(ConstraintsKt.m33474offsetNN6EwU$default(j11, -iWidthOrZero, 0, 2, null));
        } else {
            j11 = jM33473offsetNN6EwU;
            placeableMo32229measureBRTryo0 = null;
        }
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo0);
        Measurable measurable6 = (Measurable) AbstractC10947g0.m23946o0(list3);
        if (measurable6 != null) {
            list2 = list5;
            f10 = f11;
            j12 = j11;
            placeableMo32229measureBRTryo02 = measurable6.mo32229measureBRTryo0(ConstraintsKt.m33474offsetNN6EwU$default(j11, -iWidthOrZero2, 0, 2, null));
        } else {
            f10 = f11;
            list2 = list5;
            j12 = j11;
            placeableMo32229measureBRTryo02 = null;
        }
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo02);
        Measurable measurable7 = (Measurable) AbstractC10947g0.m23946o0(list2);
        if (measurable7 != null) {
            i10 = iHeightOrZero;
            placeableMo32229measureBRTryo03 = measurable7.mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(j12, -iWidthOrZero2, -iHeightOrZero));
        } else {
            i10 = iHeightOrZero;
            placeableMo32229measureBRTryo03 = null;
        }
        int iHeightOrZero2 = i10 + TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo03);
        boolean z10 = (placeableMo32229measureBRTryo03 == null || placeableMo32229measureBRTryo03.get(AlignmentLineKt.getFirstBaseline()) == placeableMo32229measureBRTryo03.get(AlignmentLineKt.getLastBaseline())) ? false : true;
        Measurable measurable8 = (Measurable) AbstractC10947g0.m23946o0(list4);
        Placeable placeableMo32229measureBRTryo05 = measurable8 != null ? measurable8.mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(j12, -iWidthOrZero2, -iHeightOrZero2)) : null;
        int iM28812invokeZLSjz4$material3_release = companion.m28812invokeZLSjz4$material3_release(placeableMo32229measureBRTryo05 != null, placeableMo32229measureBRTryo03 != null, z10);
        float fM28799verticalPaddingyh95HIg = ListItemKt.m28799verticalPaddingyh95HIg(iM28812invokeZLSjz4$material3_release);
        return ListItemKt.place(measureScope, ListItemKt.m28798calculateWidthyeHjK3Y(measureScope, TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo04), TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo02), TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo03), iMo27093roundToPx0680j_4, j10), ListItemKt.m28797calculateHeightN4Jib3Y(measureScope, TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo04), TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo02), TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo03), iM28812invokeZLSjz4$material3_release, measureScope.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(fM28799verticalPaddingyh95HIg * f10)), j10), placeableMo32229measureBRTryo04, placeableMo32229measureBRTryo0, placeableMo32229measureBRTryo02, placeableMo32229measureBRTryo05, placeableMo32229measureBRTryo03, ListItemType.m28804equalsimpl0(iM28812invokeZLSjz4$material3_release, companion.m28810getThreeLineAlXitO8()), measureScope.mo27093roundToPx0680j_4(listItemStartPadding), measureScope.mo27093roundToPx0680j_4(listItemEndPadding), measureScope.mo27093roundToPx0680j_4(fM28799verticalPaddingyh95HIg));
    }

    @Override // androidx.compose.p014ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i10, C22221.INSTANCE);
    }

    @Override // androidx.compose.p014ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i10, C22231.INSTANCE);
    }
}
