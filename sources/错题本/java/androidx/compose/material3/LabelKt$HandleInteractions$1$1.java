package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.InterfaceC5910f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", m5303f = "Label.kt", m5304i = {}, m5305l = {112}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class LabelKt$HandleInteractions$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TooltipState $state;
    int label;

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/interaction/Interaction;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", m5303f = "Label.kt", m5304i = {}, m5305l = {117}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1 */
    public static final class C16931 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ TooltipState $state;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16931(TooltipState tooltipState, InterfaceC5631c<? super C16931> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$state = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            C16931 c16931 = new C16931(this.$state, interfaceC5631c);
            c16931.L$0 = obj;
            return c16931;
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull Interaction interaction, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C16931) create(interaction, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                Interaction interaction = (Interaction) this.L$0;
                if (interaction instanceof PressInteraction.Press ? true : interaction instanceof DragInteraction.Start ? true : interaction instanceof HoverInteraction.Enter) {
                    TooltipState tooltipState = this.$state;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    this.label = 1;
                    if (tooltipState.show(mutatePriority, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (interaction instanceof PressInteraction.Release ? true : interaction instanceof DragInteraction.Stop ? true : interaction instanceof HoverInteraction.Exit) {
                        this.$state.dismiss();
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$HandleInteractions$1$1(MutableInteractionSource mutableInteractionSource, TooltipState tooltipState, InterfaceC5631c<? super LabelKt$HandleInteractions$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$interactionSource = mutableInteractionSource;
        this.$state = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        return new LabelKt$HandleInteractions$1$1(this.$interactionSource, this.$state, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            InterfaceC5910f interactions = this.$interactionSource.getInteractions();
            C16931 c16931 = new C16931(this.$state, null);
            this.label = 1;
            if (AbstractC5914h.m5552h(interactions, c16931, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((LabelKt$HandleInteractions$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
