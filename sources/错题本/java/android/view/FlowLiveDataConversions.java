package android.view;

import android.view.FlowLiveDataConversions;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.objectbox.android.ObjectBoxLiveData;
import java.time.Duration;
import kotlin.AbstractC5774b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5963g1;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.C5883l;
import kotlinx.coroutines.channels.InterfaceC5884m;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p046d7.C5447d;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "Lh6/h;", "context", "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "asLiveData", "(Lkotlinx/coroutines/flow/f;Lh6/h;J)Landroidx/lifecycle/LiveData;", "asFlow", "(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/f;", "Ljava/time/Duration;", "timeout", "(Lkotlinx/coroutines/flow/f;Ljava/time/Duration;Lh6/h;)Landroidx/lifecycle/LiveData;", "lifecycle-livedata_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "FlowLiveDataConversions")
/* loaded from: classes2.dex */
public final class FlowLiveDataConversions {

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/m;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m5303f = "FlowLiveData.kt", m5304i = {0, 1}, m5305l = {105, 106, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m5306m = "invokeSuspend", m5307n = {"observer", "observer"}, m5308s = {"L$0", "L$0"})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1 */
    public static final class C27241 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
        @DebugMetadata(m5302c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m5303f = "FlowLiveData.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LiveData<T> liveData, Observer<T> observer, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.$this_asFlow, this.$observer, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return C5443s.f8405a;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
        @DebugMetadata(m5302c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m5303f = "FlowLiveData.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                this.$this_asFlow.removeObserver(this.$observer);
                return C5443s.f8405a;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27241(LiveData<T> liveData, InterfaceC5631c<? super C27241> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_asFlow = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC5884m interfaceC5884m, Object obj) {
            ((C5883l) interfaceC5884m).mo5481a(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C27241 c27241 = new C27241(this.$this_asFlow, interfaceC5631c);
            c27241.L$0 = obj;
            return c27241;
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r1 = this.label;
            try {
            } catch (Throwable th) {
                C5609e c5609e = AbstractC5896f0.f9343a;
                InterfaceC5636h interfaceC5636hPlus = AbstractC5479k.f8471a.f8411d.plus(C5963g1.f9452a);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, r1, null);
                this.L$0 = th;
                this.label = 3;
                if (AbstractC6014x.m5626F(interfaceC5636hPlus, anonymousClass2, this) != coroutineSingletons) {
                    throw th;
                }
            }
            if (r1 == 0) {
                AbstractC5774b.m5119b(obj);
                final InterfaceC5884m interfaceC5884m = (InterfaceC5884m) this.L$0;
                Observer observer2 = new Observer() { // from class: androidx.lifecycle.e
                    @Override // android.view.Observer
                    public final void onChanged(Object obj2) {
                        FlowLiveDataConversions.C27241.invokeSuspend$lambda$0(interfaceC5884m, obj2);
                    }
                };
                C5609e c5609e2 = AbstractC5896f0.f9343a;
                C5447d c5447d = AbstractC5479k.f8471a.f8411d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, observer2, null);
                this.L$0 = observer2;
                this.label = 1;
                observer = observer2;
                if (AbstractC6014x.m5626F(c5447d, anonymousClass1, this) == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (r1 != 1) {
                if (r1 == 2) {
                    Observer observer3 = (Observer) this.L$0;
                    AbstractC5774b.m5119b(obj);
                    r1 = observer3;
                    throw new KotlinNothingValueException();
                }
                if (r1 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.L$0;
                AbstractC5774b.m5119b(obj);
                throw th2;
            }
            Observer observer4 = (Observer) this.L$0;
            AbstractC5774b.m5119b(obj);
            observer = observer4;
            this.L$0 = observer;
            this.label = 2;
            r1 = observer;
            if (AbstractC6014x.m5634e(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw new KotlinNothingValueException();
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC5884m interfaceC5884m, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C27241) create(interfaceC5884m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveDataScope;", "Ld6/s;", "<anonymous>", "(Landroidx/lifecycle/LiveDataScope;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m5303f = "FlowLiveData.kt", m5304i = {}, m5305l = {78}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1 */
    public static final class C27251 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC5910f $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27251(InterfaceC5910f interfaceC5910f, InterfaceC5631c<? super C27251> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_asLiveData = interfaceC5910f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C27251 c27251 = new C27251(this.$this_asLiveData, interfaceC5631c);
            c27251.L$0 = obj;
            return c27251;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(LiveDataScope<T> liveDataScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C27251) create(liveDataScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                InterfaceC5910f interfaceC5910f = this.$this_asLiveData;
                InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC5912g
                    public final Object emit(T t8, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        Object objEmit = liveDataScope.emit(t8, interfaceC5631c);
                        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : C5443s.f8405a;
                    }
                };
                this.label = 1;
                if (interfaceC5910f.collect(interfaceC5912g, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    @NotNull
    public static final <T> InterfaceC5910f asFlow(@NotNull LiveData<T> liveData) {
        AbstractC5830k.m5330g(liveData, "<this>");
        return AbstractC5914h.m5550f(AbstractC5914h.m5551g(new C27241(liveData, null)), -1);
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull InterfaceC5910f interfaceC5910f) {
        AbstractC5830k.m5330g(interfaceC5910f, "<this>");
        return asLiveData$default(interfaceC5910f, (InterfaceC5636h) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC5910f interfaceC5910f, InterfaceC5636h interfaceC5636h, long j7, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j7 = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        }
        return asLiveData(interfaceC5910f, interfaceC5636h, j7);
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull InterfaceC5910f interfaceC5910f, @NotNull InterfaceC5636h context) {
        AbstractC5830k.m5330g(interfaceC5910f, "<this>");
        AbstractC5830k.m5330g(context, "context");
        return asLiveData$default(interfaceC5910f, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull InterfaceC5910f interfaceC5910f, @NotNull InterfaceC5636h context, long j7) {
        AbstractC5830k.m5330g(interfaceC5910f, "<this>");
        AbstractC5830k.m5330g(context, "context");
        ObjectBoxLiveData objectBoxLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j7, new C27251(interfaceC5910f, null));
        if (interfaceC5910f instanceof InterfaceC5944m0) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                objectBoxLiveData.setValue(((InterfaceC5944m0) interfaceC5910f).getValue());
                return objectBoxLiveData;
            }
            objectBoxLiveData.postValue(((InterfaceC5944m0) interfaceC5910f).getValue());
        }
        return objectBoxLiveData;
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC5910f interfaceC5910f, Duration duration, InterfaceC5636h interfaceC5636h, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(interfaceC5910f, duration, interfaceC5636h);
    }

    @RequiresApi(26)
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull InterfaceC5910f interfaceC5910f, @NotNull Duration timeout, @NotNull InterfaceC5636h context) {
        AbstractC5830k.m5330g(interfaceC5910f, "<this>");
        AbstractC5830k.m5330g(timeout, "timeout");
        AbstractC5830k.m5330g(context, "context");
        return asLiveData(interfaceC5910f, context, C6891Api26Impl.INSTANCE.toMillis(timeout));
    }
}
