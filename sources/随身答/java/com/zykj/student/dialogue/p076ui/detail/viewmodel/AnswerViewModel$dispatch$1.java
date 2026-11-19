package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7538a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p214p6.C9336k;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$dispatch$1", m13451f = "AnswerViewModel.kt", m13452i = {0}, m13453l = {168}, m13454m = "invokeSuspend", m13455n = {"stateValue"}, m13456s = {"L$0"})
@SourceDebugExtension({"SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,529:1\n1563#2:530\n1634#2,3:531\n774#2:534\n865#2,2:535\n*S KotlinDebug\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1\n*L\n121#1:530\n121#1:531,3\n138#1:534\n138#1:535,2\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerViewModel$dispatch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f11160a;

    /* renamed from: b */
    public int f11161b;

    /* renamed from: c */
    public final /* synthetic */ AnswerViewModel f11162c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC7538a f11163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewModel$dispatch$1(AnswerViewModel answerViewModel, AbstractC7538a abstractC7538a, Continuation continuation) {
        super(2, continuation);
        this.f11162c = answerViewModel;
        this.f11163d = abstractC7538a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerViewModel$dispatch$1(this.f11162c, this.f11163d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11161b;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            C9336k c9336k = (C9336k) this.f11162c._viewState.getValue();
            AbstractC7538a abstractC7538a = this.f11163d;
            if (abstractC7538a instanceof AbstractC7538a.c) {
                this.f11162c.m10471O();
                this.f11162c.m10483y(C9336k.m15226b(c9336k, null, ((AbstractC7538a.c) this.f11163d).m10500a(), false, null, 0L, false, 61, null));
            } else if (abstractC7538a instanceof AbstractC7538a.b) {
                this.f11162c.m10483y(C9336k.m15226b(c9336k, null, 0, true, null, ((AbstractC7538a.b) abstractC7538a).m10499a(), false, 43, null));
            } else if (abstractC7538a instanceof AbstractC7538a.a) {
                this.f11162c.m10483y(C9336k.m15226b(c9336k, null, 0, false, null, ((AbstractC7538a.a) abstractC7538a).m10498a(), false, 43, null));
            } else if (abstractC7538a instanceof AbstractC7538a.d) {
                if (this.f11162c.getQuestionBean().getValue() == null) {
                    AnswerViewModel answerViewModel = this.f11162c;
                    answerViewModel.m10466J(answerViewModel.m10465I());
                }
                AnswerViewModel answerViewModel2 = this.f11162c;
                boolean zM10501a = ((AbstractC7538a.d) this.f11163d).m10501a();
                this.f11160a = SpillingKt.nullOutSpilledVariable(c9336k);
                this.f11161b = 1;
                if (answerViewModel2.m10462D(zM10501a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(abstractC7538a instanceof AbstractC7538a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f11162c.m10471O();
                this.f11162c.m10483y(C9336k.m15226b(c9336k, null, 0, false, ((AbstractC7538a.e) this.f11163d).m10502a(), 0L, false, 53, null));
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerViewModel$dispatch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
