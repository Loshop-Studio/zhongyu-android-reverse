package com.zykj.evaluation.p057ui.guide.noStem;

import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.message.server.bean.UserInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p122i6.AbstractC7668a;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$submitNoStem$1", m13596f = "NoStemViewModel.kt", m13597i = {0, 0}, m13598l = {228}, m13599m = "invokeSuspend", m13600n = {"userId", "taskId"}, m13601s = {"L$0", "J$0"})
/* loaded from: classes4.dex */
public final class NoStemViewModel$submitNoStem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9590a;

    /* renamed from: b */
    public long f9591b;

    /* renamed from: c */
    public int f9592c;

    /* renamed from: d */
    public final /* synthetic */ NoStemViewModel f9593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoStemViewModel$submitNoStem$1(NoStemViewModel noStemViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9593d = noStemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NoStemViewModel$submitNoStem$1(this.f9593d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9592c;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Long lM10602a = ((UserInfo) this.f9593d.userInfo.getValue()).m10602a();
            long jM9776q = this.f9593d.m9776q();
            SubmitTaskManger submitTaskManger = this.f9593d.submitTaskManger;
            Intrinsics.checkNotNull(lM10602a);
            long jLongValue = lM10602a.longValue();
            List listM12805a = AbstractC7668a.m12805a(this.f9593d.m9827V().m12880b());
            this.f9590a = SpillingKt.nullOutSpilledVariable(lM10602a);
            this.f9591b = jM9776q;
            this.f9592c = 1;
            if (SubmitTaskManger.m8797j(submitTaskManger, jLongValue, jM9776q, listM12805a, null, null, this, 24, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NoStemViewModel$submitNoStem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
