package com.zykj.study.provide;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.provide.AccountRepositoryImp", m17801f = "AccountRepositoryImp.kt", m17802l = {280}, m17803m = "getUserInfo")
/* loaded from: classes3.dex */
public final class AccountRepositoryImp$getUserInfo$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f11256a;

    /* renamed from: b */
    public final /* synthetic */ AccountRepositoryImp f11257b;

    /* renamed from: c */
    public int f11258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountRepositoryImp$getUserInfo$1(AccountRepositoryImp accountRepositoryImp, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11257b = accountRepositoryImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11256a = obj;
        this.f11258c |= Integer.MIN_VALUE;
        return this.f11257b.m10320j(this);
    }
}
