package androidx.work.impl.workers;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.model.WorkSpec;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ConstraintTrackingWorkerKt {
    public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
    private static final String TAG;

    @InterfaceC11829d(m26210c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt", m26211f = "ConstraintTrackingWorker.kt", m26212l = {Opcodes.IF_ICMPNE}, m26213m = "awaitConstraintsNotMet")
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 */
    public static final class C49141 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C49141(InterfaceC11588c<? super C49141> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorkerKt.awaitConstraintsNotMet(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", m26211f = "ConstraintTrackingWorker.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2 */
    public static final class C49152 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ WorkSpec $workSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49152(WorkSpec workSpec, InterfaceC11588c<? super C49152> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$workSpec = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C49152(this.$workSpec, interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ConstraintsState constraintsState, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C49152) create(constraintsState, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            String str = ConstraintTrackingWorkerKt.TAG;
            WorkSpec workSpec = this.$workSpec;
            Logger.get().debug(str, "Constraints changed for " + workSpec);
            return C10786q.f26013a;
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("ConstraintTrkngWrkr");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        TAG = strTagWithPrefix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitConstraintsNotMet(androidx.work.impl.constraints.WorkConstraintsTracker r4, androidx.work.impl.model.WorkSpec r5, vc.InterfaceC11588c<? super java.lang.Integer> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.work.impl.workers.ConstraintTrackingWorkerKt.C49141
            if (r0 == 0) goto L13
            r0 = r6
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 r0 = (androidx.work.impl.workers.ConstraintTrackingWorkerKt.C49141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 r0 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.AbstractC9924b.m20071b(r6)
            vd.c r4 = r4.track(r5)
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2 r6 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2
            r2 = 0
            r6.<init>(r5, r2)
            vd.c r4 = p379vd.AbstractC11596e.m25540K(r4, r6)
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1 r5 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1
            r5.<init>()
            r0.label = r3
            java.lang.Object r6 = p379vd.AbstractC11596e.m25574x(r5, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            androidx.work.impl.constraints.ConstraintsState$ConstraintsNotMet r6 = (androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) r6
            int r4 = r6.getReason()
            java.lang.Integer r4 = p409xc.AbstractC11826a.m26208c(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet(androidx.work.impl.constraints.WorkConstraintsTracker, androidx.work.impl.model.WorkSpec, vc.c):java.lang.Object");
    }
}
