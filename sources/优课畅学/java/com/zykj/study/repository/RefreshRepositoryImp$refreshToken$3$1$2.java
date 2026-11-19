package com.zykj.study.repository;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.zykj.lib.login.proto.ServerBean;
import com.zykj.study.bean.TokenResp;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.RefreshRepositoryImp$refreshToken$3$1$2", m17801f = "RefreshRepositoryImp.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RefreshRepositoryImp$refreshToken$3$1$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11498a;

    /* renamed from: b */
    public /* synthetic */ Object f11499b;

    /* renamed from: c */
    public final /* synthetic */ TokenResp f11500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRepositoryImp$refreshToken$3$1$2(TokenResp tokenResp, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11500c = tokenResp;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ServerBean serverBean, InterfaceC9324c interfaceC9324c) {
        return ((RefreshRepositoryImp$refreshToken$3$1$2) create(serverBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        RefreshRepositoryImp$refreshToken$3$1$2 refreshRepositoryImp$refreshToken$3$1$2 = new RefreshRepositoryImp$refreshToken$3$1$2(this.f11500c, interfaceC9324c);
        refreshRepositoryImp$refreshToken$3$1$2.f11499b = obj;
        return refreshRepositoryImp$refreshToken$3$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ServerBean serverBean = (ServerBean) this.f11499b;
        AbstractC9434a.m17291f();
        if (this.f11498a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ServerBean serverBeanBuild = serverBean.toBuilder().setAccessToken(this.f11500c.getAccessToken()).setRefreshToken(this.f11500c.getRefreshToken()).build();
        AbstractC9133u.m16132f(serverBeanBuild, "build(...)");
        return serverBeanBuild;
    }
}
