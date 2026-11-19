package com.zykj.study.viewmodels;

import com.zykj.study.repository.SubscribeRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ManagementSubscribeViewModel$getSelfGroup$2", m17801f = "ManagementSubscribeViewModel.kt", m17802l = {34}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ManagementSubscribeViewModel$getSelfGroup$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14218a;

    /* renamed from: b */
    public final /* synthetic */ ManagementSubscribeViewModel f14219b;

    /* renamed from: c */
    public final /* synthetic */ long f14220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementSubscribeViewModel$getSelfGroup$2(ManagementSubscribeViewModel managementSubscribeViewModel, long j10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14219b = managementSubscribeViewModel;
        this.f14220c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ManagementSubscribeViewModel$getSelfGroup$2(this.f14219b, this.f14220c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ManagementSubscribeViewModel$getSelfGroup$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14218a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        SubscribeRepository subscribeRepository = this.f14219b.f14204a;
        long j10 = this.f14220c;
        this.f14218a = 1;
        Object objM10401i = subscribeRepository.m10401i(j10, this);
        return objM10401i == objM17291f ? objM17291f : objM10401i;
    }
}
