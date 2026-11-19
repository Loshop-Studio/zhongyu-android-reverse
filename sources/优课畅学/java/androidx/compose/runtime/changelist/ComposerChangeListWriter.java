package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9131s;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ComposerChangeListWriter {
    private static final int invalidGroupLocation = -2;
    private ChangeList changeList;
    private final ComposerImpl composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startedGroups = new IntStack();
    private boolean implicitRootStart = true;
    private ArrayList pendingDownNodes = Stack.m23688constructorimpl$default(null, 1, null);
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public ComposerChangeListWriter(ComposerImpl composerImpl, ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    private final void ensureGroupStarted(Anchor anchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.startedGroup = true;
    }

    private final void ensureRootStarted() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureRootStarted();
        this.startedGroup = true;
    }

    private final SlotReader getReader() {
        return this.composer.getReader$runtime_release();
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter, ChangeList changeList, IntRef intRef, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushPendingUpsAndDowns() {
        int i10 = this.pendingUps;
        if (i10 > 0) {
            this.changeList.pushUps(i10);
            this.pendingUps = 0;
        }
        if (Stack.m23694isNotEmptyimpl(this.pendingDownNodes)) {
            this.changeList.pushDowns(Stack.m23699toArrayimpl(this.pendingDownNodes));
            Stack.m23686clearimpl(this.pendingDownNodes);
        }
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    private final void pushSlotTableOperationPreamble(boolean z10) {
        realizeOperationLocation(z10);
    }

    public static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter composerChangeListWriter, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z10);
    }

    private final void realizeMoveNode(int i10, int i11, int i12) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(i10, i11, i12);
    }

    private final void realizeNodeMovementOperations() {
        int i10 = this.moveCount;
        if (i10 > 0) {
            int i11 = this.removeFrom;
            if (i11 >= 0) {
                realizeRemoveNode(i11, i10);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i10);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeOperationLocation(boolean z10) {
        int parent = z10 ? getReader().getParent() : getReader().getCurrentGroup();
        int i10 = parent - this.writersReaderDelta;
        if (!(i10 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i10 > 0) {
            this.changeList.pushAdvanceSlotsBy(i10);
            this.writersReaderDelta = parent;
        }
    }

    public static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter composerChangeListWriter, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        composerChangeListWriter.realizeOperationLocation(z10);
    }

    private final void realizeRemoveNode(int i10, int i11) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(i10, i11);
    }

    public final void appendValue(Anchor anchor, Object obj) {
        this.changeList.pushAppendValue(anchor, obj);
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        this.changeList.pushCopyNodesToNewAnchorLocation(list, intRef);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.changeList.pushCopySlotTableToAnchorLocation(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(IntRef intRef, Anchor anchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(intRef, anchor);
    }

    public final void endCompositionScope(InterfaceC10570l interfaceC10570l, Composition composition) {
        this.changeList.pushEndCompositionScope(interfaceC10570l, composition);
    }

    public final void endCurrentGroup() {
        int parent = getReader().getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.startedGroups.pop();
            this.changeList.pushEndCurrentGroup();
        }
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i10, int i11) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int iNodeCount = getReader().isNode(i11) ? 1 : getReader().nodeCount(i11);
        if (iNodeCount > 0) {
            removeNode(i10, iNodeCount);
        }
    }

    public final void endResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushEndResumingScope(recomposeScopeImpl);
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.tos == 0) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final boolean getPastParent() {
        return getReader().getParent() - this.writersReaderDelta < 0;
    }

    public final void includeOperationsIn(ChangeList changeList, IntRef intRef) {
        this.changeList.pushExecuteOperationsIn(changeList, intRef);
    }

    public final void insertSlots(Anchor anchor, SlotTable slotTable) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, slotTable);
    }

    public final void moveCurrentGroup(int i10) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(i10);
    }

    public final void moveDown(Object obj) {
        realizeNodeMovementOperations();
        Stack.m23698pushimpl(this.pendingDownNodes, obj);
    }

    public final void moveNode(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.moveCount;
            if (i13 > 0 && this.moveFrom == i10 - i13 && this.moveTo == i11 - i13) {
                this.moveCount = i13 + i12;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = i10;
            this.moveTo = i11;
            this.moveCount = i12;
        }
    }

    public final void moveReaderRelativeTo(int i10) {
        this.writersReaderDelta += i10 - getReader().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int i10) {
        this.writersReaderDelta = i10;
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (Stack.m23694isNotEmptyimpl(this.pendingDownNodes)) {
            Stack.m23697popimpl(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void recordSlotEditing() {
        SlotReader reader;
        int parent;
        if (getReader().getSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (reader = getReader()).getParent())) {
            return;
        }
        ensureRootStarted();
        if (parent > 0) {
            Anchor anchor = reader.anchor(parent);
            this.startedGroups.push(parent);
            ensureGroupStarted(anchor);
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void releaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(controlledComposition, compositionContext, movableContentStateReference);
    }

    public final void remember(RememberObserverHolder rememberObserverHolder) {
        this.changeList.pushRemember(rememberObserverHolder);
    }

    public final void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushRememberPausingScope(recomposeScopeImpl);
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta += getReader().getGroupSize();
    }

    public final void removeNode(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                ComposerKt.composeImmediateRuntimeError("Invalid remove index " + i10);
            }
            if (this.removeFrom == i10) {
                this.moveCount += i11;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFrom = i10;
            this.moveCount = i11;
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
    }

    public final void setChangeList(ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void setImplicitRootStart(boolean z10) {
        this.implicitRootStart = z10;
    }

    public final void sideEffect(InterfaceC10559a interfaceC10559a) {
        this.changeList.pushSideEffect(interfaceC10559a);
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void startResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushStartResumingScope(recomposeScopeImpl);
    }

    public final void trimValues(int i10) {
        if (i10 > 0) {
            pushSlotEditingOperationPreamble();
            this.changeList.pushTrimValues(i10);
        }
    }

    public final void updateAnchoredValue(Object obj, Anchor anchor, int i10) {
        this.changeList.pushUpdateAnchoredValue(obj, anchor, i10);
    }

    public final void updateAuxData(Object obj) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(obj);
    }

    public final <T, V> void updateNode(V v10, InterfaceC10574p interfaceC10574p) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(v10, interfaceC10574p);
    }

    public final void updateValue(Object obj, int i10) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(obj, i10);
    }

    public final void useNode(Object obj) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(obj);
    }

    public final void withChangeList(ChangeList changeList, InterfaceC10559a interfaceC10559a) {
        ChangeList changeList2 = getChangeList();
        try {
            setChangeList(changeList);
            interfaceC10559a.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            setChangeList(changeList2);
            AbstractC9131s.m16124a(1);
        }
    }

    public final void withoutImplicitRootStart(InterfaceC10559a interfaceC10559a) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            interfaceC10559a.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            setImplicitRootStart(implicitRootStart);
            AbstractC9131s.m16124a(1);
        }
    }

    public final void insertSlots(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, slotTable, fixupList);
    }
}
