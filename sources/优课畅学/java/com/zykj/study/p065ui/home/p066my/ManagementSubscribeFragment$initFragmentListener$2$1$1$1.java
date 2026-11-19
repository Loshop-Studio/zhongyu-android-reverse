package com.zykj.study.p065ui.home.p066my;

import com.zykj.study.bean.DeleteSubSingReq;
import com.zykj.study.viewmodels.ManagementSubscribeViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$initFragmentListener$2$1$1$1", m17801f = "ManagementSubscribeFragment.kt", m17802l = {312}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ManagementSubscribeFragment$initFragmentListener$2$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13158a;

    /* renamed from: b */
    public final /* synthetic */ ManagementSubscribeFragment f13159b;

    /* renamed from: c */
    public final /* synthetic */ int f13160c;

    /* renamed from: d */
    public final /* synthetic */ String f13161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementSubscribeFragment$initFragmentListener$2$1$1$1(ManagementSubscribeFragment managementSubscribeFragment, int i10, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13159b = managementSubscribeFragment;
        this.f13160c = i10;
        this.f13161d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ManagementSubscribeFragment$initFragmentListener$2$1$1$1(this.f13159b, this.f13160c, this.f13161d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ManagementSubscribeFragment$initFragmentListener$2$1$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13158a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ManagementSubscribeViewModel managementSubscribeViewModelM11455A = this.f13159b.m11455A();
            DeleteSubSingReq deleteSubSingReq = new DeleteSubSingReq(this.f13160c, this.f13161d);
            this.f13158a = 1;
            obj = managementSubscribeViewModelM11455A.m12186c(deleteSubSingReq, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        if (AbstractC9133u.m16128b(obj, AbstractC9536a.m17796a(true))) {
            this.f13159b.f13136h.refresh();
            this.f13159b.f13143o = true;
        }
        return C8736p.f16368a;
    }
}
