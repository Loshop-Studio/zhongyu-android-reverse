package com.zykj.view.board.simple;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1", m13596f = "SimpleViewModel.kt", m13597i = {0, 1, 2}, m13598l = {130, 136, 141}, m13599m = "invokeSuspend", m13600n = {"state", "state", "state"}, m13601s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
public final class SimpleViewModel$updateConfigAboutPen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f11255a;

    /* renamed from: b */
    public int f11256b;

    /* renamed from: c */
    public final /* synthetic */ SimpleViewModel f11257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateConfigAboutPen$1(SimpleViewModel simpleViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11257c = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleViewModel$updateConfigAboutPen$1(this.f11257c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r9.emit(r3, r8) != r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f11256b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r8.f11255a
            com.zykj.view.board.simple.e r0 = (com.zykj.view.board.simple.C7264e) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto La8
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.f11255a
            com.zykj.view.board.simple.e r1 = (com.zykj.view.board.simple.C7264e) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L86
        L2a:
            java.lang.Object r1 = r8.f11255a
            com.zykj.view.board.simple.e r1 = (com.zykj.view.board.simple.C7264e) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L68
        L32:
            kotlin.ResultKt.throwOnFailure(r9)
            com.zykj.view.board.simple.SimpleViewModel r9 = r8.f11257c
            kotlinx.coroutines.flow.MutableStateFlow r9 = com.zykj.view.board.simple.SimpleViewModel.m11346b(r9)
            java.lang.Object r9 = r9.getValue()
            com.zykj.view.board.simple.e r9 = (com.zykj.view.board.simple.C7264e) r9
            com.zykj.view.board.simple.SimpleViewModel r1 = r8.f11257c
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.zykj.view.board.simple.SimpleViewModel.m11345a(r1)
            com.zykj.view.board.simple.b$f r5 = new com.zykj.view.board.simple.b$f
            com.zykj.view.board.simple.d r6 = r9.m11384i()
            int r6 = r6.m11373a()
            com.zykj.view.board.simple.d r7 = r9.m11384i()
            boolean r7 = r7.m11375c()
            r5.<init>(r6, r7)
            r8.f11255a = r9
            r8.f11256b = r4
            java.lang.Object r1 = r1.emit(r5, r8)
            if (r1 != r0) goto L67
            goto La7
        L67:
            r1 = r9
        L68:
            com.zykj.view.board.simple.SimpleViewModel r9 = r8.f11257c
            kotlinx.coroutines.flow.MutableSharedFlow r9 = com.zykj.view.board.simple.SimpleViewModel.m11345a(r9)
            com.zykj.view.board.simple.b$g r4 = new com.zykj.view.board.simple.b$g
            com.zykj.view.board.simple.c r5 = r1.m11383h()
            float r5 = r5.m11372b()
            r4.<init>(r5)
            r8.f11255a = r1
            r8.f11256b = r3
            java.lang.Object r9 = r9.emit(r4, r8)
            if (r9 != r0) goto L86
            goto La7
        L86:
            com.zykj.view.board.simple.SimpleViewModel r9 = r8.f11257c
            kotlinx.coroutines.flow.MutableSharedFlow r9 = com.zykj.view.board.simple.SimpleViewModel.m11345a(r9)
            com.zykj.view.board.simple.b$e r3 = new com.zykj.view.board.simple.b$e
            com.zykj.view.board.board.p r4 = r1.m11382g()
            int r4 = r4.m11021a()
            r3.<init>(r4)
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r8.f11255a = r1
            r8.f11256b = r2
            java.lang.Object r9 = r9.emit(r3, r8)
            if (r9 != r0) goto La8
        La7:
            return r0
        La8:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes5/com/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1.smali:147
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SimpleViewModel$updateConfigAboutPen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
