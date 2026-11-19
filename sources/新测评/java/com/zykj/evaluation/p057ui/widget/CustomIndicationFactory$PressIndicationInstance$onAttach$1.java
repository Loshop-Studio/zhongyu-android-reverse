package com.zykj.evaluation.p057ui.widget;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.node.DrawModifierNodeKt;
import com.zykj.evaluation.p057ui.widget.CustomIndicationFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.widget.CustomIndicationFactory$PressIndicationInstance$onAttach$1", m13596f = "CustomIndication.kt", m13597i = {0, 0, 0}, m13598l = {41}, m13599m = "invokeSuspend", m13600n = {"pressCount", "hoverCount", "focusCount"}, m13601s = {"L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
public final class CustomIndicationFactory$PressIndicationInstance$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f10254a;

    /* renamed from: b */
    public Object f10255b;

    /* renamed from: c */
    public Object f10256c;

    /* renamed from: d */
    public int f10257d;

    /* renamed from: e */
    public final /* synthetic */ CustomIndicationFactory.PressIndicationInstance f10258e;

    /* renamed from: com.zykj.evaluation.ui.widget.CustomIndicationFactory$PressIndicationInstance$onAttach$1$a */
    public static final class C6942a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ Ref.IntRef f10259a;

        /* renamed from: b */
        public final /* synthetic */ Ref.IntRef f10260b;

        /* renamed from: c */
        public final /* synthetic */ Ref.IntRef f10261c;

        /* renamed from: d */
        public final /* synthetic */ CustomIndicationFactory.PressIndicationInstance f10262d;

        public C6942a(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, CustomIndicationFactory.PressIndicationInstance pressIndicationInstance) {
            this.f10259a = intRef;
            this.f10260b = intRef2;
            this.f10261c = intRef3;
            this.f10262d = pressIndicationInstance;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Interaction interaction, Continuation continuation) {
            if (interaction instanceof PressInteraction.Press) {
                this.f10259a.element++;
            } else if (interaction instanceof PressInteraction.Release) {
                Ref.IntRef intRef = this.f10259a;
                intRef.element--;
            } else if (interaction instanceof PressInteraction.Cancel) {
                Ref.IntRef intRef2 = this.f10259a;
                intRef2.element--;
            } else if (interaction instanceof HoverInteraction.Enter) {
                this.f10260b.element++;
            } else if (interaction instanceof HoverInteraction.Exit) {
                Ref.IntRef intRef3 = this.f10260b;
                intRef3.element--;
            } else if (interaction instanceof FocusInteraction.Focus) {
                this.f10261c.element++;
            } else if (interaction instanceof FocusInteraction.Unfocus) {
                Ref.IntRef intRef4 = this.f10261c;
                intRef4.element--;
            }
            boolean z9 = this.f10259a.element > 0;
            if (this.f10262d.f10253b != z9) {
                this.f10262d.f10253b = z9;
                DrawModifierNodeKt.invalidateDraw(this.f10262d);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomIndicationFactory$PressIndicationInstance$onAttach$1(CustomIndicationFactory.PressIndicationInstance pressIndicationInstance, Continuation continuation) {
        super(2, continuation);
        this.f10258e = pressIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CustomIndicationFactory$PressIndicationInstance$onAttach$1(this.f10258e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10257d;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            Ref.IntRef intRef3 = new Ref.IntRef();
            Flow<Interaction> interactions = this.f10258e.f10252a.getInteractions();
            C6942a c6942a = new C6942a(intRef, intRef2, intRef3, this.f10258e);
            this.f10254a = SpillingKt.nullOutSpilledVariable(intRef);
            this.f10255b = SpillingKt.nullOutSpilledVariable(intRef2);
            this.f10256c = SpillingKt.nullOutSpilledVariable(intRef3);
            this.f10257d = 1;
            if (interactions.collect(c6942a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CustomIndicationFactory$PressIndicationInstance$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
