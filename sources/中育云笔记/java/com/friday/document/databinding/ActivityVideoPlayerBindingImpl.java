package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;
import com.shuyu.gsyvideoplayer.video.NormalGSYVideoPlayer;

/* loaded from: classes3.dex */
public class ActivityVideoPlayerBindingImpl extends ActivityVideoPlayerBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f6332f = null;

    /* renamed from: g */
    public static final SparseIntArray f6333g;

    /* renamed from: d */
    public final ConstraintLayout f6334d;

    /* renamed from: e */
    public long f6335e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6333g = sparseIntArray;
        sparseIntArray.put(R$id.video_player, 1);
    }

    public ActivityVideoPlayerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f6332f, f6333g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6335e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6335e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6335e = 1L;
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

    public ActivityVideoPlayerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (NormalGSYVideoPlayer) objArr[1]);
        this.f6335e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6334d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
