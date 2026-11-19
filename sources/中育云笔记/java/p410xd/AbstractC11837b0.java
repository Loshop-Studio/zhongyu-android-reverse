package p410xd;

import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p000a.C0000a;

/* renamed from: xd.b0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11837b0 {

    /* renamed from: a */
    public static final StackTraceElement f28077a = new C0000a().m0a();

    /* renamed from: b */
    public static final String f28078b;

    /* renamed from: c */
    public static final String f28079c;

    static {
        Object objM20054c;
        Object objM20054c2;
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        if (Result.m20056e(objM20054c) != null) {
            objM20054c = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f28078b = (String) objM20054c;
        try {
            objM20054c2 = Result.m20054c(AbstractC11837b0.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.C9921a c9921a3 = Result.f23263d;
            objM20054c2 = Result.m20054c(AbstractC9924b.m20070a(th2));
        }
        if (Result.m20056e(objM20054c2) != null) {
            objM20054c2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f28079c = (String) objM20054c2;
    }

    /* renamed from: a */
    public static final Throwable m26232a(Throwable th) {
        return th;
    }
}
