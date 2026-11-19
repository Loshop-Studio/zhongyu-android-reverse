package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.loader.app.LoaderManagerImpl;
import com.taobao.sophix.PatchStatus;
import java.time.Duration;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C10046h;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class FlowLiveDataConversions {

    @InterfaceC11829d(m26210c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m26211f = "FlowLiveData.kt", m26212l = {PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX, 106, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1 */
    public static final class C39111 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m26211f = "FlowLiveData.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LiveData<T> liveData, Observer<T> observer, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$this_asFlow, this.$observer, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m26211f = "FlowLiveData.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                this.$this_asFlow.removeObserver(this.$observer);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39111(LiveData<T> liveData, InterfaceC11588c<? super C39111> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_asFlow = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C39111 c39111 = new C39111(this.$this_asFlow, interfaceC11588c);
            c39111.L$0 = obj;
            return c39111;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Observer observer;
            Object objM25952f = AbstractC11725a.m25952f();
            ?? r12 = this.label;
            try {
            } catch (Throwable th) {
                InterfaceC9945d interfaceC9945dPlus = C11157r0.m24800c().mo25209k().plus(C10046h.f23978c);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, r12, null);
                this.L$0 = th;
                this.label = 3;
                if (AbstractC11109f.m24709g(interfaceC9945dPlus, anonymousClass2, this) != objM25952f) {
                    throw th;
                }
            }
            if (r12 == 0) {
                AbstractC9924b.m20071b(obj);
                final InterfaceC11395j interfaceC11395j = (InterfaceC11395j) this.L$0;
                Observer observer2 = new Observer() { // from class: androidx.lifecycle.f
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        interfaceC11395j.mo33808trySendJP2dKIU(obj2);
                    }
                };
                AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, observer2, null);
                this.L$0 = observer2;
                this.label = 1;
                observer = observer2;
                if (AbstractC11109f.m24709g(abstractC11164t1Mo25209k, anonymousClass1, this) == objM25952f) {
                }
                return objM25952f;
            }
            if (r12 != 1) {
                if (r12 == 2) {
                    Observer observer3 = (Observer) this.L$0;
                    AbstractC9924b.m20071b(obj);
                    r12 = observer3;
                    throw new KotlinNothingValueException();
                }
                if (r12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.L$0;
                AbstractC9924b.m20071b(obj);
                throw th2;
            }
            Observer observer4 = (Observer) this.L$0;
            AbstractC9924b.m20071b(obj);
            observer = observer4;
            this.L$0 = observer;
            this.label = 2;
            r12 = observer;
            if (DelayKt.m20375a(this) == objM25952f) {
                return objM25952f;
            }
            throw new KotlinNothingValueException();
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C39111) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m26211f = "FlowLiveData.kt", m26212l = {PatchStatus.CODE_LOAD_JIT_CLEAR}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1 */
    public static final class C39121 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC11594c $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39121(InterfaceC11594c interfaceC11594c, InterfaceC11588c<? super C39121> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_asLiveData = interfaceC11594c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C39121 c39121 = new C39121(this.$this_asLiveData, interfaceC11588c);
            c39121.L$0 = obj;
            return c39121;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(LiveDataScope<T> liveDataScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C39121) create(liveDataScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                InterfaceC11594c interfaceC11594c = this.$this_asLiveData;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // p379vd.InterfaceC11595d
                    public final Object emit(T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        Object objEmit = liveDataScope.emit(t10, interfaceC11588c);
                        return objEmit == AbstractC11725a.m25952f() ? objEmit : C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (interfaceC11594c.collect(interfaceC11595d, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }
    }

    public static final <T> InterfaceC11594c asFlow(LiveData<T> liveData) {
        AbstractC9979u.m20294g(liveData, "<this>");
        return AbstractC11596e.m25561k(AbstractC11596e.m25555e(new C39111(liveData, null)));
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC11594c interfaceC11594c) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        return asLiveData$default(interfaceC11594c, (InterfaceC9945d) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC11594c interfaceC11594c, InterfaceC9945d interfaceC9945d, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        if ((i10 & 2) != 0) {
            j10 = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        }
        return asLiveData(interfaceC11594c, interfaceC9945d, j10);
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC11594c interfaceC11594c, InterfaceC9945d context) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(context, "context");
        return asLiveData$default(interfaceC11594c, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(InterfaceC11594c interfaceC11594c, InterfaceC9945d context, long j10) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(context, "context");
        LoaderManagerImpl.LoaderInfo loaderInfo = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j10, new C39121(interfaceC11594c, null));
        if (interfaceC11594c instanceof InterfaceC11612u) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                loaderInfo.setValue(((InterfaceC11612u) interfaceC11594c).getValue());
                return loaderInfo;
            }
            loaderInfo.postValue(((InterfaceC11612u) interfaceC11594c).getValue());
        }
        return loaderInfo;
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC11594c interfaceC11594c, Duration duration, InterfaceC9945d interfaceC9945d, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        return asLiveData(interfaceC11594c, duration, interfaceC9945d);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(InterfaceC11594c interfaceC11594c, Duration timeout, InterfaceC9945d context) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(timeout, "timeout");
        AbstractC9979u.m20294g(context, "context");
        return asLiveData(interfaceC11594c, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
