package com.friday.common.dao;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.ResourceDao", m26211f = "ResourceDao.kt", m26212l = {PatchStatus.CODE_LOAD_MFITEM, PatchStatus.CODE_LOAD_COPY_FILE, PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m26213m = "deletePageResources$suspendImpl")
/* loaded from: classes3.dex */
public final class ResourceDao$deletePageResources$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5841c;

    /* renamed from: d */
    public Object f5842d;

    /* renamed from: e */
    public Object f5843e;

    /* renamed from: f */
    public Object f5844f;

    /* renamed from: g */
    public Object f5845g;

    /* renamed from: h */
    public Object f5846h;

    /* renamed from: i */
    public Object f5847i;

    /* renamed from: j */
    public Object f5848j;

    /* renamed from: k */
    public Object f5849k;

    /* renamed from: l */
    public long f5850l;

    /* renamed from: m */
    public int f5851m;

    /* renamed from: n */
    public int f5852n;

    /* renamed from: o */
    public /* synthetic */ Object f5853o;

    /* renamed from: p */
    public final /* synthetic */ ResourceDao f5854p;

    /* renamed from: q */
    public int f5855q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceDao$deletePageResources$1(ResourceDao resourceDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5854p = resourceDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5853o = obj;
        this.f5855q |= Integer.MIN_VALUE;
        return ResourceDao.m5070J(this.f5854p, null, null, 0L, this);
    }
}
