package com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdViewModel$sendEffect$1", m7918f = "ChangePsdViewModel.kt", m7919i = {}, m7920l = {139}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class ChangePsdViewModel$sendEffect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6548a;

    /* renamed from: b */
    public final /* synthetic */ ChangePsdViewModel f6549b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6129c f6550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePsdViewModel$sendEffect$1(ChangePsdViewModel changePsdViewModel, AbstractC6129c abstractC6129c, Continuation continuation) {
        super(2, continuation);
        this.f6549b = changePsdViewModel;
        this.f6550c = abstractC6129c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangePsdViewModel$sendEffect$1(this.f6549b, this.f6550c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6548a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.f6549b._effect;
            AbstractC6129c abstractC6129c = this.f6550c;
            this.f6548a = 1;
            if (mutableSharedFlow.emit(abstractC6129c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChangePsdViewModel$sendEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
