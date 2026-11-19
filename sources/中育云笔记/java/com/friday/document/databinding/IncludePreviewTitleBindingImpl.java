package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class IncludePreviewTitleBindingImpl extends IncludePreviewTitleBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f6464i = null;

    /* renamed from: j */
    public static final SparseIntArray f6465j;

    /* renamed from: g */
    public final LinearLayoutCompat f6466g;

    /* renamed from: h */
    public long f6467h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6465j = sparseIntArray;
        sparseIntArray.put(R$id.iv_read_only, 1);
        sparseIntArray.put(R$id.tv_note_name, 2);
        sparseIntArray.put(R$id.iv_full_screen, 3);
        sparseIntArray.put(R$id.iv_note_info, 4);
    }

    public IncludePreviewTitleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f6464i, f6465j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6467h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6467h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6467h = 1L;
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

    public IncludePreviewTitleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (ImageView) objArr[4], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f6467h = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6466g = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
