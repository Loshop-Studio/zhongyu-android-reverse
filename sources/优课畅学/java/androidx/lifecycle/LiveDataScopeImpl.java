package androidx.lifecycle;

import android.annotation.SuppressLint;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8849k0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final InterfaceC9100d coroutineContext;
    private CoroutineLiveData<T> target;

    @InterfaceC9539d(m17800c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m17801f = "CoroutineLiveData.kt", m17802l = {98}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2 */
    public static final class C40452 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40452(LiveDataScopeImpl<T> liveDataScopeImpl, T t10, InterfaceC9324c<? super C40452> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = liveDataScopeImpl;
            this.$value = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C40452(this.this$0, this.$value, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40452) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
                this.label = 1;
                if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", m17801f = "CoroutineLiveData.kt", m17802l = {92}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2 */
    public static final class C40462 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ LiveData<T> $source;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40462(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, InterfaceC9324c<? super C40462> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C40462(this.this$0, this.$source, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super InterfaceC8849k0> interfaceC9324c) {
            return ((C40462) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            LiveData<T> liveData = this.$source;
            this.label = 1;
            Object objEmitSource$lifecycle_livedata_release = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(liveData, this);
            return objEmitSource$lifecycle_livedata_release == objM17291f ? objM17291f : objEmitSource$lifecycle_livedata_release;
        }
    }

    public LiveDataScopeImpl(CoroutineLiveData<T> target, InterfaceC9100d context) {
        AbstractC9133u.m16133g(target, "target");
        AbstractC9133u.m16133g(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(C8843i0.m14868c().mo15693o());
    }

    @Override // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM14848g = AbstractC8833f.m14848g(this.coroutineContext, new C40452(this, t10, null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, InterfaceC9324c<? super InterfaceC8849k0> interfaceC9324c) {
        return AbstractC8833f.m14848g(this.coroutineContext, new C40462(this, liveData, null), interfaceC9324c);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        AbstractC9133u.m16133g(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
