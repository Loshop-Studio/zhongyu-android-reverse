package com.friday.main.viewmodel;

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

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FullScreenViewModel$getNoteItem$1", m26211f = "FullScreenViewModel.kt", m26212l = {28}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FullScreenViewModel$getNoteItem$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9584c;

    /* renamed from: d */
    public final /* synthetic */ FullScreenViewModel f9585d;

    /* renamed from: e */
    public final /* synthetic */ String f9586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenViewModel$getNoteItem$1(FullScreenViewModel fullScreenViewModel, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9585d = fullScreenViewModel;
        this.f9586e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FullScreenViewModel$getNoteItem$1(this.f9585d, this.f9586e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9584c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FileDao fileDao = this.f9585d.f9577b;
            String str = this.f9586e;
            this.f9584c = 1;
            obj = fileDao.mo4941r(str, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f9585d.m7235i().setValue((FileEntity) obj);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FullScreenViewModel$getNoteItem$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
