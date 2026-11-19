package com.zykj.lib.ota.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.lib.ota.R$id;
import com.zykj.lib.ota.view.ProgressBar;

/* loaded from: classes4.dex */
public class DialogDownloadBindingImpl extends DialogDownloadBinding {

    /* renamed from: d */
    public static final ViewDataBinding.IncludedLayouts f10264d = null;

    /* renamed from: e */
    public static final SparseIntArray f10265e;

    /* renamed from: b */
    public final FrameLayout f10266b;

    /* renamed from: c */
    public long f10267c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10265e = sparseIntArray;
        sparseIntArray.put(R$id.progressView, 1);
    }

    public DialogDownloadBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f10264d, f10265e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10267c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10267c != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10267c = 1L;
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

    public DialogDownloadBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ProgressBar) objArr[1]);
        this.f10267c = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f10266b = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
