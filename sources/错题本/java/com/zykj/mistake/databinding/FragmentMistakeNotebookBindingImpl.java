package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class FragmentMistakeNotebookBindingImpl extends FragmentMistakeNotebookBinding {

    /* renamed from: f */
    public static final SparseIntArray f6139f;

    /* renamed from: e */
    public long f6140e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6139f = sparseIntArray;
        sparseIntArray.put(R.id.sf_refresh, 1);
        sparseIntArray.put(R.id.rv_subject, 2);
        sparseIntArray.put(R.id.ll_empty, 3);
        sparseIntArray.put(R.id.tv_empty, 4);
        sparseIntArray.put(R.id.floating_action_button, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6140e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6140e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6140e = 1L;
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
