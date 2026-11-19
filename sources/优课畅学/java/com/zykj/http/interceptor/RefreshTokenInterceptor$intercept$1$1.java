package com.zykj.http.interceptor;

import com.zykj.lib.error.code.ErrorCode;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.http.interceptor.RefreshTokenInterceptor$intercept$1$1", m17801f = "RefreshTokenInterceptor.kt", m17802l = {42}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class RefreshTokenInterceptor$intercept$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9710a;

    /* renamed from: b */
    public final /* synthetic */ RefreshTokenInterceptor f9711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshTokenInterceptor$intercept$1$1(RefreshTokenInterceptor refreshTokenInterceptor, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9711b = refreshTokenInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new RefreshTokenInterceptor$intercept$1$1(this.f9711b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((RefreshTokenInterceptor$intercept$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f9710a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9270g unauthorizedFlow = this.f9711b.getUnauthorizedFlow();
            ErrorCode errorCode = ErrorCode.NET_TOKEN_ERROR;
            this.f9710a = 1;
            if (unauthorizedFlow.emit(errorCode, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
