package com.friday.document.viewmodel;

import com.blankj.utilcode.util.LogUtils;
import com.friday.common.entity.FileEntity;
import com.friday.document.repositroy.FileRepository;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.NewestViewModel$clearSingleNoteCache$1", m26211f = "NewestViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_ILLEGAL_ACCESS}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NewestViewModel$clearSingleNoteCache$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8092c;

    /* renamed from: d */
    public final /* synthetic */ NewestViewModel f8093d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f8094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewestViewModel$clearSingleNoteCache$1(NewestViewModel newestViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8093d = newestViewModel;
        this.f8094e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewestViewModel$clearSingleNoteCache$1(this.f8093d, this.f8094e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8092c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FileRepository fileRepository = this.f8093d.f8063K;
            FileEntity fileEntity = this.f8094e;
            this.f8092c = 1;
            if (fileRepository.m5582d(fileEntity, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f8093d.m6257o0();
        LogUtils.m3887e("笔记缓存已清除");
        AbstractC11958b.m26588i("笔记缓存已清除");
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewestViewModel$clearSingleNoteCache$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
