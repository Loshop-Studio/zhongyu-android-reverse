package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes2.dex */
final class TooltipStateImpl implements TooltipState {
    private final boolean isPersistent;
    private InterfaceC11125j job;
    private final MutatorMutex mutatorMutex;
    private final MutableTransitionState<Boolean> transition;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.TooltipStateImpl$show$2", m26211f = "Tooltip.kt", m26212l = {TypedValues.PositionType.TYPE_PERCENT_HEIGHT, TypedValues.PositionType.TYPE_PERCENT_X}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2 */
    public static final class C24372 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $cancellableShow;
        final /* synthetic */ MutatePriority $mutatePriority;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.material3.TooltipStateImpl$show$2$1", m26211f = "Tooltip.kt", m26212l = {TypedValues.PositionType.TYPE_PERCENT_X}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9540l $cancellableShow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$cancellableShow = interfaceC9540l;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$cancellableShow, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC9540l interfaceC9540l = this.$cancellableShow;
                    this.label = 1;
                    if (interfaceC9540l.invoke(this) == objM25952f) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24372(InterfaceC9540l interfaceC9540l, MutatePriority mutatePriority, InterfaceC11588c<? super C24372> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.$cancellableShow = interfaceC9540l;
            this.$mutatePriority = mutatePriority;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return TooltipStateImpl.this.new C24372(this.$cancellableShow, this.$mutatePriority, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            if (kotlinx.coroutines.TimeoutKt.m20487c(1500, r5, r4) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto Le
                if (r1 != r2) goto L14
            Le:
                kotlin.AbstractC9924b.m20071b(r5)     // Catch: java.lang.Throwable -> L12
                goto L45
            L12:
                r5 = move-exception
                goto L53
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                kotlin.AbstractC9924b.m20071b(r5)
                androidx.compose.material3.TooltipStateImpl r5 = androidx.compose.material3.TooltipStateImpl.this     // Catch: java.lang.Throwable -> L12
                boolean r5 = r5.isPersistent()     // Catch: java.lang.Throwable -> L12
                if (r5 == 0) goto L32
                hd.l r5 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L12
                r4.label = r3     // Catch: java.lang.Throwable -> L12
                java.lang.Object r5 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L12
                if (r5 != r0) goto L45
                goto L44
            L32:
                androidx.compose.material3.TooltipStateImpl$show$2$1 r5 = new androidx.compose.material3.TooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L12
                hd.l r1 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L12
                r3 = 0
                r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L12
                r4.label = r2     // Catch: java.lang.Throwable -> L12
                r1 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r5 = kotlinx.coroutines.TimeoutKt.m20487c(r1, r5, r4)     // Catch: java.lang.Throwable -> L12
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                androidx.compose.foundation.MutatePriority r5 = r4.$mutatePriority
                androidx.compose.foundation.MutatePriority r0 = androidx.compose.foundation.MutatePriority.PreventUserInput
                if (r5 == r0) goto L50
                androidx.compose.material3.TooltipStateImpl r5 = androidx.compose.material3.TooltipStateImpl.this
                r5.dismiss()
            L50:
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            L53:
                androidx.compose.foundation.MutatePriority r0 = r4.$mutatePriority
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.PreventUserInput
                if (r0 == r1) goto L5e
                androidx.compose.material3.TooltipStateImpl r0 = androidx.compose.material3.TooltipStateImpl.this
                r0.dismiss()
            L5e:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipStateImpl.C24372.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C24372) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public TooltipStateImpl(boolean z10, boolean z11, MutatorMutex mutatorMutex) {
        this.isPersistent = z11;
        this.mutatorMutex = mutatorMutex;
        this.transition = new MutableTransitionState<>(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        getTransition().setTargetState$animation_core_release(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.TooltipState
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return getTransition().getCurrentState().booleanValue() || getTransition().getTargetState().booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
        InterfaceC11125j interfaceC11125j = this.job;
        if (interfaceC11125j != null) {
            InterfaceC11125j.a.m24737a(interfaceC11125j, null, 1, null);
        }
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new C24372(new TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null), interfaceC11588c);
        return objMutate == AbstractC11725a.m25952f() ? objMutate : C10786q.f26013a;
    }
}
