package androidx.databinding;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
class WeakListener<T> extends WeakReference<ViewDataBinding> {
    protected final int mLocalFieldId;
    private final ObservableReference<T> mObservable;
    private T mTarget;

    public WeakListener(ViewDataBinding viewDataBinding, int i10, ObservableReference<T> observableReference, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.mLocalFieldId = i10;
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

    public void setTarget(T t10) {
        unregister();
        this.mTarget = t10;
        if (t10 != null) {
            this.mObservable.addListener(t10);
        }
    }

    public boolean unregister() {
        boolean z9;
        T t10 = this.mTarget;
        if (t10 != null) {
            this.mObservable.removeListener(t10);
            z9 = true;
        } else {
            z9 = false;
        }
        this.mTarget = null;
        return z9;
    }
}
