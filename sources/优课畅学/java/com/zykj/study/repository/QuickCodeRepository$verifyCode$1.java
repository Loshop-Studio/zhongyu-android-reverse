package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.QuickCodeRepository", m17801f = "QuickCodeRepository.kt", m17802l = {21}, m17803m = "verifyCode")
/* loaded from: classes3.dex */
public final class QuickCodeRepository$verifyCode$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11473a;

    /* renamed from: b */
    public /* synthetic */ Object f11474b;

    /* renamed from: c */
    public final /* synthetic */ QuickCodeRepository f11475c;

    /* renamed from: d */
    public int f11476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickCodeRepository$verifyCode$1(QuickCodeRepository quickCodeRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11475c = quickCodeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11474b = obj;
        this.f11476d |= Integer.MIN_VALUE;
        return this.f11475c.m10383c(null, this);
    }
}
