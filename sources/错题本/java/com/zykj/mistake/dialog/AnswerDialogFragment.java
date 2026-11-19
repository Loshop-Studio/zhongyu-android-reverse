package com.zykj.mistake.dialog;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.C2827b;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.zykj.mistake.R;
import com.zykj.mistake.databinding.DialogFragmentAnswerBinding;
import com.zykj.mistake.utils.C5100e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p016b0.AbstractC3085o;
import p016b0.C3083m;
import p106l4.C6050a;
import p106l4.C6051b;
import p147r0.C6446d;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/dialog/AnswerDialogFragment;", "Lcom/zykj/mistake/dialog/BaseDialogFragment;", "Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AnswerDialogFragment extends BaseDialogFragment<DialogFragmentAnswerBinding> {

    /* renamed from: c */
    public String f6169c;

    /* renamed from: d */
    public String f6170d;

    /* renamed from: e */
    public boolean f6171e;

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: e */
    public final int mo3981e() {
        return R.color.app_black;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: f */
    public final int mo3982f() {
        return -1;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: g */
    public final int mo3983g() {
        return R.layout.dialog_fragment_answer;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: h */
    public final int mo3984h() {
        return -1;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: j */
    public final void mo3985j(View view) {
        ImageView close = ((DialogFragmentAnswerBinding) m3987i()).f6099a;
        AbstractC5830k.m5329f(close, "close");
        C5100e.m4461e(close, new C2827b(this, 17));
        String str = this.f6169c;
        C3083m c3083m = AbstractC3085o.f1480b;
        if (str == null || str.length() == 0) {
            ((DialogFragmentAnswerBinding) m3987i()).f6101c.setImageDrawable(null);
        } else {
            ComponentCallbacks2C3408b.m2363f(this).m2386l(this.f6169c).mo2374c(((C6446d) new C6446d().m6086g(c3083m)).m6096r()).m2379z(new C6050a(this));
        }
        String str2 = this.f6170d;
        if (str2 == null || str2.length() == 0) {
            ((DialogFragmentAnswerBinding) m3987i()).f6100b.setImageDrawable(null);
            return;
        }
        C3412f c3412fM2384j = ComponentCallbacks2C3408b.m2363f(this).m2384j();
        c3412fM2384j.f2234w = this.f6170d;
        c3412fM2384j.f2236y = true;
        c3412fM2384j.mo2374c(((C6446d) new C6446d().m6086g(c3083m)).m6096r()).m2379z(new C6051b(this));
    }

    /* renamed from: l */
    public final void m3986l(FragmentActivity fragmentActivity, String str, String str2, boolean z8) {
        this.f6169c = str;
        this.f6170d = str2;
        this.f6171e = z8;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        AbstractC5830k.m5329f(supportFragmentManager, "getSupportFragmentManager(...)");
        m3988k(supportFragmentManager);
    }
}
