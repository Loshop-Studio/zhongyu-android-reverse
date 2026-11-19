package com.zykj.study.p065ui.home;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p139j1.InterfaceC8994a;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.HomeFragment$connection$1$onServiceConnected$1$1$1$1", m17801f = "HomeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class HomeFragment$connection$1$onServiceConnected$1$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11756a;

    /* renamed from: b */
    public final /* synthetic */ HomeFragment f11757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$connection$1$onServiceConnected$1$1$1$1(HomeFragment homeFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11757b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new HomeFragment$connection$1$onServiceConnected$1$1$1$1(this.f11757b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((HomeFragment$connection$1$onServiceConnected$1$1$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f11756a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC8994a interfaceC8994a = this.f11757b.f11731f;
        if (interfaceC8994a != null) {
            interfaceC8994a.mo15646e();
        }
        InterfaceC8994a interfaceC8994a2 = this.f11757b.f11731f;
        if (interfaceC8994a2 != null) {
            interfaceC8994a2.mo15647f(this.f11757b.requireContext().getPackageName());
        }
        return C8736p.f16368a;
    }
}
