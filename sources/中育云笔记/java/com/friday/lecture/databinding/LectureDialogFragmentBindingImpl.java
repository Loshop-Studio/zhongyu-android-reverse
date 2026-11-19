package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class LectureDialogFragmentBindingImpl extends LectureDialogFragmentBinding {

    /* renamed from: J */
    public static final ViewDataBinding.IncludedLayouts f8623J = null;

    /* renamed from: K */
    public static final SparseIntArray f8624K;

    /* renamed from: I */
    public long f8625I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8624K = sparseIntArray;
        sparseIntArray.put(R$id.iv_back, 1);
        sparseIntArray.put(R$id.ll_mode, 2);
        sparseIntArray.put(R$id.tv_four, 3);
        sparseIntArray.put(R$id.tv_six, 4);
        sparseIntArray.put(R$id.cl_before, 5);
        sparseIntArray.put(R$id.iv_return, 6);
        sparseIntArray.put(R$id.tv_classing, 7);
        sparseIntArray.put(R$id.tv_warning, 8);
        sparseIntArray.put(R$id.rv_code, 9);
        sparseIntArray.put(R$id.cv_keyboard, 10);
        sparseIntArray.put(R$id.rv_keyboard, 11);
        sparseIntArray.put(R$id.tv_connect_error, 12);
        sparseIntArray.put(R$id.tv_class_begin, 13);
        sparseIntArray.put(R$id.tv_airplay_cancel, 14);
        sparseIntArray.put(R$id.layout_message, 15);
        sparseIntArray.put(R$id.iv_big_screen, 16);
        sparseIntArray.put(R$id.tv_big_screen, 17);
        sparseIntArray.put(R$id.tv_network, 18);
        sparseIntArray.put(R$id.tv_local, 19);
        sparseIntArray.put(R$id.tv_localMessage, 20);
        sparseIntArray.put(R$id.tv_ip, 21);
        sparseIntArray.put(R$id.tv_password, 22);
        sparseIntArray.put(R$id.ll_loading, 23);
        sparseIntArray.put(R$id.tv_connect_loading, 24);
        sparseIntArray.put(R$id.iv_classing, 25);
        sparseIntArray.put(R$id.tv_classing_message, 26);
        sparseIntArray.put(R$id.btn_end_class, 27);
        sparseIntArray.put(R$id.tv_class_over_cancel, 28);
        sparseIntArray.put(R$id.tv_class_over_confirm, 29);
        sparseIntArray.put(R$id.group_double_check, 30);
        sparseIntArray.put(R$id.group_after, 31);
    }

    public LectureDialogFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 32, f8623J, f8624K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8625I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8625I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8625I = 1L;
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

    public LectureDialogFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[27], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[0], (CardView) objArr[10], (Group) objArr[31], (Group) objArr[30], (ImageView) objArr[1], (ImageView) objArr[16], (ImageView) objArr[25], (ImageView) objArr[6], (ConstraintLayout) objArr[15], (LinearLayoutCompat) objArr[23], (LinearLayout) objArr[2], (RecyclerView) objArr[9], (RecyclerView) objArr[11], (TextView) objArr[14], (TextView) objArr[17], (Button) objArr[13], (Button) objArr[28], (Button) objArr[29], (TextView) objArr[7], (TextView) objArr[26], (TextView) objArr[12], (TextView) objArr[24], (AppCompatTextView) objArr[3], (TextView) objArr[21], (ConstraintLayout) objArr[19], (TextView) objArr[20], (TextView) objArr[18], (TextView) objArr[22], (AppCompatTextView) objArr[4], (TextView) objArr[8]);
        this.f8625I = -1L;
        this.f8601e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
