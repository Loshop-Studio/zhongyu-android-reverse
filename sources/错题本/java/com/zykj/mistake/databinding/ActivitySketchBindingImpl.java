package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class ActivitySketchBindingImpl extends ActivitySketchBinding {

    /* renamed from: c */
    public static final SparseIntArray f6088c;

    /* renamed from: b */
    public long f6089b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6088c = sparseIntArray;
        sparseIntArray.put(R.id.sketch_fragment, 1);
        sparseIntArray.put(R.id.iv_menu, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6089b = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6089b != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6089b = 1L;
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
