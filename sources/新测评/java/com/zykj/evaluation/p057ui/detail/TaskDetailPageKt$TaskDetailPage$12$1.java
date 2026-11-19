package com.zykj.evaluation.p057ui.detail;

import androidx.compose.foundation.ScrollState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.TaskDetailPageKt$TaskDetailPage$12$1", m13596f = "TaskDetailPage.kt", m13597i = {}, m13598l = {183}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class TaskDetailPageKt$TaskDetailPage$12$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9188a;

    /* renamed from: b */
    public final /* synthetic */ ScrollState f9189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskDetailPageKt$TaskDetailPage$12$1(ScrollState scrollState, Continuation continuation) {
        super(2, continuation);
        this.f9189b = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaskDetailPageKt$TaskDetailPage$12$1(this.f9189b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9188a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollState scrollState = this.f9189b;
            this.f9188a = 1;
            if (scrollState.scrollTo(0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TaskDetailPageKt$TaskDetailPage$12$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
