package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;
import com.luck.picture.lib.photoview.PhotoView;

/* loaded from: classes3.dex */
public class ActivityImagePreviewBindingImpl extends ActivityImagePreviewBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f6289h = null;

    /* renamed from: i */
    public static final SparseIntArray f6290i;

    /* renamed from: f */
    public final FrameLayout f6291f;

    /* renamed from: g */
    public long f6292g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6290i = sparseIntArray;
        sparseIntArray.put(R$id.iv_photo, 1);
        sparseIntArray.put(R$id.iv_finish, 2);
        sparseIntArray.put(R$id.ll_error, 3);
    }

    public ActivityImagePreviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f6289h, f6290i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6292g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6292g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6292g = 1L;
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

    public ActivityImagePreviewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (PhotoView) objArr[1], (LinearLayout) objArr[3]);
        this.f6292g = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f6291f = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
