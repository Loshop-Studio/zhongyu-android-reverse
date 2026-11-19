package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.paging.LivePagedList;
import com.tencent.smtt.sdk.TbsListener;
import java.time.Duration;
import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9213o;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8841h1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p157k8.InterfaceC9071g;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class FlowLiveDataConversions {

    @InterfaceC9539d(m17800c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m17801f = "FlowLiveData.kt", m17802l = {TbsListener.ErrorCode.DISK_FULL, TbsListener.ErrorCode.FILE_DELETED, 108}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1 */
    public static final class C40371 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m17801f = "FlowLiveData.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LiveData<T> liveData, Observer<T> observer, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.$this_asFlow, this.$observer, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m17801f = "FlowLiveData.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                this.$this_asFlow.removeObserver(this.$observer);
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40371(LiveData<T> liveData, InterfaceC9324c<? super C40371> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_asFlow = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C40371 c40371 = new C40371(this.$this_asFlow, interfaceC9324c);
            c40371.L$0 = obj;
            return c40371;
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
            Object objM17291f = AbstractC9434a.m17291f();
            ?? r12 = this.label;
            try {
            } catch (Throwable th) {
                InterfaceC9100d interfaceC9100dPlus = C8843i0.m14868c().mo15693o().plus(C9213o.f18097a);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, r12, null);
                this.L$0 = th;
                this.label = 3;
                if (AbstractC8833f.m14848g(interfaceC9100dPlus, anonymousClass2, this) != objM17291f) {
                    throw th;
                }
            }
            if (r12 == 0) {
                AbstractC9079b.m15926b(obj);
                final InterfaceC9071g interfaceC9071g = (InterfaceC9071g) this.L$0;
                Observer observer2 = new Observer() { // from class: androidx.lifecycle.f
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        interfaceC9071g.mo27213trySendJP2dKIU(obj2);
                    }
                };
                AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, observer2, null);
                this.L$0 = observer2;
                this.label = 1;
                observer = observer2;
                if (AbstractC8833f.m14848g(abstractC8841h1Mo15693o, anonymousClass1, this) == objM17291f) {
                }
                return objM17291f;
            }
            if (r12 != 1) {
                if (r12 == 2) {
                    Observer observer3 = (Observer) this.L$0;
                    AbstractC9079b.m15926b(obj);
                    r12 = observer3;
                    throw new KotlinNothingValueException();
                }
                if (r12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.L$0;
                AbstractC9079b.m15926b(obj);
                throw th2;
            }
            Observer observer4 = (Observer) this.L$0;
            AbstractC9079b.m15926b(obj);
            observer = observer4;
            this.L$0 = observer;
            this.label = 2;
            r12 = observer;
            if (DelayKt.m16226a(this) == objM17291f) {
                return objM17291f;
            }
            throw new KotlinNothingValueException();
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9071g interfaceC9071g, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40371) create(interfaceC9071g, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m17801f = "FlowLiveData.kt", m17802l = {78}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1 */
    public static final class C40381 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC9266c $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40381(InterfaceC9266c interfaceC9266c, InterfaceC9324c<? super C40381> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_asLiveData = interfaceC9266c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C40381 c40381 = new C40381(this.$this_asLiveData, interfaceC9324c);
            c40381.L$0 = obj;
            return c40381;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(LiveDataScope<T> liveDataScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40381) create(liveDataScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                InterfaceC9266c interfaceC9266c = this.$this_asLiveData;
                InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // p169l8.InterfaceC9267d
                    public final Object emit(T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        Object objEmit = liveDataScope.emit(t10, interfaceC9324c);
                        return objEmit == AbstractC9434a.m17291f() ? objEmit : C8736p.f16368a;
                    }
                };
                this.label = 1;
                if (interfaceC9266c.collect(interfaceC9267d, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public static final <T> InterfaceC9266c asFlow(LiveData<T> liveData) {
        AbstractC9133u.m16133g(liveData, "<this>");
        return AbstractC9268e.m17022l(AbstractC9268e.m17015e(new C40371(liveData, null)));
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC9266c interfaceC9266c) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        return asLiveData$default(interfaceC9266c, (InterfaceC9100d) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC9266c interfaceC9266c, InterfaceC9100d interfaceC9100d, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        if ((i10 & 2) != 0) {
            j10 = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        }
        return asLiveData(interfaceC9266c, interfaceC9100d, j10);
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC9266c interfaceC9266c, InterfaceC9100d context) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(context, "context");
        return asLiveData$default(interfaceC9266c, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(InterfaceC9266c interfaceC9266c, InterfaceC9100d context, long j10) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(context, "context");
        LivePagedList livePagedList = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j10, new C40381(interfaceC9266c, null));
        if (interfaceC9266c instanceof InterfaceC9280q) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                livePagedList.setValue(((InterfaceC9280q) interfaceC9266c).getValue());
                return livePagedList;
            }
            livePagedList.postValue(((InterfaceC9280q) interfaceC9266c).getValue());
        }
        return livePagedList;
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC9266c interfaceC9266c, Duration duration, InterfaceC9100d interfaceC9100d, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        return asLiveData(interfaceC9266c, duration, interfaceC9100d);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(InterfaceC9266c interfaceC9266c, Duration timeout, InterfaceC9100d context) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(timeout, "timeout");
        AbstractC9133u.m16133g(context, "context");
        return asLiveData(interfaceC9266c, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
