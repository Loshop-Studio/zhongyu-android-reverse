package com.friday.common.dao;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.ResourceDao_Impl$deletePageResources$2", m26211f = "ResourceDao_Impl.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ResourceDao_Impl$deletePageResources$2 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f5897c;

    /* renamed from: d */
    public final /* synthetic */ ResourceDao_Impl f5898d;

    /* renamed from: e */
    public final /* synthetic */ String f5899e;

    /* renamed from: f */
    public final /* synthetic */ String f5900f;

    /* renamed from: g */
    public final /* synthetic */ long f5901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceDao_Impl$deletePageResources$2(ResourceDao_Impl resourceDao_Impl, String str, String str2, long j10, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f5898d = resourceDao_Impl;
        this.f5899e = str;
        this.f5900f = str2;
        this.f5901g = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ResourceDao_Impl$deletePageResources$2(this.f5898d, this.f5899e, this.f5900f, this.f5901g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5897c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        ResourceDao_Impl resourceDao_Impl = this.f5898d;
        String str = this.f5899e;
        String str2 = this.f5900f;
        long j10 = this.f5901g;
        this.f5897c = 1;
        Object objMo5086A = super/*com.friday.common.dao.ResourceDao*/.mo5086A(str, str2, j10, this);
        return objMo5086A == objM25952f ? objM25952f : objMo5086A;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((ResourceDao_Impl$deletePageResources$2) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
