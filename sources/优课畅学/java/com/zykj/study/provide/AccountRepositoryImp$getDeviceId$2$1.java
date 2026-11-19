package com.zykj.study.provide;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p086e5.C8359h;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.provide.AccountRepositoryImp$getDeviceId$2$1", m17801f = "AccountRepositoryImp.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AccountRepositoryImp$getDeviceId$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11253a;

    /* renamed from: b */
    public final /* synthetic */ String f11254b;

    /* renamed from: c */
    public final /* synthetic */ String f11255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountRepositoryImp$getDeviceId$2$1(String str, String str2, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11254b = str;
        this.f11255c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new AccountRepositoryImp$getDeviceId$2$1(this.f11254b, this.f11255c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((AccountRepositoryImp$getDeviceId$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f11253a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        String strM13628b = C8359h.f15883a.m13628b(this.f11254b, this.f11255c);
        return strM13628b == null ? "" : strM13628b;
    }
}
