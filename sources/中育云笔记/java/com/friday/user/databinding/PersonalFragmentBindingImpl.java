package com.friday.user.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.user.R$id;
import com.friday.user.viewmodel.UserViewModel;
import p143f4.AbstractC9195a;

/* loaded from: classes5.dex */
public class PersonalFragmentBindingImpl extends PersonalFragmentBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f10610j = null;

    /* renamed from: k */
    public static final SparseIntArray f10611k;

    /* renamed from: h */
    public final LinearLayoutCompat f10612h;

    /* renamed from: i */
    public long f10613i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10611k = sparseIntArray;
        sparseIntArray.put(R$id.cl_head, 1);
        sparseIntArray.put(R$id.sdv_head, 2);
        sparseIntArray.put(R$id.cl_nickname, 3);
        sparseIntArray.put(R$id.tv_nickname, 4);
    }

    public PersonalFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f10610j, f10611k));
    }

    /* renamed from: a */
    public void m7754a(UserViewModel userViewModel) {
        this.f10609g = userViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10613i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10613i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10613i = 2L;
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
        m7754a((UserViewModel) obj);
        return true;
    }

    public PersonalFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[3], (ImageView) objArr[2], (TextView) objArr[4]);
        this.f10613i = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f10612h = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
