package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;
import p300x7.InterfaceC10570l;

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
            AbstractC9133u.m16132f(str, "toString(...)");
            return str;
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt(int i10) {
            return Operations.this.intArgs[this.intIdx + i10];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo23761getObject31yXWZQ(int i10) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(operation.getName());
        sb.append('(');
        String strIndent = indent(str);
        int ints = operation.getInts();
        boolean z10 = true;
        for (int i10 = 0; i10 < ints; i10++) {
            String strIntParamName = operation.intParamName(i10);
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            AbstractC9133u.m16132f(sb, "append(...)");
            sb.append(strIndent);
            sb.append(strIntParamName);
            sb.append(" = ");
            sb.append(opIterator.getInt(i10));
        }
        int objects = operation.getObjects();
        for (int i11 = 0; i11 < objects; i11++) {
            int iM23741constructorimpl = Operation.ObjectParameter.m23741constructorimpl(i11);
            String strMo23715objectParamName31yXWZQ = operation.mo23715objectParamName31yXWZQ(iM23741constructorimpl);
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            AbstractC9133u.m16132f(sb, "append(...)");
            sb.append(strIndent);
            sb.append(strMo23715objectParamName31yXWZQ);
            sb.append(" = ");
            sb.append(formatOpArgumentToString(opIterator.mo23761getObject31yXWZQ(iM23741constructorimpl), strIndent));
        }
        sb.append('\n');
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    private final int determineNewSize(int i10, int i11) {
        return AbstractC8323h.m13510e(i10 + AbstractC8323h.m13513h(i10, 1024), i11);
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
        StringBuilder sb = new StringBuilder();
        int ints = operation.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & this.pushedIntMask) == 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(operation.intParamName(i11));
                i10++;
            }
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        StringBuilder sb2 = new StringBuilder();
        int objects = operation.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & this.pushedObjectMask) == 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(operation.mo23715objectParamName31yXWZQ(Operation.ObjectParameter.m23741constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        AbstractC9133u.m16132f(string2, "toString(...)");
        return "Error while pushing " + operation + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        return obj == null ? "null" : obj instanceof Object[] ? toCollectionString(AbstractC8801r.m14711i0((Object[]) obj), str) : obj instanceof int[] ? toCollectionString(AbstractC8801r.m14707g0((int[]) obj), str) : obj instanceof long[] ? toCollectionString(AbstractC8801r.m14709h0((long[]) obj), str) : obj instanceof float[] ? toCollectionString(AbstractC8801r.m14705f0((float[]) obj), str) : obj instanceof double[] ? toCollectionString(AbstractC8801r.m14703e0((double[]) obj), str) : obj instanceof Iterable ? toCollectionString((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
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
        AbstractC8797p.m14647n(this.intArgs, iArr, 0, 0, i10);
        this.intArgs = iArr;
    }

    private final void resizeObjectArgs(int i10, int i11) {
        Object[] objArr = new Object[determineNewSize(i10, i11)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, i10);
        this.objectArgs = objArr;
    }

    private final void resizeOpCodes() {
        int iM13513h = AbstractC8323h.m13513h(this.opCodesSize, 1024);
        int i10 = this.opCodesSize;
        Operation[] operationArr = new Operation[iM13513h + i10];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i10);
        this.opCodes = operationArr;
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, final String str) {
        return AbstractC8778f0.m14576v0(iterable, ", ", "[", "]", 0, null, new InterfaceC10570l() { // from class: androidx.compose.runtime.changelist.Operations.toCollectionString.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C25551) obj);
            }

            @Override // p300x7.InterfaceC10570l
            public final CharSequence invoke(T t10) {
                return Operations.this.formatOpArgumentToString(t10, str);
            }
        }, 24, null);
    }

    private final int topIntIndexOf(int i10) {
        return (this.intArgsSize - this.opCodes[this.opCodesSize - 1].getInts()) + i10;
    }

    /* renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    private final int m23762topObjectIndexOf31yXWZQ(int i10) {
        return (this.objectArgsSize - this.opCodes[this.opCodesSize - 1].getObjects()) + i10;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        AbstractC8797p.m14613C(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void drain(InterfaceC10570l interfaceC10570l) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                interfaceC10570l.invoke(opIterator);
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

    public final void forEach(InterfaceC10570l interfaceC10570l) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                interfaceC10570l.invoke(opIterator);
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
        AbstractC8797p.m14613C(this.objectArgs, null, this.objectArgsSize - operation.getObjects(), this.objectArgsSize);
        AbstractC8797p.m14647n(this.intArgs, operations.intArgs, operations.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgsSize);
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
        StringBuilder sb = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i10 = 0;
            while (true) {
                sb.append(str);
                int i11 = i10 + 1;
                sb.append(i10);
                sb.append(". ");
                sb.append(currentOpToDebugString(opIterator, str));
                AbstractC9133u.m16132f(sb, "append(...)");
                sb.append('\n');
                AbstractC9133u.m16132f(sb, "append(...)");
                if (!opIterator.next()) {
                    break;
                }
                i10 = i11;
            }
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    @InterfaceC8721a
    public String toString() {
        return super.toString();
    }

    public final void push(Operation operation, InterfaceC10570l interfaceC10570l) {
        pushOp(operation);
        interfaceC10570l.invoke(WriteScope.m23763boximpl(WriteScope.m23764constructorimpl(this)));
        ensureAllArgumentsPushedFor(operation);
    }

    public static final class WriteScope {
        private final Operations stack;

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m23763boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Operations m23764constructorimpl(Operations operations) {
            return operations;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m23765equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && AbstractC9133u.m16128b(operations, ((WriteScope) obj).m23777unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m23766equalsimpl0(Operations operations, Operations operations2) {
            return AbstractC9133u.m16128b(operations, operations2);
        }

        /* renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m23767getOperationimpl(Operations operations) {
            return operations.opCodes[operations.opCodesSize - 1];
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m23768hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: setInt-impl, reason: not valid java name */
        public static final void m23769setIntimpl(Operations operations, int i10, int i11) {
            operations.intArgs[(operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()) + i10] = i11;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m23770setIntsimpl(Operations operations, int i10, int i11, int i12, int i13) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i10 + ints] = i11;
            iArr[ints + i12] = i13;
        }

        /* renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m23772setObjectDKhxnng(Operations operations, int i10, T t10) {
            operations.objectArgs[(operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects()) + i10] = t10;
        }

        /* renamed from: setObjects-4uCC6AY, reason: not valid java name */
        public static final <T, U> void m23773setObjects4uCC6AY(Operations operations, int i10, T t10, int i11, U u10) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i10 + objects] = t10;
            objArr[objects + i11] = u10;
        }

        /* renamed from: setObjects-OGa0p1M, reason: not valid java name */
        public static final <T, U, V, W> void m23774setObjectsOGa0p1M(Operations operations, int i10, T t10, int i11, U u10, int i12, V v10, int i13, W w10) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i10 + objects] = t10;
            objArr[i11 + objects] = u10;
            objArr[i12 + objects] = v10;
            objArr[objects + i13] = w10;
        }

        /* renamed from: setObjects-t7hvbck, reason: not valid java name */
        public static final <T, U, V> void m23775setObjectst7hvbck(Operations operations, int i10, T t10, int i11, U u10, int i12, V v10) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i10 + objects] = t10;
            objArr[i11 + objects] = u10;
            objArr[objects + i12] = v10;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m23776toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m23765equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m23768hashCodeimpl(this.stack);
        }

        public String toString() {
            return m23776toStringimpl(this.stack);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Operations m23777unboximpl() {
            return this.stack;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m23771setIntsimpl(Operations operations, int i10, int i11, int i12, int i13, int i14, int i15) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i10 + ints] = i11;
            iArr[i12 + ints] = i13;
            iArr[ints + i14] = i15;
        }
    }
}
