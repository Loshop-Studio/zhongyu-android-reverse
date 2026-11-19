package androidx.databinding;

import android.view.LifecycleOwner;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
class WeakListener<T> extends WeakReference<ViewDataBinding> {
    protected final int mLocalFieldId;
    private final ObservableReference<T> mObservable;
    private T mTarget;

    public WeakListener(ViewDataBinding viewDataBinding, int i, ObservableReference<T> observableReference, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.mLocalFieldId = i;
        this.mObservable = observableReference;
    }

    @Nullable
    public ViewDataBinding getBinder() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            unregister();
        }
        return viewDataBinding;
    }

    public T getTarget() {
        return this.mTarget;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.mObservable.setLifecycleOwner(lifecycleOwner);
    }

    public void setTarget(T t8) {
        unregister();
        this.mTarget = t8;
        if (t8 != null) {
            this.mObservable.addListener(t8);
        }
    }

    public boolean unregister() {
        boolean z8;
        T t8 = this.mTarget;
        if (t8 != null) {
            this.mObservable.removeListener(t8);
            z8 = true;
        } else {
            z8 = false;
        }
        this.mTarget = null;
        return z8;
    }
}
