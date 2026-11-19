package com.friday.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.login.R$id;

/* loaded from: classes4.dex */
public class DialogSmsVerificationBindingImpl extends DialogSmsVerificationBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f9009j = null;

    /* renamed from: k */
    public static final SparseIntArray f9010k;

    /* renamed from: h */
    public final FrameLayout f9011h;

    /* renamed from: i */
    public long f9012i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9010k = sparseIntArray;
        sparseIntArray.put(R$id.title, 1);
        sparseIntArray.put(R$id.tv_sms, 2);
        sparseIntArray.put(R$id.et_sms, 3);
        sparseIntArray.put(R$id.tv_send_sms, 4);
        sparseIntArray.put(R$id.tv_login, 5);
    }

    public DialogSmsVerificationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f9009j, f9010k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9012i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9012i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9012i = 1L;
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

    public DialogSmsVerificationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (EditText) objArr[3], (TextView) objArr[1], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[2]);
        this.f9012i = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f9011h = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
