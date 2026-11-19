package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class ItemMicroSessionsBindingImpl extends ItemMicroSessionsBinding {

    /* renamed from: d */
    public static final SparseIntArray f6167d;

    /* renamed from: c */
    public long f6168c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6167d = sparseIntArray;
        sparseIntArray.put(R.id.layout, 1);
        sparseIntArray.put(R.id.imgContent, 2);
        sparseIntArray.put(R.id.nameLayout, 3);
        sparseIntArray.put(R.id.nameText, 4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6168c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6168c != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6168c = 1L;
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
