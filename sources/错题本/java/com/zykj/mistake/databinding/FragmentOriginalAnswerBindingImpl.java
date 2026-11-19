package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class FragmentOriginalAnswerBindingImpl extends FragmentOriginalAnswerBinding {

    /* renamed from: b */
    public static final SparseIntArray f6145b;

    /* renamed from: a */
    public long f6146a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6145b = sparseIntArray;
        sparseIntArray.put(R.id.ll_content, 1);
        sparseIntArray.put(R.id.labelText, 2);
        sparseIntArray.put(R.id.ll_answer, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6146a = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6146a != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6146a = 1L;
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
