package android.view;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.time.Duration;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a^\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\\\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u00072-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*`\b\u0000\u0010\u0019\u001a\u0004\b\u0000\u0010\u0000\")\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u00102)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010¨\u0006\u001a"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/EmittedSource;", "addDisposableSource", "(Landroidx/lifecycle/MediatorLiveData;Landroidx/lifecycle/LiveData;Lh6/c;)Ljava/lang/Object;", "Lh6/h;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lh6/c;", "Ld6/s;", "", "Lkotlin/ExtensionFunctionType;", "block", "liveData", "(Lh6/h;JLr6/e;)Landroidx/lifecycle/LiveData;", "Ljava/time/Duration;", "timeout", "(Ljava/time/Duration;Lh6/h;Lr6/e;)Landroidx/lifecycle/LiveData;", "DEFAULT_TIMEOUT", "J", "Block", "lifecycle-livedata_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Landroidx/lifecycle/EmittedSource;", "<anonymous>", "(Lkotlinx/coroutines/v;)Landroidx/lifecycle/EmittedSource;"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", m5303f = "CoroutineLiveData.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 */
    public static final class C27202 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ LiveData<T> $source;
        final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27202(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, InterfaceC5631c<? super C27202> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_addDisposableSource = mediatorLiveData;
            this.$source = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s invokeSuspend$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return C5443s.f8405a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C27202(this.$this_addDisposableSource, this.$source, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new C2743c(mediatorLiveData, 0)));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super EmittedSource> interfaceC5631c) {
            return ((C27202) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Nullable
    public static final <T> Object addDisposableSource(@NotNull MediatorLiveData<T> mediatorLiveData, @NotNull LiveData<T> liveData, @NotNull InterfaceC5631c<? super EmittedSource> interfaceC5631c) {
        C5609e c5609e = AbstractC5896f0.f9343a;
        return AbstractC6014x.m5626F(AbstractC5479k.f8471a.f8411d, new C27202(mediatorLiveData, liveData, null), interfaceC5631c);
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull InterfaceC5636h context, @NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(InterfaceC5636h interfaceC5636h, long j7, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j7 = DEFAULT_TIMEOUT;
        }
        return liveData(interfaceC5636h, j7, interfaceC6473e);
    }

    @JvmOverloads
    @RequiresApi(26)
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull Duration timeout, @NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(timeout, "timeout");
        AbstractC5830k.m5330g(block, "block");
        return liveData$default(timeout, (InterfaceC5636h) null, block, 2, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        return liveData$default((InterfaceC5636h) null, 0L, block, 3, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, InterfaceC5636h interfaceC5636h, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        return liveData(duration, interfaceC5636h, interfaceC6473e);
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull InterfaceC5636h context, long j7, @NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(block, "block");
        return new CoroutineLiveData(context, j7, block);
    }

    @JvmOverloads
    @RequiresApi(26)
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull Duration timeout, @NotNull InterfaceC5636h context, @NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(timeout, "timeout");
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(block, "block");
        return new CoroutineLiveData(context, C6891Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
