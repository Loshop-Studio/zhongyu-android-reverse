package com.friday.common.dao;

import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.ResourceDao_Impl$syncResourceList$2", m26211f = "ResourceDao_Impl.kt", m26212l = {80}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ResourceDao_Impl$syncResourceList$2 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f5908c;

    /* renamed from: d */
    public final /* synthetic */ ResourceDao_Impl f5909d;

    /* renamed from: e */
    public final /* synthetic */ String f5910e;

    /* renamed from: f */
    public final /* synthetic */ List f5911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceDao_Impl$syncResourceList$2(ResourceDao_Impl resourceDao_Impl, String str, List list, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f5909d = resourceDao_Impl;
        this.f5910e = str;
        this.f5911f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ResourceDao_Impl$syncResourceList$2(this.f5909d, this.f5910e, this.f5911f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5908c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ResourceDao_Impl resourceDao_Impl = this.f5909d;
            String str = this.f5910e;
            List list = this.f5911f;
            this.f5908c = 1;
            if (super/*com.friday.common.dao.ResourceDao*/.mo5117s(str, list, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((ResourceDao_Impl$syncResourceList$2) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
