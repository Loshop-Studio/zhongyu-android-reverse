package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.layout.SubcomposeSlotReusePolicy;

/* loaded from: classes2.dex */
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    private final int maxSlotsToRetainForReuse;

    public FixedCountSubcomposeSlotReusePolicy(int i10) {
        this.maxSlotsToRetainForReuse = i10;
    }

    @Override // androidx.compose.p014ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return true;
    }

    @Override // androidx.compose.p014ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        int size = slotIdsSet.size();
        int i10 = this.maxSlotsToRetainForReuse;
        if (size > i10) {
            slotIdsSet.trimToSize(i10);
        }
    }
}
