package androidx.compose.runtime;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CompositionDataImpl implements CompositionData, CompositionInstance {
    public static final int $stable = 8;
    private final Composition composition;

    public CompositionDataImpl(Composition composition) {
        this.composition = composition;
    }

    private static final CompositionGroup findContextGroup$lambda$2$scanGroup(SlotReader slotReader, CompositionContext compositionContext, SlotTable slotTable, int i10, int i11) {
        CompositionGroup compositionGroupFindContextGroup$lambda$2$scanGroup;
        while (true) {
            if (i10 >= i11) {
                return null;
            }
            int iGroupSize = slotReader.groupSize(i10) + i10;
            if (slotReader.hasMark(i10) && slotReader.groupKey(i10) == 206 && AbstractC9979u.m20289b(slotReader.groupObjectKey(i10), ComposerKt.getReference())) {
                Object objGroupGet = slotReader.groupGet(i10, 0);
                ComposerImpl.CompositionContextHolder compositionContextHolder = objGroupGet instanceof ComposerImpl.CompositionContextHolder ? (ComposerImpl.CompositionContextHolder) objGroupGet : null;
                if (compositionContextHolder != null && AbstractC9979u.m20289b(compositionContextHolder.getRef(), compositionContext)) {
                    return SlotTableKt.compositionGroupOf(slotTable, i10);
                }
            }
            if (slotReader.containsMark(i10) && (compositionGroupFindContextGroup$lambda$2$scanGroup = findContextGroup$lambda$2$scanGroup(slotReader, compositionContext, slotTable, i10 + 1, iGroupSize)) != null) {
                return compositionGroupFindContextGroup$lambda$2$scanGroup;
            }
            i10 = iGroupSize;
        }
    }

    private final CompositionContext getContext(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getParent();
        }
        return null;
    }

    private final SlotTable getSlotTable() {
        Composition composition = this.composition;
        AbstractC9979u.m20292e(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        return ((CompositionImpl) composition).getSlotTable$runtime_release();
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompositionDataImpl) && AbstractC9979u.m20289b(this.composition, ((CompositionDataImpl) obj).composition);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return getSlotTable().find(obj);
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionGroup findContextGroup() {
        SlotTable slotTable;
        Composition parent = getParent(this.composition);
        if (parent == null || (slotTable = getSlotTable(parent)) == null) {
            return null;
        }
        CompositionContext context = getContext(this.composition);
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            return findContextGroup$lambda$2$scanGroup(slotReaderOpenReader, context, slotTable, 0, slotReaderOpenReader.getSize());
        } finally {
            slotReaderOpenReader.close();
        }
    }

    public final Composition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return getSlotTable().getCompositionGroups();
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionData getData() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionInstance getParent() {
        Composition parent = getParent(this.composition);
        if (parent != null) {
            return new CompositionDataImpl(parent);
        }
        return null;
    }

    public int hashCode() {
        return this.composition.hashCode() * 31;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return getSlotTable().isEmpty();
    }

    private final Composition getParent(Composition composition) {
        CompositionContext context = getContext(composition);
        if (context != null) {
            return context.getComposition$runtime_release();
        }
        return null;
    }

    private final SlotTable getSlotTable(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getSlotTable$runtime_release();
        }
        return null;
    }
}
