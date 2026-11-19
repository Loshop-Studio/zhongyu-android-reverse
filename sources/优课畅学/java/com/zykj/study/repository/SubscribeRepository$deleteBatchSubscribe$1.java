package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.SubscribeRepository", m17801f = "SubscribeRepository.kt", m17802l = {42}, m17803m = "deleteBatchSubscribe")
/* loaded from: classes3.dex */
public final class SubscribeRepository$deleteBatchSubscribe$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11511a;

    /* renamed from: b */
    public /* synthetic */ Object f11512b;

    /* renamed from: c */
    public final /* synthetic */ SubscribeRepository f11513c;

    /* renamed from: d */
    public int f11514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeRepository$deleteBatchSubscribe$1(SubscribeRepository subscribeRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11513c = subscribeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11512b = obj;
        this.f11514d |= Integer.MIN_VALUE;
        return this.f11513c.m10397c(null, this);
    }
}
