package com.zykj.evaluation.p057ui.home;

import androidx.core.view.PointerIconCompat;
import com.zykj.evaluation.bean.GetTaskListReq;
import com.zykj.evaluation.bean.GetTaskListResponse;
import com.zykj.evaluation.bean.TaskInfo;
import com.zykj.evaluation.p057ui.home.AbstractC6928a;
import com.zykj.http.bean.ApiResp;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import p189o5.AbstractC8711g;
import p200p5.InterfaceC8843j;
import p234s6.C9269c1;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, m13558d2 = {"<anonymous>", "", "Lcom/zykj/evaluation/bean/TaskInfo;", "skipCount", "", "maxResultCount"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$1$1", m13596f = "HomeViewModel.kt", m13597i = {0, 0}, m13598l = {426}, m13599m = "invokeSuspend", m13600n = {"skipCount", "maxResultCount"}, m13601s = {"I$0", "I$1"})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:723\n1563#3:719\n1634#3,3:720\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1\n*L\n438#1:716,3\n438#1:723,2\n440#1:719\n440#1:720,3\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$buildDataInfo$1$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super List<? extends TaskInfo>>, Object> {

    /* renamed from: a */
    public int f9803a;

    /* renamed from: b */
    public /* synthetic */ int f9804b;

    /* renamed from: c */
    public /* synthetic */ int f9805c;

    /* renamed from: d */
    public final /* synthetic */ HomeViewModel f9806d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC6928a f9807e;

    /* renamed from: f */
    public final /* synthetic */ GetTaskListReq f9808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$buildDataInfo$1$1(HomeViewModel homeViewModel, AbstractC6928a abstractC6928a, GetTaskListReq getTaskListReq, Continuation continuation) {
        super(3, continuation);
        this.f9806d = homeViewModel;
        this.f9807e = abstractC6928a;
        this.f9808f = getTaskListReq;
    }

    /* renamed from: a */
    public final Object m10068a(int i10, int i11, Continuation continuation) {
        HomeViewModel$buildDataInfo$1$1 homeViewModel$buildDataInfo$1$1 = new HomeViewModel$buildDataInfo$1$1(this.f9806d, this.f9807e, this.f9808f, continuation);
        homeViewModel$buildDataInfo$1$1.f9804b = i10;
        homeViewModel$buildDataInfo$1$1.f9805c = i11;
        return homeViewModel$buildDataInfo$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Integer num2, Continuation<? super List<? extends TaskInfo>> continuation) {
        return m10068a(num.intValue(), num2.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM14838t;
        Object value;
        HomeViewState homeViewState;
        ArrayList arrayList;
        int i10 = this.f9804b;
        int i11 = this.f9805c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f9803a;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8843j interfaceC8843j = this.f9806d.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
            GetTaskListReq getTaskListReqCopy$default = GetTaskListReq.copy$default(this.f9808f, this.f9807e.m10073b().getType(), i10, i11, null, null, null, null, null, null, null, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, null);
            this.f9804b = i10;
            this.f9805c = i11;
            this.f9803a = 1;
            objM14838t = interfaceC8843j.m14838t(getTaskListReqCopy$default, this);
            if (objM14838t == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM14838t = obj;
        }
        GetTaskListResponse getTaskListResponse = (GetTaskListResponse) AbstractC8711g.m14347b((ApiResp) objM14838t);
        if (getTaskListResponse == null) {
            return CollectionsKt.emptyList();
        }
        if (i10 == 0) {
            MutableStateFlow mutableStateFlow = this.f9806d._mainUiState;
            AbstractC6928a abstractC6928a = this.f9807e;
            do {
                value = mutableStateFlow.getValue();
                homeViewState = (HomeViewState) value;
                List<C9269c1> pageTitleList = homeViewState.getPageTitleList();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pageTitleList, 10));
                for (C9269c1 c9269c1M15529b : pageTitleList) {
                    if (Intrinsics.areEqual(c9269c1M15529b.m15533e(), abstractC6928a.m10072a()) && (Intrinsics.areEqual(c9269c1M15529b.m15533e(), AbstractC6928a.d.f9877c.m10072a()) || Intrinsics.areEqual(c9269c1M15529b.m15533e(), AbstractC6928a.b.f9875c.m10072a()))) {
                        c9269c1M15529b = C9269c1.m15529b(c9269c1M15529b, getTaskListResponse.getTotalCount(), null, null, 6, null);
                    }
                    arrayList.add(c9269c1M15529b);
                }
            } while (!mutableStateFlow.compareAndSet(value, HomeViewState.copy$default(homeViewState, null, null, null, arrayList, 7, null)));
        }
        return getTaskListResponse.getItems();
    }
}
