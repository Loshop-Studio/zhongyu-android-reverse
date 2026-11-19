package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int i10) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        operationsM30366constructorimpl.intArgs[operationsM30366constructorimpl.intArgsSize - operationsM30366constructorimpl.opCodes[operationsM30366constructorimpl.opCodesSize - 1].getInts()] = i10;
        operations.ensureAllArgumentsPushedFor(advanceSlotsBy);
    }

    public final void pushAppendValue(Anchor anchor, Object obj) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations.WriteScope.m30375setObjects4uCC6AY(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), anchor, Operation.ObjectParameter.m30343constructorimpl(1), obj);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        if (list.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations.WriteScope.m30375setObjects4uCC6AY(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(1), list, Operation.ObjectParameter.m30343constructorimpl(0), intRef);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations.WriteScope.m30376setObjectsOGa0p1M(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), movableContentState, Operation.ObjectParameter.m30343constructorimpl(1), compositionContext, Operation.ObjectParameter.m30343constructorimpl(3), movableContentStateReference2, Operation.ObjectParameter.m30343constructorimpl(2), movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(copySlotTableToAnchorLocation);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef intRef, Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations.WriteScope.m30375setObjects4uCC6AY(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), intRef, Operation.ObjectParameter.m30343constructorimpl(1), anchor);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushDowns(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations.WriteScope.m30374setObjectDKhxnng(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), objArr);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushEndCompositionScope(InterfaceC9540l interfaceC9540l, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations.WriteScope.m30375setObjects4uCC6AY(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), interfaceC9540l, Operation.ObjectParameter.m30343constructorimpl(1), composition);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEndResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        operations.pushOp(endResumingScope);
        Operations.WriteScope.m30374setObjectDKhxnng(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m30374setObjectDKhxnng(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), anchor);
        operations.ensureAllArgumentsPushedFor(ensureGroupStarted);
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef intRef) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations.WriteScope.m30375setObjects4uCC6AY(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), changeList, Operation.ObjectParameter.m30343constructorimpl(1), intRef);
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable slotTable) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations.WriteScope.m30375setObjects4uCC6AY(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), anchor, Operation.ObjectParameter.m30343constructorimpl(1), slotTable);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }

    public final void pushMoveCurrentGroup(int i10) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        operationsM30366constructorimpl.intArgs[operationsM30366constructorimpl.intArgsSize - operationsM30366constructorimpl.opCodes[operationsM30366constructorimpl.opCodesSize - 1].getInts()] = i10;
        operations.ensureAllArgumentsPushedFor(moveCurrentGroup);
    }

    public final void pushMoveNode(int i10, int i11, int i12) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        int ints = operationsM30366constructorimpl.intArgsSize - operationsM30366constructorimpl.opCodes[operationsM30366constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = operationsM30366constructorimpl.intArgs;
        iArr[ints + 1] = i10;
        iArr[ints] = i11;
        iArr[ints + 2] = i12;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations.WriteScope.m30377setObjectst7hvbck(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), controlledComposition, Operation.ObjectParameter.m30343constructorimpl(1), compositionContext, Operation.ObjectParameter.m30343constructorimpl(2), movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroupAtCurrent);
    }

    public final void pushRemember(RememberObserverHolder rememberObserverHolder) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m30374setObjectDKhxnng(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), rememberObserverHolder);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.INSTANCE;
        operations.pushOp(rememberPausingScope);
        Operations.WriteScope.m30374setObjectDKhxnng(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int i10, int i11) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        int ints = operationsM30366constructorimpl.intArgsSize - operationsM30366constructorimpl.opCodes[operationsM30366constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = operationsM30366constructorimpl.intArgs;
        iArr[ints] = i10;
        iArr[ints + 1] = i11;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(InterfaceC9529a interfaceC9529a) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m30374setObjectDKhxnng(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), interfaceC9529a);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushStartResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        operations.pushOp(startResumingScope);
        Operations.WriteScope.m30374setObjectDKhxnng(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushTrimValues(int i10) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        operationsM30366constructorimpl.intArgs[operationsM30366constructorimpl.intArgsSize - operationsM30366constructorimpl.opCodes[operationsM30366constructorimpl.opCodesSize - 1].getInts()] = i10;
        operations.ensureAllArgumentsPushedFor(trimParentValues);
    }

    public final void pushUpdateAnchoredValue(Object obj, Anchor anchor, int i10) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        Operations.WriteScope.m30375setObjects4uCC6AY(operationsM30366constructorimpl, Operation.ObjectParameter.m30343constructorimpl(0), obj, Operation.ObjectParameter.m30343constructorimpl(1), anchor);
        operationsM30366constructorimpl.intArgs[operationsM30366constructorimpl.intArgsSize - operationsM30366constructorimpl.opCodes[operationsM30366constructorimpl.opCodesSize - 1].getInts()] = i10;
        operations.ensureAllArgumentsPushedFor(updateAnchoredValue);
    }

    public final void pushUpdateAuxData(Object obj) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m30374setObjectDKhxnng(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), obj);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final <T, V> void pushUpdateNode(V v10, InterfaceC9544p interfaceC9544p) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        int iM30343constructorimpl = Operation.ObjectParameter.m30343constructorimpl(0);
        int iM30343constructorimpl2 = Operation.ObjectParameter.m30343constructorimpl(1);
        AbstractC9979u.m20292e(interfaceC9544p, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m30375setObjects4uCC6AY(operationsM30366constructorimpl, iM30343constructorimpl, v10, iM30343constructorimpl2, (InterfaceC9544p) AbstractC9962d0.m20254e(interfaceC9544p, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushUpdateValue(Object obj, int i10) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        Operations.WriteScope.m30374setObjectDKhxnng(operationsM30366constructorimpl, Operation.ObjectParameter.m30343constructorimpl(0), obj);
        operationsM30366constructorimpl.intArgs[operationsM30366constructorimpl.intArgsSize - operationsM30366constructorimpl.opCodes[operationsM30366constructorimpl.opCodesSize - 1].getInts()] = i10;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUps(int i10) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        operationsM30366constructorimpl.intArgs[operationsM30366constructorimpl.intArgsSize - operationsM30366constructorimpl.opCodes[operationsM30366constructorimpl.opCodesSize - 1].getInts()] = i10;
        operations.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushUseNode(Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChangeList instance containing ");
        sb2.append(getSize());
        sb2.append(" operations");
        if (sb2.length() > 0) {
            sb2.append(":\n");
            sb2.append(this.operations.toDebugString(str));
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations.WriteScope.m30377setObjectst7hvbck(Operations.WriteScope.m30366constructorimpl(operations), Operation.ObjectParameter.m30343constructorimpl(0), anchor, Operation.ObjectParameter.m30343constructorimpl(1), slotTable, Operation.ObjectParameter.m30343constructorimpl(2), fixupList);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }
}
