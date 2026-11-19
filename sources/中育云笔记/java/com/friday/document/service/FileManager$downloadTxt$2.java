package com.friday.document.service;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.friday.common.dao.FileDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5964d;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$downloadTxt$2", m26211f = "FileManager.kt", m26212l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$downloadTxt$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6804c;

    /* renamed from: d */
    public int f6805d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f6806e;

    /* renamed from: f */
    public final /* synthetic */ FileManager f6807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$downloadTxt$2(FileEntity fileEntity, FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6806e = fileEntity;
        this.f6807f = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileManager$downloadTxt$2(this.f6806e, this.f6807f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f6805d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            String realOssUrl = this.f6806e.getRealOssUrl();
            C5964d.m5326h(C5964d.f6085d.m5337a(), realOssUrl, this.f6806e.getTxtFilePath(), null, 4, null);
            FileDao fileDao = this.f6807f.f6734c;
            String fileId = this.f6806e.getFileId();
            this.f6804c = AbstractC11833h.m26224a(realOssUrl);
            this.f6805d = 1;
            if (fileDao.mo4931b0(fileId, true, this) == objM25952f) {
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
        return ((FileManager$downloadTxt$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
