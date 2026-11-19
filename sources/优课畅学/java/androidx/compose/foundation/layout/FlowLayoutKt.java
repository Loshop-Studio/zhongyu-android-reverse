package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p077d8.C8321f;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8792m0;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8807u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

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
    @p123h7.InterfaceC8721a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(androidx.compose.p013ui.Modifier r24, androidx.compose.foundation.layout.Arrangement.Vertical r25, androidx.compose.foundation.layout.Arrangement.Horizontal r26, androidx.compose.ui.Alignment.Horizontal r27, int r28, int r29, androidx.compose.foundation.layout.FlowColumnOverflow r30, final p300x7.InterfaceC10575q r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, x7.q, androidx.compose.runtime.Composer, int, int):void");
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
    @p123h7.InterfaceC8721a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(androidx.compose.p013ui.Modifier r24, androidx.compose.foundation.layout.Arrangement.Horizontal r25, androidx.compose.foundation.layout.Arrangement.Vertical r26, androidx.compose.ui.Alignment.Vertical r27, int r28, int r29, androidx.compose.foundation.layout.FlowRowOverflow r30, final p300x7.InterfaceC10575q r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, x7.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m20780breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f10, float f11, long j10, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
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
        IntIntPair intIntPairM20120boximpl;
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
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
        int iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(measureScope3.mo20497toPx0680j_4(f10));
        int iCeil2 = (int) Math.ceil(measureScope3.mo20497toPx0680j_4(f11));
        long jM20823constructorimpl = OrientationIndependentConstraints.m20823constructorimpl(0, iM26852getMaxWidthimpl, 0, iM26851getMaxHeightimpl);
        long jM20838toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m20838toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m20827copyyUG9Ft0$default(jM20823constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy3.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        FlowLineInfo flowLineInfo = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope3.mo20494toDpu2uoSUM(iM26852getMaxWidthimpl), measureScope3.mo20494toDpu2uoSUM(iM26851getMaxHeightimpl), null) : null;
        Measurable measurableSafeNext = !it2.hasNext() ? null : safeNext(it2, flowLineInfo);
        IntIntPair intIntPairM20120boximpl2 = measurableSafeNext != null ? IntIntPair.m20120boximpl(m20781measureAndCacherqJ1uqs(measurableSafeNext, flowLineMeasurePolicy3, jM20838toBoxConstraintsOenEA2s, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable placeable) {
                ref$ObjectRef.f17473a = placeable;
            }
        })) : null;
        Integer numValueOf = intIntPairM20120boximpl2 != null ? Integer.valueOf(IntIntPair.m20127getFirstimpl(intIntPairM20120boximpl2.m20131unboximpl())) : null;
        Integer numValueOf2 = intIntPairM20120boximpl2 != null ? Integer.valueOf(IntIntPair.m20128getSecondimpl(intIntPairM20120boximpl2.m20131unboximpl())) : null;
        Integer num = numValueOf;
        Measurable measurable = measurableSafeNext;
        MutableIntList mutableIntList3 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList4 = new MutableIntList(0, 1, null);
        FlowLineInfo flowLineInfo2 = flowLineInfo;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i10, flowLayoutOverflowState, j10, i11, iCeil, iCeil2, null);
        int i21 = iCeil;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfoM20778getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m20778getWrapInfoOpUlnko(it2.hasNext(), 0, IntIntPair.m20123constructorimpl(iM26852getMaxWidthimpl, iM26851getMaxHeightimpl), intIntPairM20120boximpl2, 0, 0, 0, false, false);
        if (wrapInfoM20778getWrapInfoOpUlnko.isLastItemInContainer()) {
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM20778getWrapInfoOpUlnko, intIntPairM20120boximpl2 != null, -1, 0, iM26852getMaxWidthimpl, 0);
            i12 = iM26852getMaxWidthimpl;
        } else {
            i12 = iM26852getMaxWidthimpl;
            wrapEllipsisInfo = null;
        }
        Integer numValueOf3 = num;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = wrapInfoM20778getWrapInfoOpUlnko;
        int i26 = 0;
        int i27 = iM26854getMinWidthimpl;
        MutableIntList mutableIntList5 = mutableIntList3;
        int i28 = iM26851getMaxHeightimpl;
        int i29 = 0;
        int i30 = i12;
        Measurable measurableSafeNext2 = measurable;
        while (!wrapInfo.isLastItemInContainer() && measurableSafeNext2 != null) {
            AbstractC9133u.m16130d(numValueOf3);
            int iIntValue = numValueOf3.intValue();
            AbstractC9133u.m16130d(numValueOf2);
            MutableIntList mutableIntList6 = mutableIntList4;
            int i31 = i12;
            int i32 = i23 + iIntValue;
            int iMax = Math.max(i22, numValueOf2.intValue());
            int i33 = i30 - iIntValue;
            int i34 = i29 + 1;
            int i35 = i27;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i34);
            arrayList.add(measurableSafeNext2);
            mutableIntObjectMapMutableIntObjectMapOf.set(i29, ref$ObjectRef.f17473a);
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
                float fMo20494toDpu2uoSUM = measureScope3.mo20494toDpu2uoSUM(i19);
                if (z10) {
                    mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
                    i20 = i28;
                } else {
                    int i39 = (i28 - iMax) - iCeil2;
                    mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
                    i20 = i39 < 0 ? 0 : i39;
                }
                flowLineInfo2.m20791update4j6BHR0$foundation_layout_release(i18, i37, fMo20494toDpu2uoSUM, measureScope3.mo20494toDpu2uoSUM(i20));
            } else {
                i15 = i36;
                mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
            }
            measurableSafeNext2 = !it2.hasNext() ? null : safeNext(it2, flowLineInfo2);
            ref$ObjectRef.f17473a = null;
            IntIntPair intIntPairM20120boximpl3 = measurableSafeNext2 != null ? IntIntPair.m20120boximpl(m20781measureAndCacherqJ1uqs(measurableSafeNext2, flowLineMeasurePolicy3, jM20838toBoxConstraintsOenEA2s, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Placeable placeable) {
                    ref$ObjectRef.f17473a = placeable;
                }
            })) : null;
            Integer numValueOf4 = intIntPairM20120boximpl3 != null ? Integer.valueOf(IntIntPair.m20127getFirstimpl(intIntPairM20120boximpl3.m20131unboximpl()) + i21) : null;
            numValueOf2 = intIntPairM20120boximpl3 != null ? Integer.valueOf(IntIntPair.m20128getSecondimpl(intIntPairM20120boximpl3.m20131unboximpl())) : null;
            boolean zHasNext = it2.hasNext();
            int i40 = i26;
            long jM20123constructorimpl = IntIntPair.m20123constructorimpl(i33, i28);
            if (intIntPairM20120boximpl3 == null) {
                intIntPairM20120boximpl = null;
            } else {
                AbstractC9133u.m16130d(numValueOf4);
                int iIntValue2 = numValueOf4.intValue();
                AbstractC9133u.m16130d(numValueOf2);
                intIntPairM20120boximpl = IntIntPair.m20120boximpl(IntIntPair.m20123constructorimpl(iIntValue2, numValueOf2.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM20778getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m20778getWrapInfoOpUlnko(zHasNext, i15, jM20123constructorimpl, intIntPairM20120boximpl, i40, i25, iMax, false, false);
            if (wrapInfoM20778getWrapInfoOpUlnko2.isLastItemInLine()) {
                int iMin = Math.min(Math.max(i35, i32), i31);
                int i41 = i25 + iMax;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM20778getWrapInfoOpUlnko2, intIntPairM20120boximpl3 != null, i40, i41, i33, i15);
                mutableIntList = mutableIntList6;
                mutableIntList.add(iMax);
                int i42 = (iM26851getMaxHeightimpl - i41) - iCeil2;
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
            wrapInfo = wrapInfoM20778getWrapInfoOpUlnko2;
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
                mutableIntList8.set(i44, Math.max(mutableIntList8.get(i44), IntIntPair.m20128getSecondimpl(wrapEllipsisInfo3.m20779getEllipsisSizeOO21N7I())));
                mutableIntList9.set(i45, mutableIntList9.last() + 1);
            } else {
                mutableIntList8.add(IntIntPair.m20128getSecondimpl(wrapEllipsisInfo3.m20779getEllipsisSizeOO21N7I()));
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
            MeasureResult measureResultMeasure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy4, iMax2, Constraints.m26853getMinHeightimpl(jM20823constructorimpl), Constraints.m26852getMaxWidthimpl(jM20823constructorimpl), i52, i53, measureScope3, arrayList2, placeableArr3, i48, i51, iArr6, i49);
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
        return m20782placeHelperBmaY500(measureScope2, j11, i13, i14, iArr2, mutableVector, flowLineMeasurePolicy2, iArr);
    }

    @Composable
    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i11, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:514)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i11 & 6) == 4) | ((((i11 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changed(horizontal)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(i10)) || (i11 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo20743getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_START, horizontal.mo20743getSpacingD9Ej5fM(), i10, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.p013ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                    return flowMeasurePolicy.mo20803measure3p2s80s(measureScope, AbstractC8807u.m14755e(list), j10);
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
        boolean zChanged = ((((i12 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i12 & 6) == 4) | ((((i12 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changed(horizontal)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(horizontal2)) || (i12 & 384) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && composer.changed(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && composer.changed(i11)) || (i12 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo20743getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.horizontal$foundation_layout_release(horizontal2), horizontal.mo20743getSpacingD9Ej5fM(), i10, i11, flowLayoutOverflowState, null);
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

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC10575q interfaceC10575q, InterfaceC10575q interfaceC10575q2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i15;
        if (list.isEmpty()) {
            return IntIntPair.m20123constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i13, flowLayoutOverflowState, OrientationIndependentConstraints.m20823constructorimpl(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC8778f0.m14569o0(list, 0);
        int iIntValue = intrinsicMeasurable != null ? ((Number) interfaceC10575q2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i10))).intValue() : 0;
        int iIntValue2 = intrinsicMeasurable != null ? ((Number) interfaceC10575q.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue))).intValue() : 0;
        int i16 = 0;
        int iMax = 0;
        if (flowLayoutBuildingBlocks.m20778getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m20123constructorimpl(i10, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m20120boximpl(IntIntPair.m20123constructorimpl(iIntValue2, iIntValue)), 0, 0, 0, false, false).isLastItemInContainer()) {
            IntIntPair intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m20783ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m20123constructorimpl(intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m20128getSecondimpl(intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release.m20131unboximpl()) : 0, 0);
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
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC8778f0.m14569o0(list, i24);
            int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) interfaceC10575q2.invoke(intrinsicMeasurable2, Integer.valueOf(i24), Integer.valueOf(i10))).intValue() : 0;
            int iIntValue4 = intrinsicMeasurable2 != null ? ((Number) interfaceC10575q.invoke(intrinsicMeasurable2, Integer.valueOf(i24), Integer.valueOf(iIntValue3))).intValue() + i11 : 0;
            int i25 = i24 - i20;
            i15 = i24;
            int i26 = i21;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM20778getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m20778getWrapInfoOpUlnko(i18 + 2 < list.size(), i25, IntIntPair.m20123constructorimpl(i23, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m20120boximpl(IntIntPair.m20123constructorimpl(iIntValue4, iIntValue3)), i26, i16, iMax, false, false);
            if (wrapInfoM20778getWrapInfoOpUlnko.isLastItemInLine()) {
                int iM20128getSecondimpl = i16 + iMax + i12;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM20778getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i26, iM20128getSecondimpl, i23, i25);
                iIntValue4 -= i11;
                i21 = i26 + 1;
                if (wrapInfoM20778getWrapInfoOpUlnko.isLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long jM20779getEllipsisSizeOO21N7I = wrapEllipsisInfo.m20779getEllipsisSizeOO21N7I();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM20128getSecondimpl += IntIntPair.m20128getSecondimpl(jM20779getEllipsisSizeOO21N7I) + i12;
                        }
                    }
                    i16 = iM20128getSecondimpl;
                } else {
                    i17 = i10;
                    i20 = i15;
                    i16 = iM20128getSecondimpl;
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
        return IntIntPair.m20123constructorimpl(i16 - i12, i15);
    }

    public static final int mainAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z10, int i10) {
        return z10 ? intrinsicMeasurable.minIntrinsicWidth(i10) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    private static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC10575q interfaceC10575q, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iIntValue = ((Number) interfaceC10575q.invoke(list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10))).intValue() + i11;
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
    public static final long m20781measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j10, InterfaceC10570l interfaceC10570l) {
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
                interfaceC10570l.invoke(placeableMo25627measureBRTryo0);
                return IntIntPair.m20123constructorimpl(flowLineMeasurePolicy.mainAxisSize(placeableMo25627measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(placeableMo25627measureBRTryo0));
            }
        }
        int iMainAxisMin = mainAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m20123constructorimpl(iMainAxisMin, crossAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), iMainAxisMin));
    }

    private static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC10575q interfaceC10575q, InterfaceC10575q interfaceC10575q2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i15 = i13;
        int i16 = i14;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i17);
            int iIntValue = ((Number) interfaceC10575q.invoke(intrinsicMeasurable, Integer.valueOf(i17), Integer.valueOf(i10))).intValue();
            iArr[i17] = iIntValue;
            iArr2[i17] = ((Number) interfaceC10575q2.invoke(intrinsicMeasurable, Integer.valueOf(i17), Integer.valueOf(iIntValue))).intValue();
        }
        List<? extends IntrinsicMeasurable> list2 = list;
        int i18 = Integer.MAX_VALUE;
        if (i16 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE) {
            i18 = i15 * i16;
        }
        int iMin = Math.min(i18 - (((i18 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i18 < list2.size() || i16 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int iM14720m1 = AbstractC8801r.m14720m1(iArr) + ((list2.size() - 1) * i11);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i19 = iArr2[0];
        AbstractC8792m0 it = new C8321f(1, AbstractC8801r.m14745z0(iArr2)).iterator();
        while (it.hasNext()) {
            int i20 = iArr2[it.nextInt()];
            if (i19 < i20) {
                i19 = i20;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr[0];
        AbstractC8792m0 it2 = new C8321f(1, AbstractC8801r.m14745z0(iArr)).iterator();
        while (it2.hasNext()) {
            int i22 = iArr[it2.nextInt()];
            if (i21 < i22) {
                i21 = i22;
            }
        }
        int i23 = i21;
        int i24 = iM14720m1;
        while (i23 <= i24 && i19 != i10) {
            int i25 = (i23 + i24) / 2;
            long jIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list2, iArr, iArr2, i25, i11, i12, i15, i16, flowLayoutOverflowState);
            int iM20127getFirstimpl = IntIntPair.m20127getFirstimpl(jIntrinsicCrossAxisSize);
            int iM20128getSecondimpl = IntIntPair.m20128getSecondimpl(jIntrinsicCrossAxisSize);
            if (iM20127getFirstimpl > i10 || iM20128getSecondimpl < iMin) {
                i23 = i25 + 1;
                if (i23 > i24) {
                    return i23;
                }
            } else {
                if (iM20127getFirstimpl >= i10) {
                    return i25;
                }
                i24 = i25 - 1;
            }
            list2 = list;
            i15 = i13;
            i16 = i14;
            iM14720m1 = i25;
            i19 = iM20127getFirstimpl;
        }
        return iM14720m1;
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m20782placeHelperBmaY500(MeasureScope measureScope, long j10, int i10, int i11, int[] iArr, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int iM26851getMaxHeightimpl;
        int i12;
        int i13;
        boolean zIsHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (zIsHorizontal) {
            int iMo20491roundToPx0680j_4 = i11 + (measureScope.mo20491roundToPx0680j_4(verticalArrangement.mo20743getSpacingD9Ej5fM()) * (mutableVector.getSize() - 1));
            int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
            iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
            if (iMo20491roundToPx0680j_4 < iM26853getMinHeightimpl) {
                iMo20491roundToPx0680j_4 = iM26853getMinHeightimpl;
            }
            if (iMo20491roundToPx0680j_4 <= iM26851getMaxHeightimpl) {
                iM26851getMaxHeightimpl = iMo20491roundToPx0680j_4;
            }
            verticalArrangement.arrange(measureScope, iM26851getMaxHeightimpl, iArr, iArr2);
        } else {
            int iMo20491roundToPx0680j_42 = i11 + (measureScope.mo20491roundToPx0680j_4(horizontalArrangement.mo20743getSpacingD9Ej5fM()) * (mutableVector.getSize() - 1));
            int iM26853getMinHeightimpl2 = Constraints.m26853getMinHeightimpl(j10);
            int iM26851getMaxHeightimpl2 = Constraints.m26851getMaxHeightimpl(j10);
            if (iMo20491roundToPx0680j_42 < iM26853getMinHeightimpl2) {
                iMo20491roundToPx0680j_42 = iM26853getMinHeightimpl2;
            }
            int i14 = iMo20491roundToPx0680j_42 > iM26851getMaxHeightimpl2 ? iM26851getMaxHeightimpl2 : iMo20491roundToPx0680j_42;
            horizontalArrangement.arrange(measureScope, i14, iArr, measureScope.getLayoutDirection(), iArr2);
            iM26851getMaxHeightimpl = i14;
        }
        int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        if (i10 < iM26854getMinWidthimpl) {
            i10 = iM26854getMinWidthimpl;
        }
        if (i10 <= iM26852getMaxWidthimpl) {
            iM26852getMaxWidthimpl = i10;
        }
        if (zIsHorizontal) {
            i13 = iM26852getMaxWidthimpl;
            i12 = iM26851getMaxHeightimpl;
        } else {
            i12 = iM26852getMaxWidthimpl;
            i13 = iM26851getMaxHeightimpl;
        }
        return MeasureScope.layout$default(measureScope, i13, i12, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
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
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i11 & 6) == 4) | ((((i11 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changed(vertical)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(i10)) || (i11 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo20743getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_TOP, vertical.mo20743getSpacingD9Ej5fM(), i10, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.p013ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                    return flowMeasurePolicy.mo20803measure3p2s80s(measureScope, AbstractC8807u.m14755e(list), j10);
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
        boolean zChanged = ((((i12 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i12 & 6) == 4) | ((((i12 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changed(vertical)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(vertical2)) || (i12 & 384) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && composer.changed(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && composer.changed(i11)) || (i12 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo20743getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.vertical$foundation_layout_release(vertical2), vertical.mo20743getSpacingD9Ej5fM(), i10, i11, flowLayoutOverflowState, null);
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
            AbstractC9133u.m16130d(flowLineInfo);
            return ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return IntIntPair.m20123constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i13, flowLayoutOverflowState, OrientationIndependentConstraints.m20823constructorimpl(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC8778f0.m14569o0(list, 0);
        int i15 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i16 = intrinsicMeasurable != null ? iArr[0] : 0;
        int i17 = 0;
        if (flowLayoutBuildingBlocks.m20778getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m20123constructorimpl(i10, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m20120boximpl(IntIntPair.m20123constructorimpl(i16, i15)), 0, 0, 0, false, false).isLastItemInContainer()) {
            IntIntPair intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m20783ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m20123constructorimpl(intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m20128getSecondimpl(intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release.m20131unboximpl()) : 0, 0);
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
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC8778f0.m14569o0(list, i25);
            int i26 = intrinsicMeasurable2 != null ? iArr2[i25] : 0;
            int i27 = intrinsicMeasurable2 != null ? iArr[i25] + i11 : 0;
            int i28 = i25 - i21;
            int i29 = i22;
            int i30 = i26;
            int i31 = i27;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM20778getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m20778getWrapInfoOpUlnko(i19 + 2 < list.size(), i28, IntIntPair.m20123constructorimpl(i24, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m20120boximpl(IntIntPair.m20123constructorimpl(i27, i26)), i29, i17, iMax, false, false);
            if (wrapInfoM20778getWrapInfoOpUlnko.isLastItemInLine()) {
                int iM20128getSecondimpl = i17 + iMax + i12;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM20778getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i29, iM20128getSecondimpl, i24, i28);
                int i32 = i31 - i11;
                i22 = i29 + 1;
                if (wrapInfoM20778getWrapInfoOpUlnko.isLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long jM20779getEllipsisSizeOO21N7I = wrapEllipsisInfo.m20779getEllipsisSizeOO21N7I();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM20128getSecondimpl += IntIntPair.m20128getSecondimpl(jM20779getEllipsisSizeOO21N7I) + i12;
                        }
                    }
                    i17 = iM20128getSecondimpl;
                    i20 = i25;
                } else {
                    i23 = 0;
                    i17 = iM20128getSecondimpl;
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
        return IntIntPair.m20123constructorimpl(i17 - i12, i20);
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
    public static final void FlowColumn(androidx.compose.p013ui.Modifier r21, androidx.compose.foundation.layout.Arrangement.Vertical r22, androidx.compose.foundation.layout.Arrangement.Horizontal r23, androidx.compose.ui.Alignment.Horizontal r24, int r25, int r26, final p300x7.InterfaceC10575q r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, x7.q, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void FlowRow(androidx.compose.p013ui.Modifier r21, androidx.compose.foundation.layout.Arrangement.Horizontal r22, androidx.compose.foundation.layout.Arrangement.Vertical r23, androidx.compose.ui.Alignment.Vertical r24, int r25, int r26, final p300x7.InterfaceC10575q r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, x7.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
