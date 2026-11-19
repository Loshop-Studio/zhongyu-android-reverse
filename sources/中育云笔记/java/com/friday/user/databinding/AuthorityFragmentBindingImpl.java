package com.friday.user.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.user.R$id;
import com.friday.user.viewmodel.UserViewModel;
import com.google.android.material.circularreveal.CircularRevealRelativeLayout;
import p143f4.AbstractC9195a;

/* loaded from: classes5.dex */
public class AuthorityFragmentBindingImpl extends AuthorityFragmentBinding {

    /* renamed from: l */
    public static final ViewDataBinding.IncludedLayouts f10601l = null;

    /* renamed from: m */
    public static final SparseIntArray f10602m;

    /* renamed from: j */
    public final CircularRevealRelativeLayout f10603j;

    /* renamed from: k */
    public long f10604k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10602m = sparseIntArray;
        sparseIntArray.put(R$id.title_layout, 1);
        sparseIntArray.put(R$id.class_name, 2);
        sparseIntArray.put(R$id.studentNum, 3);
        sparseIntArray.put(R$id.sort_layout, 4);
        sparseIntArray.put(R$id.tv_by_name, 5);
        sparseIntArray.put(R$id.tv_by_seven_days, 6);
    }

    public AuthorityFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f10601l, f10602m));
    }

    /* renamed from: a */
    public void m7753a(UserViewModel userViewModel) {
        this.f10600i = userViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10604k = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10604k != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10604k = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC9195a.f21448a != i10) {
            return false;
        }
        m7753a((UserViewModel) obj);
        return true;
    }

    public AuthorityFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[2], (CircularRevealRelativeLayout) objArr[4], (AppCompatTextView) objArr[3], (CircularRevealRelativeLayout) objArr[1], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6]);
        this.f10604k = -1L;
        CircularRevealRelativeLayout circularRevealRelativeLayout = (CircularRevealRelativeLayout) objArr[0];
        this.f10603j = circularRevealRelativeLayout;
        circularRevealRelativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
