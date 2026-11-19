package androidx.compose.material3.internal;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C5961g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p185v7.AbstractC6683l;

@Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$cancellableShow$1", m5303f = "BasicTooltip.kt", m5304i = {}, m5305l = {189}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,188:1\n314#2,11:189\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl$show$cancellableShow$1\n*L\n141#1:189,11\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements InterfaceC6471c {
    Object L$0;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl basicTooltipStateImpl, InterfaceC5631c<? super BasicTooltipStateImpl$show$cancellableShow$1> interfaceC5631c) {
        super(1, interfaceC5631c);
        this.this$0 = basicTooltipStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@NotNull InterfaceC5631c<?> interfaceC5631c) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.this$0, interfaceC5631c);
    }

    @Override // p152r6.InterfaceC6471c
    @Nullable
    public final Object invoke(@Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((BasicTooltipStateImpl$show$cancellableShow$1) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            BasicTooltipStateImpl basicTooltipStateImpl = this.this$0;
            this.L$0 = basicTooltipStateImpl;
            this.label = 1;
            C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(this));
            c5961g.m5584u();
            basicTooltipStateImpl.setVisible(true);
            basicTooltipStateImpl.job = c5961g;
            if (c5961g.m5583t() == coroutineSingletons) {
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
