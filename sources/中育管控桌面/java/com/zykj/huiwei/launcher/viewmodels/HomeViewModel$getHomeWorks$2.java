package com.zykj.huiwei.launcher.viewmodels;

import com.zykj.huiwei.launcher.bean.GetTaskListResponse;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", "Lcom/zykj/huiwei/launcher/bean/GetTaskListResponse;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$getHomeWorks$2", m7918f = "HomeViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class HomeViewModel$getHomeWorks$2 extends SuspendLambda implements Function2<GetTaskListResponse, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7094a;

    /* renamed from: b */
    public /* synthetic */ Object f7095b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f7096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getHomeWorks$2(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7096c = homeViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(GetTaskListResponse getTaskListResponse, Continuation continuation) {
        return ((HomeViewModel$getHomeWorks$2) create(getTaskListResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeViewModel$getHomeWorks$2 homeViewModel$getHomeWorks$2 = new HomeViewModel$getHomeWorks$2(this.f7096c, continuation);
        homeViewModel$getHomeWorks$2.f7095b = obj;
        return homeViewModel$getHomeWorks$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetTaskListResponse getTaskListResponse = (GetTaskListResponse) this.f7095b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f7094a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f7096c._todoItems.setValue(CollectionsKt.toMutableList((Collection) getTaskListResponse.getItems()));
        this.f7096c._todoItemsNum.setValue(Boxing.boxInt(getTaskListResponse.getTotalCount()));
        this.f7096c._todoUrgeNum.setValue(Boxing.boxInt(getTaskListResponse.getTotalUrge()));
        return Unit.INSTANCE;
    }
}
