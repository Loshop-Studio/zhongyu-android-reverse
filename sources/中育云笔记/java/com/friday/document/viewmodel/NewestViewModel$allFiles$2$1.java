package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.NewestViewModel$allFiles$2$1", m26211f = "NewestViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NewestViewModel$allFiles$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8077c;

    /* renamed from: d */
    public /* synthetic */ Object f8078d;

    /* renamed from: e */
    public final /* synthetic */ NewestViewModel f8079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewestViewModel$allFiles$2$1(NewestViewModel newestViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8079e = newestViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        NewestViewModel$allFiles$2$1 newestViewModel$allFiles$2$1 = new NewestViewModel$allFiles$2$1(this.f8079e, interfaceC11588c);
        newestViewModel$allFiles$2$1.f8078d = obj;
        return newestViewModel$allFiles$2$1;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        return ((NewestViewModel$allFiles$2$1) create(fileEntity, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FileEntity fileEntity = (FileEntity) this.f8078d;
        AbstractC11725a.m25952f();
        if (this.f8077c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return this.f8079e.m6244b0(fileEntity);
    }
}
