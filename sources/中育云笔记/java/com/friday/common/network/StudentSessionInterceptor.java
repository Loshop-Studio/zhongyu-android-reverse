package com.friday.common.network;

import je.C9745y;
import je.InterfaceC9739s;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11113g;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class StudentSessionInterceptor implements InterfaceC9739s {

    /* renamed from: a */
    public final StudentSession f6147a;

    @InterfaceC11829d(m26210c = "com.friday.common.network.StudentSessionInterceptor$intercept$1", m26211f = "StudentSessionInterceptor.kt", m26212l = {13}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.common.network.StudentSessionInterceptor$intercept$1 */
    public static final class C59691 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f6148c;

        public C59691(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return StudentSessionInterceptor.this.new C59691(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f6148c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                StudentSession studentSession = StudentSessionInterceptor.this.f6147a;
                this.f6148c = 1;
                if (studentSession.m5365i(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C59691) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public StudentSessionInterceptor(StudentSession studentSession) {
        AbstractC9979u.m20294g(studentSession, "studentSession");
        this.f6147a = studentSession;
    }

    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a chain) {
        AbstractC9979u.m20294g(chain, "chain");
        AbstractC11113g.m24717b(null, new C59691(null), 1, null);
        return chain.mo19477a(chain.request());
    }
}
