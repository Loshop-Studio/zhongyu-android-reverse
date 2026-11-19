package com.friday.common.dao;

import com.alibaba.fastjson.asm.Opcodes;
import java.util.Map;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.ResourceDao_Impl$updatePageOrder$2", m26211f = "ResourceDao_Impl.kt", m26212l = {Opcodes.IADD}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ResourceDao_Impl$updatePageOrder$2 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f5912c;

    /* renamed from: d */
    public final /* synthetic */ ResourceDao_Impl f5913d;

    /* renamed from: e */
    public final /* synthetic */ String f5914e;

    /* renamed from: f */
    public final /* synthetic */ Map f5915f;

    /* renamed from: g */
    public final /* synthetic */ long f5916g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceDao_Impl$updatePageOrder$2(ResourceDao_Impl resourceDao_Impl, String str, Map map, long j10, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f5913d = resourceDao_Impl;
        this.f5914e = str;
        this.f5915f = map;
        this.f5916g = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ResourceDao_Impl$updatePageOrder$2(this.f5913d, this.f5914e, this.f5915f, this.f5916g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5912c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ResourceDao_Impl resourceDao_Impl = this.f5913d;
            String str = this.f5914e;
            Map map = this.f5915f;
            long j10 = this.f5916g;
            this.f5912c = 1;
            if (super/*com.friday.common.dao.ResourceDao*/.mo5113o(str, map, j10, this) == objM25952f) {
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
        return ((ResourceDao_Impl$updatePageOrder$2) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
