package com.friday.document.service;

import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5964d;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$downloadMicroClass$2", m26211f = "FileManager.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$downloadMicroClass$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f6795c;

    /* renamed from: d */
    public final /* synthetic */ FileEntity f6796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$downloadMicroClass$2(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6796d = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileManager$downloadMicroClass$2(this.f6796d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        AbstractC11725a.m25952f();
        if (this.f6795c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        C5964d.m5326h(C5964d.f6085d.m5337a(), this.f6796d.getRealOssUrl(), this.f6796d.getZipFilePath(), null, 4, null);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileManager$downloadMicroClass$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
