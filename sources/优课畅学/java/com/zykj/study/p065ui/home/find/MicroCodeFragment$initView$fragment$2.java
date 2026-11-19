package com.zykj.study.p065ui.home.find;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.MicroCodeFragment$initView$fragment$2", m17801f = "MicroCodeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroCodeFragment$initView$fragment$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12629a;

    /* renamed from: b */
    public /* synthetic */ Object f12630b;

    /* renamed from: c */
    public final /* synthetic */ MicroCodeFragment f12631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroCodeFragment$initView$fragment$2(MicroCodeFragment microCodeFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12631c = microCodeFragment;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, InterfaceC9324c interfaceC9324c) {
        return ((MicroCodeFragment$initView$fragment$2) create(str, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        MicroCodeFragment$initView$fragment$2 microCodeFragment$initView$fragment$2 = new MicroCodeFragment$initView$fragment$2(this.f12631c, interfaceC9324c);
        microCodeFragment$initView$fragment$2.f12630b = obj;
        return microCodeFragment$initView$fragment$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.f12630b;
        AbstractC9434a.m17291f();
        if (this.f12629a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        if (str == null) {
            return C8736p.f16368a;
        }
        this.f12631c.m11065B(str);
        return C8736p.f16368a;
    }
}
