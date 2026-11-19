package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class LayoutNotePreviewOthersBindingImpl extends LayoutNotePreviewOthersBinding {

    /* renamed from: m */
    public static final ViewDataBinding.IncludedLayouts f6589m = null;

    /* renamed from: n */
    public static final SparseIntArray f6590n;

    /* renamed from: l */
    public long f6591l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6590n = sparseIntArray;
        sparseIntArray.put(R$id.micro_class_name, 1);
        sparseIntArray.put(R$id.iv_logo, 2);
        sparseIntArray.put(R$id.tv_name, 3);
        sparseIntArray.put(R$id.tv_view, 4);
        sparseIntArray.put(R$id.linearLayoutCompat, 5);
        sparseIntArray.put(R$id.iv_note_info_others, 6);
        sparseIntArray.put(R$id.iv_cover, 7);
        sparseIntArray.put(R$id.iv_cover_icon, 8);
    }

    public LayoutNotePreviewOthersBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f6589m, f6590n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6591l = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6591l != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6591l = 1L;
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

    public LayoutNotePreviewOthersBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[8], (ImageView) objArr[2], (ImageView) objArr[6], (LinearLayoutCompat) objArr[5], (AppCompatTextView) objArr[1], (TextView) objArr[3], (TextView) objArr[4]);
        this.f6591l = -1L;
        this.f6580c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
