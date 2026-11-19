package com.zykj.study.p065ui.home.p066my;

import com.zykj.study.adapter.SubscribeTabListAdapter;
import com.zykj.study.bean.OtherSubscribe;
import com.zykj.study.viewmodels.ManagementSubscribeViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$initView$9$2", m17801f = "ManagementSubscribeFragment.kt", m17802l = {243}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ManagementSubscribeFragment$initView$9$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13183a;

    /* renamed from: b */
    public final /* synthetic */ ManagementSubscribeFragment f13184b;

    /* renamed from: c */
    public final /* synthetic */ OtherSubscribe f13185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementSubscribeFragment$initView$9$2(ManagementSubscribeFragment managementSubscribeFragment, OtherSubscribe otherSubscribe, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13184b = managementSubscribeFragment;
        this.f13185c = otherSubscribe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ManagementSubscribeFragment$initView$9$2(this.f13184b, this.f13185c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ManagementSubscribeFragment$initView$9$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13183a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ManagementSubscribeViewModel managementSubscribeViewModelM11455A = this.f13184b.m11455A();
            long superviseId = this.f13185c.getSuperviseId();
            this.f13183a = 1;
            if (managementSubscribeViewModelM11455A.m12190g(superviseId, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        SubscribeTabListAdapter subscribeTabListAdapter = this.f13184b.f13138j;
        if (subscribeTabListAdapter == null) {
            AbstractC9133u.m16151y("subscribeTabListAdapter");
            subscribeTabListAdapter = null;
        }
        subscribeTabListAdapter.notifyDataSetChanged();
        return C8736p.f16368a;
    }
}
