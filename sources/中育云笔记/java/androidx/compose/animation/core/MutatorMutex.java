package androidx.compose.animation.core;

import androidx.camera.view.AbstractC0979q;
import androidx.compose.runtime.Stable;
import be.AbstractC5194f;
import be.InterfaceC5189a;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public final class MutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final InterfaceC5189a mutex = AbstractC5194f.m2745b(false, 1, null);

    public static final class Mutator {
        private final InterfaceC10045g job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, InterfaceC10045g interfaceC10045g) {
            this.priority = mutatePriority;
            this.job = interfaceC10045g;
        }

        public final boolean canInterrupt(Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            this.job.cancel(new MutationInterruptedException());
        }

        public final InterfaceC10045g getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.MutatorMutex$mutate$2", m26211f = "InternalMutatorMutex.kt", m26212l = {Opcodes.ARETURN, 124}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.MutatorMutex$mutate$2 */
    public static final class C11242 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $block;
        final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11242(MutatePriority mutatePriority, MutatorMutex mutatorMutex, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C11242> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C11242 c11242 = new C11242(this.$priority, this.this$0, this.$block, interfaceC11588c);
            c11242.L$0 = obj;
            return c11242;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [be.a, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC5189a interfaceC5189a;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            InterfaceC9540l interfaceC9540l;
            Throwable th;
            MutatorMutex mutatorMutex2;
            Mutator mutator2;
            InterfaceC5189a interfaceC5189a2;
            Object objM25952f = AbstractC11725a.m25952f();
            ?? r12 = this.label;
            try {
                try {
                    if (r12 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        InterfaceC9945d.b bVar = interfaceC11122i0.getCoroutineContext().get(InterfaceC10045g.f23976b0);
                        AbstractC9979u.m20291d(bVar);
                        Mutator mutator3 = new Mutator(mutatePriority, (InterfaceC10045g) bVar);
                        this.this$0.tryMutateOrCancel(mutator3);
                        interfaceC5189a = this.this$0.mutex;
                        InterfaceC9540l interfaceC9540l2 = this.$block;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = interfaceC5189a;
                        this.L$2 = interfaceC9540l2;
                        this.L$3 = mutatorMutex3;
                        this.label = 1;
                        if (interfaceC5189a.lock(null, this) != objM25952f) {
                            mutator = mutator3;
                            mutatorMutex = mutatorMutex3;
                            interfaceC9540l = interfaceC9540l2;
                        }
                        return objM25952f;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        interfaceC5189a2 = (InterfaceC5189a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            AbstractC9924b.m20071b(obj);
                            AbstractC0979q.m884a(mutatorMutex2.currentMutator, mutator2, null);
                            interfaceC5189a2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC0979q.m884a(mutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    mutatorMutex = (MutatorMutex) this.L$3;
                    interfaceC9540l = (InterfaceC9540l) this.L$2;
                    InterfaceC5189a interfaceC5189a3 = (InterfaceC5189a) this.L$1;
                    mutator = (Mutator) this.L$0;
                    AbstractC9924b.m20071b(obj);
                    interfaceC5189a = interfaceC5189a3;
                    this.L$0 = mutator;
                    this.L$1 = interfaceC5189a;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    Object objInvoke = interfaceC9540l.invoke(this);
                    if (objInvoke != objM25952f) {
                        mutatorMutex2 = mutatorMutex;
                        interfaceC5189a2 = interfaceC5189a;
                        obj = objInvoke;
                        mutator2 = mutator;
                        AbstractC0979q.m884a(mutatorMutex2.currentMutator, mutator2, null);
                        interfaceC5189a2.unlock(null);
                        return obj;
                    }
                    return objM25952f;
                } catch (Throwable th3) {
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    mutator2 = mutator;
                    AbstractC0979q.m884a(mutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.unlock(null);
                throw th4;
            }
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C11242) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", m26211f = "InternalMutatorMutex.kt", m26212l = {Opcodes.ARETURN, Opcodes.IF_ICMPGT}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.MutatorMutex$mutateWith$2 */
    public static final class C11252 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
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
        public C11252(MutatePriority mutatePriority, MutatorMutex mutatorMutex, InterfaceC9544p interfaceC9544p, T t10, InterfaceC11588c<? super C11252> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = interfaceC9544p;
            this.$receiver = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C11252 c11252 = new C11252(this.$priority, this.this$0, this.$block, this.$receiver, interfaceC11588c);
            c11252.L$0 = obj;
            return c11252;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [be.a, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC5189a interfaceC5189a;
            InterfaceC9544p interfaceC9544p;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            Object obj2;
            Throwable th;
            MutatorMutex mutatorMutex2;
            Mutator mutator2;
            InterfaceC5189a interfaceC5189a2;
            Object objM25952f = AbstractC11725a.m25952f();
            ?? r12 = this.label;
            try {
                try {
                    if (r12 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        InterfaceC9945d.b bVar = interfaceC11122i0.getCoroutineContext().get(InterfaceC10045g.f23976b0);
                        AbstractC9979u.m20291d(bVar);
                        Mutator mutator3 = new Mutator(mutatePriority, (InterfaceC10045g) bVar);
                        this.this$0.tryMutateOrCancel(mutator3);
                        interfaceC5189a = this.this$0.mutex;
                        interfaceC9544p = this.$block;
                        Object obj3 = this.$receiver;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = interfaceC5189a;
                        this.L$2 = interfaceC9544p;
                        this.L$3 = obj3;
                        this.L$4 = mutatorMutex3;
                        this.label = 1;
                        if (interfaceC5189a.lock(null, this) != objM25952f) {
                            mutator = mutator3;
                            mutatorMutex = mutatorMutex3;
                            obj2 = obj3;
                        }
                        return objM25952f;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        interfaceC5189a2 = (InterfaceC5189a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            AbstractC9924b.m20071b(obj);
                            AbstractC0979q.m884a(mutatorMutex2.currentMutator, mutator2, null);
                            interfaceC5189a2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC0979q.m884a(mutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    mutatorMutex = (MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    interfaceC9544p = (InterfaceC9544p) this.L$2;
                    InterfaceC5189a interfaceC5189a3 = (InterfaceC5189a) this.L$1;
                    mutator = (Mutator) this.L$0;
                    AbstractC9924b.m20071b(obj);
                    interfaceC5189a = interfaceC5189a3;
                    this.L$0 = mutator;
                    this.L$1 = interfaceC5189a;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    Object objInvoke = interfaceC9544p.invoke(obj2, this);
                    if (objInvoke != objM25952f) {
                        mutatorMutex2 = mutatorMutex;
                        interfaceC5189a2 = interfaceC5189a;
                        obj = objInvoke;
                        mutator2 = mutator;
                        AbstractC0979q.m884a(mutatorMutex2.currentMutator, mutator2, null);
                        interfaceC5189a2.unlock(null);
                        return obj;
                    }
                    return objM25952f;
                } catch (Throwable th3) {
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    mutator2 = mutator;
                    AbstractC0979q.m884a(mutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.unlock(null);
                throw th4;
            }
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C11252) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, interfaceC9540l, interfaceC11588c);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, interfaceC9544p, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!AbstractC0979q.m884a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return AbstractC10006d.m20748e(new C11242(mutatePriority, this, interfaceC9540l, null), interfaceC11588c);
    }

    public final <T, R> Object mutateWith(T t10, MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return AbstractC10006d.m20748e(new C11252(mutatePriority, this, interfaceC9544p, t10, null), interfaceC11588c);
    }
}
