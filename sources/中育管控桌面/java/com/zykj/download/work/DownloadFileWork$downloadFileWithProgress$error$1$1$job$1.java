package com.zykj.download.work;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1$job$1", m7918f = "DownloadFileWork.kt", m7919i = {}, m7920l = {99}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes3.dex */
public final class DownloadFileWork$downloadFileWithProgress$error$1$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f5685a;

    /* renamed from: b */
    public /* synthetic */ Object f5686b;

    /* renamed from: c */
    public final /* synthetic */ DownloadFileWork f5687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork$downloadFileWithProgress$error$1$1$job$1(DownloadFileWork downloadFileWork, Continuation continuation) {
        super(2, continuation);
        this.f5687c = downloadFileWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DownloadFileWork$downloadFileWithProgress$error$1$1$job$1 downloadFileWork$downloadFileWithProgress$error$1$1$job$1 = new DownloadFileWork$downloadFileWithProgress$error$1$1$job$1(this.f5687c, continuation);
        downloadFileWork$downloadFileWithProgress$error$1$1$job$1.f5686b = obj;
        return downloadFileWork$downloadFileWithProgress$error$1$1$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f5685a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f5686b;
            DownloadFileWork downloadFileWork = this.f5687c;
            this.f5685a = 1;
            if (downloadFileWork.sendSpeedAndProgress(coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DownloadFileWork$downloadFileWithProgress$error$1$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
