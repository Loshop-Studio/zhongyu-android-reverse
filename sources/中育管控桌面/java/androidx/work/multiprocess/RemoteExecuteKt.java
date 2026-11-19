package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.IInterface;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.Logger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

@Metadata(m7879d1 = {"\u00002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0080@¢\u0006\u0002\u0010\u0007\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\b\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, m7880d2 = {"execute", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/IInterface;", "iInterface", "dispatcher", "Landroidx/work/multiprocess/RemoteDispatcher;", "(Landroid/os/IInterface;Landroidx/work/multiprocess/RemoteDispatcher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/common/util/concurrent/ListenableFuture;", "executor", "Ljava/util/concurrent/Executor;", "unlinkToDeathSafely", "", "Landroid/os/IBinder;", "recipient", "Landroid/os/IBinder$DeathRecipient;", "work-multiprocess_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nRemoteExecute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteExecute.kt\nandroidx/work/multiprocess/RemoteExecuteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: classes3.dex */
public final class RemoteExecuteKt {

    @Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m7880d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/IInterface;", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "androidx.work.multiprocess.RemoteExecuteKt$execute$1", m7918f = "RemoteExecute.kt", m7919i = {}, m7920l = {43, 50}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: androidx.work.multiprocess.RemoteExecuteKt$execute$1 */
    public static final class C43481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        final /* synthetic */ RemoteDispatcher<T> $dispatcher;
        final /* synthetic */ ListenableFuture<T> $iInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43481(ListenableFuture<T> listenableFuture, RemoteDispatcher<T> remoteDispatcher, Continuation<? super C43481> continuation) {
            super(2, continuation);
            this.$iInterface = listenableFuture;
            this.$dispatcher = remoteDispatcher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C43481(this.$iInterface, this.$dispatcher, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.label;
            try {
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ListenableFuture<T> listenableFuture = this.$iInterface;
                    this.label = 1;
                    obj = ListenableFutureKt.await(listenableFuture, this);
                    if (obj == coroutine_suspended) {
                    }
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                IInterface iInterface = (IInterface) obj;
                RemoteDispatcher<T> remoteDispatcher = this.$dispatcher;
                this.label = 2;
                Object objExecute = RemoteExecuteKt.execute(iInterface, (RemoteDispatcher<IInterface>) remoteDispatcher, (Continuation<? super byte[]>) this);
                return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
            } catch (Throwable th) {
                if (!(th instanceof CancellationException)) {
                    Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to bind to service", th);
                }
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((C43481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "androidx.work.multiprocess.RemoteExecuteKt", m7918f = "RemoteExecute.kt", m7919i = {0, 0, 0, 0}, m7920l = {61}, m7921m = "execute", m7922n = {"iInterface", "dispatcher", "deathRecipient", "binder"}, m7923s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.work.multiprocess.RemoteExecuteKt$execute$2 */
    public static final class C43492<T extends IInterface> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C43492(Continuation<? super C43492> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteExecuteKt.execute((IInterface) null, (RemoteDispatcher<IInterface>) null, this);
        }
    }

    public static final <T extends IInterface> ListenableFuture<byte[]> execute(Executor executor, ListenableFuture<T> iInterface, RemoteDispatcher<T> dispatcher) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(iInterface, "iInterface");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return SuspendToFutureAdapter.INSTANCE.launchFuture(ExecutorsKt.from(executor).plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), false, new C43481(iInterface, dispatcher, null));
    }

    private static final void unlinkToDeathSafely(IBinder iBinder, IBinder.DeathRecipient deathRecipient) {
        try {
            iBinder.unlinkToDeath(deathRecipient, 0);
        } catch (NoSuchElementException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:33:0x009f, B:35:0x00a3, B:38:0x00b1), top: B:47:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.os.IBinder$DeathRecipient, androidx.work.multiprocess.RemoteExecuteKt$execute$3$localRecipient$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.os.IInterface> java.lang.Object execute(T r7, androidx.work.multiprocess.RemoteDispatcher<T> r8, kotlin.coroutines.Continuation<? super byte[]> r9) {
        /*
            boolean r0 = r9 instanceof androidx.work.multiprocess.RemoteExecuteKt.C43492
            if (r0 == 0) goto L13
            r0 = r9
            androidx.work.multiprocess.RemoteExecuteKt$execute$2 r0 = (androidx.work.multiprocess.RemoteExecuteKt.C43492) r0
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "binder"
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r7 = r0.L$3
            android.os.IBinder r7 = (android.os.IBinder) r7
            java.lang.Object r8 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r1 = r0.L$1
            androidx.work.multiprocess.RemoteDispatcher r1 = (androidx.work.multiprocess.RemoteDispatcher) r1
            java.lang.Object r0 = r0.L$0
            android.os.IInterface r0 = (android.os.IInterface) r0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3b
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
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            android.os.IBinder r2 = r7.asBinder()
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L85
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L85
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L85
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L85
            r0.label = r4     // Catch: java.lang.Throwable -> L85
            kotlin.coroutines.SafeContinuation r4 = new kotlin.coroutines.SafeContinuation     // Catch: java.lang.Throwable -> L85
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L85
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L85
            androidx.work.multiprocess.RemoteExecuteKt$execute$3$localRecipient$1 r5 = new androidx.work.multiprocess.RemoteExecuteKt$execute$3$localRecipient$1     // Catch: java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L85
            r9.element = r5     // Catch: java.lang.Throwable -> L85
            r6 = 0
            r2.linkToDeath(r5, r6)     // Catch: java.lang.Throwable -> L85
            androidx.work.multiprocess.RemoteExecuteKt$execute$3$1 r5 = new androidx.work.multiprocess.RemoteExecuteKt$execute$3$1     // Catch: java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L85
            r8.execute(r7, r5)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r4.getOrThrow()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L85
            if (r7 != r8) goto L8a
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L85
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
            T r8 = r8.element
            android.os.IBinder$DeathRecipient r8 = (android.os.IBinder.DeathRecipient) r8
            if (r8 == 0) goto L9e
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
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
            T r8 = r8.element
            android.os.IBinder$DeathRecipient r8 = (android.os.IBinder.DeathRecipient) r8
            if (r8 == 0) goto Lbe
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
            unlinkToDeathSafely(r7, r8)
        Lbe:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.RemoteExecuteKt.execute(android.os.IInterface, androidx.work.multiprocess.RemoteDispatcher, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
