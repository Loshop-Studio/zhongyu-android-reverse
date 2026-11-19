package com.zykj.student.dialogue.p076ui.widget;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p012ui.node.DrawModifierNodeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.p076ui.widget.CustomIndication;
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

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.widget.CustomIndication$PressIndicationInstance$onAttach$1", m13451f = "CustomIndication.kt", m13452i = {0, 0, 0}, m13453l = {41}, m13454m = "invokeSuspend", m13455n = {"pressCount", "hoverCount", "focusCount"}, m13456s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
public final class CustomIndication$PressIndicationInstance$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f11896a;

    /* renamed from: b */
    public Object f11897b;

    /* renamed from: c */
    public Object f11898c;

    /* renamed from: d */
    public int f11899d;

    /* renamed from: e */
    public final /* synthetic */ CustomIndication.PressIndicationInstance f11900e;

    /* renamed from: com.zykj.student.dialogue.ui.widget.CustomIndication$PressIndicationInstance$onAttach$1$a */
    public static final class C7642a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ Ref.IntRef f11901a;

        /* renamed from: b */
        public final /* synthetic */ Ref.IntRef f11902b;

        /* renamed from: c */
        public final /* synthetic */ Ref.IntRef f11903c;

        /* renamed from: d */
        public final /* synthetic */ CustomIndication.PressIndicationInstance f11904d;

        public C7642a(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, CustomIndication.PressIndicationInstance pressIndicationInstance) {
            this.f11901a = intRef;
            this.f11902b = intRef2;
            this.f11903c = intRef3;
            this.f11904d = pressIndicationInstance;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Interaction interaction, Continuation continuation) {
            if (interaction instanceof PressInteraction.Press) {
                this.f11901a.element++;
            } else if (interaction instanceof PressInteraction.Release) {
                Ref.IntRef intRef = this.f11901a;
                intRef.element--;
            } else if (interaction instanceof PressInteraction.Cancel) {
                Ref.IntRef intRef2 = this.f11901a;
                intRef2.element--;
            } else if (interaction instanceof HoverInteraction.Enter) {
                this.f11902b.element++;
            } else if (interaction instanceof HoverInteraction.Exit) {
                Ref.IntRef intRef3 = this.f11902b;
                intRef3.element--;
            } else if (interaction instanceof FocusInteraction.Focus) {
                this.f11903c.element++;
            } else if (interaction instanceof FocusInteraction.Unfocus) {
                Ref.IntRef intRef4 = this.f11903c;
                intRef4.element--;
            }
            boolean z9 = this.f11901a.element > 0;
            if (this.f11904d.f11895b != z9) {
                this.f11904d.f11895b = z9;
                DrawModifierNodeKt.invalidateDraw(this.f11904d);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomIndication$PressIndicationInstance$onAttach$1(CustomIndication.PressIndicationInstance pressIndicationInstance, Continuation continuation) {
        super(2, continuation);
        this.f11900e = pressIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CustomIndication$PressIndicationInstance$onAttach$1(this.f11900e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11899d;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            Ref.IntRef intRef3 = new Ref.IntRef();
            Flow<Interaction> interactions = this.f11900e.f11894a.getInteractions();
            C7642a c7642a = new C7642a(intRef, intRef2, intRef3, this.f11900e);
            this.f11896a = SpillingKt.nullOutSpilledVariable(intRef);
            this.f11897b = SpillingKt.nullOutSpilledVariable(intRef2);
            this.f11898c = SpillingKt.nullOutSpilledVariable(intRef3);
            this.f11899d = 1;
            if (interactions.collect(c7642a, this) == coroutine_suspended) {
                return coroutine_suspended;
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
        return ((CustomIndication$PressIndicationInstance$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
