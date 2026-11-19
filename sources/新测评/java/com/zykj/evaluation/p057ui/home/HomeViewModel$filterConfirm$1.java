package com.zykj.evaluation.p057ui.home;

import com.zykj.evaluation.p057ui.home.AbstractC6930c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$filterConfirm$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {628}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:727\n230#2,3:729\n233#2,2:739\n1563#3:719\n1634#3,2:720\n1563#3:722\n1634#3,3:723\n1636#3:726\n1563#3:732\n1634#3,3:733\n774#3:736\n865#3,2:737\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1\n*L\n597#1:716,3\n597#1:727,2\n617#1:729,3\n617#1:739,2\n599#1:719\n599#1:720,2\n601#1:722\n601#1:723,3\n599#1:726\n619#1:732\n619#1:733,3\n621#1:736\n621#1:737,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$filterConfirm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9848a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f9849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$filterConfirm$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9849b = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$filterConfirm$1(this.f9849b, continuation);
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
        Object value2;
        HomeViewState homeViewState;
        ArrayList arrayList2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9848a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow = this.f9849b._filterUiState;
            do {
                value = mutableStateFlow.getValue();
                homeFilterState = (HomeFilterState) value;
                List<C9270d> filterDataList = homeFilterState.getFilterDataList();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterDataList, 10));
                for (C9270d c9270d : filterDataList) {
                    List<Object> listM15537d = c9270d.m15537d();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15537d, 10));
                    for (Object aVar : listM15537d) {
                        if ((aVar instanceof AbstractC6930c.e.a) && !((AbstractC6930c.e.a) aVar).m10082d() && !c9270d.m15536c().contains(aVar)) {
                            aVar = new AbstractC6930c.e.a(null, null, 3, null);
                        }
                        arrayList3.add(aVar);
                    }
                    arrayList.add(C9270d.m15534b(c9270d, null, arrayList3, null, 5, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, homeFilterState.copy(arrayList)));
            MutableStateFlow mutableStateFlow2 = this.f9849b._mainUiState;
            HomeViewModel homeViewModel = this.f9849b;
            do {
                value2 = mutableStateFlow2.getValue();
                homeViewState = (HomeViewState) value2;
                List<C9270d> filterDataList2 = ((HomeFilterState) homeViewModel._filterUiState.getValue()).getFilterDataList();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterDataList2, 10));
                for (C9270d c9270d2 : filterDataList2) {
                    arrayList4.add(new Pair(c9270d2.m15538e(), c9270d2.m15540g()));
                }
                arrayList2 = new ArrayList();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    if (((CharSequence) ((Pair) obj2).getFirst()).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
            } while (!mutableStateFlow2.compareAndSet(value2, HomeViewState.copy$default(homeViewState, null, arrayList2, null, null, 13, null)));
            HomeViewModel homeViewModel2 = this.f9849b;
            this.f9848a = 1;
            if (homeViewModel2.m10064V(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$filterConfirm$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
