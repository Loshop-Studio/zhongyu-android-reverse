package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class FragmentMicroClassBindingImpl extends FragmentMicroClassBinding {

    /* renamed from: b */
    public static final SparseIntArray f6133b;

    /* renamed from: a */
    public long f6134a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6133b = sparseIntArray;
        sparseIntArray.put(R.id.ll_answer, 1);
        sparseIntArray.put(R.id.ll_answer_container, 2);
        sparseIntArray.put(R.id.ll_revised, 3);
        sparseIntArray.put(R.id.ll_revised_container, 4);
        sparseIntArray.put(R.id.ll_one2one, 5);
        sparseIntArray.put(R.id.ll_one2one_container, 6);
        sparseIntArray.put(R.id.ll_screen, 7);
        sparseIntArray.put(R.id.ll_screen_container, 8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6134a = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6134a != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6134a = 1L;
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
