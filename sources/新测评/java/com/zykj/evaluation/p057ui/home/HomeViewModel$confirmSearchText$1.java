package com.zykj.evaluation.p057ui.home;

import com.blankj.utilcode.util.RegexUtils;
import com.zykj.evaluation.bean.GetTaskListReq;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p156l5.AbstractC8507b;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$confirmSearchText$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$confirmSearchText$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:720\n1#3:719\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$confirmSearchText$1\n*L\n295#1:716,3\n295#1:720,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$confirmSearchText$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9845a;

    /* renamed from: b */
    public final /* synthetic */ String f9846b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f9847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$confirmSearchText$1(String str, HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9846b = str;
        this.f9847c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$confirmSearchText$1(this.f9846b, this.f9847c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9845a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.f9846b.length() == 0 || RegexUtils.isMatch("^[a-zA-Z0-9\\u4e00-\\u9fa5]+$", this.f9846b)) {
            MutableStateFlow mutableStateFlow = this.f9847c._taskListReq;
            String str = this.f9846b;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, GetTaskListReq.copy$default((GetTaskListReq) value, 0, 0, 0, null, null, null, null, null, null, str.length() == 0 ? null : str, 511, null)));
        } else {
            this.f9847c.m8649g(new AbstractC8507b.a.C10153a("搜索内容不支持特殊字符"));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$confirmSearchText$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
