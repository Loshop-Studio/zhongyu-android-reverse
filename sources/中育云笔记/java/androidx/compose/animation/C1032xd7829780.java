package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", m26211f = "AnimatedVisibility.kt", m26212l = {739}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 */
/* loaded from: classes.dex */
public final class C1032xd7829780 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ State<InterfaceC9544p> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1032xd7829780(Transition<EnterExitState> transition, State<? extends InterfaceC9544p> state, InterfaceC11588c<? super C1032xd7829780> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        C1032xd7829780 c1032xd7829780 = new C1032xd7829780(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, interfaceC11588c);
        c1032xd7829780.L$0 = obj;
        return c1032xd7829780;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(ProduceStateScope<Boolean> produceStateScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((C1032xd7829780) create(produceStateScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            final Transition<EnterExitState> transition = this.$childTransition;
            InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.valueOf(AnimatedVisibilityKt.getExitFinished(transition));
                }
            });
            final Transition<EnterExitState> transition2 = this.$childTransition;
            final State<InterfaceC9544p> state = this.$shouldDisposeBlockUpdated$delegate;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.2
                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                    return emit(((Boolean) obj2).booleanValue(), (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                }

                public final Object emit(boolean z10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    produceStateScope.setValue(AbstractC11826a.m26206a(z10 ? ((Boolean) AnimatedVisibilityKt.AnimatedEnterExitImpl$lambda$2(state).invoke(transition2.getCurrentState(), transition2.getTargetState())).booleanValue() : false));
                    return C10786q.f26013a;
                }
            };
            this.label = 1;
            if (interfaceC11594cSnapshotFlow.collect(interfaceC11595d, this) == objM25952f) {
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
}
