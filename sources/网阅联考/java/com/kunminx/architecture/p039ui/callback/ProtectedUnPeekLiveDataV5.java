package com.kunminx.architecture.p039ui.callback;

import androidx.arch.core.internal.SafeIterableMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes2.dex */
public class ProtectedUnPeekLiveDataV5<T> extends LiveData<T> {

    /* renamed from: a */
    public boolean f1294a;

    /* renamed from: b */
    public final ConcurrentHashMap f1295b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentHashMap f1296c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ConcurrentHashMap f1297d = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m2259d(Integer num, Observer observer, Object obj) {
        if (((Boolean) this.f1295b.get(num)).booleanValue()) {
            return;
        }
        this.f1295b.put(num, Boolean.TRUE);
        if (obj != null || this.f1294a) {
            observer.onChanged(obj);
        }
    }

    /* renamed from: b */
    public final Observer m2260b(final Observer observer, final Integer num) {
        return new Observer() { // from class: i0.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f4514a.m2259d(num, observer, obj);
            }
        };
    }

    /* renamed from: c */
    public final Observer m2261c(LiveData liveData, Integer num) throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = LiveData.class.getDeclaredField("mObservers");
            declaredField.setAccessible(true);
            SafeIterableMap safeIterableMap = (SafeIterableMap) declaredField.get(liveData);
            if (safeIterableMap == null) {
                return null;
            }
            Iterator it = safeIterableMap.iterator();
            while (it.hasNext()) {
                Observer observer = (Observer) ((Map.Entry) it.next()).getKey();
                if (System.identityHashCode(observer) == num.intValue()) {
                    return observer;
                }
            }
            return null;
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            return null;
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public final void m2262e(Integer num, LifecycleOwner lifecycleOwner, Observer observer) throws NoSuchFieldException, SecurityException {
        Observer<? super T> observerM2260b;
        if (this.f1295b.get(num) == null) {
            this.f1295b.put(num, Boolean.TRUE);
        }
        if (this.f1296c.get(num) == null) {
            observerM2260b = m2260b(observer, num);
            this.f1296c.put(num, Integer.valueOf(System.identityHashCode(observerM2260b)));
        } else {
            Observer<? super T> observerM2261c = m2261c(this, (Integer) this.f1296c.get(num));
            if (observerM2261c == null) {
                observerM2260b = m2260b(observer, num);
                this.f1296c.put(num, Integer.valueOf(System.identityHashCode(observerM2260b)));
            } else {
                observerM2260b = observerM2261c;
            }
        }
        super.observe(lifecycleOwner, observerM2260b);
    }

    /* renamed from: f */
    public final void m2263f(Integer num, Observer observer) {
        if (this.f1295b.get(num) == null) {
            this.f1295b.put(num, Boolean.TRUE);
        }
        Observer<? super T> observerM2260b = (Observer) this.f1297d.get(num);
        if (observerM2260b == null) {
            observerM2260b = m2260b(observer, num);
            this.f1297d.put(num, observerM2260b);
        }
        super.observeForever(observerM2260b);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer observer) throws NoSuchFieldException, SecurityException {
        if (lifecycleOwner instanceof Fragment) {
            Fragment fragment = (Fragment) lifecycleOwner;
            if (fragment.getViewLifecycleOwner() != null) {
                lifecycleOwner = fragment.getViewLifecycleOwner();
            }
        }
        m2262e(Integer.valueOf(System.identityHashCode(observer)), lifecycleOwner, observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer observer) {
        m2263f(Integer.valueOf(System.identityHashCode(observer)), observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer observer) throws NoSuchFieldException, SecurityException {
        Integer numValueOf = Integer.valueOf(System.identityHashCode(observer));
        Observer observerM2261c = (Observer) this.f1297d.remove(numValueOf);
        if (observerM2261c == null && this.f1296c.containsKey(numValueOf)) {
            observerM2261c = m2261c(this, (Integer) this.f1296c.remove(numValueOf));
        }
        if (observerM2261c != null) {
            this.f1295b.remove(numValueOf);
        }
        if (observerM2261c != null) {
            observer = observerM2261c;
        }
        super.removeObserver(observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        if (obj != 0 || this.f1294a) {
            Iterator it = this.f1295b.entrySet().iterator();
            while (it.hasNext()) {
                ((Map.Entry) it.next()).setValue(Boolean.FALSE);
            }
            super.setValue(obj);
        }
    }
}
