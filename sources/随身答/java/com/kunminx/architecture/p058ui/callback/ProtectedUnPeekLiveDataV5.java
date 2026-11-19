package com.kunminx.architecture.p058ui.callback;

import androidx.arch.core.internal.SafeIterableMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.kunminx.architecture.p058ui.callback.ProtectedUnPeekLiveDataV5;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes4.dex */
public class ProtectedUnPeekLiveDataV5<T> extends LiveData<T> {

    /* renamed from: a */
    public boolean f5258a;

    /* renamed from: b */
    public final ConcurrentHashMap f5259b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentHashMap f5260c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ConcurrentHashMap f5261d = new ConcurrentHashMap();

    /* renamed from: a */
    public static /* synthetic */ void m4569a(ProtectedUnPeekLiveDataV5 protectedUnPeekLiveDataV5, Integer num, Observer observer, Object obj) {
        if (((Boolean) protectedUnPeekLiveDataV5.f5259b.get(num)).booleanValue()) {
            return;
        }
        protectedUnPeekLiveDataV5.f5259b.put(num, Boolean.TRUE);
        if (obj != null || protectedUnPeekLiveDataV5.f5258a) {
            observer.onChanged(obj);
        }
    }

    /* renamed from: b */
    public final Observer m4570b(final Observer observer, final Integer num) {
        return new Observer() { // from class: o1.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ProtectedUnPeekLiveDataV5.m4569a(this.f15469a, num, observer, obj);
            }
        };
    }

    /* renamed from: c */
    public final Observer m4571c(LiveData liveData, Integer num) throws NoSuchFieldException, SecurityException {
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
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return null;
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public final void m4572d(Integer num, LifecycleOwner lifecycleOwner, Observer observer) throws NoSuchFieldException, SecurityException {
        Observer<? super T> observerM4570b;
        if (this.f5259b.get(num) == null) {
            this.f5259b.put(num, Boolean.TRUE);
        }
        if (this.f5260c.get(num) == null) {
            observerM4570b = m4570b(observer, num);
            this.f5260c.put(num, Integer.valueOf(System.identityHashCode(observerM4570b)));
        } else {
            Observer<? super T> observerM4571c = m4571c(this, (Integer) this.f5260c.get(num));
            if (observerM4571c == null) {
                observerM4570b = m4570b(observer, num);
                this.f5260c.put(num, Integer.valueOf(System.identityHashCode(observerM4570b)));
            } else {
                observerM4570b = observerM4571c;
            }
        }
        super.observe(lifecycleOwner, observerM4570b);
    }

    /* renamed from: e */
    public final void m4573e(Integer num, Observer observer) {
        if (this.f5259b.get(num) == null) {
            this.f5259b.put(num, Boolean.TRUE);
        }
        Observer<? super T> observerM4570b = (Observer) this.f5261d.get(num);
        if (observerM4570b == null) {
            observerM4570b = m4570b(observer, num);
            this.f5261d.put(num, observerM4570b);
        }
        super.observeForever(observerM4570b);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer observer) throws NoSuchFieldException, SecurityException {
        if (lifecycleOwner instanceof Fragment) {
            Fragment fragment = (Fragment) lifecycleOwner;
            if (fragment.getViewLifecycleOwner() != null) {
                lifecycleOwner = fragment.getViewLifecycleOwner();
            }
        }
        m4572d(Integer.valueOf(System.identityHashCode(observer)), lifecycleOwner, observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer observer) {
        m4573e(Integer.valueOf(System.identityHashCode(observer)), observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer observer) throws NoSuchFieldException, SecurityException {
        Integer numValueOf = Integer.valueOf(System.identityHashCode(observer));
        Observer observerM4571c = (Observer) this.f5261d.remove(numValueOf);
        if (observerM4571c == null && this.f5260c.containsKey(numValueOf)) {
            observerM4571c = m4571c(this, (Integer) this.f5260c.remove(numValueOf));
        }
        if (observerM4571c != null) {
            this.f5259b.remove(numValueOf);
        }
        if (observerM4571c != null) {
            observer = observerM4571c;
        }
        super.removeObserver(observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        if (obj != 0 || this.f5258a) {
            Iterator it = this.f5259b.entrySet().iterator();
            while (it.hasNext()) {
                ((Map.Entry) it.next()).setValue(Boolean.FALSE);
            }
            super.setValue(obj);
        }
    }
}
