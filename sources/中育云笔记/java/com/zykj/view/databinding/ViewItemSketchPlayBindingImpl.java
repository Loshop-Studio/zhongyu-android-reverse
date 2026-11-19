package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewItemSketchPlayBindingImpl extends ViewItemSketchPlayBinding {

    /* renamed from: l */
    public static final ViewDataBinding.IncludedLayouts f20706l = null;

    /* renamed from: m */
    public static final SparseIntArray f20707m;

    /* renamed from: j */
    public final ConstraintLayout f20708j;

    /* renamed from: k */
    public long f20709k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20707m = sparseIntArray;
        sparseIntArray.put(R$id.view_bg, 1);
        sparseIntArray.put(R$id.iv_record, 2);
        sparseIntArray.put(R$id.tv_time, 3);
        sparseIntArray.put(R$id.seek_bar, 4);
        sparseIntArray.put(R$id.tv_speed_rate, 5);
        sparseIntArray.put(R$id.iv_fullscreen, 6);
        sparseIntArray.put(R$id.group_seek_bar, 7);
    }

    public ViewItemSketchPlayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f20706l, f20707m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20709k = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20709k != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20709k = 1L;
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

    public ViewItemSketchPlayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Group) objArr[7], (ImageView) objArr[6], (ImageView) objArr[2], (SeekBar) objArr[4], (TextView) objArr[5], (TextView) objArr[3], (View) objArr[1]);
        this.f20709k = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20708j = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
