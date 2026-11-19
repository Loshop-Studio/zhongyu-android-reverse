package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class DialogFragmentAnswerBindingImpl extends DialogFragmentAnswerBinding {

    /* renamed from: e */
    public static final SparseIntArray f6102e;

    /* renamed from: d */
    public long f6103d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6102e = sparseIntArray;
        sparseIntArray.put(R.id.summaryImage, 1);
        sparseIntArray.put(R.id.summaryCoverImage, 2);
        sparseIntArray.put(R.id.close, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6103d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6103d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6103d = 1L;
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
