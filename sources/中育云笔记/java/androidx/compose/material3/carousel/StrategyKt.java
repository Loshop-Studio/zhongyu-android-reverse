package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.p014ui.util.MathHelpersKt;
import com.taobao.sophix.PatchStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

/* loaded from: classes2.dex */
public final class StrategyKt {
    private static final KeylineList createShiftedKeylineListForContentPadding(final KeylineList keylineList, float f10, float f11, float f12, Keyline keyline, int i10) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Keyline keyline2 = keylineList.get(i11);
            if (!keyline2.isAnchor()) {
                arrayList.add(keyline2);
            }
        }
        final float size2 = f12 / arrayList.size();
        KeylineList keylineListKeylineListOf = KeylineListKt.keylineListOf(f10, f11, i10, (keyline.getOffset() - (size2 / 2.0f)) + f12, new InterfaceC9540l() { // from class: androidx.compose.material3.carousel.StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeylineListScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(KeylineListScope keylineListScope) {
                KeylineList keylineList2 = keylineList;
                float f13 = size2;
                int size3 = keylineList2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Keyline keyline3 = keylineList2.get(i12);
                    keylineListScope.add(keyline3.getSize() - Math.abs(f13), keyline3.isAnchor());
                }
            }
        });
        ArrayList arrayList2 = new ArrayList(keylineListKeylineListOf.size());
        int size3 = keylineListKeylineListOf.size();
        for (int i12 = 0; i12 < size3; i12++) {
            arrayList2.add(Keyline.copy$default(keylineListKeylineListOf.get(i12), 0.0f, 0.0f, keylineList.get(i12).getUnadjustedOffset(), false, false, false, 0.0f, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, null));
        }
        return new KeylineList(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getEndKeylineSteps(KeylineList keylineList, float f10, float f11, float f12) {
        if (keylineList.isEmpty()) {
            return AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isLastFocalItemAtEndOfContainer(f10)) {
            if (f12 == 0.0f) {
                return arrayList;
            }
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f10, f11, -f12, keylineList.getLastFocal(), keylineList.getLastFocalIndex()));
            return arrayList;
        }
        int lastFocalIndex = keylineList.getLastFocalIndex();
        int lastNonAnchorIndex = keylineList.getLastNonAnchorIndex();
        int i10 = lastNonAnchorIndex - lastFocalIndex;
        if (i10 <= 0 && keylineList.getLastFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f10, f11));
            return arrayList;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            KeylineList keylineList2 = (KeylineList) AbstractC10947g0.m23956y0(arrayList);
            int i12 = lastNonAnchorIndex - i11;
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getLastNonAnchorIndex(), i12 < AbstractC10978w.m24138p(keylineList) ? keylineList2.lastIndexBeforeFocalRangeWithSize(keylineList.get(i12 + 1).getSize()) + 1 : 0, f10, f11));
        }
        if (f12 == 0.0f) {
            return arrayList;
        }
        arrayList.set(AbstractC10978w.m24138p(arrayList), createShiftedKeylineListForContentPadding((KeylineList) AbstractC10947g0.m23956y0(arrayList), f10, f11, -f12, ((KeylineList) AbstractC10947g0.m23956y0(arrayList)).getLastFocal(), ((KeylineList) AbstractC10947g0.m23956y0(arrayList)).getLastFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getEndShiftDistance(List<KeylineList> list, float f10) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) AbstractC10947g0.m23956y0((List) AbstractC10947g0.m23944m0(list))).getUnadjustedOffset() - ((Keyline) AbstractC10947g0.m23956y0((List) AbstractC10947g0.m23956y0(list))).getUnadjustedOffset(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShiftPointRange getShiftPointRange(int i10, FloatList floatList, float f10) {
        float f11 = floatList.get(0);
        Iterator it = AbstractC10410o.m21768u(1, i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC10961n0) it).nextInt();
            float f12 = floatList.get(iNextInt);
            if (f10 <= f12) {
                return new ShiftPointRange(iNextInt - 1, iNextInt, lerp(0.0f, 1.0f, f11, f12, f10));
            }
            f11 = f12;
        }
        return new ShiftPointRange(0, 0, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getStartKeylineSteps(KeylineList keylineList, float f10, float f11, float f12) {
        if (keylineList.isEmpty()) {
            return AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isFirstFocalItemAtStartOfContainer()) {
            if (f12 == 0.0f) {
                return arrayList;
            }
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f10, f11, f12, keylineList.getFirstFocal(), keylineList.getFirstFocalIndex()));
            return arrayList;
        }
        int firstNonAnchorIndex = keylineList.getFirstNonAnchorIndex();
        int firstFocalIndex = keylineList.getFirstFocalIndex() - firstNonAnchorIndex;
        if (firstFocalIndex <= 0 && keylineList.getFirstFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f10, f11));
            return arrayList;
        }
        for (int i10 = 0; i10 < firstFocalIndex; i10++) {
            KeylineList keylineList2 = (KeylineList) AbstractC10947g0.m23956y0(arrayList);
            int i11 = firstNonAnchorIndex + i10;
            int iM24138p = AbstractC10978w.m24138p(keylineList);
            if (i11 > 0) {
                iM24138p = keylineList2.firstIndexAfterFocalRangeWithSize(keylineList.get(i11 - 1).getSize()) - 1;
            }
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getFirstNonAnchorIndex(), iM24138p, f10, f11));
        }
        if (f12 == 0.0f) {
            return arrayList;
        }
        arrayList.set(AbstractC10978w.m24138p(arrayList), createShiftedKeylineListForContentPadding((KeylineList) AbstractC10947g0.m23956y0(arrayList), f10, f11, f12, ((KeylineList) AbstractC10947g0.m23956y0(arrayList)).getFirstFocal(), ((KeylineList) AbstractC10947g0.m23956y0(arrayList)).getFirstFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getStartShiftDistance(List<KeylineList> list, float f10) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) AbstractC10947g0.m23944m0((List) AbstractC10947g0.m23956y0(list))).getUnadjustedOffset() - ((Keyline) AbstractC10947g0.m23944m0((List) AbstractC10947g0.m23944m0(list))).getUnadjustedOffset(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FloatList getStepInterpolationPoints(float f10, List<KeylineList> list, boolean z10) {
        MutableFloatList mutableFloatListMutableFloatListOf = FloatListKt.mutableFloatListOf(0.0f);
        if (f10 != 0.0f && !list.isEmpty()) {
            C10405j c10405jM21768u = AbstractC10410o.m21768u(1, list.size());
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(c10405jM21768u, 10));
            Iterator it = c10405jM21768u.iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC10961n0) it).nextInt();
                int i10 = iNextInt - 1;
                KeylineList keylineList = list.get(i10);
                KeylineList keylineList2 = list.get(iNextInt);
                arrayList.add(Boolean.valueOf(mutableFloatListMutableFloatListOf.add(iNextInt == AbstractC10978w.m24138p(list) ? 1.0f : mutableFloatListMutableFloatListOf.get(i10) + ((z10 ? ((Keyline) AbstractC10947g0.m23944m0(keylineList2)).getUnadjustedOffset() - ((Keyline) AbstractC10947g0.m23944m0(keylineList)).getUnadjustedOffset() : ((Keyline) AbstractC10947g0.m23956y0(keylineList)).getUnadjustedOffset() - ((Keyline) AbstractC10947g0.m23956y0(keylineList2)).getUnadjustedOffset()) / f10))));
            }
        }
        return mutableFloatListMutableFloatListOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lerp(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : MathHelpersKt.lerp(f10, f11, (f14 - f12) / (f13 - f12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Keyline> move(List<Keyline> list, int i10, int i11) {
        Keyline keyline = list.get(i10);
        list.remove(i10);
        list.add(i11, keyline);
        return list;
    }

    private static final KeylineList moveKeylineAndCreateShiftedKeylineList(final KeylineList keylineList, final int i10, final int i11, float f10, float f11) {
        int i12 = i10 > i11 ? 1 : -1;
        return KeylineListKt.keylineListOf(f10, f11, keylineList.getPivotIndex() + i12, keylineList.getPivot().getOffset() + (((keylineList.get(i10).getSize() - keylineList.get(i10).getCutoff()) + f11) * i12), new InterfaceC9540l() { // from class: androidx.compose.material3.carousel.StrategyKt.moveKeylineAndCreateShiftedKeylineList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeylineListScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(KeylineListScope keylineListScope) {
                List listMove = StrategyKt.move(AbstractC10947g0.m23925a1(keylineList), i10, i11);
                int size = listMove.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Keyline keyline = (Keyline) listMove.get(i13);
                    keylineListScope.add(keyline.getSize(), keyline.isAnchor());
                }
            }
        });
    }
}
