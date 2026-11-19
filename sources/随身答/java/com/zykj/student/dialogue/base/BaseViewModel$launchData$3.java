package com.zykj.student.dialogue.base;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.base.BaseViewModel$launchData$3", m13451f = "BaseViewModel.kt", m13452i = {0, 1, 2, 2, 2, 2, 3}, m13453l = {75, PatchStatus.CODE_LOAD_SOPHIX_VERSION, PatchStatus.CODE_LOAD_DELETE_OPT, PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR}, m13454m = "invokeSuspend", m13455n = {"$this$launch", "$this$launch", "$this$launch", "e", "it", "$i$a$-let-BaseViewModel$launchData$3$1", "$this$launch"}, m13456s = {"L$0", "L$0", "L$0", "L$1", "L$2", "I$0", "L$0"})
/* loaded from: classes5.dex */
public final class BaseViewModel$launchData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f10332a;

    /* renamed from: b */
    public Object f10333b;

    /* renamed from: c */
    public int f10334c;

    /* renamed from: d */
    public int f10335d;

    /* renamed from: e */
    public /* synthetic */ Object f10336e;

    /* renamed from: f */
    public final /* synthetic */ Function2 f10337f;

    /* renamed from: g */
    public final /* synthetic */ Function2 f10338g;

    /* renamed from: h */
    public final /* synthetic */ Function3 f10339h;

    /* renamed from: i */
    public final /* synthetic */ String f10340i;

    /* renamed from: j */
    public final /* synthetic */ Function2 f10341j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$launchData$3(Function2 function2, Function2 function22, Function3 function3, String str, Function2 function23, Continuation continuation) {
        super(2, continuation);
        this.f10337f = function2;
        this.f10338g = function22;
        this.f10339h = function3;
        this.f10340i = str;
        this.f10341j = function23;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseViewModel$launchData$3 baseViewModel$launchData$3 = new BaseViewModel$launchData$3(this.f10337f, this.f10338g, this.f10339h, this.f10340i, this.f10341j, continuation);
        baseViewModel$launchData$3.f10336e = obj;
        return baseViewModel$launchData$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r8.invoke(r0, r7) != r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f10336e
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.f10335d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L37
            if (r2 == r5) goto L31
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L90
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            java.lang.Object r2 = r7.f10333b
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            java.lang.Object r2 = r7.f10332a
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7a
        L31:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            goto L7a
        L35:
            r8 = move-exception
            goto L58
        L37:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            goto L4b
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.functions.Function2 r8 = r7.f10337f     // Catch: java.lang.Throwable -> L35
            r7.f10336e = r0     // Catch: java.lang.Throwable -> L35
            r7.f10335d = r6     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.invoke(r0, r7)     // Catch: java.lang.Throwable -> L35
            if (r8 != r1) goto L4b
            goto L8f
        L4b:
            kotlin.jvm.functions.Function2 r8 = r7.f10338g     // Catch: java.lang.Throwable -> L35
            r7.f10336e = r0     // Catch: java.lang.Throwable -> L35
            r7.f10335d = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.invoke(r0, r7)     // Catch: java.lang.Throwable -> L35
            if (r8 != r1) goto L7a
            goto L8f
        L58:
            r8.printStackTrace()
            kotlin.jvm.functions.Function3 r2 = r7.f10339h
            if (r2 == 0) goto L75
            r7.f10336e = r0
            r7.f10332a = r8
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r7.f10333b = r5
            r5 = 0
            r7.f10334c = r5
            r7.f10335d = r4
            java.lang.Object r8 = r2.invoke(r0, r8, r7)
            if (r8 != r1) goto L7a
            goto L8f
        L75:
            java.lang.String r2 = r7.f10340i
            p138i6.AbstractC8136b.m13038f(r8, r2)
        L7a:
            kotlin.jvm.functions.Function2 r8 = r7.f10341j
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r7.f10336e = r2
            r2 = 0
            r7.f10332a = r2
            r7.f10333b = r2
            r7.f10335d = r3
            java.lang.Object r8 = r8.invoke(r0, r7)
            if (r8 != r1) goto L90
        L8f:
            return r1
        L90:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.base.BaseViewModel$launchData$3.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/base/BaseViewModel$launchData$3.smali:194
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseViewModel$launchData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
