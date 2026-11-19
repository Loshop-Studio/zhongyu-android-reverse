package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class FragmentNoteBindingImpl extends FragmentNoteBinding {

    /* renamed from: d */
    public static final SparseIntArray f6143d;

    /* renamed from: c */
    public long f6144c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6143d = sparseIntArray;
        sparseIntArray.put(R.id.ll_content, 1);
        sparseIntArray.put(R.id.iv_note_thumbnail, 2);
        sparseIntArray.put(R.id.recycler_view, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6144c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6144c != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6144c = 1L;
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
