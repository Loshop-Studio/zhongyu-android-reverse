package com.kunminx.architecture.p043ui.callback;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class ProtectedUnPeekLiveData<T> extends LiveData<T> {

    /* renamed from: a */
    public final AtomicInteger f4214a = new AtomicInteger(-1);

    /* renamed from: b */
    public boolean f4215b;

    /* renamed from: com.kunminx.architecture.ui.callback.ProtectedUnPeekLiveData$a */
    public class C6398a implements Observer {

        /* renamed from: a */
        public final Observer f4216a;

        /* renamed from: b */
        public int f4217b;

        public C6398a(Observer observer, int i10) {
            this.f4216a = observer;
            this.f4217b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.f4216a, ((C6398a) obj).f4216a);
        }

        public int hashCode() {
            return Objects.hash(this.f4216a);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            if (ProtectedUnPeekLiveData.this.f4214a.get() > this.f4217b) {
                if (obj != null || ProtectedUnPeekLiveData.this.f4215b) {
                    this.f4216a.onChanged(obj);
                }
            }
        }
    }

    /* renamed from: b */
    public final C6398a m3982b(Observer observer, int i10) {
        return new C6398a(observer, i10);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        super.observe(lifecycleOwner, m3982b(observer, this.f4214a.get()));
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer observer) {
        super.observeForever(m3982b(observer, this.f4214a.get()));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer observer) {
        if (observer.getClass().isAssignableFrom(C6398a.class)) {
            super.removeObserver(observer);
        } else {
            super.removeObserver(m3982b(observer, -1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        this.f4214a.getAndIncrement();
        super.setValue(obj);
    }
}
