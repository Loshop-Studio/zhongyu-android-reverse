package com.zykj.download.work;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p407xa.C11817b;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1$download$1", m26211f = "DownloadFileWork.kt", m26212l = {103}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class DownloadFileWork$downloadFileWithProgress$error$1$1$download$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f19642c;

    /* renamed from: d */
    public final /* synthetic */ DownloadFileWork f19643d;

    /* renamed from: e */
    public final /* synthetic */ C11817b f19644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork$downloadFileWithProgress$error$1$1$download$1(DownloadFileWork downloadFileWork, C11817b c11817b, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f19643d = downloadFileWork;
        this.f19644e = c11817b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new DownloadFileWork$downloadFileWithProgress$error$1$1$download$1(this.f19643d, this.f19644e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f19642c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            DownloadFileWork downloadFileWork = this.f19643d;
            C11817b c11817b = this.f19644e;
            this.f19642c = 1;
            if (downloadFileWork.downloadFile(c11817b, this) == objM25952f) {
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
        return ((DownloadFileWork$downloadFileWithProgress$error$1$1$download$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
