package p202o8;

import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p191n8.AbstractC9455k;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* renamed from: o8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9544a {
    /* renamed from: a */
    public static final void m17815a(InterfaceC9324c interfaceC9324c, Throwable th) throws Throwable {
        Result.C9076a c9076a = Result.f17350b;
        interfaceC9324c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m17816b(InterfaceC9324c interfaceC9324c, InterfaceC9324c interfaceC9324c2) throws Throwable {
        try {
            InterfaceC9324c interfaceC9324cM16079d = IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c);
            Result.C9076a c9076a = Result.f17350b;
            AbstractC9455k.m17354c(interfaceC9324cM16079d, Result.m15909b(C8736p.f16368a), null, 2, null);
        } catch (Throwable th) {
            m17815a(interfaceC9324c2, th);
        }
    }

    /* renamed from: c */
    public static final void m17817c(InterfaceC10574p interfaceC10574p, Object obj, InterfaceC9324c interfaceC9324c, InterfaceC10570l interfaceC10570l) throws Throwable {
        try {
            InterfaceC9324c interfaceC9324cM16079d = IntrinsicsKt__IntrinsicsJvmKt.m16079d(IntrinsicsKt__IntrinsicsJvmKt.m16077b(interfaceC10574p, obj, interfaceC9324c));
            Result.C9076a c9076a = Result.f17350b;
            AbstractC9455k.m17353b(interfaceC9324cM16079d, Result.m15909b(C8736p.f16368a), interfaceC10570l);
        } catch (Throwable th) {
            m17815a(interfaceC9324c, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m17818d(InterfaceC10574p interfaceC10574p, Object obj, InterfaceC9324c interfaceC9324c, InterfaceC10570l interfaceC10570l, int i10, Object obj2) throws Throwable {
        if ((i10 & 4) != 0) {
            interfaceC10570l = null;
        }
        m17817c(interfaceC10574p, obj, interfaceC9324c, interfaceC10570l);
    }
}
