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
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
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

@Keep
@Metadata(m13557d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010\u001d\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u0012H\u0016J\b\u0010)\u001a\u00020*H%J\u0018\u0010+\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H¤@¢\u0006\u0002\u0010,R\u001c\u0010\u0006\u001a\u00028\u0000X\u0096.¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006-"}, m13558d2 = {"Lcom/zykj/base/BaseDialogFragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "mBindView", "getMBindView", "()Landroidx/databinding/ViewDataBinding;", "setMBindView", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "isFullDialog", "", "isShowDim", "canceledOnTouchOutside", "cancelable", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onViewCreated", "view", "showDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "showNow", "manager", "tag", "", "dismiss", "layoutId", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "base_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseDialogFragment<T extends ViewDataBinding> extends DialogFragment {
    public T mBindView;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.base.BaseDialogFragment$onCreate$1", m13596f = "BaseDialogFragment.kt", m13597i = {}, m13598l = {47}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.base.BaseDialogFragment$onCreate$1 */
    public static final class C66061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6830a;

        public C66061(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C66061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6830a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                BaseDialogFragment baseDialogFragment = BaseDialogFragment.this;
                this.f6830a = 1;
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
            return ((C66061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.base.BaseDialogFragment$onViewCreated$1", m13596f = "BaseDialogFragment.kt", m13597i = {}, m13598l = {76}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.base.BaseDialogFragment$onViewCreated$1 */
    public static final class C66071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6832a;

        /* renamed from: c */
        public final /* synthetic */ Bundle f6834c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66071(Bundle bundle, Continuation continuation) {
            super(2, continuation);
            this.f6834c = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C66071(this.f6834c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6832a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                BaseDialogFragment baseDialogFragment = BaseDialogFragment.this;
                Bundle bundle = this.f6834c;
                this.f6832a = 1;
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
            return ((C66071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            setStyle(1, R$style.CustomDialog);
        } else if (isShowDim()) {
            setStyle(1, R$style.ActivityDialogDimStyle);
        } else {
            setStyle(1, R$style.ActivityDialogStyle);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C66061(null), 3, null);
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
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C66071(savedInstanceState, null), 3, null);
    }

    public void setMBindView(T t10) {
        Intrinsics.checkNotNullParameter(t10, "<set-?>");
        this.mBindView = t10;
    }

    public final void showDialog(FragmentManager fragmentManager) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
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
}
