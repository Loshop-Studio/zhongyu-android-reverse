package com.friday.common.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.network.StudentSession", m26211f = "StudentSession.kt", m26212l = {64}, m26213m = "ensureReady")
/* loaded from: classes3.dex */
public final class StudentSession$ensureReady$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f6127c;

    /* renamed from: d */
    public final /* synthetic */ StudentSession f6128d;

    /* renamed from: e */
    public int f6129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentSession$ensureReady$1(StudentSession studentSession, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6128d = studentSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6127c = obj;
        this.f6129e |= Integer.MIN_VALUE;
        return this.f6128d.m5365i(this);
    }
}
