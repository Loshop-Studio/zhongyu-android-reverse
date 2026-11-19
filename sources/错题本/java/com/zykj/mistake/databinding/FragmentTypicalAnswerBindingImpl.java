package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class FragmentTypicalAnswerBindingImpl extends FragmentTypicalAnswerBinding {

    /* renamed from: b */
    public static final SparseIntArray f6149b;

    /* renamed from: a */
    public long f6150a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6149b = sparseIntArray;
        sparseIntArray.put(R.id.ll_right, 1);
        sparseIntArray.put(R.id.ll_right_container, 2);
        sparseIntArray.put(R.id.ll_wrong, 3);
        sparseIntArray.put(R.id.ll_wrong_container, 4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6150a = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6150a != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6150a = 1L;
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
