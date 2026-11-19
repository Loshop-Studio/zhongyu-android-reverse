package com.friday.paint.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.friday.paint.R$id;
import com.friday.paint.R$layout;
import p400x3.AbstractC11790a;

/* loaded from: classes4.dex */
public class FragmentThePaintBindingImpl extends FragmentThePaintBinding {

    /* renamed from: L */
    public static final ViewDataBinding.IncludedLayouts f9803L;

    /* renamed from: M */
    public static final SparseIntArray f9804M;

    /* renamed from: J */
    public final ConstraintLayout f9805J;

    /* renamed from: K */
    public long f9806K;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(34);
        f9803L = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"item_paint_pen_color"}, new int[]{2}, new int[]{R$layout.item_paint_pen_color});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9804M = sparseIntArray;
        sparseIntArray.put(R$id.drawerLayout, 3);
        sparseIntArray.put(R$id.vp_paint, 4);
        sparseIntArray.put(R$id.iv_back, 5);
        sparseIntArray.put(R$id.tooBox, 6);
        sparseIntArray.put(R$id.iv_touch, 7);
        sparseIntArray.put(R$id.iv_select, 8);
        sparseIntArray.put(R$id.iv_pen, 9);
        sparseIntArray.put(R$id.iv_eraser, 10);
        sparseIntArray.put(R$id.iv_gallery, 11);
        sparseIntArray.put(R$id.iv_camera, 12);
        sparseIntArray.put(R$id.iv_delete, 13);
        sparseIntArray.put(R$id.iv_expansion, 14);
        sparseIntArray.put(R$id.rg_eraser, 15);
        sparseIntArray.put(R$id.rb_line, 16);
        sparseIntArray.put(R$id.rb_image, 17);
        sparseIntArray.put(R$id.ll_student_feature, 18);
        sparseIntArray.put(R$id.iv_answer_board, 19);
        sparseIntArray.put(R$id.iv_subjective_submit, 20);
        sparseIntArray.put(R$id.iv_screen_shoot, 21);
        sparseIntArray.put(R$id.iv_ask, 22);
        sparseIntArray.put(R$id.iv_drawer_hint, 23);
        sparseIntArray.put(R$id.iv_prev_page, 24);
        sparseIntArray.put(R$id.tv_current_paging, 25);
        sparseIntArray.put(R$id.iv_next_page, 26);
        sparseIntArray.put(R$id.ll_drawer_right, 27);
        sparseIntArray.put(R$id.rv_note_menu, 28);
        sparseIntArray.put(R$id.iv_copy_to_others, 29);
        sparseIntArray.put(R$id.iv_remove_page, 30);
        sparseIntArray.put(R$id.iv_copy_page, 31);
        sparseIntArray.put(R$id.iv_add_page, 32);
        sparseIntArray.put(R$id.rv_note_list, 33);
    }

    public FragmentThePaintBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 34, f9803L, f9804M));
    }

    /* renamed from: a */
    public final boolean m7306a(ItemPaintPenColorBinding itemPaintPenColorBinding, int i10) {
        if (i10 != AbstractC11790a.f27964a) {
            return false;
        }
        synchronized (this) {
            this.f9806K |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9806K = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f9779c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f9806K != 0) {
                    return true;
                }
                return this.f9779c.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9806K = 2L;
        }
        this.f9779c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return m7306a((ItemPaintPenColorBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f9779c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public FragmentThePaintBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ItemPaintPenColorBinding) objArr[2], (DrawerLayout) objArr[3], (ImageView) objArr[32], (ImageView) objArr[19], (ImageView) objArr[22], (ImageView) objArr[5], (ImageView) objArr[12], (ImageView) objArr[31], (ImageView) objArr[29], (ImageView) objArr[13], (ImageView) objArr[23], (ImageView) objArr[10], (ImageView) objArr[14], (ImageView) objArr[11], (ImageView) objArr[26], (ImageView) objArr[9], (ImageView) objArr[24], (ImageView) objArr[30], (ImageView) objArr[21], (ImageView) objArr[8], (ImageView) objArr[20], (ImageView) objArr[7], (LinearLayout) objArr[27], (LinearLayout) objArr[18], (ConstraintLayout) objArr[1], (RadioButton) objArr[17], (RadioButton) objArr[16], (RadioGroup) objArr[15], (RecyclerView) objArr[33], (LinearLayout) objArr[28], (ConstraintLayout) objArr[6], (TextView) objArr[25], (ViewPager2) objArr[4]);
        this.f9806K = -1L;
        setContainedBinding(this.f9779c);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f9805J = constraintLayout;
        constraintLayout.setTag(null);
        this.f9770A.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
