package com.zykj.evaluation.p057ui.home;

import com.zykj.evaluation.bean.SetTaskFavoriteReq;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.exception.RemoteCodeException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p189o5.AbstractC8711g;
import p200p5.InterfaceC8843j;
import p245t6.C9452p0;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$setFavorite$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {314}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,715:1\n230#2,5:716\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1\n*L\n321#1:716,5\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$setFavorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9860a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f9861b;

    /* renamed from: c */
    public final /* synthetic */ long f9862c;

    /* renamed from: d */
    public final /* synthetic */ boolean f9863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$setFavorite$1(HomeViewModel homeViewModel, long j10, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f9861b = homeViewModel;
        this.f9862c = j10;
        this.f9863d = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$setFavorite$1(this.f9861b, this.f9862c, this.f9863d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object value;
        Map mutableMap;
        C9452p0 c9452p0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9860a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8843j interfaceC8843j = this.f9861b.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
            SetTaskFavoriteReq setTaskFavoriteReq = new SetTaskFavoriteReq(this.f9862c, this.f9863d);
            this.f9860a = 1;
            obj = interfaceC8843j.m14824f(setTaskFavoriteReq, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC8711g.m14347b((ApiResp) obj);
        MutableStateFlow mutableStateFlow = this.f9861b._modificationEvents;
        long j10 = this.f9862c;
        boolean z9 = this.f9863d;
        do {
            value = mutableStateFlow.getValue();
            mutableMap = MapsKt.toMutableMap((Map) value);
            Long lBoxLong = Boxing.boxLong(j10);
            C9452p0 c9452p02 = (C9452p0) mutableMap.get(Boxing.boxLong(j10));
            if (c9452p02 == null || (c9452p0 = C9452p0.m15755b(c9452p02, Boxing.boxBoolean(z9), null, null, 6, null)) == null) {
                c9452p0 = new C9452p0(Boxing.boxBoolean(z9), null, null, 6, null);
            }
            mutableMap.put(lBoxLong, c9452p0);
        } while (!mutableStateFlow.compareAndSet(value, mutableMap));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$setFavorite$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
