package com.kunminx.architecture.p031ui.callback;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class ProtectedUnPeekLiveData<T> extends LiveData<T> {

    /* renamed from: a */
    public final AtomicInteger f3669a = new AtomicInteger(-1);

    /* renamed from: b */
    public boolean f3670b;

    /* renamed from: com.kunminx.architecture.ui.callback.ProtectedUnPeekLiveData$a */
    public class C5724a implements Observer {

        /* renamed from: a */
        public final Observer f3671a;

        /* renamed from: b */
        public int f3672b;

        public C5724a(Observer observer, int i6) {
            this.f3671a = observer;
            this.f3672b = i6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.f3671a, ((C5724a) obj).f3671a);
        }

        public int hashCode() {
            return Objects.hash(this.f3671a);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            if (ProtectedUnPeekLiveData.this.f3669a.get() > this.f3672b) {
                if (obj != null || ProtectedUnPeekLiveData.this.f3670b) {
                    this.f3671a.onChanged(obj);
                }
            }
        }
    }

    /* renamed from: b */
    public final C5724a m3742b(Observer observer, int i6) {
        return new C5724a(observer, i6);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        super.observe(lifecycleOwner, m3742b(observer, this.f3669a.get()));
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer observer) {
        super.observeForever(m3742b(observer, this.f3669a.get()));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer observer) {
        if (observer.getClass().isAssignableFrom(C5724a.class)) {
            super.removeObserver(observer);
        } else {
            super.removeObserver(m3742b(observer, -1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        this.f3669a.getAndIncrement();
        super.setValue(obj);
    }
}
