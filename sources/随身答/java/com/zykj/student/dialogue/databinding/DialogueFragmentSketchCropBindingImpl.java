package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogueFragmentSketchCropBindingImpl extends DialogueFragmentSketchCropBinding {

    /* renamed from: d */
    public static final ViewDataBinding.IncludedLayouts f10475d = null;

    /* renamed from: e */
    public static final SparseIntArray f10476e;

    /* renamed from: b */
    public final ConstraintLayout f10477b;

    /* renamed from: c */
    public long f10478c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10476e = sparseIntArray;
        sparseIntArray.put(R.id.fragment_container_sketch_crop, 1);
    }

    public DialogueFragmentSketchCropBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f10475d, f10476e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10478c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10478c != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10478c = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public DialogueFragmentSketchCropBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FragmentContainerView) objArr[1]);
        this.f10478c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f10477b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
