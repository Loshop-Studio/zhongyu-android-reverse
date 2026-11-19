package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel$updateAllAppList$1", m7918f = "MainViewModel.kt", m7919i = {}, m7920l = {88}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class MainViewModel$updateAllAppList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f7256a;

    /* renamed from: b */
    public Object f7257b;

    /* renamed from: c */
    public int f7258c;

    /* renamed from: d */
    public final /* synthetic */ MainViewModel f7259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$updateAllAppList$1(MainViewModel mainViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7259d = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$updateAllAppList$1(this.f7259d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Triple triple;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f7258c;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.f7259d._shownAppList;
            Triple triple2 = (Triple) this.f7259d._shownAppList.getValue();
            MainViewModel mainViewModel = this.f7259d;
            this.f7256a = mutableStateFlow;
            this.f7257b = triple2;
            this.f7258c = 1;
            Object objM6154j = mainViewModel.m6154j(this);
            if (objM6154j == coroutine_suspended) {
                return coroutine_suspended;
            }
            triple = triple2;
            obj2 = objM6154j;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Triple triple3 = (Triple) this.f7257b;
            mutableStateFlow = (MutableStateFlow) this.f7256a;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            triple = triple3;
        }
        mutableStateFlow.setValue(Triple.copy$default(triple, null, null, obj2, 3, null));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainViewModel$updateAllAppList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
