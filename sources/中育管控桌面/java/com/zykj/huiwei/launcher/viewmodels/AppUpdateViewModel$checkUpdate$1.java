package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p119o1.InterfaceC7516a;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$checkUpdate$1", m7918f = "AppUpdateViewModel.kt", m7919i = {}, m7920l = {149}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class AppUpdateViewModel$checkUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6959a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7516a f6960b;

    /* renamed from: c */
    public final /* synthetic */ String f6961c;

    /* renamed from: d */
    public final /* synthetic */ AppUpdateViewModel f6962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateViewModel$checkUpdate$1(InterfaceC7516a interfaceC7516a, String str, AppUpdateViewModel appUpdateViewModel, Continuation continuation) {
        super(2, continuation);
        this.f6960b = interfaceC7516a;
        this.f6961c = str;
        this.f6962d = appUpdateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppUpdateViewModel$checkUpdate$1(this.f6960b, this.f6961c, this.f6962d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6959a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f6960b.mo8668b(this.f6961c)) {
                MutableSharedFlow mutableSharedFlowM6029l = this.f6962d.getShowUpdateSharedFlow();
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.f6959a = 1;
                if (mutableSharedFlowM6029l.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((AppUpdateViewModel$checkUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
