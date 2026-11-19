package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class FragmentEmptyBindingImpl extends FragmentEmptyBinding {

    /* renamed from: c */
    public static final SparseIntArray f6131c;

    /* renamed from: b */
    public long f6132b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6131c = sparseIntArray;
        sparseIntArray.put(R.id.tv_empty, 1);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6132b = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6132b != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6132b = 1L;
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
