package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class OperationKt {

    @InterfaceC11829d(m26210c = "androidx.work.OperationKt", m26211f = "Operation.kt", m26212l = {36}, m26213m = "await")
    /* renamed from: androidx.work.OperationKt$await$1 */
    public static final class C47641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C47641(InterfaceC11588c<? super C47641> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object await(androidx.work.Operation r4, vc.InterfaceC11588c<? super androidx.work.Operation.State.SUCCESS> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt.C47641
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt.C47641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.AbstractC9924b.m20071b(r5)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r4, r5)
            r0.label = r3
            java.lang.Object r5 = androidx.concurrent.futures.ListenableFutureKt.await(r4, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "result.await()"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, vc.c):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, InterfaceC11588c<? super Operation.State.SUCCESS> interfaceC11588c) throws Throwable {
        ListenableFuture<Operation.State.SUCCESS> result = operation.getResult();
        AbstractC9979u.m20293f(result, "result");
        AbstractC9977s.m20287c(0);
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(result, interfaceC11588c);
        AbstractC9977s.m20287c(1);
        AbstractC9979u.m20293f(objAwait, "result.await()");
        return objAwait;
    }

    public static final Operation launchOperation(final Tracer tracer, final String label, final Executor executor, final InterfaceC9529a block) {
        AbstractC9979u.m20294g(tracer, "tracer");
        AbstractC9979u.m20294g(label, "label");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(block, "block");
        final MutableLiveData mutableLiveData = new MutableLiveData(Operation.IN_PROGRESS);
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.g
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return OperationKt.launchOperation$lambda$2(executor, tracer, label, block, mutableLiveData, completer);
            }
        });
        AbstractC9979u.m20293f(future, "getFuture { completer ->…}\n            }\n        }");
        return new OperationImpl(mutableLiveData, future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q launchOperation$lambda$2(Executor executor, final Tracer tracer, final String str, final InterfaceC9529a interfaceC9529a, final MutableLiveData mutableLiveData, final CallbackToFutureAdapter.Completer completer) {
        AbstractC9979u.m20294g(completer, "completer");
        executor.execute(new Runnable() { // from class: androidx.work.h
            @Override // java.lang.Runnable
            public final void run() {
                OperationKt.launchOperation$lambda$2$lambda$1(tracer, str, interfaceC9529a, mutableLiveData, completer);
            }
        });
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchOperation$lambda$2$lambda$1(Tracer tracer, String str, InterfaceC9529a interfaceC9529a, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(str);
            } finally {
                if (zIsEnabled) {
                    tracer.endSection();
                }
            }
        }
        try {
            interfaceC9529a.invoke();
            Operation.State.SUCCESS success = Operation.SUCCESS;
            mutableLiveData.postValue(success);
            completer.set(success);
        } catch (Throwable th) {
            mutableLiveData.postValue(new Operation.State.FAILURE(th));
            completer.setException(th);
        }
        C10786q c10786q = C10786q.f26013a;
    }
}
