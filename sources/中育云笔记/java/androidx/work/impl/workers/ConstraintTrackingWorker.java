package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.AbstractC11115g1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters workerParameters;

    public static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        public ConstraintUnsatisfiedException(int i10) {
            this.stopReason = i10;
        }

        public final int getStopReason() {
            return this.stopReason;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2", m26211f = "ConstraintTrackingWorker.kt", m26212l = {Opcodes.ASTORE}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2 */
    public static final class C49082 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C49082(InterfaceC11588c<? super C49082> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return ConstraintTrackingWorker.this.new C49082(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            this.label = 1;
            Object obj2 = constraintTrackingWorker.setupAndRunConstraintTrackingWork(this);
            return obj2 == objM25952f ? objM25952f : obj2;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c) {
            return ((C49082) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.impl.workers.ConstraintTrackingWorker", m26211f = "ConstraintTrackingWorker.kt", m26212l = {125}, m26213m = "runWorker")
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 */
    public static final class C49091 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C49091(InterfaceC11588c<? super C49091> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.runWorker(null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", m26211f = "ConstraintTrackingWorker.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_LOST}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2 */
    public static final class C49102 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ ListenableWorker $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49102(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, InterfaceC11588c<? super C49102> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$delegate = listenableWorker;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C49102 c49102 = new C49102(this.$delegate, this.$workConstraintsTracker, this.$workSpec, interfaceC11588c);
            c49102.L$0 = obj;
            return c49102;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.g] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.C49102.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c) {
            return ((C49102) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.impl.workers.ConstraintTrackingWorker", m26211f = "ConstraintTrackingWorker.kt", m26212l = {97}, m26213m = "setupAndRunConstraintTrackingWork")
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 */
    public static final class C49111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C49111(InterfaceC11588c<? super C49111> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.setupAndRunConstraintTrackingWork(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", m26211f = "ConstraintTrackingWorker.kt", m26212l = {98}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 */
    public static final class C49125 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ ListenableWorker $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49125(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, InterfaceC11588c<? super C49125> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$delegate = listenableWorker;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return ConstraintTrackingWorker.this.new C49125(this.$delegate, this.$workConstraintsTracker, this.$workSpec, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            ListenableWorker listenableWorker = this.$delegate;
            WorkConstraintsTracker workConstraintsTracker = this.$workConstraintsTracker;
            WorkSpec workSpec = this.$workSpec;
            this.label = 1;
            Object objRunWorker = constraintTrackingWorker.runWorker(listenableWorker, workConstraintsTracker, workSpec, this);
            return objRunWorker == objM25952f ? objM25952f : objRunWorker;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c) {
            return ((C49125) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        AbstractC9979u.m20294g(appContext, "appContext");
        AbstractC9979u.m20294g(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runWorker(androidx.work.ListenableWorker r5, androidx.work.impl.constraints.WorkConstraintsTracker r6, androidx.work.impl.model.WorkSpec r7, vc.InterfaceC11588c<? super androidx.work.ListenableWorker.Result> r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.C49091
            if (r0 == 0) goto L13
            r0 = r8
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = (androidx.work.impl.workers.ConstraintTrackingWorker.C49091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r8)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.AbstractC9924b.m20071b(r8)
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2 r8 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2
            r2 = 0
            r8.<init>(r5, r6, r7, r2)
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.AbstractC10006d.m20748e(r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "delegate: ListenableWork….cancel()\n        }\n    }"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r8, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.runWorker(androidx.work.ListenableWorker, androidx.work.impl.constraints.WorkConstraintsTracker, androidx.work.impl.model.WorkSpec, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setupAndRunConstraintTrackingWork(vc.InterfaceC11588c<? super androidx.work.ListenableWorker.Result> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork(vc.c):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c) {
        Executor backgroundExecutor = getBackgroundExecutor();
        AbstractC9979u.m20293f(backgroundExecutor, "backgroundExecutor");
        return AbstractC11109f.m24709g(AbstractC11115g1.m24721b(backgroundExecutor), new C49082(null), interfaceC11588c);
    }
}
