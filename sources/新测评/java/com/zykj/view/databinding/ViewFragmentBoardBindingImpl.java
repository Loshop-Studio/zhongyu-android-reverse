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
import com.zykj.view.AbstractC7203a;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.widget.SketchBoardTouchFrameLayout;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;
import p027b8.AbstractC5046c;

/* loaded from: classes5.dex */
public class ViewFragmentBoardBindingImpl extends ViewFragmentBoardBinding {

    /* renamed from: v */
    public static final ViewDataBinding.IncludedLayouts f11393v;

    /* renamed from: w */
    public static final SparseIntArray f11394w;

    /* renamed from: t */
    public final ConstraintLayout f11395t;

    /* renamed from: u */
    public long f11396u;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(20);
        f11393v = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{4, 10, 11}, new int[]{R$layout.view_include_menu, R$layout.view_item_sketch_record, R$layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(2, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color", "view_include_select_type"}, new int[]{5, 6, 7, 8, 9}, new int[]{R$layout.view_include_pen, R$layout.view_include_eraser, R$layout.view_include_image_add, R$layout.view_include_background_color, R$layout.view_include_select_type});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11394w = sparseIntArray;
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
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, f11393v, f11394w));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f11396u;
            this.f11396u = 0L;
        }
        if ((j10 & 256) != 0) {
            AbstractC5046c.m2527c(this.f11374a, Boolean.FALSE);
            AbstractC5046c.m2527c(this.f11375b, Boolean.TRUE);
        }
        ViewDataBinding.executeBindingsOn(this.f11381h);
        ViewDataBinding.executeBindingsOn(this.f11382i);
        ViewDataBinding.executeBindingsOn(this.f11379f);
        ViewDataBinding.executeBindingsOn(this.f11380g);
        ViewDataBinding.executeBindingsOn(this.f11377d);
        ViewDataBinding.executeBindingsOn(this.f11384k);
        ViewDataBinding.executeBindingsOn(this.f11378e);
        ViewDataBinding.executeBindingsOn(this.f11383j);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f11396u != 0) {
                    return true;
                }
                return this.f11381h.hasPendingBindings() || this.f11382i.hasPendingBindings() || this.f11379f.hasPendingBindings() || this.f11380g.hasPendingBindings() || this.f11377d.hasPendingBindings() || this.f11384k.hasPendingBindings() || this.f11378e.hasPendingBindings() || this.f11383j.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11396u = 256L;
        }
        this.f11381h.invalidateAll();
        this.f11382i.invalidateAll();
        this.f11379f.invalidateAll();
        this.f11380g.invalidateAll();
        this.f11377d.invalidateAll();
        this.f11384k.invalidateAll();
        this.f11378e.invalidateAll();
        this.f11383j.invalidateAll();
        requestRebind();
    }

    /* renamed from: o */
    public final boolean m11396o(ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11396u |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return m11399s((ViewIncludeImageAddBinding) obj, i11);
            case 1:
                return m11402v((ViewItemSketchRecordAudioBinding) obj, i11);
            case 2:
                return m11397q((ViewItemSketchRecordBinding) obj, i11);
            case 3:
                return m11396o((ViewIncludeBackgroundColorBinding) obj, i11);
            case 4:
                return m11403w((ViewIncludeSelectTypeBinding) obj, i11);
            case 5:
                return m11400t((ViewIncludeMenuBinding) obj, i11);
            case 6:
                return m11398r((ViewIncludeEraserBinding) obj, i11);
            case 7:
                return m11401u((ViewIncludePenBinding) obj, i11);
            default:
                return false;
        }
    }

    /* renamed from: q */
    public final boolean m11397q(ViewItemSketchRecordBinding viewItemSketchRecordBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11396u |= 4;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m11398r(ViewIncludeEraserBinding viewIncludeEraserBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11396u |= 64;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m11399s(ViewIncludeImageAddBinding viewIncludeImageAddBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11396u |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f11381h.setLifecycleOwner(lifecycleOwner);
        this.f11382i.setLifecycleOwner(lifecycleOwner);
        this.f11379f.setLifecycleOwner(lifecycleOwner);
        this.f11380g.setLifecycleOwner(lifecycleOwner);
        this.f11377d.setLifecycleOwner(lifecycleOwner);
        this.f11384k.setLifecycleOwner(lifecycleOwner);
        this.f11378e.setLifecycleOwner(lifecycleOwner);
        this.f11383j.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    /* renamed from: t */
    public final boolean m11400t(ViewIncludeMenuBinding viewIncludeMenuBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11396u |= 32;
        }
        return true;
    }

    /* renamed from: u */
    public final boolean m11401u(ViewIncludePenBinding viewIncludePenBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11396u |= 128;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m11402v(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11396u |= 2;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean m11403w(ViewIncludeSelectTypeBinding viewIncludeSelectTypeBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11396u |= 16;
        }
        return true;
    }

    public ViewFragmentBoardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 8, (CustomColorFrameLayout) objArr[1], (CustomColorFrameLayout) objArr[3], (SketchBoardTouchFrameLayout) objArr[12], (ViewIncludeBackgroundColorBinding) objArr[8], (ViewItemSketchRecordBinding) objArr[10], (ViewIncludeEraserBinding) objArr[6], (ViewIncludeImageAddBinding) objArr[7], (ViewIncludeMenuBinding) objArr[4], (ViewIncludePenBinding) objArr[5], (ViewItemSketchRecordAudioBinding) objArr[11], (ViewIncludeSelectTypeBinding) objArr[9], (AppCompatImageView) objArr[14], (AppCompatImageView) objArr[15], (FrameLayout) objArr[18], (SketchProgressView) objArr[17], (SketchProgressView) objArr[16], (SketchRecorderView) objArr[13], (FrameLayout) objArr[2], (TextView) objArr[19]);
        this.f11396u = -1L;
        this.f11374a.setTag(null);
        this.f11375b.setTag(null);
        setContainedBinding(this.f11377d);
        setContainedBinding(this.f11378e);
        setContainedBinding(this.f11379f);
        setContainedBinding(this.f11380g);
        setContainedBinding(this.f11381h);
        setContainedBinding(this.f11382i);
        setContainedBinding(this.f11383j);
        setContainedBinding(this.f11384k);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f11395t = constraintLayout;
        constraintLayout.setTag(null);
        this.f11391r.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
