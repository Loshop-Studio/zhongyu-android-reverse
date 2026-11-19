package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.RecycleBinViewModel$dataFlow$2$1", m26211f = "RecycleBinViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RecycleBinViewModel$dataFlow$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8138c;

    /* renamed from: d */
    public /* synthetic */ Object f8139d;

    /* renamed from: e */
    public final /* synthetic */ RecycleBinViewModel f8140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinViewModel$dataFlow$2$1(RecycleBinViewModel recycleBinViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8140e = recycleBinViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        RecycleBinViewModel$dataFlow$2$1 recycleBinViewModel$dataFlow$2$1 = new RecycleBinViewModel$dataFlow$2$1(this.f8140e, interfaceC11588c);
        recycleBinViewModel$dataFlow$2$1.f8139d = obj;
        return recycleBinViewModel$dataFlow$2$1;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        return ((RecycleBinViewModel$dataFlow$2$1) create(fileEntity, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FileEntity fileEntity = (FileEntity) this.f8139d;
        AbstractC11725a.m25952f();
        if (this.f8138c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return AbstractC11826a.m26206a(this.f8140e.m6337M0(fileEntity));
    }
}
