package androidx.databinding;

import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class OnRebindCallback<T extends ViewDataBinding> {
    public void onBound(T t9) {
    }

    public void onCanceled(T t9) {
    }

    public boolean onPreBind(T t9) {
        return true;
    }
}
