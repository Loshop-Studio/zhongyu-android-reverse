package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class DialogWebviewShotBindingImpl extends DialogWebviewShotBinding {

    /* renamed from: h */
    public static final SparseIntArray f6126h;

    /* renamed from: g */
    public long f6127g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6126h = sparseIntArray;
        sparseIntArray.put(R.id.web_view, 1);
        sparseIntArray.put(R.id.tv_mask, 2);
        sparseIntArray.put(R.id.iv_zoom, 3);
        sparseIntArray.put(R.id.iv_narrow, 4);
        sparseIntArray.put(R.id.iv_sure, 5);
        sparseIntArray.put(R.id.iv_cancel, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6127g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6127g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6127g = 1L;
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
