package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class LayoutEmptyNoShareBindingImpl extends LayoutEmptyNoShareBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f6523g = null;

    /* renamed from: h */
    public static final SparseIntArray f6524h;

    /* renamed from: f */
    public long f6525f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6524h = sparseIntArray;
        sparseIntArray.put(R$id.img_no_network, 1);
        sparseIntArray.put(R$id.tv_no_network, 2);
    }

    public LayoutEmptyNoShareBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6523g, f6524h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6525f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6525f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6525f = 1L;
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

    public LayoutEmptyNoShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[1], (LinearLayoutCompat) objArr[0], (TextView) objArr[2]);
        this.f6525f = -1L;
        this.f6521d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
