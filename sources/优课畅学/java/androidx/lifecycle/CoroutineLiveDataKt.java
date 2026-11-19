package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.CoroutineLiveDataKt;
import java.time.Duration;
import kotlin.AbstractC9079b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    @InterfaceC9539d(m17800c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", m17801f = "CoroutineLiveData.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 */
    public static final class C40332 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ LiveData<T> $source;
        final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40332(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, InterfaceC9324c<? super C40332> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_addDisposableSource = mediatorLiveData;
            this.$source = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C8736p invokeSuspend$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return C8736p.f16368a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C40332(this.$this_addDisposableSource, this.$source, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super EmittedSource> interfaceC9324c) {
            return ((C40332) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            final MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new InterfaceC10570l() { // from class: androidx.lifecycle.d
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return CoroutineLiveDataKt.C40332.invokeSuspend$lambda$0(mediatorLiveData, obj2);
                }
            }));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }
    }

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, InterfaceC9324c<? super EmittedSource> interfaceC9324c) {
        return AbstractC8833f.m14848g(C8843i0.m14868c().mo15693o(), new C40332(mediatorLiveData, liveData, null), interfaceC9324c);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, InterfaceC10574p block) {
        AbstractC9133u.m16133g(timeout, "timeout");
        AbstractC9133u.m16133g(block, "block");
        return liveData$default(timeout, (InterfaceC9100d) null, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(InterfaceC9100d interfaceC9100d, long j10, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        if ((i10 & 2) != 0) {
            j10 = DEFAULT_TIMEOUT;
        }
        return liveData(interfaceC9100d, j10, interfaceC10574p);
    }

    public static final <T> LiveData<T> liveData(InterfaceC9100d context, InterfaceC10574p block) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        return liveData$default((InterfaceC9100d) null, 0L, block, 3, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, InterfaceC9100d interfaceC9100d, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        return liveData(duration, interfaceC9100d, interfaceC10574p);
    }

    public static final <T> LiveData<T> liveData(InterfaceC9100d context, long j10, InterfaceC10574p block) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(block, "block");
        return new CoroutineLiveData(context, j10, block);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, InterfaceC9100d context, InterfaceC10574p block) {
        AbstractC9133u.m16133g(timeout, "timeout");
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
