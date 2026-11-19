package com.friday.main.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.main.R$id;

/* loaded from: classes4.dex */
public class ItemSearchBindingImpl extends ItemSearchBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f9198i = null;

    /* renamed from: j */
    public static final SparseIntArray f9199j;

    /* renamed from: h */
    public long f9200h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9199j = sparseIntArray;
        sparseIntArray.put(R$id.iv_icon, 1);
        sparseIntArray.put(R$id.tv_name, 2);
        sparseIntArray.put(R$id.iv_go, 3);
        sparseIntArray.put(R$id.tv_time, 4);
    }

    public ItemSearchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f9198i, f9199j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9200h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9200h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9200h = 1L;
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

    public ItemSearchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (ImageView) objArr[1], (LinearLayoutCompat) objArr[0], (TextView) objArr[2], (TextView) objArr[4]);
        this.f9200h = -1L;
        this.f9195e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
