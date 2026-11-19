package com.friday.paint.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.paint.R$id;

/* loaded from: classes4.dex */
public class ResFragmentNewPaintBindingImpl extends ResFragmentNewPaintBinding {

    /* renamed from: x */
    public static final ViewDataBinding.IncludedLayouts f9857x = null;

    /* renamed from: y */
    public static final SparseIntArray f9858y;

    /* renamed from: v */
    public final ConstraintLayout f9859v;

    /* renamed from: w */
    public long f9860w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9858y = sparseIntArray;
        sparseIntArray.put(R$id.drawerLayout, 1);
        sparseIntArray.put(R$id.flSketch, 2);
        sparseIntArray.put(R$id.ivBack, 3);
        sparseIntArray.put(R$id.iv_drawer_hint, 4);
        sparseIntArray.put(R$id.ll_student_feature, 5);
        sparseIntArray.put(R$id.iv_answer_board, 6);
        sparseIntArray.put(R$id.iv_subjective_submit, 7);
        sparseIntArray.put(R$id.iv_screen_shoot, 8);
        sparseIntArray.put(R$id.iv_ask, 9);
        sparseIntArray.put(R$id.iv_prev_page, 10);
        sparseIntArray.put(R$id.tv_current_paging, 11);
        sparseIntArray.put(R$id.iv_next_page, 12);
        sparseIntArray.put(R$id.ll_drawer_right, 13);
        sparseIntArray.put(R$id.rv_note_menu, 14);
        sparseIntArray.put(R$id.iv_copy_to_others, 15);
        sparseIntArray.put(R$id.iv_remove_page, 16);
        sparseIntArray.put(R$id.iv_copy_page, 17);
        sparseIntArray.put(R$id.iv_add_page, 18);
        sparseIntArray.put(R$id.rv_note_list, 19);
    }

    public ResFragmentNewPaintBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, f9857x, f9858y));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9860w = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9860w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9860w = 1L;
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

    public ResFragmentNewPaintBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (DrawerLayout) objArr[1], (FrameLayout) objArr[2], (ImageView) objArr[18], (ImageView) objArr[6], (ImageView) objArr[9], (ImageView) objArr[3], (ImageView) objArr[17], (ImageView) objArr[15], (ImageView) objArr[4], (ImageView) objArr[12], (ImageView) objArr[10], (ImageView) objArr[16], (ImageView) objArr[8], (ImageView) objArr[7], (LinearLayout) objArr[13], (LinearLayout) objArr[5], (RecyclerView) objArr[19], (LinearLayout) objArr[14], (TextView) objArr[11]);
        this.f9860w = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f9859v = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
