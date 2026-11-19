package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10968r;

/* loaded from: classes3.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {
    private final WindowStrictModeException exception;
    private final Logger logger;
    private final String message;
    private final String tag;
    private final T value;
    private final SpecificationComputer.VerificationMode verificationMode;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FailedSpecification(T value, String tag, String message, Logger logger, SpecificationComputer.VerificationMode verificationMode) {
        AbstractC9979u.m20294g(value, "value");
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(message, "message");
        AbstractC9979u.m20294g(logger, "logger");
        AbstractC9979u.m20294g(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        AbstractC9979u.m20293f(stackTrace, "stackTrace");
        Object[] array = AbstractC10968r.m24096p0(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.exception = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() throws WindowStrictModeException {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.verificationMode.ordinal()];
        if (i10 == 1) {
            throw this.exception;
        }
        if (i10 == 2) {
            this.logger.debug(this.tag, createMessage(this.value, this.message));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final WindowStrictModeException getException() {
        return this.exception;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final T getValue() {
        return this.value;
    }

    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String message, InterfaceC9540l condition) {
        AbstractC9979u.m20294g(message, "message");
        AbstractC9979u.m20294g(condition, "condition");
        return this;
    }
}
