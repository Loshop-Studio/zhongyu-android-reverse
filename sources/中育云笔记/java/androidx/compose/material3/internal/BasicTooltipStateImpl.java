package androidx.compose.material3.internal;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.alibaba.fastjson.asm.Opcodes;
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
final class BasicTooltipStateImpl implements TooltipState {
    private final boolean isPersistent;
    private final MutableState isVisible$delegate;
    private InterfaceC11125j job;
    private final MutatorMutex mutatorMutex;
    private final MutableTransitionState<Boolean> transition = new MutableTransitionState<>(Boolean.FALSE);

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$2", m26211f = "BasicTooltip.kt", m26212l = {152, Opcodes.IFNE}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltipStateImpl$show$2 */
    public static final class C24702 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $cancellableShow;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1", m26211f = "BasicTooltip.kt", m26212l = {Opcodes.IFNE}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
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
        public C24702(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C24702> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.$cancellableShow = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return BasicTooltipStateImpl.this.new C24702(this.$cancellableShow, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            if (kotlinx.coroutines.TimeoutKt.m20487c(1500, r6, r5) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r5.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto Lf
                if (r1 != r3) goto L15
            Lf:
                kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Throwable -> L13
                goto L46
            L13:
                r6 = move-exception
                goto L4e
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.AbstractC9924b.m20071b(r6)
                androidx.compose.material3.internal.BasicTooltipStateImpl r6 = androidx.compose.material3.internal.BasicTooltipStateImpl.this     // Catch: java.lang.Throwable -> L13
                boolean r6 = r6.isPersistent()     // Catch: java.lang.Throwable -> L13
                if (r6 == 0) goto L33
                hd.l r6 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L13
                r5.label = r4     // Catch: java.lang.Throwable -> L13
                java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L13
                if (r6 != r0) goto L46
                goto L45
            L33:
                androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1 r6 = new androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L13
                hd.l r1 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L13
                r4 = 0
                r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L13
                r5.label = r3     // Catch: java.lang.Throwable -> L13
                r3 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r6 = kotlinx.coroutines.TimeoutKt.m20487c(r3, r6, r5)     // Catch: java.lang.Throwable -> L13
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                androidx.compose.material3.internal.BasicTooltipStateImpl r6 = androidx.compose.material3.internal.BasicTooltipStateImpl.this
                r6.setVisible(r2)
                qc.q r6 = p309qc.C10786q.f26013a
                return r6
            L4e:
                androidx.compose.material3.internal.BasicTooltipStateImpl r0 = androidx.compose.material3.internal.BasicTooltipStateImpl.this
                r0.setVisible(r2)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipStateImpl.C24702.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C24702) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public BasicTooltipStateImpl(boolean z10, boolean z11, MutatorMutex mutatorMutex) {
        this.isPersistent = z11;
        this.mutatorMutex = mutatorMutex;
        this.isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z10), null, 2, null);
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        setVisible(false);
    }

    @Override // androidx.compose.material3.TooltipState
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
        InterfaceC11125j interfaceC11125j = this.job;
        if (interfaceC11125j != null) {
            InterfaceC11125j.a.m24737a(interfaceC11125j, null, 1, null);
        }
    }

    public void setVisible(boolean z10) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new C24702(new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), interfaceC11588c);
        return objMutate == AbstractC11725a.m25952f() ? objMutate : C10786q.f26013a;
    }
}
