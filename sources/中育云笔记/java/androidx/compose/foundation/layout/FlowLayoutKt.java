package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p265nd.C10405j;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10976v;

/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.Companion;
        Alignment.Companion companion2 = Alignment.Companion;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(androidx.compose.p014ui.Modifier r24, androidx.compose.foundation.layout.Arrangement.Vertical r25, androidx.compose.foundation.layout.Arrangement.Horizontal r26, androidx.compose.ui.Alignment.Horizontal r27, int r28, int r29, androidx.compose.foundation.layout.FlowColumnOverflow r30, final p181hd.InterfaceC9545q r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(androidx.compose.p014ui.Modifier r24, androidx.compose.foundation.layout.Arrangement.Horizontal r25, androidx.compose.foundation.layout.Arrangement.Vertical r26, androidx.compose.ui.Alignment.Vertical r27, int r28, int r29, androidx.compose.foundation.layout.FlowRowOverflow r30, final p181hd.InterfaceC9545q r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m27382breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f10, float f11, long j10, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i12;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        MutableIntObjectMap mutableIntObjectMap;
        int i13;
        int i14;
        MeasureScope measureScope2;
        FlowLineMeasurePolicy flowLineMeasurePolicy2;
        int[] iArr;
        int[] iArr2;
        long j11;
        int height;
        int width;
        int i15;
        MutableIntObjectMap mutableIntObjectMap2;
        IntIntPair intIntPairM26722boximpl;
        MutableIntList mutableIntList;
        MutableIntList mutableIntList2;
        int i16;
        int i17;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i18;
        int i19;
        int i20;
        MeasureScope measureScope3 = measureScope;
        FlowLineMeasurePolicy flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        Iterator<? extends Measurable> it2 = it;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
        int iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(j10);
        int iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(measureScope3.mo27099toPx0680j_4(f10));
        int iCeil2 = (int) Math.ceil(measureScope3.mo27099toPx0680j_4(f11));
        long jM27425constructorimpl = OrientationIndependentConstraints.m27425constructorimpl(0, iM33454getMaxWidthimpl, 0, iM33453getMaxHeightimpl);
        long jM27440toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m27440toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m27429copyyUG9Ft0$default(jM27425constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy3.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        FlowLineInfo flowLineInfo = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope3.mo27096toDpu2uoSUM(iM33454getMaxWidthimpl), measureScope3.mo27096toDpu2uoSUM(iM33453getMaxHeightimpl), null) : null;
        Measurable measurableSafeNext = !it2.hasNext() ? null : safeNext(it2, flowLineInfo);
        IntIntPair intIntPairM26722boximpl2 = measurableSafeNext != null ? IntIntPair.m26722boximpl(m27383measureAndCacherqJ1uqs(measurableSafeNext, flowLineMeasurePolicy3, jM27440toBoxConstraintsOenEA2s, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable placeable) {
                ref$ObjectRef.f23402c = placeable;
            }
        })) : null;
        Integer numValueOf = intIntPairM26722boximpl2 != null ? Integer.valueOf(IntIntPair.m26729getFirstimpl(intIntPairM26722boximpl2.m26733unboximpl())) : null;
        Integer numValueOf2 = intIntPairM26722boximpl2 != null ? Integer.valueOf(IntIntPair.m26730getSecondimpl(intIntPairM26722boximpl2.m26733unboximpl())) : null;
        Integer num = numValueOf;
        Measurable measurable = measurableSafeNext;
        MutableIntList mutableIntList3 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList4 = new MutableIntList(0, 1, null);
        FlowLineInfo flowLineInfo2 = flowLineInfo;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i10, flowLayoutOverflowState, j10, i11, iCeil, iCeil2, null);
        int i21 = iCeil;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfoM27380getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m27380getWrapInfoOpUlnko(it2.hasNext(), 0, IntIntPair.m26725constructorimpl(iM33454getMaxWidthimpl, iM33453getMaxHeightimpl), intIntPairM26722boximpl2, 0, 0, 0, false, false);
        if (wrapInfoM27380getWrapInfoOpUlnko.isLastItemInContainer()) {
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM27380getWrapInfoOpUlnko, intIntPairM26722boximpl2 != null, -1, 0, iM33454getMaxWidthimpl, 0);
            i12 = iM33454getMaxWidthimpl;
        } else {
            i12 = iM33454getMaxWidthimpl;
            wrapEllipsisInfo = null;
        }
        Integer numValueOf3 = num;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = wrapInfoM27380getWrapInfoOpUlnko;
        int i26 = 0;
        int i27 = iM33456getMinWidthimpl;
        MutableIntList mutableIntList5 = mutableIntList3;
        int i28 = iM33453getMaxHeightimpl;
        int i29 = 0;
        int i30 = i12;
        Measurable measurableSafeNext2 = measurable;
        while (!wrapInfo.isLastItemInContainer() && measurableSafeNext2 != null) {
            AbstractC9979u.m20291d(numValueOf3);
            int iIntValue = numValueOf3.intValue();
            AbstractC9979u.m20291d(numValueOf2);
            MutableIntList mutableIntList6 = mutableIntList4;
            int i31 = i12;
            int i32 = i23 + iIntValue;
            int iMax = Math.max(i22, numValueOf2.intValue());
            int i33 = i30 - iIntValue;
            int i34 = i29 + 1;
            int i35 = i27;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i34);
            arrayList.add(measurableSafeNext2);
            mutableIntObjectMapMutableIntObjectMapOf.set(i29, ref$ObjectRef.f23402c);
            int i36 = i34 - i24;
            boolean z10 = i36 < i10;
            if (flowLineInfo2 != null) {
                if (z10) {
                    i15 = i36;
                    i18 = i26;
                } else {
                    i15 = i36;
                    i18 = i26 + 1;
                }
                int i37 = z10 ? i15 : 0;
                if (z10) {
                    int i38 = i33 - i21;
                    i19 = i38 < 0 ? 0 : i38;
                } else {
                    i19 = i31;
                }
                float fMo27096toDpu2uoSUM = measureScope3.mo27096toDpu2uoSUM(i19);
                if (z10) {
                    mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
                    i20 = i28;
                } else {
                    int i39 = (i28 - iMax) - iCeil2;
                    mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
                    i20 = i39 < 0 ? 0 : i39;
                }
                flowLineInfo2.m27393update4j6BHR0$foundation_layout_release(i18, i37, fMo27096toDpu2uoSUM, measureScope3.mo27096toDpu2uoSUM(i20));
            } else {
                i15 = i36;
                mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
            }
            measurableSafeNext2 = !it2.hasNext() ? null : safeNext(it2, flowLineInfo2);
            ref$ObjectRef.f23402c = null;
            IntIntPair intIntPairM26722boximpl3 = measurableSafeNext2 != null ? IntIntPair.m26722boximpl(m27383measureAndCacherqJ1uqs(measurableSafeNext2, flowLineMeasurePolicy3, jM27440toBoxConstraintsOenEA2s, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(Placeable placeable) {
                    ref$ObjectRef.f23402c = placeable;
                }
            })) : null;
            Integer numValueOf4 = intIntPairM26722boximpl3 != null ? Integer.valueOf(IntIntPair.m26729getFirstimpl(intIntPairM26722boximpl3.m26733unboximpl()) + i21) : null;
            numValueOf2 = intIntPairM26722boximpl3 != null ? Integer.valueOf(IntIntPair.m26730getSecondimpl(intIntPairM26722boximpl3.m26733unboximpl())) : null;
            boolean zHasNext = it2.hasNext();
            int i40 = i26;
            long jM26725constructorimpl = IntIntPair.m26725constructorimpl(i33, i28);
            if (intIntPairM26722boximpl3 == null) {
                intIntPairM26722boximpl = null;
            } else {
                AbstractC9979u.m20291d(numValueOf4);
                int iIntValue2 = numValueOf4.intValue();
                AbstractC9979u.m20291d(numValueOf2);
                intIntPairM26722boximpl = IntIntPair.m26722boximpl(IntIntPair.m26725constructorimpl(iIntValue2, numValueOf2.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM27380getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m27380getWrapInfoOpUlnko(zHasNext, i15, jM26725constructorimpl, intIntPairM26722boximpl, i40, i25, iMax, false, false);
            if (wrapInfoM27380getWrapInfoOpUlnko2.isLastItemInLine()) {
                int iMin = Math.min(Math.max(i35, i32), i31);
                int i41 = i25 + iMax;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM27380getWrapInfoOpUlnko2, intIntPairM26722boximpl3 != null, i40, i41, i33, i15);
                mutableIntList = mutableIntList6;
                mutableIntList.add(iMax);
                int i42 = (iM33453getMaxHeightimpl - i41) - iCeil2;
                MutableIntList mutableIntList7 = mutableIntList5;
                mutableIntList7.add(i34);
                i26 = i40 + 1;
                i25 = i41 + iCeil2;
                i30 = i31;
                i31 = i30;
                numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i21) : null;
                i24 = i34;
                i16 = i42;
                wrapEllipsisInfo2 = wrapEllipsisInfo4;
                i27 = iMin;
                mutableIntList2 = mutableIntList7;
                i17 = 0;
                i32 = 0;
            } else {
                mutableIntList = mutableIntList6;
                mutableIntList2 = mutableIntList5;
                numValueOf3 = numValueOf4;
                i30 = i33;
                i26 = i40;
                i27 = i35;
                i16 = i28;
                i17 = iMax;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            mutableIntList5 = mutableIntList2;
            i22 = i17;
            i28 = i16;
            i29 = i34;
            wrapInfo = wrapInfoM27380getWrapInfoOpUlnko2;
            it2 = it;
            mutableIntList4 = mutableIntList;
            mutableIntObjectMapMutableIntObjectMapOf = mutableIntObjectMap2;
            i23 = i32;
            i12 = i31;
        }
        MutableIntObjectMap mutableIntObjectMap3 = mutableIntObjectMapMutableIntObjectMapOf;
        int i43 = i27;
        MutableIntList mutableIntList8 = mutableIntList4;
        MutableIntList mutableIntList9 = mutableIntList5;
        if (wrapEllipsisInfo3 != null) {
            arrayList.add(wrapEllipsisInfo3.getEllipsis());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.set(arrayList.size() - 1, wrapEllipsisInfo3.getPlaceable());
            int i44 = mutableIntList9._size - 1;
            if (wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                int i45 = mutableIntList9._size - 1;
                mutableIntList8.set(i44, Math.max(mutableIntList8.get(i44), IntIntPair.m26730getSecondimpl(wrapEllipsisInfo3.m27381getEllipsisSizeOO21N7I())));
                mutableIntList9.set(i45, mutableIntList9.last() + 1);
            } else {
                mutableIntList8.add(IntIntPair.m26730getSecondimpl(wrapEllipsisInfo3.m27381getEllipsisSizeOO21N7I()));
                mutableIntList9.add(mutableIntList9.last() + 1);
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
        }
        int size = arrayList.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i46 = 0; i46 < size; i46++) {
            placeableArr[i46] = mutableIntObjectMap.get(i46);
        }
        int i47 = mutableIntList9._size;
        int[] iArr3 = new int[i47];
        int[] iArr4 = new int[i47];
        int[] iArr5 = mutableIntList9.content;
        int iMax2 = i43;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        Placeable[] placeableArr2 = placeableArr;
        while (i49 < i47) {
            int i51 = iArr5[i49];
            MutableIntList mutableIntList10 = mutableIntList8;
            int i52 = mutableIntList10.get(i49);
            int[] iArr6 = iArr3;
            Placeable[] placeableArr3 = placeableArr2;
            FlowLineMeasurePolicy flowLineMeasurePolicy4 = flowLineMeasurePolicy3;
            ArrayList arrayList2 = arrayList;
            int i53 = i21;
            MeasureResult measureResultMeasure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy4, iMax2, Constraints.m33455getMinHeightimpl(jM27425constructorimpl), Constraints.m33454getMaxWidthimpl(jM27425constructorimpl), i52, i53, measureScope3, arrayList2, placeableArr3, i48, i51, iArr6, i49);
            if (flowLineMeasurePolicy.isHorizontal()) {
                height = measureResultMeasure.getWidth();
                width = measureResultMeasure.getHeight();
            } else {
                height = measureResultMeasure.getHeight();
                width = measureResultMeasure.getWidth();
            }
            iArr4[i49] = width;
            i50 += width;
            iMax2 = Math.max(iMax2, height);
            mutableVector.add(measureResultMeasure);
            i49++;
            arrayList = arrayList2;
            placeableArr2 = placeableArr3;
            i48 = i51;
            iArr3 = iArr6;
            mutableIntList8 = mutableIntList10;
            i21 = i53;
            measureScope3 = measureScope;
            flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        }
        int[] iArr7 = iArr3;
        if (mutableVector.getSize() == 0) {
            i13 = 0;
            i14 = 0;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            j11 = j10;
            iArr = iArr7;
            iArr2 = iArr4;
        } else {
            i13 = iMax2;
            i14 = i50;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr = iArr7;
            iArr2 = iArr4;
            j11 = j10;
        }
        return m27384placeHelperBmaY500(measureScope2, j11, i13, i14, iArr2, mutableVector, flowLineMeasurePolicy2, iArr);
    }

    @Composable
    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i11, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:514)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(i10)) || (i11 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo27345getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_START, horizontal.mo27345getSpacingD9Ej5fM(), i10, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.p014ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                    return flowMeasurePolicy.mo27405measure3p2s80s(measureScope, AbstractC10976v.m24126e(list), j10);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    @Composable
    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-308635847, i12, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:546)");
        }
        boolean zChanged = ((((i12 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(horizontal2)) || (i12 & 384) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && composer.changed(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && composer.changed(i11)) || (i12 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo27345getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.horizontal$foundation_layout_release(horizontal2), horizontal.mo27345getSpacingD9Ej5fM(), i10, i11, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            objRememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    public static final int crossAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z10, int i10) {
        return z10 ? intrinsicMeasurable.minIntrinsicHeight(i10) : intrinsicMeasurable.minIntrinsicWidth(i10);
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC9545q interfaceC9545q, InterfaceC9545q interfaceC9545q2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i15;
        if (list.isEmpty()) {
            return IntIntPair.m26725constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i13, flowLayoutOverflowState, OrientationIndependentConstraints.m27425constructorimpl(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC10947g0.m23947p0(list, 0);
        int iIntValue = intrinsicMeasurable != null ? ((Number) interfaceC9545q2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i10))).intValue() : 0;
        int iIntValue2 = intrinsicMeasurable != null ? ((Number) interfaceC9545q.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue))).intValue() : 0;
        int i16 = 0;
        int iMax = 0;
        if (flowLayoutBuildingBlocks.m27380getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m26725constructorimpl(i10, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m26722boximpl(IntIntPair.m26725constructorimpl(iIntValue2, iIntValue)), 0, 0, 0, false, false).isLastItemInContainer()) {
            IntIntPair intIntPairM27385ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m27385ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m26725constructorimpl(intIntPairM27385ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m26730getSecondimpl(intIntPairM27385ellipsisSizeF35zmw$foundation_layout_release.m26733unboximpl()) : 0, 0);
        }
        int size = list.size();
        int i17 = i10;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            int i22 = iMax;
            if (i18 >= size) {
                i15 = i19;
                break;
            }
            int i23 = i17 - iIntValue2;
            int i24 = i18 + 1;
            iMax = Math.max(i22, iIntValue);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC10947g0.m23947p0(list, i24);
            int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) interfaceC9545q2.invoke(intrinsicMeasurable2, Integer.valueOf(i24), Integer.valueOf(i10))).intValue() : 0;
            int iIntValue4 = intrinsicMeasurable2 != null ? ((Number) interfaceC9545q.invoke(intrinsicMeasurable2, Integer.valueOf(i24), Integer.valueOf(iIntValue3))).intValue() + i11 : 0;
            int i25 = i24 - i20;
            i15 = i24;
            int i26 = i21;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM27380getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m27380getWrapInfoOpUlnko(i18 + 2 < list.size(), i25, IntIntPair.m26725constructorimpl(i23, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m26722boximpl(IntIntPair.m26725constructorimpl(iIntValue4, iIntValue3)), i26, i16, iMax, false, false);
            if (wrapInfoM27380getWrapInfoOpUlnko.isLastItemInLine()) {
                int iM26730getSecondimpl = i16 + iMax + i12;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM27380getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i26, iM26730getSecondimpl, i23, i25);
                iIntValue4 -= i11;
                i21 = i26 + 1;
                if (wrapInfoM27380getWrapInfoOpUlnko.isLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long jM27381getEllipsisSizeOO21N7I = wrapEllipsisInfo.m27381getEllipsisSizeOO21N7I();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM26730getSecondimpl += IntIntPair.m26730getSecondimpl(jM27381getEllipsisSizeOO21N7I) + i12;
                        }
                    }
                    i16 = iM26730getSecondimpl;
                } else {
                    i17 = i10;
                    i20 = i15;
                    i16 = iM26730getSecondimpl;
                    iMax = 0;
                }
            } else {
                i17 = i23;
                i21 = i26;
            }
            iIntValue2 = iIntValue4;
            iIntValue = iIntValue3;
            i18 = i15;
            i19 = i18;
        }
        return IntIntPair.m26725constructorimpl(i16 - i12, i15);
    }

    public static final int mainAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z10, int i10) {
        return z10 ? intrinsicMeasurable.minIntrinsicWidth(i10) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    private static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC9545q interfaceC9545q, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iIntValue = ((Number) interfaceC9545q.invoke(list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10))).intValue() + i11;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list.size()) {
                iMax = Math.max(iMax, (i15 + iIntValue) - i11);
                i15 = 0;
                i14 = i13;
            } else {
                i15 += iIntValue;
            }
            i13 = i16;
        }
        return iMax;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m27383measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j10, InterfaceC9540l interfaceC9540l) {
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
                interfaceC9540l.invoke(placeableMo32229measureBRTryo0);
                return IntIntPair.m26725constructorimpl(flowLineMeasurePolicy.mainAxisSize(placeableMo32229measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(placeableMo32229measureBRTryo0));
            }
        }
        int iMainAxisMin = mainAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m26725constructorimpl(iMainAxisMin, crossAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), iMainAxisMin));
    }

    private static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC9545q interfaceC9545q, InterfaceC9545q interfaceC9545q2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        List<? extends IntrinsicMeasurable> list2 = list;
        int i15 = i13;
        int i16 = i14;
        if (list2.isEmpty()) {
            return 0;
        }
        int size = list2.size();
        int[] iArr = new int[size];
        int size2 = list2.size();
        int[] iArr2 = new int[size2];
        int size3 = list2.size();
        for (int i17 = 0; i17 < size3; i17++) {
            IntrinsicMeasurable intrinsicMeasurable = list2.get(i17);
            int iIntValue = ((Number) interfaceC9545q.invoke(intrinsicMeasurable, Integer.valueOf(i17), Integer.valueOf(i10))).intValue();
            iArr[i17] = iIntValue;
            iArr2[i17] = ((Number) interfaceC9545q2.invoke(intrinsicMeasurable, Integer.valueOf(i17), Integer.valueOf(iIntValue))).intValue();
        }
        int i18 = Integer.MAX_VALUE;
        if (i16 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE) {
            i18 = i15 * i16;
        }
        int iMin = Math.min(i18 - (((i18 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i18 < list2.size() || i16 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int iM24081h1 = AbstractC10968r.m24081h1(iArr) + ((list2.size() - 1) * i11);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iM26729getFirstimpl = iArr2[0];
        AbstractC10961n0 it = new C10405j(1, AbstractC10968r.m24114y0(iArr2)).iterator();
        while (it.hasNext()) {
            int i19 = iArr2[it.nextInt()];
            if (iM26729getFirstimpl < i19) {
                iM26729getFirstimpl = i19;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i20 = iArr[0];
        AbstractC10961n0 it2 = new C10405j(1, AbstractC10968r.m24114y0(iArr)).iterator();
        while (it2.hasNext()) {
            int i21 = iArr[it2.nextInt()];
            if (i20 < i21) {
                i20 = i21;
            }
        }
        int i22 = i20;
        int i23 = iM24081h1;
        while (i22 <= i23 && iM26729getFirstimpl != i10) {
            int i24 = (i22 + i23) / 2;
            long jIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list2, iArr, iArr2, i24, i11, i12, i15, i16, flowLayoutOverflowState);
            iM26729getFirstimpl = IntIntPair.m26729getFirstimpl(jIntrinsicCrossAxisSize);
            int iM26730getSecondimpl = IntIntPair.m26730getSecondimpl(jIntrinsicCrossAxisSize);
            if (iM26729getFirstimpl > i10 || iM26730getSecondimpl < iMin) {
                i22 = i24 + 1;
                if (i22 > i23) {
                    return i22;
                }
            } else {
                if (iM26729getFirstimpl >= i10) {
                    return i24;
                }
                i23 = i24 - 1;
            }
            list2 = list;
            i15 = i13;
            i16 = i14;
            iM24081h1 = i24;
        }
        return iM24081h1;
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m27384placeHelperBmaY500(MeasureScope measureScope, long j10, int i10, int i11, int[] iArr, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int iM33453getMaxHeightimpl;
        int i12;
        int i13;
        boolean zIsHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (zIsHorizontal) {
            int iMo27093roundToPx0680j_4 = i11 + (measureScope.mo27093roundToPx0680j_4(verticalArrangement.mo27345getSpacingD9Ej5fM()) * (mutableVector.getSize() - 1));
            int iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
            iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
            if (iMo27093roundToPx0680j_4 < iM33455getMinHeightimpl) {
                iMo27093roundToPx0680j_4 = iM33455getMinHeightimpl;
            }
            if (iMo27093roundToPx0680j_4 <= iM33453getMaxHeightimpl) {
                iM33453getMaxHeightimpl = iMo27093roundToPx0680j_4;
            }
            verticalArrangement.arrange(measureScope, iM33453getMaxHeightimpl, iArr, iArr2);
        } else {
            int iMo27093roundToPx0680j_42 = i11 + (measureScope.mo27093roundToPx0680j_4(horizontalArrangement.mo27345getSpacingD9Ej5fM()) * (mutableVector.getSize() - 1));
            int iM33455getMinHeightimpl2 = Constraints.m33455getMinHeightimpl(j10);
            int iM33453getMaxHeightimpl2 = Constraints.m33453getMaxHeightimpl(j10);
            if (iMo27093roundToPx0680j_42 < iM33455getMinHeightimpl2) {
                iMo27093roundToPx0680j_42 = iM33455getMinHeightimpl2;
            }
            int i14 = iMo27093roundToPx0680j_42 > iM33453getMaxHeightimpl2 ? iM33453getMaxHeightimpl2 : iMo27093roundToPx0680j_42;
            horizontalArrangement.arrange(measureScope, i14, iArr, measureScope.getLayoutDirection(), iArr2);
            iM33453getMaxHeightimpl = i14;
        }
        int iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(j10);
        int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
        if (i10 < iM33456getMinWidthimpl) {
            i10 = iM33456getMinWidthimpl;
        }
        if (i10 <= iM33454getMaxWidthimpl) {
            iM33454getMaxWidthimpl = i10;
        }
        if (zIsHorizontal) {
            i13 = iM33454getMaxWidthimpl;
            i12 = iM33453getMaxHeightimpl;
        } else {
            i12 = iM33454getMaxWidthimpl;
            i13 = iM33453getMaxHeightimpl;
        }
        return MeasureScope.layout$default(measureScope, i13, i12, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
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
                MutableVector<MeasureResult> mutableVector2 = mutableVector;
                MeasureResult[] measureResultArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i15 = 0; i15 < size; i15++) {
                    measureResultArr[i15].placeChildren();
                }
            }
        }, 4, null);
    }

    @Composable
    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i11, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:449)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(i10)) || (i11 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo27345getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_TOP, vertical.mo27345getSpacingD9Ej5fM(), i10, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.p014ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                    return flowMeasurePolicy.mo27405measure3p2s80s(measureScope, AbstractC10976v.m24126e(list), j10);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    @Composable
    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2010142641, i12, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)");
        }
        boolean zChanged = ((((i12 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(vertical2)) || (i12 & 384) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && composer.changed(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && composer.changed(i11)) || (i12 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo27345getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.vertical$foundation_layout_release(vertical2), vertical.mo27345getSpacingD9Ej5fM(), i10, i11, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            objRememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo flowLineInfo) {
        try {
            if (!(it instanceof ContextualFlowItemIterator)) {
                return it.next();
            }
            AbstractC9979u.m20291d(flowLineInfo);
            return ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return IntIntPair.m26725constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i13, flowLayoutOverflowState, OrientationIndependentConstraints.m27425constructorimpl(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC10947g0.m23947p0(list, 0);
        int i15 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i16 = intrinsicMeasurable != null ? iArr[0] : 0;
        int i17 = 0;
        if (flowLayoutBuildingBlocks.m27380getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m26725constructorimpl(i10, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m26722boximpl(IntIntPair.m26725constructorimpl(i16, i15)), 0, 0, 0, false, false).isLastItemInContainer()) {
            IntIntPair intIntPairM27385ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m27385ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m26725constructorimpl(intIntPairM27385ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m26730getSecondimpl(intIntPairM27385ellipsisSizeF35zmw$foundation_layout_release.m26733unboximpl()) : 0, 0);
        }
        int size = list.size();
        int i18 = i10;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            if (i19 >= size) {
                break;
            }
            int i24 = i18 - i16;
            int i25 = i19 + 1;
            int iMax = Math.max(i23, i15);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC10947g0.m23947p0(list, i25);
            int i26 = intrinsicMeasurable2 != null ? iArr2[i25] : 0;
            int i27 = intrinsicMeasurable2 != null ? iArr[i25] + i11 : 0;
            int i28 = i25 - i21;
            int i29 = i22;
            int i30 = i26;
            int i31 = i27;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM27380getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m27380getWrapInfoOpUlnko(i19 + 2 < list.size(), i28, IntIntPair.m26725constructorimpl(i24, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m26722boximpl(IntIntPair.m26725constructorimpl(i27, i26)), i29, i17, iMax, false, false);
            if (wrapInfoM27380getWrapInfoOpUlnko.isLastItemInLine()) {
                int iM26730getSecondimpl = i17 + iMax + i12;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM27380getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i29, iM26730getSecondimpl, i24, i28);
                int i32 = i31 - i11;
                i22 = i29 + 1;
                if (wrapInfoM27380getWrapInfoOpUlnko.isLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long jM27381getEllipsisSizeOO21N7I = wrapEllipsisInfo.m27381getEllipsisSizeOO21N7I();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM26730getSecondimpl += IntIntPair.m26730getSecondimpl(jM27381getEllipsisSizeOO21N7I) + i12;
                        }
                    }
                    i17 = iM26730getSecondimpl;
                    i20 = i25;
                } else {
                    i23 = 0;
                    i17 = iM26730getSecondimpl;
                    i16 = i32;
                    i21 = i25;
                    i18 = i10;
                }
            } else {
                i18 = i24;
                i22 = i29;
                i23 = iMax;
                i16 = i31;
            }
            i19 = i25;
            i20 = i19;
            i15 = i30;
        }
        return IntIntPair.m26725constructorimpl(i17 - i12, i20);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(androidx.compose.p014ui.Modifier r21, androidx.compose.foundation.layout.Arrangement.Vertical r22, androidx.compose.foundation.layout.Arrangement.Horizontal r23, androidx.compose.ui.Alignment.Horizontal r24, int r25, int r26, final p181hd.InterfaceC9545q r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(androidx.compose.p014ui.Modifier r21, androidx.compose.foundation.layout.Arrangement.Horizontal r22, androidx.compose.foundation.layout.Arrangement.Vertical r23, androidx.compose.ui.Alignment.Vertical r24, int r25, int r26, final p181hd.InterfaceC9545q r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
