package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002PQB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0082\bJ\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J&\u0010\u001d\u001a\u00020\u00172\u001b\u0010\u001e\u001a\u0017\u0012\b\u0012\u00060 R\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u001f¢\u0006\u0002\b!H\u0086\bJ\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rJ\u0011\u0010$\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0006H\u0082\bJ\u0011\u0010%\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0006H\u0082\bJ\u0010\u0010&\u001a\u00020'2\u0006\u0010#\u001a\u00020\rH\u0002J\u0010\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\rH\u0002J\"\u0010)\u001a\u00020\u00172\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J&\u00100\u001a\u00020\u00172\u001b\u00101\u001a\u0017\u0012\b\u0012\u00060 R\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u001f¢\u0006\u0002\b!H\u0086\bJ\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\t\u00105\u001a\u00020\rH\u0082\bJ\u0006\u00106\u001a\u00020\u0017J\u000e\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u0000J\u000e\u00109\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rJ7\u00109\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\r2\u0017\u0010:\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00170\u001f¢\u0006\u0002\b!H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001J\u0010\u0010<\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rH\u0007J\u0018\u0010=\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0018\u0010>\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\b\u0010?\u001a\u00020\u0017H\u0002J\u0010\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020'H\u0016J\b\u0010B\u001a\u00020'H\u0017J\u0015\u0010C\u001a\u00020\u00062\n\u0010D\u001a\u00060\u0006j\u0002`EH\u0082\bJ\u001f\u0010F\u001a\u00020\u00062\n\u0010D\u001a\u0006\u0012\u0002\b\u00030GH\u0082\bø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\u00020'*\u00060 R\u00020\u00002\u0006\u0010A\u001a\u00020'H\u0002J\u0016\u0010K\u001a\u00020'*\u0004\u0018\u00010\t2\u0006\u0010A\u001a\u00020'H\u0002J\f\u0010L\u001a\u00020'*\u00020'H\u0002J \u0010M\u001a\u00020'\"\u0004\b\u0000\u0010N*\b\u0012\u0004\u0012\u0002HN0O2\u0006\u0010A\u001a\u00020'H\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000f\u0012\u0004\b\u000e\u0010\u0002R\u0012\u0010\u0010\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006R"}, m7880d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "intArgs", "", "intArgsSize", "", "objectArgs", "", "", "[Ljava/lang/Object;", "objectArgsSize", "opCodes", "Landroidx/compose/runtime/changelist/Operation;", "getOpCodes$runtime_release$annotations", "[Landroidx/compose/runtime/changelist/Operation;", "opCodesSize", "pushedIntMask", "pushedObjectMask", "size", "getSize", "()I", "clear", "", "createExpectedArgMask", "paramCount", "determineNewSize", "currentSize", "requiredSize", "drain", "sink", "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Lkotlin/ExtensionFunctionType;", "ensureAllArgumentsPushedFor", "operation", "ensureIntArgsSizeAtLeast", "ensureObjectArgsSizeAtLeast", "exceptionMessageForOperationPushNoScope", "", "exceptionMessageForOperationPushWithScope", "executeAndFlushAllPendingOperations", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "forEach", "action", "isEmpty", "", "isNotEmpty", "peekOperation", "pop", "popInto", "other", "push", "args", "Landroidx/compose/runtime/changelist/Operations$WriteScope;", "pushOp", "resizeIntArgs", "resizeObjectArgs", "resizeOpCodes", "toDebugString", "linePrefix", "toString", "topIntIndexOf", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "topObjectIndexOf", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "topObjectIndexOf-31yXWZQ", "(I)I", "currentOpToDebugString", "formatOpArgumentToString", "indent", "toCollectionString", ExifInterface.GPS_DIRECTION_TRUE, "", "OpIterator", "WriteScope", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n145#1,5:643\n158#1,5:648\n255#1:657\n255#1:658\n334#1,7:666\n325#1,16:673\n356#1:689\n356#1:690\n334#1,7:691\n27#2,2:653\n27#2,2:655\n27#2,2:664\n4658#3,4:659\n1#4:663\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n123#1:643,5\n124#1:648,5\n212#1:657\n213#1:658\n325#1:666,7\n347#1:673,16\n359#1:689\n362#1:690\n576#1:691,7\n141#1:653,2\n166#1:655,2\n295#1:664,2\n211#1:659,4\n*E\n"})
/* loaded from: classes2.dex */
public final class Operations extends OperationsDebugStringFormattable {
    public static final int $stable = 8;

    @JvmField
    public int intArgsSize;

    @JvmField
    public int objectArgsSize;

    @JvmField
    public int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;

