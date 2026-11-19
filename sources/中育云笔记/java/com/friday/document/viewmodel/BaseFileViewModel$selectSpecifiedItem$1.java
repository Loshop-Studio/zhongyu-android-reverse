package com.friday.document.viewmodel;

import com.friday.common.dao.FileDao;
import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$selectSpecifiedItem$1", m26211f = "BaseFileViewModel.kt", m26212l = {216}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$selectSpecifiedItem$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7943c;

    /* renamed from: d */
    public final /* synthetic */ BaseFileViewModel f7944d;

    /* renamed from: e */
    public final /* synthetic */ String f7945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$selectSpecifiedItem$1(BaseFileViewModel baseFileViewModel, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7944d = baseFileViewModel;
        this.f7945e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$selectSpecifiedItem$1(this.f7944d, this.f7945e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7943c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FileDao fileDaoM6229M = this.f7944d.m6229M();
            String str = this.f7945e;
            this.f7943c = 1;
            obj = fileDaoM6229M.mo4941r(str, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f7944d.m6264t0((FileEntity) obj);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseFileViewModel$selectSpecifiedItem$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
