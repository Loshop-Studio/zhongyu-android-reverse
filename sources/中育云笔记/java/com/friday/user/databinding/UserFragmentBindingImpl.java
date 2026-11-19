package com.friday.user.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.common.widget.FridayNoTouchViewPager;
import com.friday.user.R$id;
import com.friday.user.viewmodel.UserViewModel;
import p143f4.AbstractC9195a;

/* loaded from: classes5.dex */
public class UserFragmentBindingImpl extends UserFragmentBinding {

    /* renamed from: l */
    public static final ViewDataBinding.IncludedLayouts f10621l = null;

    /* renamed from: m */
    public static final SparseIntArray f10622m;

    /* renamed from: j */
    public final LinearLayoutCompat f10623j;

    /* renamed from: k */
    public long f10624k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10622m = sparseIntArray;
        sparseIntArray.put(R$id.tv_model_name, 1);
        sparseIntArray.put(R$id.rv_mine_menu, 2);
        sparseIntArray.put(R$id.ll_content, 3);
        sparseIntArray.put(R$id.vp_mine, 4);
        sparseIntArray.put(R$id.tv_title, 5);
        sparseIntArray.put(R$id.v_placeholder, 6);
    }

    public UserFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f10621l, f10622m));
    }

    /* renamed from: a */
    public void m7755a(UserViewModel userViewModel) {
        this.f10620i = userViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10624k = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10624k != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10624k = 2L;
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
        m7755a((UserViewModel) obj);
        return true;
    }

    public UserFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayoutCompat) objArr[3], (RecyclerView) objArr[2], (TextView) objArr[1], (TextView) objArr[5], (View) objArr[6], (FridayNoTouchViewPager) objArr[4]);
        this.f10624k = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f10623j = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
