package com.zykj.download.work;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1$job$1", m26211f = "DownloadFileWork.kt", m26212l = {99}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class DownloadFileWork$downloadFileWithProgress$error$1$1$job$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f19645c;

    /* renamed from: d */
    public /* synthetic */ Object f19646d;

    /* renamed from: e */
    public final /* synthetic */ DownloadFileWork f19647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork$downloadFileWithProgress$error$1$1$job$1(DownloadFileWork downloadFileWork, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f19647e = downloadFileWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        DownloadFileWork$downloadFileWithProgress$error$1$1$job$1 downloadFileWork$downloadFileWithProgress$error$1$1$job$1 = new DownloadFileWork$downloadFileWithProgress$error$1$1$job$1(this.f19647e, interfaceC11588c);
        downloadFileWork$downloadFileWithProgress$error$1$1$job$1.f19646d = obj;
        return downloadFileWork$downloadFileWithProgress$error$1$1$job$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f19645c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f19646d;
            DownloadFileWork downloadFileWork = this.f19647e;
            this.f19645c = 1;
            if (downloadFileWork.sendSpeedAndProgress(interfaceC11122i0, this) == objM25952f) {
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
        return ((DownloadFileWork$downloadFileWithProgress$error$1$1$job$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
