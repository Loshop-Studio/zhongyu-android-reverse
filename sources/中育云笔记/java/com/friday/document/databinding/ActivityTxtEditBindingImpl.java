package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;
import com.zykj.view.widget.LimitEditText;

/* loaded from: classes3.dex */
public class ActivityTxtEditBindingImpl extends ActivityTxtEditBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f6327k = null;

    /* renamed from: l */
    public static final SparseIntArray f6328l;

    /* renamed from: i */
    public final LinearLayout f6329i;

    /* renamed from: j */
    public long f6330j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6328l = sparseIntArray;
        sparseIntArray.put(R$id.iv_finish, 1);
        sparseIntArray.put(R$id.tv_txt_name, 2);
        sparseIntArray.put(R$id.iv_note_info, 3);
        sparseIntArray.put(R$id.et_txt, 4);
        sparseIntArray.put(R$id.nsv_txt, 5);
        sparseIntArray.put(R$id.tv_txt, 6);
    }

    public ActivityTxtEditBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f6327k, f6328l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6330j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6330j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6330j = 1L;
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

    public ActivityTxtEditBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LimitEditText) objArr[4], (ImageView) objArr[1], (ImageView) objArr[3], (NestedScrollView) objArr[5], (TextView) objArr[6], (TextView) objArr[2]);
        this.f6330j = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f6329i = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
