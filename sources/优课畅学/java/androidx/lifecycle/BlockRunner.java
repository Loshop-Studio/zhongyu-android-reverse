package androidx.lifecycle;

import androidx.annotation.MainThread;
import com.tencent.rtmp.TXLiveConstants;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class BlockRunner<T> {
    private final InterfaceC10574p block;
    private InterfaceC9212n cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final InterfaceC10559a onDone;
    private InterfaceC9212n runningJob;
    private final InterfaceC8822b0 scope;
    private final long timeoutInMs;

    @InterfaceC9539d(m17800c = "androidx.lifecycle.BlockRunner$cancel$1", m17801f = "CoroutineLiveData.kt", m17802l = {TXLiveConstants.RENDER_ROTATION_180}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.BlockRunner$cancel$1 */
    public static final class C40311 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40311(BlockRunner<T> blockRunner, InterfaceC9324c<? super C40311> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = blockRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C40311(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40311) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                long j10 = ((BlockRunner) this.this$0).timeoutInMs;
                this.label = 1;
                if (DelayKt.m16227b(j10, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            if (!((BlockRunner) this.this$0).liveData.hasActiveObservers()) {
                InterfaceC9212n interfaceC9212n = ((BlockRunner) this.this$0).runningJob;
                if (interfaceC9212n != null) {
                    InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
                }
                ((BlockRunner) this.this$0).runningJob = null;
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.lifecycle.BlockRunner$maybeRun$1", m17801f = "CoroutineLiveData.kt", m17802l = {168}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.BlockRunner$maybeRun$1 */
    public static final class C40321 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40321(BlockRunner<T> blockRunner, InterfaceC9324c<? super C40321> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = blockRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C40321 c40321 = new C40321(this.this$0, interfaceC9324c);
            c40321.L$0 = obj;
            return c40321;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40321) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(((BlockRunner) this.this$0).liveData, ((InterfaceC8822b0) this.L$0).getCoroutineContext());
                InterfaceC10574p interfaceC10574p = ((BlockRunner) this.this$0).block;
                this.label = 1;
                if (interfaceC10574p.invoke(liveDataScopeImpl, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            ((BlockRunner) this.this$0).onDone.invoke();
            return C8736p.f16368a;
        }
    }

    public BlockRunner(CoroutineLiveData<T> liveData, InterfaceC10574p block, long j10, InterfaceC8822b0 scope, InterfaceC10559a onDone) {
        AbstractC9133u.m16133g(liveData, "liveData");
        AbstractC9133u.m16133g(block, "block");
        AbstractC9133u.m16133g(scope, "scope");
        AbstractC9133u.m16133g(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j10;
        this.scope = scope;
        this.onDone = onDone;
    }

    @MainThread
    public final void cancel() {
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        this.cancellationJob = AbstractC8839h.m14861d(this.scope, C8843i0.m14868c().mo15693o(), null, new C40311(this, null), 2, null);
    }

    @MainThread
    public final void maybeRun() {
        InterfaceC9212n interfaceC9212n = this.cancellationJob;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = AbstractC8839h.m14861d(this.scope, null, null, new C40321(this, null), 3, null);
    }
}
