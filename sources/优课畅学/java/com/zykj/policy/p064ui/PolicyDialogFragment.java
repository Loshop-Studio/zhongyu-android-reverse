package com.zykj.policy.p064ui;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.DialogFragment;
import com.zykj.policy.R$string;
import com.zykj.policy.databinding.PolicyDialogPolicyBinding;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.policy.p064ui.PolicyDetailActivity;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p142j4.C9013a;
import p153k4.AbstractC9055b;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class PolicyDialogFragment extends DialogFragment {

    /* renamed from: d */
    public static final C7430a f10582d = new C7430a(null);

    /* renamed from: a */
    public final InterfaceC8724d f10583a = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.policy.ui.PolicyDialogFragment$binding$2
        {
            super(0);
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PolicyDialogPolicyBinding invoke() {
            return PolicyDialogPolicyBinding.m9721c(LayoutInflater.from(this.f10586a.requireContext()));
        }
    });

    /* renamed from: b */
    public InterfaceC10559a f10584b;

    /* renamed from: c */
    public InterfaceC10559a f10585c;

    /* renamed from: com.zykj.policy.ui.PolicyDialogFragment$a */
    public static final class C7430a {
        public /* synthetic */ C7430a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final PolicyDialogFragment m9751a(C9013a policyBean) {
            AbstractC9133u.m16133g(policyBean, "policyBean");
            Bundle bundle = new Bundle();
            bundle.putInt("SPAN_COLOR", policyBean.m15658h());
            bundle.putString("TITLE", policyBean.m15659i());
            bundle.putString("CONTENT", policyBean.m15653c());
            bundle.putString("CANCEL", policyBean.m15651a());
            bundle.putString("CONFIRM", policyBean.m15652b());
            bundle.putString("USER_AGREEMENT_URL", policyBean.m15661k());
            bundle.putString("PRIVATE_POLICY_URL", policyBean.m15657g());
            PolicyDialogFragment policyDialogFragment = new PolicyDialogFragment();
            policyDialogFragment.m9749i(policyBean.m15654d());
            policyDialogFragment.m9750j(policyBean.m15655e());
            policyDialogFragment.setArguments(bundle);
            return policyDialogFragment;
        }

        public C7430a() {
        }
    }

    /* renamed from: f */
    public final PolicyDialogPolicyBinding m9746f() {
        return (PolicyDialogPolicyBinding) this.f10583a.getValue();
    }

    /* renamed from: g */
    public final InterfaceC10559a m9747g() {
        return this.f10584b;
    }

    /* renamed from: h */
    public final InterfaceC10559a m9748h() {
        return this.f10585c;
    }

    /* renamed from: i */
    public final void m9749i(InterfaceC10559a interfaceC10559a) {
        this.f10584b = interfaceC10559a;
    }

    /* renamed from: j */
    public final void m9750j(InterfaceC10559a interfaceC10559a) {
        this.f10585c = interfaceC10559a;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        AbstractC9133u.m16132f(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        dialogOnCreateDialog.setCancelable(false);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        LinearLayoutCompat root = m9746f().getRoot();
        AbstractC9133u.m16132f(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        setCancelable(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("TITLE");
            if (string != null) {
                AbstractC9133u.m16132f(string, "getString(TITLE)");
                if (!AbstractC8661c0.m13993h0(string)) {
                    m9746f().f10566e.setText(string);
                }
            }
            String string2 = arguments.getString("CONTENT");
            if (string2 != null) {
                AbstractC9133u.m16132f(string2, "getString(CONTENT)");
                if (!AbstractC8661c0.m13993h0(string2)) {
                    m9746f().f10565d.setText(string2);
                }
            }
            String string3 = arguments.getString("CANCEL");
            if (string3 != null) {
                AbstractC9133u.m16132f(string3, "getString(CANCEL)");
                if (!AbstractC8661c0.m13993h0(string3)) {
                    m9746f().f10563b.setText(string3);
                }
            }
            String string4 = arguments.getString("CONFIRM");
            if (string4 != null) {
                AbstractC9133u.m16132f(string4, "getString(CONFIRM)");
                if (!AbstractC8661c0.m13993h0(string4)) {
                    m9746f().f10564c.setText(string4);
                }
            }
        }
        String string5 = m9746f().f10565d.getText().toString();
        m9746f().f10565d.setMovementMethod(LinkMovementMethod.getInstance());
        m9746f().f10565d.setHighlightColor(0);
        TextView textView = m9746f().f10565d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string5);
        Bundle arguments2 = getArguments();
        int i10 = arguments2 != null ? arguments2.getInt("SPAN_COLOR") : Color.parseColor("#1576FF");
        String string6 = getString(R$string.policy_agreement);
        AbstractC9133u.m16132f(string6, "getString(R.string.policy_agreement)");
        AbstractC9055b.m15856b(spannableStringBuilder, i10, string5, string6, new InterfaceC10559a() { // from class: com.zykj.policy.ui.PolicyDialogFragment$onViewCreated$2$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27505invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27505invoke() {
                PolicyDetailActivity.C7428a c7428a = PolicyDetailActivity.f10576c;
                Context contextRequireContext = this.f10587a.requireContext();
                AbstractC9133u.m16132f(contextRequireContext, "requireContext()");
                Bundle arguments3 = this.f10587a.getArguments();
                String string7 = arguments3 != null ? arguments3.getString("USER_AGREEMENT_URL") : null;
                if (string7 == null) {
                    string7 = "";
                }
                c7428a.m9744a(contextRequireContext, string7);
            }
        });
        Bundle arguments3 = getArguments();
        int i11 = arguments3 != null ? arguments3.getInt("SPAN_COLOR") : Color.parseColor("#1576FF");
        String string7 = getString(R$string.policy_private);
        AbstractC9133u.m16132f(string7, "getString(R.string.policy_private)");
        AbstractC9055b.m15856b(spannableStringBuilder, i11, string5, string7, new InterfaceC10559a() { // from class: com.zykj.policy.ui.PolicyDialogFragment$onViewCreated$2$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27506invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27506invoke() {
                PolicyDetailActivity.C7428a c7428a = PolicyDetailActivity.f10576c;
                Context contextRequireContext = this.f10588a.requireContext();
                AbstractC9133u.m16132f(contextRequireContext, "requireContext()");
                Bundle arguments4 = this.f10588a.getArguments();
                String string8 = arguments4 != null ? arguments4.getString("PRIVATE_POLICY_URL") : null;
                if (string8 == null) {
                    string8 = "";
                }
                c7428a.m9744a(contextRequireContext, string8);
            }
        });
        textView.setText(spannableStringBuilder);
        AppCompatButton appCompatButton = m9746f().f10563b;
        AbstractC9133u.m16132f(appCompatButton, "binding.btnCancel");
        AbstractC9055b.m15859e(appCompatButton, new InterfaceC10570l() { // from class: com.zykj.policy.ui.PolicyDialogFragment.onViewCreated.3
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C8736p.f16368a;
            }

            public final void invoke(View it) {
                AbstractC9133u.m16133g(it, "it");
                InterfaceC10559a interfaceC10559aM9747g = PolicyDialogFragment.this.m9747g();
                if (interfaceC10559aM9747g != null) {
                    interfaceC10559aM9747g.invoke();
                }
                PolicyDialogFragment.this.dismissAllowingStateLoss();
            }
        });
        AppCompatButton appCompatButton2 = m9746f().f10564c;
        AbstractC9133u.m16132f(appCompatButton2, "binding.btnConfirm");
        AbstractC9055b.m15859e(appCompatButton2, new InterfaceC10570l() { // from class: com.zykj.policy.ui.PolicyDialogFragment.onViewCreated.4
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C8736p.f16368a;
            }

            public final void invoke(View it) {
                AbstractC9133u.m16133g(it, "it");
                PolicyHelper.C7427a c7427a = PolicyHelper.f10567a;
                Context contextRequireContext = PolicyDialogFragment.this.requireContext();
                AbstractC9133u.m16132f(contextRequireContext, "requireContext()");
                c7427a.m9736c(contextRequireContext, true);
                InterfaceC10559a interfaceC10559aM9748h = PolicyDialogFragment.this.m9748h();
                if (interfaceC10559aM9748h != null) {
                    interfaceC10559aM9748h.invoke();
                }
                PolicyDialogFragment.this.dismissAllowingStateLoss();
            }
        });
    }
}
