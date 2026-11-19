package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;

@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0097@¢\u0006\u0002\u0010\u0019R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m13558d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveDataScope;", TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/CoroutineLiveData;", "context", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/CoroutineContext;)V", "getTarget$lifecycle_livedata_release", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "latestValue", "getLatestValue", "()Ljava/lang/Object;", "coroutineContext", "emitSource", "Lkotlinx/coroutines/DisposableHandle;", "source", "Landroidx/lifecycle/LiveData;", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-livedata_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final CoroutineContext coroutineContext;
    private CoroutineLiveData<T> target;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m13596f = "CoroutineLiveData.kt", m13597i = {}, m13598l = {98}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2 */
    public static final class C39222 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39222(LiveDataScopeImpl<T> liveDataScopeImpl, T t10, Continuation<? super C39222> continuation) {
            super(2, continuation);
            this.this$0 = liveDataScopeImpl;
            this.$value = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C39222(this.this$0, this.$value, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
                this.label = 1;
                if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39222) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", m13596f = "CoroutineLiveData.kt", m13597i = {}, m13598l = {92}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2 */
    public static final class C39232 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DisposableHandle>, Object> {
        final /* synthetic */ LiveData<T> $source;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39232(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, Continuation<? super C39232> continuation) {
            super(2, continuation);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C39232(this.this$0, this.$source, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            LiveData<T> liveData = this.$source;
            this.label = 1;
            Object objEmitSource$lifecycle_livedata_release = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(liveData, this);
            return objEmitSource$lifecycle_livedata_release == coroutine_suspended ? coroutine_suspended : objEmitSource$lifecycle_livedata_release;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DisposableHandle> continuation) {
            return ((C39232) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LiveDataScopeImpl(CoroutineLiveData<T> target, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(Dispatchers.getMain().getImmediate());
    }

    @Override // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.coroutineContext, new C39222(this, t10, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, Continuation<? super DisposableHandle> continuation) {
        return BuildersKt.withContext(this.coroutineContext, new C39232(this, liveData, null), continuation);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        Intrinsics.checkNotNullParameter(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
