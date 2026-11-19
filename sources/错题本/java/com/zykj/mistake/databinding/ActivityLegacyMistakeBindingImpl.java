package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class ActivityLegacyMistakeBindingImpl extends ActivityLegacyMistakeBinding {

    /* renamed from: b */
    public static final SparseIntArray f6012b;

    /* renamed from: a */
    public long f6013a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6012b = sparseIntArray;
        sparseIntArray.put(R.id.titleBar, 1);
        sparseIntArray.put(R.id.fragment_container, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6013a = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6013a != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6013a = 1L;
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
