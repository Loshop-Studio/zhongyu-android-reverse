package com.zykj.download.work;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$job$1", m17801f = "UploadFileWork.kt", m17802l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class UploadFileWork$uploadFileWithProgress$2$job$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9707a;

    /* renamed from: b */
    public /* synthetic */ Object f9708b;

    /* renamed from: c */
    public final /* synthetic */ UploadFileWork f9709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWork$uploadFileWithProgress$2$job$1(UploadFileWork uploadFileWork, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9709c = uploadFileWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        UploadFileWork$uploadFileWithProgress$2$job$1 uploadFileWork$uploadFileWithProgress$2$job$1 = new UploadFileWork$uploadFileWithProgress$2$job$1(this.f9709c, interfaceC9324c);
        uploadFileWork$uploadFileWithProgress$2$job$1.f9708b = obj;
        return uploadFileWork$uploadFileWithProgress$2$job$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((UploadFileWork$uploadFileWithProgress$2$job$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f9707a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f9708b;
            UploadFileWork uploadFileWork = this.f9709c;
            this.f9707a = 1;
            if (uploadFileWork.sendSpeedAndProgress(interfaceC8822b0, this) == objM17291f) {
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
