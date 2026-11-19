package p191n8;

import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p019b.C5020a;

/* renamed from: n8.c0 */
/* loaded from: classes5.dex */
public abstract class AbstractC9440c0 {

    /* renamed from: a */
    public static final StackTraceElement f18644a = new C5020a().m2059a();

    /* renamed from: b */
    public static final String f18645b;

    /* renamed from: c */
    public static final String f18646c;

    static {
        Object objM15909b;
        Object objM15909b2;
        try {
            Result.C9076a c9076a = Result.f17350b;
            objM15909b = Result.m15909b(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        if (Result.m15911d(objM15909b) != null) {
            objM15909b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f18645b = (String) objM15909b;
        try {
            objM15909b2 = Result.m15909b(AbstractC9440c0.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.C9076a c9076a3 = Result.f17350b;
            objM15909b2 = Result.m15909b(AbstractC9079b.m15925a(th2));
        }
        if (Result.m15911d(objM15909b2) != null) {
            objM15909b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f18646c = (String) objM15909b2;
    }

    /* renamed from: a */
    public static final Throwable m17304a(Throwable th) {
        return th;
    }
}
