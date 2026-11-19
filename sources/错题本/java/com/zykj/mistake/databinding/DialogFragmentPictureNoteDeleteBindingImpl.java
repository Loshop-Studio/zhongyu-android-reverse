package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class DialogFragmentPictureNoteDeleteBindingImpl extends DialogFragmentPictureNoteDeleteBinding {

    /* renamed from: d */
    public static final SparseIntArray f6111d;

    /* renamed from: c */
    public long f6112c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6111d = sparseIntArray;
        sparseIntArray.put(R.id.tv_confirm, 1);
        sparseIntArray.put(R.id.tv_cancel, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6112c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6112c != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6112c = 1L;
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
