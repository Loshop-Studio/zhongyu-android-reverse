package com.zykj.evaluation.p057ui.home;

import com.zykj.evaluation.p057ui.home.AbstractC6928a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p234s6.C9269c1;
import p245t6.C9452p0;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$setRead$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$setRead$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:723\n230#2,5:725\n1563#3:719\n1634#3,3:720\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$setRead$1\n*L\n346#1:716,3\n346#1:723,2\n365#1:725,5\n347#1:719\n347#1:720,3\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$setRead$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9864a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f9865b;

    /* renamed from: c */
    public final /* synthetic */ long f9866c;

    /* renamed from: d */
    public final /* synthetic */ boolean f9867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$setRead$1(HomeViewModel homeViewModel, long j10, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f9865b = homeViewModel;
        this.f9866c = j10;
        this.f9867d = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$setRead$1(this.f9865b, this.f9866c, this.f9867d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        HomeViewState homeViewState;
        ArrayList arrayList;
        Object value2;
        Map mutableMap;
        C9452p0 c9452p0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9864a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f9865b._mainUiState;
        do {
            value = mutableStateFlow.getValue();
            homeViewState = (HomeViewState) value;
            List<C9269c1> pageTitleList = homeViewState.getPageTitleList();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pageTitleList, 10));
            for (C9269c1 c9269c1M15529b : pageTitleList) {
                if (Intrinsics.areEqual(c9269c1M15529b.m15533e(), AbstractC6928a.b.f9875c.m10072a())) {
                    int iM15532d = c9269c1M15529b.m15532d() - 1;
                    if (iM15532d < 0) {
                        iM15532d = 0;
                    }
                    c9269c1M15529b = C9269c1.m15529b(c9269c1M15529b, iM15532d, null, null, 6, null);
                }
                arrayList.add(c9269c1M15529b);
            }
        } while (!mutableStateFlow.compareAndSet(value, HomeViewState.copy$default(homeViewState, null, null, null, arrayList, 7, null)));
        MutableStateFlow mutableStateFlow2 = this.f9865b._modificationEvents;
        long j10 = this.f9866c;
        boolean z9 = this.f9867d;
        do {
            value2 = mutableStateFlow2.getValue();
            mutableMap = MapsKt.toMutableMap((Map) value2);
            Long lBoxLong = Boxing.boxLong(j10);
            C9452p0 c9452p02 = (C9452p0) mutableMap.get(Boxing.boxLong(j10));
            if (c9452p02 == null || (c9452p0 = C9452p0.m15755b(c9452p02, null, null, Boxing.boxBoolean(!z9), 3, null)) == null) {
                c9452p0 = new C9452p0(null, null, Boxing.boxBoolean(!z9), 3, null);
            }
            mutableMap.put(lBoxLong, c9452p0);
        } while (!mutableStateFlow2.compareAndSet(value2, mutableMap));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$setRead$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
