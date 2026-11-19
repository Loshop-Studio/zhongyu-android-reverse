package com.kunminx.architecture.p040ui.callback;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ProtectedUnPeekLiveData<T> extends LiveData<T> {

    /* renamed from: a */
    public final AtomicInteger f4651a = new AtomicInteger(-1);

    /* renamed from: b */
    public boolean f4652b;

    /* renamed from: com.kunminx.architecture.ui.callback.ProtectedUnPeekLiveData$a */
    public class C6326a implements Observer {

        /* renamed from: a */
        public final Observer f4653a;

        /* renamed from: b */
        public int f4654b;

        public C6326a(Observer observer, int i10) {
            this.f4653a = observer;
            this.f4654b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.f4653a, ((C6326a) obj).f4653a);
        }

        public int hashCode() {
            return Objects.hash(this.f4653a);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            if (ProtectedUnPeekLiveData.this.f4651a.get() > this.f4654b) {
                if (obj != null || ProtectedUnPeekLiveData.this.f4652b) {
                    this.f4653a.onChanged(obj);
                }
            }
        }
    }

    /* renamed from: b */
    public final C6326a m4370b(Observer observer, int i10) {
        return new C6326a(observer, i10);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        super.observe(lifecycleOwner, m4370b(observer, this.f4651a.get()));
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer observer) {
        super.observeForever(m4370b(observer, this.f4651a.get()));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer observer) {
        if (observer.getClass().isAssignableFrom(C6326a.class)) {
            super.removeObserver(observer);
        } else {
            super.removeObserver(m4370b(observer, -1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        this.f4651a.getAndIncrement();
        super.setValue(obj);
    }
}
