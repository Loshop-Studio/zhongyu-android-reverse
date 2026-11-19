package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import java.util.ArrayList;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", m26211f = "FloatingActionButton.kt", m26212l = {548}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FloatingActionButtonElevation$animateElevation$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$2$1(InteractionSource interactionSource, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, InterfaceC11588c<? super FloatingActionButtonElevation$animateElevation$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$interactionSource = interactionSource;
        this.$animatable = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        FloatingActionButtonElevation$animateElevation$2$1 floatingActionButtonElevation$animateElevation$2$1 = new FloatingActionButtonElevation$animateElevation$2$1(this.$interactionSource, this.$animatable, interfaceC11588c);
        floatingActionButtonElevation$animateElevation$2$1.L$0 = obj;
        return floatingActionButtonElevation$animateElevation$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            final ArrayList arrayList = new ArrayList();
            InterfaceC11594c interactions = this.$interactionSource.getInteractions();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.1

                @InterfaceC11829d(m26210c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1", m26211f = "FloatingActionButton.kt", m26212l = {573}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
                    final /* synthetic */ Interaction $targetInteraction;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Interaction interaction, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$animatable = floatingActionButtonElevationAnimatable;
                        this.$targetInteraction = interaction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new AnonymousClass1(this.$animatable, this.$targetInteraction, interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
                            Interaction interaction = this.$targetInteraction;
                            this.label = 1;
                            if (floatingActionButtonElevationAnimatable.animateElevation(interaction, this) == objM25952f) {
                                return objM25952f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                        }
                        return C10786q.f26013a;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }
                }

                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                    return emit((Interaction) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                }

                public final Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(floatingActionButtonElevationAnimatable, (Interaction) AbstractC10947g0.m23957z0(arrayList), null), 3, null);
                    return C10786q.f26013a;
                }
            };
            this.label = 1;
            if (interactions.collect(interfaceC11595d, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((FloatingActionButtonElevation$animateElevation$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
