package com.friday.document.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import com.friday.document.model.FolderLevelEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$showRootLevel$1", m26211f = "BaseFileViewModel.kt", m26212l = {Opcodes.IAND}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$showRootLevel$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7952c;

    /* renamed from: d */
    public int f7953d;

    /* renamed from: e */
    public final /* synthetic */ BaseFileViewModel f7954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$showRootLevel$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7954e = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$showRootLevel$1(this.f7954e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String fileId;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7953d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FolderLevelEntity folderLevelEntity = (FolderLevelEntity) this.f7954e.f7821n.peekFirst();
            this.f7954e.f7815h.setValue(folderLevelEntity);
            InterfaceC11602k interfaceC11602k = this.f7954e.f7819l;
            if (folderLevelEntity == null || (fileId = folderLevelEntity.getFileId()) == null) {
                fileId = "0";
            }
            this.f7952c = AbstractC11833h.m26224a(folderLevelEntity);
            this.f7953d = 1;
            if (interfaceC11602k.emit(fileId, this) == objM25952f) {
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
        return ((BaseFileViewModel$showRootLevel$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
