package com.zykj.policy.p105ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.zykj.lib.p104ui.R$dimen;
import com.zykj.policy.R$drawable;
import com.zykj.policy.R$string;
import com.zykj.policy.p105ui.PolicyDetailActivity;
import gb.AbstractC9286b;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p150fb.C9217a;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;

/* loaded from: classes6.dex */
public final class PolicyCheckView extends AppCompatCheckBox {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolicyCheckView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    public final void setData(final C9217a policyBean) throws Resources.NotFoundException {
        AbstractC9979u.m20294g(policyBean, "policyBean");
        if (AbstractC10793c0.m23132h0(policyBean.m18121c())) {
            String string = getResources().getString(R$string.policy_agree_check_text);
            AbstractC9979u.m20293f(string, "resources.getString(R.st….policy_agree_check_text)");
            policyBean.m18130l(string);
        }
        if (AbstractC10793c0.m23132h0(policyBean.m18128j())) {
            String string2 = getResources().getString(R$string.policy_agreement);
            AbstractC9979u.m20293f(string2, "resources.getString(R.string.policy_agreement)");
            policyBean.m18135q(string2);
        }
        if (AbstractC10793c0.m23132h0(policyBean.m18124f())) {
            String string3 = getResources().getString(R$string.policy_private);
            AbstractC9979u.m20293f(string3, "resources.getString(R.string.policy_private)");
            policyBean.m18133o(string3);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(policyBean.m18121c());
        AbstractC9286b.m18306b(spannableStringBuilder, policyBean.m18126h(), policyBean.m18121c(), policyBean.m18128j(), new InterfaceC9529a() { // from class: com.zykj.policy.ui.PolicyCheckView$setData$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34047invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34047invoke() {
                if (AbstractC10793c0.m23132h0(policyBean.m18129k())) {
                    return;
                }
                PolicyDetailActivity.C8662a c8662a = PolicyDetailActivity.f19878e;
                Context context = this.getContext();
                AbstractC9979u.m20293f(context, "context");
                c8662a.m16609a(context, policyBean.m18129k());
            }
        });
        AbstractC9286b.m18306b(spannableStringBuilder, policyBean.m18126h(), policyBean.m18121c(), policyBean.m18124f(), new InterfaceC9529a() { // from class: com.zykj.policy.ui.PolicyCheckView$setData$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34048invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34048invoke() {
                if (AbstractC10793c0.m23132h0(policyBean.m18125g())) {
                    return;
                }
                PolicyDetailActivity.C8662a c8662a = PolicyDetailActivity.f19878e;
                Context context = this.getContext();
                AbstractC9979u.m20293f(context, "context");
                c8662a.m16609a(context, policyBean.m18125g());
            }
        });
        setText(spannableStringBuilder);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolicyCheckView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    public /* synthetic */ PolicyCheckView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolicyCheckView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        setButtonDrawable((Drawable) null);
        AbstractC9286b.m18307c(this, R$drawable.selector_check_bg, context.getResources().getDimension(R$dimen.view_8));
        setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R$dimen.view_6));
        setGravity(16);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
        setTextColor(Color.parseColor("#646566"));
        setTextSize(0, context.getResources().getDimension(R$dimen.text_8));
    }
}
