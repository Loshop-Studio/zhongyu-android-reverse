package com.zykj.policy.p037ui;

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
import com.zykj.policy.p037ui.PolicyDetailActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p115n4.C7466a;
import p122o4.AbstractC7521b;

@Metadata(m7879d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 &2\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 ¨\u0006'"}, m7880d2 = {"Lcom/zykj/policy/ui/PolicyDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;", "a", "Lkotlin/Lazy;", "f", "()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;", "binding", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "g", "()Lkotlin/jvm/functions/Function0;", "i", "(Lkotlin/jvm/functions/Function0;)V", "onCancel", "c", "h", "j", "onConfirm", "d", "policy_release"}, m7881k = 1, m7882mv = {1, 7, 1}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class PolicyDialogFragment extends DialogFragment {

    /* renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy binding = LazyKt.lazy(new Function0<PolicyDialogPolicyBinding>() { // from class: com.zykj.policy.ui.PolicyDialogFragment$binding$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PolicyDialogPolicyBinding invoke() {
            return PolicyDialogPolicyBinding.m6233c(LayoutInflater.from(this.f7454a.requireContext()));
        }
    });

    /* renamed from: b, reason: from kotlin metadata */
    public Function0 onCancel;

    /* renamed from: c, reason: from kotlin metadata */
    public Function0 onConfirm;

    /* renamed from: com.zykj.policy.ui.PolicyDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PolicyDialogFragment m6262a(C7466a policyBean) {
            Intrinsics.checkNotNullParameter(policyBean, "policyBean");
            Bundle bundle = new Bundle();
            bundle.putInt("SPAN_COLOR", policyBean.m8532h());
            bundle.putString("TITLE", policyBean.m8533i());
            bundle.putString("CONTENT", policyBean.m8527c());
            bundle.putString("CANCEL", policyBean.m8525a());
            bundle.putString("CONFIRM", policyBean.m8526b());
            bundle.putString("USER_AGREEMENT_URL", policyBean.m8535k());
            bundle.putString("PRIVATE_POLICY_URL", policyBean.m8531g());
            PolicyDialogFragment policyDialogFragment = new PolicyDialogFragment();
            policyDialogFragment.m6260i(policyBean.m8528d());
            policyDialogFragment.m6261j(policyBean.m8529e());
            policyDialogFragment.setArguments(bundle);
            return policyDialogFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: f */
    public final PolicyDialogPolicyBinding m6257f() {
        return (PolicyDialogPolicyBinding) this.binding.getValue();
    }

    /* renamed from: g, reason: from getter */
    public final Function0 getOnCancel() {
        return this.onCancel;
    }

    /* renamed from: h, reason: from getter */
    public final Function0 getOnConfirm() {
        return this.onConfirm;
    }

    /* renamed from: i */
    public final void m6260i(Function0 function0) {
        this.onCancel = function0;
    }

    /* renamed from: j */
    public final void m6261j(Function0 function0) {
        this.onConfirm = function0;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        dialogOnCreateDialog.setCancelable(false);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LinearLayoutCompat root = m6257f().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setCancelable(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("TITLE");
            if (string != null) {
                Intrinsics.checkNotNullExpressionValue(string, "getString(TITLE)");
                if (!StringsKt.isBlank(string)) {
                    m6257f().f7434e.setText(string);
                }
            }
            String string2 = arguments.getString("CONTENT");
            if (string2 != null) {
                Intrinsics.checkNotNullExpressionValue(string2, "getString(CONTENT)");
                if (!StringsKt.isBlank(string2)) {
                    m6257f().f7433d.setText(string2);
                }
            }
            String string3 = arguments.getString("CANCEL");
            if (string3 != null) {
                Intrinsics.checkNotNullExpressionValue(string3, "getString(CANCEL)");
                if (!StringsKt.isBlank(string3)) {
                    m6257f().f7431b.setText(string3);
                }
            }
            String string4 = arguments.getString("CONFIRM");
            if (string4 != null) {
                Intrinsics.checkNotNullExpressionValue(string4, "getString(CONFIRM)");
                if (!StringsKt.isBlank(string4)) {
                    m6257f().f7432c.setText(string4);
                }
            }
        }
        String string5 = m6257f().f7433d.getText().toString();
        m6257f().f7433d.setMovementMethod(LinkMovementMethod.getInstance());
        m6257f().f7433d.setHighlightColor(0);
        TextView textView = m6257f().f7433d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string5);
        Bundle arguments2 = getArguments();
        int i6 = arguments2 != null ? arguments2.getInt("SPAN_COLOR") : Color.parseColor("#1576FF");
        String string6 = getString(R$string.policy_agreement);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.policy_agreement)");
        AbstractC7521b.m8678b(spannableStringBuilder, i6, string5, string6, new Function0<Unit>() { // from class: com.zykj.policy.ui.PolicyDialogFragment$onViewCreated$2$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PolicyDetailActivity.C6204a c6204a = PolicyDetailActivity.f7444c;
                Context contextRequireContext = this.f7455a.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                Bundle arguments3 = this.f7455a.getArguments();
                String string7 = arguments3 != null ? arguments3.getString("USER_AGREEMENT_URL") : null;
                if (string7 == null) {
                    string7 = "";
                }
                c6204a.m6254a(contextRequireContext, string7);
            }
        });
        Bundle arguments3 = getArguments();
        int i7 = arguments3 != null ? arguments3.getInt("SPAN_COLOR") : Color.parseColor("#1576FF");
        String string7 = getString(R$string.policy_private);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.policy_private)");
        AbstractC7521b.m8678b(spannableStringBuilder, i7, string5, string7, new Function0<Unit>() { // from class: com.zykj.policy.ui.PolicyDialogFragment$onViewCreated$2$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PolicyDetailActivity.C6204a c6204a = PolicyDetailActivity.f7444c;
                Context contextRequireContext = this.f7456a.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                Bundle arguments4 = this.f7456a.getArguments();
                String string8 = arguments4 != null ? arguments4.getString("PRIVATE_POLICY_URL") : null;
                if (string8 == null) {
                    string8 = "";
                }
                c6204a.m6254a(contextRequireContext, string8);
            }
        });
        textView.setText(spannableStringBuilder);
        AppCompatButton appCompatButton = m6257f().f7431b;
        Intrinsics.checkNotNullExpressionValue(appCompatButton, "binding.btnCancel");
        AbstractC7521b.m8681e(appCompatButton, new Function1<View, Unit>() { // from class: com.zykj.policy.ui.PolicyDialogFragment.onViewCreated.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Function0 onCancel = PolicyDialogFragment.this.getOnCancel();
                if (onCancel != null) {
                    onCancel.invoke();
                }
                PolicyDialogFragment.this.dismissAllowingStateLoss();
            }
        });
        AppCompatButton appCompatButton2 = m6257f().f7432c;
        Intrinsics.checkNotNullExpressionValue(appCompatButton2, "binding.btnConfirm");
        AbstractC7521b.m8681e(appCompatButton2, new Function1<View, Unit>() { // from class: com.zykj.policy.ui.PolicyDialogFragment.onViewCreated.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                PolicyHelper.C6203a c6203a = PolicyHelper.f7435a;
                Context contextRequireContext = PolicyDialogFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                c6203a.m6246c(contextRequireContext, true);
                Function0 onConfirm = PolicyDialogFragment.this.getOnConfirm();
                if (onConfirm != null) {
                    onConfirm.invoke();
                }
                PolicyDialogFragment.this.dismissAllowingStateLoss();
            }
        });
    }
}
