package com.zykj.evaluation.p057ui.sketch;

import com.zykj.http.bean.ApiResp;
import com.zykj.http.exception.RemoteCodeException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p189o5.AbstractC8711g;
import p200p5.InterfaceC8843j;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sketch.SketchPlayViewModel$setMicroClassRead$3", m13596f = "SketchPlayViewModel.kt", m13597i = {}, m13598l = {122}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class SketchPlayViewModel$setMicroClassRead$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10188a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayViewModel f10189b;

    /* renamed from: c */
    public final /* synthetic */ Float f10190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayViewModel$setMicroClassRead$3(SketchPlayViewModel sketchPlayViewModel, Float f10, Continuation continuation) {
        super(2, continuation);
        this.f10189b = sketchPlayViewModel;
        this.f10190c = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SketchPlayViewModel$setMicroClassRead$3(this.f10189b, this.f10190c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10188a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8843j interfaceC8843j = this.f10189b.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
            long jM10416q = this.f10189b.m10416q();
            long jM10417r = this.f10189b.m10417r();
            Float f10 = this.f10190c;
            this.f10188a = 1;
            obj = interfaceC8843j.m14819a(jM10416q, jM10417r, f10, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC8711g.m14347b((ApiResp) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SketchPlayViewModel$setMicroClassRead$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
