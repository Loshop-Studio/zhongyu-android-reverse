package android.view;

import android.annotation.SuppressLint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC5962g0;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m5110d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveDataScope;", "Landroidx/lifecycle/CoroutineLiveData;", TypedValues.AttributesType.S_TARGET, "Lh6/h;", "context", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lh6/h;)V", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/g0;", "emitSource", "(Landroidx/lifecycle/LiveData;Lh6/c;)Ljava/lang/Object;", "value", "Ld6/s;", "emit", "(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "Landroidx/lifecycle/CoroutineLiveData;", "getTarget$lifecycle_livedata_release", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "coroutineContext", "Lh6/h;", "getLatestValue", "()Ljava/lang/Object;", "latestValue", "lifecycle-livedata_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {

    @NotNull
    private final InterfaceC5636h coroutineContext;

    @NotNull
    private CoroutineLiveData<T> target;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m5303f = "CoroutineLiveData.kt", m5304i = {}, m5305l = {98}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2 */
    public static final class C27322 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27322(LiveDataScopeImpl<T> liveDataScopeImpl, T t8, InterfaceC5631c<? super C27322> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.this$0 = liveDataScopeImpl;
            this.$value = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C27322(this.this$0, this.$value, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
                this.label = 1;
                if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C27322) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/g0;", "<anonymous>", "(Lkotlinx/coroutines/v;)Lkotlinx/coroutines/g0;"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", m5303f = "CoroutineLiveData.kt", m5304i = {}, m5305l = {92}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2 */
    public static final class C27332 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ LiveData<T> $source;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27332(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, InterfaceC5631c<? super C27332> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C27332(this.this$0, this.$source, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                return obj;
            }
            AbstractC5774b.m5119b(obj);
            CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            LiveData<T> liveData = this.$source;
            this.label = 1;
            Object objEmitSource$lifecycle_livedata_release = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(liveData, this);
            return objEmitSource$lifecycle_livedata_release == coroutineSingletons ? coroutineSingletons : objEmitSource$lifecycle_livedata_release;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super InterfaceC5962g0> interfaceC5631c) {
            return ((C27332) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public LiveDataScopeImpl(@NotNull CoroutineLiveData<T> target, @NotNull InterfaceC5636h context) {
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(context, "context");
        this.target = target;
        C5609e c5609e = AbstractC5896f0.f9343a;
        this.coroutineContext = context.plus(AbstractC5479k.f8471a.f8411d);
    }

    @Override // android.view.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    @Nullable
    public Object emit(T t8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) throws Throwable {
        Object objM5626F = AbstractC6014x.m5626F(this.coroutineContext, new C27322(this, t8, null), interfaceC5631c);
        return objM5626F == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5626F : C5443s.f8405a;
    }

    @Override // android.view.LiveDataScope
    @Nullable
    public Object emitSource(@NotNull LiveData<T> liveData, @NotNull InterfaceC5631c<? super InterfaceC5962g0> interfaceC5631c) {
        return AbstractC6014x.m5626F(this.coroutineContext, new C27332(this, liveData, null), interfaceC5631c);
    }

    @Override // android.view.LiveDataScope
    @Nullable
    public T getLatestValue() {
        return this.target.getValue();
    }

    @NotNull
    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(@NotNull CoroutineLiveData<T> coroutineLiveData) {
        AbstractC5830k.m5330g(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
