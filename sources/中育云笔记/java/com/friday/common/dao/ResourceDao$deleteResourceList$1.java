package com.friday.common.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.ResourceDao", m26211f = "ResourceDao.kt", m26212l = {156}, m26213m = "deleteResourceList$suspendImpl")
/* loaded from: classes3.dex */
public final class ResourceDao$deleteResourceList$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5856c;

    /* renamed from: d */
    public Object f5857d;

    /* renamed from: e */
    public Object f5858e;

    /* renamed from: f */
    public Object f5859f;

    /* renamed from: g */
    public Object f5860g;

    /* renamed from: h */
    public Object f5861h;

    /* renamed from: i */
    public int f5862i;

    /* renamed from: j */
    public int f5863j;

    /* renamed from: k */
    public /* synthetic */ Object f5864k;

    /* renamed from: l */
    public final /* synthetic */ ResourceDao f5865l;

    /* renamed from: m */
    public int f5866m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceDao$deleteResourceList$1(ResourceDao resourceDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5865l = resourceDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5864k = obj;
        this.f5866m |= Integer.MIN_VALUE;
        return ResourceDao.m5074P(this.f5865l, null, this);
    }
}
