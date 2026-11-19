package com.zykj.evaluation.p057ui.home;

import com.zykj.evaluation.bean.TaskInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p245t6.AbstractC9448n0;
import p245t6.C9450o0;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/TaskInfo;", "it", "Lt6/o0;", "<anonymous>", "(Lcom/zykj/evaluation/bean/TaskInfo;)Lt6/o0;"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$1$2", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class HomeViewModel$buildDataInfo$1$2 extends SuspendLambda implements Function2<TaskInfo, Continuation<? super C9450o0>, Object> {

    /* renamed from: a */
    public int f9809a;

    /* renamed from: b */
    public /* synthetic */ Object f9810b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6928a f9811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$buildDataInfo$1$2(AbstractC6928a abstractC6928a, Continuation continuation) {
        super(2, continuation);
        this.f9811c = abstractC6928a;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(TaskInfo taskInfo, Continuation continuation) {
        return ((HomeViewModel$buildDataInfo$1$2) create(taskInfo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeViewModel$buildDataInfo$1$2 homeViewModel$buildDataInfo$1$2 = new HomeViewModel$buildDataInfo$1$2(this.f9811c, continuation);
        homeViewModel$buildDataInfo$1$2.f9810b = obj;
        return homeViewModel$buildDataInfo$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaskInfo taskInfo = (TaskInfo) this.f9810b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9809a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AbstractC9448n0.m15730a(taskInfo, this.f9811c);
    }
}
