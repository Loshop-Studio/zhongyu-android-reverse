package com.zykj.evaluation.p057ui.sketch;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sketch.SketchPlayPageKt$SketchPlayPage$1$1", m13596f = "SketchPlayPage.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class SketchPlayPageKt$SketchPlayPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10164a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayViewModel f10165b;

    /* renamed from: c */
    public final /* synthetic */ long f10166c;

    /* renamed from: d */
    public final /* synthetic */ long f10167d;

    /* renamed from: e */
    public final /* synthetic */ String f10168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayPageKt$SketchPlayPage$1$1(SketchPlayViewModel sketchPlayViewModel, long j10, long j11, String str, Continuation continuation) {
        super(2, continuation);
        this.f10165b = sketchPlayViewModel;
        this.f10166c = j10;
        this.f10167d = j11;
        this.f10168e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SketchPlayPageKt$SketchPlayPage$1$1(this.f10165b, this.f10166c, this.f10167d, this.f10168e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10164a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f10165b.m10423t(this.f10166c, this.f10167d, StringsKt.replace$default(this.f10168e, "\\", "/", false, 4, (Object) null));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SketchPlayPageKt$SketchPlayPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
