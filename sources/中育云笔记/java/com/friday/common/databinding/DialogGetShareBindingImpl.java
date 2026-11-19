package com.friday.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$id;

/* loaded from: classes3.dex */
public class DialogGetShareBindingImpl extends DialogGetShareBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f5958k = null;

    /* renamed from: l */
    public static final SparseIntArray f5959l;

    /* renamed from: i */
    public final CardView f5960i;

    /* renamed from: j */
    public long f5961j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5959l = sparseIntArray;
        sparseIntArray.put(R$id.tv_canceled, 1);
        sparseIntArray.put(R$id.cl_has_file, 2);
        sparseIntArray.put(R$id.iv_file_type, 3);
        sparseIntArray.put(R$id.tv_file_name, 4);
        sparseIntArray.put(R$id.tv_file_user_name, 5);
        sparseIntArray.put(R$id.btn_ok, 6);
    }

    public DialogGetShareBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f5958k, f5959l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f5961j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f5961j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f5961j = 1L;
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

    public DialogGetShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[6], (ConstraintLayout) objArr[2], (ImageView) objArr[3], (TextView) objArr[1], (TextView) objArr[4], (TextView) objArr[5]);
        this.f5961j = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f5960i = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
