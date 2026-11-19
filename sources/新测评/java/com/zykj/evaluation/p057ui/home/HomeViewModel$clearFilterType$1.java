package com.zykj.evaluation.p057ui.home;

import com.zykj.evaluation.p057ui.home.AbstractC6930c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$clearFilterType$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {273}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:726\n1563#3:719\n1634#3,3:720\n774#3:723\n865#3,2:724\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1\n*L\n263#1:716,3\n263#1:726,2\n265#1:719\n265#1:720,3\n267#1:723\n267#1:724,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$clearFilterType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9842a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6930c f9843b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f9844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$clearFilterType$1(AbstractC6930c abstractC6930c, HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9843b = abstractC6930c;
        this.f9844c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$clearFilterType$1(this.f9843b, this.f9844c, continuation);
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
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9842a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC6930c abstractC6930c = this.f9843b;
            if (abstractC6930c instanceof AbstractC6930c.d) {
                this.f9844c.m10049F(AbstractC6930c.d.a.f9897d);
            } else if (abstractC6930c instanceof AbstractC6930c.b) {
                this.f9844c.m10049F(AbstractC6930c.b.a.f9889d);
            } else if (abstractC6930c instanceof AbstractC6930c.a) {
                this.f9844c.m10049F(AbstractC6930c.a.d.f9885d);
            } else if (abstractC6930c instanceof AbstractC6930c.c) {
                this.f9844c.m10049F(AbstractC6930c.c.C10138c.f9894d);
            } else {
                if (!(abstractC6930c instanceof AbstractC6930c.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f9844c.m10049F(AbstractC6930c.e.d.f9905e);
            }
            MutableStateFlow mutableStateFlow = this.f9844c._mainUiState;
            HomeViewModel homeViewModel = this.f9844c;
            do {
                value = mutableStateFlow.getValue();
                homeViewState = (HomeViewState) value;
                List<C9270d> filterDataList = ((HomeFilterState) homeViewModel._filterUiState.getValue()).getFilterDataList();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterDataList, 10));
                for (C9270d c9270d : filterDataList) {
                    arrayList2.add(new Pair(c9270d.m15538e(), c9270d.m15540g()));
                }
                arrayList = new ArrayList();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (((CharSequence) ((Pair) obj2).getFirst()).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
            } while (!mutableStateFlow.compareAndSet(value, HomeViewState.copy$default(homeViewState, null, arrayList, null, null, 13, null)));
            HomeViewModel homeViewModel2 = this.f9844c;
            this.f9842a = 1;
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
        return ((HomeViewModel$clearFilterType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
