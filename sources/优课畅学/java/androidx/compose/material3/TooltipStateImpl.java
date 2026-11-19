package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.Stable;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Stable
/* loaded from: classes2.dex */
final class TooltipStateImpl implements TooltipState {
    private final boolean isPersistent;
    private InterfaceC8845j job;
    private final MutatorMutex mutatorMutex;
    private final MutableTransitionState<Boolean> transition;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.TooltipStateImpl$show$2", m17801f = "Tooltip.kt", m17802l = {504, 506}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2 */
    public static final class C24072 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10570l $cancellableShow;
        final /* synthetic */ MutatePriority $mutatePriority;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.material3.TooltipStateImpl$show$2$1", m17801f = "Tooltip.kt", m17802l = {506}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC10570l $cancellableShow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$cancellableShow = interfaceC10570l;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.$cancellableShow, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC10570l interfaceC10570l = this.$cancellableShow;
                    this.label = 1;
                    if (interfaceC10570l.invoke(this) == objM17291f) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24072(InterfaceC10570l interfaceC10570l, MutatePriority mutatePriority, InterfaceC9324c<? super C24072> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$cancellableShow = interfaceC10570l;
            this.$mutatePriority = mutatePriority;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return TooltipStateImpl.this.new C24072(this.$cancellableShow, this.$mutatePriority, interfaceC9324c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            if (kotlinx.coroutines.TimeoutKt.m16326c(1500, r5, r4) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto Le
                if (r1 != r2) goto L14
            Le:
                kotlin.AbstractC9079b.m15926b(r5)     // Catch: java.lang.Throwable -> L12
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
                kotlin.AbstractC9079b.m15926b(r5)
                androidx.compose.material3.TooltipStateImpl r5 = androidx.compose.material3.TooltipStateImpl.this     // Catch: java.lang.Throwable -> L12
                boolean r5 = r5.isPersistent()     // Catch: java.lang.Throwable -> L12
                if (r5 == 0) goto L32
                x7.l r5 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L12
                r4.label = r3     // Catch: java.lang.Throwable -> L12
                java.lang.Object r5 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L12
                if (r5 != r0) goto L45
                goto L44
            L32:
                androidx.compose.material3.TooltipStateImpl$show$2$1 r5 = new androidx.compose.material3.TooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L12
                x7.l r1 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L12
                r3 = 0
                r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L12
                r4.label = r2     // Catch: java.lang.Throwable -> L12
                r1 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r5 = kotlinx.coroutines.TimeoutKt.m16326c(r1, r5, r4)     // Catch: java.lang.Throwable -> L12
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
                h7.p r5 = p123h7.C8736p.f16368a
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipStateImpl.C24072.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C24072) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
        InterfaceC8845j interfaceC8845j = this.job;
        if (interfaceC8845j != null) {
            InterfaceC8845j.a.m14876a(interfaceC8845j, null, 1, null);
        }
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new C24072(new TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null), interfaceC9324c);
        return objMutate == AbstractC9434a.m17291f() ? objMutate : C8736p.f16368a;
    }
}
