package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class OperationKt {

    @InterfaceC9539d(m17800c = "androidx.work.OperationKt", m17801f = "Operation.kt", m17802l = {36}, m17803m = "await")
    /* renamed from: androidx.work.OperationKt$await$1 */
    public static final class C48161 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C48161(InterfaceC9324c<? super C48161> interfaceC9324c) {
            super(interfaceC9324c);
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
    public static final java.lang.Object await(androidx.work.Operation r4, p179m7.InterfaceC9324c<? super androidx.work.Operation.State.SUCCESS> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt.C48161
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt.C48161) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r4, r5)
            r0.label = r3
            java.lang.Object r5 = androidx.concurrent.futures.ListenableFutureKt.await(r4, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "result.await()"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, m7.c):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, InterfaceC9324c<? super Operation.State.SUCCESS> interfaceC9324c) throws Throwable {
        ListenableFuture<Operation.State.SUCCESS> result = operation.getResult();
        AbstractC9133u.m16132f(result, "result");
        AbstractC9131s.m16126c(0);
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(result, interfaceC9324c);
        AbstractC9131s.m16126c(1);
        AbstractC9133u.m16132f(objAwait, "result.await()");
        return objAwait;
    }

    public static final Operation launchOperation(final Tracer tracer, final String label, final Executor executor, final InterfaceC10559a block) {
        AbstractC9133u.m16133g(tracer, "tracer");
        AbstractC9133u.m16133g(label, "label");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(block, "block");
        final MutableLiveData mutableLiveData = new MutableLiveData(Operation.IN_PROGRESS);
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.g
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return OperationKt.launchOperation$lambda$2(executor, tracer, label, block, mutableLiveData, completer);
            }
        });
        AbstractC9133u.m16132f(future, "getFuture { completer ->…}\n            }\n        }");
        return new OperationImpl(mutableLiveData, future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p launchOperation$lambda$2(Executor executor, final Tracer tracer, final String str, final InterfaceC10559a interfaceC10559a, final MutableLiveData mutableLiveData, final CallbackToFutureAdapter.Completer completer) {
        AbstractC9133u.m16133g(completer, "completer");
        executor.execute(new Runnable() { // from class: androidx.work.h
            @Override // java.lang.Runnable
            public final void run() {
                OperationKt.launchOperation$lambda$2$lambda$1(tracer, str, interfaceC10559a, mutableLiveData, completer);
            }
        });
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchOperation$lambda$2$lambda$1(Tracer tracer, String str, InterfaceC10559a interfaceC10559a, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
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
            interfaceC10559a.invoke();
            Operation.State.SUCCESS success = Operation.SUCCESS;
            mutableLiveData.postValue(success);
            completer.set(success);
        } catch (Throwable th) {
            mutableLiveData.postValue(new Operation.State.FAILURE(th));
            completer.setException(th);
        }
        C8736p c8736p = C8736p.f16368a;
    }
}
