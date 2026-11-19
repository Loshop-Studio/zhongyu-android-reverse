package androidx.window.core;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
public abstract class SpecificationComputer<T> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i10 & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        public final <T> SpecificationComputer<T> startSpecification(T t10, String tag, VerificationMode verificationMode, Logger logger) {
            AbstractC9979u.m20294g(t10, "<this>");
            AbstractC9979u.m20294g(tag, "tag");
            AbstractC9979u.m20294g(verificationMode, "verificationMode");
            AbstractC9979u.m20294g(logger, "logger");
            return new ValidSpecification(t10, tag, verificationMode, logger);
        }

        private Companion() {
        }
    }

    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    public abstract T compute();

    public final String createMessage(Object value, String message) {
        AbstractC9979u.m20294g(value, "value");
        AbstractC9979u.m20294g(message, "message");
        return message + " value: " + value;
    }

    public abstract SpecificationComputer<T> require(String str, InterfaceC9540l interfaceC9540l);
}
