package com.zykj.evaluation.p057ui.detail.todo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel$initData$1", m13596f = "TodoDetailViewModel.kt", m13597i = {1, 1}, m13598l = {68, 71}, m13599m = "invokeSuspend", m13600n = {"it", "$i$a$-let-TodoDetailViewModel$initData$1$1"}, m13601s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nTodoDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
/* loaded from: classes4.dex */
public final class TodoDetailViewModel$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9529a;

    /* renamed from: b */
    public int f9530b;

    /* renamed from: c */
    public int f9531c;

    /* renamed from: d */
    public final /* synthetic */ TodoDetailViewModel f9532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoDetailViewModel$initData$1(TodoDetailViewModel todoDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9532d = todoDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TodoDetailViewModel$initData$1(this.f9532d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r1.m9275R(r5, r4) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f9531c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r4.f9529a
            com.zykj.evaluation.ui.detail.GuideQuestion r0 = (com.zykj.evaluation.p057ui.detail.GuideQuestion) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5a
        L16:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1e:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L30
        L22:
            kotlin.ResultKt.throwOnFailure(r5)
            com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel r5 = r4.f9532d
            r4.f9531c = r3
            java.lang.Object r5 = com.zykj.evaluation.p057ui.detail.todo.TodoDetailViewModel.m9735C0(r5, r4)
            if (r5 != r0) goto L30
            goto L59
        L30:
            com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel r5 = r4.f9532d
            java.util.List r5 = com.zykj.evaluation.p057ui.detail.todo.TodoDetailViewModel.m9737E0(r5)
            if (r5 == 0) goto L5a
            com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel r1 = r4.f9532d
            int r1 = com.zykj.evaluation.p057ui.detail.todo.TodoDetailViewModel.m9736D0(r1)
            java.lang.Object r5 = kotlin.collections.CollectionsKt.getOrNull(r5, r1)
            com.zykj.evaluation.ui.detail.GuideQuestion r5 = (com.zykj.evaluation.p057ui.detail.GuideQuestion) r5
            if (r5 == 0) goto L5a
            com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel r1 = r4.f9532d
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r4.f9529a = r3
            r3 = 0
            r4.f9530b = r3
            r4.f9531c = r2
            java.lang.Object r5 = com.zykj.evaluation.p057ui.detail.todo.TodoDetailViewModel.m9738F0(r1, r5, r4)
            if (r5 != r0) goto L5a
        L59:
            return r0
        L5a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.todo.TodoDetailViewModel$initData$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1.smali:151
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TodoDetailViewModel$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
