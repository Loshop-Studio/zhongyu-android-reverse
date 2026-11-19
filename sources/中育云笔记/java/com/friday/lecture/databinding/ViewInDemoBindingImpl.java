package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class ViewInDemoBindingImpl extends ViewInDemoBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f8632k = null;

    /* renamed from: l */
    public static final SparseIntArray f8633l;

    /* renamed from: i */
    public final LinearLayout f8634i;

    /* renamed from: j */
    public long f8635j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8633l = sparseIntArray;
        sparseIntArray.put(R$id.cv_bg, 1);
        sparseIntArray.put(R$id.iv_role, 2);
        sparseIntArray.put(R$id.tv_name, 3);
        sparseIntArray.put(R$id.iv_offline, 4);
        sparseIntArray.put(R$id.iv_remove, 5);
        sparseIntArray.put(R$id.iv_fullscreen, 6);
    }

    public ViewInDemoBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f8632k, f8633l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8635j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8635j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8635j = 1L;
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

    public ViewInDemoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[1], (ImageView) objArr[6], (ImageView) objArr[4], (ImageView) objArr[5], (ImageView) objArr[2], (TextView) objArr[3]);
        this.f8635j = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f8634i = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
