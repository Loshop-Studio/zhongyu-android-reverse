package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "city", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$getWeatherData$2", m7918f = "HomeViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class HomeViewModel$getWeatherData$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7106a;

    /* renamed from: b */
    public /* synthetic */ Object f7107b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f7108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getWeatherData$2(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7108c = homeViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, Continuation continuation) {
        return ((HomeViewModel$getWeatherData$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeViewModel$getWeatherData$2 homeViewModel$getWeatherData$2 = new HomeViewModel$getWeatherData$2(this.f7108c, continuation);
        homeViewModel$getWeatherData$2.f7107b = obj;
        return homeViewModel$getWeatherData$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.f7107b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f7106a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f7108c._weatherLocation.postValue(str);
        return Unit.INSTANCE;
    }
}
