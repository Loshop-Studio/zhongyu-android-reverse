package androidx.work.multiprocess;

import android.content.Context;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.JobKt__JobKt;
import p123h7.C8736p;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {

    @InterfaceC9539d(m17800c = "androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1", m17801f = "RemoteCoroutineWorker.kt", m17802l = {C3721BR.versionName}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1 */
    public static final class C49741 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C49741(InterfaceC9324c<? super C49741> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return RemoteCoroutineWorker.this.new C49741(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super ListenableWorker.Result> interfaceC9324c) {
            return ((C49741) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            RemoteCoroutineWorker remoteCoroutineWorker = RemoteCoroutineWorker.this;
            this.label = 1;
            Object objDoRemoteWork = remoteCoroutineWorker.doRemoteWork(this);
            return objDoRemoteWork == objM17291f ? objM17291f : objDoRemoteWork;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCoroutineWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(parameters, "parameters");
    }

    public abstract Object doRemoteWork(InterfaceC9324c<? super ListenableWorker.Result> interfaceC9324c);

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setProgress(Data data, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        ListenableFuture<Void> progressAsync = setProgressAsync(data);
        AbstractC9133u.m16132f(progressAsync, "setProgressAsync(data)");
        Object objAwait = ListenableFutureKt.await(progressAsync, interfaceC9324c);
        return objAwait == AbstractC9434a.m17291f() ? objAwait : C8736p.f16368a;
    }

    @Override // androidx.work.multiprocess.RemoteListenableWorker
    public ListenableFuture<ListenableWorker.Result> startRemoteWork() {
        return SuspendToFutureAdapter.INSTANCE.launchFuture(C8843i0.m14866a().plus(JobKt__JobKt.m16233b(null, 1, null)), false, new C49741(null));
    }
}
