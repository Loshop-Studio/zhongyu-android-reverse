package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1$result$1", m26211f = "FolderViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1$result$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8015c;

    /* renamed from: d */
    public final /* synthetic */ FolderViewModel f8016d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f8017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1$result$1(FolderViewModel folderViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8016d = folderViewModel;
        this.f8017e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1$result$1(this.f8016d, this.f8017e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f8015c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return this.f8016d.m6244b0(this.f8017e);
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1$result$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
