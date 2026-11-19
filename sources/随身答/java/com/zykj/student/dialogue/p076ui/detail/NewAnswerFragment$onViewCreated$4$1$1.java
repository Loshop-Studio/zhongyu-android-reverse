package com.zykj.student.dialogue.p076ui.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$4$1$1", m13451f = "NewAnswerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class NewAnswerFragment$onViewCreated$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11090a;

    /* renamed from: b */
    public final /* synthetic */ boolean f11091b;

    /* renamed from: c */
    public final /* synthetic */ NewAnswerFragment f11092c;

    /* renamed from: d */
    public final /* synthetic */ Function0 f11093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAnswerFragment$onViewCreated$4$1$1(boolean z9, NewAnswerFragment newAnswerFragment, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f11091b = z9;
        this.f11092c = newAnswerFragment;
        this.f11093d = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewAnswerFragment$onViewCreated$4$1$1(this.f11091b, this.f11092c, this.f11093d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11090a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.f11091b) {
            this.f11093d.invoke();
            return Unit.INSTANCE;
        }
        this.f11092c.m10382O().show();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NewAnswerFragment$onViewCreated$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
