package com.zykj.evaluation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.evaluation.R;

/* loaded from: classes4.dex */
public class DialogVersionUpgradeBindingImpl extends DialogVersionUpgradeBinding {

    /* renamed from: n */
    public static final ViewDataBinding.IncludedLayouts f8722n = null;

    /* renamed from: o */
    public static final SparseIntArray f8723o;

    /* renamed from: l */
    public final LinearLayoutCompat f8724l;

    /* renamed from: m */
    public long f8725m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8723o = sparseIntArray;
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
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, f8722n, f8723o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8725m = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8725m != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8725m = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public DialogVersionUpgradeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (LinearLayout) objArr[4], (ProgressBar) objArr[7], (TextView) objArr[11], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[8], (TextView) objArr[2], (TextView) objArr[3]);
        this.f8725m = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f8724l = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
