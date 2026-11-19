package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import be.AbstractC5194f;
import be.InterfaceC5189a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class SingleRunner {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_PRIORITY = 0;
    private final Holder holder;

    public static final class CancelIsolatedRunnerException extends CancellationException {
        private final SingleRunner runner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelIsolatedRunnerException(SingleRunner runner) {
            super("Cancelled isolated runner");
            AbstractC9979u.m20294g(runner, "runner");
            this.runner = runner;
        }

        public final SingleRunner getRunner() {
            return this.runner;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Holder {
        private final boolean cancelPreviousInEqualPriority;
        private final InterfaceC5189a mutex;
        private InterfaceC10045g previous;
        private int previousPriority;
        private final SingleRunner singleRunner;

        public Holder(SingleRunner singleRunner, boolean z10) {
            AbstractC9979u.m20294g(singleRunner, "singleRunner");
            this.singleRunner = singleRunner;
            this.cancelPreviousInEqualPriority = z10;
            this.mutex = AbstractC5194f.m2745b(false, 1, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object onFinish(kotlinx.coroutines.InterfaceC10045g r6, vc.InterfaceC11588c<? super p309qc.C10786q> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.SingleRunner$Holder$onFinish$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = (androidx.paging.SingleRunner$Holder$onFinish$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = new androidx.paging.SingleRunner$Holder$onFinish$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r6 = r0.L$1
                be.a r6 = (be.InterfaceC5189a) r6
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.g r0 = (kotlinx.coroutines.InterfaceC10045g) r0
                kotlin.AbstractC9924b.m20071b(r7)
                r7 = r6
                r6 = r0
                goto L4e
            L34:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3c:
                kotlin.AbstractC9924b.m20071b(r7)
                be.a r7 = r5.mutex
                r0.L$0 = r6
                r0.L$1 = r7
                r0.label = r3
                java.lang.Object r0 = r7.lock(r4, r0)
                if (r0 != r1) goto L4e
                return r1
            L4e:
                kotlinx.coroutines.g r0 = r5.previous     // Catch: java.lang.Throwable -> L55
                if (r6 != r0) goto L57
                r5.previous = r4     // Catch: java.lang.Throwable -> L55
                goto L57
            L55:
                r6 = move-exception
                goto L5f
            L57:
                qc.q r6 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L55
                r7.unlock(r4)
                qc.q r6 = p309qc.C10786q.f26013a
                return r6
            L5f:
                r7.unlock(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.onFinish(kotlinx.coroutines.g, vc.c):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlinx.coroutines.g] */
        /* JADX WARN: Type inference failed for: r10v1, types: [be.a] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v4, types: [be.a] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object tryEnqueue(int r9, kotlinx.coroutines.InterfaceC10045g r10, vc.InterfaceC11588c<? super java.lang.Boolean> r11) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r11 instanceof androidx.paging.SingleRunner$Holder$tryEnqueue$1
                if (r0 == 0) goto L13
                r0 = r11
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = (androidx.paging.SingleRunner$Holder$tryEnqueue$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = new androidx.paging.SingleRunner$Holder$tryEnqueue$1
                r0.<init>(r8, r11)
            L18:
                java.lang.Object r11 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L50
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                int r9 = r0.I$0
                java.lang.Object r10 = r0.L$1
                be.a r10 = (be.InterfaceC5189a) r10
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.g r0 = (kotlinx.coroutines.InterfaceC10045g) r0
                kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.lang.Throwable -> L37
                goto L9b
            L37:
                r9 = move-exception
                goto La8
            L3a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L42:
                int r9 = r0.I$0
                java.lang.Object r10 = r0.L$1
                be.a r10 = (be.InterfaceC5189a) r10
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.g r2 = (kotlinx.coroutines.InterfaceC10045g) r2
                kotlin.AbstractC9924b.m20071b(r11)
                goto L66
            L50:
                kotlin.AbstractC9924b.m20071b(r11)
                be.a r11 = r8.mutex
                r0.L$0 = r10
                r0.L$1 = r11
                r0.I$0 = r9
                r0.label = r4
                java.lang.Object r2 = r11.lock(r5, r0)
                if (r2 != r1) goto L64
                goto L99
            L64:
                r2 = r10
                r10 = r11
            L66:
                kotlinx.coroutines.g r11 = r8.previous     // Catch: java.lang.Throwable -> L37
                if (r11 == 0) goto L7d
                boolean r6 = r11.isActive()     // Catch: java.lang.Throwable -> L37
                if (r6 == 0) goto L7d
                int r6 = r8.previousPriority     // Catch: java.lang.Throwable -> L37
                if (r6 < r9) goto L7d
                if (r6 != r9) goto L7b
                boolean r6 = r8.cancelPreviousInEqualPriority     // Catch: java.lang.Throwable -> L37
                if (r6 == 0) goto L7b
                goto L7d
            L7b:
                r4 = 0
                goto La0
            L7d:
                if (r11 == 0) goto L89
                androidx.paging.SingleRunner$CancelIsolatedRunnerException r6 = new androidx.paging.SingleRunner$CancelIsolatedRunnerException     // Catch: java.lang.Throwable -> L37
                androidx.paging.SingleRunner r7 = r8.singleRunner     // Catch: java.lang.Throwable -> L37
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L37
                r11.cancel(r6)     // Catch: java.lang.Throwable -> L37
            L89:
                if (r11 == 0) goto L9c
                r0.L$0 = r2     // Catch: java.lang.Throwable -> L37
                r0.L$1 = r10     // Catch: java.lang.Throwable -> L37
                r0.I$0 = r9     // Catch: java.lang.Throwable -> L37
                r0.label = r3     // Catch: java.lang.Throwable -> L37
                java.lang.Object r11 = r11.mo20458v(r0)     // Catch: java.lang.Throwable -> L37
                if (r11 != r1) goto L9a
            L99:
                return r1
            L9a:
                r0 = r2
            L9b:
                r2 = r0
            L9c:
                r8.previous = r2     // Catch: java.lang.Throwable -> L37
                r8.previousPriority = r9     // Catch: java.lang.Throwable -> L37
            La0:
                java.lang.Boolean r9 = p409xc.AbstractC11826a.m26206a(r4)     // Catch: java.lang.Throwable -> L37
                r10.unlock(r5)
                return r9
            La8:
                r10.unlock(r5)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.tryEnqueue(int, kotlinx.coroutines.g, vc.c):java.lang.Object");
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.SingleRunner", m26211f = "SingleRunner.kt", m26212l = {43}, m26213m = "runInIsolation", m26214v = 1)
    /* renamed from: androidx.paging.SingleRunner$runInIsolation$1 */
    public static final class C42921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C42921(InterfaceC11588c<? super C42921> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleRunner.this.runInIsolation(0, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.SingleRunner$runInIsolation$2", m26211f = "SingleRunner.kt", m26212l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, 51, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.SingleRunner$runInIsolation$2 */
    public static final class C42932 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $block;
        final /* synthetic */ int $priority;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42932(int i10, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C42932> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$priority = i10;
            this.$block = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42932 c42932 = SingleRunner.this.new C42932(this.$priority, this.$block, interfaceC11588c);
            c42932.L$0 = obj;
            return c42932;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        
            if (r9.onFinish(r1, r8) != r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.g] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.g] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.SingleRunner$Holder] */
        /* JADX WARN: Type inference failed for: r9v15, types: [androidx.paging.SingleRunner$Holder] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r8.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3c
                if (r1 == r5) goto L34
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L25
                if (r1 == r2) goto L1c
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                java.lang.Object r0 = r8.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.AbstractC9924b.m20071b(r9)
                goto La0
            L25:
                kotlin.AbstractC9924b.m20071b(r9)
                goto La1
            L2a:
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.g r1 = (kotlinx.coroutines.InterfaceC10045g) r1
                kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Throwable -> L32
                goto L7c
            L32:
                r9 = move-exception
                goto L8e
            L34:
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.g r1 = (kotlinx.coroutines.InterfaceC10045g) r1
                kotlin.AbstractC9924b.m20071b(r9)
                goto L67
            L3c:
                kotlin.AbstractC9924b.m20071b(r9)
                java.lang.Object r9 = r8.L$0
                sd.i0 r9 = (sd.InterfaceC11122i0) r9
                kotlin.coroutines.d r9 = r9.getCoroutineContext()
                kotlinx.coroutines.g$b r1 = kotlinx.coroutines.InterfaceC10045g.f23976b0
                kotlin.coroutines.d$b r9 = r9.get(r1)
                if (r9 == 0) goto La4
                kotlinx.coroutines.g r9 = (kotlinx.coroutines.InterfaceC10045g) r9
                androidx.paging.SingleRunner r1 = androidx.paging.SingleRunner.this
                androidx.paging.SingleRunner$Holder r1 = androidx.paging.SingleRunner.access$getHolder$p(r1)
                int r6 = r8.$priority
                r8.L$0 = r9
                r8.label = r5
                java.lang.Object r1 = r1.tryEnqueue(r6, r9, r8)
                if (r1 != r0) goto L64
                goto L9e
            L64:
                r7 = r1
                r1 = r9
                r9 = r7
            L67:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La1
                hd.l r9 = r8.$block     // Catch: java.lang.Throwable -> L32
                r8.L$0 = r1     // Catch: java.lang.Throwable -> L32
                r8.label = r4     // Catch: java.lang.Throwable -> L32
                java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L32
                if (r9 != r0) goto L7c
                goto L9e
            L7c:
                androidx.paging.SingleRunner r9 = androidx.paging.SingleRunner.this
                androidx.paging.SingleRunner$Holder r9 = androidx.paging.SingleRunner.access$getHolder$p(r9)
                r2 = 0
                r8.L$0 = r2
                r8.label = r3
                java.lang.Object r9 = r9.onFinish(r1, r8)
                if (r9 != r0) goto La1
                goto L9e
            L8e:
                androidx.paging.SingleRunner r3 = androidx.paging.SingleRunner.this
                androidx.paging.SingleRunner$Holder r3 = androidx.paging.SingleRunner.access$getHolder$p(r3)
                r8.L$0 = r9
                r8.label = r2
                java.lang.Object r1 = r3.onFinish(r1, r8)
                if (r1 != r0) goto L9f
            L9e:
                return r0
            L9f:
                r0 = r9
            La0:
                throw r0
            La1:
                qc.q r9 = p309qc.C10786q.f26013a
                return r9
            La4:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.C42932.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42932) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public SingleRunner() {
        this(false, 1, null);
    }

    public static /* synthetic */ Object runInIsolation$default(SingleRunner singleRunner, int i10, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return singleRunner.runInIsolation(i10, interfaceC9540l, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runInIsolation(int r5, p181hd.InterfaceC9540l r6, vc.InterfaceC11588c<? super p309qc.C10786q> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.SingleRunner.C42921
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.SingleRunner$runInIsolation$1 r0 = (androidx.paging.SingleRunner.C42921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.SingleRunner$runInIsolation$1 r0 = new androidx.paging.SingleRunner$runInIsolation$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.AbstractC9924b.m20071b(r7)
            androidx.paging.SingleRunner$runInIsolation$2 r7 = new androidx.paging.SingleRunner$runInIsolation$2     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L29
            r2 = 0
            r7.<init>(r5, r6, r2)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L29
            r0.label = r3     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L29
            java.lang.Object r5 = kotlinx.coroutines.AbstractC10006d.m20748e(r7, r0)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L29
            if (r5 != r1) goto L4b
            return r1
        L45:
            androidx.paging.SingleRunner r6 = r5.getRunner()
            if (r6 != r4) goto L4e
        L4b:
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        L4e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.runInIsolation(int, hd.l, vc.c):java.lang.Object");
    }

    public SingleRunner(boolean z10) {
        this.holder = new Holder(this, z10);
    }

    public /* synthetic */ SingleRunner(boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
