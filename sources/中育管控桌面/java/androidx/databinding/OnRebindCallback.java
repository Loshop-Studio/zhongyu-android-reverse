package androidx.databinding;

import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class OnRebindCallback<T extends ViewDataBinding> {
    public void onBound(T t6) {
    }

    public void onCanceled(T t6) {
    }

    public boolean onPreBind(T t6) {
        return true;
    }
}
