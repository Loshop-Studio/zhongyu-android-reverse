package com.friday.login.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.entity.SendSmsBean;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.login.R$layout;
import com.friday.login.R$string;
import com.friday.login.databinding.LoginActivityBinding;
import com.friday.login.view.LoginActivity;
import com.friday.login.view.SMSVerificationDialog;
import com.friday.login.viewmodel.LoginViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.policy.p105ui.PolicyCheckView;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p126e2.AbstractC9073b;
import p141f2.C9164a;
import p141f2.C9166c;
import p141f2.C9174k;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9795m;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
@Route(path = "/login/LoginActivity")
/* loaded from: classes4.dex */
public final class LoginActivity extends Hilt_LoginActivity<LoginActivityBinding> {

    /* renamed from: g */
    public final InterfaceC10773d f9042g;

    /* renamed from: com.friday.login.view.LoginActivity$a */
    public static final class C6171a implements PermissionUtils.SimpleCallback {

        /* renamed from: b */
        public final /* synthetic */ View f9048b;

        /* renamed from: c */
        public final /* synthetic */ String f9049c;

        /* renamed from: d */
        public final /* synthetic */ String f9050d;

        /* renamed from: e */
        public final /* synthetic */ String f9051e;

        public C6171a(View view, String str, String str2, String str3) {
            this.f9048b = view;
            this.f9049c = str;
            this.f9050d = str2;
            this.f9051e = str3;
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
        public void onDenied() {
            ToastUtils.showShort("笔记存储需要权限", new Object[0]);
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
        public void onGranted() {
            LoginActivity.this.isShowLoading(true);
            KeyboardUtils.hideSoftInput(this.f9048b);
            LoginActivity.this.m6883U().m6904i(this.f9049c, this.f9050d, this.f9051e);
        }
    }

    /* renamed from: com.friday.login.view.LoginActivity$b */
    public static final class C6172b implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f9052c;

        public C6172b(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f9052c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f9052c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f9052c.invoke(obj);
        }
    }

    public LoginActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9042g = new ViewModelLazy(AbstractC9983y.m20315b(LoginViewModel.class), new InterfaceC9529a() { // from class: com.friday.login.view.LoginActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.login.view.LoginActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.login.view.LoginActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* renamed from: V */
    public static final void m6877V(LoginActivity loginActivity, Boolean bool) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                loginActivity.isShowLoading(false);
                return;
            }
            C5963c.f6084a.m5320u();
            loginActivity.isShowLoading(false);
            loginActivity.finish();
        }
    }

