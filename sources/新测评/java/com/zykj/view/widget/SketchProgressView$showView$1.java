package com.zykj.view.widget;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.widget.SketchProgressView$showView$1", m13596f = "SketchProgressView.kt", m13597i = {0, 0}, m13598l = {346}, m13599m = "invokeSuspend", m13600n = {"$this$launch", "a"}, m13601s = {"L$0", "I$0"})
/* loaded from: classes5.dex */
public final class SketchProgressView$showView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11680a;

    /* renamed from: b */
    public int f11681b;

    /* renamed from: c */
    public /* synthetic */ Object f11682c;

    /* renamed from: d */
    public final /* synthetic */ SketchProgressView f11683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchProgressView$showView$1(SketchProgressView sketchProgressView, Continuation continuation) {
        super(2, continuation);
        this.f11683d = sketchProgressView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m11497f(SketchProgressView sketchProgressView) {
        sketchProgressView.setVisibility(0);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SketchProgressView$showView$1 sketchProgressView$showView$1 = new SketchProgressView$showView$1(this.f11683d, continuation);
        sketchProgressView$showView$1.f11682c = obj;
        return sketchProgressView$showView$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0048 -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11682c
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.f11681b
            r3 = 1
            if (r2 == 0) goto L1e
            if (r2 != r3) goto L16
            int r2 = r6.f11680a
            kotlin.ResultKt.throwOnFailure(r7)
        L14:
            r7 = r2
            goto L22
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
        L22:
            boolean r2 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
            if (r2 == 0) goto L4b
            r2 = 250(0xfa, float:3.5E-43)
            if (r7 >= r2) goto L4b
            int r2 = r7 + 25
            com.zykj.view.widget.SketchProgressView r7 = r6.f11683d
            android.graphics.Paint r7 = com.zykj.view.widget.SketchProgressView.m11480a(r7)
            r7.setAlpha(r2)
            com.zykj.view.widget.SketchProgressView r7 = r6.f11683d
            r7.postInvalidate()
            r6.f11682c = r0
            r6.f11680a = r2
            r6.f11681b = r3
            r4 = 10
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
            if (r7 != r1) goto L14
            return r1
        L4b:
            com.zykj.view.widget.SketchProgressView r7 = r6.f11683d
            com.zykj.view.widget.b r0 = new com.zykj.view.widget.b
            r0.<init>()
            r7.post(r0)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.SketchProgressView$showView$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes5/com/zykj/view/widget/SketchProgressView$showView$1.smali:170
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SketchProgressView$showView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
