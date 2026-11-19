package com.friday.login.view;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blankj.utilcode.util.ClickUtils;
import com.friday.common.helper.C5962b;
import com.friday.login.R$layout;
import com.friday.login.R$style;
import com.friday.login.databinding.DialogSmsVerificationBinding;
import com.friday.login.view.SMSVerificationDialog;
import com.friday.login.viewmodel.LoginViewModel;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SMSVerificationDialog extends Hilt_SMSVerificationDialog<DialogSmsVerificationBinding> {

    /* renamed from: m */
    public static final C6176a f9053m = new C6176a(null);

    /* renamed from: n */
    public static final int f9054n = 8;

    /* renamed from: k */
    public final InterfaceC10773d f9055k;

    /* renamed from: l */
    public final InterfaceC10773d f9056l = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: p3.k
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return SMSVerificationDialog.m6896x(this.f25601c);
        }
    });

    /* renamed from: com.friday.login.view.SMSVerificationDialog$a */
    public static final class C6176a {
        public /* synthetic */ C6176a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final SMSVerificationDialog m6899a(String mobileNumber, String account, String schoolCode, String password) {
            AbstractC9979u.m20294g(mobileNumber, "mobileNumber");
            AbstractC9979u.m20294g(account, "account");
            AbstractC9979u.m20294g(schoolCode, "schoolCode");
            AbstractC9979u.m20294g(password, "password");
            SMSVerificationDialog sMSVerificationDialog = new SMSVerificationDialog();
            Bundle bundle = new Bundle();
            bundle.putString("mobile_number", mobileNumber);
            bundle.putString("account", account);
            bundle.putString("school_code", schoolCode);
            bundle.putString(HintConstants.AUTOFILL_HINT_PASSWORD, password);
            sMSVerificationDialog.setArguments(bundle);
            return sMSVerificationDialog;
        }

        public C6176a() {
        }
    }

    /* renamed from: com.friday.login.view.SMSVerificationDialog$b */
    public static final class CountDownTimerC6177b extends CountDownTimer {
        public CountDownTimerC6177b() {
            super(60000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            SMSVerificationDialog.m6895w(SMSVerificationDialog.this).f9007f.setEnabled(true);
            SMSVerificationDialog.m6895w(SMSVerificationDialog.this).f9007f.setText("获取验证码");
            SMSVerificationDialog.m6895w(SMSVerificationDialog.this).f9007f.setTextColor(-1);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            SMSVerificationDialog.m6895w(SMSVerificationDialog.this).f9007f.setText((j10 / 1000) + "s后重发");
        }
    }

    /* renamed from: com.friday.login.view.SMSVerificationDialog$c */
    public static final class C6178c implements TextWatcher {
        public C6178c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextView textView = SMSVerificationDialog.m6895w(SMSVerificationDialog.this).f9006e;
            boolean z10 = false;
            if (editable != null && editable.length() == 4) {
                z10 = true;
            }
            textView.setEnabled(z10);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.friday.login.view.SMSVerificationDialog$d */
    public static final class C6179d implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f9063c;

        public C6179d(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f9063c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f9063c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f9063c.invoke(obj);
        }
    }

    public SMSVerificationDialog() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9055k = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(LoginViewModel.class), new InterfaceC9529a() { // from class: com.friday.login.view.SMSVerificationDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.login.view.SMSVerificationDialog$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.login.view.SMSVerificationDialog$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: A */
    public static final void m6886A(SMSVerificationDialog sMSVerificationDialog, String str, String str2, String str3, View view) {
        Editable text = ((DialogSmsVerificationBinding) sMSVerificationDialog.getMBinding()).f9004c.getText();
        AbstractC9979u.m20293f(text, "getText(...)");
        String string = AbstractC10793c0.m23129e1(text).toString();
        if (AbstractC10793c0.m23132h0(string)) {
            AbstractC11958b.m26588i("请填写验证码");
            return;
        }
        if (string.length() != 4) {
            AbstractC11958b.m26588i("验证码长度不对");
            return;
        }
        sMSVerificationDialog.isShowLoading(true);
        LoginViewModel loginViewModelM6898z = sMSVerificationDialog.m6898z();
        AbstractC9979u.m20291d(str);
        AbstractC9979u.m20291d(str2);
        AbstractC9979u.m20291d(str3);
        loginViewModelM6898z.m6912q(str, str2, str3, string);
    }

    /* renamed from: B */
    public static final void m6887B(SMSVerificationDialog sMSVerificationDialog, String str, View view) {
        sMSVerificationDialog.isShowLoading(true);
        C5962b c5962bM5299a = C5962b.f6082a.m5299a();
        AbstractC9979u.m20291d(str);
        c5962bM5299a.m5263A(str);
        sMSVerificationDialog.m6898z().m6910o();
    }

    /* renamed from: C */
    public static final C10786q m6888C(SMSVerificationDialog sMSVerificationDialog, Boolean bool) {
        sMSVerificationDialog.isShowLoading(false);
        if (bool.booleanValue()) {
            sMSVerificationDialog.dismissAllowingStateLoss();
        }
        return C10786q.f26013a;
    }

    /* renamed from: D */
    public static final C10786q m6889D(SMSVerificationDialog sMSVerificationDialog, String str, Boolean bool) {
        sMSVerificationDialog.isShowLoading(false);
        if (bool.booleanValue()) {
            ((DialogSmsVerificationBinding) sMSVerificationDialog.getMBinding()).f9007f.setEnabled(false);
            if (str.length() == 11) {
                TextView textView = ((DialogSmsVerificationBinding) sMSVerificationDialog.getMBinding()).f9008g;
                AbstractC9979u.m20291d(str);
                String strSubstring = str.substring(0, 3);
                AbstractC9979u.m20293f(strSubstring, "substring(...)");
                String strSubstring2 = str.substring(7, 11);
                AbstractC9979u.m20293f(strSubstring2, "substring(...)");
                textView.setText("短信验证码已发送至 +86 " + strSubstring + "****" + strSubstring2);
            }
            ((DialogSmsVerificationBinding) sMSVerificationDialog.getMBinding()).f9007f.setTextColor(Color.parseColor("#B0B0B0"));
            sMSVerificationDialog.m6897y().start();
            AbstractC11958b.m26588i("验证码发送成功");
        }
        return C10786q.f26013a;
    }

    /* renamed from: w */
    public static final /* synthetic */ DialogSmsVerificationBinding m6895w(SMSVerificationDialog sMSVerificationDialog) {
        return (DialogSmsVerificationBinding) sMSVerificationDialog.getMBinding();
    }

    /* renamed from: x */
    public static final CountDownTimerC6177b m6896x(SMSVerificationDialog sMSVerificationDialog) {
        return sMSVerificationDialog.new CountDownTimerC6177b();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.dialog_sms_verification;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        if (getArguments() == null) {
            AbstractC11958b.m26588i("未获取到用户信息");
            return;
        }
        final String string = requireArguments().getString("school_code", "");
        final String string2 = requireArguments().getString("mobile_number", "");
        final String string3 = requireArguments().getString("account", "");
        final String string4 = requireArguments().getString(HintConstants.AUTOFILL_HINT_PASSWORD, "");
        ((DialogSmsVerificationBinding) getMBinding()).f9006e.setEnabled(false);
        ClickUtils.applyGlobalDebouncing(((DialogSmsVerificationBinding) getMBinding()).f9006e, 500L, new View.OnClickListener() { // from class: p3.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SMSVerificationDialog.m6886A(this.f25592c, string, string3, string4, view);
            }
        });
        ClickUtils.applyGlobalDebouncing(((DialogSmsVerificationBinding) getMBinding()).f9007f, 500L, new View.OnClickListener() { // from class: p3.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SMSVerificationDialog.m6887B(this.f25596c, string, view);
            }
        });
        EditText etSms = ((DialogSmsVerificationBinding) getMBinding()).f9004c;
        AbstractC9979u.m20293f(etSms, "etSms");
        etSms.addTextChangedListener(new C6178c());
        m6898z().m6908m().observe(getViewLifecycleOwner(), new C6179d(new InterfaceC9540l() { // from class: p3.i
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return SMSVerificationDialog.m6888C(this.f25598c, (Boolean) obj);
            }
        }));
        m6898z().m6906k().observe(getViewLifecycleOwner(), new C6179d(new InterfaceC9540l() { // from class: p3.j
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return SMSVerificationDialog.m6889D(this.f25599c, string2, (Boolean) obj);
            }
        }));
        isShowLoading(true);
        C5962b c5962bM5299a = C5962b.f6082a.m5299a();
        AbstractC9979u.m20291d(string);
        c5962bM5299a.m5263A(string);
        m6898z().m6910o();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R$style.airPlayDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m6897y().cancel();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }

    /* renamed from: y */
    public final CountDownTimerC6177b m6897y() {
        return (CountDownTimerC6177b) this.f9056l.getValue();
    }

    /* renamed from: z */
    public final LoginViewModel m6898z() {
        return (LoginViewModel) this.f9055k.getValue();
    }
}
