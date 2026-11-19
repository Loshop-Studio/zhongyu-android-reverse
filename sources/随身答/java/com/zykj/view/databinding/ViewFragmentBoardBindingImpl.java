package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.widget.SketchBoardTouchFrameLayout;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;
import p008a7.AbstractC0044a;
import p181m7.AbstractC9026c;

/* loaded from: classes5.dex */
public class ViewFragmentBoardBindingImpl extends ViewFragmentBoardBinding {

    /* renamed from: v */
    public static final ViewDataBinding.IncludedLayouts f12637v;

    /* renamed from: w */
    public static final SparseIntArray f12638w;

    /* renamed from: t */
    public final ConstraintLayout f12639t;

    /* renamed from: u */
    public long f12640u;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(20);
        f12637v = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{4, 10, 11}, new int[]{R$layout.view_include_menu, R$layout.view_item_sketch_record, R$layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(2, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color", "view_include_select_type"}, new int[]{5, 6, 7, 8, 9}, new int[]{R$layout.view_include_pen, R$layout.view_include_eraser, R$layout.view_include_image_add, R$layout.view_include_background_color, R$layout.view_include_select_type});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12638w = sparseIntArray;
        sparseIntArray.put(R$id.fl_sketch_board_touch, 12);
        sparseIntArray.put(R$id.sketch_view, 13);
        sparseIntArray.put(R$id.iv_back, 14);
        sparseIntArray.put(R$id.iv_expansion, 15);
        sparseIntArray.put(R$id.sketch_progress_vertical, 16);
        sparseIntArray.put(R$id.sketch_progress_horizontal, 17);
        sparseIntArray.put(R$id.loadingLayout, 18);
        sparseIntArray.put(R$id.tvLoadingTips, 19);
    }

    public ViewFragmentBoardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, f12637v, f12638w));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j9;
        synchronized (this) {
            j9 = this.f12640u;
            this.f12640u = 0L;
        }
        if ((j9 & 256) != 0) {
            AbstractC9026c.m14390c(this.f12618a, Boolean.FALSE);
            AbstractC9026c.m14390c(this.f12619b, Boolean.TRUE);
        }
        ViewDataBinding.executeBindingsOn(this.f12625h);
        ViewDataBinding.executeBindingsOn(this.f12626i);
        ViewDataBinding.executeBindingsOn(this.f12623f);
        ViewDataBinding.executeBindingsOn(this.f12624g);
        ViewDataBinding.executeBindingsOn(this.f12621d);
        ViewDataBinding.executeBindingsOn(this.f12628k);
        ViewDataBinding.executeBindingsOn(this.f12622e);
        ViewDataBinding.executeBindingsOn(this.f12627j);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f12640u != 0) {
                    return true;
                }
                return this.f12625h.hasPendingBindings() || this.f12626i.hasPendingBindings() || this.f12623f.hasPendingBindings() || this.f12624g.hasPendingBindings() || this.f12621d.hasPendingBindings() || this.f12628k.hasPendingBindings() || this.f12622e.hasPendingBindings() || this.f12627j.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12640u = 256L;
        }
        this.f12625h.invalidateAll();
        this.f12626i.invalidateAll();
        this.f12623f.invalidateAll();
        this.f12624g.invalidateAll();
        this.f12621d.invalidateAll();
        this.f12628k.invalidateAll();
        this.f12622e.invalidateAll();
        this.f12627j.invalidateAll();
        requestRebind();
    }

    /* renamed from: k */
    public final boolean m11886k(ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12640u |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        switch (i9) {
            case 0:
                return m11889v((ViewIncludeImageAddBinding) obj, i10);
            case 1:
                return m11892y((ViewItemSketchRecordAudioBinding) obj, i10);
            case 2:
                return m11887t((ViewItemSketchRecordBinding) obj, i10);
            case 3:
                return m11886k((ViewIncludeBackgroundColorBinding) obj, i10);
            case 4:
                return m11893z((ViewIncludeSelectTypeBinding) obj, i10);
            case 5:
                return m11890w((ViewIncludeMenuBinding) obj, i10);
            case 6:
                return m11888u((ViewIncludeEraserBinding) obj, i10);
            case 7:
                return m11891x((ViewIncludePenBinding) obj, i10);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f12625h.setLifecycleOwner(lifecycleOwner);
        this.f12626i.setLifecycleOwner(lifecycleOwner);
        this.f12623f.setLifecycleOwner(lifecycleOwner);
        this.f12624g.setLifecycleOwner(lifecycleOwner);
        this.f12621d.setLifecycleOwner(lifecycleOwner);
        this.f12628k.setLifecycleOwner(lifecycleOwner);
        this.f12622e.setLifecycleOwner(lifecycleOwner);
        this.f12627j.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    /* renamed from: t */
    public final boolean m11887t(ViewItemSketchRecordBinding viewItemSketchRecordBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12640u |= 4;
        }
        return true;
    }

    /* renamed from: u */
    public final boolean m11888u(ViewIncludeEraserBinding viewIncludeEraserBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12640u |= 64;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m11889v(ViewIncludeImageAddBinding viewIncludeImageAddBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12640u |= 1;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean m11890w(ViewIncludeMenuBinding viewIncludeMenuBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12640u |= 32;
        }
        return true;
    }

    /* renamed from: x */
    public final boolean m11891x(ViewIncludePenBinding viewIncludePenBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12640u |= 128;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m11892y(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12640u |= 2;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m11893z(ViewIncludeSelectTypeBinding viewIncludeSelectTypeBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12640u |= 16;
        }
        return true;
    }

    public ViewFragmentBoardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 8, (CustomColorFrameLayout) objArr[1], (CustomColorFrameLayout) objArr[3], (SketchBoardTouchFrameLayout) objArr[12], (ViewIncludeBackgroundColorBinding) objArr[8], (ViewItemSketchRecordBinding) objArr[10], (ViewIncludeEraserBinding) objArr[6], (ViewIncludeImageAddBinding) objArr[7], (ViewIncludeMenuBinding) objArr[4], (ViewIncludePenBinding) objArr[5], (ViewItemSketchRecordAudioBinding) objArr[11], (ViewIncludeSelectTypeBinding) objArr[9], (AppCompatImageView) objArr[14], (AppCompatImageView) objArr[15], (FrameLayout) objArr[18], (SketchProgressView) objArr[17], (SketchProgressView) objArr[16], (SketchRecorderView) objArr[13], (FrameLayout) objArr[2], (TextView) objArr[19]);
        this.f12640u = -1L;
        this.f12618a.setTag(null);
        this.f12619b.setTag(null);
        setContainedBinding(this.f12621d);
        setContainedBinding(this.f12622e);
        setContainedBinding(this.f12623f);
        setContainedBinding(this.f12624g);
        setContainedBinding(this.f12625h);
        setContainedBinding(this.f12626i);
        setContainedBinding(this.f12627j);
        setContainedBinding(this.f12628k);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f12639t = constraintLayout;
        constraintLayout.setTag(null);
        this.f12635r.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
