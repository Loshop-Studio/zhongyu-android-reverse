package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.util.MathHelpersKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final InterfaceC9540l onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public OutlinedTextFieldMeasurePolicy(InterfaceC9540l interfaceC9540l, boolean z10, float f10, PaddingValues paddingValues) {
        this.onLabelMeasured = interfaceC9540l;
        this.singleLine = z10;
        this.animationProgress = f10;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10, InterfaceC9544p interfaceC9544p) {
        IntrinsicMeasurable intrinsicMeasurable;
        int iSubstractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        Object obj;
        IntrinsicMeasurable intrinsicMeasurable3;
        int iIntValue3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i11;
        Object obj2;
        Object obj3;
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i12);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i12++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable;
        if (intrinsicMeasurable5 != null) {
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(i10, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = ((Number) interfaceC9544p.invoke(intrinsicMeasurable5, Integer.valueOf(i10))).intValue();
        } else {
            iSubstractConstraintSafely = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i13);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i13++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
        if (intrinsicMeasurable6 != null) {
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = ((Number) interfaceC9544p.invoke(intrinsicMeasurable6, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i14);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj), TextFieldImplKt.LabelId)) {
                break;
            }
            i14++;
        }
        Object obj4 = (IntrinsicMeasurable) obj;
        int iIntValue4 = obj4 != null ? ((Number) interfaceC9544p.invoke(obj4, Integer.valueOf(MathHelpersKt.lerp(iSubstractConstraintSafely, i10, this.animationProgress)))).intValue() : 0;
        int size4 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i15);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i15++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
        if (intrinsicMeasurable7 != null) {
            iIntValue3 = ((Number) interfaceC9544p.invoke(intrinsicMeasurable7, Integer.valueOf(iSubstractConstraintSafely))).intValue();
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable7.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i16);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i16++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
        if (intrinsicMeasurable8 != null) {
            int iIntValue5 = ((Number) interfaceC9544p.invoke(intrinsicMeasurable8, Integer.valueOf(iSubstractConstraintSafely))).intValue();
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            i11 = iIntValue5;
        } else {
            i11 = 0;
        }
        int size6 = list.size();
        for (int i17 = 0; i17 < size6; i17++) {
            Object obj5 = list.get(i17);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.TextFieldId)) {
                int iIntValue6 = ((Number) interfaceC9544p.invoke(obj5, Integer.valueOf(iSubstractConstraintSafely))).intValue();
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i18);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i18++;
                }
                Object obj6 = (IntrinsicMeasurable) obj2;
                int iIntValue7 = obj6 != null ? ((Number) interfaceC9544p.invoke(obj6, Integer.valueOf(iSubstractConstraintSafely))).intValue() : 0;
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        obj3 = null;
                        break;
                    }
                    Object obj7 = list.get(i19);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj7), TextFieldImplKt.SupportingId)) {
                        obj3 = obj7;
                        break;
                    }
                    i19++;
                }
                Object obj8 = (IntrinsicMeasurable) obj3;
                return OutlinedTextFieldKt.m28953calculateHeightmKXJcVc(iIntValue, iIntValue2, iIntValue3, i11, iIntValue6, iIntValue4, iIntValue7, obj8 != null ? ((Number) interfaceC9544p.invoke(obj8, Integer.valueOf(i10))).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10, InterfaceC9544p interfaceC9544p) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            IntrinsicMeasurable intrinsicMeasurable7 = list.get(i11);
            if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.TextFieldId)) {
                int iIntValue = ((Number) interfaceC9544p.invoke(intrinsicMeasurable7, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i12 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i12);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LabelId)) {
                        break;
                    }
                    i12++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable8, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i13);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                    i13++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable9, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i14);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                    i14++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable10, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = list.get(i15);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i15++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable11, Integer.valueOf(i10))).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i16);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i16++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable12, Integer.valueOf(i10))).intValue() : 0;
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = list.get(i17);
                    if (AbstractC9979u.m20289b(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i17++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return OutlinedTextFieldKt.m28954calculateWidthDHJA7U0(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? ((Number) interfaceC9544p.invoke(intrinsicMeasurable14, Integer.valueOf(i10))).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return intrinsicHeight(intrinsicMeasureScope, list, i10, new InterfaceC9544p() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.maxIntrinsicHeight.1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i11) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i11));
            }
        });
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return intrinsicWidth(intrinsicMeasureScope, list, i10, new InterfaceC9544p() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.maxIntrinsicWidth.1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i11) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i11));
            }
        });
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        Measurable measurable;
        Measurable measurable2;
        Measurable measurable3;
        Measurable measurable4;
        Placeable placeable;
        Measurable measurable5;
        Measurable measurable6;
        Measurable measurable7;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        int iMo27093roundToPx0680j_4 = measureScope2.mo27093roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo27407calculateBottomPaddingD9Ej5fM());
        long jM33444copyZbe2FdA$default = Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i10);
            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i10++;
        }
        Measurable measurable8 = measurable;
        Placeable placeableMo32229measureBRTryo0 = measurable8 != null ? measurable8.mo32229measureBRTryo0(jM33444copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo0);
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo0));
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i11);
            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i11++;
        }
        Measurable measurable9 = measurable2;
        Placeable placeableMo32229measureBRTryo02 = measurable9 != null ? measurable9.mo32229measureBRTryo0(ConstraintsKt.m33474offsetNN6EwU$default(jM33444copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo02);
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo02));
        int size3 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i12);
            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i12++;
        }
        Measurable measurable10 = measurable3;
        Placeable placeableMo32229measureBRTryo03 = measurable10 != null ? measurable10.mo32229measureBRTryo0(ConstraintsKt.m33474offsetNN6EwU$default(jM33444copyZbe2FdA$default, -iWidthOrZero2, 0, 2, null)) : null;
        int iWidthOrZero3 = iWidthOrZero2 + TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo03);
        int iMax3 = Math.max(iMax2, TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo03));
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list.get(i13);
            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i13++;
        }
        Measurable measurable11 = measurable4;
        Placeable placeableMo32229measureBRTryo04 = measurable11 != null ? measurable11.mo32229measureBRTryo0(ConstraintsKt.m33474offsetNN6EwU$default(jM33444copyZbe2FdA$default, -iWidthOrZero3, 0, 2, null)) : null;
        int iWidthOrZero4 = iWidthOrZero3 + TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo04);
        int iMax4 = Math.max(iMax3, TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo04));
        int iMo27093roundToPx0680j_42 = measureScope2.mo27093roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo27408calculateLeftPaddingu2uoSUM(measureScope2.getLayoutDirection())) + measureScope2.mo27093roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo27409calculateRightPaddingu2uoSUM(measureScope2.getLayoutDirection()));
        int i14 = -iWidthOrZero4;
        int i15 = -iMo27093roundToPx0680j_4;
        long jM33473offsetNN6EwU = ConstraintsKt.m33473offsetNN6EwU(jM33444copyZbe2FdA$default, MathHelpersKt.lerp(i14 - iMo27093roundToPx0680j_42, -iMo27093roundToPx0680j_42, outlinedTextFieldMeasurePolicy.animationProgress), i15);
        int size5 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                placeable = placeableMo32229measureBRTryo0;
                measurable5 = null;
                break;
            }
            measurable5 = list.get(i16);
            int i17 = i16;
            placeable = placeableMo32229measureBRTryo0;
            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable5), TextFieldImplKt.LabelId)) {
                break;
            }
            i16 = i17 + 1;
            placeableMo32229measureBRTryo0 = placeable;
        }
        Measurable measurable12 = measurable5;
        final Placeable placeableMo32229measureBRTryo05 = measurable12 != null ? measurable12.mo32229measureBRTryo0(jM33473offsetNN6EwU) : null;
        outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(Size.m30694boximpl(placeableMo32229measureBRTryo05 != null ? SizeKt.Size(placeableMo32229measureBRTryo05.getWidth(), placeableMo32229measureBRTryo05.getHeight()) : Size.Companion.m30715getZeroNHjbRc()));
        int size6 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size6) {
                measurable6 = null;
                break;
            }
            measurable6 = list.get(i18);
            int i19 = size6;
            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i18++;
            size6 = i19;
        }
        Measurable measurable13 = measurable6;
        int iMinIntrinsicHeight = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m33456getMinWidthimpl(j10)) : 0;
        int iMax5 = Math.max(TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo05) / 2, measureScope2.mo27093roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo27410calculateTopPaddingD9Ej5fM()));
        long jM33444copyZbe2FdA$default2 = Constraints.m33444copyZbe2FdA$default(ConstraintsKt.m33473offsetNN6EwU(j10, i14, (i15 - iMax5) - iMinIntrinsicHeight), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        final Placeable placeable2 = placeableMo32229measureBRTryo03;
        int i20 = 0;
        while (i20 < size7) {
            int i21 = size7;
            Measurable measurable14 = list.get(i20);
            final Placeable placeable3 = placeableMo32229measureBRTryo04;
            final Placeable placeable4 = placeableMo32229measureBRTryo02;
            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable14), TextFieldImplKt.TextFieldId)) {
                final Placeable placeableMo32229measureBRTryo06 = measurable14.mo32229measureBRTryo0(jM33444copyZbe2FdA$default2);
                long jM33444copyZbe2FdA$default3 = Constraints.m33444copyZbe2FdA$default(jM33444copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list.get(i22);
                    int i23 = size8;
                    int i24 = i22;
                    if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i22 = i24 + 1;
                    size8 = i23;
                }
                Measurable measurable15 = measurable7;
                final Placeable placeableMo32229measureBRTryo07 = measurable15 != null ? measurable15.mo32229measureBRTryo0(jM33444copyZbe2FdA$default3) : null;
                int iMax6 = Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo06), TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo07)) + iMax5 + iMo27093roundToPx0680j_4);
                int iM28954calculateWidthDHJA7U0 = OutlinedTextFieldKt.m28954calculateWidthDHJA7U0(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeable3), placeableMo32229measureBRTryo06.getWidth(), TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo32229measureBRTryo07), outlinedTextFieldMeasurePolicy.animationProgress, j10, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int i25 = iM28954calculateWidthDHJA7U0;
                final Placeable placeableMo32229measureBRTryo08 = measurable13 != null ? measurable13.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(ConstraintsKt.m33474offsetNN6EwU$default(jM33444copyZbe2FdA$default, 0, -iMax6, 1, null), 0, iM28954calculateWidthDHJA7U0, 0, 0, 9, null)) : null;
                int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo08);
                final int iM28953calculateHeightmKXJcVc = OutlinedTextFieldKt.m28953calculateHeightmKXJcVc(TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable3), placeableMo32229measureBRTryo06.getHeight(), TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo07), TextFieldImplKt.heightOrZero(placeableMo32229measureBRTryo08), outlinedTextFieldMeasurePolicy.animationProgress, j10, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int i26 = iM28953calculateHeightmKXJcVc - iHeightOrZero;
                int size9 = list.size();
                int i27 = 0;
                while (i27 < size9) {
                    Measurable measurable16 = list.get(i27);
                    if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable16), TextFieldImplKt.ContainerId)) {
                        final Placeable placeableMo32229measureBRTryo09 = measurable16.mo32229measureBRTryo0(ConstraintsKt.Constraints(i25 != Integer.MAX_VALUE ? i25 : 0, i25, i26 != Integer.MAX_VALUE ? i26 : 0, i26));
                        final int i28 = i25;
                        final Placeable placeable5 = placeable;
                        return MeasureScope.layout$default(measureScope, i28, iM28953calculateHeightmKXJcVc, null, new InterfaceC9540l() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                OutlinedTextFieldKt.place(placementScope, iM28953calculateHeightmKXJcVc, i28, placeable5, placeable4, placeable2, placeable3, placeableMo32229measureBRTryo06, placeableMo32229measureBRTryo05, placeableMo32229measureBRTryo07, placeableMo32229measureBRTryo09, placeableMo32229measureBRTryo08, outlinedTextFieldMeasurePolicy.animationProgress, outlinedTextFieldMeasurePolicy.singleLine, measureScope2.getDensity(), measureScope2.getLayoutDirection(), outlinedTextFieldMeasurePolicy.paddingValues);
                            }
                        }, 4, null);
                    }
                    i27++;
                    outlinedTextFieldMeasurePolicy = this;
                    measureScope2 = measureScope;
                    i25 = i25;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i20++;
            outlinedTextFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            placeableMo32229measureBRTryo02 = placeable4;
            size7 = i21;
            placeableMo32229measureBRTryo04 = placeable3;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return intrinsicHeight(intrinsicMeasureScope, list, i10, new InterfaceC9544p() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.minIntrinsicHeight.1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i11) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i11));
            }
        });
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        return intrinsicWidth(intrinsicMeasureScope, list, i10, new InterfaceC9544p() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.minIntrinsicWidth.1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i11) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i11));
            }
        });
    }
}
