package androidx.compose.runtime;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010$\u001a\u00020\"H\u0016J\n\u0010%\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010&\u001a\u00020'H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001eR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001f¨\u0006("}, m5110d2 = {"Landroidx/compose/runtime/CompositionDataImpl;", "Landroidx/compose/runtime/tooling/CompositionData;", "Landroidx/compose/runtime/tooling/CompositionInstance;", "composition", "Landroidx/compose/runtime/Composition;", "(Landroidx/compose/runtime/Composition;)V", "getComposition", "()Landroidx/compose/runtime/Composition;", "compositionGroups", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "getCompositionGroups", "()Ljava/lang/Iterable;", "data", "getData", "()Landroidx/compose/runtime/tooling/CompositionData;", "isEmpty", "", "()Z", "parent", "getParent", "()Landroidx/compose/runtime/tooling/CompositionInstance;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable", "()Landroidx/compose/runtime/SlotTable;", "context", "Landroidx/compose/runtime/CompositionContext;", "getContext", "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/Composition;", "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/SlotTable;", "equals", "other", "", "find", "identityToFind", "findContextGroup", "hashCode", "", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/CompositionDataImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4891:1\n1#2:4892\n158#3,7:4893\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/CompositionDataImpl\n*L\n4854#1:4893,7\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionDataImpl implements CompositionData, CompositionInstance {
    public static final int $stable = 8;

    @NotNull
    private final Composition composition;

    public CompositionDataImpl(@NotNull Composition composition) {
        this.composition = composition;
    }

    private static final CompositionGroup findContextGroup$lambda$2$scanGroup(SlotReader slotReader, CompositionContext compositionContext, SlotTable slotTable, int i, int i8) {
        CompositionGroup compositionGroupFindContextGroup$lambda$2$scanGroup;
        while (true) {
            if (i >= i8) {
                return null;
            }
            int iGroupSize = slotReader.groupSize(i) + i;
            if (slotReader.hasMark(i) && slotReader.groupKey(i) == 206 && AbstractC5830k.m5325b(slotReader.groupObjectKey(i), ComposerKt.getReference())) {
                Object objGroupGet = slotReader.groupGet(i, 0);
                ComposerImpl.CompositionContextHolder compositionContextHolder = objGroupGet instanceof ComposerImpl.CompositionContextHolder ? (ComposerImpl.CompositionContextHolder) objGroupGet : null;
                if (compositionContextHolder != null && AbstractC5830k.m5325b(compositionContextHolder.getRef(), compositionContext)) {
                    return SlotTableKt.compositionGroupOf(slotTable, i);
                }
            }
            if (slotReader.containsMark(i) && (compositionGroupFindContextGroup$lambda$2$scanGroup = findContextGroup$lambda$2$scanGroup(slotReader, compositionContext, slotTable, i + 1, iGroupSize)) != null) {
                return compositionGroupFindContextGroup$lambda$2$scanGroup;
            }
            i = iGroupSize;
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
        AbstractC5830k.m5328e(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        return ((CompositionImpl) composition).getSlotTable();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof CompositionDataImpl) && AbstractC5830k.m5325b(this.composition, ((CompositionDataImpl) other).composition);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @Nullable
    public CompositionGroup find(@NotNull Object identityToFind) {
        return getSlotTable().find(identityToFind);
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    @Nullable
    public CompositionGroup findContextGroup() {
        SlotTable slotTable;
        Composition parent = getParent(this.composition);
        if (parent == null || (slotTable = getSlotTable(parent)) == null) {
            return null;
        }
        CompositionContext context = getContext(this.composition);
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            return findContextGroup$lambda$2$scanGroup(slotReaderOpenReader, context, slotTable, 0, slotReaderOpenReader.getGroupsSize());
        } finally {
            slotReaderOpenReader.close();
        }
    }

    @NotNull
    public final Composition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return getSlotTable().getCompositionGroups();
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    @NotNull
    public CompositionData getData() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    @Nullable
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
            return compositionImpl.getSlotTable();
        }
        return null;
    }
}
