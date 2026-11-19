package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Stable
@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, m5110d2 = {"Landroidx/compose/material3/TooltipStateImpl;", "Landroidx/compose/material3/TooltipState;", "", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "<init>", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "Ld6/s;", "show", "(Landroidx/compose/foundation/MutatePriority;Lh6/c;)Ljava/lang/Object;", "dismiss", "()V", "onDispose", "Z", "()Z", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/animation/core/MutableTransitionState;", "transition", "Landroidx/compose/animation/core/MutableTransitionState;", "getTransition", "()Landroidx/compose/animation/core/MutableTransitionState;", "Lkotlinx/coroutines/f;", "job", "Lkotlinx/coroutines/f;", "isVisible", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class TooltipStateImpl implements TooltipState {
    private final boolean isPersistent;

    @Nullable
    private InterfaceC5895f job;

    @NotNull
    private final MutatorMutex mutatorMutex;

    @NotNull
    private final MutableTransitionState<Boolean> transition;

    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.TooltipStateImpl$show$2", m5303f = "Tooltip.kt", m5304i = {}, m5305l = {TypedValues.PositionType.TYPE_PERCENT_HEIGHT, TypedValues.PositionType.TYPE_PERCENT_X}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2 */
    public static final class C19172 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $cancellableShow;
        final /* synthetic */ MutatePriority $mutatePriority;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
        @DebugMetadata(m5302c = "androidx.compose.material3.TooltipStateImpl$show$2$1", m5303f = "Tooltip.kt", m5304i = {}, m5305l = {TypedValues.PositionType.TYPE_PERCENT_X}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6471c $cancellableShow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$cancellableShow = interfaceC6471c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.$cancellableShow, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    InterfaceC6471c interfaceC6471c = this.$cancellableShow;
                    this.label = 1;
                    if (interfaceC6471c.invoke(this) == coroutineSingletons) {
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
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19172(InterfaceC6471c interfaceC6471c, MutatePriority mutatePriority, InterfaceC5631c<? super C19172> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.$cancellableShow = interfaceC6471c;
            this.$mutatePriority = mutatePriority;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@NotNull InterfaceC5631c<?> interfaceC5631c) {
            return TooltipStateImpl.this.new C19172(this.$cancellableShow, this.$mutatePriority, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        @Nullable
        public final Object invoke(@Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C19172) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        
            if (kotlinx.coroutines.AbstractC6014x.m5627G(1500, r5, r4) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 == r3) goto Lc
                if (r1 != r2) goto L12
            Lc:
                kotlin.AbstractC5774b.m5119b(r5)     // Catch: java.lang.Throwable -> L10
                goto L43
            L10:
                r5 = move-exception
                goto L51
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.AbstractC5774b.m5119b(r5)
                androidx.compose.material3.TooltipStateImpl r5 = androidx.compose.material3.TooltipStateImpl.this     // Catch: java.lang.Throwable -> L10
                boolean r5 = r5.getIsPersistent()     // Catch: java.lang.Throwable -> L10
                if (r5 == 0) goto L30
                r6.c r5 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L10
                r4.label = r3     // Catch: java.lang.Throwable -> L10
                java.lang.Object r5 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L10
                if (r5 != r0) goto L43
                goto L42
            L30:
                androidx.compose.material3.TooltipStateImpl$show$2$1 r5 = new androidx.compose.material3.TooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L10
                r6.c r1 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L10
                r3 = 0
                r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L10
                r4.label = r2     // Catch: java.lang.Throwable -> L10
                r1 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r5 = kotlinx.coroutines.AbstractC6014x.m5627G(r1, r5, r4)     // Catch: java.lang.Throwable -> L10
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                androidx.compose.foundation.MutatePriority r5 = r4.$mutatePriority
                androidx.compose.foundation.MutatePriority r0 = androidx.compose.foundation.MutatePriority.PreventUserInput
                if (r5 == r0) goto L4e
                androidx.compose.material3.TooltipStateImpl r5 = androidx.compose.material3.TooltipStateImpl.this
                r5.dismiss()
            L4e:
                d6.s r5 = p045d6.C5443s.f8405a
                return r5
            L51:
                androidx.compose.foundation.MutatePriority r0 = r4.$mutatePriority
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.PreventUserInput
                if (r0 == r1) goto L5c
                androidx.compose.material3.TooltipStateImpl r0 = androidx.compose.material3.TooltipStateImpl.this
                r0.dismiss()
            L5c:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipStateImpl.C19172.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TooltipStateImpl(boolean z8, boolean z9, @NotNull MutatorMutex mutatorMutex) {
        this.isPersistent = z9;
        this.mutatorMutex = mutatorMutex;
        this.transition = new MutableTransitionState<>(Boolean.valueOf(z8));
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        getTransition().setTargetState$animation_core_release(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.TooltipState
    @NotNull
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    /* renamed from: isPersistent, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.TooltipState
    /* renamed from: isVisible */
    public boolean getIsVisible() {
        return getTransition().getCurrentState().booleanValue() || getTransition().getTargetState().booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
        InterfaceC5895f interfaceC5895f = this.job;
        if (interfaceC5895f != null) {
            interfaceC5895f.mo4965i(null);
        }
    }

    @Override // androidx.compose.material3.TooltipState
    @Nullable
    public Object show(@NotNull MutatePriority mutatePriority, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new C19172(new TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null), interfaceC5631c);
        return objMutate == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate : C5443s.f8405a;
    }
}
