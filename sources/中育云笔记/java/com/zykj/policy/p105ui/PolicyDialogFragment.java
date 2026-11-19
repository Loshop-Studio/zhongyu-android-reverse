package com.zykj.policy.p105ui;

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
import com.zykj.policy.p105ui.PolicyDetailActivity;
import gb.AbstractC9286b;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p150fb.C9217a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;

/* loaded from: classes6.dex */
public final class PolicyDialogFragment extends DialogFragment {

    /* renamed from: g */
    public static final C8664a f19884g = new C8664a(null);

    /* renamed from: d */
    public final InterfaceC10773d f19885d = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: com.zykj.policy.ui.PolicyDialogFragment$binding$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PolicyDialogPolicyBinding invoke() {
            return PolicyDialogPolicyBinding.m16586c(LayoutInflater.from(this.f19888c.requireContext()));
        }
    });

    /* renamed from: e */
    public InterfaceC9529a f19886e;

    /* renamed from: f */
    public InterfaceC9529a f19887f;

    /* renamed from: com.zykj.policy.ui.PolicyDialogFragment$a */
    public static final class C8664a {
        public /* synthetic */ C8664a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final PolicyDialogFragment m16616a(C9217a policyBean) {
            AbstractC9979u.m20294g(policyBean, "policyBean");
            Bundle bundle = new Bundle();
            bundle.putInt("SPAN_COLOR", policyBean.m18126h());
            bundle.putString("TITLE", policyBean.m18127i());
            bundle.putString("CONTENT", policyBean.m18121c());
            bundle.putString("CANCEL", policyBean.m18119a());
            bundle.putString("CONFIRM", policyBean.m18120b());
            bundle.putString("USER_AGREEMENT_URL", policyBean.m18129k());
            bundle.putString("PRIVATE_POLICY_URL", policyBean.m18125g());
            PolicyDialogFragment policyDialogFragment = new PolicyDialogFragment();
            policyDialogFragment.m16614r(policyBean.m18122d());
            policyDialogFragment.m16615s(policyBean.m18123e());
            policyDialogFragment.setArguments(bundle);
            return policyDialogFragment;
        }

        public C8664a() {
        }
    }

    /* renamed from: o */
    public final PolicyDialogPolicyBinding m16611o() {
        return (PolicyDialogPolicyBinding) this.f19885d.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        AbstractC9979u.m20293f(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
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
        AbstractC9979u.m20294g(inflater, "inflater");
        LinearLayoutCompat root = m16611o().getRoot();
        AbstractC9979u.m20293f(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        setCancelable(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("TITLE");
            if (string != null) {
                AbstractC9979u.m20293f(string, "getString(TITLE)");
                if (!AbstractC10793c0.m23132h0(string)) {
                    m16611o().f19868g.setText(string);
                }
            }
            String string2 = arguments.getString("CONTENT");
            if (string2 != null) {
                AbstractC9979u.m20293f(string2, "getString(CONTENT)");
                if (!AbstractC10793c0.m23132h0(string2)) {
                    m16611o().f19867f.setText(string2);
                }
            }
            String string3 = arguments.getString("CANCEL");
            if (string3 != null) {
                AbstractC9979u.m20293f(string3, "getString(CANCEL)");
                if (!AbstractC10793c0.m23132h0(string3)) {
                    m16611o().f19865d.setText(string3);
                }
            }
            String string4 = arguments.getString("CONFIRM");
            if (string4 != null) {
                AbstractC9979u.m20293f(string4, "getString(CONFIRM)");
                if (!AbstractC10793c0.m23132h0(string4)) {
                    m16611o().f19866e.setText(string4);
                }
            }
        }
        String string5 = m16611o().f19867f.getText().toString();
        m16611o().f19867f.setMovementMethod(LinkMovementMethod.getInstance());
        m16611o().f19867f.setHighlightColor(0);
        TextView textView = m16611o().f19867f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string5);
        Bundle arguments2 = getArguments();
        int i10 = arguments2 != null ? arguments2.getInt("SPAN_COLOR") : Color.parseColor("#1576FF");
        String string6 = getString(R$string.policy_agreement);
        AbstractC9979u.m20293f(string6, "getString(R.string.policy_agreement)");
        AbstractC9286b.m18306b(spannableStringBuilder, i10, string5, string6, new InterfaceC9529a() { // from class: com.zykj.policy.ui.PolicyDialogFragment$onViewCreated$2$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34049invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34049invoke() {
                PolicyDetailActivity.C8662a c8662a = PolicyDetailActivity.f19878e;
                Context contextRequireContext = this.f19889c.requireContext();
                AbstractC9979u.m20293f(contextRequireContext, "requireContext()");
                Bundle arguments3 = this.f19889c.getArguments();
                String string7 = arguments3 != null ? arguments3.getString("USER_AGREEMENT_URL") : null;
                if (string7 == null) {
                    string7 = "";
                }
                c8662a.m16609a(contextRequireContext, string7);
            }
        });
        Bundle arguments3 = getArguments();
        int i11 = arguments3 != null ? arguments3.getInt("SPAN_COLOR") : Color.parseColor("#1576FF");
        String string7 = getString(R$string.policy_private);
        AbstractC9979u.m20293f(string7, "getString(R.string.policy_private)");
        AbstractC9286b.m18306b(spannableStringBuilder, i11, string5, string7, new InterfaceC9529a() { // from class: com.zykj.policy.ui.PolicyDialogFragment$onViewCreated$2$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34050invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34050invoke() {
                PolicyDetailActivity.C8662a c8662a = PolicyDetailActivity.f19878e;
                Context contextRequireContext = this.f19890c.requireContext();
                AbstractC9979u.m20293f(contextRequireContext, "requireContext()");
                Bundle arguments4 = this.f19890c.getArguments();
                String string8 = arguments4 != null ? arguments4.getString("PRIVATE_POLICY_URL") : null;
                if (string8 == null) {
                    string8 = "";
                }
                c8662a.m16609a(contextRequireContext, string8);
            }
        });
        textView.setText(spannableStringBuilder);
        AppCompatButton appCompatButton = m16611o().f19865d;
        AbstractC9979u.m20293f(appCompatButton, "binding.btnCancel");
        AbstractC9286b.m18309e(appCompatButton, new InterfaceC9540l() { // from class: com.zykj.policy.ui.PolicyDialogFragment.onViewCreated.3
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C10786q.f26013a;
            }

            public final void invoke(View it) {
                AbstractC9979u.m20294g(it, "it");
                InterfaceC9529a interfaceC9529aM16612p = PolicyDialogFragment.this.m16612p();
                if (interfaceC9529aM16612p != null) {
                    interfaceC9529aM16612p.invoke();
                }
                PolicyDialogFragment.this.dismissAllowingStateLoss();
            }
        });
        AppCompatButton appCompatButton2 = m16611o().f19866e;
        AbstractC9979u.m20293f(appCompatButton2, "binding.btnConfirm");
        AbstractC9286b.m18309e(appCompatButton2, new InterfaceC9540l() { // from class: com.zykj.policy.ui.PolicyDialogFragment.onViewCreated.4
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C10786q.f26013a;
            }

            public final void invoke(View it) {
                AbstractC9979u.m20294g(it, "it");
                PolicyHelper.C8661a c8661a = PolicyHelper.f19869a;
                Context contextRequireContext = PolicyDialogFragment.this.requireContext();
                AbstractC9979u.m20293f(contextRequireContext, "requireContext()");
                c8661a.m16601c(contextRequireContext, true);
                InterfaceC9529a interfaceC9529aM16613q = PolicyDialogFragment.this.m16613q();
                if (interfaceC9529aM16613q != null) {
                    interfaceC9529aM16613q.invoke();
                }
                PolicyDialogFragment.this.dismissAllowingStateLoss();
            }
        });
    }

    /* renamed from: p */
    public final InterfaceC9529a m16612p() {
        return this.f19886e;
    }

    /* renamed from: q */
    public final InterfaceC9529a m16613q() {
        return this.f19887f;
    }

    /* renamed from: r */
    public final void m16614r(InterfaceC9529a interfaceC9529a) {
        this.f19886e = interfaceC9529a;
    }

    /* renamed from: s */
    public final void m16615s(InterfaceC9529a interfaceC9529a) {
        this.f19887f = interfaceC9529a;
    }
}
