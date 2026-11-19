package com.friday.main.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.main.R$id;

/* loaded from: classes4.dex */
public class DialogVersionUpdateBindingImpl extends DialogVersionUpdateBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f9156j = null;

    /* renamed from: k */
    public static final SparseIntArray f9157k;

    /* renamed from: h */
    public final FrameLayout f9158h;

    /* renamed from: i */
    public long f9159i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9157k = sparseIntArray;
        sparseIntArray.put(R$id.tv_status, 1);
        sparseIntArray.put(R$id.cvCancel, 2);
        sparseIntArray.put(R$id.tv_cancel, 3);
        sparseIntArray.put(R$id.cv_update, 4);
        sparseIntArray.put(R$id.tv_update, 5);
    }

    public DialogVersionUpdateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f9156j, f9157k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9159i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9159i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9159i = 1L;
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

    public DialogVersionUpdateBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[2], (CardView) objArr[4], (TextView) objArr[3], (TextView) objArr[1], (TextView) objArr[5]);
        this.f9159i = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f9158h = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
