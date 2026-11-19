package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SelectionLayoutBuilder {
    public static final int $stable = 8;
    private final LayoutCoordinates containerCoordinates;
    private final long currentPosition;
    private int currentSlot;
    private int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final long previousHandlePosition;
    private final Selection previousSelection;
    private final Comparator<Long> selectableIdOrderingComparator;
    private final MutableLongIntMap selectableIdToInfoListIndex;
    private int startSlot;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.f1122ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SelectionLayoutBuilder(long j10, long j11, LayoutCoordinates layoutCoordinates, boolean z10, Selection selection, Comparator comparator, AbstractC9972n abstractC9972n) {
        this(j10, j11, layoutCoordinates, z10, selection, comparator);
    }

    private final int updateSlot(int i10, Direction direction, Direction direction2) {
        if (i10 == -1) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[SelectionLayoutKt.resolve2dDirection(direction, direction2).ordinal()];
            if (i11 == 1) {
                return this.currentSlot - 1;
            }
            if (i11 == 2) {
                return this.currentSlot;
            }
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i10;
    }

    public final SelectableInfo appendInfo(long j10, int i10, Direction direction, Direction direction2, int i11, Direction direction3, Direction direction4, int i12, TextLayoutResult textLayoutResult) {
        this.currentSlot += 2;
        SelectableInfo selectableInfo = new SelectableInfo(j10, this.currentSlot, i10, i11, i12, textLayoutResult);
        this.startSlot = updateSlot(this.startSlot, direction, direction2);
        this.endSlot = updateSlot(this.endSlot, direction3, direction4);
        this.selectableIdToInfoListIndex.set(j10, this.infoList.size());
        this.infoList.add(selectableInfo);
        return selectableInfo;
    }

    public final SelectionLayout build() {
        int i10 = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            SelectableInfo selectableInfo = (SelectableInfo) AbstractC10947g0.m23910L0(this.infoList);
            int i11 = this.startSlot;
            int i12 = i11 == -1 ? i10 : i11;
            int i13 = this.endSlot;
            return new SingleSelectionLayout(this.isStartHandle, i12, i13 == -1 ? i10 : i13, this.previousSelection, selectableInfo);
        }
        MutableLongIntMap mutableLongIntMap = this.selectableIdToInfoListIndex;
        List<SelectableInfo> list = this.infoList;
        int i14 = this.startSlot;
        int i15 = i14 == -1 ? i10 : i14;
        int i16 = this.endSlot;
        return new MultiSelectionLayout(mutableLongIntMap, list, i15, i16 == -1 ? i10 : i16, this.isStartHandle, this.previousSelection);
    }

    public final LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }

    /* renamed from: getCurrentPosition-F1C5BW0, reason: not valid java name */
    public final long m28228getCurrentPositionF1C5BW0() {
        return this.currentPosition;
    }

    /* renamed from: getPreviousHandlePosition-F1C5BW0, reason: not valid java name */
    public final long m28229getPreviousHandlePositionF1C5BW0() {
        return this.previousHandlePosition;
    }

    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final Comparator<Long> getSelectableIdOrderingComparator() {
        return this.selectableIdOrderingComparator;
    }

    public final boolean isStartHandle() {
        return this.isStartHandle;
    }

    private SelectionLayoutBuilder(long j10, long j11, LayoutCoordinates layoutCoordinates, boolean z10, Selection selection, Comparator<Long> comparator) {
        this.currentPosition = j10;
        this.previousHandlePosition = j11;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z10;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        this.selectableIdToInfoListIndex = LongIntMapKt.mutableLongIntMapOf();
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }
}
