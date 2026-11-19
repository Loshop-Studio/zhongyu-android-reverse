package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p006ui.layout.AlignmentLineKt;
import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.LayoutIdKt;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J/\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m5175d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z3, float f4, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.singleLine = z3;
        this.animationProgress = f4;
        this.paddingValues = paddingValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i4, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TextFieldId)) {
                int iIntValue = function2.invoke(obj2, Integer.valueOf(i4)).intValue();
                Iterator<T> it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i4)).intValue() : 0;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next2), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i4)).intValue() : 0;
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next3), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i4)).intValue() : 0;
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next4), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) next4;
                int iIntValue5 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i4)).intValue() : 0;
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next5 = it5.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next5), TextFieldImplKt.SupportingId)) {
                        obj = next5;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj;
                return TextFieldKt.m8209calculateHeightjCXOeKk(iIntValue, iIntValue2 > 0, iIntValue2, iIntValue4, iIntValue3, iIntValue5, intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i4)).intValue() : 0, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> measurables, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasurer) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        for (Object obj2 : measurables) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TextFieldId)) {
                int iIntValue = intrinsicMeasurer.invoke(obj2, Integer.valueOf(height)).intValue();
                Iterator<T> it = measurables.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable != null ? intrinsicMeasurer.invoke(intrinsicMeasurable, Integer.valueOf(height)).intValue() : 0;
                Iterator<T> it2 = measurables.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next2), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable2, Integer.valueOf(height)).intValue() : 0;
                Iterator<T> it3 = measurables.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next3), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable3, Integer.valueOf(height)).intValue() : 0;
                Iterator<T> it4 = measurables.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next4 = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next4), TextFieldImplKt.PlaceholderId)) {
                        obj = next4;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return TextFieldKt.m8210calculateWidthVsPV1Ek(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable4, Integer.valueOf(height)).intValue() : 0, TextFieldImplKt.getZeroConstraints());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p006ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i4, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i5));
            }
        });
    }

    @Override // androidx.compose.p006ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i4, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i5));
            }
        });
    }

    @Override // androidx.compose.p006ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6928measure3p2s80s(final MeasureScope measure, List<? extends Measurable> measurables, long j4) {
        Object next;
        Object next2;
        Object next3;
        int height;
        Object obj;
        Object next4;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        final int iMo7200roundToPx0680j_4 = measure.mo7200roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getTop());
        int iMo7200roundToPx0680j_42 = measure.mo7200roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getBottom());
        final int iMo7200roundToPx0680j_43 = measure.mo7200roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        long jM11484copyZbe2FdA$default = Constraints.m11484copyZbe2FdA$default(j4, 0, 0, 0, 0, 10, null);
        Iterator<T> it = measurables.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), TextFieldImplKt.LeadingId)) {
                break;
            }
        }
        Measurable measurable = (Measurable) next;
        final Placeable placeableMo10585measureBRTryo0 = measurable != null ? measurable.mo10585measureBRTryo0(jM11484copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo10585measureBRTryo0) + 0;
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo10585measureBRTryo0));
        Iterator<T> it2 = measurables.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next2), TextFieldImplKt.TrailingId)) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) next2;
        Placeable placeableMo10585measureBRTryo02 = measurable2 != null ? measurable2.mo10585measureBRTryo0(ConstraintsKt.m11510offsetNN6EwU$default(jM11484copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo10585measureBRTryo02);
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo10585measureBRTryo02));
        int i4 = -iWidthOrZero2;
        long jM11509offsetNN6EwU = ConstraintsKt.m11509offsetNN6EwU(jM11484copyZbe2FdA$default, i4, -iMo7200roundToPx0680j_42);
        Iterator<T> it3 = measurables.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next3), TextFieldImplKt.LabelId)) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) next3;
        Placeable placeableMo10585measureBRTryo03 = measurable3 != null ? measurable3.mo10585measureBRTryo0(jM11509offsetNN6EwU) : null;
        if (placeableMo10585measureBRTryo03 != null) {
            height = placeableMo10585measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
            if (height == Integer.MIN_VALUE) {
                height = placeableMo10585measureBRTryo03.getHeight();
            }
        } else {
            height = 0;
        }
        final int iMax3 = Math.max(height, iMo7200roundToPx0680j_4);
        int i5 = placeableMo10585measureBRTryo03 != null ? iMax3 + iMo7200roundToPx0680j_43 : iMo7200roundToPx0680j_4;
        long jM11509offsetNN6EwU2 = ConstraintsKt.m11509offsetNN6EwU(Constraints.m11484copyZbe2FdA$default(j4, 0, 0, 0, 0, 11, null), i4, (-i5) - iMo7200roundToPx0680j_42);
        Iterator it4 = measurables.iterator();
        while (it4.hasNext()) {
            Measurable measurable4 = (Measurable) it4.next();
            Iterator it5 = it4;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.TextFieldId)) {
                final Placeable placeableMo10585measureBRTryo04 = measurable4.mo10585measureBRTryo0(jM11509offsetNN6EwU2);
                long jM11484copyZbe2FdA$default2 = Constraints.m11484copyZbe2FdA$default(jM11509offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                Iterator it6 = measurables.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next5 = it6.next();
                    Iterator it7 = it6;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next5), TextFieldImplKt.PlaceholderId)) {
                        obj = next5;
                        break;
                    }
                    it6 = it7;
                }
                Measurable measurable5 = (Measurable) obj;
                Placeable placeableMo10585measureBRTryo05 = measurable5 != null ? measurable5.mo10585measureBRTryo0(jM11484copyZbe2FdA$default2) : null;
                long jM11484copyZbe2FdA$default3 = Constraints.m11484copyZbe2FdA$default(ConstraintsKt.m11510offsetNN6EwU$default(jM11484copyZbe2FdA$default, 0, -Math.max(iMax2, Math.max(TextFieldImplKt.heightOrZero(placeableMo10585measureBRTryo04), TextFieldImplKt.heightOrZero(placeableMo10585measureBRTryo05)) + i5 + iMo7200roundToPx0680j_42), 1, null), 0, 0, 0, 0, 11, null);
                Iterator<T> it8 = measurables.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it8.next();
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next4), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                }
                Measurable measurable6 = (Measurable) next4;
                final Placeable placeableMo10585measureBRTryo06 = measurable6 != null ? measurable6.mo10585measureBRTryo0(jM11484copyZbe2FdA$default3) : null;
                int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo10585measureBRTryo06);
                final int iM8210calculateWidthVsPV1Ek = TextFieldKt.m8210calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(placeableMo10585measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo10585measureBRTryo02), placeableMo10585measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(placeableMo10585measureBRTryo03), TextFieldImplKt.widthOrZero(placeableMo10585measureBRTryo05), j4);
                final int iM8209calculateHeightjCXOeKk = TextFieldKt.m8209calculateHeightjCXOeKk(placeableMo10585measureBRTryo04.getHeight(), placeableMo10585measureBRTryo03 != null, iMax3, TextFieldImplKt.heightOrZero(placeableMo10585measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo10585measureBRTryo02), TextFieldImplKt.heightOrZero(placeableMo10585measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo10585measureBRTryo06), j4, measure.getDensity(), textFieldMeasurePolicy.paddingValues);
                int i6 = iM8209calculateHeightjCXOeKk - iHeightOrZero;
                for (Measurable measurable7 : measurables) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.ContainerId)) {
                        final Placeable placeableMo10585measureBRTryo07 = measurable7.mo10585measureBRTryo0(ConstraintsKt.Constraints(iM8210calculateWidthVsPV1Ek != Integer.MAX_VALUE ? iM8210calculateWidthVsPV1Ek : 0, iM8210calculateWidthVsPV1Ek, i6 != Integer.MAX_VALUE ? i6 : 0, i6));
                        final Placeable placeable = placeableMo10585measureBRTryo03;
                        final int i7 = height;
                        final Placeable placeable2 = placeableMo10585measureBRTryo05;
                        final Placeable placeable3 = placeableMo10585measureBRTryo02;
                        return MeasureScope.CC.m634p(measure, iM8210calculateWidthVsPV1Ek, iM8209calculateHeightjCXOeKk, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                if (placeable == null) {
                                    TextFieldKt.placeWithoutLabel(layout, iM8210calculateWidthVsPV1Ek, iM8209calculateHeightjCXOeKk, placeableMo10585measureBRTryo04, placeable2, placeableMo10585measureBRTryo0, placeable3, placeableMo10585measureBRTryo07, placeableMo10585measureBRTryo06, this.singleLine, measure.getDensity(), this.paddingValues);
                                    return;
                                }
                                int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(iMo7200roundToPx0680j_4 - i7, 0);
                                TextFieldKt.placeWithLabel(layout, iM8210calculateWidthVsPV1Ek, iM8209calculateHeightjCXOeKk, placeableMo10585measureBRTryo04, placeable, placeable2, placeableMo10585measureBRTryo0, placeable3, placeableMo10585measureBRTryo07, placeableMo10585measureBRTryo06, this.singleLine, iCoerceAtLeast, iMo7200roundToPx0680j_43 + iMax3, this.animationProgress, measure.getDensity());
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            textFieldMeasurePolicy = this;
            it4 = it5;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p006ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i4, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i5));
            }
        });
    }

    @Override // androidx.compose.p006ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i4, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i5));
            }
        });
    }
}
