package com.zykj.evaluation.p057ui.sheet.composition;

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
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.composition.CompositionViewModel$handleSuccessScanned$1", m13596f = "CompositionViewModel.kt", m13597i = {1, 1, 2, 2, 2, 2, 2}, m13598l = {79, 86, 96}, m13599m = "invokeSuspend", m13600n = {"previewBitmap", "resultPath", "previewBitmap", "resultPath", "newBitmap", "it", "$i$a$-let-CompositionViewModel$handleSuccessScanned$1$1"}, m13601s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nCompositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
/* loaded from: classes4.dex */
public final class CompositionViewModel$handleSuccessScanned$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9973a;

    /* renamed from: b */
    public Object f9974b;

    /* renamed from: c */
    public Object f9975c;

    /* renamed from: d */
    public Object f9976d;

    /* renamed from: e */
    public int f9977e;

    /* renamed from: f */
    public int f9978f;

    /* renamed from: g */
    public final /* synthetic */ CompositionViewModel f9979g;

    /* renamed from: h */
    public final /* synthetic */ C4997c1 f9980h;

    /* renamed from: i */
    public final /* synthetic */ Function0 f9981i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionViewModel$handleSuccessScanned$1(CompositionViewModel compositionViewModel, C4997c1 c4997c1, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f9979g = compositionViewModel;
        this.f9980h = c4997c1;
        this.f9981i = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompositionViewModel$handleSuccessScanned$1(this.f9979g, this.f9980h, this.f9981i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.composition.CompositionViewModel$handleSuccessScanned$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1.smali:196
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CompositionViewModel$handleSuccessScanned$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
