package com.friday.common.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.ResourceDao", m26211f = "ResourceDao.kt", m26212l = {23, 25}, m26213m = "syncResourceList$suspendImpl")
/* loaded from: classes3.dex */
public final class ResourceDao$syncResourceList$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5873c;

    /* renamed from: d */
    public Object f5874d;

    /* renamed from: e */
    public Object f5875e;

    /* renamed from: f */
    public /* synthetic */ Object f5876f;

    /* renamed from: g */
    public final /* synthetic */ ResourceDao f5877g;

    /* renamed from: h */
    public int f5878h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceDao$syncResourceList$1(ResourceDao resourceDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5877g = resourceDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5876f = obj;
        this.f5878h |= Integer.MIN_VALUE;
        return ResourceDao.m5079h(this.f5877g, null, null, this);
    }
}
