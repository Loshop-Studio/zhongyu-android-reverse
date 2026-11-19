package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import com.friday.document.adapter.MultiModeFileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.RecycleBinViewModel$dataFlow$2$2", m26211f = "RecycleBinViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RecycleBinViewModel$dataFlow$2$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8141c;

    /* renamed from: d */
    public /* synthetic */ Object f8142d;

    public RecycleBinViewModel$dataFlow$2$2(InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        RecycleBinViewModel$dataFlow$2$2 recycleBinViewModel$dataFlow$2$2 = new RecycleBinViewModel$dataFlow$2$2(interfaceC11588c);
        recycleBinViewModel$dataFlow$2$2.f8142d = obj;
        return recycleBinViewModel$dataFlow$2$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        return ((RecycleBinViewModel$dataFlow$2$2) create(fileEntity, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FileEntity fileEntity = (FileEntity) this.f8142d;
        AbstractC11725a.m25952f();
        if (this.f8141c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return new MultiModeFileEntity(false, false, fileEntity, 3, null);
    }
}
