package com.friday.main.viewmodel;

import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.NotePageOrder;
import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FullScreenViewModel$getPreviewNewNoteList$1", m26211f = "FullScreenViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_COPY_FILE}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FullScreenViewModel$getPreviewNewNoteList$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9594c;

    /* renamed from: d */
    public int f9595d;

    /* renamed from: e */
    public final /* synthetic */ FullScreenViewModel f9596e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f9597f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenViewModel$getPreviewNewNoteList$1(FullScreenViewModel fullScreenViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9596e = fullScreenViewModel;
        this.f9597f = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FullScreenViewModel$getPreviewNewNoteList$1(this.f9596e, this.f9597f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FullScreenViewModel$getPreviewNewNoteList$1 fullScreenViewModel$getPreviewNewNoteList$1;
        NotePageOrder notePageOrder;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9595d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            NotePageOrder notePageOrder2 = NotePageOrder.f6040a;
            ResourceDao resourceDao = this.f9596e.f9578c;
            String fileId = this.f9597f.getFileId();
            this.f9594c = notePageOrder2;
            this.f9595d = 1;
            fullScreenViewModel$getPreviewNewNoteList$1 = this;
            Object objM5077c = ResourceDao.m5077c(resourceDao, fileId, 0L, fullScreenViewModel$getPreviewNewNoteList$1, 2, null);
            if (objM5077c == objM25952f) {
                return objM25952f;
            }
            notePageOrder = notePageOrder2;
            obj = objM5077c;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notePageOrder = (NotePageOrder) this.f9594c;
            AbstractC9924b.m20071b(obj);
            fullScreenViewModel$getPreviewNewNoteList$1 = this;
        }
        fullScreenViewModel$getPreviewNewNoteList$1.f9596e.m7234h().setValue(notePageOrder.m5246d((List) obj));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FullScreenViewModel$getPreviewNewNoteList$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
