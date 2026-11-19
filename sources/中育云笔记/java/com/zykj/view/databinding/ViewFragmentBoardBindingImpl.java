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
import com.zykj.view.widget.SketchProgressView;
import p209jb.AbstractC9709a;

/* loaded from: classes6.dex */
public class ViewFragmentBoardBindingImpl extends ViewFragmentBoardBinding {

    /* renamed from: t */
    public static final ViewDataBinding.IncludedLayouts f20593t;

    /* renamed from: u */
    public static final SparseIntArray f20594u;

    /* renamed from: r */
    public final ConstraintLayout f20595r;

    /* renamed from: s */
    public long f20596s;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(16);
        f20593t = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{2, 7, 8}, new int[]{R$layout.view_include_menu, R$layout.view_item_sketch_record, R$layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(1, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color"}, new int[]{3, 4, 5, 6}, new int[]{R$layout.view_include_pen, R$layout.view_include_eraser, R$layout.view_include_image_add, R$layout.view_include_background_color});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20594u = sparseIntArray;
        sparseIntArray.put(R$id.sketch_view, 9);
        sparseIntArray.put(R$id.iv_back, 10);
        sparseIntArray.put(R$id.iv_expansion, 11);
        sparseIntArray.put(R$id.sketch_progress_vertical, 12);
        sparseIntArray.put(R$id.sketch_progress_horizontal, 13);
        sparseIntArray.put(R$id.loadingLayout, 14);
        sparseIntArray.put(R$id.tvLoadingTips, 15);
    }

    public ViewFragmentBoardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f20593t, f20594u));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20596s = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f20582g);
        ViewDataBinding.executeBindingsOn(this.f20583h);
        ViewDataBinding.executeBindingsOn(this.f20580e);
        ViewDataBinding.executeBindingsOn(this.f20581f);
        ViewDataBinding.executeBindingsOn(this.f20578c);
        ViewDataBinding.executeBindingsOn(this.f20579d);
        ViewDataBinding.executeBindingsOn(this.f20584i);
    }

    /* renamed from: g */
    public final boolean m17338g(ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20596s |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f20596s != 0) {
                    return true;
                }
                return this.f20582g.hasPendingBindings() || this.f20583h.hasPendingBindings() || this.f20580e.hasPendingBindings() || this.f20581f.hasPendingBindings() || this.f20578c.hasPendingBindings() || this.f20579d.hasPendingBindings() || this.f20584i.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20596s = 128L;
        }
        this.f20582g.invalidateAll();
        this.f20583h.invalidateAll();
        this.f20580e.invalidateAll();
        this.f20581f.invalidateAll();
        this.f20578c.invalidateAll();
        this.f20579d.invalidateAll();
        this.f20584i.invalidateAll();
        requestRebind();
    }

    /* renamed from: k */
    public final boolean m17339k(ViewItemSketchRecordBinding viewItemSketchRecordBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20596s |= 4;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m17340m(ViewIncludeEraserBinding viewIncludeEraserBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20596s |= 32;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean m17341n(ViewIncludeImageAddBinding viewIncludeImageAddBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20596s |= 1;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m17342o(ViewIncludeMenuBinding viewIncludeMenuBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20596s |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return m17341n((ViewIncludeImageAddBinding) obj, i11);
            case 1:
                return m17344r((ViewItemSketchRecordAudioBinding) obj, i11);
            case 2:
                return m17339k((ViewItemSketchRecordBinding) obj, i11);
            case 3:
                return m17338g((ViewIncludeBackgroundColorBinding) obj, i11);
            case 4:
                return m17342o((ViewIncludeMenuBinding) obj, i11);
            case 5:
                return m17340m((ViewIncludeEraserBinding) obj, i11);
            case 6:
                return m17343p((ViewIncludePenBinding) obj, i11);
            default:
                return false;
        }
    }

    /* renamed from: p */
    public final boolean m17343p(ViewIncludePenBinding viewIncludePenBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20596s |= 64;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m17344r(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20596s |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f20582g.setLifecycleOwner(lifecycleOwner);
        this.f20583h.setLifecycleOwner(lifecycleOwner);
        this.f20580e.setLifecycleOwner(lifecycleOwner);
        this.f20581f.setLifecycleOwner(lifecycleOwner);
        this.f20578c.setLifecycleOwner(lifecycleOwner);
        this.f20579d.setLifecycleOwner(lifecycleOwner);
        this.f20584i.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public ViewFragmentBoardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (ViewIncludeBackgroundColorBinding) objArr[6], (ViewItemSketchRecordBinding) objArr[7], (ViewIncludeEraserBinding) objArr[4], (ViewIncludeImageAddBinding) objArr[5], (ViewIncludeMenuBinding) objArr[2], (ViewIncludePenBinding) objArr[3], (ViewItemSketchRecordAudioBinding) objArr[8], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (FrameLayout) objArr[14], (SketchProgressView) objArr[13], (SketchProgressView) objArr[12], (SketchRecorderView) objArr[9], (FrameLayout) objArr[1], (TextView) objArr[15]);
        this.f20596s = -1L;
        setContainedBinding(this.f20578c);
        setContainedBinding(this.f20579d);
        setContainedBinding(this.f20580e);
        setContainedBinding(this.f20581f);
        setContainedBinding(this.f20582g);
        setContainedBinding(this.f20583h);
        setContainedBinding(this.f20584i);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20595r = constraintLayout;
        constraintLayout.setTag(null);
        this.f20591p.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
