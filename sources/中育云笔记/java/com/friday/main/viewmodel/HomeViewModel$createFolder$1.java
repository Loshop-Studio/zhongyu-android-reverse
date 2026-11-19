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

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.HomeViewModel$createFolder$1", m26211f = "HomeViewModel.kt", m26212l = {129}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeViewModel$createFolder$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9636c;

    /* renamed from: d */
    public final /* synthetic */ HomeViewModel f9637d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f9638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$createFolder$1(HomeViewModel homeViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9637d = homeViewModel;
        this.f9638e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeViewModel$createFolder$1(this.f9637d, this.f9638e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9636c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FileDao fileDao = this.f9637d.f9607d;
            FileEntity fileEntity = this.f9638e;
            this.f9636c = 1;
            if (fileDao.mo4910I(fileEntity, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeViewModel$createFolder$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
