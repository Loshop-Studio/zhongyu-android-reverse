package com.zykj.download.work;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.download.data.DownloadEntity;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1$download$1", m17801f = "DownloadFileWork.kt", m17802l = {TbsListener.ErrorCode.READ_RESPONSE_ERROR}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DownloadFileWork$downloadFileWithProgress$error$1$1$download$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9657a;

    /* renamed from: b */
    public final /* synthetic */ DownloadFileWork f9658b;

    /* renamed from: c */
    public final /* synthetic */ DownloadEntity f9659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork$downloadFileWithProgress$error$1$1$download$1(DownloadFileWork downloadFileWork, DownloadEntity downloadEntity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9658b = downloadFileWork;
        this.f9659c = downloadEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new DownloadFileWork$downloadFileWithProgress$error$1$1$download$1(this.f9658b, this.f9659c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((DownloadFileWork$downloadFileWithProgress$error$1$1$download$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f9657a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            DownloadFileWork downloadFileWork = this.f9658b;
            DownloadEntity downloadEntity = this.f9659c;
            this.f9657a = 1;
            if (downloadFileWork.downloadFile(downloadEntity, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
