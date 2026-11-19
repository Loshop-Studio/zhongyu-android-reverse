package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
/* loaded from: classes.dex */
final class BasicTooltipStateImpl implements BasicTooltipState {
    private final boolean isPersistent;
    private final MutableState isVisible$delegate;
    private InterfaceC8845j job;
    private final MutatorMutex mutatorMutex;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", m17801f = "BasicTooltip.kt", m17802l = {310, 312}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BasicTooltipStateImpl$show$2 */
    public static final class C11552 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10570l $cancellableShow;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", m17801f = "BasicTooltip.kt", m17802l = {312}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
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
        public C11552(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C11552> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$cancellableShow = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return BasicTooltipStateImpl.this.new C11552(this.$cancellableShow, interfaceC9324c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            if (kotlinx.coroutines.TimeoutKt.m16326c(1500, r6, r5) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r5.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto Lf
                if (r1 != r3) goto L15
            Lf:
                kotlin.AbstractC9079b.m15926b(r6)     // Catch: java.lang.Throwable -> L13
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
                kotlin.AbstractC9079b.m15926b(r6)
                androidx.compose.foundation.BasicTooltipStateImpl r6 = androidx.compose.foundation.BasicTooltipStateImpl.this     // Catch: java.lang.Throwable -> L13
                boolean r6 = r6.isPersistent()     // Catch: java.lang.Throwable -> L13
                if (r6 == 0) goto L33
                x7.l r6 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L13
                r5.label = r4     // Catch: java.lang.Throwable -> L13
                java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L13
                if (r6 != r0) goto L46
                goto L45
            L33:
                androidx.compose.foundation.BasicTooltipStateImpl$show$2$1 r6 = new androidx.compose.foundation.BasicTooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L13
                x7.l r1 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L13
                r4 = 0
                r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L13
                r5.label = r3     // Catch: java.lang.Throwable -> L13
                r3 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r6 = kotlinx.coroutines.TimeoutKt.m16326c(r3, r6, r5)     // Catch: java.lang.Throwable -> L13
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                androidx.compose.foundation.BasicTooltipStateImpl r6 = androidx.compose.foundation.BasicTooltipStateImpl.this
                r6.setVisible(r2)
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            L4e:
                androidx.compose.foundation.BasicTooltipStateImpl r0 = androidx.compose.foundation.BasicTooltipStateImpl.this
                r0.setVisible(r2)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipStateImpl.C11552.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C11552) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public BasicTooltipStateImpl(boolean z10, boolean z11, MutatorMutex mutatorMutex) {
        this.isPersistent = z11;
        this.mutatorMutex = mutatorMutex;
        this.isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z10), null, 2, null);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public void dismiss() {
        setVisible(false);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.BasicTooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public void onDispose() {
        InterfaceC8845j interfaceC8845j = this.job;
        if (interfaceC8845j != null) {
            InterfaceC8845j.a.m14876a(interfaceC8845j, null, 1, null);
        }
    }

    public void setVisible(boolean z10) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public Object show(MutatePriority mutatePriority, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new C11552(new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), interfaceC9324c);
        return objMutate == AbstractC9434a.m17291f() ? objMutate : C8736p.f16368a;
    }
}
