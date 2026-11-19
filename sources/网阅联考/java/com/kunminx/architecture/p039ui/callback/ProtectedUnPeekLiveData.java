package com.kunminx.architecture.p039ui.callback;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ProtectedUnPeekLiveData<T> extends LiveData<T> {

    /* renamed from: a */
    public boolean f1278a;

    /* renamed from: b */
    public final ConcurrentHashMap f1279b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentHashMap f1280c = new ConcurrentHashMap();

    /* renamed from: com.kunminx.architecture.ui.callback.ProtectedUnPeekLiveData$a */
    public class C3295a implements Observer {

        /* renamed from: a */
        public final Observer f1281a;

        public C3295a(Observer observer) {
            this.f1281a = observer;
        }

        /* renamed from: a */
        public Observer m2253a() {
            return this.f1281a;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            if (ProtectedUnPeekLiveData.this.f1279b.get(this.f1281a) == null || !((Boolean) ProtectedUnPeekLiveData.this.f1279b.get(this.f1281a)).booleanValue()) {
                return;
            }
            ProtectedUnPeekLiveData.this.f1279b.put(this.f1281a, Boolean.FALSE);
            if (obj != null || ProtectedUnPeekLiveData.this.f1278a) {
                this.f1281a.onChanged(obj);
            }
        }
    }

    /* renamed from: b */
    public final Observer m2252b(Observer observer) {
        if (this.f1279b.containsKey(observer)) {
            return null;
        }
        this.f1279b.put(observer, Boolean.FALSE);
        C3295a c3295a = new C3295a(observer);
        this.f1280c.put(observer, c3295a);
        return c3295a;
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        Observer<? super T> observerM2252b = m2252b(observer);
        if (observerM2252b != null) {
            super.observe(lifecycleOwner, observerM2252b);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer observer) {
        Observer<? super T> observerM2252b = m2252b(observer);
        if (observerM2252b != null) {
            super.observeForever(observerM2252b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer observer) {
        Observer observerM2253a;
        if (observer instanceof C3295a) {
            observerM2253a = ((C3295a) observer).m2253a();
        } else {
            Observer observer2 = (Observer) this.f1280c.get(observer);
            if (observer2 == null) {
                observer = null;
            }
            observerM2253a = observer;
            observer = observer2;
        }
        if (observer == null || observerM2253a == null) {
            return;
        }
        this.f1280c.remove(observerM2253a);
        this.f1279b.remove(observerM2253a);
        super.removeObserver(observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        if (obj != 0 || this.f1278a) {
            Iterator it = this.f1279b.entrySet().iterator();
            while (it.hasNext()) {
                ((Map.Entry) it.next()).setValue(Boolean.TRUE);
            }
            super.setValue(obj);
        }
    }
}
