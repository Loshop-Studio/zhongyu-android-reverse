package androidx.compose.runtime.changelist;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p101k7.C5767i;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0002cdB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ>\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0011H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u000e\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\b2\u001b\u0010\u001a\u001a\u0017\u0012\b\u0012\u00060\u0019R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0011H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001e\u001a\u00020\b2\u001b\u0010\u001d\u001a\u0017\u0012\b\u0012\u00060\u0019R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0011H\u0086\b¢\u0006\u0004\b\u001e\u0010\u001cJ)\u0010%\u001a\u00020\b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0003J\u0018\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020-H\u0082\b¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\b2\u0006\u0010/\u001a\u00020-H\u0082\b¢\u0006\u0004\b7\u00104J\u001f\u00108\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0002¢\u0006\u0004\b8\u00106J\u0017\u00109\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b;\u0010:J\u0018\u0010=\u001a\u00020-2\u0006\u0010<\u001a\u00020-H\u0082\b¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020'*\u00020'H\u0002¢\u0006\u0004\b?\u0010,J\u0010\u0010@\u001a\u00020\nH\u0082\b¢\u0006\u0004\b@\u0010AJ\u001c\u0010D\u001a\u00020-2\n\u0010C\u001a\u00060-j\u0002`BH\u0082\b¢\u0006\u0004\bD\u0010>J\u001f\u0010G\u001a\u00020-2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030EH\u0082\bø\u0001\u0000¢\u0006\u0004\bF\u0010>J\u001f\u0010H\u001a\u00020'*\u00060\u0019R\u00020\u00002\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\bH\u0010IJ\u001d\u0010K\u001a\u00020'*\u0004\u0018\u00010J2\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\bK\u0010LJ'\u0010O\u001a\u00020'\"\u0004\b\u0000\u0010M*\b\u0012\u0004\u0012\u00028\u00000N2\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\bO\u0010PR\"\u0010R\u001a\b\u0012\u0004\u0012\u00020\n0Q8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bR\u0010S\u0012\u0004\bT\u0010\u0003R\u0016\u0010U\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020W8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bZ\u0010VR\u001e\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0Q8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b]\u0010VR\u0016\u0010^\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010VR\u0016\u0010_\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010VR\u0011\u0010b\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b`\u0010a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, m5110d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "Ld6/s;", "clear", "Landroidx/compose/runtime/changelist/Operation;", "operation", "pushOp", "(Landroidx/compose/runtime/changelist/Operation;)V", "push", "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/Operations$WriteScope;", "Lkotlin/ExtensionFunctionType;", "args", "(Landroidx/compose/runtime/changelist/Operation;Lr6/c;)V", "ensureAllArgumentsPushedFor", "pop", "other", "popInto", "(Landroidx/compose/runtime/changelist/Operations;)V", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "sink", "drain", "(Lr6/c;)V", "action", "forEach", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingOperations", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "toString", "()Ljava/lang/String;", "linePrefix", "toDebugString", "(Ljava/lang/String;)Ljava/lang/String;", "", "currentSize", "requiredSize", "determineNewSize", "(II)I", "resizeOpCodes", "ensureIntArgsSizeAtLeast", "(I)V", "resizeIntArgs", "(II)V", "ensureObjectArgsSizeAtLeast", "resizeObjectArgs", "exceptionMessageForOperationPushNoScope", "(Landroidx/compose/runtime/changelist/Operation;)Ljava/lang/String;", "exceptionMessageForOperationPushWithScope", "paramCount", "createExpectedArgMask", "(I)I", "indent", "peekOperation", "()Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/IntParameter;", "parameter", "topIntIndexOf", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "topObjectIndexOf-31yXWZQ", "topObjectIndexOf", "currentOpToDebugString", "(Landroidx/compose/runtime/changelist/Operations$OpIterator;Ljava/lang/String;)Ljava/lang/String;", "", "formatOpArgumentToString", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "", "toCollectionString", "(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;", "", "opCodes", "[Landroidx/compose/runtime/changelist/Operation;", "getOpCodes$runtime_release$annotations", "opCodesSize", "I", "", "intArgs", "[I", "intArgsSize", "objectArgs", "[Ljava/lang/Object;", "objectArgsSize", "pushedIntMask", "pushedObjectMask", "getSize", "()I", "size", "OpIterator", "WriteScope", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n145#1,5:643\n158#1,5:648\n255#1:657\n255#1:658\n334#1,7:666\n325#1,16:673\n356#1:689\n356#1:690\n334#1,7:691\n27#2,2:653\n27#2,2:655\n27#2,2:664\n4658#3,4:659\n1#4:663\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n123#1:643,5\n124#1:648,5\n212#1:657\n213#1:658\n325#1:666,7\n347#1:673,16\n359#1:689\n362#1:690\n576#1:691,7\n141#1:653,2\n166#1:655,2\n295#1:664,2\n211#1:659,4\n*E\n"})
/* loaded from: classes.dex */
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
    @NotNull
    public Operation[] opCodes = new Operation[16];

    @JvmField
    @NotNull
    public int[] intArgs = new int[16];

    @JvmField
    @NotNull
    public Object[] objectArgs = new Object[16];

    @Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u000fH\u0016J&\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m5110d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "(Landroidx/compose/runtime/changelist/Operations;)V", "intIdx", "", "objIdx", "opIdx", "operation", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", "currentOperationDebugString", "", "getInt", "parameter", "Landroidx/compose/runtime/changelist/IntParameter;", "getObject", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "next", "", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        @NotNull
        public final String currentOperationDebugString() {
            String str = "operation[" + this.opIdx + "] = " + Operations.this.currentOpToDebugString(this, "");
            AbstractC5830k.m5329f(str, "toString(...)");
            return str;
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt(int parameter) {
            return Operations.this.intArgs[this.intIdx + parameter];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo10167getObject31yXWZQ(int parameter) {
            return (T) Operations.this.objectArgs[this.objIdx + parameter];
        }

        @NotNull
        public final Operation getOperation() {
            return Operations.this.opCodes[this.opIdx];
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation = getOperation();
            this.intIdx = operation.getInts() + this.intIdx;
            this.objIdx = operation.getObjects() + this.objIdx;
            int i = this.opIdx + 1;
            this.opIdx = i;
            return i < Operations.this.opCodesSize;
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
        boolean z8 = true;
        for (int i = 0; i < ints; i++) {
            String strIntParamName = operation.intParamName(i);
            if (z8) {
                z8 = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            sb.append(strIndent);
            sb.append(strIntParamName);
            sb.append(" = ");
            sb.append(opIterator.getInt(i));
        }
        int objects = operation.getObjects();
        for (int i8 = 0; i8 < objects; i8++) {
            int iM10147constructorimpl = Operation.ObjectParameter.m10147constructorimpl(i8);
            String strMo10121objectParamName31yXWZQ = operation.mo10121objectParamName31yXWZQ(iM10147constructorimpl);
            if (z8) {
                z8 = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            sb.append(strIndent);
            sb.append(strMo10121objectParamName31yXWZQ);
            sb.append(" = ");
            sb.append(formatOpArgumentToString(opIterator.mo10167getObject31yXWZQ(iM10147constructorimpl), strIndent));
        }
        sb.append('\n');
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    private final int determineNewSize(int currentSize, int requiredSize) {
        int i = currentSize + (currentSize <= 1024 ? currentSize : 1024);
        return i < requiredSize ? requiredSize : i;
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
        int i = 0;
        for (int i8 = 0; i8 < ints; i8++) {
            if (((1 << i8) & this.pushedIntMask) == 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(operation.intParamName(i8));
                i++;
            }
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        StringBuilder sb2 = new StringBuilder();
        int objects = operation.getObjects();
        int i9 = 0;
        for (int i10 = 0; i10 < objects; i10++) {
            if (((1 << i10) & this.pushedObjectMask) == 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(operation.mo10121objectParamName31yXWZQ(Operation.ObjectParameter.m10147constructorimpl(i10)));
                i9++;
            }
        }
        String string2 = sb2.toString();
        AbstractC5830k.m5329f(string2, "toString(...)");
        return "Error while pushing " + operation + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i9 + " object arguments (" + string2 + ").";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            return toCollectionString(objArr.length == 0 ? EmptyList.INSTANCE : new C5767i(objArr, 1), str);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            return toCollectionString(iArr.length == 0 ? EmptyList.INSTANCE : new C5767i(iArr, 2), str);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            return toCollectionString(jArr.length == 0 ? EmptyList.INSTANCE : new C5767i(jArr, 3), str);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            return toCollectionString(fArr.length == 0 ? EmptyList.INSTANCE : new C5767i(fArr, 4), str);
        }
        if (!(obj instanceof double[])) {
            return obj instanceof Iterable ? toCollectionString((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
        }
        double[] dArr = (double[]) obj;
        return toCollectionString(dArr.length == 0 ? EmptyList.INSTANCE : new C5767i(dArr, 5), str);
    }

    public static /* synthetic */ void getOpCodes$runtime_release$annotations() {
    }

    private final String indent(String str) {
        return AbstractC0037f.m74C(str, "    ");
    }

    private final Operation peekOperation() {
        return this.opCodes[this.opCodesSize - 1];
    }

    private final void resizeIntArgs(int currentSize, int requiredSize) {
        int[] iArr = new int[determineNewSize(currentSize, requiredSize)];
        AbstractC5802q.m5212y(0, 0, this.intArgs, iArr, currentSize);
        this.intArgs = iArr;
    }

    private final void resizeObjectArgs(int currentSize, int requiredSize) {
        Object[] objArr = new Object[determineNewSize(currentSize, requiredSize)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, currentSize);
        this.objectArgs = objArr;
    }

    private final void resizeOpCodes() {
        int i = this.opCodesSize;
        Operation[] operationArr = new Operation[(i <= 1024 ? i : 1024) + i];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i);
        this.opCodes = operationArr;
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, final String str) {
        return AbstractC5805t.m5234n0(iterable, ", ", "[", "]", new InterfaceC6471c() { // from class: androidx.compose.runtime.changelist.Operations.toCollectionString.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C20261) obj);
            }

            @Override // p152r6.InterfaceC6471c
            public final CharSequence invoke(T t8) {
                return Operations.this.formatOpArgumentToString(t8, str);
            }
        }, 24);
    }

    private final int topIntIndexOf(int parameter) {
        return (this.intArgsSize - this.opCodes[this.opCodesSize - 1].getInts()) + parameter;
    }

    /* renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    private final int m10168topObjectIndexOf31yXWZQ(int parameter) {
        return (this.objectArgsSize - this.opCodes[this.opCodesSize - 1].getObjects()) + parameter;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        AbstractC5802q.m5186M(null, this.objectArgs, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void drain(@NotNull InterfaceC6471c sink) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                sink.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void ensureAllArgumentsPushedFor(@NotNull Operation operation) {
        int i = this.pushedIntMask;
        int ints = operation.getInts();
        if (i == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void executeAndFlushAllPendingOperations(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slots, rememberManager);
            } while (opIterator.next());
        }
        clear();
    }

    public final void forEach(@NotNull InterfaceC6471c action) {
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
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        Operation operation = operationArr[i];
        operationArr[i] = null;
        int objects = operation.getObjects();
        for (int i8 = 0; i8 < objects; i8++) {
            Object[] objArr = this.objectArgs;
            int i9 = this.objectArgsSize - 1;
            this.objectArgsSize = i9;
            objArr[i9] = null;
        }
        this.intArgsSize -= operation.getInts();
    }

    public final void popInto(@NotNull Operations other) {
        Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        Operation operation = operationArr[i];
        operationArr[i] = null;
        other.pushOp(operation);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = other.objectArgs;
        int objects = other.objectArgsSize - operation.getObjects();
        int objects2 = this.objectArgsSize - operation.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        AbstractC5802q.m5186M(null, this.objectArgs, this.objectArgsSize - operation.getObjects(), this.objectArgsSize);
        AbstractC5802q.m5212y(other.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgs, other.intArgs, this.intArgsSize);
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    public final void push(@NotNull Operation operation) {
        pushOp(operation);
    }

    @InternalComposeApi
    public final void pushOp(@NotNull Operation operation) {
        if (this.opCodesSize == this.opCodes.length) {
            resizeOpCodes();
        }
        int ints = operation.getInts() + this.intArgsSize;
        int length = this.intArgs.length;
        if (ints > length) {
            resizeIntArgs(length, ints);
        }
        int objects = operation.getObjects() + this.objectArgsSize;
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            resizeObjectArgs(length2, objects);
        }
        Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize;
        this.opCodesSize = i + 1;
        operationArr[i] = operation;
        this.intArgsSize = operation.getInts() + this.intArgsSize;
        this.objectArgsSize = operation.getObjects() + this.objectArgsSize;
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @NotNull
    public String toDebugString(@NotNull String linePrefix) {
        StringBuilder sb = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i = 0;
            while (true) {
                sb.append(linePrefix);
                int i8 = i + 1;
                sb.append(i);
                sb.append(". ");
                sb.append(currentOpToDebugString(opIterator, linePrefix));
                sb.append('\n');
                if (!opIterator.next()) {
                    break;
                }
                i = i8;
            }
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @Deprecated(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @ReplaceWith(expression = "toDebugString()", imports = {}))
    @NotNull
    public String toString() {
        return super.toString();
    }

    public final void push(@NotNull Operation operation, @NotNull InterfaceC6471c args) {
        pushOp(operation);
        args.invoke(WriteScope.m10169boximpl(WriteScope.m10170constructorimpl(this)));
        ensureAllArgumentsPushedFor(operation);
    }

    @Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\u0014\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000f\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0011\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000f\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0011\u001a\u00020\u00062\n\u0010\u0015\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0016\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0017J,\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u00182\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\t\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010 \u001a\u00020\n\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001d2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0011\u001a\u00028\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJd\u0010 \u001a\u00020\n\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001d\"\u0004\b\u0002\u0010!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0080\u0001\u0010 \u001a\u00020\n\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001d\"\u0004\b\u0002\u0010!\"\u0004\b\u0003\u0010$2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00030\u00192\u0006\u0010&\u001a\u00028\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0010\u0010,\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00104\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m5110d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "Landroidx/compose/runtime/changelist/Operations;", "stack", "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "", "Landroidx/compose/runtime/changelist/IntParameter;", "parameter", "value", "Ld6/s;", "setInt-impl", "(Landroidx/compose/runtime/changelist/Operations;II)V", "setInt", "parameter1", "value1", "parameter2", "value2", "setInts-impl", "(Landroidx/compose/runtime/changelist/Operations;IIII)V", "setInts", "parameter3", "value3", "(Landroidx/compose/runtime/changelist/Operations;IIIIII)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "setObject", "U", "setObjects-4uCC6AY", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;)V", "setObjects", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "setObjects-t7hvbck", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", ExifInterface.LONGITUDE_WEST, "parameter4", "value4", "setObjects-OGa0p1M", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "", "toString-impl", "(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/changelist/Operations;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/Operation;", "getOperation-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;", "operation", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @JvmInline
    @SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n1#1,642:1\n356#2:643\n359#2:644\n356#2:645\n356#2:646\n356#2:647\n362#2:648\n356#2:649\n356#2:650\n356#2:651\n356#2:652\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n367#1:643\n378#1:644\n378#1:645\n396#1:646\n420#1:647\n436#1:648\n436#1:649\n454#1:650\n481#1:651\n513#1:652\n*E\n"})
    public static final class WriteScope {

        @NotNull
        private final Operations stack;

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m10169boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static Operations m10170constructorimpl(@NotNull Operations operations) {
            return operations;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10171equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && AbstractC5830k.m5325b(operations, ((WriteScope) obj).getStack());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10172equalsimpl0(Operations operations, Operations operations2) {
            return AbstractC5830k.m5325b(operations, operations2);
        }

        @NotNull
        /* renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m10173getOperationimpl(Operations operations) {
            return operations.opCodes[operations.opCodesSize - 1];
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10174hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: setInt-impl, reason: not valid java name */
        public static final void m10175setIntimpl(Operations operations, int i, int i8) {
            operations.intArgs[(operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()) + i] = i8;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m10176setIntsimpl(Operations operations, int i, int i8, int i9, int i10) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i + ints] = i8;
            iArr[ints + i9] = i10;
        }

        /* renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m10178setObjectDKhxnng(Operations operations, int i, T t8) {
            operations.objectArgs[(operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects()) + i] = t8;
        }

        /* renamed from: setObjects-4uCC6AY, reason: not valid java name */
        public static final <T, U> void m10179setObjects4uCC6AY(Operations operations, int i, T t8, int i8, U u8) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i + objects] = t8;
            objArr[objects + i8] = u8;
        }

        /* renamed from: setObjects-OGa0p1M, reason: not valid java name */
        public static final <T, U, V, W> void m10180setObjectsOGa0p1M(Operations operations, int i, T t8, int i8, U u8, int i9, V v2, int i10, W w8) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i + objects] = t8;
            objArr[i8 + objects] = u8;
            objArr[i9 + objects] = v2;
            objArr[objects + i10] = w8;
        }

        /* renamed from: setObjects-t7hvbck, reason: not valid java name */
        public static final <T, U, V> void m10181setObjectst7hvbck(Operations operations, int i, T t8, int i8, U u8, int i9, V v2) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i + objects] = t8;
            objArr[i8 + objects] = u8;
            objArr[objects + i9] = v2;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10182toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m10171equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m10174hashCodeimpl(this.stack);
        }

        public String toString() {
            return m10182toStringimpl(this.stack);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ Operations getStack() {
            return this.stack;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m10177setIntsimpl(Operations operations, int i, int i8, int i9, int i10, int i11, int i12) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i + ints] = i8;
            iArr[i9 + ints] = i10;
            iArr[ints + i11] = i12;
        }
    }
}
