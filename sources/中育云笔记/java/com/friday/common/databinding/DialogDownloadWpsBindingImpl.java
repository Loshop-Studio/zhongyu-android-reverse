package com.friday.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$id;

/* loaded from: classes3.dex */
public class DialogDownloadWpsBindingImpl extends DialogDownloadWpsBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f5943h = null;

    /* renamed from: i */
    public static final SparseIntArray f5944i;

    /* renamed from: f */
    public final CardView f5945f;

    /* renamed from: g */
    public long f5946g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5944i = sparseIntArray;
        sparseIntArray.put(R$id.tv_cancel, 1);
        sparseIntArray.put(R$id.cv_got_it, 2);
        sparseIntArray.put(R$id.tv_get_it, 3);
    }

    public DialogDownloadWpsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f5943h, f5944i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f5946g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f5946g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f5946g = 1L;
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

    public DialogDownloadWpsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[2], (TextView) objArr[1], (TextView) objArr[3]);
        this.f5946g = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f5945f = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
