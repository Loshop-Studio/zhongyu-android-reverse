package com.zykj.mistake.dialog;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.zykj.mistake.R;
import com.zykj.mistake.databinding.DialogFragmentImageBinding;
import com.zykj.mistake.dialog.ImageDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p016b0.AbstractC3085o;
import p147r0.C6446d;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/dialog/ImageDialogFragment;", "Lcom/zykj/mistake/dialog/BaseDialogFragment;", "Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nImageDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDialogFragment.kt\ncom/zykj/mistake/dialog/ImageDialogFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,55:1\n257#2,2:56\n*S KotlinDebug\n*F\n+ 1 ImageDialogFragment.kt\ncom/zykj/mistake/dialog/ImageDialogFragment\n*L\n33#1:56,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageDialogFragment extends BaseDialogFragment<DialogFragmentImageBinding> {

    /* renamed from: c */
    public String f6176c;

    /* renamed from: d */
    public InterfaceC6469a f6177d;

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: e */
    public final int mo3981e() {
        return R.color.white;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: f */
    public final int mo3982f() {
        return -1;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: g */
    public final int mo3983g() {
        return R.layout.dialog_fragment_image;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: h */
    public final int mo3984h() {
        return -1;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: j */
    public final void mo3985j(View view) {
        final int i = 0;
        ((DialogFragmentImageBinding) m3987i()).f6104a.setOnClickListener(new View.OnClickListener(this) { // from class: l4.g

            /* renamed from: b */
            public final /* synthetic */ ImageDialogFragment f9652b;

            {
                this.f9652b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f9652b.dismiss();
                        break;
                    default:
                        InterfaceC6469a interfaceC6469a = this.f9652b.f6177d;
                        if (interfaceC6469a != null) {
                            interfaceC6469a.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        ImageView ivDelete = ((DialogFragmentImageBinding) m3987i()).f6105b;
        AbstractC5830k.m5329f(ivDelete, "ivDelete");
        ivDelete.setVisibility(this.f6177d != null ? 0 : 8);
        final int i8 = 1;
        ((DialogFragmentImageBinding) m3987i()).f6105b.setOnClickListener(new View.OnClickListener(this) { // from class: l4.g

            /* renamed from: b */
            public final /* synthetic */ ImageDialogFragment f9652b;

            {
                this.f9652b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        this.f9652b.dismiss();
                        break;
                    default:
                        InterfaceC6469a interfaceC6469a = this.f9652b.f6177d;
                        if (interfaceC6469a != null) {
                            interfaceC6469a.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        String str = this.f6176c;
        if (str != null) {
            ((C3412f) ComponentCallbacks2C3408b.m2363f(this).m2386l(str).m6087h(R.mipmap.pic_error)).mo2374c(((C6446d) new C6446d().m6086g(AbstractC3085o.f1480b)).m6096r()).m2378y(((DialogFragmentImageBinding) m3987i()).f6106c);
        }
    }

    /* renamed from: l */
    public final void m3989l(FragmentActivity fragmentActivity, String path, InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(path, "path");
        this.f6176c = path;
        this.f6177d = interfaceC6469a;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        AbstractC5830k.m5329f(supportFragmentManager, "getSupportFragmentManager(...)");
        m3988k(supportFragmentManager);
    }
}
