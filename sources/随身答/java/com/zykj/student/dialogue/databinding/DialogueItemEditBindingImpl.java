package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogueItemEditBindingImpl extends DialogueItemEditBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f10501i = null;

    /* renamed from: j */
    public static final SparseIntArray f10502j;

    /* renamed from: g */
    public final ConstraintLayout f10503g;

    /* renamed from: h */
    public long f10504h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10502j = sparseIntArray;
        sparseIntArray.put(R.id.tv_name, 1);
        sparseIntArray.put(R.id.cv_system_type, 2);
        sparseIntArray.put(R.id.group_operation, 3);
        sparseIntArray.put(R.id.iv_delete, 4);
        sparseIntArray.put(R.id.iv_edit, 5);
        sparseIntArray.put(R.id.v_line, 6);
    }

    public DialogueItemEditBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f10501i, f10502j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10504h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10504h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10504h = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public DialogueItemEditBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[2], (Group) objArr[3], (ImageView) objArr[4], (ImageView) objArr[5], (TextView) objArr[1], (View) objArr[6]);
        this.f10504h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f10503g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
