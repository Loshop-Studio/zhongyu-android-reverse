package com.friday.common.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.network.RefreshRepositoryImpl", m26211f = "RefreshRepositoryImpl.kt", m26212l = {26, 49}, m26213m = "refreshToken")
/* loaded from: classes3.dex */
public final class RefreshRepositoryImpl$refreshToken$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6108c;

    /* renamed from: d */
    public Object f6109d;

    /* renamed from: e */
    public int f6110e;

    /* renamed from: f */
    public /* synthetic */ Object f6111f;

    /* renamed from: g */
    public final /* synthetic */ RefreshRepositoryImpl f6112g;

    /* renamed from: h */
    public int f6113h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRepositoryImpl$refreshToken$1(RefreshRepositoryImpl refreshRepositoryImpl, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6112g = refreshRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6111f = obj;
        this.f6113h |= Integer.MIN_VALUE;
        return this.f6112g.mo273a(null, this);
    }
}
