package com.zykj.student.dialogue.p076ui.home;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.student.dialogue.bean.req.MoveCategoryReq;
import com.zykj.student.dialogue.network.BaseResponse;
import com.zykj.student.dialogue.p076ui.home.AbstractC7636p;
import com.zykj.student.dialogue.p076ui.home.AbstractC7638r;
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
import p128h6.AbstractC8103b;
import p138i6.AbstractC8137c;
import p158k6.InterfaceC8287g;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerViewModel$moveQuestion$1", m13451f = "HomePagerViewModel.kt", m13452i = {}, m13453l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class HomePagerViewModel$moveQuestion$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11581a;

    /* renamed from: b */
    public final /* synthetic */ HomePagerViewModel f11582b;

    /* renamed from: c */
    public final /* synthetic */ List f11583c;

    /* renamed from: d */
    public final /* synthetic */ long f11584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$moveQuestion$1(HomePagerViewModel homePagerViewModel, List list, long j9, Continuation continuation) {
        super(2, continuation);
        this.f11582b = homePagerViewModel;
        this.f11583c = list;
        this.f11584d = j9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomePagerViewModel$moveQuestion$1(this.f11582b, this.f11583c, this.f11584d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11581a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8287g interfaceC8287g = this.f11582b.dialogueApi;
            MoveCategoryReq moveCategoryReq = new MoveCategoryReq(this.f11583c, this.f11584d);
            this.f11581a = 1;
            obj = interfaceC8287g.m13395k(moveCategoryReq, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC8137c.m13043b((BaseResponse) obj);
        this.f11582b.m10787z(AbstractC7638r.b.f11885a);
        this.f11582b.m10778A(new AbstractC7636p.a(this.f11583c));
        this.f11582b.m9922g(new AbstractC8103b.a.b("移动成功"));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomePagerViewModel$moveQuestion$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
