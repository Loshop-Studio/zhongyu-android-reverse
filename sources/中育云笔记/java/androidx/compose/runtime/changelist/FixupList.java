package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void createAndInsertNode(InterfaceC9529a interfaceC9529a, int i10, Anchor anchor) {
        Operations operations = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations.pushOp(insertNodeFixup);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        Operations.WriteScope.m30374setObjectDKhxnng(operationsM30366constructorimpl, Operation.ObjectParameter.m30343constructorimpl(0), interfaceC9529a);
        operationsM30366constructorimpl.intArgs[operationsM30366constructorimpl.intArgsSize - operationsM30366constructorimpl.opCodes[operationsM30366constructorimpl.opCodesSize - 1].getInts()] = i10;
        Operations.WriteScope.m30374setObjectDKhxnng(operationsM30366constructorimpl, Operation.ObjectParameter.m30343constructorimpl(1), anchor);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations2.pushOp(postInsertNodeFixup);
        Operations operationsM30366constructorimpl2 = Operations.WriteScope.m30366constructorimpl(operations2);
        operationsM30366constructorimpl2.intArgs[operationsM30366constructorimpl2.intArgsSize - operationsM30366constructorimpl2.opCodes[operationsM30366constructorimpl2.opCodesSize - 1].getInts()] = i10;
        Operations.WriteScope.m30374setObjectDKhxnng(operationsM30366constructorimpl2, Operation.ObjectParameter.m30343constructorimpl(0), anchor);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixup);
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
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

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FixupList instance containing " + getSize() + " operations");
        if (sb2.length() > 0) {
            sb2.append(":\n" + this.operations.toDebugString(str));
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public final <V, T> void updateNode(V v10, InterfaceC9544p interfaceC9544p) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations operationsM30366constructorimpl = Operations.WriteScope.m30366constructorimpl(operations);
        Operations.WriteScope.m30374setObjectDKhxnng(operationsM30366constructorimpl, Operation.ObjectParameter.m30343constructorimpl(0), v10);
        int iM30343constructorimpl = Operation.ObjectParameter.m30343constructorimpl(1);
        AbstractC9979u.m20292e(interfaceC9544p, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m30374setObjectDKhxnng(operationsM30366constructorimpl, iM30343constructorimpl, (InterfaceC9544p) AbstractC9962d0.m20254e(interfaceC9544p, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }
}
