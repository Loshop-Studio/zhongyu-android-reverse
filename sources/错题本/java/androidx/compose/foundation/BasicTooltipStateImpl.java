package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Stable
@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R+\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m5110d2 = {"Landroidx/compose/foundation/BasicTooltipStateImpl;", "Landroidx/compose/foundation/BasicTooltipState;", "", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "<init>", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "Ld6/s;", "show", "(Landroidx/compose/foundation/MutatePriority;Lh6/c;)Ljava/lang/Object;", "dismiss", "()V", "onDispose", "Z", "()Z", "Landroidx/compose/foundation/MutatorMutex;", "<set-?>", "isVisible$delegate", "Landroidx/compose/runtime/MutableState;", "isVisible", "setVisible", "(Z)V", "Lkotlinx/coroutines/f;", "job", "Lkotlinx/coroutines/f;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,390:1\n85#2:391\n113#2,2:392\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n*L\n286#1:391\n286#1:392,2\n*E\n"})
/* loaded from: classes.dex */
final class BasicTooltipStateImpl implements BasicTooltipState {
    private final boolean isPersistent;

    /* renamed from: isVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isVisible;

    @Nullable
    private InterfaceC5895f job;

    @NotNull
    private final MutatorMutex mutatorMutex;

    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", m5303f = "BasicTooltip.kt", m5304i = {}, m5305l = {310, 312}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.BasicTooltipStateImpl$show$2 */
    public static final class C07462 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $cancellableShow;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", m5303f = "BasicTooltip.kt", m5304i = {}, m5305l = {312}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6471c $cancellableShow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$cancellableShow = interfaceC6471c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.$cancellableShow, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
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
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07462(InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C07462> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.$cancellableShow = interfaceC6471c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return BasicTooltipStateImpl.this.new C07462(this.$cancellableShow, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C07462) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            if (kotlinx.coroutines.AbstractC6014x.m5627G(1500, r6, r5) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1b
                if (r1 == r4) goto Ld
                if (r1 != r3) goto L13
            Ld:
                kotlin.AbstractC5774b.m5119b(r6)     // Catch: java.lang.Throwable -> L11
                goto L44
            L11:
                r6 = move-exception
                goto L4c
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                kotlin.AbstractC5774b.m5119b(r6)
                androidx.compose.foundation.BasicTooltipStateImpl r6 = androidx.compose.foundation.BasicTooltipStateImpl.this     // Catch: java.lang.Throwable -> L11
                boolean r6 = r6.getIsPersistent()     // Catch: java.lang.Throwable -> L11
                if (r6 == 0) goto L31
                r6.c r6 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L11
                r5.label = r4     // Catch: java.lang.Throwable -> L11
                java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L11
                if (r6 != r0) goto L44
                goto L43
            L31:
                androidx.compose.foundation.BasicTooltipStateImpl$show$2$1 r6 = new androidx.compose.foundation.BasicTooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L11
                r6.c r1 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L11
                r4 = 0
                r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L11
                r5.label = r3     // Catch: java.lang.Throwable -> L11
                r3 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r6 = kotlinx.coroutines.AbstractC6014x.m5627G(r3, r6, r5)     // Catch: java.lang.Throwable -> L11
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                androidx.compose.foundation.BasicTooltipStateImpl r6 = androidx.compose.foundation.BasicTooltipStateImpl.this
                r6.setVisible(r2)
                d6.s r6 = p045d6.C5443s.f8405a
                return r6
            L4c:
                androidx.compose.foundation.BasicTooltipStateImpl r0 = androidx.compose.foundation.BasicTooltipStateImpl.this
                r0.setVisible(r2)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipStateImpl.C07462.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BasicTooltipStateImpl(boolean z8, boolean z9, @NotNull MutatorMutex mutatorMutex) {
        this.isPersistent = z9;
        this.mutatorMutex = mutatorMutex;
        this.isVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public void dismiss() {
        setVisible(false);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    /* renamed from: isPersistent, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.BasicTooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public void onDispose() {
        InterfaceC5895f interfaceC5895f = this.job;
        if (interfaceC5895f != null) {
            interfaceC5895f.mo4965i(null);
        }
    }

    public void setVisible(boolean z8) {
        this.isVisible.setValue(Boolean.valueOf(z8));
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    @Nullable
    public Object show(@NotNull MutatePriority mutatePriority, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new C07462(new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), interfaceC5631c);
        return objMutate == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate : C5443s.f8405a;
    }
}
