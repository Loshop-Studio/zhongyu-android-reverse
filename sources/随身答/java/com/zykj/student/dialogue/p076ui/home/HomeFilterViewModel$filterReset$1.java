package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.HomeKt;
import com.zykj.student.dialogue.p076ui.home.AbstractC7593a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p244s6.C9530l0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFilterViewModel$filterReset$1", m13451f = "HomeFilterViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class HomeFilterViewModel$filterReset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11401a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7593a f11402b;

    /* renamed from: c */
    public final /* synthetic */ HomeFilterViewModel f11403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFilterViewModel$filterReset$1(AbstractC7593a abstractC7593a, HomeFilterViewModel homeFilterViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11402b = abstractC7593a;
        this.f11403c = homeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFilterViewModel$filterReset$1(this.f11402b, this.f11403c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11401a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AbstractC7593a abstractC7593a = this.f11402b;
        if (Intrinsics.areEqual(abstractC7593a, AbstractC7593a.d.f11731a)) {
            HomeFilterViewModel homeFilterViewModel = this.f11403c;
            homeFilterViewModel.m10643n(C9530l0.m15730b(homeFilterViewModel.m10636g(), null, null, null, null, null, null, null, null, null, null, HomeKt.getInitialSubject(), null, null, null, null, 31743, null));
        } else if (Intrinsics.areEqual(abstractC7593a, AbstractC7593a.b.f11729a)) {
            HomeFilterViewModel homeFilterViewModel2 = this.f11403c;
            homeFilterViewModel2.m10643n(C9530l0.m15730b(homeFilterViewModel2.m10636g(), null, null, null, null, null, null, null, HomeKt.getInitialViewStatus(), HomeKt.getInitialTeacherViewStatus(), HomeKt.getInitialQuestionState(), null, HomeKt.getInitialJoinedTime(), HomeKt.getInitialUpdatedTime(), null, null, 25727, null));
        } else if (Intrinsics.areEqual(abstractC7593a, AbstractC7593a.a.f11728a)) {
            HomeFilterViewModel homeFilterViewModel3 = this.f11403c;
            homeFilterViewModel3.m10643n(C9530l0.m15730b(homeFilterViewModel3.m10636g(), null, null, null, null, null, null, null, null, null, null, null, null, null, HomeKt.getInitialFavoriteTime(), null, 24575, null));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeFilterViewModel$filterReset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
