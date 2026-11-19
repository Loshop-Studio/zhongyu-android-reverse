package com.zykj.evaluation.submit;

import androidx.work.WorkInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0004H\n"}, m13558d2 = {"<anonymous>", "", "Landroidx/work/WorkInfo;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitTaskManger$isNormalSubmitCommitting$workInfos$1", m13596f = "SubmitTaskManger.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class SubmitTaskManger$isNormalSubmitCommitting$workInfos$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WorkInfo>>, Object> {

    /* renamed from: a */
    public int f8901a;

    /* renamed from: b */
    public final /* synthetic */ SubmitTaskManger f8902b;

    /* renamed from: c */
    public final /* synthetic */ String f8903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTaskManger$isNormalSubmitCommitting$workInfos$1(SubmitTaskManger submitTaskManger, String str, Continuation continuation) {
        super(2, continuation);
        this.f8902b = submitTaskManger;
        this.f8903c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubmitTaskManger$isNormalSubmitCommitting$workInfos$1(this.f8902b, this.f8903c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WorkInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f8901a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.f8902b.m8800d().getWorkInfosForUniqueWork(this.f8903c).get();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SubmitTaskManger$isNormalSubmitCommitting$workInfos$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
