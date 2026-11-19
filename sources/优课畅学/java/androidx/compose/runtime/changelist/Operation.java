package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final int objects;

    @StabilityInferred(parameters = 1)
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.advanceBy(operationArgContainer.getInt(0));
        }

        public final int getDistance() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? "distance" : super.intParamName(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class AppendValue extends Operation {
        public static final int $stable = 0;
        public static final AppendValue INSTANCE = new AppendValue();

        private AppendValue() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            Object objMo23761getObject31yXWZQ = operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1));
            if (objMo23761getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) objMo23761getObject31yXWZQ);
            }
            slotWriter.appendSlot(anchor, objMo23761getObject31yXWZQ);
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m23716getAnchorHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m23717getValueHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "anchor" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "value" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1));
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager);
        }

        /* renamed from: getChanges-HpuvwBQ, reason: not valid java name */
        public final int m23718getChangesHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m23719getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "changes" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "effectiveNodeIndex" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int element = ((IntRef) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1));
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                AbstractC9133u.m16131e(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i11 = element + i10;
                applier.insertBottomUp(i11, obj);
                applier.insertTopDown(i11, obj);
            }
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m23720getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m23721getNodesHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "effectiveNodeIndex" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "nodes" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1));
            MovableContentState movableContentStateMovableContentStateResolve$runtime_release = (MovableContentState) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            if (movableContentStateMovableContentStateResolve$runtime_release == null && (movableContentStateMovableContentStateResolve$runtime_release = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<Anchor> listMoveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentStateMovableContentStateResolve$runtime_release.getSlotTable$runtime_release(), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            ControlledComposition composition$runtime_release = movableContentStateReference2.getComposition$runtime_release();
            AbstractC9133u.m16131e(composition$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.adoptAnchoredScopes$runtime_release(slotWriter, listMoveIntoGroupFrom, (RecomposeScopeOwner) composition$runtime_release);
        }

        /* renamed from: getFrom-HpuvwBQ, reason: not valid java name */
        public final int m23722getFromHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(2);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m23723getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        /* renamed from: getResolvedState-HpuvwBQ, reason: not valid java name */
        public final int m23724getResolvedStateHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        /* renamed from: getTo-HpuvwBQ, reason: not valid java name */
        public final int m23725getToHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "resolvedState" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "resolvedCompositionContext" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(2)) ? TypedValues.TransitionType.S_FROM : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(3)) ? TypedValues.TransitionType.S_TO : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        private DeactivateCurrentGroup() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1));
            AbstractC9133u.m16131e(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.setElement(OperationKt.positionToInsert(slotWriter, anchor, applier));
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m23726getAnchorHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        /* renamed from: getEffectiveNodeIndexOut-HpuvwBQ, reason: not valid java name */
        public final int m23727getEffectiveNodeIndexOutHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "effectiveNodeIndexOut" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "anchor" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Downs extends Operation {
        public static final int $stable = 0;
        public static final Downs INSTANCE = new Downs();

        /* JADX WARN: Illegal instructions before constructor call */
        private Downs() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            AbstractC9133u.m16131e(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0))) {
                applier.down(obj);
            }
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m23728getNodesHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "nodes" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ((InterfaceC10570l) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0))).invoke((Composition) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1)));
        }

        /* renamed from: getAction-HpuvwBQ, reason: not valid java name */
        public final int m23729getActionHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m23730getCompositionHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "anchor" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "composition" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        private EndCurrentGroup() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        /* JADX WARN: Illegal instructions before constructor call */
        private EndMovableContentPlacement() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            AbstractC9133u.m16131e(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class EndResumingScope extends Operation {
        public static final int $stable = 0;
        public static final EndResumingScope INSTANCE = new EndResumingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        private EndResumingScope() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.endResumingScope((RecomposeScopeImpl) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0)));
        }

        /* renamed from: getScope-HpuvwBQ, reason: not valid java name */
        public final int m23731getScopeHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "scope" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        private EnsureGroupStarted() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.ensureStarted((Anchor) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0)));
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m23732getAnchorHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "anchor" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        private EnsureRootGroupStarted() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object objInvoke = ((InterfaceC10559a) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0))).invoke();
            Anchor anchor = (Anchor) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1));
            int i10 = operationArgContainer.getInt(0);
            AbstractC9133u.m16131e(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.updateNode(anchor, objInvoke);
            applier.insertTopDown(i10, objInvoke);
            applier.down(objInvoke);
        }

        /* renamed from: getFactory-HpuvwBQ, reason: not valid java name */
        public final int m23733getFactoryHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m23734getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? "insertIndex" : super.intParamName(i10);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "factory" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "groupAnchor" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m23735getAnchorHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m23736getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "anchor" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? TypedValues.TransitionType.S_FROM : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(2));
            SlotWriter slotWriterOpenWriter = slotTable.openWriter();
            try {
                fixupList.executeAndFlushAllPendingFixups(applier, slotWriterOpenWriter, rememberManager);
                C8736p c8736p = C8736p.f16368a;
                slotWriterOpenWriter.close(true);
                slotWriter.beginInsert();
                slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
                slotWriter.endInsert();
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m23737getAnchorHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        /* renamed from: getFixups-HpuvwBQ, reason: not valid java name */
        public final int m23738getFixupsHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(2);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m23739getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "anchor" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? TypedValues.TransitionType.S_FROM : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(2)) ? "fixups" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.moveGroup(operationArgContainer.getInt(0));
        }

        public final int getOffset() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? "offset" : super.intParamName(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.move(operationArgContainer.getInt(0), operationArgContainer.getInt(1), operationArgContainer.getInt(2));
        }

        public final int getCount() {
            return 2;
        }

        public final int getFrom() {
            return 0;
        }

        public final int getTo() {
            return 1;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? TypedValues.TransitionType.S_FROM : i10 == 1 ? TypedValues.TransitionType.S_TO : i10 == 2 ? "count" : super.intParamName(i10);
        }
    }

    public static final class ObjectParameter<T> {
        private final int offset;

        private /* synthetic */ ObjectParameter(int i10) {
            this.offset = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m23740boximpl(int i10) {
            return new ObjectParameter(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m23741constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m23742equalsimpl(int i10, Object obj) {
            return (obj instanceof ObjectParameter) && i10 == ((ObjectParameter) obj).m23746unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m23743equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m23744hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m23745toStringimpl(int i10) {
            return "ObjectParameter(offset=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return m23742equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return m23744hashCodeimpl(this.offset);
        }

        public String toString() {
            return m23745toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m23746unboximpl() {
            return this.offset;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        /* JADX WARN: Illegal instructions before constructor call */
        private PostInsertNodeFixup() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            int i10 = operationArgContainer.getInt(0);
            applier.mo972up();
            AbstractC9133u.m16131e(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(i10, slotWriter.node(anchor));
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m23747getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? "insertIndex" : super.intParamName(i10);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "groupAnchor" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ControlledComposition controlledComposition = (ControlledComposition) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(2));
            ((CompositionContext) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1))).movableContentStateReleased$runtime_release(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(controlledComposition, movableContentStateReference, slotWriter, null), applier);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m23748getCompositionHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m23749getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        /* renamed from: getReference-HpuvwBQ, reason: not valid java name */
        public final int m23750getReferenceHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "composition" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "parentCompositionContext" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(2)) ? TypedValues.Custom.S_REFERENCE : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Remember extends Operation {
        public static final int $stable = 0;
        public static final Remember INSTANCE = new Remember();

        /* JADX WARN: Illegal instructions before constructor call */
        private Remember() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.remembering((RememberObserverHolder) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0)));
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m23751getValueHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "value" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class RememberPausingScope extends Operation {
        public static final int $stable = 0;
        public static final RememberPausingScope INSTANCE = new RememberPausingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        private RememberPausingScope() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.rememberPausingScope((RecomposeScopeImpl) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0)));
        }

        /* renamed from: getScope-HpuvwBQ, reason: not valid java name */
        public final int m23752getScopeHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "scope" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        private RemoveCurrentGroup() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;
        public static final RemoveNode INSTANCE = new RemoveNode();

        /* JADX WARN: Illegal instructions before constructor call */
        private RemoveNode() {
            int i10 = 2;
            super(i10, 0, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.remove(operationArgContainer.getInt(0), operationArgContainer.getInt(1));
        }

        public final int getCount() {
            return 1;
        }

        public final int getRemoveIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? "removeIndex" : i10 == 1 ? "count" : super.intParamName(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;
        public static final ResetSlots INSTANCE = new ResetSlots();

        /* JADX WARN: Illegal instructions before constructor call */
        private ResetSlots() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.reset();
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;
        public static final SideEffect INSTANCE = new SideEffect();

        /* JADX WARN: Illegal instructions before constructor call */
        private SideEffect() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.sideEffect((InterfaceC10559a) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0)));
        }

        /* renamed from: getEffect-HpuvwBQ, reason: not valid java name */
        public final int m23753getEffectHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "effect" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        private SkipToEndOfCurrentGroup() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.skipToGroupEnd();
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class StartResumingScope extends Operation {
        public static final int $stable = 0;
        public static final StartResumingScope INSTANCE = new StartResumingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        private StartResumingScope() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.startResumingScope((RecomposeScopeImpl) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0)));
        }

        /* renamed from: getScope-HpuvwBQ, reason: not valid java name */
        public final int m23754getScopeHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "scope" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class TestOperation extends Operation {
        public static final int $stable = 8;
        private final InterfaceC10575q block;
        private final List<Integer> intParams;
        private final List<ObjectParameter<Object>> objParams;

        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ void getIntParams$annotations() {
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            this.block.invoke(applier, slotWriter, rememberManager);
        }

        public final InterfaceC10575q getBlock() {
            return this.block;
        }

        public final List<Integer> getIntParams() {
            return this.intParams;
        }

        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + Utils_jvmKt.identityHashCode(this);
        }

        public /* synthetic */ TestOperation(int i10, int i11, InterfaceC10575q interfaceC10575q, int i12, AbstractC9126n abstractC9126n) {
            this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? new InterfaceC10575q() { // from class: androidx.compose.runtime.changelist.Operation.TestOperation.1
                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                }

                @Override // p300x7.InterfaceC10575q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Applier<?>) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return C8736p.f16368a;
                }
            } : interfaceC10575q);
        }

        public TestOperation(int i10, int i11, InterfaceC10575q interfaceC10575q) {
            super(i10, i11, null);
            this.block = interfaceC10575q;
            ArrayList arrayList = new ArrayList(i10);
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(Integer.valueOf(i12));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList2.add(ObjectParameter.m23740boximpl(ObjectParameter.m23741constructorimpl(i13)));
            }
            this.objParams = arrayList2;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class TrimParentValues extends Operation {
        public static final int $stable = 0;
        public static final TrimParentValues INSTANCE = new TrimParentValues();

        private TrimParentValues() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int iAnchorIndex;
            int slotsSize;
            int i10 = operationArgContainer.getInt(0);
            int slotsSize2 = slotWriter.getSlotsSize();
            int parent = slotWriter.getParent();
            int iSlotsStartIndex$runtime_release = slotWriter.slotsStartIndex$runtime_release(parent);
            int iSlotsEndIndex$runtime_release = slotWriter.slotsEndIndex$runtime_release(parent);
            for (int iMax = Math.max(iSlotsStartIndex$runtime_release, iSlotsEndIndex$runtime_release - i10); iMax < iSlotsEndIndex$runtime_release; iMax++) {
                Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(iMax)];
                if (obj instanceof RememberObserverHolder) {
                    int i11 = slotsSize2 - iMax;
                    RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                    Anchor after = rememberObserverHolder.getAfter();
                    if (after == null || !after.getValid()) {
                        iAnchorIndex = -1;
                        slotsSize = -1;
                    } else {
                        iAnchorIndex = slotWriter.anchorIndex(after);
                        slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                    }
                    rememberManager.forgetting(rememberObserverHolder, i11, iAnchorIndex, slotsSize);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            slotWriter.trimTailSlots(i10);
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? "count" : super.intParamName(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class UpdateAnchoredValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateAnchoredValue INSTANCE = new UpdateAnchoredValue();

        private UpdateAnchoredValue() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int iAnchorIndex;
            int slotsSize;
            Object objMo23761getObject31yXWZQ = operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1));
            int i10 = operationArgContainer.getInt(0);
            if (objMo23761getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) objMo23761getObject31yXWZQ);
            }
            int iAnchorIndex2 = slotWriter.anchorIndex(anchor);
            Object obj = slotWriter.set(iAnchorIndex2, i10, objMo23761getObject31yXWZQ);
            if (!(obj instanceof RememberObserverHolder)) {
                if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                    return;
                }
                return;
            }
            int slotsSize2 = slotWriter.getSlotsSize() - slotWriter.slotIndexOfGroupSlotIndex(iAnchorIndex2, i10);
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
            Anchor after = rememberObserverHolder.getAfter();
            if (after == null || !after.getValid()) {
                iAnchorIndex = -1;
                slotsSize = -1;
            } else {
                iAnchorIndex = slotWriter.anchorIndex(after);
                slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
            }
            rememberManager.forgetting(rememberObserverHolder, slotsSize2, iAnchorIndex, slotsSize);
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m23755getAnchorHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m23756getValueHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? "groupSlotIndex" : super.intParamName(i10);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "value" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "anchor" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        /* JADX WARN: Illegal instructions before constructor call */
        private UpdateAuxData() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.updateAux(operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0)));
        }

        /* renamed from: getData-HpuvwBQ, reason: not valid java name */
        public final int m23757getDataHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "data" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.apply((InterfaceC10574p) operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(1)), operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0)));
        }

        /* renamed from: getBlock-HpuvwBQ, reason: not valid java name */
        public final int m23758getBlockHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(1);
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m23759getValueHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "value" : ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(1)) ? "block" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateValue INSTANCE = new UpdateValue();

        /* JADX WARN: Illegal instructions before constructor call */
        private UpdateValue() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object objMo23761getObject31yXWZQ = operationArgContainer.mo23761getObject31yXWZQ(ObjectParameter.m23741constructorimpl(0));
            int i10 = operationArgContainer.getInt(0);
            if (objMo23761getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) objMo23761getObject31yXWZQ);
            }
            Object obj = slotWriter.set(slotWriter.getCurrentGroup(), i10, objMo23761getObject31yXWZQ);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) obj, slotWriter.getSlotsSize() - slotWriter.slotIndexOfGroupSlotIndex(slotWriter.getCurrentGroup(), i10), -1, -1);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m23760getValueHpuvwBQ() {
            return ObjectParameter.m23741constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? "groupSlotIndex" : super.intParamName(i10);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo23715objectParamName31yXWZQ(int i10) {
            return ObjectParameter.m23743equalsimpl0(i10, ObjectParameter.m23741constructorimpl(0)) ? "value" : super.mo23715objectParamName31yXWZQ(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Ups extends Operation {
        public static final int $stable = 0;
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int i10 = operationArgContainer.getInt(0);
            for (int i11 = 0; i11 < i10; i11++) {
                applier.mo972up();
            }
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public String intParamName(int i10) {
            return i10 == 0 ? "count" : super.intParamName(i10);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        /* JADX WARN: Illegal instructions before constructor call */
        private UseCurrentNode() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.reuse();
        }
    }

    public /* synthetic */ Operation(int i10, int i11, AbstractC9126n abstractC9126n) {
        this(i10, i11);
    }

    public abstract void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager);

    public final int getInts() {
        return this.ints;
    }

    public final String getName() {
        String strMo13672g = AbstractC9137y.m16154b(getClass()).mo13672g();
        return strMo13672g == null ? "" : strMo13672g;
    }

    public final int getObjects() {
        return this.objects;
    }

    public String intParamName(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    /* renamed from: objectParamName-31yXWZQ, reason: not valid java name */
    public String mo23715objectParamName31yXWZQ(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public String toString() {
        return getName();
    }

    private Operation(int i10, int i11) {
        this.ints = i10;
        this.objects = i11;
    }

    public /* synthetic */ Operation(int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, null);
    }
}
