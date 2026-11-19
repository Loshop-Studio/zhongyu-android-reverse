package com.friday.main.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.main.R$id;

/* loaded from: classes4.dex */
public class ResItemFolderBindingImpl extends ResItemFolderBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f9226h = null;

    /* renamed from: i */
    public static final SparseIntArray f9227i;

    /* renamed from: f */
    public final LinearLayout f9228f;

    /* renamed from: g */
    public long f9229g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9227i = sparseIntArray;
        sparseIntArray.put(R$id.ivFolder, 1);
        sparseIntArray.put(R$id.tvFolderName, 2);
        sparseIntArray.put(R$id.tvUpdateTime, 3);
    }

    public ResItemFolderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f9226h, f9227i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9229g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9229g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9229g = 1L;
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

    public ResItemFolderBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[3]);
        this.f9229g = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f9228f = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
