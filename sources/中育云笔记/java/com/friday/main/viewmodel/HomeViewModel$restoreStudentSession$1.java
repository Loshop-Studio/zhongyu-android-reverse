package com.friday.main.viewmodel;

import com.friday.common.network.SessionNotReadyException;
import com.friday.common.network.StudentSession;
import com.taobao.sophix.PatchStatus;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.HomeViewModel$restoreStudentSession$1", m26211f = "HomeViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_HANDLE_DEX}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeViewModel$restoreStudentSession$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9645c;

    /* renamed from: d */
    public final /* synthetic */ HomeViewModel f9646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$restoreStudentSession$1(HomeViewModel homeViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9646d = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeViewModel$restoreStudentSession$1(this.f9646d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9645c;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                StudentSession studentSession = this.f9646d.f9606c;
                this.f9645c = 1;
                if (studentSession.m5365i(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
        } catch (SessionNotReadyException e10) {
            String message = e10.getMessage();
            if (message != null) {
                AbstractC11958b.m26588i(message);
            }
        } catch (CancellationException e11) {
            throw e11;
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeViewModel$restoreStudentSession$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
