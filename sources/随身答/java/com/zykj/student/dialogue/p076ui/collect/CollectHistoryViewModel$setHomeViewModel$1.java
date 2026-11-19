package com.zykj.student.dialogue.p076ui.collect;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.p076ui.home.HomeViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p244s6.C9526k0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryViewModel$setHomeViewModel$1", m13451f = "CollectHistoryViewModel.kt", m13452i = {}, m13453l = {28}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class CollectHistoryViewModel$setHomeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10760a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f10761b;

    /* renamed from: c */
    public final /* synthetic */ CollectHistoryViewModel f10762c;

    /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryViewModel$setHomeViewModel$1$a */
    public static final class C7486a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ CollectHistoryViewModel f10763a;

        public C7486a(CollectHistoryViewModel collectHistoryViewModel) {
            this.f10763a = collectHistoryViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(C9526k0 c9526k0, Continuation continuation) {
            this.f10763a.m10123w(c9526k0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectHistoryViewModel$setHomeViewModel$1(HomeViewModel homeViewModel, CollectHistoryViewModel collectHistoryViewModel, Continuation continuation) {
        super(2, continuation);
        this.f10761b = homeViewModel;
        this.f10762c = collectHistoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectHistoryViewModel$setHomeViewModel$1(this.f10761b, this.f10762c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f10760a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow filterConditions = this.f10761b.getFilterConditions();
            C7486a c7486a = new C7486a(this.f10762c);
            this.f10760a = 1;
            if (filterConditions.collect(c7486a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CollectHistoryViewModel$setHomeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
