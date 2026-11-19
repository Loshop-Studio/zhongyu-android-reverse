package com.zykj.policy.p037ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.zykj.lib.p036ui.R$dimen;
import com.zykj.policy.R$drawable;
import com.zykj.policy.R$string;
import com.zykj.policy.p037ui.PolicyDetailActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p115n4.C7466a;
import p122o4.AbstractC7521b;

@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m7880d2 = {"Lcom/zykj/policy/ui/PolicyCheckView;", "Landroidx/appcompat/widget/AppCompatCheckBox;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ln4/a;", "policyBean", "", "setData", "(Ln4/a;)V", "policy_release"}, m7881k = 1, m7882mv = {1, 7, 1}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class PolicyCheckView extends AppCompatCheckBox {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PolicyCheckView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setData(final C7466a policyBean) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(policyBean, "policyBean");
        if (StringsKt.isBlank(policyBean.m8527c())) {
            String string = getResources().getString(R$string.policy_agree_check_text);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st….policy_agree_check_text)");
            policyBean.m8536l(string);
        }
        if (StringsKt.isBlank(policyBean.m8534j())) {
            String string2 = getResources().getString(R$string.policy_agreement);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.policy_agreement)");
            policyBean.m8539o(string2);
        }
        if (StringsKt.isBlank(policyBean.m8530f())) {
            String string3 = getResources().getString(R$string.policy_private);
            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.policy_private)");
            policyBean.m8537m(string3);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(policyBean.m8527c());
        AbstractC7521b.m8678b(spannableStringBuilder, policyBean.m8532h(), policyBean.m8527c(), policyBean.m8534j(), new Function0<Unit>() { // from class: com.zykj.policy.ui.PolicyCheckView$setData$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (StringsKt.isBlank(policyBean.m8535k())) {
                    return;
                }
                PolicyDetailActivity.C6204a c6204a = PolicyDetailActivity.f7444c;
                Context context = this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                c6204a.m6254a(context, policyBean.m8535k());
            }
        });
        AbstractC7521b.m8678b(spannableStringBuilder, policyBean.m8532h(), policyBean.m8527c(), policyBean.m8530f(), new Function0<Unit>() { // from class: com.zykj.policy.ui.PolicyCheckView$setData$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (StringsKt.isBlank(policyBean.m8531g())) {
                    return;
                }
                PolicyDetailActivity.C6204a c6204a = PolicyDetailActivity.f7444c;
                Context context = this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                c6204a.m6254a(context, policyBean.m8531g());
            }
        });
        setText(spannableStringBuilder);
    }

    public /* synthetic */ PolicyCheckView(Context context, AttributeSet attributeSet, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, (i7 & 4) != 0 ? 0 : i6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolicyCheckView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Intrinsics.checkNotNullParameter(context, "context");
        setButtonDrawable((Drawable) null);
        AbstractC7521b.m8679c(this, R$drawable.selector_check_bg, context.getResources().getDimension(R$dimen.view_8));
        setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R$dimen.view_6));
        setGravity(16);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
        setTextColor(Color.parseColor("#646566"));
        setTextSize(0, context.getResources().getDimension(R$dimen.text_8));
    }
}