    @JvmField
    public Operation[] opCodes = new Operation[16];

    @JvmField
    public int[] intArgs = new int[16];

    @JvmField
    public Object[] objectArgs = new Object[16];

    @Metadata(m7879d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u000fH\u0016J&\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m7880d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "(Landroidx/compose/runtime/changelist/Operations;)V", "intIdx", "", "objIdx", "opIdx", "operation", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", "currentOperationDebugString", "", "getInt", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "getObject", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "next", "", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        public final String currentOperationDebugString() {
            String str = "operation[" + this.opIdx + "] = " + Operations.this.currentOpToDebugString(this, "");
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            return str;
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt(int parameter) {
            return Operations.this.intArgs[this.intIdx + parameter];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo13399getObject31yXWZQ(int parameter) {
            return (T) Operations.this.objectArgs[this.objIdx + parameter];
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
            int i6 = this.opIdx + 1;
            this.opIdx = i6;
            return i6 < Operations.this.opCodesSize;
        }
    }

    private final int createExpectedArgMask(int paramCount) {
        return (paramCount == 0 ? 0 : -1) >>> (32 - paramCount);
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
        boolean z6 = true;
        for (int i6 = 0; i6 < ints; i6++) {
            String strIntParamName = operation.intParamName(i6);
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(strIndent);
            sb.append(strIntParamName);
            sb.append(" = ");
            sb.append(opIterator.getInt(i6));
        }
        int objects = operation.getObjects();
        for (int i7 = 0; i7 < objects; i7++) {
            int iM13379constructorimpl = Operation.ObjectParameter.m13379constructorimpl(i7);
            String strMo13353objectParamName31yXWZQ = operation.mo13353objectParamName31yXWZQ(iM13379constructorimpl);
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(strIndent);
            sb.append(strMo13353objectParamName31yXWZQ);
            sb.append(" = ");
            sb.append(formatOpArgumentToString(opIterator.mo13399getObject31yXWZQ(iM13379constructorimpl), strIndent));
        }
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final int determineNewSize(int currentSize, int requiredSize) {
        return RangesKt.coerceAtLeast(currentSize + RangesKt.coerceAtMost(currentSize, 1024), requiredSize);
    }

    private final void ensureIntArgsSizeAtLeast(int requiredSize) {
        int length = this.intArgs.length;
        if (requiredSize > length) {
            resizeIntArgs(length, requiredSize);
        }
    }

    private final void ensureObjectArgsSizeAtLeast(int requiredSize) {
        int length = this.objectArgs.length;
        if (requiredSize > length) {
            resizeObjectArgs(length, requiredSize);
        }
    }

    private final String exceptionMessageForOperationPushNoScope(Operation operation) {
        return "Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.";
    }

    private final String exceptionMessageForOperationPushWithScope(Operation operation) {
        StringBuilder sb = new StringBuilder();
        int ints = operation.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & this.pushedIntMask) == 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(operation.intParamName(i7));
                i6++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        StringBuilder sb2 = new StringBuilder();
        int objects = operation.getObjects();
        int i8 = 0;
        for (int i9 = 0; i9 < objects; i9++) {
            if (((1 << i9) & this.pushedObjectMask) == 0) {
                if (i6 > 0) {
                    sb2.append(", ");
                }
                sb2.append(operation.mo13353objectParamName31yXWZQ(Operation.ObjectParameter.m13379constructorimpl(i9)));
                i8++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return "Error while pushing " + operation + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string + ") and " + i8 + " object arguments (" + string2 + ").";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        return obj == null ? "null" : obj instanceof Object[] ? toCollectionString(ArraysKt.asIterable((Object[]) obj), str) : obj instanceof int[] ? toCollectionString(ArraysKt.asIterable((int[]) obj), str) : obj instanceof long[] ? toCollectionString(ArraysKt.asIterable((long[]) obj), str) : obj instanceof float[] ? toCollectionString(ArraysKt.asIterable((float[]) obj), str) : obj instanceof double[] ? toCollectionString(ArraysKt.asIterable((double[]) obj), str) : obj instanceof Iterable ? toCollectionString((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
    }

    public static /* synthetic */ void getOpCodes$runtime_release$annotations() {
    }

    private final String indent(String str) {
        return str + "    ";
    }

    private final Operation peekOperation() {
        return this.opCodes[this.opCodesSize - 1];
    }

    private final void resizeIntArgs(int currentSize, int requiredSize) {
        int[] iArr = new int[determineNewSize(currentSize, requiredSize)];
        ArraysKt.copyInto(this.intArgs, iArr, 0, 0, currentSize);
        this.intArgs = iArr;
    }

    private final void resizeObjectArgs(int currentSize, int requiredSize) {
        Object[] objArr = new Object[determineNewSize(currentSize, requiredSize)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, currentSize);
        this.objectArgs = objArr;
    }

    private final void resizeOpCodes() {
        int iCoerceAtMost = RangesKt.coerceAtMost(this.opCodesSize, 1024);
        int i6 = this.opCodesSize;
        Operation[] operationArr = new Operation[iCoerceAtMost + i6];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i6);
        this.opCodes = operationArr;
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, final String str) {
        return CollectionsKt.joinToString$default(iterable, ", ", "[", "]", 0, null, new Function1<T, CharSequence>() { // from class: androidx.compose.runtime.changelist.Operations.toCollectionString.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
                return invoke((C18511<T>) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(T t6) {
                return Operations.this.formatOpArgumentToString(t6, str);
            }
        }, 24, null);
    }

    private final int topIntIndexOf(int parameter) {
        return (this.intArgsSize - this.opCodes[this.opCodesSize - 1].getInts()) + parameter;
    }

    /* renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    private final int m13400topObjectIndexOf31yXWZQ(int parameter) {
        return (this.objectArgsSize - this.opCodes[this.opCodesSize - 1].getObjects()) + parameter;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        ArraysKt.fill(this.objectArgs, (Object) null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void drain(Function1<? super OpIterator, Unit> sink) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                sink.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void ensureAllArgumentsPushedFor(Operation operation) {
        int i6 = this.pushedIntMask;
        int ints = operation.getInts();
        if (i6 == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void executeAndFlushAllPendingOperations(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slots, rememberManager);
            } while (opIterator.next());
        }
        clear();
    }

    public final void forEach(Function1<? super OpIterator, Unit> action) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                action.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    /* renamed from: getSize, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        return getOpCodesSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getOpCodesSize() != 0;
    }

    public final void pop() {
        Operation[] operationArr = this.opCodes;
        int i6 = this.opCodesSize - 1;
        this.opCodesSize = i6;
        Operation operation = operationArr[i6];
        operationArr[i6] = null;
        int objects = operation.getObjects();
        for (int i7 = 0; i7 < objects; i7++) {
            Object[] objArr = this.objectArgs;
            int i8 = this.objectArgsSize - 1;
            this.objectArgsSize = i8;
            objArr[i8] = null;
        }
        this.intArgsSize -= operation.getInts();
    }

    public final void popInto(Operations other) {
        Operation[] operationArr = this.opCodes;
        int i6 = this.opCodesSize - 1;
        this.opCodesSize = i6;
        Operation operation = operationArr[i6];
        operationArr[i6] = null;
        other.pushOp(operation);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = other.objectArgs;
        int objects = other.objectArgsSize - operation.getObjects();
        int objects2 = this.objectArgsSize - operation.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        ArraysKt.fill(this.objectArgs, (Object) null, this.objectArgsSize - operation.getObjects(), this.objectArgsSize);
        ArraysKt.copyInto(this.intArgs, other.intArgs, other.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgsSize);
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
        int i6 = this.opCodesSize;
        this.opCodesSize = i6 + 1;
        operationArr[i6] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String linePrefix) {
        StringBuilder sb = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i6 = 0;
            while (true) {
                sb.append(linePrefix);
                int i7 = i6 + 1;
                sb.append(i6);
                sb.append(". ");
                sb.append(currentOpToDebugString(opIterator, linePrefix));
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                if (!opIterator.next()) {
                    break;
                }
                i6 = i7;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Deprecated(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @ReplaceWith(expression = "toDebugString()", imports = {}))
    public String toString() {
        return super.toString();
    }

    public final void push(Operation operation, Function1<? super WriteScope, Unit> args) {
        pushOp(operation);
        args.invoke(WriteScope.m13401boximpl(WriteScope.m13402constructorimpl(this)));
        ensureAllArgumentsPushedFor(operation);
    }

    @Metadata(m7879d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001c\u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001e\u001a\u00020\u0010H\u0086\b¢\u0006\u0004\b\u001f\u0010 JL\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001c\u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001e\u001a\u00020\u00102\n\u0010!\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\"\u001a\u00020\u0010H\u0086\b¢\u0006\u0004\b\u001f\u0010#J,\u0010$\u001a\u00020\u0014\"\u0004\b\u0000\u0010%2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u0017\u001a\u0002H%ø\u0001\u0000¢\u0006\u0004\b'\u0010(JH\u0010)\u001a\u00020\u0014\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010*2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u001c\u001a\u0002H%2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H*0&2\u0006\u0010\u001e\u001a\u0002H*ø\u0001\u0000¢\u0006\u0004\b+\u0010,Jd\u0010)\u001a\u00020\u0014\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010*\"\u0004\b\u0002\u0010-2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u001c\u001a\u0002H%2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H*0&2\u0006\u0010\u001e\u001a\u0002H*2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H-0&2\u0006\u0010\"\u001a\u0002H-ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0080\u0001\u0010)\u001a\u00020\u0014\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010*\"\u0004\b\u0002\u0010-\"\u0004\b\u0003\u001002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u001c\u001a\u0002H%2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H*0&2\u0006\u0010\u001e\u001a\u0002H*2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H-0&2\u0006\u0010\"\u001a\u0002H-2\f\u00101\u001a\b\u0012\u0004\u0012\u0002H00&2\u0006\u00102\u001a\u0002H0ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, m7880d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "stack", "Landroidx/compose/runtime/changelist/Operations;", "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "operation", "Landroidx/compose/runtime/changelist/Operation;", "getOperation-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;", "equals", "", "other", "equals-impl", "(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroidx/compose/runtime/changelist/Operations;)I", "setInt", "", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "value", "setInt-impl", "(Landroidx/compose/runtime/changelist/Operations;II)V", "setInts", "parameter1", "value1", "parameter2", "value2", "setInts-impl", "(Landroidx/compose/runtime/changelist/Operations;IIII)V", "parameter3", "value3", "(Landroidx/compose/runtime/changelist/Operations;IIIIII)V", "setObject", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "setObjects", "U", "setObjects-4uCC6AY", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;)V", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "setObjects-t7hvbck", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", ExifInterface.LONGITUDE_WEST, "parameter4", "value4", "setObjects-OGa0p1M", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "toString", "", "toString-impl", "(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    @JvmInline
    @SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n1#1,642:1\n356#2:643\n359#2:644\n356#2:645\n356#2:646\n356#2:647\n362#2:648\n356#2:649\n356#2:650\n356#2:651\n356#2:652\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n367#1:643\n378#1:644\n378#1:645\n396#1:646\n420#1:647\n436#1:648\n436#1:649\n454#1:650\n481#1:651\n513#1:652\n*E\n"})
    public static final class WriteScope {
        private final Operations stack;

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m13401boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Operations m13402constructorimpl(Operations operations) {
            return operations;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m13403equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && Intrinsics.areEqual(operations, ((WriteScope) obj).getStack());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m13404equalsimpl0(Operations operations, Operations operations2) {
            return Intrinsics.areEqual(operations, operations2);
        }

        /* renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m13405getOperationimpl(Operations operations) {
            return operations.opCodes[operations.opCodesSize - 1];
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m13406hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: setInt-impl, reason: not valid java name */
        public static final void m13407setIntimpl(Operations operations, int i6, int i7) {
            operations.intArgs[(operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()) + i6] = i7;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m13408setIntsimpl(Operations operations, int i6, int i7, int i8, int i9) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i6 + ints] = i7;
            iArr[ints + i8] = i9;
        }

        /* renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m13410setObjectDKhxnng(Operations operations, int i6, T t6) {
            operations.objectArgs[(operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects()) + i6] = t6;
        }

        /* renamed from: setObjects-4uCC6AY, reason: not valid java name */
        public static final <T, U> void m13411setObjects4uCC6AY(Operations operations, int i6, T t6, int i7, U u6) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i6 + objects] = t6;
            objArr[objects + i7] = u6;
        }

        /* renamed from: setObjects-OGa0p1M, reason: not valid java name */
        public static final <T, U, V, W> void m13412setObjectsOGa0p1M(Operations operations, int i6, T t6, int i7, U u6, int i8, V v6, int i9, W w6) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i6 + objects] = t6;
            objArr[i7 + objects] = u6;
            objArr[i8 + objects] = v6;
            objArr[objects + i9] = w6;
        }

        /* renamed from: setObjects-t7hvbck, reason: not valid java name */
        public static final <T, U, V> void m13413setObjectst7hvbck(Operations operations, int i6, T t6, int i7, U u6, int i8, V v6) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i6 + objects] = t6;
            objArr[i7 + objects] = u6;
            objArr[objects + i8] = v6;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m13414toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m13403equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m13406hashCodeimpl(this.stack);
        }

        public String toString() {
            return m13414toStringimpl(this.stack);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ Operations getStack() {
            return this.stack;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m13409setIntsimpl(Operations operations, int i6, int i7, int i8, int i9, int i10, int i11) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i6 + ints] = i7;
            iArr[i8 + ints] = i9;
            iArr[ints + i10] = i11;
        }
    }
}
