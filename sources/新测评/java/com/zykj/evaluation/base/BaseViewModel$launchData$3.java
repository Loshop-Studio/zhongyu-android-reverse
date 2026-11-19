package com.zykj.evaluation.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.base.BaseViewModel$launchData$3", m13596f = "BaseViewModel.kt", m13597i = {0, 1, 2, 3, 3, 3, 3, 4, 5}, m13598l = {79, 80, 87, 84, 87, 87}, m13599m = "invokeSuspend", m13600n = {"$this$launch", "$this$launch", "$this$launch", "$this$launch", "e", "it", "$i$a$-let-BaseViewModel$launchData$3$1", "$this$launch", "$this$launch"}, m13601s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
public final class BaseViewModel$launchData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f8682a;

    /* renamed from: b */
    public Object f8683b;

    /* renamed from: c */
    public int f8684c;

    /* renamed from: d */
    public int f8685d;

    /* renamed from: e */
    public /* synthetic */ Object f8686e;

    /* renamed from: f */
    public final /* synthetic */ Function2 f8687f;

    /* renamed from: g */
    public final /* synthetic */ Function2 f8688g;

    /* renamed from: h */
    public final /* synthetic */ Function3 f8689h;

    /* renamed from: i */
    public final /* synthetic */ String f8690i;

    /* renamed from: j */
    public final /* synthetic */ Function2 f8691j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$launchData$3(Function2 function2, Function2 function22, Function3 function3, String str, Function2 function23, Continuation continuation) {
        super(2, continuation);
        this.f8687f = function2;
        this.f8688g = function22;
        this.f8689h = function3;
        this.f8690i = str;
        this.f8691j = function23;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseViewModel$launchData$3 baseViewModel$launchData$3 = new BaseViewModel$launchData$3(this.f8687f, this.f8688g, this.f8689h, this.f8690i, this.f8691j, continuation);
        baseViewModel$launchData$3.f8686e = obj;
        return baseViewModel$launchData$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r6.invoke(r0, r5) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        if (r6.invoke(r0, r5) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f8686e
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r5.f8685d
            r3 = 0
            switch(r2) {
                case 0: goto L3d;
                case 1: goto L39;
                case 2: goto L33;
                case 3: goto L2e;
                case 4: goto L1f;
                case 5: goto L2e;
                case 6: goto L16;
                default: goto Le;
            }
        Le:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L16:
            java.lang.Object r0 = r5.f8682a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto Lc2
        L1f:
            java.lang.Object r2 = r5.f8683b
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            java.lang.Object r2 = r5.f8682a
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2b
            goto L92
        L2b:
            r6 = move-exception
            goto Lab
        L2e:
            kotlin.ResultKt.throwOnFailure(r6)
            goto La8
        L33:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L37
            goto L5d
        L37:
            r6 = move-exception
            goto L6f
        L39:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L37
            goto L4f
        L3d:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.functions.Function2 r6 = r5.f8687f     // Catch: java.lang.Throwable -> L37
            r5.f8686e = r0     // Catch: java.lang.Throwable -> L37
            r2 = 1
            r5.f8685d = r2     // Catch: java.lang.Throwable -> L37
            java.lang.Object r6 = r6.invoke(r0, r5)     // Catch: java.lang.Throwable -> L37
            if (r6 != r1) goto L4f
            goto Lc0
        L4f:
            kotlin.jvm.functions.Function2 r6 = r5.f8688g     // Catch: java.lang.Throwable -> L37
            r5.f8686e = r0     // Catch: java.lang.Throwable -> L37
            r2 = 2
            r5.f8685d = r2     // Catch: java.lang.Throwable -> L37
            java.lang.Object r6 = r6.invoke(r0, r5)     // Catch: java.lang.Throwable -> L37
            if (r6 != r1) goto L5d
            goto Lc0
        L5d:
            kotlin.jvm.functions.Function2 r6 = r5.f8691j
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r5.f8686e = r2
            r2 = 3
            r5.f8685d = r2
            java.lang.Object r6 = r6.invoke(r0, r5)
            if (r6 != r1) goto La8
            goto Lc0
        L6f:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.functions.Function3 r2 = r5.f8689h     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L8d
            r5.f8686e = r0     // Catch: java.lang.Throwable -> L2b
            r5.f8682a = r6     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)     // Catch: java.lang.Throwable -> L2b
            r5.f8683b = r4     // Catch: java.lang.Throwable -> L2b
            r4 = 0
            r5.f8684c = r4     // Catch: java.lang.Throwable -> L2b
            r4 = 4
            r5.f8685d = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r2.invoke(r0, r6, r5)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L92
            goto Lc0
        L8d:
            java.lang.String r2 = r5.f8690i     // Catch: java.lang.Throwable -> L2b
            p189o5.AbstractC8712h.m14348a(r6, r2)     // Catch: java.lang.Throwable -> L2b
        L92:
            kotlin.jvm.functions.Function2 r6 = r5.f8691j
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r5.f8686e = r2
            r5.f8682a = r3
            r5.f8683b = r3
            r2 = 5
            r5.f8685d = r2
            java.lang.Object r6 = r6.invoke(r0, r5)
            if (r6 != r1) goto La8
            goto Lc0
        La8:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        Lab:
            kotlin.jvm.functions.Function2 r2 = r5.f8691j
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r5.f8686e = r4
            r5.f8682a = r6
            r5.f8683b = r3
            r3 = 6
            r5.f8685d = r3
            java.lang.Object r0 = r2.invoke(r0, r5)
            if (r0 != r1) goto Lc1
        Lc0:
            return r1
        Lc1:
            r0 = r6
        Lc2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.base.BaseViewModel$launchData$3.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/base/BaseViewModel$launchData$3.smali:202
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseViewModel$launchData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
