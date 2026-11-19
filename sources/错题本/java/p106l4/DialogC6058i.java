package p106l4;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.mistake.R;
import com.zykj.mistake.databinding.DialogMistakeTagAddBinding;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import kotlin.jvm.internal.AbstractC5830k;
import p009a8.RunnableC0023a;
import p152r6.InterfaceC6471c;

/* renamed from: l4.i */
/* loaded from: classes3.dex */
public final class DialogC6058i extends Dialog {

    /* renamed from: d */
    public static final /* synthetic */ int f9655d = 0;

    /* renamed from: a */
    public final boolean f9656a;

    /* renamed from: b */
    public DialogMistakeTagAddBinding f9657b;

    /* renamed from: c */
    public InterfaceC6471c f9658c;

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC6058i(Context context, int i) {
        int i8 = R.style.AppTheme_Dialog;
        boolean z8 = (i & 4) == 0;
        super(context, i8);
        this.f9656a = z8;
        this.f9658c = new C4959k1(28);
    }

    /* renamed from: a */
    public final void m5787a(String str, String content, InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(content, "content");
        this.f9658c = interfaceC6471c;
        show();
        DialogMistakeTagAddBinding dialogMistakeTagAddBinding = this.f9657b;
        if (dialogMistakeTagAddBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        dialogMistakeTagAddBinding.f6117d.setText(str);
        DialogMistakeTagAddBinding dialogMistakeTagAddBinding2 = this.f9657b;
        if (dialogMistakeTagAddBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        dialogMistakeTagAddBinding2.f6114a.setText(Editable.Factory.getInstance().newEditable(content));
        if (this.f9656a) {
            DialogMistakeTagAddBinding dialogMistakeTagAddBinding3 = this.f9657b;
            if (dialogMistakeTagAddBinding3 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            EditText editText = dialogMistakeTagAddBinding3.f6114a;
            editText.setSelection(editText.getText().length());
            DialogMistakeTagAddBinding dialogMistakeTagAddBinding4 = this.f9657b;
            if (dialogMistakeTagAddBinding4 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            dialogMistakeTagAddBinding4.f6114a.requestFocus();
            Window window = getWindow();
            if (window != null) {
                window.setSoftInputMode(5);
            }
            DialogMistakeTagAddBinding dialogMistakeTagAddBinding5 = this.f9657b;
            if (dialogMistakeTagAddBinding5 != null) {
                dialogMistakeTagAddBinding5.f6114a.post(new RunnableC0023a(this, 24));
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = DialogMistakeTagAddBinding.f6113e;
        final int i8 = 0;
        DialogMistakeTagAddBinding dialogMistakeTagAddBinding = (DialogMistakeTagAddBinding) ViewDataBinding.inflateInternal(layoutInflaterFrom, R.layout.dialog_mistake_tag_add, null, false, DataBindingUtil.getDefaultComponent());
        AbstractC5830k.m5329f(dialogMistakeTagAddBinding, "inflate(...)");
        this.f9657b = dialogMistakeTagAddBinding;
        setContentView(dialogMistakeTagAddBinding.getRoot());
        DialogMistakeTagAddBinding dialogMistakeTagAddBinding2 = this.f9657b;
        if (dialogMistakeTagAddBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        dialogMistakeTagAddBinding2.f6115b.setOnClickListener(new View.OnClickListener(this) { // from class: l4.h

            /* renamed from: b */
            public final /* synthetic */ DialogC6058i f9654b;

            {
                this.f9654b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r11) {
                /*
                    r10 = this;
                    int r11 = r2
                    switch(r11) {
                        case 0: goto L79;
                        default: goto L5;
                    }
                L5:
                    l4.i r11 = r10.f9654b
                    com.zykj.mistake.databinding.DialogMistakeTagAddBinding r0 = r11.f9657b
                    r1 = 0
                    java.lang.String r2 = "mBinding"
                    if (r0 == 0) goto L75
                    android.widget.EditText r0 = r0.f6114a
                    android.text.Editable r0 = r0.getText()
                    java.lang.String r0 = r0.toString()
                    int r3 = r0.length()
                    r4 = 1
                    int r3 = r3 - r4
                    r5 = 0
                    r6 = r5
                    r7 = r6
                L21:
                    if (r6 > r3) goto L46
                    if (r7 != 0) goto L27
                    r8 = r6
                    goto L28
                L27:
                    r8 = r3
                L28:
                    char r8 = r0.charAt(r8)
                    r9 = 32
                    int r8 = kotlin.jvm.internal.AbstractC5830k.m5332i(r8, r9)
                    if (r8 > 0) goto L36
                    r8 = r4
                    goto L37
                L36:
                    r8 = r5
                L37:
                    if (r7 != 0) goto L40
                    if (r8 != 0) goto L3d
                    r7 = r4
                    goto L21
                L3d:
                    int r6 = r6 + 1
                    goto L21
                L40:
                    if (r8 != 0) goto L43
                    goto L46
                L43:
                    int r3 = r3 + (-1)
                    goto L21
                L46:
                    int r3 = r3 + r4
                    java.lang.CharSequence r0 = r0.subSequence(r6, r3)
                    java.lang.String r0 = r0.toString()
                    boolean r3 = android.text.TextUtils.isEmpty(r0)
                    if (r3 != 0) goto L5a
                    r6.c r3 = r11.f9658c
                    r3.invoke(r0)
                L5a:
                    com.zykj.mistake.databinding.DialogMistakeTagAddBinding r0 = r11.f9657b
                    if (r0 == 0) goto L71
                    android.widget.EditText r0 = r0.f6114a
                    android.text.Editable$Factory r1 = android.text.Editable.Factory.getInstance()
                    java.lang.String r2 = ""
                    android.text.Editable r1 = r1.newEditable(r2)
                    r0.setText(r1)
                    r11.dismiss()
                    return
                L71:
                    kotlin.jvm.internal.AbstractC5830k.m5339p(r2)
                    throw r1
                L75:
                    kotlin.jvm.internal.AbstractC5830k.m5339p(r2)
                    throw r1
                L79:
                    l4.i r11 = r10.f9654b
                    r11.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p106l4.ViewOnClickListenerC6057h.onClick(android.view.View):void");
            }
        });
        DialogMistakeTagAddBinding dialogMistakeTagAddBinding3 = this.f9657b;
        if (dialogMistakeTagAddBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i9 = 1;
        dialogMistakeTagAddBinding3.f6116c.setOnClickListener(new View.OnClickListener(this) { // from class: l4.h

            /* renamed from: b */
            public final /* synthetic */ DialogC6058i f9654b;

            {
                this.f9654b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View v2) {
                /*
                    this = this;
                    int r11 = r2
                    switch(r11) {
                        case 0: goto L79;
                        default: goto L5;
                    }
                L5:
                    l4.i r11 = r10.f9654b
                    com.zykj.mistake.databinding.DialogMistakeTagAddBinding r0 = r11.f9657b
                    r1 = 0
                    java.lang.String r2 = "mBinding"
                    if (r0 == 0) goto L75
                    android.widget.EditText r0 = r0.f6114a
                    android.text.Editable r0 = r0.getText()
                    java.lang.String r0 = r0.toString()
                    int r3 = r0.length()
                    r4 = 1
                    int r3 = r3 - r4
                    r5 = 0
                    r6 = r5
                    r7 = r6
                L21:
                    if (r6 > r3) goto L46
                    if (r7 != 0) goto L27
                    r8 = r6
                    goto L28
                L27:
                    r8 = r3
                L28:
                    char r8 = r0.charAt(r8)
                    r9 = 32
                    int r8 = kotlin.jvm.internal.AbstractC5830k.m5332i(r8, r9)
                    if (r8 > 0) goto L36
                    r8 = r4
                    goto L37
                L36:
                    r8 = r5
                L37:
                    if (r7 != 0) goto L40
                    if (r8 != 0) goto L3d
                    r7 = r4
                    goto L21
                L3d:
                    int r6 = r6 + 1
                    goto L21
                L40:
                    if (r8 != 0) goto L43
                    goto L46
                L43:
                    int r3 = r3 + (-1)
                    goto L21
                L46:
                    int r3 = r3 + r4
                    java.lang.CharSequence r0 = r0.subSequence(r6, r3)
                    java.lang.String r0 = r0.toString()
                    boolean r3 = android.text.TextUtils.isEmpty(r0)
                    if (r3 != 0) goto L5a
                    r6.c r3 = r11.f9658c
                    r3.invoke(r0)
                L5a:
                    com.zykj.mistake.databinding.DialogMistakeTagAddBinding r0 = r11.f9657b
                    if (r0 == 0) goto L71
                    android.widget.EditText r0 = r0.f6114a
                    android.text.Editable$Factory r1 = android.text.Editable.Factory.getInstance()
                    java.lang.String r2 = ""
                    android.text.Editable r1 = r1.newEditable(r2)
                    r0.setText(r1)
                    r11.dismiss()
                    return
                L71:
                    kotlin.jvm.internal.AbstractC5830k.m5339p(r2)
                    throw r1
                L75:
                    kotlin.jvm.internal.AbstractC5830k.m5339p(r2)
                    throw r1
                L79:
                    l4.i r11 = r10.f9654b
                    r11.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p106l4.ViewOnClickListenerC6057h.onClick(android.view.View):void");
            }
        });
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.bg_dialog_white_radius_4));
        }
        if (window != null) {
            window.setLayout(getContext().getResources().getDimensionPixelSize(R.dimen.view_200), getContext().getResources().getDimensionPixelSize(R.dimen.view_120));
        }
    }
}
