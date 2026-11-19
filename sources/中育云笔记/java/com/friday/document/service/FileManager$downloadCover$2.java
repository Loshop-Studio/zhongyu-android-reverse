package com.friday.document.service;

import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5964d;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$downloadCover$2", m26211f = "FileManager.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$downloadCover$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f6758c;

    /* renamed from: d */
    public final /* synthetic */ FileEntity f6759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$downloadCover$2(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6759d = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileManager$downloadCover$2(this.f6759d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        AbstractC11725a.m25952f();
        if (this.f6758c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        String str = this.f6759d.getLocalFileUrl() + this.f6759d.getFileId() + ".jpg";
        String microClassCoverUrl = this.f6759d.getMicroClassCoverUrl();
        C5962b c5962bM5299a = C5962b.f6082a.m5299a();
        C5964d.f6085d.m5337a().m5331g(microClassCoverUrl, str, c5962bM5299a.m5276d(c5962bM5299a.m5275c(this.f6759d.getFileId() + ".jpg")));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileManager$downloadCover$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
