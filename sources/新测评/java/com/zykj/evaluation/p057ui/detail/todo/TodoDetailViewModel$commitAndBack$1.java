package com.zykj.evaluation.p057ui.detail.todo;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p089f6.C7459j;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel$commitAndBack$1", m13596f = "TodoDetailViewModel.kt", m13597i = {}, m13598l = {388}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class TodoDetailViewModel$commitAndBack$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9495a;

    /* renamed from: b */
    public final /* synthetic */ TodoDetailViewModel f9496b;

    /* renamed from: c */
    public final /* synthetic */ C7459j f9497c;

    /* renamed from: d */
    public final /* synthetic */ Function0 f9498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoDetailViewModel$commitAndBack$1(TodoDetailViewModel todoDetailViewModel, C7459j c7459j, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f9496b = todoDetailViewModel;
        this.f9497c = c7459j;
        this.f9498d = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TodoDetailViewModel$commitAndBack$1(this.f9496b, this.f9497c, this.f9498d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9495a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            TodoDetailViewModel todoDetailViewModel = this.f9496b;
            C7459j c7459j = this.f9497c;
            this.f9495a = 1;
            if (todoDetailViewModel.m9742J0(c7459j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f9498d.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TodoDetailViewModel$commitAndBack$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
