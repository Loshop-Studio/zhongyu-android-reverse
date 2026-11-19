package com.friday.document.view.share;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.SuspendCall", m26211f = "SuspendCall.kt", m26212l = {19}, m26213m = "launch")
/* loaded from: classes3.dex */
public final class SuspendCall$launch$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f7706c;

    /* renamed from: d */
    public final /* synthetic */ SuspendCall f7707d;

    /* renamed from: e */
    public int f7708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendCall$launch$1(SuspendCall suspendCall, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7707d = suspendCall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7706c = obj;
        this.f7708e |= Integer.MIN_VALUE;
        return this.f7707d.m6134a(this);
    }
}
