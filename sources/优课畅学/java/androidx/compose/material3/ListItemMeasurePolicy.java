package androidx.compose.material3;

import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p013ui.layout.AlignmentLineKt;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {

    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicHeight$1 */
    public /* synthetic */ class C21901 extends FunctionReferenceImpl implements InterfaceC10574p {
        public static final C21901 INSTANCE = new C21901();

        public C21901() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i10));
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicWidth$1 */
    public /* synthetic */ class C21911 extends FunctionReferenceImpl implements InterfaceC10574p {
        public static final C21911 INSTANCE = new C21911();

        public C21911() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i10));
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1 */
    public /* synthetic */ class C21921 extends FunctionReferenceImpl implements InterfaceC10574p {
        public static final C21921 INSTANCE = new C21921();

        public C21921() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i10));
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicWidth$1 */
    public /* synthetic */ class C21931 extends FunctionReferenceImpl implements InterfaceC10574p {
        public static final C21931 INSTANCE = new C21931();

        public C21931() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i10));
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }
    }

    private final int calculateIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10, InterfaceC10574p interfaceC10574p) {
        int iIntValue;
        int iIntValue2;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(i10, intrinsicMeasureScope.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list5);
        if (intrinsicMeasurable != null) {
            iIntValue = ((Number) interfaceC10574p.invoke(intrinsicMeasurable, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list6);
        if (intrinsicMeasurable2 != null) {
            iIntValue2 = ((Number) interfaceC10574p.invoke(intrinsicMeasurable2, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list3);
        int iIntValue3 = obj != null ? ((Number) interfaceC10574p.invoke(obj, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        Object obj2 = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list2);
        int iIntValue4 = obj2 != null ? ((Number) interfaceC10574p.invoke(obj2, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        Object obj3 = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list4);
        int iIntValue5 = obj3 != null ? ((Number) interfaceC10574p.invoke(obj3, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        int iM22210invokeZLSjz4$material3_release = ListItemType.Companion.m22210invokeZLSjz4$material3_release(iIntValue3 > 0, iIntValue5 > 0, ListItemKt.isSupportingMultilineHeuristic(intrinsicMeasureScope, iIntValue5));
        return ListItemKt.m22195calculateHeightN4Jib3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iM22210invokeZLSjz4$material3_release, intrinsicMeasureScope.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(ListItemKt.m22197verticalPaddingyh95HIg(iM22210invokeZLSjz4$material3_release) * 2)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10, InterfaceC10574p interfaceC10574p) {
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list5);
        int iIntValue = intrinsicMeasurable != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable, Integer.valueOf(i10))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list6);
        int iIntValue2 = intrinsicMeasurable2 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable2, Integer.valueOf(i10))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list2);
        int iIntValue3 = intrinsicMeasurable3 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable3, Integer.valueOf(i10))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list3);
        int iIntValue4 = intrinsicMeasurable4 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable4, Integer.valueOf(i10))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list4);
        return ListItemKt.m22196calculateWidthyeHjK3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable5, Integer.valueOf(i10))).intValue() : 0, intrinsicMeasureScope.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i10, C21901.INSTANCE);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i10, C21911.INSTANCE);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20803measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j10) {
        long j11;
        Placeable placeableMo25627measureBRTryo0;
        float f10;
        List<? extends Measurable> list2;
        long j12;
        Placeable placeableMo25627measureBRTryo02;
        int i10;
        Placeable placeableMo25627measureBRTryo03;
        List<? extends Measurable> list3 = list.get(0);
        List<? extends Measurable> list4 = list.get(1);
        List<? extends Measurable> list5 = list.get(2);
        List<? extends Measurable> list6 = list.get(3);
        List<? extends Measurable> list7 = list.get(4);
        long jM26842copyZbe2FdA$default = Constraints.m26842copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        float listItemStartPadding = ListItemKt.getListItemStartPadding();
        float listItemEndPadding = ListItemKt.getListItemEndPadding();
        int iMo20491roundToPx0680j_4 = measureScope.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(listItemStartPadding + listItemEndPadding));
        Measurable measurable = (Measurable) AbstractC8778f0.m14568n0(list6);
        int iMinIntrinsicWidth = measurable != null ? measurable.minIntrinsicWidth(Constraints.m26851getMaxHeightimpl(j10)) : 0;
        Measurable measurable2 = (Measurable) AbstractC8778f0.m14568n0(list7);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(Constraints.m26852getMaxWidthimpl(jM26842copyZbe2FdA$default), iMinIntrinsicWidth + (measurable2 != null ? measurable2.minIntrinsicWidth(Constraints.m26851getMaxHeightimpl(j10)) : 0) + iMo20491roundToPx0680j_4);
        Measurable measurable3 = (Measurable) AbstractC8778f0.m14568n0(list5);
        boolean zIsSupportingMultilineHeuristic = ListItemKt.isSupportingMultilineHeuristic(measureScope, measurable3 != null ? measurable3.minIntrinsicHeight(iSubtractConstraintSafely) : 0);
        ListItemType.Companion companion = ListItemType.Companion;
        float f11 = 2;
        long jM26871offsetNN6EwU = ConstraintsKt.m26871offsetNN6EwU(jM26842copyZbe2FdA$default, -iMo20491roundToPx0680j_4, -measureScope.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(ListItemKt.m22197verticalPaddingyh95HIg(companion.m22210invokeZLSjz4$material3_release(AbstractC8778f0.m14568n0(list4) != null, AbstractC8778f0.m14568n0(list5) != null, zIsSupportingMultilineHeuristic)) * f11)));
        Measurable measurable4 = (Measurable) AbstractC8778f0.m14568n0(list6);
        Placeable placeableMo25627measureBRTryo04 = measurable4 != null ? measurable4.mo25627measureBRTryo0(jM26871offsetNN6EwU) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo04);
        Measurable measurable5 = (Measurable) AbstractC8778f0.m14568n0(list7);
        if (measurable5 != null) {
            j11 = jM26871offsetNN6EwU;
            placeableMo25627measureBRTryo0 = measurable5.mo25627measureBRTryo0(ConstraintsKt.m26872offsetNN6EwU$default(j11, -iWidthOrZero, 0, 2, null));
        } else {
            j11 = jM26871offsetNN6EwU;
            placeableMo25627measureBRTryo0 = null;
        }
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo0);
        Measurable measurable6 = (Measurable) AbstractC8778f0.m14568n0(list3);
        if (measurable6 != null) {
            list2 = list5;
            f10 = f11;
            j12 = j11;
            placeableMo25627measureBRTryo02 = measurable6.mo25627measureBRTryo0(ConstraintsKt.m26872offsetNN6EwU$default(j11, -iWidthOrZero2, 0, 2, null));
        } else {
            f10 = f11;
            list2 = list5;
            j12 = j11;
            placeableMo25627measureBRTryo02 = null;
        }
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo02);
        Measurable measurable7 = (Measurable) AbstractC8778f0.m14568n0(list2);
        if (measurable7 != null) {
            i10 = iHeightOrZero;
            placeableMo25627measureBRTryo03 = measurable7.mo25627measureBRTryo0(ConstraintsKt.m26871offsetNN6EwU(j12, -iWidthOrZero2, -iHeightOrZero));
        } else {
            i10 = iHeightOrZero;
            placeableMo25627measureBRTryo03 = null;
        }
        int iHeightOrZero2 = i10 + TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo03);
        boolean z10 = (placeableMo25627measureBRTryo03 == null || placeableMo25627measureBRTryo03.get(AlignmentLineKt.getFirstBaseline()) == placeableMo25627measureBRTryo03.get(AlignmentLineKt.getLastBaseline())) ? false : true;
        Measurable measurable8 = (Measurable) AbstractC8778f0.m14568n0(list4);
        Placeable placeableMo25627measureBRTryo05 = measurable8 != null ? measurable8.mo25627measureBRTryo0(ConstraintsKt.m26871offsetNN6EwU(j12, -iWidthOrZero2, -iHeightOrZero2)) : null;
        int iM22210invokeZLSjz4$material3_release = companion.m22210invokeZLSjz4$material3_release(placeableMo25627measureBRTryo05 != null, placeableMo25627measureBRTryo03 != null, z10);
        float fM22197verticalPaddingyh95HIg = ListItemKt.m22197verticalPaddingyh95HIg(iM22210invokeZLSjz4$material3_release);
        return ListItemKt.place(measureScope, ListItemKt.m22196calculateWidthyeHjK3Y(measureScope, TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo04), TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo02), TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo03), iMo20491roundToPx0680j_4, j10), ListItemKt.m22195calculateHeightN4Jib3Y(measureScope, TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo04), TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo02), TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo03), iM22210invokeZLSjz4$material3_release, measureScope.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(fM22197verticalPaddingyh95HIg * f10)), j10), placeableMo25627measureBRTryo04, placeableMo25627measureBRTryo0, placeableMo25627measureBRTryo02, placeableMo25627measureBRTryo05, placeableMo25627measureBRTryo03, ListItemType.m22202equalsimpl0(iM22210invokeZLSjz4$material3_release, companion.m22208getThreeLineAlXitO8()), measureScope.mo20491roundToPx0680j_4(listItemStartPadding), measureScope.mo20491roundToPx0680j_4(listItemEndPadding), measureScope.mo20491roundToPx0680j_4(fM22197verticalPaddingyh95HIg));
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i10, C21921.INSTANCE);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i10, C21931.INSTANCE);
    }
}
