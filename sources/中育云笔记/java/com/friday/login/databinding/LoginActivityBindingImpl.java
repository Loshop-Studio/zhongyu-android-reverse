package com.friday.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.login.R$id;
import com.google.android.material.textfield.TextInputEditText;
import com.zykj.policy.p105ui.PolicyCheckView;

/* loaded from: classes4.dex */
public class LoginActivityBindingImpl extends LoginActivityBinding {

    /* renamed from: t */
    public static final ViewDataBinding.IncludedLayouts f9028t = null;

    /* renamed from: u */
    public static final SparseIntArray f9029u;

    /* renamed from: r */
    public final ConstraintLayout f9030r;

    /* renamed from: s */
    public long f9031s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9029u = sparseIntArray;
        sparseIntArray.put(R$id.space_one, 1);
        sparseIntArray.put(R$id.space_state_hide, 2);
        sparseIntArray.put(R$id.tv_app_name, 3);
        sparseIntArray.put(R$id.iv_logo, 4);
        sparseIntArray.put(R$id.cv_input, 5);
        sparseIntArray.put(R$id.cl_original_password, 6);
        sparseIntArray.put(R$id.school, 7);
        sparseIntArray.put(R$id.et_school_code, 8);
        sparseIntArray.put(R$id.cl_new_password, 9);
        sparseIntArray.put(R$id.et_account, 10);
        sparseIntArray.put(R$id.cl_confirm_password, 11);
        sparseIntArray.put(R$id.et_password, 12);
        sparseIntArray.put(R$id.space_two, 13);
        sparseIntArray.put(R$id.btn_login, 14);
        sparseIntArray.put(R$id.policy_check_view, 15);
    }

    public LoginActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f9028t, f9029u));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9031s = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9031s != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9031s = 1L;
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

    public LoginActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[14], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[9], (ConstraintLayout) objArr[6], (ConstraintLayout) objArr[5], (TextInputEditText) objArr[10], (TextInputEditText) objArr[12], (TextInputEditText) objArr[8], (ImageView) objArr[4], (PolicyCheckView) objArr[15], (TextView) objArr[7], (View) objArr[1], (View) objArr[2], (View) objArr[13], (TextView) objArr[3]);
        this.f9031s = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f9030r = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
