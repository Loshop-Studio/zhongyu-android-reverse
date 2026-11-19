package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p244s6.C9560s2;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$catalogSwitch$1", m13451f = "HomeViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$catalogSwitch$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,509:1\n230#2,5:510\n230#2,5:515\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$catalogSwitch$1\n*L\n185#1:510,5\n194#1:515,5\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeViewModel$catalogSwitch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11647a;

    /* renamed from: b */
    public final /* synthetic */ CatalogResp f11648b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f11649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$catalogSwitch$1(CatalogResp catalogResp, HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11648b = catalogResp;
        this.f11649c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$catalogSwitch$1(this.f11648b, this.f11649c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11647a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long id = this.f11648b.getId();
        Long lM15753f = ((C9560s2) this.f11649c.getHomeUiState().getValue()).m15753f();
        if (lM15753f != null && id == lM15753f.longValue()) {
            return Unit.INSTANCE;
        }
        if (this.f11648b.isHistoryCollect()) {
            MutableStateFlow mutableStateFlow = this.f11649c._homeUiState;
            CatalogResp catalogResp = this.f11648b;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, C9560s2.m15748b((C9560s2) value2, null, null, Boxing.boxLong(catalogResp.getId()), false, null, false, null, null, 251, null)));
        } else {
            MutableStateFlow mutableStateFlow2 = this.f11649c._homeUiState;
            CatalogResp catalogResp2 = this.f11648b;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, C9560s2.m15748b((C9560s2) value, null, null, Boxing.boxLong(catalogResp2.getId()), false, null, false, null, null, 251, null)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$catalogSwitch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
