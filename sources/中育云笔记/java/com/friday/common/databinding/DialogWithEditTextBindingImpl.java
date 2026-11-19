package com.friday.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$id;
import com.zykj.view.widget.LimitEditText;

/* loaded from: classes3.dex */
public class DialogWithEditTextBindingImpl extends DialogWithEditTextBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f5983k = null;

    /* renamed from: l */
    public static final SparseIntArray f5984l;

    /* renamed from: i */
    public final CardView f5985i;

    /* renamed from: j */
    public long f5986j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5984l = sparseIntArray;
        sparseIntArray.put(R$id.mTvHint, 1);
        sparseIntArray.put(R$id.mEtInput, 2);
        sparseIntArray.put(R$id.tv_message, 3);
        sparseIntArray.put(R$id.ll_file_tip, 4);
        sparseIntArray.put(R$id.mBtnNegative, 5);
        sparseIntArray.put(R$id.mBtnPositive, 6);
    }

    public DialogWithEditTextBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f5983k, f5984l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f5986j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f5986j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f5986j = 1L;
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

    public DialogWithEditTextBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (TextView) objArr[5], (TextView) objArr[6], (LimitEditText) objArr[2], (TextView) objArr[1], (TextView) objArr[3]);
        this.f5986j = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f5985i = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
