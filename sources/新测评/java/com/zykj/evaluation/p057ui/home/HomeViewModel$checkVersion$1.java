package com.zykj.evaluation.p057ui.home;

import com.blankj.utilcode.util.AppUtils;
import com.zykj.evaluation.version.VersionResp;
import com.zykj.evaluation.version.VersionResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p112h7.InterfaceC7632b;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$checkVersion$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {408}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class HomeViewModel$checkVersion$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9820a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f9821b;

    /* renamed from: c */
    public final /* synthetic */ Function1 f9822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$checkVersion$1(HomeViewModel homeViewModel, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f9821b = homeViewModel;
        this.f9822c = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$checkVersion$1(this.f9821b, this.f9822c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeViewModel$checkVersion$1 homeViewModel$checkVersion$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9820a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7632b interfaceC7632b = this.f9821b.versionApi;
            this.f9820a = 1;
            homeViewModel$checkVersion$1 = this;
            obj = InterfaceC7632b.m12617a(interfaceC7632b, null, 0, 0, homeViewModel$checkVersion$1, 7, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            homeViewModel$checkVersion$1 = this;
        }
        VersionResult result = ((VersionResp) obj).getResult();
        if (result != null) {
            Function1 function1 = homeViewModel$checkVersion$1.f9822c;
            if (result.getVersionCode() > AppUtils.getAppVersionCode()) {
                function1.invoke(result);
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$checkVersion$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
