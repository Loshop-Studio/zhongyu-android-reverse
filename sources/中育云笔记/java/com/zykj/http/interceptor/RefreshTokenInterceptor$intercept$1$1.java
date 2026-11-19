package com.zykj.http.interceptor;

import com.zykj.lib.error.code.ErrorCode;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.http.interceptor.RefreshTokenInterceptor$intercept$1$1", m26211f = "RefreshTokenInterceptor.kt", m26212l = {42}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class RefreshTokenInterceptor$intercept$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f19695c;

    /* renamed from: d */
    public final /* synthetic */ RefreshTokenInterceptor f19696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshTokenInterceptor$intercept$1$1(RefreshTokenInterceptor refreshTokenInterceptor, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f19696d = refreshTokenInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new RefreshTokenInterceptor$intercept$1$1(this.f19696d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f19695c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11602k unauthorizedFlow = this.f19696d.getUnauthorizedFlow();
            ErrorCode errorCode = ErrorCode.NET_TOKEN_ERROR;
            this.f19695c = 1;
            if (unauthorizedFlow.emit(errorCode, this) == objM25952f) {
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
        return ((RefreshTokenInterceptor$intercept$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
