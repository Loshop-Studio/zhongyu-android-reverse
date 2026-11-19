package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
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
import p244s6.C9560s2;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$updateSelectedState$1", m13451f = "HomeViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,509:1\n230#2,5:510\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1\n*L\n263#1:510,5\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeViewModel$updateSelectedState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11712a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f11713b;

    /* renamed from: c */
    public final /* synthetic */ QuestionResp f11714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateSelectedState$1(HomeViewModel homeViewModel, QuestionResp questionResp, Continuation continuation) {
        super(2, continuation);
        this.f11713b = homeViewModel;
        this.f11714c = questionResp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$updateSelectedState$1(this.f11713b, this.f11714c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11712a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f11713b._homeUiState;
        HomeViewModel homeViewModel = this.f11713b;
        QuestionResp questionResp = this.f11714c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C9560s2.m15748b((C9560s2) value, null, null, null, false, homeViewModel.m10866Q(((C9560s2) homeViewModel.getHomeUiState().getValue()).m15757j(), questionResp.getId()), false, null, null, 239, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$updateSelectedState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
