package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class LiveDataKt {
    @InterfaceC8721a
    @MainThread
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner owner, final InterfaceC10570l onChanged) {
        AbstractC9133u.m16133g(liveData, "<this>");
        AbstractC9133u.m16133g(owner, "owner");
        AbstractC9133u.m16133g(onChanged, "onChanged");
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t10) {
                onChanged.invoke(t10);
            }
        };
        liveData.observe(owner, observer);
        return observer;
    }
}
