package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogVersionUpgradeBindingImpl extends DialogVersionUpgradeBinding {

    /* renamed from: n */
    public static final ViewDataBinding.IncludedLayouts f10368n = null;

    /* renamed from: o */
    public static final SparseIntArray f10369o;

    /* renamed from: l */
    public final ConstraintLayout f10370l;

    /* renamed from: m */
    public long f10371m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10369o = sparseIntArray;
        sparseIntArray.put(R.id.iv_icon, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.tv_version, 3);
        sparseIntArray.put(R.id.ll_content, 4);
        sparseIntArray.put(R.id.tv_content_title, 5);
        sparseIntArray.put(R.id.tv_content, 6);
        sparseIntArray.put(R.id.progress_bar, 7);
        sparseIntArray.put(R.id.tv_progress, 8);
        sparseIntArray.put(R.id.tv_not_now, 9);
        sparseIntArray.put(R.id.tv_now, 10);
        sparseIntArray.put(R.id.tv_cancel, 11);
    }

    public DialogVersionUpgradeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, f10368n, f10369o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10371m = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10371m != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10371m = 1L;
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

    public DialogVersionUpgradeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (LinearLayout) objArr[4], (ProgressBar) objArr[7], (TextView) objArr[11], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[8], (TextView) objArr[2], (TextView) objArr[3]);
        this.f10371m = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f10370l = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
