package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;
import com.github.barteksc.pdfviewer.PDFView;

/* loaded from: classes3.dex */
public class FragmentPreviewPdfBindingImpl extends FragmentPreviewPdfBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f6399f = null;

    /* renamed from: g */
    public static final SparseIntArray f6400g;

    /* renamed from: d */
    public final LinearLayoutCompat f6401d;

    /* renamed from: e */
    public long f6402e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6400g = sparseIntArray;
        sparseIntArray.put(R$id.pdf_view, 1);
    }

    public FragmentPreviewPdfBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f6399f, f6400g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6402e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6402e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6402e = 1L;
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

    public FragmentPreviewPdfBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (PDFView) objArr[1]);
        this.f6402e = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6401d = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
