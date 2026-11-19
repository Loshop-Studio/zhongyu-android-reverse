package com.zykj.policy.p064ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.policy.R$drawable;
import com.zykj.policy.R$string;
import com.zykj.policy.p064ui.PolicyDetailActivity;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p142j4.C9013a;
import p153k4.AbstractC9055b;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class PolicyCheckView extends AppCompatCheckBox {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolicyCheckView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9133u.m16133g(context, "context");
    }

    public final void setData(final C9013a policyBean) {
        AbstractC9133u.m16133g(policyBean, "policyBean");
        if (AbstractC8661c0.m13993h0(policyBean.m15653c())) {
            String string = getResources().getString(R$string.policy_agree_check_text);
            AbstractC9133u.m16132f(string, "resources.getString(R.st….policy_agree_check_text)");
            policyBean.m15662l(string);
        }
        if (AbstractC8661c0.m13993h0(policyBean.m15660j())) {
            String string2 = getResources().getString(R$string.policy_agreement);
            AbstractC9133u.m16132f(string2, "resources.getString(R.string.policy_agreement)");
            policyBean.m15667q(string2);
        }
        if (AbstractC8661c0.m13993h0(policyBean.m15656f())) {
            String string3 = getResources().getString(R$string.policy_private);
            AbstractC9133u.m16132f(string3, "resources.getString(R.string.policy_private)");
            policyBean.m15665o(string3);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(policyBean.m15653c());
        AbstractC9055b.m15856b(spannableStringBuilder, policyBean.m15658h(), policyBean.m15653c(), policyBean.m15660j(), new InterfaceC10559a() { // from class: com.zykj.policy.ui.PolicyCheckView$setData$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27503invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27503invoke() {
                if (AbstractC8661c0.m13993h0(policyBean.m15661k())) {
                    return;
                }
                PolicyDetailActivity.C7428a c7428a = PolicyDetailActivity.f10576c;
                Context context = this.getContext();
                AbstractC9133u.m16132f(context, "context");
                c7428a.m9744a(context, policyBean.m15661k());
            }
        });
        AbstractC9055b.m15856b(spannableStringBuilder, policyBean.m15658h(), policyBean.m15653c(), policyBean.m15656f(), new InterfaceC10559a() { // from class: com.zykj.policy.ui.PolicyCheckView$setData$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27504invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27504invoke() {
                if (AbstractC8661c0.m13993h0(policyBean.m15657g())) {
                    return;
                }
                PolicyDetailActivity.C7428a c7428a = PolicyDetailActivity.f10576c;
                Context context = this.getContext();
                AbstractC9133u.m16132f(context, "context");
                c7428a.m9744a(context, policyBean.m15657g());
            }
        });
        setText(spannableStringBuilder);
    }

    public /* synthetic */ PolicyCheckView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolicyCheckView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
        setButtonDrawable((Drawable) null);
        AbstractC9055b.m15857c(this, R$drawable.selector_check_bg, context.getResources().getDimension(R$dimen.view_8));
        setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R$dimen.view_6));
        setGravity(16);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
        setTextColor(Color.parseColor("#646566"));
        setTextSize(0, context.getResources().getDimension(R$dimen.text_8));
    }
}
