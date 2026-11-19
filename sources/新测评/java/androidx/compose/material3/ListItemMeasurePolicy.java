package androidx.compose.material3;

import androidx.autofill.HintConstants;
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
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u000eH\u0002JV\u0010\u000f\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u000eH\u0002J(\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J2\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u001c\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m13558d2 = {"Landroidx/compose/material3/ListItemMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "()V", "calculateIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "intrinsicMeasure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/ExtensionFunctionType;", "calculateIntrinsicWidth", "height", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,731:1\n50#2:732\n86#2:733\n86#2:734\n50#2:735\n50#2:736\n86#2:737\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n*L\n213#1:732\n243#1:733\n299#1:734\n376#1:735\n395#1:736\n433#1:737\n*E\n"})
/* loaded from: classes2.dex */
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicHeight$1 */
    public /* synthetic */ class C21611 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C21611 INSTANCE = new C21611();

        public C21611() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicWidth$1 */
    public /* synthetic */ class C21621 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C21621 INSTANCE = new C21621();

        public C21621() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1 */
    public /* synthetic */ class C21631 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C21631 INSTANCE = new C21631();

        public C21631() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicWidth$1 */
    public /* synthetic */ class C21641 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C21641 INSTANCE = new C21641();

        public C21641() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i10) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    private final int calculateIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        int iIntValue;
        int iIntValue2;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(i10, intrinsicMeasureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        if (intrinsicMeasurable != null) {
            iIntValue = function2.invoke(intrinsicMeasurable, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list6);
        if (intrinsicMeasurable2 != null) {
            iIntValue2 = function2.invoke(intrinsicMeasurable2, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int iIntValue3 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        int iIntValue4 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        int iIntValue5 = intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        int iM18953invokeZLSjz4$material3_release = ListItemType.INSTANCE.m18953invokeZLSjz4$material3_release(iIntValue3 > 0, iIntValue5 > 0, ListItemKt.isSupportingMultilineHeuristic(intrinsicMeasureScope, iIntValue5));
        return ListItemKt.m18938calculateHeightN4Jib3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iM18953invokeZLSjz4$material3_release, intrinsicMeasureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(ListItemKt.m18940verticalPaddingyh95HIg(iM18953invokeZLSjz4$material3_release) * 2)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        int iIntValue = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i10)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list6);
        int iIntValue2 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i10)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        int iIntValue3 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i10)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int iIntValue4 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i10)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        return ListItemKt.m18939calculateWidthyeHjK3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i10)).intValue() : 0, intrinsicMeasureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i10, C21611.INSTANCE);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i10, C21621.INSTANCE);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17628measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j10) {
        long j11;
        Placeable placeableMo22324measureBRTryo0;
        float f10;
        List<? extends Measurable> list2;
        long j12;
        Placeable placeableMo22324measureBRTryo02;
        int i10;
        Placeable placeableMo22324measureBRTryo03;
        List<? extends Measurable> list3 = list.get(0);
        List<? extends Measurable> list4 = list.get(1);
        List<? extends Measurable> list5 = list.get(2);
        List<? extends Measurable> list6 = list.get(3);
        List<? extends Measurable> list7 = list.get(4);
        long jM23504copyZbe2FdA$default = Constraints.m23504copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        float listItemStartPadding = ListItemKt.getListItemStartPadding();
        float listItemEndPadding = ListItemKt.getListItemEndPadding();
        int iMo17326roundToPx0680j_4 = measureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(listItemStartPadding + listItemEndPadding));
        Measurable measurable = (Measurable) CollectionsKt.firstOrNull((List) list6);
        int iMinIntrinsicWidth = measurable != null ? measurable.minIntrinsicWidth(Constraints.m23513getMaxHeightimpl(j10)) : 0;
        Measurable measurable2 = (Measurable) CollectionsKt.firstOrNull((List) list7);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(Constraints.m23514getMaxWidthimpl(jM23504copyZbe2FdA$default), iMinIntrinsicWidth + (measurable2 != null ? measurable2.minIntrinsicWidth(Constraints.m23513getMaxHeightimpl(j10)) : 0) + iMo17326roundToPx0680j_4);
        Measurable measurable3 = (Measurable) CollectionsKt.firstOrNull((List) list5);
        boolean zIsSupportingMultilineHeuristic = ListItemKt.isSupportingMultilineHeuristic(measureScope, measurable3 != null ? measurable3.minIntrinsicHeight(iSubtractConstraintSafely) : 0);
        ListItemType.Companion companion = ListItemType.INSTANCE;
        float f11 = 2;
        long jM23533offsetNN6EwU = ConstraintsKt.m23533offsetNN6EwU(jM23504copyZbe2FdA$default, -iMo17326roundToPx0680j_4, -measureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(ListItemKt.m18940verticalPaddingyh95HIg(companion.m18953invokeZLSjz4$material3_release(CollectionsKt.firstOrNull((List) list4) != null, CollectionsKt.firstOrNull((List) list5) != null, zIsSupportingMultilineHeuristic)) * f11)));
        Measurable measurable4 = (Measurable) CollectionsKt.firstOrNull((List) list6);
        Placeable placeableMo22324measureBRTryo04 = measurable4 != null ? measurable4.mo22324measureBRTryo0(jM23533offsetNN6EwU) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo22324measureBRTryo04);
        Measurable measurable5 = (Measurable) CollectionsKt.firstOrNull((List) list7);
        if (measurable5 != null) {
            j11 = jM23533offsetNN6EwU;
            placeableMo22324measureBRTryo0 = measurable5.mo22324measureBRTryo0(ConstraintsKt.m23534offsetNN6EwU$default(j11, -iWidthOrZero, 0, 2, null));
        } else {
            j11 = jM23533offsetNN6EwU;
            placeableMo22324measureBRTryo0 = null;
        }
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo22324measureBRTryo0);
        Measurable measurable6 = (Measurable) CollectionsKt.firstOrNull((List) list3);
        if (measurable6 != null) {
            list2 = list5;
            f10 = f11;
            j12 = j11;
            placeableMo22324measureBRTryo02 = measurable6.mo22324measureBRTryo0(ConstraintsKt.m23534offsetNN6EwU$default(j11, -iWidthOrZero2, 0, 2, null));
        } else {
            f10 = f11;
            list2 = list5;
            j12 = j11;
            placeableMo22324measureBRTryo02 = null;
        }
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo22324measureBRTryo02);
        Measurable measurable7 = (Measurable) CollectionsKt.firstOrNull((List) list2);
        if (measurable7 != null) {
            i10 = iHeightOrZero;
            placeableMo22324measureBRTryo03 = measurable7.mo22324measureBRTryo0(ConstraintsKt.m23533offsetNN6EwU(j12, -iWidthOrZero2, -iHeightOrZero));
        } else {
            i10 = iHeightOrZero;
            placeableMo22324measureBRTryo03 = null;
        }
        int iHeightOrZero2 = i10 + TextFieldImplKt.heightOrZero(placeableMo22324measureBRTryo03);
        boolean z9 = (placeableMo22324measureBRTryo03 == null || placeableMo22324measureBRTryo03.get(AlignmentLineKt.getFirstBaseline()) == placeableMo22324measureBRTryo03.get(AlignmentLineKt.getLastBaseline())) ? false : true;
        Measurable measurable8 = (Measurable) CollectionsKt.firstOrNull((List) list4);
        Placeable placeableMo22324measureBRTryo05 = measurable8 != null ? measurable8.mo22324measureBRTryo0(ConstraintsKt.m23533offsetNN6EwU(j12, -iWidthOrZero2, -iHeightOrZero2)) : null;
        int iM18953invokeZLSjz4$material3_release = companion.m18953invokeZLSjz4$material3_release(placeableMo22324measureBRTryo05 != null, placeableMo22324measureBRTryo03 != null, z9);
        float fM18940verticalPaddingyh95HIg = ListItemKt.m18940verticalPaddingyh95HIg(iM18953invokeZLSjz4$material3_release);
        return ListItemKt.place(measureScope, ListItemKt.m18939calculateWidthyeHjK3Y(measureScope, TextFieldImplKt.widthOrZero(placeableMo22324measureBRTryo04), TextFieldImplKt.widthOrZero(placeableMo22324measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo22324measureBRTryo02), TextFieldImplKt.widthOrZero(placeableMo22324measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo22324measureBRTryo03), iMo17326roundToPx0680j_4, j10), ListItemKt.m18938calculateHeightN4Jib3Y(measureScope, TextFieldImplKt.heightOrZero(placeableMo22324measureBRTryo04), TextFieldImplKt.heightOrZero(placeableMo22324measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo22324measureBRTryo02), TextFieldImplKt.heightOrZero(placeableMo22324measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo22324measureBRTryo03), iM18953invokeZLSjz4$material3_release, measureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(fM18940verticalPaddingyh95HIg * f10)), j10), placeableMo22324measureBRTryo04, placeableMo22324measureBRTryo0, placeableMo22324measureBRTryo02, placeableMo22324measureBRTryo05, placeableMo22324measureBRTryo03, ListItemType.m18945equalsimpl0(iM18953invokeZLSjz4$material3_release, companion.m18951getThreeLineAlXitO8()), measureScope.mo17326roundToPx0680j_4(listItemStartPadding), measureScope.mo17326roundToPx0680j_4(listItemEndPadding), measureScope.mo17326roundToPx0680j_4(fM18940verticalPaddingyh95HIg));
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i10, C21631.INSTANCE);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i10, C21641.INSTANCE);
    }
}
