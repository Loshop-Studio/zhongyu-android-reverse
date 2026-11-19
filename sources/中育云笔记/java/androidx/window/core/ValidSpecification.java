package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
final class ValidSpecification<T> extends SpecificationComputer<T> {
    private final Logger logger;
    private final String tag;
    private final T value;
    private final SpecificationComputer.VerificationMode verificationMode;

    public ValidSpecification(T value, String tag, SpecificationComputer.VerificationMode verificationMode, Logger logger) {
        AbstractC9979u.m20294g(value, "value");
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(verificationMode, "verificationMode");
        AbstractC9979u.m20294g(logger, "logger");
        this.value = value;
        this.tag = tag;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        return this.value;
    }

    public final Logger getLogger() {
        return this.logger;
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
        return ((Boolean) condition.invoke(this.value)).booleanValue() ? this : new FailedSpecification(this.value, this.tag, message, this.logger, this.verificationMode);
    }
}
