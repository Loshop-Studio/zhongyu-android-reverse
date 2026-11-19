package com.zykj.lib.ota.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.lib.ota.R$id;
import com.zykj.lib.ota.R$string;
import p241s3.AbstractC9972a;

/* loaded from: classes4.dex */
public class DialogLatestVersionBindingImpl extends DialogLatestVersionBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f10270f = null;

    /* renamed from: g */
    public static final SparseIntArray f10271g;

    /* renamed from: c */
    public final FrameLayout f10272c;

    /* renamed from: d */
    public final TextView f10273d;

    /* renamed from: e */
    public long f10274e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10271g = sparseIntArray;
        sparseIntArray.put(R$id.tv_know, 2);
    }

    public DialogLatestVersionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f10270f, f10271g));
    }

    @Override // com.zykj.lib.ota.databinding.DialogLatestVersionBinding
    /* renamed from: a */
    public void mo9477a(String str) {
        this.f10269b = str;
        synchronized (this) {
            this.f10274e |= 1;
        }
        notifyPropertyChanged(AbstractC9972a.f20018c);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f10274e;
            this.f10274e = 0L;
        }
        long j11 = j10 & 3;
        String string = j11 != 0 ? this.f10273d.getResources().getString(R$string.versionName, this.f10269b) : null;
        if (j11 != 0) {
            TextViewBindingAdapter.setText(this.f10273d, string);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10274e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10274e = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC9972a.f20018c != i10) {
            return false;
        }
        mo9477a((String) obj);
        return true;
    }

    public DialogLatestVersionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2]);
        this.f10274e = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f10272c = frameLayout;
        frameLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f10273d = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
