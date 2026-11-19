package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Operations extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    public int intArgsSize;
    public int objectArgsSize;
    public int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;
    public Operation[] opCodes = new Operation[16];
    public int[] intArgs = new int[16];
    public Object[] objectArgs = new Object[16];

    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        public final String currentOperationDebugString() {
            String str = "operation[" + this.opIdx + "] = " + Operations.this.currentOpToDebugString(this, "");
            AbstractC9979u.m20293f(str, "toString(...)");
            return str;
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt(int i10) {
            return Operations.this.intArgs[this.intIdx + i10];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo30363getObject31yXWZQ(int i10) {
            return (T) Operations.this.objectArgs[this.objIdx + i10];
        }

        public final Operation getOperation() {
            return Operations.this.opCodes[this.opIdx];
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation = getOperation();
            this.intIdx += operation.getInts();
            this.objIdx += operation.getObjects();
            int i10 = this.opIdx + 1;
            this.opIdx = i10;
            return i10 < Operations.this.opCodesSize;
        }
    }

    private final int createExpectedArgMask(int i10) {
        return (i10 == 0 ? 0 : -1) >>> (32 - i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String currentOpToDebugString(OpIterator opIterator, String str) {
        Operation operation = opIterator.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(operation.getName());
        sb2.append('(');
        String strIndent = indent(str);
        int ints = operation.getInts();
        boolean z10 = true;
        for (int i10 = 0; i10 < ints; i10++) {
            String strIntParamName = operation.intParamName(i10);
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append('\n');
            AbstractC9979u.m20293f(sb2, "append(...)");
            sb2.append(strIndent);
            sb2.append(strIntParamName);
            sb2.append(" = ");
            sb2.append(opIterator.getInt(i10));
        }
        int objects = operation.getObjects();
        for (int i11 = 0; i11 < objects; i11++) {
            int iM30343constructorimpl = Operation.ObjectParameter.m30343constructorimpl(i11);
            String strMo30317objectParamName31yXWZQ = operation.mo30317objectParamName31yXWZQ(iM30343constructorimpl);
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append('\n');
            AbstractC9979u.m20293f(sb2, "append(...)");
            sb2.append(strIndent);
            sb2.append(strMo30317objectParamName31yXWZQ);
            sb2.append(" = ");
            sb2.append(formatOpArgumentToString(opIterator.mo30363getObject31yXWZQ(iM30343constructorimpl), strIndent));
        }
        sb2.append('\n');
        AbstractC9979u.m20293f(sb2, "append(...)");
        sb2.append(str);
        sb2.append(")");
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    private final int determineNewSize(int i10, int i11) {
        return AbstractC10410o.m21752e(i10 + AbstractC10410o.m21756i(i10, 1024), i11);
    }

    private final void ensureIntArgsSizeAtLeast(int i10) {
        int length = this.intArgs.length;
        if (i10 > length) {
            resizeIntArgs(length, i10);
        }
    }

    private final void ensureObjectArgsSizeAtLeast(int i10) {
        int length = this.objectArgs.length;
        if (i10 > length) {
            resizeObjectArgs(length, i10);
        }
    }

    private final String exceptionMessageForOperationPushNoScope(Operation operation) {
        return "Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.";
    }

    private final String exceptionMessageForOperationPushWithScope(Operation operation) {
        StringBuilder sb2 = new StringBuilder();
        int ints = operation.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & this.pushedIntMask) == 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(operation.intParamName(i11));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        StringBuilder sb3 = new StringBuilder();
        int objects = operation.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & this.pushedObjectMask) == 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(operation.mo30317objectParamName31yXWZQ(Operation.ObjectParameter.m30343constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC9979u.m20293f(string2, "toString(...)");
        return "Error while pushing " + operation + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        return obj == null ? "null" : obj instanceof Object[] ? toCollectionString(AbstractC10968r.m24080h0((Object[]) obj), str) : obj instanceof int[] ? toCollectionString(AbstractC10968r.m24076f0((int[]) obj), str) : obj instanceof long[] ? toCollectionString(AbstractC10968r.m24078g0((long[]) obj), str) : obj instanceof float[] ? toCollectionString(AbstractC10968r.m24074e0((float[]) obj), str) : obj instanceof double[] ? toCollectionString(AbstractC10968r.m24072d0((double[]) obj), str) : obj instanceof Iterable ? toCollectionString((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
    }

    public static /* synthetic */ void getOpCodes$runtime_release$annotations() {
    }

    private final String indent(String str) {
        return str + "    ";
    }

    private final Operation peekOperation() {
        return this.opCodes[this.opCodesSize - 1];
    }

    private final void resizeIntArgs(int i10, int i11) {
        int[] iArr = new int[determineNewSize(i10, i11)];
        AbstractC10964p.m24021n(this.intArgs, iArr, 0, 0, i10);
        this.intArgs = iArr;
    }

    private final void resizeObjectArgs(int i10, int i11) {
        Object[] objArr = new Object[determineNewSize(i10, i11)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, i10);
        this.objectArgs = objArr;
    }

    private final void resizeOpCodes() {
        int iM21756i = AbstractC10410o.m21756i(this.opCodesSize, 1024);
        int i10 = this.opCodesSize;
        Operation[] operationArr = new Operation[iM21756i + i10];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i10);
        this.opCodes = operationArr;
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, final String str) {
        return AbstractC10947g0.m23954w0(iterable, ", ", "[", "]", 0, null, new InterfaceC9540l() { // from class: androidx.compose.runtime.changelist.Operations.toCollectionString.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C25851) obj);
            }

            @Override // p181hd.InterfaceC9540l
            public final CharSequence invoke(T t10) {
                return Operations.this.formatOpArgumentToString(t10, str);
            }
        }, 24, null);
    }

    private final int topIntIndexOf(int i10) {
        return (this.intArgsSize - this.opCodes[this.opCodesSize - 1].getInts()) + i10;
    }

    /* renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    private final int m30364topObjectIndexOf31yXWZQ(int i10) {
        return (this.objectArgsSize - this.opCodes[this.opCodesSize - 1].getObjects()) + i10;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        AbstractC10964p.m23987B(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void drain(InterfaceC9540l interfaceC9540l) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                interfaceC9540l.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void ensureAllArgumentsPushedFor(Operation operation) {
        int i10 = this.pushedIntMask;
        int ints = operation.getInts();
        if (i10 == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void executeAndFlushAllPendingOperations(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slotWriter, rememberManager);
            } while (opIterator.next());
        }
        clear();
    }

    public final void forEach(InterfaceC9540l interfaceC9540l) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                interfaceC9540l.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    public final int getSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final void pop() {
        Operation[] operationArr = this.opCodes;
        int i10 = this.opCodesSize - 1;
        this.opCodesSize = i10;
        Operation operation = operationArr[i10];
        operationArr[i10] = null;
        int objects = operation.getObjects();
        for (int i11 = 0; i11 < objects; i11++) {
            Object[] objArr = this.objectArgs;
            int i12 = this.objectArgsSize - 1;
            this.objectArgsSize = i12;
            objArr[i12] = null;
        }
        this.intArgsSize -= operation.getInts();
    }

    public final void popInto(Operations operations) {
        Operation[] operationArr = this.opCodes;
        int i10 = this.opCodesSize - 1;
        this.opCodesSize = i10;
        Operation operation = operationArr[i10];
        operationArr[i10] = null;
        operations.pushOp(operation);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = operations.objectArgs;
        int objects = operations.objectArgsSize - operation.getObjects();
        int objects2 = this.objectArgsSize - operation.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        AbstractC10964p.m23987B(this.objectArgs, null, this.objectArgsSize - operation.getObjects(), this.objectArgsSize);
        AbstractC10964p.m24021n(this.intArgs, operations.intArgs, operations.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgsSize);
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    public final void push(Operation operation) {
        pushOp(operation);
    }

    @InternalComposeApi
    public final void pushOp(Operation operation) {
        if (this.opCodesSize == this.opCodes.length) {
            resizeOpCodes();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            resizeIntArgs(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            resizeObjectArgs(length2, objects);
        }
        Operation[] operationArr = this.opCodes;
        int i10 = this.opCodesSize;
        this.opCodesSize = i10 + 1;
        operationArr[i10] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb2 = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i10 = 0;
            while (true) {
                sb2.append(str);
                int i11 = i10 + 1;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(currentOpToDebugString(opIterator, str));
                AbstractC9979u.m20293f(sb2, "append(...)");
                sb2.append('\n');
                AbstractC9979u.m20293f(sb2, "append(...)");
                if (!opIterator.next()) {
                    break;
                }
                i10 = i11;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    @InterfaceC10770a
    public String toString() {
        return super.toString();
    }

    public final void push(Operation operation, InterfaceC9540l interfaceC9540l) {
        pushOp(operation);
        interfaceC9540l.invoke(WriteScope.m30365boximpl(WriteScope.m30366constructorimpl(this)));
        ensureAllArgumentsPushedFor(operation);
    }

    public static final class WriteScope {
        private final Operations stack;

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m30365boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Operations m30366constructorimpl(Operations operations) {
            return operations;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m30367equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && AbstractC9979u.m20289b(operations, ((WriteScope) obj).m30379unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m30368equalsimpl0(Operations operations, Operations operations2) {
            return AbstractC9979u.m20289b(operations, operations2);
        }

        /* renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m30369getOperationimpl(Operations operations) {
            return operations.opCodes[operations.opCodesSize - 1];
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m30370hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: setInt-impl, reason: not valid java name */
        public static final void m30371setIntimpl(Operations operations, int i10, int i11) {
            operations.intArgs[(operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()) + i10] = i11;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m30372setIntsimpl(Operations operations, int i10, int i11, int i12, int i13) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i10 + ints] = i11;
            iArr[ints + i12] = i13;
        }

        /* renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m30374setObjectDKhxnng(Operations operations, int i10, T t10) {
            operations.objectArgs[(operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects()) + i10] = t10;
        }

        /* renamed from: setObjects-4uCC6AY, reason: not valid java name */
        public static final <T, U> void m30375setObjects4uCC6AY(Operations operations, int i10, T t10, int i11, U u10) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i10 + objects] = t10;
            objArr[objects + i11] = u10;
        }

        /* renamed from: setObjects-OGa0p1M, reason: not valid java name */
        public static final <T, U, V, W> void m30376setObjectsOGa0p1M(Operations operations, int i10, T t10, int i11, U u10, int i12, V v10, int i13, W w10) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i10 + objects] = t10;
            objArr[i11 + objects] = u10;
            objArr[i12 + objects] = v10;
            objArr[objects + i13] = w10;
        }

        /* renamed from: setObjects-t7hvbck, reason: not valid java name */
        public static final <T, U, V> void m30377setObjectst7hvbck(Operations operations, int i10, T t10, int i11, U u10, int i12, V v10) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i10 + objects] = t10;
            objArr[i11 + objects] = u10;
            objArr[objects + i12] = v10;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m30378toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m30367equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m30370hashCodeimpl(this.stack);
        }

        public String toString() {
            return m30378toStringimpl(this.stack);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Operations m30379unboximpl() {
            return this.stack;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m30373setIntsimpl(Operations operations, int i10, int i11, int i12, int i13, int i14, int i15) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i10 + ints] = i11;
            iArr[i12 + ints] = i13;
            iArr[ints + i14] = i15;
        }
    }
}
