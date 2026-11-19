package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;
import com.shuyu.gsyvideoplayer.video.NormalGSYVideoPlayer;

/* loaded from: classes3.dex */
public class FragmentPreviewVideoBindingImpl extends FragmentPreviewVideoBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f6415f = null;

    /* renamed from: g */
    public static final SparseIntArray f6416g;

    /* renamed from: d */
    public final LinearLayoutCompat f6417d;

    /* renamed from: e */
    public long f6418e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6416g = sparseIntArray;
        sparseIntArray.put(R$id.video_player, 1);
    }

    public FragmentPreviewVideoBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f6415f, f6416g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6418e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6418e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6418e = 1L;
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

    public FragmentPreviewVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (NormalGSYVideoPlayer) objArr[1]);
        this.f6418e = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6417d = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
