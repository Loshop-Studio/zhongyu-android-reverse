package com.zykj.mistake.dialog;

import android.app.Dialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.ViewOnClickListenerC2869j;
import com.zykj.mistake.R;
import com.zykj.mistake.databinding.DialogConvertBinding;
import com.zykj.mistake.feature.notebook.detail.ViewOnClickListenerC4758a;
import com.zykj.mistake.widget.LineBottomProView;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import p106l4.C6052c;
import p106l4.DialogInterfaceOnKeyListenerC6055f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/dialog/ConvertDialog;", "Lcom/zykj/mistake/dialog/BaseDialogFragment;", "Lcom/zykj/mistake/databinding/DialogConvertBinding;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nConvertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConvertDialog.kt\ncom/zykj/mistake/dialog/ConvertDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,120:1\n257#2,2:121\n257#2,2:123\n257#2,2:125\n257#2,2:127\n257#2,2:129\n257#2,2:131\n*S KotlinDebug\n*F\n+ 1 ConvertDialog.kt\ncom/zykj/mistake/dialog/ConvertDialog\n*L\n40#1:121,2\n48#1:123,2\n56#1:125,2\n64#1:127,2\n74#1:129,2\n79#1:131,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ConvertDialog extends BaseDialogFragment<DialogConvertBinding> {

    /* renamed from: c */
    public String f6174c;

    /* renamed from: d */
    public C6052c f6175d;

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: e */
    public final int mo3981e() {
        return R.drawable.bg_white_corner_7;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: f */
    public final int mo3982f() {
        return -2;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: g */
    public final int mo3983g() {
        return R.layout.dialog_convert;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: h */
    public final int mo3984h() {
        return getResources().getDimensionPixelSize(R.dimen.view_200);
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: j */
    public final void mo3985j(View view) {
        String str;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC6055f());
        }
        TextView textView = ((DialogConvertBinding) m3987i()).f6096g;
        AbstractC5830k.m5327d(textView);
        textView.setVisibility(8);
        TextView textView2 = ((DialogConvertBinding) m3987i()).f6094e;
        AbstractC5830k.m5327d(textView2);
        textView2.setVisibility(this.f6174c != null ? 0 : 8);
        String str2 = this.f6174c;
        if (str2 != null) {
            textView2.setText(str2);
        }
        LineBottomProView lineBottomProView = ((DialogConvertBinding) m3987i()).f6091b;
        AbstractC5830k.m5327d(lineBottomProView);
        lineBottomProView.setVisibility(8);
        TextView textView3 = ((DialogConvertBinding) m3987i()).f6095f;
        AbstractC5830k.m5327d(textView3);
        C6052c c6052c = this.f6175d;
        textView3.setVisibility((c6052c != null ? c6052c.f9643a : null) == null ? 0 : 8);
        C6052c c6052c2 = this.f6175d;
        if (c6052c2 != null) {
            textView3.setText(c6052c2.f9645c);
        }
        C6052c c6052c3 = this.f6175d;
        if (c6052c3 != null) {
            textView3.setOnClickListener(new ViewOnClickListenerC4758a(c6052c3.f9646d, 3));
        }
        LinearLayout llButton = ((DialogConvertBinding) m3987i()).f6090a;
        AbstractC5830k.m5329f(llButton, "llButton");
        C6052c c6052c4 = this.f6175d;
        llButton.setVisibility((c6052c4 != null ? c6052c4.f9643a : null) != null ? 0 : 8);
        TextView textView4 = ((DialogConvertBinding) m3987i()).f6092c;
        C6052c c6052c5 = this.f6175d;
        if (c6052c5 != null) {
            textView4.setText(c6052c5.f9645c);
        }
        AbstractC5830k.m5327d(textView4);
        C6052c c6052c6 = this.f6175d;
        String str3 = c6052c6 != null ? c6052c6.f9645c : null;
        textView4.setVisibility((str3 == null || AbstractC5855p.m5382P(str3)) ? 8 : 0);
        C6052c c6052c7 = this.f6175d;
        if (c6052c7 != null) {
            textView4.setOnClickListener(new ViewOnClickListenerC4758a(c6052c7.f9646d, 4));
        }
        TextView textView5 = ((DialogConvertBinding) m3987i()).f6093d;
        C6052c c6052c8 = this.f6175d;
        if (c6052c8 != null && (str = c6052c8.f9643a) != null) {
            textView5.setText(str);
        }
        C6052c c6052c9 = this.f6175d;
        if (c6052c9 != null) {
            textView5.setOnClickListener(new ViewOnClickListenerC2869j(c6052c9.f9644b, 5));
        }
    }
}
