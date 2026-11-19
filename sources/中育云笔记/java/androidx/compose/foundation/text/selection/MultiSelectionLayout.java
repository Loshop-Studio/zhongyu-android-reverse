package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class MultiSelectionLayout implements SelectionLayout {
    private final int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final Selection previousSelection;
    private final LongIntMap selectableIdToInfoListIndex;
    private final int startSlot;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[CrossStatus.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossStatus.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CrossStatus.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiSelectionLayout(LongIntMap longIntMap, List<SelectableInfo> list, int i10, int i11, boolean z10, Selection selection) {
        this.selectableIdToInfoListIndex = longIntMap;
        this.infoList = list;
        this.startSlot = i10;
        this.endSlot = i11;
        this.isStartHandle = z10;
        this.previousSelection = selection;
        if (list.size() > 1) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndPutSubSelection(MutableLongObjectMap<Selection> mutableLongObjectMap, Selection selection, SelectableInfo selectableInfo, int i10, int i11) {
        Selection selectionMakeSingleLayoutSelection = selection.getHandlesCrossed() ? selectableInfo.makeSingleLayoutSelection(i11, i10) : selectableInfo.makeSingleLayoutSelection(i10, i11);
        if (!(i10 <= i11)) {
            InlineClassHelperKt.throwIllegalStateException("minOffset should be less than or equal to maxOffset: " + selectionMakeSingleLayoutSelection);
        }
        mutableLongObjectMap.put(selectableInfo.getSelectableId(), selectionMakeSingleLayoutSelection);
    }

    private final int getInfoListIndexBySelectableId(long j10) {
        try {
            return this.selectableIdToInfoListIndex.get(j10);
        } catch (NoSuchElementException e10) {
            throw new IllegalStateException("Invalid selectableId: " + j10, e10);
        }
    }

    private final boolean shouldAnyInfoRecomputeSelection(MultiSelectionLayout multiSelectionLayout) {
        if (getSize() != multiSelectionLayout.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.infoList.get(i10).shouldRecomputeSelection(multiSelectionLayout.infoList.get(i10))) {
                return true;
            }
        }
        return false;
    }

    private final int slotToIndex(int i10, boolean z10) {
        return (i10 - (!z10 ? 1 : 0)) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int startOrEndSlotToIndex(int r4, boolean r5) {
        /*
            r3 = this;
            androidx.compose.foundation.text.selection.CrossStatus r0 = r3.getCrossStatus()
            int[] r1 = androidx.compose.foundation.text.selection.MultiSelectionLayout.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L17
            r2 = 2
            if (r0 == r2) goto L21
            r2 = 3
            if (r0 != r2) goto L1b
            if (r5 != 0) goto L19
        L17:
            r5 = r1
            goto L21
        L19:
            r5 = 0
            goto L21
        L1b:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L21:
            int r4 = r3.slotToIndex(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.MultiSelectionLayout.startOrEndSlotToIndex(int, boolean):int");
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public LongObjectMap<Selection> createSubSelections(final Selection selection) {
        if (selection.getStart().getSelectableId() != selection.getEnd().getSelectableId()) {
            final MutableLongObjectMap<Selection> mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
            createAndPutSubSelection(mutableLongObjectMapMutableLongObjectMapOf, selection, getFirstInfo(), (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset(), getFirstInfo().getTextLength());
            forEachMiddleInfo(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.MultiSelectionLayout$createSubSelections$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SelectableInfo) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(SelectableInfo selectableInfo) {
                    this.this$0.createAndPutSubSelection(mutableLongObjectMapMutableLongObjectMapOf, selection, selectableInfo, 0, selectableInfo.getTextLength());
                }
            });
            createAndPutSubSelection(mutableLongObjectMapMutableLongObjectMapOf, selection, getLastInfo(), 0, (selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset());
            return mutableLongObjectMapMutableLongObjectMapOf;
        }
        if (!((selection.getHandlesCrossed() && selection.getStart().getOffset() >= selection.getEnd().getOffset()) || (!selection.getHandlesCrossed() && selection.getStart().getOffset() <= selection.getEnd().getOffset()))) {
            InlineClassHelperKt.throwIllegalStateException("unexpectedly miss-crossed selection: " + selection);
        }
        return LongObjectMapKt.longObjectMapOf(selection.getStart().getSelectableId(), selection);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(InterfaceC9540l interfaceC9540l) {
        int infoListIndexBySelectableId = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int infoListIndexBySelectableId2 = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        int i10 = infoListIndexBySelectableId + 1;
        if (i10 >= infoListIndexBySelectableId2) {
            return;
        }
        while (i10 < infoListIndexBySelectableId2) {
            interfaceC9540l.invoke(this.infoList.get(i10));
            i10++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public CrossStatus getCrossStatus() {
        return getStartSlot() < getEndSlot() ? CrossStatus.NOT_CROSSED : getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.infoList.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getCurrentInfo() {
        return isStartHandle() ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getEndInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getFirstInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getEndInfo() : getStartInfo();
    }

    public final List<SelectableInfo> getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getLastInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final LongIntMap getSelectableIdToInfoListIndex() {
        return this.selectableIdToInfoListIndex;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getStartInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(SelectionLayout selectionLayout) {
        return (getPreviousSelection() != null && selectionLayout != null && (selectionLayout instanceof MultiSelectionLayout) && isStartHandle() == selectionLayout.isStartHandle() && getStartSlot() == selectionLayout.getStartSlot() && getEndSlot() == selectionLayout.getEndSlot() && !shouldAnyInfoRecomputeSelection((MultiSelectionLayout) selectionLayout)) ? false : true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MultiSelectionLayout(isStartHandle=");
        sb2.append(isStartHandle());
        sb2.append(", startPosition=");
        boolean z10 = true;
        float f10 = 2;
        sb2.append((getStartSlot() + 1) / f10);
        sb2.append(", endPosition=");
        sb2.append((getEndSlot() + 1) / f10);
        sb2.append(", crossed=");
        sb2.append(getCrossStatus());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[\n\t");
        List<SelectableInfo> list = this.infoList;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            SelectableInfo selectableInfo = list.get(i10);
            if (z10) {
                z10 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i10++;
            sb4.append(i10);
            sb4.append(" -> ");
            sb4.append(selectableInfo);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        String string = sb3.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        return sb2.toString();
    }
}
