package com.zykj.mistake.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/mistake/dialog/BaseDialogFragment;", "Landroidx/databinding/ViewDataBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseDialogFragment<T extends ViewDataBinding> extends DialogFragment {

    /* renamed from: a */
    public ViewDataBinding f6172a;

    /* renamed from: b */
    public View f6173b;

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    /* renamed from: e */
    public abstract int mo3981e();

    /* renamed from: f */
    public abstract int mo3982f();

    /* renamed from: g */
    public abstract int mo3983g();

    /* renamed from: h */
    public abstract int mo3984h();

    /* renamed from: i */
    public final ViewDataBinding m3987i() {
        ViewDataBinding viewDataBinding = this.f6172a;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    /* renamed from: j */
    public abstract void mo3985j(View view);

    /* renamed from: k */
    public final void m3988k(FragmentManager fragmentManager) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (isAdded()) {
            dismiss();
        }
        show(fragmentManager, getClass().getSimpleName());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5830k.m5330g(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(inflater, mo3983g(), viewGroup, false);
        AbstractC5830k.m5327d(viewDataBindingInflate);
        this.f6172a = viewDataBindingInflate;
        return viewDataBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(mo3981e());
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = mo3984h();
        attributes.height = mo3982f();
        window.setAttributes(attributes);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC5830k.m5330g(view, "view");
        super.onViewCreated(view, bundle);
        this.f6173b = view;
        mo3985j(view);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        AbstractC5830k.m5330g(manager, "manager");
        Class<?> superclass = getClass();
        while (!superclass.getName().equals("androidx.fragment.app.DialogFragment")) {
            superclass = superclass.getSuperclass();
            AbstractC5830k.m5328e(superclass, "null cannot be cast to non-null type java.lang.Class<in @[FlexibleNullability] kotlin.Any?>");
        }
        Field declaredField = superclass.getDeclaredField("mDismissed");
        declaredField.setAccessible(true);
        declaredField.setBoolean(this, false);
        Field declaredField2 = superclass.getDeclaredField("mShownByMe");
        declaredField2.setAccessible(true);
        declaredField2.setBoolean(this, true);
        FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
        AbstractC5830k.m5329f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }
}
