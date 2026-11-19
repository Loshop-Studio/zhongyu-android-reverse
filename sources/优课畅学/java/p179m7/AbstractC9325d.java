package p179m7;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* renamed from: m7.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9325d {
    /* renamed from: a */
    public static final InterfaceC9324c m17152a(InterfaceC10570l interfaceC10570l, InterfaceC9324c completion) {
        AbstractC9133u.m16133g(interfaceC10570l, "<this>");
        AbstractC9133u.m16133g(completion, "completion");
        return new C9327f(IntrinsicsKt__IntrinsicsJvmKt.m16079d(IntrinsicsKt__IntrinsicsJvmKt.m16076a(interfaceC10570l, completion)), AbstractC9434a.m17291f());
    }

    /* renamed from: b */
    public static final InterfaceC9324c m17153b(InterfaceC10574p interfaceC10574p, Object obj, InterfaceC9324c completion) {
        AbstractC9133u.m16133g(interfaceC10574p, "<this>");
        AbstractC9133u.m16133g(completion, "completion");
        return new C9327f(IntrinsicsKt__IntrinsicsJvmKt.m16079d(IntrinsicsKt__IntrinsicsJvmKt.m16077b(interfaceC10574p, obj, completion)), AbstractC9434a.m17291f());
    }

    /* renamed from: c */
    public static final void m17154c(InterfaceC10574p interfaceC10574p, Object obj, InterfaceC9324c completion) {
        AbstractC9133u.m16133g(interfaceC10574p, "<this>");
        AbstractC9133u.m16133g(completion, "completion");
        IntrinsicsKt__IntrinsicsJvmKt.m16079d(IntrinsicsKt__IntrinsicsJvmKt.m16077b(interfaceC10574p, obj, completion)).resumeWith(Result.m15909b(C8736p.f16368a));
    }
}
