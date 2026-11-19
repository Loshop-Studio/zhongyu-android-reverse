package com.zykj.base;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.lang.reflect.Field;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@Keep
/* loaded from: classes4.dex */
public abstract class BaseDialogFragment<T extends ViewDataBinding> extends DialogFragment {
    public T mBindView;

    @InterfaceC9539d(m17800c = "com.zykj.base.BaseDialogFragment$onCreate$1", m17801f = "BaseDialogFragment.kt", m17802l = {47}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.base.BaseDialogFragment$onCreate$1 */
    public static final class C70331 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f8604a;

        public C70331(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C70331(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C70331) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f8604a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                BaseDialogFragment baseDialogFragment = BaseDialogFragment.this;
                this.f8604a = 1;
                if (baseDialogFragment.initData(this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.base.BaseDialogFragment$onViewCreated$1", m17801f = "BaseDialogFragment.kt", m17802l = {76}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.base.BaseDialogFragment$onViewCreated$1 */
    public static final class C70341 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f8606a;

        /* renamed from: c */
        public final /* synthetic */ Bundle f8608c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C70341(Bundle bundle, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f8608c = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C70341(this.f8608c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C70341) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f8606a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                BaseDialogFragment baseDialogFragment = BaseDialogFragment.this;
                Bundle bundle = this.f8608c;
                this.f8606a = 1;
                if (baseDialogFragment.initView(bundle, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public static /* synthetic */ <T extends ViewDataBinding> Object initData$suspendImpl(BaseDialogFragment<T> baseDialogFragment, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return C8736p.f16368a;
    }

    public boolean cancelable() {
        return true;
    }

    public boolean canceledOnTouchOutside() {
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    public T getMBindView() {
        T t10 = this.mBindView;
        if (t10 != null) {
            return t10;
        }
        AbstractC9133u.m16151y("mBindView");
        return null;
    }

    public Object initData(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return initData$suspendImpl(this, interfaceC9324c);
    }

    public abstract Object initView(Bundle bundle, InterfaceC9324c<? super C8736p> interfaceC9324c);

    public boolean isFullDialog() {
        return false;
    }

    public boolean isShowDim() {
        return true;
    }

    @LayoutRes
    public abstract int layoutId();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!isFullDialog()) {
            setStyle(1, R$style.CustomDialog);
        } else if (isShowDim()) {
            setStyle(1, R$style.ActivityDialogDimStyle);
        } else {
            setStyle(1, R$style.ActivityDialogStyle);
        }
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C70331(null), 3, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        AbstractC9133u.m16132f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setCanceledOnTouchOutside(canceledOnTouchOutside());
        dialogOnCreateDialog.setCancelable(cancelable());
        setCancelable(cancelable());
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(inflater, layoutId(), viewGroup, false);
        AbstractC9133u.m16132f(viewDataBindingInflate, "inflate(...)");
        setMBindView(viewDataBindingInflate);
        getMBindView().setLifecycleOwner(getViewLifecycleOwner());
        return getMBindView().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C70341(bundle, null), 3, null);
    }

    public void setMBindView(T t10) {
        AbstractC9133u.m16133g(t10, "<set-?>");
        this.mBindView = t10;
    }

    public final void showDialog(FragmentManager fragmentManager) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        AbstractC9133u.m16133g(fragmentManager, "fragmentManager");
        if (isAdded()) {
            dismiss();
        }
        showNow(fragmentManager, getClass().getSimpleName());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void showNow(FragmentManager manager, String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        AbstractC9133u.m16133g(manager, "manager");
        Class<?> superclass = getClass();
        while (!AbstractC9133u.m16128b(superclass.getName(), "androidx.fragment.app.DialogFragment")) {
            superclass = superclass.getSuperclass();
            AbstractC9133u.m16131e(superclass, "null cannot be cast to non-null type java.lang.Class<in @[FlexibleNullability] kotlin.Any?>");
        }
        Field declaredField = superclass.getDeclaredField("mDismissed");
        declaredField.setAccessible(true);
        declaredField.setBoolean(this, false);
        Field declaredField2 = superclass.getDeclaredField("mShownByMe");
        declaredField2.setAccessible(true);
        declaredField2.setBoolean(this, true);
        FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
        AbstractC9133u.m16132f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }
}