    /* renamed from: W */
    public static final C10786q m6878W(LoginActivity loginActivity, boolean z10) {
        loginActivity.isShowLoading(!z10);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: X */
    public static final C10786q m6879X(LoginActivity loginActivity, SendSmsBean sendSmsBean) {
        String mobile;
        if (sendSmsBean != null) {
            Fragment fragmentFindFragmentByTag = loginActivity.getSupportFragmentManager().findFragmentByTag(SMSVerificationDialog.class.getSimpleName());
            if (fragmentFindFragmentByTag instanceof SMSVerificationDialog) {
                ((SMSVerificationDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
            }
            Editable text = ((LoginActivityBinding) loginActivity.getMBinding()).f9018h.getText();
            String strValueOf = String.valueOf(text != null ? AbstractC10793c0.m23129e1(text) : null);
            SMSVerificationDialog.C6176a c6176a = SMSVerificationDialog.f9053m;
            if (TextUtils.isEmpty(sendSmsBean.getMobile())) {
                mobile = strValueOf;
            } else {
                mobile = sendSmsBean.getMobile();
                if (mobile == null) {
                    mobile = "";
                }
            }
            Editable text2 = ((LoginActivityBinding) loginActivity.getMBinding()).f9020j.getText();
            String strValueOf2 = String.valueOf(text2 != null ? AbstractC10793c0.m23129e1(text2) : null);
            Editable text3 = ((LoginActivityBinding) loginActivity.getMBinding()).f9019i.getText();
            SMSVerificationDialog sMSVerificationDialogM6899a = c6176a.m6899a(mobile, strValueOf, strValueOf2, String.valueOf(text3 != null ? AbstractC10793c0.m23129e1(text3) : null));
            FragmentManager supportFragmentManager = loginActivity.getSupportFragmentManager();
            AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
            sMSVerificationDialogM6899a.show(supportFragmentManager, SMSVerificationDialog.class.getSimpleName());
        }
        return C10786q.f26013a;
    }

    /* renamed from: Z */
    public static final boolean m6880Z(LoginActivity loginActivity, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 2) {
            return false;
        }
        AbstractC9979u.m20291d(textView);
        loginActivity.m6885b0(textView);
        return true;
    }

    /* renamed from: a0 */
    public static final C10786q m6881a0(LoginActivity loginActivity, boolean z10, int i10) {
        loginActivity.m6882T(z10);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public final void m6882T(boolean z10) {
        if (z10) {
            ((LoginActivityBinding) getMBinding()).f9024n.setVisibility(8);
            ((LoginActivityBinding) getMBinding()).f9025o.setVisibility(0);
            ((LoginActivityBinding) getMBinding()).f9027q.setVisibility(0);
            ((LoginActivityBinding) getMBinding()).f9021k.setVisibility(8);
        } else {
            ((LoginActivityBinding) getMBinding()).f9024n.setVisibility(0);
            ((LoginActivityBinding) getMBinding()).f9025o.setVisibility(8);
            ((LoginActivityBinding) getMBinding()).f9027q.setVisibility(8);
            ((LoginActivityBinding) getMBinding()).f9021k.setVisibility(0);
        }
        TextView textView = ((LoginActivityBinding) getMBinding()).f9027q;
        C9164a c9164a = C9164a.f21403a;
        c9164a.m18054a(textView, 200L, textView.getVisibility());
        ImageView imageView = ((LoginActivityBinding) getMBinding()).f9021k;
        c9164a.m18054a(imageView, 400L, imageView.getVisibility());
    }

    /* renamed from: U */
    public final LoginViewModel m6883U() {
        return (LoginViewModel) this.f9042g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Y */
    public final void m6884Y() {
        C9166c c9166c = C9166c.f21406a;
        TextInputEditText etSchoolCode = ((LoginActivityBinding) getMBinding()).f9020j;
        AbstractC9979u.m20293f(etSchoolCode, "etSchoolCode");
        TextInputEditText etAccount = ((LoginActivityBinding) getMBinding()).f9018h;
        AbstractC9979u.m20293f(etAccount, "etAccount");
        TextInputEditText etPassword = ((LoginActivityBinding) getMBinding()).f9019i;
        AbstractC9979u.m20293f(etPassword, "etPassword");
        c9166c.m18059b(etSchoolCode, etAccount, etPassword);
        ((LoginActivityBinding) getMBinding()).f9019i.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: p3.e
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return LoginActivity.m6880Z(this.f25591c, textView, i10, keyEvent);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b0 */
    public final void m6885b0(View view) {
        if (AbstractC9795m.f22988a.m19787a()) {
            return;
        }
        String lowerCase = String.valueOf(((LoginActivityBinding) getMBinding()).f9020j.getText()).toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        String strValueOf = String.valueOf(((LoginActivityBinding) getMBinding()).f9018h.getText());
        String strValueOf2 = String.valueOf(((LoginActivityBinding) getMBinding()).f9019i.getText());
        if (StringUtils.isEmpty(lowerCase)) {
            C9166c c9166c = C9166c.f21406a;
            TextInputEditText etSchoolCode = ((LoginActivityBinding) getMBinding()).f9020j;
            AbstractC9979u.m20293f(etSchoolCode, "etSchoolCode");
            c9166c.m18062f(etSchoolCode, AbstractC11958b.m26585f(R$string.input_school_code_please));
            return;
        }
        if (StringUtils.isEmpty(strValueOf)) {
            C9166c c9166c2 = C9166c.f21406a;
            TextInputEditText etAccount = ((LoginActivityBinding) getMBinding()).f9018h;
            AbstractC9979u.m20293f(etAccount, "etAccount");
            c9166c2.m18062f(etAccount, AbstractC11958b.m26585f(R$string.input_account_please));
            return;
        }
        if (StringUtils.isEmpty(strValueOf2)) {
            C9166c c9166c3 = C9166c.f21406a;
            TextInputEditText etPassword = ((LoginActivityBinding) getMBinding()).f9019i;
            AbstractC9979u.m20293f(etPassword, "etPassword");
            c9166c3.m18062f(etPassword, AbstractC11958b.m26585f(R$string.input_password_please));
            return;
        }
        int length = strValueOf2.length();
        if (6 > length || length >= 17) {
            C9166c c9166c4 = C9166c.f21406a;
            TextInputEditText etPassword2 = ((LoginActivityBinding) getMBinding()).f9019i;
            AbstractC9979u.m20293f(etPassword2, "etPassword");
            c9166c4.m18062f(etPassword2, AbstractC11958b.m26585f(R$string.password_length_hint));
            return;
        }
        if (((LoginActivityBinding) getMBinding()).f9022l.isChecked()) {
            PermissionUtils.permissionGroup(PermissionConstants.STORAGE).callback(new C6171a(view, lowerCase, strValueOf, strValueOf2)).request();
        } else {
            KeyboardUtils.hideSoftInput(this);
            ToastUtils.showShort("请先仔细阅读并同意《用户服务协议》和《用户隐私政策》", new Object[0]);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC9979u.m20294g(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.login_activity;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        m6884Y();
        initView();
        initDataSource();
    }

    @Override // com.friday.common.base.BaseActivity
    public void initDataSource() {
        super.initDataSource();
        m6883U().m6909n().observe(this, new Observer() { // from class: p3.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                LoginActivity.m6877V(this.f25588c, (Boolean) obj);
            }
        });
        AbstractC9073b.m17876a(m6883U().m6905j(), this, new InterfaceC9540l() { // from class: p3.c
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return LoginActivity.m6878W(this.f25589c, ((Boolean) obj).booleanValue());
            }
        });
        m6883U().m6907l().observe(this, new C6172b(new InterfaceC9540l() { // from class: p3.d
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return LoginActivity.m6879X(this.f25590c, (SendSmsBean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity
    public void initView() {
        super.initView();
        ((LoginActivityBinding) getMBinding()).f9020j.setHint(AbstractC11958b.m26585f(R$string.input_school_code_please));
        ((LoginActivityBinding) getMBinding()).f9018h.setHint(AbstractC11958b.m26585f(R$string.input_account_please));
        ((LoginActivityBinding) getMBinding()).f9019i.setHint(AbstractC11958b.m26585f(R$string.input_password_please));
        C5962b.a aVar = C5962b.f6082a;
        if (aVar.m5299a().m5280h().length() > 0) {
            ((LoginActivityBinding) getMBinding()).f9020j.setText(Editable.Factory.getInstance().newEditable(aVar.m5299a().m5280h()));
        }
        C9174k.f21421d.m18075a(this, new InterfaceC9544p() { // from class: p3.a
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return LoginActivity.m6881a0(this.f25587c, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
        Button btnLogin = ((LoginActivityBinding) getMBinding()).f9013c;
        AbstractC9979u.m20293f(btnLogin, "btnLogin");
        setClickListener(btnLogin);
        Context baseContext = getBaseContext();
        AbstractC9979u.m20293f(baseContext, "getBaseContext(...)");
        PolicyHelper.Builder builderM16594f = new PolicyHelper.Builder(baseContext).m16595g("https://web.alicdn.zykj.org/privacypolicy/cloudnote/userServiceAgreement.html").m16594f("https://web.alicdn.zykj.org/privacypolicy/cloudnote/userPrivacyPolicy.html");
        PolicyCheckView policyCheckView = ((LoginActivityBinding) getMBinding()).f9022l;
        AbstractC9979u.m20293f(policyCheckView, "policyCheckView");
        builderM16594f.m16596h(policyCheckView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
        if (AbstractC9979u.m20289b(view, ((LoginActivityBinding) getMBinding()).f9013c)) {
            m6885b0(view);
        }
    }
}
