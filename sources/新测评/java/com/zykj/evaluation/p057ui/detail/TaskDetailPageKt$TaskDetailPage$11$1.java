package com.zykj.evaluation.p057ui.detail;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.TaskDetailPageKt$TaskDetailPage$11$1", m13596f = "TaskDetailPage.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class TaskDetailPageKt$TaskDetailPage$11$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9185a;

    /* renamed from: b */
    public final /* synthetic */ C6897b f9186b;

    /* renamed from: c */
    public final /* synthetic */ Function1 f9187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskDetailPageKt$TaskDetailPage$11$1(C6897b c6897b, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f9186b = c6897b;
        this.f9187c = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaskDetailPageKt$TaskDetailPage$11$1(this.f9186b, this.f9187c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM9442p;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9185a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String strM9443q = this.f9186b.m9443q();
        boolean z9 = false;
        if (strM9443q != null && (((strM9442p = this.f9186b.m9442p()) != null && strM9442p.length() != 0) || StringsKt.contains$default((CharSequence) strM9443q, (CharSequence) "showAnalysis=true", false, 2, (Object) null))) {
            z9 = true;
        }
        this.f9187c.invoke(Boxing.boxBoolean(z9));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TaskDetailPageKt$TaskDetailPage$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
