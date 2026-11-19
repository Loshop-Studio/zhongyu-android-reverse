package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.IInterface;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.work.Logger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.JobKt__JobKt;
import p123h7.C8736p;
import p135i8.AbstractC8873s0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class RemoteExecuteKt {

    @InterfaceC9539d(m17800c = "androidx.work.multiprocess.RemoteExecuteKt$execute$1", m17801f = "RemoteExecute.kt", m17802l = {43, 50}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.multiprocess.RemoteExecuteKt$execute$1 */
    public static final class C49751 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ RemoteDispatcher<T> $dispatcher;
        final /* synthetic */ ListenableFuture<T> $iInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49751(ListenableFuture<T> listenableFuture, RemoteDispatcher<T> remoteDispatcher, InterfaceC9324c<? super C49751> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$iInterface = listenableFuture;
            this.$dispatcher = remoteDispatcher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C49751(this.$iInterface, this.$dispatcher, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super byte[]> interfaceC9324c) {
            return ((C49751) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    ListenableFuture<T> listenableFuture = this.$iInterface;
                    this.label = 1;
                    obj = ListenableFutureKt.await(listenableFuture, this);
                    if (obj == objM17291f) {
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    return obj;
                }
                AbstractC9079b.m15926b(obj);
                IInterface iInterface = (IInterface) obj;
                RemoteDispatcher<T> remoteDispatcher = this.$dispatcher;
                this.label = 2;
                Object objExecute = RemoteExecuteKt.execute(iInterface, (RemoteDispatcher<IInterface>) remoteDispatcher, (InterfaceC9324c<? super byte[]>) this);
                return objExecute == objM17291f ? objM17291f : objExecute;
            } catch (Throwable th) {
                if (!(th instanceof CancellationException)) {
                    Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to bind to service", th);
                }
                throw th;
            }
        }
    }

    @InterfaceC9539d(m17800c = "androidx.work.multiprocess.RemoteExecuteKt", m17801f = "RemoteExecute.kt", m17802l = {61}, m17803m = "execute")
    /* renamed from: androidx.work.multiprocess.RemoteExecuteKt$execute$2 */
    public static final class C49762<T extends IInterface> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C49762(InterfaceC9324c<? super C49762> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteExecuteKt.execute((IInterface) null, (RemoteDispatcher<IInterface>) null, this);
        }
    }

    public static final <T extends IInterface> ListenableFuture<byte[]> execute(Executor executor, ListenableFuture<T> iInterface, RemoteDispatcher<T> dispatcher) {
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(iInterface, "iInterface");
        AbstractC9133u.m16133g(dispatcher, "dispatcher");
        return SuspendToFutureAdapter.INSTANCE.launchFuture(AbstractC8873s0.m14908b(executor).plus(JobKt__JobKt.m16233b(null, 1, null)), false, new C49751(iInterface, dispatcher, null));
    }

    private static final void unlinkToDeathSafely(IBinder iBinder, IBinder.DeathRecipient deathRecipient) {
        try {
            iBinder.unlinkToDeath(deathRecipient, 0);
        } catch (NoSuchElementException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:33:0x009f, B:35:0x00a3, B:38:0x00b1), top: B:47:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.os.IInterface> java.lang.Object execute(T r7, androidx.work.multiprocess.RemoteDispatcher<T> r8, p179m7.InterfaceC9324c<? super byte[]> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.work.multiprocess.RemoteExecuteKt.C49762
            if (r0 == 0) goto L13
            r0 = r9
            androidx.work.multiprocess.RemoteExecuteKt$execute$2 r0 = (androidx.work.multiprocess.RemoteExecuteKt.C49762) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.multiprocess.RemoteExecuteKt$execute$2 r0 = new androidx.work.multiprocess.RemoteExecuteKt$execute$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            java.lang.String r3 = "binder"
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r7 = r0.L$3
            android.os.IBinder r7 = (android.os.IBinder) r7
            java.lang.Object r8 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r1 = r0.L$1
            androidx.work.multiprocess.RemoteDispatcher r1 = (androidx.work.multiprocess.RemoteDispatcher) r1
            java.lang.Object r0 = r0.L$0
            android.os.IInterface r0 = (android.os.IInterface) r0
            kotlin.AbstractC9079b.m15926b(r9)     // Catch: java.lang.Throwable -> L3b
            goto L90
        L3b:
            r9 = move-exception
            goto L9f
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            kotlin.AbstractC9079b.m15926b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            android.os.IBinder r2 = r7.asBinder()
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L85
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L85
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L85
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L85
            r0.label = r4     // Catch: java.lang.Throwable -> L85
            m7.f r4 = new m7.f     // Catch: java.lang.Throwable -> L85
            m7.c r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r0)     // Catch: java.lang.Throwable -> L85
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L85
            androidx.work.multiprocess.RemoteExecuteKt$execute$3$localRecipient$1 r5 = new androidx.work.multiprocess.RemoteExecuteKt$execute$3$localRecipient$1     // Catch: java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L85
            r9.f17473a = r5     // Catch: java.lang.Throwable -> L85
            r6 = 0
            r2.linkToDeath(r5, r6)     // Catch: java.lang.Throwable -> L85
            androidx.work.multiprocess.RemoteExecuteKt$execute$3$1 r5 = new androidx.work.multiprocess.RemoteExecuteKt$execute$3$1     // Catch: java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L85
            r8.execute(r7, r5)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r4.m17155a()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = p190n7.AbstractC9434a.m17291f()     // Catch: java.lang.Throwable -> L85
            if (r7 != r8) goto L8a
            p201o7.AbstractC9541f.m17811c(r0)     // Catch: java.lang.Throwable -> L85
            goto L8a
        L85:
            r7 = move-exception
            r8 = r9
            r9 = r7
            r7 = r2
            goto L9f
        L8a:
            if (r7 != r1) goto L8d
            return r1
        L8d:
            r8 = r9
            r9 = r7
            r7 = r2
        L90:
            byte[] r9 = (byte[]) r9     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = r8.f17473a
            android.os.IBinder$DeathRecipient r8 = (android.os.IBinder.DeathRecipient) r8
            if (r8 == 0) goto L9e
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r3)
            unlinkToDeathSafely(r7, r8)
        L9e:
            return r9
        L9f:
            boolean r0 = r9 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Laf
            if (r0 != 0) goto Lb1
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = androidx.work.multiprocess.ListenableWorkerImplClient.TAG     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "Unable to execute"
            r0.error(r1, r2, r9)     // Catch: java.lang.Throwable -> Laf
            goto Lb1
        Laf:
            r9 = move-exception
            goto Lb2
        Lb1:
            throw r9     // Catch: java.lang.Throwable -> Laf
        Lb2:
            java.lang.Object r8 = r8.f17473a
            android.os.IBinder$DeathRecipient r8 = (android.os.IBinder.DeathRecipient) r8
            if (r8 == 0) goto Lbe
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r3)
            unlinkToDeathSafely(r7, r8)
        Lbe:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.RemoteExecuteKt.execute(android.os.IInterface, androidx.work.multiprocess.RemoteDispatcher, m7.c):java.lang.Object");
    }
}
