package vc;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;

/* renamed from: vc.d */
/* loaded from: classes6.dex */
public abstract class AbstractC11589d {
    /* renamed from: a */
    public static final InterfaceC11588c m25523a(InterfaceC9540l interfaceC9540l, InterfaceC11588c completion) {
        AbstractC9979u.m20294g(interfaceC9540l, "<this>");
        AbstractC9979u.m20294g(completion, "completion");
        return new C11591f(IntrinsicsKt__IntrinsicsJvmKt.m20224d(IntrinsicsKt__IntrinsicsJvmKt.m20221a(interfaceC9540l, completion)), AbstractC11725a.m25952f());
    }

    /* renamed from: b */
    public static final InterfaceC11588c m25524b(InterfaceC9544p interfaceC9544p, Object obj, InterfaceC11588c completion) {
        AbstractC9979u.m20294g(interfaceC9544p, "<this>");
        AbstractC9979u.m20294g(completion, "completion");
        return new C11591f(IntrinsicsKt__IntrinsicsJvmKt.m20224d(IntrinsicsKt__IntrinsicsJvmKt.m20222b(interfaceC9544p, obj, completion)), AbstractC11725a.m25952f());
    }

    /* renamed from: c */
    public static final void m25525c(InterfaceC9544p interfaceC9544p, Object obj, InterfaceC11588c completion) {
        AbstractC9979u.m20294g(interfaceC9544p, "<this>");
        AbstractC9979u.m20294g(completion, "completion");
        IntrinsicsKt__IntrinsicsJvmKt.m20224d(IntrinsicsKt__IntrinsicsJvmKt.m20222b(interfaceC9544p, obj, completion)).resumeWith(Result.m20054c(C10786q.f26013a));
    }
}
