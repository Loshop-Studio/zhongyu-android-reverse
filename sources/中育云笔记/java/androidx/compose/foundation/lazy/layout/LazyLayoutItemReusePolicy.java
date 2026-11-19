package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.p014ui.layout.SubcomposeSlotReusePolicy;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {
    private final MutableObjectIntMap<Object> countPerType = ObjectIntMapKt.mutableObjectIntMapOf();
    private final LazyLayoutItemContentFactory factory;

    public LazyLayoutItemReusePolicy(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.factory = lazyLayoutItemContentFactory;
    }

    @Override // androidx.compose.p014ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return AbstractC9979u.m20289b(this.factory.getContentType(obj), this.factory.getContentType(obj2));
    }

    @Override // androidx.compose.p014ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        this.countPerType.clear();
        for (Object obj : slotIdsSet) {
            Object contentType = this.factory.getContentType(obj);
            int orDefault = this.countPerType.getOrDefault(contentType, 0);
            if (orDefault == 7) {
                slotIdsSet.remove(obj);
            } else {
                this.countPerType.set(contentType, orDefault + 1);
            }
        }
    }
}
