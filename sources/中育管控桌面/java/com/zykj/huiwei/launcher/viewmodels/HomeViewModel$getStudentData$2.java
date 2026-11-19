package com.zykj.huiwei.launcher.viewmodels;

import com.zykj.huiwei.launcher.proto.C6069g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/g;", "it", "", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/g;)V"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$getStudentData$2", m7918f = "HomeViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class HomeViewModel$getStudentData$2 extends SuspendLambda implements Function2<C6069g, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7098a;

    /* renamed from: b */
    public /* synthetic */ Object f7099b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f7100c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getStudentData$2(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7100c = homeViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C6069g c6069g, Continuation continuation) {
        return ((HomeViewModel$getStudentData$2) create(c6069g, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeViewModel$getStudentData$2 homeViewModel$getStudentData$2 = new HomeViewModel$getStudentData$2(this.f7100c, continuation);
        homeViewModel$getStudentData$2.f7099b = obj;
        return homeViewModel$getStudentData$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C6069g c6069g = (C6069g) this.f7099b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f7098a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f7100c._studentInfo.setValue(c6069g);
        return Unit.INSTANCE;
    }
}
