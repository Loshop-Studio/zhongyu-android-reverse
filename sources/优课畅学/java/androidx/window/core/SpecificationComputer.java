package androidx.window.core;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public abstract class SpecificationComputer<T> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
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
            AbstractC9133u.m16133g(t10, "<this>");
            AbstractC9133u.m16133g(tag, "tag");
            AbstractC9133u.m16133g(verificationMode, "verificationMode");
            AbstractC9133u.m16133g(logger, "logger");
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
        AbstractC9133u.m16133g(value, "value");
        AbstractC9133u.m16133g(message, "message");
        return message + " value: " + value;
    }

    public abstract SpecificationComputer<T> require(String str, InterfaceC10570l interfaceC10570l);
}
