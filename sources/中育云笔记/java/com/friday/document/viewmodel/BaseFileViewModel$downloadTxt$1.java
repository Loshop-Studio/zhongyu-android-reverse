package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import com.friday.document.service.FileManager;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$downloadTxt$1", m26211f = "BaseFileViewModel.kt", m26212l = {482}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$downloadTxt$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7897c;

    /* renamed from: d */
    public final /* synthetic */ BaseFileViewModel f7898d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$downloadTxt$1(BaseFileViewModel baseFileViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7898d = baseFileViewModel;
        this.f7899e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$downloadTxt$1(this.f7898d, this.f7899e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7897c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FileManager fileManagerM6230N = this.f7898d.m6230N();
            FileEntity fileEntity = this.f7899e;
            this.f7897c = 1;
            if (fileManagerM6230N.mo5609b(fileEntity, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f7898d.m6248f0().setValue(this.f7899e);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseFileViewModel$downloadTxt$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
