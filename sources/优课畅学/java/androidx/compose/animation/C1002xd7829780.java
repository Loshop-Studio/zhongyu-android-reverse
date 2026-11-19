package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", m17801f = "AnimatedVisibility.kt", m17802l = {739}, m17803m = "invokeSuspend")
/* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 */
/* loaded from: classes.dex */
public final class C1002xd7829780 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ State<InterfaceC10574p> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1002xd7829780(Transition<EnterExitState> transition, State<? extends InterfaceC10574p> state, InterfaceC9324c<? super C1002xd7829780> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        C1002xd7829780 c1002xd7829780 = new C1002xd7829780(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, interfaceC9324c);
        c1002xd7829780.L$0 = obj;
        return c1002xd7829780;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(ProduceStateScope<Boolean> produceStateScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((C1002xd7829780) create(produceStateScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            final Transition<EnterExitState> transition = this.$childTransition;
            InterfaceC9266c interfaceC9266cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC10559a() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    return Boolean.valueOf(AnimatedVisibilityKt.getExitFinished(transition));
                }
            });
            final Transition<EnterExitState> transition2 = this.$childTransition;
            final State<InterfaceC10574p> state = this.$shouldDisposeBlockUpdated$delegate;
            InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.2
                @Override // p169l8.InterfaceC9267d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                    return emit(((Boolean) obj2).booleanValue(), (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                }

                public final Object emit(boolean z10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    produceStateScope.setValue(AbstractC9536a.m17796a(z10 ? ((Boolean) AnimatedVisibilityKt.AnimatedEnterExitImpl$lambda$2(state).invoke(transition2.getCurrentState(), transition2.getTargetState())).booleanValue() : false));
                    return C8736p.f16368a;
                }
            };
            this.label = 1;
            if (interfaceC9266cSnapshotFlow.collect(interfaceC9267d, this) == objM17291f) {
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
