package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.LayoutIdKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z10, float f10, PaddingValues paddingValues) {
        this.singleLine = z10;
        this.animationProgress = f10;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10, InterfaceC10574p interfaceC10574p) {
        IntrinsicMeasurable intrinsicMeasurable;
        int i11;
        int iSubstractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        Object obj;
        IntrinsicMeasurable intrinsicMeasurable3;
        int iIntValue3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i12;
        Object obj2;
        Object obj3;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i13);
            if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i13++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable;
        if (intrinsicMeasurable5 != null) {
            i11 = i10;
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(i11, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = ((Number) interfaceC10574p.invoke(intrinsicMeasurable5, Integer.valueOf(i11))).intValue();
        } else {
            i11 = i10;
            iSubstractConstraintSafely = i11;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i14);
            if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i14++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
        if (intrinsicMeasurable6 != null) {
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = ((Number) interfaceC10574p.invoke(intrinsicMeasurable6, Integer.valueOf(i11))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj), TextFieldImplKt.LabelId)) {
                break;
            }
            i15++;
        }
        Object obj4 = (IntrinsicMeasurable) obj;
        int iIntValue4 = obj4 != null ? ((Number) interfaceC10574p.invoke(obj4, Integer.valueOf(iSubstractConstraintSafely))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i16);
            if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i16++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
        if (intrinsicMeasurable7 != null) {
            iIntValue3 = ((Number) interfaceC10574p.invoke(intrinsicMeasurable7, Integer.valueOf(iSubstractConstraintSafely))).intValue();
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable7.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i17);
            if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i17++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
        if (intrinsicMeasurable8 != null) {
            int iIntValue5 = ((Number) interfaceC10574p.invoke(intrinsicMeasurable8, Integer.valueOf(iSubstractConstraintSafely))).intValue();
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            i12 = iIntValue5;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            Object obj5 = list.get(i18);
            if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.TextFieldId)) {
                int iIntValue6 = ((Number) interfaceC10574p.invoke(obj5, Integer.valueOf(iSubstractConstraintSafely))).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i19);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i19++;
                }
                Object obj6 = (IntrinsicMeasurable) obj2;
                int iIntValue7 = obj6 != null ? ((Number) interfaceC10574p.invoke(obj6, Integer.valueOf(iSubstractConstraintSafely))).intValue() : 0;
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i20);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                    i20++;
                }
                Object obj7 = (IntrinsicMeasurable) obj3;
                return TextFieldKt.m22696calculateHeightmKXJcVc(iIntValue6, iIntValue4, iIntValue, iIntValue2, iIntValue3, i12, iIntValue7, obj7 != null ? ((Number) interfaceC10574p.invoke(obj7, Integer.valueOf(i11))).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i10, InterfaceC10574p interfaceC10574p) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            IntrinsicMeasurable intrinsicMeasurable7 = list.get(i11);
            if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.TextFieldId)) {
                int iIntValue = ((Number) interfaceC10574p.invoke(intrinsicMeasurable7, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i12 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i12);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LabelId)) {
                        break;
                    }
                    i12++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable8, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i13);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                    i13++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable9, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i14);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i14++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable10, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = list.get(i15);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i15++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable11, Integer.valueOf(i10))).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i16);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                    i16++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable12, Integer.valueOf(i10))).intValue() : 0;
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = list.get(i17);
                    if (AbstractC9133u.m16128b(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i17++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return TextFieldKt.m22697calculateWidthyeHjK3Y(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? ((Number) interfaceC10574p.invoke(intrinsicMeasurable14, Integer.valueOf(i10))).intValue() : 0, TextFieldImplKt.getZeroConstraints());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return intrinsicHeight(intrinsicMeasureScope, list, i10, new InterfaceC10574p() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicHeight.1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i11) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i11));
            }
        });
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return intrinsicWidth(list, i10, new InterfaceC10574p() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicWidth.1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i11) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i11));
            }
        });
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        Measurable measurable;
        Measurable measurable2;
        long j11;
        Placeable placeableMo25627measureBRTryo0;
        Measurable measurable3;
        Measurable measurable4;
        int i10;
        final Placeable placeable;
        Placeable placeable2;
        long j12;
        Placeable placeableMo25627measureBRTryo02;
        Placeable placeable3;
        Measurable measurable5;
        Placeable placeable4;
        Measurable measurable6;
        Placeable placeable5;
        Measurable measurable7;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        final int iMo20491roundToPx0680j_4 = measureScope2.mo20491roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.mo20808calculateTopPaddingD9Ej5fM());
        int iMo20491roundToPx0680j_42 = measureScope2.mo20491roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.mo20805calculateBottomPaddingD9Ej5fM());
        long jM26842copyZbe2FdA$default = Constraints.m26842copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                measurable = null;
                break;
            }
            measurable = list2.get(i11);
            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i11++;
        }
        Measurable measurable8 = measurable;
        Placeable placeableMo25627measureBRTryo03 = measurable8 != null ? measurable8.mo25627measureBRTryo0(jM26842copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo03);
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo03));
        int size2 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list2.get(i12);
            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i12++;
        }
        Measurable measurable9 = measurable2;
        if (measurable9 != null) {
            j11 = jM26842copyZbe2FdA$default;
            placeableMo25627measureBRTryo0 = measurable9.mo25627measureBRTryo0(ConstraintsKt.m26872offsetNN6EwU$default(j11, -iWidthOrZero, 0, 2, null));
        } else {
            j11 = jM26842copyZbe2FdA$default;
            placeableMo25627measureBRTryo0 = null;
        }
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo0);
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo0));
        int size3 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list2.get(i13);
            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i13++;
        }
        Measurable measurable10 = measurable3;
        final Placeable placeableMo25627measureBRTryo04 = measurable10 != null ? measurable10.mo25627measureBRTryo0(ConstraintsKt.m26872offsetNN6EwU$default(j11, -iWidthOrZero2, 0, 2, null)) : null;
        int iWidthOrZero3 = iWidthOrZero2 + TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo04);
        int iMax3 = Math.max(iMax2, TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo04));
        int size4 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list2.get(i14);
            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i14++;
        }
        Measurable measurable11 = measurable4;
        if (measurable11 != null) {
            placeable = placeableMo25627measureBRTryo0;
            i10 = iWidthOrZero3;
            placeable2 = placeableMo25627measureBRTryo03;
            j12 = j11;
            placeableMo25627measureBRTryo02 = measurable11.mo25627measureBRTryo0(ConstraintsKt.m26872offsetNN6EwU$default(j11, -iWidthOrZero3, 0, 2, null));
        } else {
            i10 = iWidthOrZero3;
            placeable = placeableMo25627measureBRTryo0;
            placeable2 = placeableMo25627measureBRTryo03;
            j12 = j11;
            placeableMo25627measureBRTryo02 = null;
        }
        int iWidthOrZero4 = TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo02) + i10;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo02));
        int i15 = -iWidthOrZero4;
        long jM26871offsetNN6EwU = ConstraintsKt.m26871offsetNN6EwU(j12, i15, -iMo20491roundToPx0680j_42);
        int size5 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                placeable3 = placeableMo25627measureBRTryo02;
                measurable5 = null;
                break;
            }
            measurable5 = list2.get(i16);
            int i17 = i16;
            placeable3 = placeableMo25627measureBRTryo02;
            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable5), TextFieldImplKt.LabelId)) {
                break;
            }
            i16 = i17 + 1;
            placeableMo25627measureBRTryo02 = placeable3;
        }
        Measurable measurable12 = measurable5;
        Placeable placeableMo25627measureBRTryo05 = measurable12 != null ? measurable12.mo25627measureBRTryo0(jM26871offsetNN6EwU) : null;
        int size6 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size6) {
                placeable4 = placeableMo25627measureBRTryo05;
                measurable6 = null;
                break;
            }
            measurable6 = list2.get(i18);
            placeable4 = placeableMo25627measureBRTryo05;
            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i18++;
            placeableMo25627measureBRTryo05 = placeable4;
        }
        Measurable measurable13 = measurable6;
        int iMinIntrinsicHeight = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m26854getMinWidthimpl(j10)) : 0;
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeable4) + iMo20491roundToPx0680j_4;
        long j13 = j12;
        long jM26871offsetNN6EwU2 = ConstraintsKt.m26871offsetNN6EwU(Constraints.m26842copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null), i15, ((-iHeightOrZero) - iMo20491roundToPx0680j_42) - iMinIntrinsicHeight);
        int size7 = list2.size();
        int i19 = 0;
        while (i19 < size7) {
            Measurable measurable14 = list2.get(i19);
            int i20 = size7;
            int i21 = iHeightOrZero;
            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable14), TextFieldImplKt.TextFieldId)) {
                Placeable placeableMo25627measureBRTryo06 = measurable14.mo25627measureBRTryo0(jM26871offsetNN6EwU2);
                long jM26842copyZbe2FdA$default2 = Constraints.m26842copyZbe2FdA$default(jM26871offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        placeable5 = placeableMo25627measureBRTryo06;
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list2.get(i22);
                    placeable5 = placeableMo25627measureBRTryo06;
                    int i23 = size8;
                    if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i22++;
                    size8 = i23;
                    placeableMo25627measureBRTryo06 = placeable5;
                }
                Measurable measurable15 = measurable7;
                final Placeable placeableMo25627measureBRTryo07 = measurable15 != null ? measurable15.mo25627measureBRTryo0(jM26842copyZbe2FdA$default2) : null;
                int iMax5 = Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeable5), TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo07)) + i21 + iMo20491roundToPx0680j_42);
                int iM22697calculateWidthyeHjK3Y = TextFieldKt.m22697calculateWidthyeHjK3Y(TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo04), TextFieldImplKt.widthOrZero(placeable3), placeable5.getWidth(), TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeableMo25627measureBRTryo07), j10);
                int i24 = iM22697calculateWidthyeHjK3Y;
                final Placeable placeableMo25627measureBRTryo08 = measurable13 != null ? measurable13.mo25627measureBRTryo0(Constraints.m26842copyZbe2FdA$default(ConstraintsKt.m26872offsetNN6EwU$default(j13, 0, -iMax5, 1, null), 0, iM22697calculateWidthyeHjK3Y, 0, 0, 9, null)) : null;
                int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo08);
                int iM22696calculateHeightmKXJcVc = TextFieldKt.m22696calculateHeightmKXJcVc(placeable5.getHeight(), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo04), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo07), TextFieldImplKt.heightOrZero(placeableMo25627measureBRTryo08), textFieldMeasurePolicy.animationProgress, j10, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                int i25 = iM22696calculateHeightmKXJcVc - iHeightOrZero2;
                int size9 = list2.size();
                int i26 = 0;
                while (i26 < size9) {
                    Measurable measurable16 = list2.get(i26);
                    final int i27 = iM22696calculateHeightmKXJcVc;
                    if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable16), TextFieldImplKt.ContainerId)) {
                        final Placeable placeableMo25627measureBRTryo09 = measurable16.mo25627measureBRTryo0(ConstraintsKt.Constraints(i24 != Integer.MAX_VALUE ? i24 : 0, i24, i25 != Integer.MAX_VALUE ? i25 : 0, i25));
                        final int i28 = i24;
                        final Placeable placeable6 = placeable2;
                        final Placeable placeable7 = placeable3;
                        final Placeable placeable8 = placeable4;
                        final Placeable placeable9 = placeable5;
                        return MeasureScope.layout$default(measureScope, i28, i27, null, new InterfaceC10570l() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p300x7.InterfaceC10570l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C8736p.f16368a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                Placeable placeable10 = placeable8;
                                if (placeable10 == null) {
                                    TextFieldKt.placeWithoutLabel(placementScope, i28, i27, placeable9, placeableMo25627measureBRTryo07, placeable6, placeable, placeableMo25627measureBRTryo04, placeable7, placeableMo25627measureBRTryo09, placeableMo25627measureBRTryo08, textFieldMeasurePolicy.singleLine, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                                    return;
                                }
                                int i29 = i28;
                                int i30 = i27;
                                Placeable placeable11 = placeable9;
                                Placeable placeable12 = placeableMo25627measureBRTryo07;
                                Placeable placeable13 = placeable6;
                                Placeable placeable14 = placeable;
                                Placeable placeable15 = placeableMo25627measureBRTryo04;
                                Placeable placeable16 = placeable7;
                                Placeable placeable17 = placeableMo25627measureBRTryo09;
                                Placeable placeable18 = placeableMo25627measureBRTryo08;
                                boolean z10 = textFieldMeasurePolicy.singleLine;
                                int i31 = iMo20491roundToPx0680j_4;
                                TextFieldKt.placeWithLabel(placementScope, i29, i30, placeable11, placeable10, placeable12, placeable13, placeable14, placeable15, placeable16, placeable17, placeable18, z10, i31, i31 + placeable8.getHeight(), textFieldMeasurePolicy.animationProgress, measureScope2.getDensity());
                            }
                        }, 4, null);
                    }
                    i26++;
                    i24 = i24;
                    iM22696calculateHeightmKXJcVc = i27;
                    textFieldMeasurePolicy = this;
                    measureScope2 = measureScope;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i19++;
            textFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            iHeightOrZero = i21;
            jM26871offsetNN6EwU2 = jM26871offsetNN6EwU2;
            size7 = i20;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return intrinsicHeight(intrinsicMeasureScope, list, i10, new InterfaceC10574p() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicHeight.1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i11) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i11));
            }
        });
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return intrinsicWidth(list, i10, new InterfaceC10574p() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicWidth.1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i11) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i11));
            }
        });
    }
}
