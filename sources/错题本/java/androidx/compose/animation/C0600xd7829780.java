package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/ProduceStateScope;", "", "Ld6/s;", "<anonymous>", "(Landroidx/compose/runtime/ProduceStateScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", m5303f = "AnimatedVisibility.kt", m5304i = {}, m5305l = {739}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 */
/* loaded from: classes.dex */
public final class C0600xd7829780 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ State<InterfaceC6473e> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0600xd7829780(Transition<EnterExitState> transition, State<? extends InterfaceC6473e> state, InterfaceC5631c<? super C0600xd7829780> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        C0600xd7829780 c0600xd7829780 = new C0600xd7829780(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, interfaceC5631c);
        c0600xd7829780.L$0 = obj;
        return c0600xd7829780;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(ProduceStateScope<Boolean> produceStateScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((C0600xd7829780) create(produceStateScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            final Transition<EnterExitState> transition = this.$childTransition;
            InterfaceC5910f interfaceC5910fSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC6469a() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final Boolean invoke() {
                    return Boolean.valueOf(AnimatedVisibilityKt.getExitFinished(transition));
                }
            });
            final Transition<EnterExitState> transition2 = this.$childTransition;
            final State<InterfaceC6473e> state = this.$shouldDisposeBlockUpdated$delegate;
            InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.2
                @Override // kotlinx.coroutines.flow.InterfaceC5912g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC5631c interfaceC5631c) {
                    return emit(((Boolean) obj2).booleanValue(), (InterfaceC5631c<? super C5443s>) interfaceC5631c);
                }

                public final Object emit(boolean z8, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    produceStateScope.setValue(Boolean.valueOf(z8 ? ((Boolean) AnimatedVisibilityKt.AnimatedEnterExitImpl$lambda$2(state).invoke(transition2.getCurrentState(), transition2.getTargetState())).booleanValue() : false));
                    return C5443s.f8405a;
                }
            };
            this.label = 1;
            if (interfaceC5910fSnapshotFlow.collect(interfaceC5912g, this) == coroutineSingletons) {
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
}
