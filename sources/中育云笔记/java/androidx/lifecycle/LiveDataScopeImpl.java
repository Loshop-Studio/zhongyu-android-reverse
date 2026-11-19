package androidx.lifecycle;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import sd.InterfaceC11163t0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final InterfaceC9945d coroutineContext;
    private CoroutineLiveData<T> target;

    @InterfaceC11829d(m26210c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m26211f = "CoroutineLiveData.kt", m26212l = {98}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2 */
    public static final class C39192 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39192(LiveDataScopeImpl<T> liveDataScopeImpl, T t10, InterfaceC11588c<? super C39192> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = liveDataScopeImpl;
            this.$value = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C39192(this.this$0, this.$value, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
                this.label = 1;
                if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C39192) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", m26211f = "CoroutineLiveData.kt", m26212l = {C7843ab.b.API_MYNA_STOP}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2 */
    public static final class C39202 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ LiveData<T> $source;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39202(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, InterfaceC11588c<? super C39202> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C39202(this.this$0, this.$source, interfaceC11588c);
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
            CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            LiveData<T> liveData = this.$source;
            this.label = 1;
            Object objEmitSource$lifecycle_livedata_release = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(liveData, this);
            return objEmitSource$lifecycle_livedata_release == objM25952f ? objM25952f : objEmitSource$lifecycle_livedata_release;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super InterfaceC11163t0> interfaceC11588c) {
            return ((C39202) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public LiveDataScopeImpl(CoroutineLiveData<T> target, InterfaceC9945d context) {
        AbstractC9979u.m20294g(target, "target");
        AbstractC9979u.m20294g(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(C11157r0.m24800c().mo25209k());
    }

    @Override // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(this.coroutineContext, new C39192(this, t10, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, InterfaceC11588c<? super InterfaceC11163t0> interfaceC11588c) {
        return AbstractC11109f.m24709g(this.coroutineContext, new C39202(this, liveData, null), interfaceC11588c);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        AbstractC9979u.m20294g(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
