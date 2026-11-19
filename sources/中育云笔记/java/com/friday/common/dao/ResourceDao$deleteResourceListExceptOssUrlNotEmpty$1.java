package com.friday.common.dao;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.ResourceDao", m26211f = "ResourceDao.kt", m26212l = {Opcodes.IF_ACMPNE, Opcodes.GOTO, 168}, m26213m = "deleteResourceListExceptOssUrlNotEmpty$suspendImpl")
/* loaded from: classes3.dex */
public final class ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5867c;

    /* renamed from: d */
    public Object f5868d;

    /* renamed from: e */
    public Object f5869e;

    /* renamed from: f */
    public /* synthetic */ Object f5870f;

    /* renamed from: g */
    public final /* synthetic */ ResourceDao f5871g;

    /* renamed from: h */
    public int f5872h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1(ResourceDao resourceDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5871g = resourceDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5870f = obj;
        this.f5872h |= Integer.MIN_VALUE;
        return ResourceDao.m5078g(this.f5871g, null, this);
    }
}
