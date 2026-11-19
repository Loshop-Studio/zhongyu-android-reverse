package android.view;

import android.view.Lifecycle;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p046d7.C5447d;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\n\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, m5110d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/v;", "Lh6/c;", "Ld6/s;", "", "Lkotlin/ExtensionFunctionType;", "block", "repeatOnLifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lr6/e;Lh6/c;)Ljava/lang/Object;", "lifecycle-runtime_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class RepeatOnLifecycleKt {

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m5303f = "RepeatOnLifecycle.kt", m5304i = {}, m5305l = {83}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3 */
    public static final class C27353 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
        @DebugMetadata(m5302c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m5303f = "RepeatOnLifecycle.kt", m5304i = {0, 0}, m5305l = {161}, m5306m = "invokeSuspend", m5307n = {"launchedJob", "observer"}, m5308s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n318#2,11:161\n1#3:172\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n96#1:161,11\n*E\n"})
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
            final /* synthetic */ InterfaceC6473e $block;
            final /* synthetic */ Lifecycle.State $state;
            final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC6009v interfaceC6009v, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = interfaceC6009v;
                this.$block = interfaceC6473e;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC5631c);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r5v1, types: [T, androidx.lifecycle.LifecycleObserver, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
                /*
                    r14 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r14.label
                    r2 = 0
                    d6.s r3 = p045d6.C5443s.f8405a
                    r4 = 1
                    if (r1 == 0) goto L36
                    if (r1 != r4) goto L2e
                    java.lang.Object r0 = r14.L$5
                    r6.e r0 = (p152r6.InterfaceC6473e) r0
                    java.lang.Object r0 = r14.L$4
                    kotlinx.coroutines.v r0 = (kotlinx.coroutines.InterfaceC6009v) r0
                    java.lang.Object r0 = r14.L$3
                    androidx.lifecycle.Lifecycle r0 = (android.view.Lifecycle) r0
                    java.lang.Object r0 = r14.L$2
                    androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                    java.lang.Object r0 = r14.L$1
                    r1 = r0
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    java.lang.Object r0 = r14.L$0
                    r4 = r0
                    kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
                    kotlin.AbstractC5774b.m5119b(r15)     // Catch: java.lang.Throwable -> L2a
                    goto L91
                L2a:
                    r0 = move-exception
                    r15 = r0
                    goto La9
                L2e:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L36:
                    kotlin.AbstractC5774b.m5119b(r15)
                    androidx.lifecycle.Lifecycle r15 = r14.$this_repeatOnLifecycle
                    androidx.lifecycle.Lifecycle$State r15 = r15.getState()
                    androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                    if (r15 != r1) goto L44
                    goto La5
                L44:
                    kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
                    r7.<init>()
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    androidx.lifecycle.Lifecycle$State r15 = r14.$state     // Catch: java.lang.Throwable -> La6
                    androidx.lifecycle.Lifecycle r13 = r14.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> La6
                    kotlinx.coroutines.v r8 = r14.$$this$coroutineScope     // Catch: java.lang.Throwable -> La6
                    r6.e r12 = r14.$block     // Catch: java.lang.Throwable -> La6
                    r14.L$0 = r7     // Catch: java.lang.Throwable -> La6
                    r14.L$1 = r1     // Catch: java.lang.Throwable -> La6
                    r14.L$2 = r15     // Catch: java.lang.Throwable -> La6
                    r14.L$3 = r13     // Catch: java.lang.Throwable -> La6
                    r14.L$4 = r8     // Catch: java.lang.Throwable -> La6
                    r14.L$5 = r12     // Catch: java.lang.Throwable -> La6
                    r14.label = r4     // Catch: java.lang.Throwable -> La6
                    kotlinx.coroutines.g r10 = new kotlinx.coroutines.g     // Catch: java.lang.Throwable -> La6
                    h6.c r5 = p185v7.AbstractC6683l.m6374n(r14)     // Catch: java.lang.Throwable -> La6
                    r10.<init>(r4, r5)     // Catch: java.lang.Throwable -> La6
                    r10.m5584u()     // Catch: java.lang.Throwable -> La6
                    androidx.lifecycle.Lifecycle$Event$Companion r4 = androidx.lifecycle.Lifecycle.Event.INSTANCE     // Catch: java.lang.Throwable -> La6
                    androidx.lifecycle.Lifecycle$Event r6 = r4.upTo(r15)     // Catch: java.lang.Throwable -> La6
                    androidx.lifecycle.Lifecycle$Event r9 = r4.downFrom(r15)     // Catch: java.lang.Throwable -> La6
                    kotlinx.coroutines.sync.a r11 = new kotlinx.coroutines.sync.a     // Catch: java.lang.Throwable -> La6
                    r11.<init>()     // Catch: java.lang.Throwable -> La6
                    androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r5 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> La6
                    r5.<init>()     // Catch: java.lang.Throwable -> La6
                    r1.element = r5     // Catch: java.lang.Throwable -> La6
                    r13.addObserver(r5)     // Catch: java.lang.Throwable -> La6
                    java.lang.Object r15 = r10.m5583t()     // Catch: java.lang.Throwable -> La6
                    if (r15 != r0) goto L90
                    return r0
                L90:
                    r4 = r7
                L91:
                    T r15 = r4.element
                    kotlinx.coroutines.w0 r15 = (kotlinx.coroutines.InterfaceC6013w0) r15
                    if (r15 == 0) goto L9a
                    r15.cancel(r2)
                L9a:
                    T r15 = r1.element
                    androidx.lifecycle.LifecycleEventObserver r15 = (android.view.LifecycleEventObserver) r15
                    if (r15 == 0) goto La5
                    androidx.lifecycle.Lifecycle r0 = r14.$this_repeatOnLifecycle
                    r0.removeObserver(r15)
                La5:
                    return r3
                La6:
                    r0 = move-exception
                    r15 = r0
                    r4 = r7
                La9:
                    T r0 = r4.element
                    kotlinx.coroutines.w0 r0 = (kotlinx.coroutines.InterfaceC6013w0) r0
                    if (r0 == 0) goto Lb2
                    r0.cancel(r2)
                Lb2:
                    T r0 = r1.element
                    androidx.lifecycle.LifecycleEventObserver r0 = (android.view.LifecycleEventObserver) r0
                    if (r0 == 0) goto Lbd
                    androidx.lifecycle.Lifecycle r1 = r14.$this_repeatOnLifecycle
                    r1.removeObserver(r0)
                Lbd:
                    throw r15
                */
                throw new UnsupportedOperationException("Method not decompiled: android.view.RepeatOnLifecycleKt.C27353.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27353(Lifecycle lifecycle, Lifecycle.State state, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C27353> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = interfaceC6473e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C27353 c27353 = new C27353(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC5631c);
            c27353.L$0 = obj;
            return c27353;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                C5609e c5609e = AbstractC5896f0.f9343a;
                C5447d c5447d = AbstractC5479k.f8471a.f8411d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, interfaceC6009v, this.$block, null);
                this.label = 1;
                if (AbstractC6014x.m5626F(c5447d, anonymousClass1, this) == coroutineSingletons) {
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
            return ((C27353) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Nullable
    public static final Object repeatOnLifecycle(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h;
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        Lifecycle.State state2 = lifecycle.getState();
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        C5443s c5443s = C5443s.f8405a;
        return (state2 != state3 && (objM5637h = AbstractC6014x.m5637h(new C27353(lifecycle, state, interfaceC6473e, null), interfaceC5631c)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM5637h : c5443s;
    }

    @Nullable
    public static final Object repeatOnLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, interfaceC6473e, interfaceC5631c);
        return objRepeatOnLifecycle == CoroutineSingletons.COROUTINE_SUSPENDED ? objRepeatOnLifecycle : C5443s.f8405a;
    }
}
