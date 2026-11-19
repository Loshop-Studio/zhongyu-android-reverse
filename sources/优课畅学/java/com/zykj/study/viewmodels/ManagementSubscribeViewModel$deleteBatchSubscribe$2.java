package com.zykj.study.viewmodels;

import com.zykj.study.bean.DeleteSubBatchReq;
import com.zykj.study.repository.SubscribeRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ManagementSubscribeViewModel$deleteBatchSubscribe$2", m17801f = "ManagementSubscribeViewModel.kt", m17802l = {46}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ManagementSubscribeViewModel$deleteBatchSubscribe$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14208a;

    /* renamed from: b */
    public final /* synthetic */ ManagementSubscribeViewModel f14209b;

    /* renamed from: c */
    public final /* synthetic */ DeleteSubBatchReq f14210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementSubscribeViewModel$deleteBatchSubscribe$2(ManagementSubscribeViewModel managementSubscribeViewModel, DeleteSubBatchReq deleteSubBatchReq, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14209b = managementSubscribeViewModel;
        this.f14210c = deleteSubBatchReq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ManagementSubscribeViewModel$deleteBatchSubscribe$2(this.f14209b, this.f14210c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ManagementSubscribeViewModel$deleteBatchSubscribe$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14208a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        SubscribeRepository subscribeRepository = this.f14209b.f14204a;
        DeleteSubBatchReq deleteSubBatchReq = this.f14210c;
        this.f14208a = 1;
        Object objM10397c = subscribeRepository.m10397c(deleteSubBatchReq, this);
        return objM10397c == objM17291f ? objM17291f : objM10397c;
    }
}
