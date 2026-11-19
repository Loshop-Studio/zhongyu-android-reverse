package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.simpleBoard.SimpleBoardView;
import com.zykj.view.widget.SketchProgressView;
import p008a7.AbstractC0044a;

/* loaded from: classes5.dex */
public class ViewFragmentSimpleBindingImpl extends ViewFragmentSimpleBinding {

    /* renamed from: p */
    public static final ViewDataBinding.IncludedLayouts f12666p;

    /* renamed from: q */
    public static final SparseIntArray f12667q;

    /* renamed from: n */
    public final ConstraintLayout f12668n;

    /* renamed from: o */
    public long f12669o;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f12666p = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{2, 7, 8}, new int[]{R$layout.view_include_menu, R$layout.view_item_sketch_record, R$layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(1, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color"}, new int[]{3, 4, 5, 6}, new int[]{R$layout.view_include_pen, R$layout.view_include_eraser, R$layout.view_include_image_add, R$layout.view_include_background_color});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12667q = sparseIntArray;
        sparseIntArray.put(R$id.sketch_view, 9);
        sparseIntArray.put(R$id.iv_back, 10);
        sparseIntArray.put(R$id.iv_expansion, 11);
        sparseIntArray.put(R$id.sketch_progress_vertical, 12);
        sparseIntArray.put(R$id.sketch_progress_horizontal, 13);
    }

    public ViewFragmentSimpleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f12666p, f12667q));
    }

    /* renamed from: k */
    private boolean m11898k(ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12669o |= 8;
        }
        return true;
    }

    /* renamed from: t */
    private boolean m11899t(ViewItemSketchRecordBinding viewItemSketchRecordBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12669o |= 4;
        }
        return true;
    }

    /* renamed from: u */
    private boolean m11900u(ViewIncludeEraserBinding viewIncludeEraserBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12669o |= 32;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m11901v(ViewIncludeImageAddBinding viewIncludeImageAddBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12669o |= 1;
        }
        return true;
    }

    /* renamed from: w */
    private boolean m11902w(ViewIncludeMenuBinding viewIncludeMenuBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12669o |= 16;
        }
        return true;
    }

    /* renamed from: x */
    private boolean m11903x(ViewIncludePenBinding viewIncludePenBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12669o |= 64;
        }
        return true;
    }

    /* renamed from: y */
    private boolean m11904y(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12669o |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12669o = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f12657e);
        ViewDataBinding.executeBindingsOn(this.f12658f);
        ViewDataBinding.executeBindingsOn(this.f12655c);
        ViewDataBinding.executeBindingsOn(this.f12656d);
        ViewDataBinding.executeBindingsOn(this.f12653a);
        ViewDataBinding.executeBindingsOn(this.f12654b);
        ViewDataBinding.executeBindingsOn(this.f12659g);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f12669o != 0) {
                    return true;
                }
                return this.f12657e.hasPendingBindings() || this.f12658f.hasPendingBindings() || this.f12655c.hasPendingBindings() || this.f12656d.hasPendingBindings() || this.f12653a.hasPendingBindings() || this.f12654b.hasPendingBindings() || this.f12659g.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12669o = 128L;
        }
        this.f12657e.invalidateAll();
        this.f12658f.invalidateAll();
        this.f12655c.invalidateAll();
        this.f12656d.invalidateAll();
        this.f12653a.invalidateAll();
        this.f12654b.invalidateAll();
        this.f12659g.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        switch (i9) {
            case 0:
                return m11901v((ViewIncludeImageAddBinding) obj, i10);
            case 1:
                return m11904y((ViewItemSketchRecordAudioBinding) obj, i10);
            case 2:
                return m11899t((ViewItemSketchRecordBinding) obj, i10);
            case 3:
                return m11898k((ViewIncludeBackgroundColorBinding) obj, i10);
            case 4:
                return m11902w((ViewIncludeMenuBinding) obj, i10);
            case 5:
                return m11900u((ViewIncludeEraserBinding) obj, i10);
            case 6:
                return m11903x((ViewIncludePenBinding) obj, i10);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f12657e.setLifecycleOwner(lifecycleOwner);
        this.f12658f.setLifecycleOwner(lifecycleOwner);
        this.f12655c.setLifecycleOwner(lifecycleOwner);
        this.f12656d.setLifecycleOwner(lifecycleOwner);
        this.f12653a.setLifecycleOwner(lifecycleOwner);
        this.f12654b.setLifecycleOwner(lifecycleOwner);
        this.f12659g.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public ViewFragmentSimpleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (ViewIncludeBackgroundColorBinding) objArr[6], (ViewItemSketchRecordBinding) objArr[7], (ViewIncludeEraserBinding) objArr[4], (ViewIncludeImageAddBinding) objArr[5], (ViewIncludeMenuBinding) objArr[2], (ViewIncludePenBinding) objArr[3], (ViewItemSketchRecordAudioBinding) objArr[8], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (SketchProgressView) objArr[13], (SketchProgressView) objArr[12], (SimpleBoardView) objArr[9], (FrameLayout) objArr[1]);
        this.f12669o = -1L;
        setContainedBinding(this.f12653a);
        setContainedBinding(this.f12654b);
        setContainedBinding(this.f12655c);
        setContainedBinding(this.f12656d);
        setContainedBinding(this.f12657e);
        setContainedBinding(this.f12658f);
        setContainedBinding(this.f12659g);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f12668n = constraintLayout;
        constraintLayout.setTag(null);
        this.f12665m.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
