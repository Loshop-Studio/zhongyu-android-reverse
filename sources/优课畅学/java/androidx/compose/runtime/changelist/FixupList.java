package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

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

    public final void createAndInsertNode(InterfaceC10559a interfaceC10559a, int i10, Anchor anchor) {
        Operations operations = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations.pushOp(insertNodeFixup);
        Operations operationsM23764constructorimpl = Operations.WriteScope.m23764constructorimpl(operations);
        Operations.WriteScope.m23772setObjectDKhxnng(operationsM23764constructorimpl, Operation.ObjectParameter.m23741constructorimpl(0), interfaceC10559a);
        operationsM23764constructorimpl.intArgs[operationsM23764constructorimpl.intArgsSize - operationsM23764constructorimpl.opCodes[operationsM23764constructorimpl.opCodesSize - 1].getInts()] = i10;
        Operations.WriteScope.m23772setObjectDKhxnng(operationsM23764constructorimpl, Operation.ObjectParameter.m23741constructorimpl(1), anchor);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations2.pushOp(postInsertNodeFixup);
        Operations operationsM23764constructorimpl2 = Operations.WriteScope.m23764constructorimpl(operations2);
        operationsM23764constructorimpl2.intArgs[operationsM23764constructorimpl2.intArgsSize - operationsM23764constructorimpl2.opCodes[operationsM23764constructorimpl2.opCodesSize - 1].getInts()] = i10;
        Operations.WriteScope.m23772setObjectDKhxnng(operationsM23764constructorimpl2, Operation.ObjectParameter.m23741constructorimpl(0), anchor);
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
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.operations.toDebugString(str));
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public final <V, T> void updateNode(V v10, InterfaceC10574p interfaceC10574p) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations operationsM23764constructorimpl = Operations.WriteScope.m23764constructorimpl(operations);
        Operations.WriteScope.m23772setObjectDKhxnng(operationsM23764constructorimpl, Operation.ObjectParameter.m23741constructorimpl(0), v10);
        int iM23741constructorimpl = Operation.ObjectParameter.m23741constructorimpl(1);
        AbstractC9133u.m16131e(interfaceC10574p, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m23772setObjectDKhxnng(operationsM23764constructorimpl, iM23741constructorimpl, (InterfaceC10574p) AbstractC9116d0.m16096e(interfaceC10574p, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }
}
