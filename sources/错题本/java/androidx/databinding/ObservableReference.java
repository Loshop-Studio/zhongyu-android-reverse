package androidx.databinding;

import android.view.LifecycleOwner;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
interface ObservableReference<T> {
    void addListener(T t8);

    WeakListener<T> getListener();

    void removeListener(T t8);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);
}
