package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8849k0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class EmittedSource implements InterfaceC8849k0 {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    @InterfaceC9539d(m17800c = "androidx.lifecycle.EmittedSource$dispose$1", m17801f = "CoroutineLiveData.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.EmittedSource$dispose$1 */
    public static final class C40341 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C40341(InterfaceC9324c<? super C40341> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return EmittedSource.this.new C40341(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40341) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            EmittedSource.this.removeSource();
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.lifecycle.EmittedSource$disposeNow$2", m17801f = "CoroutineLiveData.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.EmittedSource$disposeNow$2 */
    public static final class C40352 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C40352(InterfaceC9324c<? super C40352> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return EmittedSource.this.new C40352(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40352) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            EmittedSource.this.removeSource();
            return C8736p.f16368a;
        }
    }

    public EmittedSource(LiveData<?> source, MediatorLiveData<?> mediator) {
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (this.disposed) {
            return;
        }
        this.mediator.removeSource(this.source);
        this.disposed = true;
    }

    @Override // p135i8.InterfaceC8849k0
    public void dispose() {
        AbstractC8839h.m14861d(AbstractC9165e.m16552a(C8843i0.m14868c().mo15693o()), null, null, new C40341(null), 3, null);
    }

    public final Object disposeNow(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM14848g = AbstractC8833f.m14848g(C8843i0.m14868c().mo15693o(), new C40352(null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
    }
}
