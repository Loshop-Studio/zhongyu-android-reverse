package com.zykj.evaluation.p057ui.home;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p234s6.C9270d;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$filterReset$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$filterReset$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:723\n1563#3:719\n1634#3,3:720\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$filterReset$1\n*L\n576#1:716,3\n576#1:723,2\n578#1:719\n578#1:720,3\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$filterReset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9850a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f9851b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$filterReset$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9851b = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$filterReset$1(this.f9851b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        HomeFilterState homeFilterState;
        ArrayList arrayList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9850a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f9851b._filterUiState;
        do {
            value = mutableStateFlow.getValue();
            homeFilterState = (HomeFilterState) value;
            List<C9270d> filterDataList = homeFilterState.getFilterDataList();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterDataList, 10));
            for (C9270d c9270d : filterDataList) {
                arrayList.add(C9270d.m15534b(c9270d, null, null, CollectionsKt.listOf(CollectionsKt.first(c9270d.m15537d())), 3, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, homeFilterState.copy(arrayList)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$filterReset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
