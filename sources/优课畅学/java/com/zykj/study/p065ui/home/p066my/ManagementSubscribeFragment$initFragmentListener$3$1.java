package com.zykj.study.p065ui.home.p066my;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.bean.DeleteSubBatchReq;
import com.zykj.study.bean.FreeSubscribeReq;
import com.zykj.study.viewmodels.ManagementSubscribeViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$initFragmentListener$3$1", m17801f = "ManagementSubscribeFragment.kt", m17802l = {TbsListener.ErrorCode.ERROR_GETSTRINGARRAY_JARFILE}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ManagementSubscribeFragment$initFragmentListener$3$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13162a;

    /* renamed from: b */
    public Object f13163b;

    /* renamed from: c */
    public Object f13164c;

    /* renamed from: d */
    public int f13165d;

    /* renamed from: e */
    public int f13166e;

    /* renamed from: f */
    public final /* synthetic */ ManagementSubscribeFragment f13167f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementSubscribeFragment$initFragmentListener$3$1(ManagementSubscribeFragment managementSubscribeFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13167f = managementSubscribeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ManagementSubscribeFragment$initFragmentListener$3$1(this.f13167f, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ManagementSubscribeFragment$initFragmentListener$3$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ManagementSubscribeFragment managementSubscribeFragment;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13166e;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            FreeSubscribeReq freeSubscribeReqM12188e = this.f13167f.m11455A().m12188e();
            ManagementSubscribeFragment managementSubscribeFragment2 = this.f13167f;
            ManagementSubscribeViewModel managementSubscribeViewModelM11455A = managementSubscribeFragment2.m11455A();
            DeleteSubBatchReq deleteSubBatchReq = new DeleteSubBatchReq(freeSubscribeReqM12188e.getCourseId(), freeSubscribeReqM12188e.getName(), freeSubscribeReqM12188e.getRoleType(), freeSubscribeReqM12188e.getLearnDateTimeStart(), freeSubscribeReqM12188e.getLearnDateTimeEnd());
            this.f13162a = freeSubscribeReqM12188e;
            this.f13163b = managementSubscribeFragment2;
            this.f13164c = AbstractC9543h.m17814a(freeSubscribeReqM12188e);
            this.f13165d = 0;
            this.f13166e = 1;
            obj = managementSubscribeViewModelM11455A.m12185b(deleteSubBatchReq, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
            managementSubscribeFragment = managementSubscribeFragment2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            managementSubscribeFragment = (ManagementSubscribeFragment) this.f13163b;
            AbstractC9079b.m15926b(obj);
        }
        if (AbstractC9133u.m16128b(obj, AbstractC9536a.m17796a(true))) {
            managementSubscribeFragment.f13136h.refresh();
        }
        return C8736p.f16368a;
    }
}
