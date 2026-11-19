package com.zykj.huiwei.launcher.repository;

import com.zykj.huiwei.launcher.bean.resp.WeatherBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.HomeRepository$getWeatherInfo$1", m7918f = "HomeRepository.kt", m7919i = {0, 1}, m7920l = {66, 66}, m7921m = "invokeSuspend", m7922n = {"$this$flow", "$this$flow"}, m7923s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
public final class HomeRepository$getWeatherInfo$1 extends SuspendLambda implements Function2<FlowCollector<? super WeatherBean>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6166a;

    /* renamed from: b */
    public int f6167b;

    /* renamed from: c */
    public /* synthetic */ Object f6168c;

    /* renamed from: d */
    public final /* synthetic */ HomeRepository f6169d;

    /* renamed from: e */
    public final /* synthetic */ String f6170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepository$getWeatherInfo$1(HomeRepository homeRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.f6169d = homeRepository;
        this.f6170e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeRepository$getWeatherInfo$1 homeRepository$getWeatherInfo$1 = new HomeRepository$getWeatherInfo$1(this.f6169d, this.f6170e, continuation);
        homeRepository$getWeatherInfo$1.f6168c = obj;
        return homeRepository$getWeatherInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super WeatherBean> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r2.emit(r7, r6) == r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f6168c
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.f6167b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L26
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5b
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r2 = r6.f6166a
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L43
        L26:
            kotlin.ResultKt.throwOnFailure(r7)
            com.zykj.huiwei.launcher.repository.HomeRepository r7 = r6.f6169d
            com.zykj.huiwei.launcher.api.HomeService r7 = com.zykj.huiwei.launcher.repository.HomeRepository.m5414a(r7)
            java.lang.String r2 = r6.f6170e
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r6.f6168c = r5
            r6.f6166a = r0
            r6.f6167b = r4
            java.lang.Object r7 = r7.getWeatherList(r2, r6)
            if (r7 != r1) goto L42
            goto L5a
        L42:
            r2 = r0
        L43:
            com.zykj.http.bean.ApiResp r7 = (com.zykj.http.bean.ApiResp) r7
            java.lang.Object r7 = p004a3.AbstractC0009a.m12a(r7)
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r6.f6168c = r0
            r0 = 0
            r6.f6166a = r0
            r6.f6167b = r3
            java.lang.Object r7 = r2.emit(r7, r6)
            if (r7 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.HomeRepository$getWeatherInfo$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/HomeRepository$getWeatherInfo$1.smali:157
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
        return ((HomeRepository$getWeatherInfo$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
