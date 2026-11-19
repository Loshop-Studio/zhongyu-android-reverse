package com.zykj.download.work;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p283w5.C9827b;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1$download$1", m13451f = "DownloadFileWork.kt", m13452i = {}, m13453l = {103}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes4.dex */
public final class DownloadFileWork$downloadFileWithProgress$error$1$1$download$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9922a;

    /* renamed from: b */
    public final /* synthetic */ DownloadFileWork f9923b;

    /* renamed from: c */
    public final /* synthetic */ C9827b f9924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork$downloadFileWithProgress$error$1$1$download$1(DownloadFileWork downloadFileWork, C9827b c9827b, Continuation continuation) {
        super(2, continuation);
        this.f9923b = downloadFileWork;
        this.f9924c = c9827b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadFileWork$downloadFileWithProgress$error$1$1$download$1(this.f9923b, this.f9924c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f9922a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            DownloadFileWork downloadFileWork = this.f9923b;
            C9827b c9827b = this.f9924c;
            this.f9922a = 1;
            if (downloadFileWork.downloadFile(c9827b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DownloadFileWork$downloadFileWithProgress$error$1$1$download$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
