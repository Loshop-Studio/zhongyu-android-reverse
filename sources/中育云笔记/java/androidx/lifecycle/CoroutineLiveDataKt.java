package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.CoroutineLiveDataKt;
import java.time.Duration;
import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    @InterfaceC11829d(m26210c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", m26211f = "CoroutineLiveData.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 */
    public static final class C39072 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ LiveData<T> $source;
        final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39072(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, InterfaceC11588c<? super C39072> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_addDisposableSource = mediatorLiveData;
            this.$source = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q invokeSuspend$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C39072(this.$this_addDisposableSource, this.$source, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            final MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new InterfaceC9540l() { // from class: androidx.lifecycle.d
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return CoroutineLiveDataKt.C39072.invokeSuspend$lambda$0(mediatorLiveData, obj2);
                }
            }));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super EmittedSource> interfaceC11588c) {
            return ((C39072) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, InterfaceC11588c<? super EmittedSource> interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24800c().mo25209k(), new C39072(mediatorLiveData, liveData, null), interfaceC11588c);
    }

    public static final <T> LiveData<T> liveData(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        return liveData$default((InterfaceC9945d) null, 0L, block, 3, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(InterfaceC9945d interfaceC9945d, long j10, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        if ((i10 & 2) != 0) {
            j10 = DEFAULT_TIMEOUT;
        }
        return liveData(interfaceC9945d, j10, interfaceC9544p);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, InterfaceC9544p block) {
        AbstractC9979u.m20294g(timeout, "timeout");
        AbstractC9979u.m20294g(block, "block");
        return liveData$default(timeout, (InterfaceC9945d) null, block, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(InterfaceC9945d context, InterfaceC9544p block) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, InterfaceC9945d interfaceC9945d, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        return liveData(duration, interfaceC9945d, interfaceC9544p);
    }

    public static final <T> LiveData<T> liveData(InterfaceC9945d context, long j10, InterfaceC9544p block) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(block, "block");
        return new CoroutineLiveData(context, j10, block);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, InterfaceC9945d context, InterfaceC9544p block) {
        AbstractC9979u.m20294g(timeout, "timeout");
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
