package com.zykj.lib.ota.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.lib.ota.R$id;
import com.zykj.lib.ota.view.ProgressBar;
import p241s3.AbstractC9972a;

/* loaded from: classes4.dex */
public class DialogCheckVersionProgressBindingImpl extends DialogCheckVersionProgressBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f10258f = null;

    /* renamed from: g */
    public static final SparseIntArray f10259g;

    /* renamed from: c */
    public final FrameLayout f10260c;

    /* renamed from: d */
    public final LinearLayout f10261d;

    /* renamed from: e */
    public long f10262e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10259g = sparseIntArray;
        sparseIntArray.put(R$id.progressView, 2);
    }

    public DialogCheckVersionProgressBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f10258f, f10259g));
    }

    @Override // com.zykj.lib.ota.databinding.DialogCheckVersionProgressBinding
    /* renamed from: a */
    public void mo9476a(boolean z10) {
        this.f10257b = z10;
        synchronized (this) {
            this.f10262e |= 1;
        }
        notifyPropertyChanged(AbstractC9972a.f20017b);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f10262e;
            this.f10262e = 0L;
        }
        long j11 = j10 & 3;
        boolean z10 = j11 != 0 ? !this.f10257b : false;
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.f10261d, Boolean.valueOf(z10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10262e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10262e = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC9972a.f20017b != i10) {
            return false;
        }
        mo9476a(((Boolean) obj).booleanValue());
        return true;
    }

    public DialogCheckVersionProgressBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ProgressBar) objArr[2]);
        this.f10262e = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f10260c = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f10261d = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
