package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(m13557d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@¢\u0006\u0002\u0010\u000b\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m13558d2 = {"repeatOnLifecycle", "", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, m13559k = 2, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m13596f = "RepeatOnLifecycle.kt", m13597i = {}, m13598l = {83}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3 */
    public static final class C39253 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m13596f = "RepeatOnLifecycle.kt", m13597i = {0, 0}, m13598l = {161}, m13599m = "invokeSuspend", m13600n = {"launchedJob", "observer"}, m13601s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n318#2,11:161\n1#3:172\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n96#1:161,11\n*E\n"})
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
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
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = coroutineScope;
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    r13 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r13.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 != r3) goto L2f
                    java.lang.Object r0 = r13.L$5
                    kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                    java.lang.Object r0 = r13.L$4
                    kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                    java.lang.Object r0 = r13.L$3
                    androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                    java.lang.Object r0 = r13.L$2
                    androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                    java.lang.Object r0 = r13.L$1
                    r1 = r0
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    java.lang.Object r0 = r13.L$0
                    r4 = r0
                    kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                    kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> L2b
                    goto Laa
                L2b:
                    r0 = move-exception
                    r14 = r0
                    goto Lc1
                L2f:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L37:
                    kotlin.ResultKt.throwOnFailure(r14)
                    androidx.lifecycle.Lifecycle r14 = r13.$this_repeatOnLifecycle
                    androidx.lifecycle.Lifecycle$State r14 = r14.getState()
                    androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                    if (r14 != r1) goto L47
                    kotlin.Unit r14 = kotlin.Unit.INSTANCE
                    return r14
                L47:
                    kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                    r6.<init>()
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    androidx.lifecycle.Lifecycle$State r14 = r13.$state     // Catch: java.lang.Throwable -> La2
                    androidx.lifecycle.Lifecycle r12 = r13.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> La2
                    kotlinx.coroutines.CoroutineScope r7 = r13.$$this$coroutineScope     // Catch: java.lang.Throwable -> La2
                    kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r11 = r13.$block     // Catch: java.lang.Throwable -> La2
                    r13.L$0 = r6     // Catch: java.lang.Throwable -> La2
                    r13.L$1 = r1     // Catch: java.lang.Throwable -> La2
                    r13.L$2 = r14     // Catch: java.lang.Throwable -> La2
                    r13.L$3 = r12     // Catch: java.lang.Throwable -> La2
                    r13.L$4 = r7     // Catch: java.lang.Throwable -> La2
                    r13.L$5 = r11     // Catch: java.lang.Throwable -> La2
                    r13.label = r3     // Catch: java.lang.Throwable -> La2
                    kotlinx.coroutines.CancellableContinuationImpl r9 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> La2
                    kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r13)     // Catch: java.lang.Throwable -> La2
                    r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> La2
                    r9.initCancellability()     // Catch: java.lang.Throwable -> La2
                    androidx.lifecycle.Lifecycle$Event$Companion r4 = androidx.lifecycle.Lifecycle.Event.INSTANCE     // Catch: java.lang.Throwable -> La2
                    androidx.lifecycle.Lifecycle$Event r5 = r4.upTo(r14)     // Catch: java.lang.Throwable -> La2
                    androidx.lifecycle.Lifecycle$Event r8 = r4.downFrom(r14)     // Catch: java.lang.Throwable -> La2
                    r14 = 0
                    kotlinx.coroutines.sync.Mutex r10 = kotlinx.coroutines.sync.MutexKt.Mutex$default(r14, r3, r2)     // Catch: java.lang.Throwable -> La2
                    androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r4 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> La2
                    r4.<init>()     // Catch: java.lang.Throwable -> La2
                    r1.element = r4     // Catch: java.lang.Throwable -> La2
                    java.lang.String r14 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r14)     // Catch: java.lang.Throwable -> La2
                    androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4     // Catch: java.lang.Throwable -> La2
                    r12.addObserver(r4)     // Catch: java.lang.Throwable -> La2
                    java.lang.Object r14 = r9.getResult()     // Catch: java.lang.Throwable -> La2
                    java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> La2
                    if (r14 != r4) goto La6
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r13)     // Catch: java.lang.Throwable -> La2
                    goto La6
                La2:
                    r0 = move-exception
                    r14 = r0
                    r4 = r6
                    goto Lc1
                La6:
                    if (r14 != r0) goto La9
                    return r0
                La9:
                    r4 = r6
                Laa:
                    T r14 = r4.element
                    kotlinx.coroutines.Job r14 = (kotlinx.coroutines.Job) r14
                    if (r14 == 0) goto Lb3
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(r14, r2, r3, r2)
                Lb3:
                    T r14 = r1.element
                    androidx.lifecycle.LifecycleEventObserver r14 = (androidx.lifecycle.LifecycleEventObserver) r14
                    if (r14 == 0) goto Lbe
                    androidx.lifecycle.Lifecycle r0 = r13.$this_repeatOnLifecycle
                    r0.removeObserver(r14)
                Lbe:
                    kotlin.Unit r14 = kotlin.Unit.INSTANCE
                    return r14
                Lc1:
                    T r0 = r4.element
                    kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                    if (r0 == 0) goto Lca
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(r0, r2, r3, r2)
                Lca:
                    T r0 = r1.element
                    androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                    if (r0 == 0) goto Ld5
                    androidx.lifecycle.Lifecycle r1 = r13.$this_repeatOnLifecycle
                    r1.removeObserver(r0)
                Ld5:
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt.C39253.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C39253(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C39253> continuation) {
            super(2, continuation);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C39253 c39253 = new C39253(this.$this_repeatOnLifecycle, this.$state, this.$block, continuation);
            c39253.L$0 = obj;
            return c39253;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, coroutineScope, this.$block, null);
                this.label = 1;
                if (BuildersKt.withContext(immediate, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39253) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C39253(lifecycle, state, function2, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, function2, continuation);
        return objRepeatOnLifecycle == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRepeatOnLifecycle : Unit.INSTANCE;
    }
}
