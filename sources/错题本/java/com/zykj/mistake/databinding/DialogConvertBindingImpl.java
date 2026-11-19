package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class DialogConvertBindingImpl extends DialogConvertBinding {

    /* renamed from: i */
    public static final SparseIntArray f6097i;

    /* renamed from: h */
    public long f6098h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6097i = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.tv_content, 2);
        sparseIntArray.put(R.id.seekbar, 3);
        sparseIntArray.put(R.id.tv_single_cancel, 4);
        sparseIntArray.put(R.id.ll_button, 5);
        sparseIntArray.put(R.id.tv_cancel, 6);
        sparseIntArray.put(R.id.tv_confirm, 7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6098h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6098h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6098h = 1L;
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
