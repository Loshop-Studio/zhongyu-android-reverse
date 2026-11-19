package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class LiveDataKt {
    @InterfaceC10770a
    @MainThread
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner owner, final InterfaceC9540l onChanged) {
        AbstractC9979u.m20294g(liveData, "<this>");
        AbstractC9979u.m20294g(owner, "owner");
        AbstractC9979u.m20294g(onChanged, "onChanged");
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
