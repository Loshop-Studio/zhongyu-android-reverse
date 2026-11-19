package androidx.compose.material3.internal;

import androidx.camera.view.AbstractC0949q;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Stable
/* loaded from: classes2.dex */
public final class InternalMutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final InterfaceC9942a mutex = AbstractC9943b.m18571b(false, 1, null);

    public static final class Mutator {
        private final InterfaceC9212n job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, InterfaceC9212n interfaceC9212n) {
            this.priority = mutatePriority;
            this.job = interfaceC9212n;
        }

        public final boolean canInterrupt(Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            InterfaceC9212n.a.m16777a(this.job, null, 1, null);
        }

        public final InterfaceC9212n getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", m17801f = "InternalMutatorMutex.kt", m17802l = {TXLiveConstants.RENDER_ROTATION_180, TbsListener.ErrorCode.READ_RESPONSE_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.InternalMutatorMutex$mutate$2 */
    public static final class C24532 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $block;
        final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ InternalMutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24532(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C24532> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$priority = mutatePriority;
            this.this$0 = internalMutatorMutex;
            this.$block = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C24532 c24532 = new C24532(this.$priority, this.this$0, this.$block, interfaceC9324c);
            c24532.L$0 = obj;
            return c24532;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C24532) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, r8.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC9942a interfaceC9942a;
            Mutator mutator;
            InternalMutatorMutex internalMutatorMutex;
            InterfaceC10570l interfaceC10570l;
            Throwable th;
            InternalMutatorMutex internalMutatorMutex2;
            Mutator mutator2;
            InterfaceC9942a interfaceC9942a2;
            Object objM17291f = AbstractC9434a.m17291f();
            ?? r12 = this.label;
            try {
                try {
                    if (r12 == 0) {
                        AbstractC9079b.m15926b(obj);
                        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        InterfaceC9100d.b bVar = interfaceC8822b0.getCoroutineContext().get(InterfaceC9212n.f18095c0);
                        AbstractC9133u.m16130d(bVar);
                        Mutator mutator3 = new Mutator(mutatePriority, (InterfaceC9212n) bVar);
                        this.this$0.tryMutateOrCancel(mutator3);
                        interfaceC9942a = this.this$0.mutex;
                        InterfaceC10570l interfaceC10570l2 = this.$block;
                        InternalMutatorMutex internalMutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = interfaceC9942a;
                        this.L$2 = interfaceC10570l2;
                        this.L$3 = internalMutatorMutex3;
                        this.label = 1;
                        if (interfaceC9942a.lock(null, this) != objM17291f) {
                            mutator = mutator3;
                            internalMutatorMutex = internalMutatorMutex3;
                            interfaceC10570l = interfaceC10570l2;
                        }
                        return objM17291f;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                        interfaceC9942a2 = (InterfaceC9942a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            AbstractC9079b.m15926b(obj);
                            AbstractC0949q.m807a(internalMutatorMutex2.currentMutator, mutator2, null);
                            interfaceC9942a2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC0949q.m807a(internalMutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    internalMutatorMutex = (InternalMutatorMutex) this.L$3;
                    interfaceC10570l = (InterfaceC10570l) this.L$2;
                    InterfaceC9942a interfaceC9942a3 = (InterfaceC9942a) this.L$1;
                    mutator = (Mutator) this.L$0;
                    AbstractC9079b.m15926b(obj);
                    interfaceC9942a = interfaceC9942a3;
                    this.L$0 = mutator;
                    this.L$1 = interfaceC9942a;
                    this.L$2 = internalMutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    Object objInvoke = interfaceC10570l.invoke(this);
                    if (objInvoke != objM17291f) {
                        internalMutatorMutex2 = internalMutatorMutex;
                        interfaceC9942a2 = interfaceC9942a;
                        obj = objInvoke;
                        mutator2 = mutator;
                        AbstractC0949q.m807a(internalMutatorMutex2.currentMutator, mutator2, null);
                        interfaceC9942a2.unlock(null);
                        return obj;
                    }
                    return objM17291f;
                } catch (Throwable th3) {
                    th = th3;
                    internalMutatorMutex2 = internalMutatorMutex;
                    mutator2 = mutator;
                    AbstractC0949q.m807a(internalMutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.unlock(null);
                throw th4;
            }
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2", m17801f = "InternalMutatorMutex.kt", m17802l = {TXLiveConstants.RENDER_ROTATION_180, 142}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2 */
    public static final class C24542 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ MutatePriority $priority;
        final /* synthetic */ T $receiver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ InternalMutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24542(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, InterfaceC10574p interfaceC10574p, T t10, InterfaceC9324c<? super C24542> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$priority = mutatePriority;
            this.this$0 = internalMutatorMutex;
            this.$block = interfaceC10574p;
            this.$receiver = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C24542 c24542 = new C24542(this.$priority, this.this$0, this.$block, this.$receiver, interfaceC9324c);
            c24542.L$0 = obj;
            return c24542;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C24542) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, r8.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC9942a interfaceC9942a;
            InterfaceC10574p interfaceC10574p;
            Mutator mutator;
            InternalMutatorMutex internalMutatorMutex;
            Object obj2;
            Throwable th;
            InternalMutatorMutex internalMutatorMutex2;
            Mutator mutator2;
            InterfaceC9942a interfaceC9942a2;
            Object objM17291f = AbstractC9434a.m17291f();
            ?? r12 = this.label;
            try {
                try {
                    if (r12 == 0) {
                        AbstractC9079b.m15926b(obj);
                        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        InterfaceC9100d.b bVar = interfaceC8822b0.getCoroutineContext().get(InterfaceC9212n.f18095c0);
                        AbstractC9133u.m16130d(bVar);
                        Mutator mutator3 = new Mutator(mutatePriority, (InterfaceC9212n) bVar);
                        this.this$0.tryMutateOrCancel(mutator3);
                        interfaceC9942a = this.this$0.mutex;
                        interfaceC10574p = this.$block;
                        Object obj3 = this.$receiver;
                        InternalMutatorMutex internalMutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = interfaceC9942a;
                        this.L$2 = interfaceC10574p;
                        this.L$3 = obj3;
                        this.L$4 = internalMutatorMutex3;
                        this.label = 1;
                        if (interfaceC9942a.lock(null, this) != objM17291f) {
                            mutator = mutator3;
                            internalMutatorMutex = internalMutatorMutex3;
                            obj2 = obj3;
                        }
                        return objM17291f;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                        interfaceC9942a2 = (InterfaceC9942a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            AbstractC9079b.m15926b(obj);
                            AbstractC0949q.m807a(internalMutatorMutex2.currentMutator, mutator2, null);
                            interfaceC9942a2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC0949q.m807a(internalMutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    internalMutatorMutex = (InternalMutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    interfaceC10574p = (InterfaceC10574p) this.L$2;
                    InterfaceC9942a interfaceC9942a3 = (InterfaceC9942a) this.L$1;
                    mutator = (Mutator) this.L$0;
                    AbstractC9079b.m15926b(obj);
                    interfaceC9942a = interfaceC9942a3;
                    this.L$0 = mutator;
                    this.L$1 = interfaceC9942a;
                    this.L$2 = internalMutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    Object objInvoke = interfaceC10574p.invoke(obj2, this);
                    if (objInvoke != objM17291f) {
                        internalMutatorMutex2 = internalMutatorMutex;
                        interfaceC9942a2 = interfaceC9942a;
                        obj = objInvoke;
                        mutator2 = mutator;
                        AbstractC0949q.m807a(internalMutatorMutex2.currentMutator, mutator2, null);
                        interfaceC9942a2.unlock(null);
                        return obj;
                    }
                    return objM17291f;
                } catch (Throwable th3) {
                    th = th3;
                    internalMutatorMutex2 = internalMutatorMutex;
                    mutator2 = mutator;
                    AbstractC0949q.m807a(internalMutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.unlock(null);
                throw th4;
            }
        }
    }

    public static /* synthetic */ Object mutate$default(InternalMutatorMutex internalMutatorMutex, MutatePriority mutatePriority, InterfaceC10570l interfaceC10570l, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutate(mutatePriority, interfaceC10570l, interfaceC9324c);
    }

    public static /* synthetic */ Object mutateWith$default(InternalMutatorMutex internalMutatorMutex, Object obj, MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutateWith(obj, mutatePriority, interfaceC10574p, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!AbstractC0949q.m807a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return AbstractC9165e.m16556e(new C24532(mutatePriority, this, interfaceC10570l, null), interfaceC9324c);
    }

    public final <T, R> Object mutateWith(T t10, MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return AbstractC9165e.m16556e(new C24542(mutatePriority, this, interfaceC10574p, t10, null), interfaceC9324c);
    }

    public final boolean tryMutate(InterfaceC10559a interfaceC10559a) {
        boolean zM18568b = InterfaceC9942a.a.m18568b(this.mutex, null, 1, null);
        if (!zM18568b) {
            return zM18568b;
        }
        try {
            interfaceC10559a.invoke();
            return zM18568b;
        } finally {
            InterfaceC9942a.a.m18569c(this.mutex, null, 1, null);
        }
    }
}
