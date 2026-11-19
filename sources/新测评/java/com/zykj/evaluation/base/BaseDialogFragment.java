package com.zykj.evaluation.base;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.evaluation.R;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13557d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u001f\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010 J\u001a\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%J\u001a\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\u0006\u0010+\u001a\u00020\u0014J\u0006\u0010,\u001a\u00020\u0014J\b\u0010-\u001a\u00020.H%J\u0018\u0010/\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H¤@¢\u0006\u0002\u00100R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u00028\u0000X\u0096.¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u00061"}, m13558d2 = {"Lcom/zykj/evaluation/base/BaseDialogFragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "mProgressDialog", "Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;", "mBindView", "getMBindView", "()Landroidx/databinding/ViewDataBinding;", "setMBindView", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "isFullDialog", "", "isShowDim", "canceledOnTouchOutside", "cancelable", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onViewCreated", "view", "showDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "showNow", "manager", "tag", "", "dismiss", "hideProgress", "showProgress", "layoutId", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseDialogFragment<T extends ViewDataBinding> extends DialogFragment {
    public static final int $stable = 8;
    public T mBindView;
    private MaterialDialog mProgressDialog;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.base.BaseDialogFragment$onCreate$1", m13596f = "BaseDialogFragment.kt", m13597i = {}, m13598l = {51}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.base.BaseDialogFragment$onCreate$1 */
    public static final class C68531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f8665a;

        public C68531(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C68531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f8665a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                BaseDialogFragment baseDialogFragment = BaseDialogFragment.this;
                this.f8665a = 1;
                if (baseDialogFragment.initData(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.base.BaseDialogFragment$onViewCreated$1", m13596f = "BaseDialogFragment.kt", m13597i = {}, m13598l = {80}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.base.BaseDialogFragment$onViewCreated$1 */
    public static final class C68541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f8667a;

        /* renamed from: c */
        public final /* synthetic */ Bundle f8669c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68541(Bundle bundle, Continuation continuation) {
            super(2, continuation);
            this.f8669c = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C68541(this.f8669c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f8667a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                BaseDialogFragment baseDialogFragment = BaseDialogFragment.this;
                Bundle bundle = this.f8669c;
                this.f8667a = 1;
                if (baseDialogFragment.initView(bundle, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ <T extends ViewDataBinding> Object initData$suspendImpl(BaseDialogFragment<T> baseDialogFragment, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
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
        Intrinsics.throwUninitializedPropertyAccessException("mBindView");
        return null;
    }

    public final void hideProgress() {
        MaterialDialog materialDialog = this.mProgressDialog;
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    public Object initData(Continuation<? super Unit> continuation) {
        return initData$suspendImpl(this, continuation);
    }

    public abstract Object initView(Bundle bundle, Continuation<? super Unit> continuation);

    public boolean isFullDialog() {
        return false;
    }

    public boolean isShowDim() {
        return true;
    }

    @LayoutRes
    public abstract int layoutId();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!isFullDialog()) {
            setStyle(1, R.style.CustomDialog);
        } else if (isShowDim()) {
            setStyle(1, R.style.ActivityDialogDimStyle);
        } else {
            setStyle(1, R.style.ActivityDialogStyle);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C68531(null), 3, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setCanceledOnTouchOutside(canceledOnTouchOutside());
        dialogOnCreateDialog.setCancelable(cancelable());
        setCancelable(cancelable());
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(inflater, layoutId(), container, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "inflate(...)");
        setMBindView(viewDataBindingInflate);
        getMBindView().setLifecycleOwner(getViewLifecycleOwner());
        return getMBindView().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C68541(savedInstanceState, null), 3, null);
    }

    public void setMBindView(T t10) {
        Intrinsics.checkNotNullParameter(t10, "<set-?>");
        this.mBindView = t10;
    }

    public final void showDialog(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (isAdded()) {
            dismiss();
        }
        showNow(fragmentManager, getClass().getSimpleName());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void showNow(FragmentManager manager, String tag) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Class<?> superclass = getClass();
        while (!Intrinsics.areEqual(superclass.getName(), "androidx.fragment.app.DialogFragment")) {
            superclass = superclass.getSuperclass();
            Intrinsics.checkNotNull(superclass, "null cannot be cast to non-null type java.lang.Class<in @[FlexibleNullability] kotlin.Any?>");
        }
        Field declaredField = superclass.getDeclaredField("mDismissed");
        declaredField.setAccessible(true);
        declaredField.setBoolean(this, false);
        Field declaredField2 = superclass.getDeclaredField("mShownByMe");
        declaredField2.setAccessible(true);
        declaredField2.setBoolean(this, true);
        FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        fragmentTransactionBeginTransaction.add(this, tag);
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }

    public final void showProgress() {
        if (this.mProgressDialog == null) {
            this.mProgressDialog = new MaterialDialog.C6512f(requireContext()).m5598e().m5601h("提示").m5596c("请稍候。。。").m5599f(true, 0).m5600g(false).m5594a();
        }
        MaterialDialog materialDialog = this.mProgressDialog;
        if (materialDialog != null) {
            materialDialog.show();
        }
    }
}
