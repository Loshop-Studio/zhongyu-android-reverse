package com.zykj.evaluation.p057ui.sketch;

import com.zykj.base.utils.XToastUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p037c7.C5150k;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sketch.SketchPlayViewModel$downloadSketch$1$taskEnd$3", m13596f = "SketchPlayViewModel.kt", m13597i = {}, m13598l = {85}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class SketchPlayViewModel$downloadSketch$1$taskEnd$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10180a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayViewModel f10181b;

    /* renamed from: c */
    public final /* synthetic */ File f10182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayViewModel$downloadSketch$1$taskEnd$3(SketchPlayViewModel sketchPlayViewModel, File file, Continuation continuation) {
        super(2, continuation);
        this.f10181b = sketchPlayViewModel;
        this.f10182c = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SketchPlayViewModel$downloadSketch$1$taskEnd$3(this.f10181b, this.f10182c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10180a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            SketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1 sketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1 = new SketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1(this.f10182c, null);
            this.f10180a = 1;
            obj = BuildersKt.withContext(io2, sketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        File file = (File) obj;
        if (file != null) {
            SketchPlayViewModel sketchPlayViewModel = this.f10181b;
            C5150k c5150kM10422s = sketchPlayViewModel.m10422s();
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            sketchPlayViewModel.m10425y(c5150kM10422s.m2796a(absolutePath));
            SketchPlayViewModel.m10420x(this.f10181b, null, null, 3, null);
        } else {
            XToastUtils.INSTANCE.error("微课解压失败");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SketchPlayViewModel$downloadSketch$1$taskEnd$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
