package androidx.compose.animation.core;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C6010v0;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.sync.C6001a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5634f;
import p076h7.InterfaceC5638a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Stable
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0017j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/animation/core/MutatorMutex;", "", "<init>", "()V", "Landroidx/compose/animation/core/MutatorMutex$Mutator;", "mutator", "Ld6/s;", "tryMutateOrCancel", "(Landroidx/compose/animation/core/MutatorMutex$Mutator;)V", "R", "Landroidx/compose/animation/core/MutatePriority;", "priority", "Lkotlin/Function1;", "Lh6/c;", "block", "mutate", "(Landroidx/compose/animation/core/MutatePriority;Lr6/c;Lh6/c;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/animation/core/MutatePriority;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", "currentMutator", "Ljava/util/concurrent/atomic/AtomicReference;", "Lh7/a;", "mutex", "Lh7/a;", "Mutator", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MutatorMutex {
    public static final int $stable = 0;

    @NotNull
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);

    @NotNull
    private final InterfaceC5638a mutex = new C6001a();

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m5110d2 = {"Landroidx/compose/animation/core/MutatorMutex$Mutator;", "", "Landroidx/compose/animation/core/MutatePriority;", "priority", "Lkotlinx/coroutines/w0;", "job", "<init>", "(Landroidx/compose/animation/core/MutatePriority;Lkotlinx/coroutines/w0;)V", "other", "", "canInterrupt", "(Landroidx/compose/animation/core/MutatorMutex$Mutator;)Z", "Ld6/s;", "cancel", "()V", "Landroidx/compose/animation/core/MutatePriority;", "getPriority", "()Landroidx/compose/animation/core/MutatePriority;", "Lkotlinx/coroutines/w0;", "getJob", "()Lkotlinx/coroutines/w0;", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Mutator {

        @NotNull
        private final InterfaceC6013w0 job;

        @NotNull
        private final MutatePriority priority;

        public Mutator(@NotNull MutatePriority mutatePriority, @NotNull InterfaceC6013w0 interfaceC6013w0) {
            this.priority = mutatePriority;
            this.job = interfaceC6013w0;
        }

        public final boolean canInterrupt(@NotNull Mutator other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void cancel() {
            this.job.cancel(new MutationInterruptedException());
        }

        @NotNull
        public final InterfaceC6013w0 getJob() {
            return this.job;
        }

        @NotNull
        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    @Metadata(m5109d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m5110d2 = {"R", "Lkotlinx/coroutines/v;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.core.MutatorMutex$mutate$2", m5303f = "InternalMutatorMutex.kt", m5304i = {0, 0, 1, 1}, m5305l = {176, 124}, m5306m = "invokeSuspend", m5307n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m5308s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,170:1\n120#2,10:171\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n*L\n122#1:171,10\n*E\n"})
    /* renamed from: androidx.compose.animation.core.MutatorMutex$mutate$2 */
    public static final class C06912 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6471c $block;
        final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06912(MutatePriority mutatePriority, MutatorMutex mutatorMutex, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C06912> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = interfaceC6471c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C06912 c06912 = new C06912(this.$priority, this.this$0, this.$block, interfaceC5631c);
            c06912.L$0 = obj;
            return c06912;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r5v3, types: [h7.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C6001a c6001a;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            InterfaceC6471c interfaceC6471c;
            Throwable th;
            MutatorMutex mutatorMutex2;
            Mutator mutator2;
            InterfaceC5638a interfaceC5638a;
            AtomicReference atomicReference;
            AtomicReference atomicReference2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        InterfaceC5634f interfaceC5634f = interfaceC6009v.getCoroutineContext().get(C6010v0.f9513a);
                        AbstractC5830k.m5327d(interfaceC5634f);
                        Mutator mutator3 = new Mutator(mutatePriority, (InterfaceC6013w0) interfaceC5634f);
                        this.this$0.tryMutateOrCancel(mutator3);
                        InterfaceC5638a interfaceC5638a2 = this.this$0.mutex;
                        InterfaceC6471c interfaceC6471c2 = this.$block;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = interfaceC5638a2;
                        this.L$2 = interfaceC6471c2;
                        this.L$3 = mutatorMutex3;
                        this.label = 1;
                        c6001a = (C6001a) interfaceC5638a2;
                        if (c6001a.m5615e(this) != coroutineSingletons) {
                            mutator = mutator3;
                            mutatorMutex = mutatorMutex3;
                            interfaceC6471c = interfaceC6471c2;
                        }
                        return coroutineSingletons;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        interfaceC5638a = (InterfaceC5638a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            AbstractC5774b.m5119b(obj);
                            atomicReference2 = mutatorMutex2.currentMutator;
                            while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                            }
                            ((C6001a) interfaceC5638a).m5617g(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = mutatorMutex2.currentMutator;
                            while (!atomicReference.compareAndSet(mutator2, null) && atomicReference.get() == mutator2) {
                            }
                            throw th;
                        }
                    }
                    mutatorMutex = (MutatorMutex) this.L$3;
                    interfaceC6471c = (InterfaceC6471c) this.L$2;
                    ?? r52 = (InterfaceC5638a) this.L$1;
                    mutator = (Mutator) this.L$0;
                    AbstractC5774b.m5119b(obj);
                    c6001a = r52;
                    this.L$0 = mutator;
                    this.L$1 = c6001a;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    Object objInvoke = interfaceC6471c.invoke(this);
                    if (objInvoke != coroutineSingletons) {
                        mutatorMutex2 = mutatorMutex;
                        interfaceC5638a = c6001a;
                        obj = objInvoke;
                        mutator2 = mutator;
                        atomicReference2 = mutatorMutex2.currentMutator;
                        while (!atomicReference2.compareAndSet(mutator2, null)) {
                        }
                        ((C6001a) interfaceC5638a).m5617g(null);
                        return obj;
                    }
                    return coroutineSingletons;
                } catch (Throwable th3) {
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    mutator2 = mutator;
                    atomicReference = mutatorMutex2.currentMutator;
                    while (!atomicReference.compareAndSet(mutator2, null)) {
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                ((C6001a) r1).m5617g(null);
                throw th4;
            }
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super R> interfaceC5631c) {
            return ((C06912) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/v;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", m5303f = "InternalMutatorMutex.kt", m5304i = {0, 0, 1, 1}, m5305l = {176, 163}, m5306m = "invokeSuspend", m5307n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m5308s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,170:1\n120#2,10:171\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n*L\n161#1:171,10\n*E\n"})
    /* renamed from: androidx.compose.animation.core.MutatorMutex$mutateWith$2 */
    public static final class C06922 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $block;
        final /* synthetic */ MutatePriority $priority;
        final /* synthetic */ T $receiver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06922(MutatePriority mutatePriority, MutatorMutex mutatorMutex, InterfaceC6473e interfaceC6473e, T t8, InterfaceC5631c<? super C06922> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = interfaceC6473e;
            this.$receiver = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C06922 c06922 = new C06922(this.$priority, this.this$0, this.$block, this.$receiver, interfaceC5631c);
            c06922.L$0 = obj;
            return c06922;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r6v3, types: [h7.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC6473e interfaceC6473e;
            C6001a c6001a;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            Object obj2;
            Throwable th;
            MutatorMutex mutatorMutex2;
            Mutator mutator2;
            InterfaceC5638a interfaceC5638a;
            AtomicReference atomicReference;
            AtomicReference atomicReference2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        InterfaceC5634f interfaceC5634f = interfaceC6009v.getCoroutineContext().get(C6010v0.f9513a);
                        AbstractC5830k.m5327d(interfaceC5634f);
                        Mutator mutator3 = new Mutator(mutatePriority, (InterfaceC6013w0) interfaceC5634f);
                        this.this$0.tryMutateOrCancel(mutator3);
                        InterfaceC5638a interfaceC5638a2 = this.this$0.mutex;
                        interfaceC6473e = this.$block;
                        Object obj3 = this.$receiver;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = interfaceC5638a2;
                        this.L$2 = interfaceC6473e;
                        this.L$3 = obj3;
                        this.L$4 = mutatorMutex3;
                        this.label = 1;
                        c6001a = (C6001a) interfaceC5638a2;
                        if (c6001a.m5615e(this) != coroutineSingletons) {
                            mutator = mutator3;
                            mutatorMutex = mutatorMutex3;
                            obj2 = obj3;
                        }
                        return coroutineSingletons;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        interfaceC5638a = (InterfaceC5638a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            AbstractC5774b.m5119b(obj);
                            atomicReference2 = mutatorMutex2.currentMutator;
                            while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                            }
                            ((C6001a) interfaceC5638a).m5617g(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = mutatorMutex2.currentMutator;
                            while (!atomicReference.compareAndSet(mutator2, null)) {
                            }
                            throw th;
                        }
                    }
                    mutatorMutex = (MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    interfaceC6473e = (InterfaceC6473e) this.L$2;
                    ?? r62 = (InterfaceC5638a) this.L$1;
                    mutator = (Mutator) this.L$0;
                    AbstractC5774b.m5119b(obj);
                    c6001a = r62;
                    this.L$0 = mutator;
                    this.L$1 = c6001a;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    Object objInvoke = interfaceC6473e.invoke(obj2, this);
                    if (objInvoke != coroutineSingletons) {
                        mutatorMutex2 = mutatorMutex;
                        interfaceC5638a = c6001a;
                        obj = objInvoke;
                        mutator2 = mutator;
                        atomicReference2 = mutatorMutex2.currentMutator;
                        while (!atomicReference2.compareAndSet(mutator2, null)) {
                        }
                        ((C6001a) interfaceC5638a).m5617g(null);
                        return obj;
                    }
                    return coroutineSingletons;
                } catch (Throwable th3) {
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    mutator2 = mutator;
                    atomicReference = mutatorMutex2.currentMutator;
                    while (!atomicReference.compareAndSet(mutator2, null) && atomicReference.get() == mutator2) {
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                ((C6001a) r1).m5617g(null);
                throw th4;
            }
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super R> interfaceC5631c) {
            return ((C06922) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, InterfaceC6471c interfaceC6471c, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, interfaceC6471c, interfaceC5631c);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, interfaceC6473e, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        while (true) {
            Mutator mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            AtomicReference<Mutator> atomicReference = this.currentMutator;
            while (!atomicReference.compareAndSet(mutator2, mutator)) {
                if (atomicReference.get() != mutator2) {
                    break;
                }
            }
            if (mutator2 != null) {
                mutator2.cancel();
                return;
            }
            return;
        }
    }

    @Nullable
    public final <R> Object mutate(@NotNull MutatePriority mutatePriority, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        return AbstractC6014x.m5637h(new C06912(mutatePriority, this, interfaceC6471c, null), interfaceC5631c);
    }

    @Nullable
    public final <T, R> Object mutateWith(T t8, @NotNull MutatePriority mutatePriority, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        return AbstractC6014x.m5637h(new C06922(mutatePriority, this, interfaceC6473e, t8, null), interfaceC5631c);
    }
}
