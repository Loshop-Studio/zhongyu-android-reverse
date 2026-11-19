package com.zykj.evaluation.p057ui.sheet.normal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$commit$1", m13596f = "NormalViewModel.kt", m13597i = {2}, m13598l = {745, 755, 761}, m13599m = "invokeSuspend", m13600n = {"commitTaskAnswerList"}, m13601s = {"L$0"})
/* loaded from: classes4.dex */
public final class NormalViewModel$commit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f10024a;

    /* renamed from: b */
    public int f10025b;

    /* renamed from: c */
    public final /* synthetic */ NormalViewModel f10026c;

    /* renamed from: d */
    public final /* synthetic */ Function0 f10027d;

    /* renamed from: e */
    public final /* synthetic */ Function0 f10028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$commit$1(NormalViewModel normalViewModel, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.f10026c = normalViewModel;
        this.f10027d = function0;
        this.f10028e = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NormalViewModel$commit$1(this.f10026c, this.f10027d, this.f10028e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (com.zykj.evaluation.submit.SubmitTaskManger.m8797j(r0, r2, r6, r5, null, null, r12, 24, null) != r11) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r12.f10025b
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 == r3) goto L26
            if (r0 == r2) goto L22
            if (r0 != r1) goto L1a
            java.lang.Object r0 = r12.f10024a
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto La8
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L22:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L65
        L26:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L4a
        L2a:
            kotlin.ResultKt.throwOnFailure(r13)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r0 = r12.f10026c
            com.zykj.evaluation.ui.sheet.a r0 = r0.m10176D()
            com.zykj.evaluation.ui.sheet.b r0 = r0.m10214g()
            com.zykj.evaluation.ui.sheet.b$d r4 = com.zykj.evaluation.p057ui.sheet.AbstractC6934b.d.f9957b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            if (r0 == 0) goto L4a
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r0 = r12.f10026c
            r12.f10025b = r3
            java.lang.Object r0 = r0.m10266H0(r12)
            if (r0 != r11) goto L4a
            goto La7
        L4a:
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r0 = r12.f10026c
            boolean r0 = r0.m10261C0()
            if (r0 == 0) goto L5a
            kotlin.jvm.functions.Function0 r0 = r12.f10027d
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L5a:
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r0 = r12.f10026c
            r12.f10025b = r2
            java.lang.Object r0 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10259x0(r0, r12)
            if (r0 != r11) goto L65
            goto La7
        L65:
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r0 = r12.f10026c
            r2 = 0
            java.util.List r5 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10231A0(r0, r2, r3, r2)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r0 = r12.f10026c
            com.zykj.evaluation.submit.SubmitTaskManger r0 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10242h0(r0)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r2 = r12.f10026c
            kotlinx.coroutines.flow.MutableStateFlow r2 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10246k0(r2)
            java.lang.Object r2 = r2.getValue()
            com.zykj.message.server.bean.UserInfo r2 = (com.zykj.message.server.bean.UserInfo) r2
            java.lang.Long r2 = r2.m10602a()
            java.lang.String r3 = "getId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            long r2 = r2.longValue()
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r4 = r12.f10026c
            long r6 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10237c0(r4)
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r12.f10024a = r4
            r12.f10025b = r1
            r1 = r2
            r3 = r6
            r6 = 0
            r7 = 0
            r9 = 24
            r10 = 0
            r8 = r12
            java.lang.Object r0 = com.zykj.evaluation.submit.SubmitTaskManger.m8797j(r0, r1, r3, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto La8
        La7:
            return r11
        La8:
            kotlin.jvm.functions.Function0 r0 = r12.f10028e
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel$commit$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1.smali:153
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NormalViewModel$commit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
