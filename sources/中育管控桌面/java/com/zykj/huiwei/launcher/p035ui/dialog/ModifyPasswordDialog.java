package com.zykj.huiwei.launcher.p035ui.dialog;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.huiwei.launcher.databinding.HwDialogModifyPasswordBinding;
import com.zykj.huiwei.launcher.p035ui.dialog.ModifyPasswordDialog;
import com.zykj.huiwei.launcher.viewmodels.ModifyPasswordViewModel;
import com.zykj.manage.R;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p078i4.AbstractC6537g;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011Rp\u0010\u001d\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog;", "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;", "<init>", "()V", "", "layoutId", "()I", "", "g", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;", "Lkotlin/Lazy;", "p", "()Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;", "viewModel", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "text", "start", "before", "count", "h", "Lkotlin/jvm/functions/Function4;", "onTextChange", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nModifyPasswordDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyPasswordDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,59:1\n106#2,15:60\n39#3:75\n55#3,12:76\n84#3,3:88\n39#3:91\n55#3,12:92\n84#3,3:104\n39#3:107\n55#3,12:108\n84#3,3:120\n*S KotlinDebug\n*F\n+ 1 ModifyPasswordDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog\n*L\n16#1:60,15\n35#1:75\n35#1:76,12\n35#1:88,3\n36#1:91\n36#1:92,12\n36#1:104,3\n37#1:107\n37#1:108,12\n37#1:120,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ModifyPasswordDialog extends Hilt_ModifyPasswordDialog<HwDialogModifyPasswordBinding> {

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: h, reason: from kotlin metadata */
    public final Function4 onTextChange;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.ModifyPasswordDialog$a */
    public static final class C6112a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ Function4 f6508a;

        public C6112a(Function4 function4) {
            this.f6508a = function4;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            this.f6508a.invoke(charSequence, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.ModifyPasswordDialog$b */
    public static final class C6113b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ Function4 f6509a;

        public C6113b(Function4 function4) {
            this.f6509a = function4;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            this.f6509a.invoke(charSequence, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.ModifyPasswordDialog$c */
    public static final class C6114c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ Function4 f6510a;

        public C6114c(Function4 function4) {
            this.f6510a = function4;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            this.f6510a.invoke(charSequence, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.ModifyPasswordDialog$d */
    public static final class C6115d implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f6511a;

        public C6115d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6511a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f6511a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f6511a.invoke(obj);
        }
    }

    public ModifyPasswordDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ModifyPasswordDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ModifyPasswordDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ModifyPasswordViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ModifyPasswordDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ModifyPasswordDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ModifyPasswordDialog$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.onTextChange = new Function4() { // from class: b4.p
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ModifyPasswordDialog.m5738r(this.f1318a, (CharSequence) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
            }
        };
    }

    /* renamed from: q */
    public static final Unit m5737q(ModifyPasswordDialog modifyPasswordDialog, Boolean bool) {
        if (bool.booleanValue()) {
            modifyPasswordDialog.m5280h(R.string.hw_pwd_update_success);
            AbstractC6537g.a aVar = AbstractC6537g.f8372a;
            FragmentActivity fragmentActivityRequireActivity = modifyPasswordDialog.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            aVar.m7313d(fragmentActivityRequireActivity);
            AbstractC6537g.a.m7309i(aVar, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static final Unit m5738r(ModifyPasswordDialog modifyPasswordDialog, CharSequence charSequence, int i6, int i7, int i8) {
        modifyPasswordDialog.m5739p().getIsBtnEnable().setValue(Boolean.valueOf(StringsKt.trim((CharSequence) String.valueOf(((HwDialogModifyPasswordBinding) modifyPasswordDialog.getMBindView()).etOldPass.getText())).toString().length() > 0 && StringsKt.trim((CharSequence) String.valueOf(((HwDialogModifyPasswordBinding) modifyPasswordDialog.getMBindView()).etNewPass.getText())).toString().length() > 0 && StringsKt.trim((CharSequence) String.valueOf(((HwDialogModifyPasswordBinding) modifyPasswordDialog.getMBindView()).etNewPass1.getText())).toString().length() > 0));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment
    /* renamed from: g */
    public void mo5279g() {
        ((HwDialogModifyPasswordBinding) getMBindView()).setVm(m5739p());
        ((HwDialogModifyPasswordBinding) getMBindView()).setOnClickListener(this);
        AppCompatEditText etOldPass = ((HwDialogModifyPasswordBinding) getMBindView()).etOldPass;
        Intrinsics.checkNotNullExpressionValue(etOldPass, "etOldPass");
        etOldPass.addTextChangedListener(new C6112a(this.onTextChange));
        AppCompatEditText etNewPass = ((HwDialogModifyPasswordBinding) getMBindView()).etNewPass;
        Intrinsics.checkNotNullExpressionValue(etNewPass, "etNewPass");
        etNewPass.addTextChangedListener(new C6113b(this.onTextChange));
        AppCompatEditText etNewPass1 = ((HwDialogModifyPasswordBinding) getMBindView()).etNewPass1;
        Intrinsics.checkNotNullExpressionValue(etNewPass1, "etNewPass1");
        etNewPass1.addTextChangedListener(new C6114c(this.onTextChange));
        m5739p().getChangeSuccess().observe(getViewLifecycleOwner(), new C6115d(new Function1() { // from class: b4.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPasswordDialog.m5737q(this.f1317a, (Boolean) obj);
            }
        }));
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.hw_dialog_modify_password;
    }

    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment, android.view.View.OnClickListener
    public void onClick(View v6) {
        super.onClick(v6);
        Integer numValueOf = v6 != null ? Integer.valueOf(v6.getId()) : null;
        if (numValueOf == null || numValueOf.intValue() != R.id.ivClose) {
            if (numValueOf != null && numValueOf.intValue() == R.id.tvModify) {
                m5739p().m6171h();
                return;
            }
            return;
        }
        AbstractC6537g.a aVar = AbstractC6537g.f8372a;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        aVar.m7313d(fragmentActivityRequireActivity);
        FragmentKt.findNavController(this).navigateUp();
    }

    /* renamed from: p */
    public final ModifyPasswordViewModel m5739p() {
        return (ModifyPasswordViewModel) this.viewModel.getValue();
    }
}
