package com.zykj.study.provide;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.provide.AccountRepositoryImp", m17801f = "AccountRepositoryImp.kt", m17802l = {64, 85, 86, 131}, m17803m = "login")
/* loaded from: classes3.dex */
public final class AccountRepositoryImp$login$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11259a;

    /* renamed from: b */
    public Object f11260b;

    /* renamed from: c */
    public Object f11261c;

    /* renamed from: d */
    public Object f11262d;

    /* renamed from: e */
    public Object f11263e;

    /* renamed from: f */
    public Object f11264f;

    /* renamed from: g */
    public /* synthetic */ Object f11265g;

    /* renamed from: h */
    public final /* synthetic */ AccountRepositoryImp f11266h;

    /* renamed from: i */
    public int f11267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountRepositoryImp$login$1(AccountRepositoryImp accountRepositoryImp, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11266h = accountRepositoryImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11265g = obj;
        this.f11267i |= Integer.MIN_VALUE;
        return this.f11266h.mo10313b(null, null, null, this);
    }
}
