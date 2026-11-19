package com.zykj.evaluation.p057ui.sheet.normal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p026b7.C4997c1;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$handleSuccessScanned$1", m13596f = "NormalViewModel.kt", m13597i = {0, 0, 1, 1}, m13598l = {727, 731}, m13599m = "invokeSuspend", m13600n = {"previewBitmap", "width", "previewBitmap", "width"}, m13601s = {"L$0", "I$0", "L$0", "I$0"})
@SourceDebugExtension({"SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,1441:1\n88#2:1442\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1\n*L\n724#1:1442\n*E\n"})
/* loaded from: classes4.dex */
public final class NormalViewModel$handleSuccessScanned$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10067a;

    /* renamed from: b */
    public Object f10068b;

    /* renamed from: c */
    public int f10069c;

    /* renamed from: d */
    public final /* synthetic */ NormalViewModel f10070d;

    /* renamed from: e */
    public final /* synthetic */ C4997c1 f10071e;

    /* renamed from: f */
    public final /* synthetic */ Function0 f10072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$handleSuccessScanned$1(NormalViewModel normalViewModel, C4997c1 c4997c1, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f10070d = normalViewModel;
        this.f10071e = c4997c1;
        this.f10072f = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NormalViewModel$handleSuccessScanned$1(this.f10070d, this.f10071e, this.f10072f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r3.m10273P0(r4, r5, r9, r8) != r0) goto L28;
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
            int r1 = r8.f10069c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r8.f10068b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto Laa
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            int r1 = r8.f10067a
            java.lang.Object r3 = r8.f10068b
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7f
        L29:
            kotlin.ResultKt.throwOnFailure(r9)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r9 = r8.f10070d
            com.zykj.evaluation.bean.PaperConfig r9 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10238d0(r9)
            if (r9 != 0) goto L3e
            com.zykj.base.utils.XToastUtils r9 = com.zykj.base.utils.XToastUtils.INSTANCE
            java.lang.String r0 = "答题卡配置加载失败，请退出重试"
            r9.error(r0)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L3e:
            int r9 = com.blankj.utilcode.util.ScreenUtils.getScreenHeight()
            int r1 = com.blankj.utilcode.util.ScreenUtils.getScreenWidth()
            int r1 = java.lang.Math.min(r9, r1)
            float r9 = (float) r1
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r4 = r8.f10070d
            float r4 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10236b0(r4)
            float r9 = r9 * r4
            int r9 = (int) r9
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r1, r9, r4)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r4 = r8.f10070d
            boolean r4 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10255t0(r4)
            if (r4 != 0) goto L8b
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r4 = r8.f10070d
            b7.c1 r5 = r8.f10071e
            android.graphics.Bitmap r5 = r5.m2473a()
            b7.c1 r6 = r8.f10071e
            java.util.List r6 = r6.m2474b()
            r8.f10068b = r9
            r8.f10067a = r1
            r8.f10069c = r3
            java.lang.Object r3 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10234Z(r4, r5, r6, r9, r8)
            if (r3 != r0) goto L7c
            goto La9
        L7c:
            r7 = r3
            r3 = r9
            r9 = r7
        L7f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L8a
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L8a:
            r9 = r3
        L8b:
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r3 = r8.f10070d
            b7.c1 r4 = r8.f10071e
            android.graphics.Bitmap r4 = r4.m2473a()
            b7.c1 r5 = r8.f10071e
            java.util.List r5 = r5.m2474b()
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.f10068b = r6
            r8.f10067a = r1
            r8.f10069c = r2
            java.lang.Object r9 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10248m0(r3, r4, r5, r9, r8)
            if (r9 != r0) goto Laa
        La9:
            return r0
        Laa:
            kotlin.jvm.functions.Function0 r9 = r8.f10072f
            r9.invoke()
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel$handleSuccessScanned$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1.smali:180
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NormalViewModel$handleSuccessScanned$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
