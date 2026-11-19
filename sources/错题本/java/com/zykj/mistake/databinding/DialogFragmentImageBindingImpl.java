package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class DialogFragmentImageBindingImpl extends DialogFragmentImageBinding {

    /* renamed from: e */
    public static final SparseIntArray f6107e;

    /* renamed from: d */
    public long f6108d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6107e = sparseIntArray;
        sparseIntArray.put(R.id.iv_image, 1);
        sparseIntArray.put(R.id.iv_close, 2);
        sparseIntArray.put(R.id.iv_delete, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6108d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6108d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6108d = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean onFieldChange(int i, Object obj, int i8) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean setVariable(int i, Object obj) {
        return true;
    }
}
