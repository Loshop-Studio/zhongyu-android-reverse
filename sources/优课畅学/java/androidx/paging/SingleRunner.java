package androidx.paging;

import androidx.databinding.library.baseAdapters.C3721BR;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

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
            AbstractC9133u.m16133g(runner, "runner");
            this.runner = runner;
        }

        public final SingleRunner getRunner() {
            return this.runner;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Holder {
        private final boolean cancelPreviousInEqualPriority;
        private final InterfaceC9942a mutex;
        private InterfaceC9212n previous;
        private int previousPriority;
        private final SingleRunner singleRunner;

        public Holder(SingleRunner singleRunner, boolean z10) {
            AbstractC9133u.m16133g(singleRunner, "singleRunner");
            this.singleRunner = singleRunner;
            this.cancelPreviousInEqualPriority = z10;
            this.mutex = AbstractC9943b.m18571b(false, 1, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object onFinish(kotlinx.coroutines.InterfaceC9212n r6, p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
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
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L40
                if (r2 != r3) goto L38
                java.lang.Object r6 = r0.L$2
                r8.a r6 = (p235r8.InterfaceC9942a) r6
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.n r1 = (kotlinx.coroutines.InterfaceC9212n) r1
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                kotlin.AbstractC9079b.m15926b(r7)
                r7 = r6
                r6 = r1
                goto L55
            L38:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L40:
                kotlin.AbstractC9079b.m15926b(r7)
                r8.a r7 = r5.mutex
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r0 = r7.lock(r4, r0)
                if (r0 != r1) goto L54
                return r1
            L54:
                r0 = r5
            L55:
                kotlinx.coroutines.n r1 = r0.previous     // Catch: java.lang.Throwable -> L5c
                if (r6 != r1) goto L5e
                r0.previous = r4     // Catch: java.lang.Throwable -> L5c
                goto L5e
            L5c:
                r6 = move-exception
                goto L66
            L5e:
                h7.p r6 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L5c
                r7.unlock(r4)
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            L66:
                r7.unlock(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.onFinish(kotlinx.coroutines.n, m7.c):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlinx.coroutines.n] */
        /* JADX WARN: Type inference failed for: r11v1, types: [r8.a] */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v4, types: [r8.a] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object tryEnqueue(int r10, kotlinx.coroutines.InterfaceC9212n r11, p179m7.InterfaceC9324c<? super java.lang.Boolean> r12) throws java.lang.Throwable {
            /*
                r9 = this;
                boolean r0 = r12 instanceof androidx.paging.SingleRunner$Holder$tryEnqueue$1
                if (r0 == 0) goto L13
                r0 = r12
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
                r0.<init>(r9, r12)
            L18:
                java.lang.Object r12 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L59
                if (r2 == r4) goto L47
                if (r2 != r3) goto L3f
                int r10 = r0.I$0
                java.lang.Object r11 = r0.L$2
                r8.a r11 = (p235r8.InterfaceC9942a) r11
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.n r1 = (kotlinx.coroutines.InterfaceC9212n) r1
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                kotlin.AbstractC9079b.m15926b(r12)     // Catch: java.lang.Throwable -> L3c
                goto Laa
            L3c:
                r10 = move-exception
                goto Lb8
            L3f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L47:
                int r10 = r0.I$0
                java.lang.Object r11 = r0.L$2
                r8.a r11 = (p235r8.InterfaceC9942a) r11
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.n r2 = (kotlinx.coroutines.InterfaceC9212n) r2
                java.lang.Object r6 = r0.L$0
                androidx.paging.SingleRunner$Holder r6 = (androidx.paging.SingleRunner.Holder) r6
                kotlin.AbstractC9079b.m15926b(r12)
                goto L72
            L59:
                kotlin.AbstractC9079b.m15926b(r12)
                r8.a r12 = r9.mutex
                r0.L$0 = r9
                r0.L$1 = r11
                r0.L$2 = r12
                r0.I$0 = r10
                r0.label = r4
                java.lang.Object r2 = r12.lock(r5, r0)
                if (r2 != r1) goto L6f
                goto La7
            L6f:
                r6 = r9
                r2 = r11
                r11 = r12
            L72:
                kotlinx.coroutines.n r12 = r6.previous     // Catch: java.lang.Throwable -> L3c
                if (r12 == 0) goto L89
                boolean r7 = r12.isActive()     // Catch: java.lang.Throwable -> L3c
                if (r7 == 0) goto L89
                int r7 = r6.previousPriority     // Catch: java.lang.Throwable -> L3c
                if (r7 < r10) goto L89
                if (r7 != r10) goto L87
                boolean r7 = r6.cancelPreviousInEqualPriority     // Catch: java.lang.Throwable -> L3c
                if (r7 == 0) goto L87
                goto L89
            L87:
                r4 = 0
                goto Lb0
            L89:
                if (r12 == 0) goto L95
                androidx.paging.SingleRunner$CancelIsolatedRunnerException r7 = new androidx.paging.SingleRunner$CancelIsolatedRunnerException     // Catch: java.lang.Throwable -> L3c
                androidx.paging.SingleRunner r8 = r6.singleRunner     // Catch: java.lang.Throwable -> L3c
                r7.<init>(r8)     // Catch: java.lang.Throwable -> L3c
                r12.cancel(r7)     // Catch: java.lang.Throwable -> L3c
            L95:
                if (r12 == 0) goto Lac
                r0.L$0 = r6     // Catch: java.lang.Throwable -> L3c
                r0.L$1 = r2     // Catch: java.lang.Throwable -> L3c
                r0.L$2 = r11     // Catch: java.lang.Throwable -> L3c
                r0.I$0 = r10     // Catch: java.lang.Throwable -> L3c
                r0.label = r3     // Catch: java.lang.Throwable -> L3c
                java.lang.Object r12 = r12.mo16291n(r0)     // Catch: java.lang.Throwable -> L3c
                if (r12 != r1) goto La8
            La7:
                return r1
            La8:
                r1 = r2
                r0 = r6
            Laa:
                r6 = r0
                r2 = r1
            Lac:
                r6.previous = r2     // Catch: java.lang.Throwable -> L3c
                r6.previousPriority = r10     // Catch: java.lang.Throwable -> L3c
            Lb0:
                java.lang.Boolean r10 = p201o7.AbstractC9536a.m17796a(r4)     // Catch: java.lang.Throwable -> L3c
                r11.unlock(r5)
                return r10
            Lb8:
                r11.unlock(r5)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.tryEnqueue(int, kotlinx.coroutines.n, m7.c):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.SingleRunner", m17801f = "SingleRunner.kt", m17802l = {49}, m17803m = "runInIsolation")
    /* renamed from: androidx.paging.SingleRunner$runInIsolation$1 */
    public static final class C43891 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C43891(InterfaceC9324c<? super C43891> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleRunner.this.runInIsolation(0, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.SingleRunner$runInIsolation$2", m17801f = "SingleRunner.kt", m17802l = {53, C3721BR.viewModel, 61, 61}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.SingleRunner$runInIsolation$2 */
    public static final class C43902 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $block;
        final /* synthetic */ int $priority;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43902(int i10, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C43902> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$priority = i10;
            this.$block = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43902 c43902 = SingleRunner.this.new C43902(this.$priority, this.$block, interfaceC9324c);
            c43902.L$0 = obj;
            return c43902;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43902) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        
            if (r9.onFinish(r1, r8) != r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.n] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.n] */
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
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
                kotlin.AbstractC9079b.m15926b(r9)
                goto La0
            L25:
                kotlin.AbstractC9079b.m15926b(r9)
                goto La1
            L2a:
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.n r1 = (kotlinx.coroutines.InterfaceC9212n) r1
                kotlin.AbstractC9079b.m15926b(r9)     // Catch: java.lang.Throwable -> L32
                goto L7c
            L32:
                r9 = move-exception
                goto L8e
            L34:
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.n r1 = (kotlinx.coroutines.InterfaceC9212n) r1
                kotlin.AbstractC9079b.m15926b(r9)
                goto L67
            L3c:
                kotlin.AbstractC9079b.m15926b(r9)
                java.lang.Object r9 = r8.L$0
                i8.b0 r9 = (p135i8.InterfaceC8822b0) r9
                kotlin.coroutines.d r9 = r9.getCoroutineContext()
                kotlinx.coroutines.n$b r1 = kotlinx.coroutines.InterfaceC9212n.f18095c0
                kotlin.coroutines.d$b r9 = r9.get(r1)
                if (r9 == 0) goto La4
                kotlinx.coroutines.n r9 = (kotlinx.coroutines.InterfaceC9212n) r9
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
                x7.l r9 = r8.$block     // Catch: java.lang.Throwable -> L32
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
                h7.p r9 = p123h7.C8736p.f16368a
                return r9
            La4:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.C43902.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SingleRunner() {
        this(false, 1, null);
    }

    public static /* synthetic */ Object runInIsolation$default(SingleRunner singleRunner, int i10, InterfaceC10570l interfaceC10570l, InterfaceC9324c interfaceC9324c, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return singleRunner.runInIsolation(i10, interfaceC10570l, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runInIsolation(int r5, p300x7.InterfaceC10570l r6, p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.SingleRunner.C43891
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.SingleRunner$runInIsolation$1 r0 = (androidx.paging.SingleRunner.C43891) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            androidx.paging.SingleRunner r5 = (androidx.paging.SingleRunner) r5
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2d
            goto L53
        L2d:
            r6 = move-exception
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.AbstractC9079b.m15926b(r7)
            androidx.paging.SingleRunner$runInIsolation$2 r7 = new androidx.paging.SingleRunner$runInIsolation$2     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L4b
            r2 = 0
            r7.<init>(r5, r6, r2)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L4b
            r0.L$0 = r4     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L4b
            r0.label = r3     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L4b
            java.lang.Object r5 = kotlinx.coroutines.AbstractC9165e.m16556e(r7, r0)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L4b
            if (r5 != r1) goto L53
            return r1
        L4b:
            r6 = move-exception
            r5 = r4
        L4d:
            androidx.paging.SingleRunner r7 = r6.getRunner()
            if (r7 != r5) goto L56
        L53:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        L56:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.runInIsolation(int, x7.l, m7.c):java.lang.Object");
    }

    public SingleRunner(boolean z10) {
        this.holder = new Holder(this, z10);
    }

    public /* synthetic */ SingleRunner(boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
