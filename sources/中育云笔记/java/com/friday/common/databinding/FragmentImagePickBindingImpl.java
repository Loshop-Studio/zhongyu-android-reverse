package com.friday.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$id;
import com.friday.common.camera.ZoomControlView;

/* loaded from: classes3.dex */
public class FragmentImagePickBindingImpl extends FragmentImagePickBinding {

    /* renamed from: p */
    public static final ViewDataBinding.IncludedLayouts f6006p = null;

    /* renamed from: q */
    public static final SparseIntArray f6007q;

    /* renamed from: n */
    public final ConstraintLayout f6008n;

    /* renamed from: o */
    public long f6009o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6007q = sparseIntArray;
        sparseIntArray.put(R$id.prevView, 1);
        sparseIntArray.put(R$id.h_line1, 2);
        sparseIntArray.put(R$id.h_line2, 3);
        sparseIntArray.put(R$id.v_line1, 4);
        sparseIntArray.put(R$id.v_line2, 5);
        sparseIntArray.put(R$id.capture, 6);
        sparseIntArray.put(R$id.cv_zoom_value, 7);
        sparseIntArray.put(R$id.tv_zoom_value, 8);
        sparseIntArray.put(R$id.db_view, 9);
        sparseIntArray.put(R$id.ck_light, 10);
        sparseIntArray.put(R$id.cancel, 11);
    }

    public FragmentImagePickBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, f6006p, f6007q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6009o = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6009o != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6009o = 1L;
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

    public FragmentImagePickBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[11], (ImageView) objArr[6], (CheckBox) objArr[10], (CardView) objArr[7], (ZoomControlView) objArr[9], (View) objArr[2], (View) objArr[3], (PreviewView) objArr[1], (TextView) objArr[8], (View) objArr[4], (View) objArr[5]);
        this.f6009o = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6008n = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
