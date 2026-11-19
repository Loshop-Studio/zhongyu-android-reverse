package com.zykj.huiwei.launcher.p035ui.fragment.applist;

import com.zykj.http.bean.ApiResp;
import com.zykj.huiwei.launcher.api.HomeService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p004a3.AbstractC0009a;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.applist.HuiWeiAppListViewModel$getAppList$1", m7918f = "HuiWeiAppListViewModel.kt", m7919i = {}, m7920l = {32}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class HuiWeiAppListViewModel$getAppList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6845a;

    /* renamed from: b */
    public int f6846b;

    /* renamed from: c */
    public final /* synthetic */ HuiWeiAppListViewModel f6847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuiWeiAppListViewModel$getAppList$1(HuiWeiAppListViewModel huiWeiAppListViewModel, Continuation continuation) {
        super(2, continuation);
        this.f6847c = huiWeiAppListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HuiWeiAppListViewModel$getAppList$1(this.f6847c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6846b;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow2 = this.f6847c.huiWeiDisableAppList;
            HomeService homeService = this.f6847c.api;
            this.f6845a = mutableStateFlow2;
            this.f6846b = 1;
            Object disableAppsAsync = homeService.getDisableAppsAsync(this);
            if (disableAppsAsync == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow = mutableStateFlow2;
            obj = disableAppsAsync;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) this.f6845a;
            ResultKt.throwOnFailure(obj);
        }
        mutableStateFlow.setValue(AbstractC0009a.m12a((ApiResp) obj));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HuiWeiAppListViewModel$getAppList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
