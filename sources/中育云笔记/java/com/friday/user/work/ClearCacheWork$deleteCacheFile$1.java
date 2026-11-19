package com.friday.user.work;

import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.user.work.ClearCacheWork", m26211f = "ClearCacheWork.kt", m26212l = {94, Opcodes.IADD, 98, PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX}, m26213m = "deleteCacheFile")
/* loaded from: classes5.dex */
public final class ClearCacheWork$deleteCacheFile$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f10740c;

    /* renamed from: d */
    public Object f10741d;

    /* renamed from: e */
    public Object f10742e;

    /* renamed from: f */
    public Object f10743f;

    /* renamed from: g */
    public Object f10744g;

    /* renamed from: h */
    public Object f10745h;

    /* renamed from: i */
    public Object f10746i;

    /* renamed from: j */
    public Object f10747j;

    /* renamed from: k */
    public Object f10748k;

    /* renamed from: l */
    public Object f10749l;

    /* renamed from: m */
    public int f10750m;

    /* renamed from: n */
    public int f10751n;

    /* renamed from: o */
    public /* synthetic */ Object f10752o;

    /* renamed from: p */
    public final /* synthetic */ ClearCacheWork f10753p;

    /* renamed from: q */
    public int f10754q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearCacheWork$deleteCacheFile$1(ClearCacheWork clearCacheWork, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f10753p = clearCacheWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10752o = obj;
        this.f10754q |= Integer.MIN_VALUE;
        return this.f10753p.m7835c(null, null, null, this);
    }
}
