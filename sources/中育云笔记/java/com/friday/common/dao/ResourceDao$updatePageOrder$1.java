package com.friday.common.dao;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.dao.ResourceDao", m26211f = "ResourceDao.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_CPUABIS}, m26213m = "updatePageOrder$suspendImpl")
/* loaded from: classes3.dex */
public final class ResourceDao$updatePageOrder$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f5879c;

    /* renamed from: d */
    public Object f5880d;

    /* renamed from: e */
    public Object f5881e;

    /* renamed from: f */
    public Object f5882f;

    /* renamed from: g */
    public Object f5883g;

    /* renamed from: h */
    public Object f5884h;

    /* renamed from: i */
    public Object f5885i;

    /* renamed from: j */
    public long f5886j;

    /* renamed from: k */
    public int f5887k;

    /* renamed from: l */
    public int f5888l;

    /* renamed from: m */
    public int f5889m;

    /* renamed from: n */
    public /* synthetic */ Object f5890n;

    /* renamed from: o */
    public final /* synthetic */ ResourceDao f5891o;

    /* renamed from: p */
    public int f5892p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceDao$updatePageOrder$1(ResourceDao resourceDao, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f5891o = resourceDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5890n = obj;
        this.f5892p |= Integer.MIN_VALUE;
        return ResourceDao.m5071K(this.f5891o, null, null, 0L, this);
    }
}
