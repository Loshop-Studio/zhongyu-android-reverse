package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
interface ObservableReference<T> {
    void addListener(T t9);

    WeakListener<T> getListener();

    void removeListener(T t9);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);
}
