package androidx.work.multiprocess;

import android.content.Context;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.JobKt__JobKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {

    @InterfaceC11829d(m26210c = "androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1", m26211f = "RemoteCoroutineWorker.kt", m26212l = {Opcodes.DSTORE}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1 */
    public static final class C49221 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C49221(InterfaceC11588c<? super C49221> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return RemoteCoroutineWorker.this.new C49221(interfaceC11588c);
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
            RemoteCoroutineWorker remoteCoroutineWorker = RemoteCoroutineWorker.this;
            this.label = 1;
            Object objDoRemoteWork = remoteCoroutineWorker.doRemoteWork(this);
            return objDoRemoteWork == objM25952f ? objM25952f : objDoRemoteWork;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c) {
            return ((C49221) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCoroutineWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(parameters, "parameters");
    }

    public abstract Object doRemoteWork(InterfaceC11588c<? super ListenableWorker.Result> interfaceC11588c);

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setProgress(Data data, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        ListenableFuture<Void> progressAsync = setProgressAsync(data);
        AbstractC9979u.m20293f(progressAsync, "setProgressAsync(data)");
        Object objAwait = ListenableFutureKt.await(progressAsync, interfaceC11588c);
        return objAwait == AbstractC11725a.m25952f() ? objAwait : C10786q.f26013a;
    }

    @Override // androidx.work.multiprocess.RemoteListenableWorker
    public ListenableFuture<ListenableWorker.Result> startRemoteWork() {
        return SuspendToFutureAdapter.INSTANCE.launchFuture(C11157r0.m24798a().plus(JobKt__JobKt.m20385b(null, 1, null)), false, new C49221(null));
    }
}
