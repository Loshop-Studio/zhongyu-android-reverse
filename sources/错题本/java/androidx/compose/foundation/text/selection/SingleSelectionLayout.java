package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000 72\u00020\u0001:\u00017B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010'\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u00102\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0014\u00104\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0014\u00106\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010-¨\u00068"}, m5110d2 = {"Landroidx/compose/foundation/text/selection/SingleSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "", "isStartHandle", "", "startSlot", "endSlot", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "info", "<init>", "(ZIILandroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectableInfo;)V", "Lkotlin/Function1;", "Ld6/s;", "block", "forEachMiddleInfo", "(Lr6/c;)V", "other", "shouldRecomputeSelection", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "selection", "Landroidx/collection/LongObjectMap;", "createSubSelections", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/collection/LongObjectMap;", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "I", "getStartSlot", "()I", "getEndSlot", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "getSize", "size", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "getStartInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "startInfo", "getEndInfo", "endInfo", "getCurrentInfo", "currentInfo", "getFirstInfo", "firstInfo", "getLastInfo", "lastInfo", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class SingleSelectionLayout implements SelectionLayout {
    public static final long DEFAULT_SELECTABLE_ID = 1;
    public static final int DEFAULT_SLOT = 1;
    private final int endSlot;

    @NotNull
    private final SelectableInfo info;
    private final boolean isStartHandle;

    @Nullable
    private final Selection previousSelection;
    private final int startSlot;

    public SingleSelectionLayout(boolean z8, int i, int i8, @Nullable Selection selection, @NotNull SelectableInfo selectableInfo) {
        this.isStartHandle = z8;
        this.startSlot = i;
        this.endSlot = i8;
        this.previousSelection = selection;
        this.info = selectableInfo;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @NotNull
    public LongObjectMap<Selection> createSubSelections(@NotNull Selection selection) {
        return LongObjectMapKt.longObjectMapOf(this.info.getSelectableId(), ((selection.getHandlesCrossed() || selection.getStart().getOffset() <= selection.getEnd().getOffset()) && (!selection.getHandlesCrossed() || selection.getStart().getOffset() > selection.getEnd().getOffset())) ? selection : Selection.copy$default(selection, null, null, !selection.getHandlesCrossed(), 3, null));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @NotNull
    public CrossStatus getCrossStatus() {
        return getStartSlot() < getEndSlot() ? CrossStatus.NOT_CROSSED : getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.info.getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @NotNull
    /* renamed from: getCurrentInfo, reason: from getter */
    public SelectableInfo getInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @NotNull
    public SelectableInfo getEndInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @NotNull
    public SelectableInfo getFirstInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @NotNull
    public SelectableInfo getLastInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @Nullable
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @NotNull
    public SelectableInfo getStartInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: isStartHandle, reason: from getter */
    public boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(@Nullable SelectionLayout other) {
        return (getPreviousSelection() != null && other != null && (other instanceof SingleSelectionLayout) && getStartSlot() == other.getStartSlot() && getEndSlot() == other.getEndSlot() && getIsStartHandle() == other.getIsStartHandle() && !this.info.shouldRecomputeSelection(((SingleSelectionLayout) other).info)) ? false : true;
    }

    @NotNull
    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + getIsStartHandle() + ", crossed=" + getCrossStatus() + ", info=\n\t" + this.info + ')';
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(@NotNull InterfaceC6471c block) {
    }
}
