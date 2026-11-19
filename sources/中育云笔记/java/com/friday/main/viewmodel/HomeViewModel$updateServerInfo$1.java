package com.friday.main.viewmodel;

import com.blankj.utilcode.util.LogUtils;
import com.friday.common.network.StudentSession;
import com.zykj.message.server.bean.ServerInfo;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.HomeViewModel$updateServerInfo$1", m26211f = "HomeViewModel.kt", m26212l = {94}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeViewModel$updateServerInfo$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9647c;

    /* renamed from: d */
    public final /* synthetic */ HomeViewModel f9648d;

    /* renamed from: e */
    public final /* synthetic */ ServerInfo f9649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateServerInfo$1(HomeViewModel homeViewModel, ServerInfo serverInfo, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9648d = homeViewModel;
        this.f9649e = serverInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeViewModel$updateServerInfo$1(this.f9648d, this.f9649e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9647c;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                StudentSession studentSession = this.f9648d.f9606c;
                ServerInfo serverInfo = this.f9649e;
                this.f9647c = 1;
                if (studentSession.m5369m(serverInfo, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception e11) {
            LogUtils.m3890w("登录信息更新失败，type=" + e11.getClass().getSimpleName());
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeViewModel$updateServerInfo$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
