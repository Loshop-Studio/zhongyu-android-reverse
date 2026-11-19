package com.friday.main.viewmodel;

import com.friday.common.entity.FileEntity;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel$setCurrentFolder$1", m26211f = "FolderMoveViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FolderMoveViewModel$setCurrentFolder$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9574c;

    /* renamed from: d */
    public final /* synthetic */ FolderMoveViewModel f9575d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f9576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderMoveViewModel$setCurrentFolder$1(FolderMoveViewModel folderMoveViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9575d = folderMoveViewModel;
        this.f9576e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderMoveViewModel$setCurrentFolder$1(this.f9575d, this.f9576e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f9574c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        if (((List) this.f9575d.f9461h.getValue()).contains(this.f9576e)) {
            this.f9575d.f9461h.setValue(((List) this.f9575d.f9461h.getValue()).subList(0, ((List) this.f9575d.f9461h.getValue()).indexOf(this.f9576e) + 1));
        } else {
            this.f9575d.f9461h.setValue(AbstractC10947g0.m23907I0((Collection) this.f9575d.f9461h.getValue(), this.f9576e));
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderMoveViewModel$setCurrentFolder$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
