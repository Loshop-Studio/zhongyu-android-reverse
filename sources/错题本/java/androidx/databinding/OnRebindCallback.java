package androidx.databinding;

import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class OnRebindCallback<T extends ViewDataBinding> {
    public void onBound(T t8) {
    }

    public void onCanceled(T t8) {
    }

    public boolean onPreBind(T t8) {
        return true;
    }
}
