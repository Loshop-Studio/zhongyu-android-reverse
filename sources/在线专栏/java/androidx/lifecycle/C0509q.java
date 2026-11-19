package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p098i.C2661b;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public class C0509q<T> extends C0511s<T> {

    /* renamed from: a */
    private C2661b<LiveData<?>, a<?>> f3444a = new C2661b<>();

    /* renamed from: androidx.lifecycle.q$a */
    private static class a<V> implements InterfaceC0512t<V> {

        /* renamed from: a */
        final LiveData<V> f3445a;

        /* renamed from: b */
        final InterfaceC0512t<? super V> f3446b;

        /* renamed from: c */
        int f3447c = -1;

        a(LiveData<V> liveData, InterfaceC0512t<? super V> interfaceC0512t) {
            this.f3445a = liveData;
            this.f3446b = interfaceC0512t;
        }

        @Override // androidx.lifecycle.InterfaceC0512t
        /* renamed from: a */
        public void mo2584a(V v3) {
            if (this.f3447c != this.f3445a.getVersion()) {
                this.f3447c = this.f3445a.getVersion();
                this.f3446b.mo2584a(v3);
            }
        }

        /* renamed from: b */
        void m2903b() {
            this.f3445a.observeForever(this);
        }

        /* renamed from: c */
        void m2904c() {
            this.f3445a.removeObserver(this);
        }
    }

    /* renamed from: a */
    public <S> void m2902a(LiveData<S> liveData, InterfaceC0512t<? super S> interfaceC0512t) {
        a<?> aVar = new a<>(liveData, interfaceC0512t);
        a<?> aVarMo8932f = this.f3444a.mo8932f(liveData, aVar);
        if (aVarMo8932f != null && aVarMo8932f.f3446b != interfaceC0512t) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarMo8932f == null && hasActiveObservers()) {
            aVar.m2903b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f3444a.iterator();
        while (it.hasNext()) {
            it.next().getValue().m2903b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f3444a.iterator();
        while (it.hasNext()) {
            it.next().getValue().m2904c();
        }
    }
}
