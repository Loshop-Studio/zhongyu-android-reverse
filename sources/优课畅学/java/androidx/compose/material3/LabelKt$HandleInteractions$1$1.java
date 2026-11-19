package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", m17801f = "Label.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LabelKt$HandleInteractions$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TooltipState $state;
    int label;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", m17801f = "Label.kt", m17802l = {117}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1 */
    public static final class C21831 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ TooltipState $state;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21831(TooltipState tooltipState, InterfaceC9324c<? super C21831> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$state = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C21831 c21831 = new C21831(this.$state, interfaceC9324c);
            c21831.L$0 = obj;
            return c21831;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Interaction interaction, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C21831) create(interaction, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Interaction interaction = (Interaction) this.L$0;
                if (interaction instanceof PressInteraction.Press ? true : interaction instanceof DragInteraction.Start ? true : interaction instanceof HoverInteraction.Enter) {
                    TooltipState tooltipState = this.$state;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    this.label = 1;
                    if (tooltipState.show(mutatePriority, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (interaction instanceof PressInteraction.Release ? true : interaction instanceof DragInteraction.Stop ? true : interaction instanceof HoverInteraction.Exit) {
                        this.$state.dismiss();
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$HandleInteractions$1$1(MutableInteractionSource mutableInteractionSource, TooltipState tooltipState, InterfaceC9324c<? super LabelKt$HandleInteractions$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$interactionSource = mutableInteractionSource;
        this.$state = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new LabelKt$HandleInteractions$1$1(this.$interactionSource, this.$state, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((LabelKt$HandleInteractions$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9266c interactions = this.$interactionSource.getInteractions();
            C21831 c21831 = new C21831(this.$state, null);
            this.label = 1;
            if (AbstractC9268e.m17019i(interactions, c21831, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
