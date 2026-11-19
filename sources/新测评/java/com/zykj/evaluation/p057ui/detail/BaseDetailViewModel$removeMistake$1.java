package com.zykj.evaluation.p057ui.detail;

import com.zykj.evaluation.p057ui.detail.AbstractC6899d;
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
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$removeMistake$1", m13596f = "BaseDetailViewModel.kt", m13597i = {}, m13598l = {581}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class BaseDetailViewModel$removeMistake$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9132a;

    /* renamed from: b */
    public final /* synthetic */ BaseDetailViewModel f9133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDetailViewModel$removeMistake$1(BaseDetailViewModel baseDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9133b = baseDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseDetailViewModel$removeMistake$1(this.f9133b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object objM14822d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9132a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8843j interfaceC8843j = this.f9133b.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
            long jM9264G = this.f9133b.m9264G();
            long jM9318z = this.f9133b.m9282a0() ? this.f9133b.m9318z() : this.f9133b.m9274Q();
            boolean zM9282a0 = this.f9133b.m9282a0();
            this.f9132a = 1;
            objM14822d = interfaceC8843j.m14822d(jM9264G, jM9318z, zM9282a0, this);
            if (objM14822d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM14822d = obj;
        }
        AbstractC8711g.m14347b((ApiResp) objM14822d);
        BaseDetailViewModel baseDetailViewModel = this.f9133b;
        baseDetailViewModel.m9289h0(C6897b.m9427b(baseDetailViewModel.m9312w(), null, null, null, null, false, null, null, false, false, null, false, null, AbstractC6899d.a.f9245c, null, false, false, null, null, 0L, null, 1044479, null));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseDetailViewModel$removeMistake$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
