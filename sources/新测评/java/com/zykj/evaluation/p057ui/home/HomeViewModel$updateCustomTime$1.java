package com.zykj.evaluation.p057ui.home;

import com.zykj.evaluation.p057ui.home.AbstractC6930c;
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
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$updateCustomTime$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:727\n1563#3:719\n1634#3,2:720\n1563#3:722\n1634#3,3:723\n1636#3:726\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1\n*L\n539#1:716,3\n539#1:727,2\n541#1:719\n541#1:720,2\n546#1:722\n546#1:723,3\n541#1:726\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$updateCustomTime$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9868a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f9869b;

    /* renamed from: c */
    public final /* synthetic */ String f9870c;

    /* renamed from: d */
    public final /* synthetic */ String f9871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateCustomTime$1(HomeViewModel homeViewModel, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f9869b = homeViewModel;
        this.f9870c = str;
        this.f9871d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$updateCustomTime$1(this.f9869b, this.f9870c, this.f9871d, continuation);
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
        if (this.f9868a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f9869b._filterUiState;
        String str = this.f9870c;
        String str2 = this.f9871d;
        do {
            value = mutableStateFlow.getValue();
            homeFilterState = (HomeFilterState) value;
            List<C9270d> filterDataList = homeFilterState.getFilterDataList();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterDataList, 10));
            for (C9270d c9270dM15534b : filterDataList) {
                if (c9270dM15534b.m15540g() instanceof AbstractC6930c.e) {
                    AbstractC6930c.e.a aVar = new AbstractC6930c.e.a(str, str2);
                    List<AbstractC6930c> listM15537d = c9270dM15534b.m15537d();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15537d, 10));
                    for (AbstractC6930c abstractC6930c : listM15537d) {
                        if (abstractC6930c instanceof AbstractC6930c.e.a) {
                            abstractC6930c = aVar;
                        }
                        arrayList2.add(abstractC6930c);
                    }
                    boolean zM10082d = aVar.m10082d();
                    Object obj2 = aVar;
                    if (zM10082d) {
                        obj2 = (AbstractC6930c) CollectionsKt.first((List) arrayList2);
                    }
                    c9270dM15534b = C9270d.m15534b(c9270dM15534b, null, arrayList2, CollectionsKt.listOf(obj2), 1, null);
                }
                arrayList.add(c9270dM15534b);
            }
        } while (!mutableStateFlow.compareAndSet(value, homeFilterState.copy(arrayList)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$updateCustomTime$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
