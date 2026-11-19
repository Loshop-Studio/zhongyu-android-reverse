package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.FilterType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p244s6.C9526k0;
import p244s6.C9530l0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFilterViewModel$resetTempState$1", m13451f = "HomeFilterViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class HomeFilterViewModel$resetTempState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11409a;

    /* renamed from: b */
    public final /* synthetic */ HomeFilterViewModel f11410b;

    /* renamed from: c */
    public final /* synthetic */ C9526k0 f11411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFilterViewModel$resetTempState$1(HomeFilterViewModel homeFilterViewModel, C9526k0 c9526k0, Continuation continuation) {
        super(2, continuation);
        this.f11410b = homeFilterViewModel;
        this.f11411c = c9526k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFilterViewModel$resetTempState$1(this.f11410b, this.f11411c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11409a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HomeFilterViewModel homeFilterViewModel = this.f11410b;
        C9530l0 c9530l0M10636g = homeFilterViewModel.m10636g();
        FilterType.Subject subjectM15722h = this.f11411c.m15722h();
        FilterType.Time.JoinedTime joinedTimeM15719e = this.f11411c.m15719e();
        FilterType.Time.UpdatedTime updatedTimeM15724j = this.f11411c.m15724j();
        FilterType.Time.FavoriteTime favoriteTimeM15718d = this.f11411c.m15718d();
        FilterType.QuestionState questionStateM15720f = this.f11411c.m15720f();
        List listM15725k = this.f11411c.m15725k();
        List listM15723i = this.f11411c.m15723i();
        homeFilterViewModel.m10643n(C9530l0.m15730b(c9530l0M10636g, null, this.f11410b.m10640k(this.f11411c.m15724j(), this.f11410b.m10636g().m15738i(), this.f11410b.m10636g().m15745p()), this.f11410b.m10639j(this.f11411c.m15719e(), this.f11410b.m10636g().m15733d(), this.f11410b.m10636g().m15741l()), this.f11410b.m10638i(this.f11411c.m15718d(), this.f11410b.m10636g().m15732c(), this.f11410b.m10636g().m15740k()), null, null, null, listM15725k, listM15723i, questionStateM15720f, subjectM15722h, joinedTimeM15719e, updatedTimeM15724j, favoriteTimeM15718d, null, 16497, null));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeFilterViewModel$resetTempState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
