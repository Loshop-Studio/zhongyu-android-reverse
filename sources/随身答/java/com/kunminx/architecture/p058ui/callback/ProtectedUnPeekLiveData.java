package com.kunminx.architecture.p058ui.callback;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ProtectedUnPeekLiveData<T> extends LiveData<T> {

    /* renamed from: a */
    public boolean f5242a;

    /* renamed from: b */
    public final ConcurrentHashMap f5243b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentHashMap f5244c = new ConcurrentHashMap();

    /* renamed from: com.kunminx.architecture.ui.callback.ProtectedUnPeekLiveData$a */
    public class C6591a implements Observer {

        /* renamed from: a */
        public final Observer f5245a;

        public C6591a(Observer observer) {
            this.f5245a = observer;
        }

        /* renamed from: a */
        public Observer m4565a() {
            return this.f5245a;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            if (ProtectedUnPeekLiveData.this.f5243b.get(this.f5245a) == null || !((Boolean) ProtectedUnPeekLiveData.this.f5243b.get(this.f5245a)).booleanValue()) {
                return;
            }
            ProtectedUnPeekLiveData.this.f5243b.put(this.f5245a, Boolean.FALSE);
            if (obj != null || ProtectedUnPeekLiveData.this.f5242a) {
                this.f5245a.onChanged(obj);
            }
        }
    }

    /* renamed from: b */
    public final Observer m4564b(Observer observer) {
        if (this.f5243b.containsKey(observer)) {
            return null;
        }
        this.f5243b.put(observer, Boolean.FALSE);
        C6591a c6591a = new C6591a(observer);
        this.f5244c.put(observer, c6591a);
        return c6591a;
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        Observer<? super T> observerM4564b = m4564b(observer);
        if (observerM4564b != null) {
            super.observe(lifecycleOwner, observerM4564b);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer observer) {
        Observer<? super T> observerM4564b = m4564b(observer);
        if (observerM4564b != null) {
            super.observeForever(observerM4564b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer observer) {
        Observer observerM4565a;
        if (observer instanceof C6591a) {
            observerM4565a = ((C6591a) observer).m4565a();
        } else {
            Observer observer2 = (Observer) this.f5244c.get(observer);
            if (observer2 == null) {
                observer = null;
            }
            observerM4565a = observer;
            observer = observer2;
        }
        if (observer == null || observerM4565a == null) {
            return;
        }
        this.f5244c.remove(observerM4565a);
        this.f5243b.remove(observerM4565a);
        super.removeObserver(observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        if (obj != 0 || this.f5242a) {
            Iterator it = this.f5243b.entrySet().iterator();
            while (it.hasNext()) {
                ((Map.Entry) it.next()).setValue(Boolean.TRUE);
            }
            super.setValue(obj);
        }
    }
}
