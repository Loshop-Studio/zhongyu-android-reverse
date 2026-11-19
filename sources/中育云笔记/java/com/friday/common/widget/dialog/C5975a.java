package com.friday.common.widget.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blankj.utilcode.util.StringUtils;
import com.friday.common.R$layout;
import com.friday.common.R$string;
import com.friday.common.R$style;
import com.friday.common.databinding.DialogWithEditTextBinding;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import com.zykj.view.widget.LimitEditText;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p310qd.AbstractC10793c0;
import p429z1.AbstractC11958b;

/* renamed from: com.friday.common.widget.dialog.a */
/* loaded from: classes3.dex */
public final class C5975a {

    /* renamed from: a */
    public static final C5975a f6196a = new C5975a();

    /* renamed from: A */
    public static final void m5400A(DialogWithEditTextBinding dialogWithEditTextBinding, InterfaceC9540l interfaceC9540l, Dialog dialog, View view) {
        String strValueOf = String.valueOf(dialogWithEditTextBinding.f5980f.getText());
        if (StringUtils.isEmpty(strValueOf)) {
            strValueOf = dialogWithEditTextBinding.f5980f.getHint().toString();
        }
        if (AbstractC10793c0.m23132h0(strValueOf)) {
            AbstractC11958b.m26588i("文件名不能为空");
            return;
        }
        if (strValueOf.length() > 20) {
            AbstractC11958b.m26587h(R$string.name_length_limit);
            return;
        }
        if (!new Regex("^([\\u4e00-\\u9fa5a-zA-Z0-9\"\\s\\.\\/\\“\\”\\_\\（\\）\\(\\)\\【\\】])+$").m20341g(strValueOf)) {
            AbstractC11958b.m26587h(R$string.name_content_rule);
            return;
        }
        try {
            interfaceC9540l.invoke(strValueOf);
            dialog.dismiss();
        } catch (Exception e10) {
            AbstractC11958b.m26587h(R$string.create_invoke_error);
            e10.printStackTrace();
        }
    }

    /* renamed from: C */
    public static final Dialog m5401C(final InterfaceC9529a interfaceC9529a, Context context) {
        AbstractC9979u.m20294g(context, "context");
        final Dialog dialog = new Dialog(context, R$style.remind_dialog_theme);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.dialog_with_edit_text, (ViewGroup) null, false);
        AbstractC9979u.m20293f(viewInflate, "inflate(...)");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(viewInflate);
        AbstractC9979u.m20291d(viewDataBindingBind);
        DialogWithEditTextBinding dialogWithEditTextBinding = (DialogWithEditTextBinding) viewDataBindingBind;
        dialogWithEditTextBinding.f5981g.setVisibility(4);
        dialogWithEditTextBinding.f5977c.setVisibility(4);
        dialogWithEditTextBinding.f5982h.setText(AbstractC11958b.m26585f(R$string.delete_note_hint));
        dialogWithEditTextBinding.f5980f.setVisibility(4);
        dialogWithEditTextBinding.f5979e.setText(AbstractC11958b.m26585f(R$string.delete));
        TextView mBtnPositive = dialogWithEditTextBinding.f5979e;
        AbstractC9979u.m20293f(mBtnPositive, "mBtnPositive");
        AbstractC11958b.m26591l(mBtnPositive, 1000L, new View.OnClickListener() { // from class: l2.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5975a.m5402D(interfaceC9529a, dialog, view);
            }
        });
        TextView mBtnNegative = dialogWithEditTextBinding.f5978d;
        AbstractC9979u.m20293f(mBtnNegative, "mBtnNegative");
        AbstractC11958b.m26591l(mBtnNegative, 1000L, new View.OnClickListener() { // from class: l2.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5975a.m5403E(dialog, view);
            }
        });
        dialog.setContentView(viewInflate);
        return dialog;
    }

    /* renamed from: D */
    public static final void m5402D(InterfaceC9529a interfaceC9529a, Dialog dialog, View view) {
        try {
            interfaceC9529a.invoke();
            dialog.dismiss();
        } catch (Exception e10) {
            AbstractC11958b.m26587h(R$string.delete_error);
            e10.printStackTrace();
        }
    }

    /* renamed from: E */
    public static final void m5403E(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* renamed from: G */
    public static final Dialog m5404G(final InterfaceC9529a interfaceC9529a, Context context) {
        AbstractC9979u.m20294g(context, "context");
        final Dialog dialog = new Dialog(context, R$style.remind_dialog_theme);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.dialog_with_edit_text, (ViewGroup) null, false);
        AbstractC9979u.m20293f(viewInflate, "inflate(...)");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(viewInflate);
        AbstractC9979u.m20291d(viewDataBindingBind);
        DialogWithEditTextBinding dialogWithEditTextBinding = (DialogWithEditTextBinding) viewDataBindingBind;
        dialogWithEditTextBinding.f5981g.setVisibility(4);
        dialogWithEditTextBinding.f5977c.setVisibility(4);
        dialogWithEditTextBinding.f5982h.setText(AbstractC11958b.m26585f(R$string.delete_complete_note_hint));
        dialogWithEditTextBinding.f5980f.setVisibility(4);
        dialogWithEditTextBinding.f5979e.setText(AbstractC11958b.m26585f(R$string.delete_complete));
        TextView mBtnPositive = dialogWithEditTextBinding.f5979e;
        AbstractC9979u.m20293f(mBtnPositive, "mBtnPositive");
        AbstractC11958b.m26591l(mBtnPositive, 1000L, new View.OnClickListener() { // from class: l2.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5975a.m5406I(interfaceC9529a, dialog, view);
            }
        });
        TextView mBtnNegative = dialogWithEditTextBinding.f5978d;
        AbstractC9979u.m20293f(mBtnNegative, "mBtnNegative");
        AbstractC11958b.m26591l(mBtnNegative, 1000L, new View.OnClickListener() { // from class: l2.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5975a.m5405H(dialog, view);
            }
        });
        dialog.setContentView(viewInflate);
        return dialog;
    }

    /* renamed from: H */
    public static final void m5405H(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* renamed from: I */
    public static final void m5406I(InterfaceC9529a interfaceC9529a, Dialog dialog, View view) {
        try {
            interfaceC9529a.invoke();
            dialog.dismiss();
        } catch (Exception e10) {
            AbstractC11958b.m26587h(R$string.delete_error);
            e10.printStackTrace();
        }
    }

    /* renamed from: K */
    public static final Dialog m5407K(String str, Context context) {
        AbstractC9979u.m20294g(context, "context");
        ProgressDialog progressDialog = new ProgressDialog(context, R$style.base_dialog);
        progressDialog.setMessage(str);
        return progressDialog;
    }

    /* renamed from: M */
    public static final Dialog m5408M(String str, String str2, final InterfaceC9540l interfaceC9540l, Context context) {
        AbstractC9979u.m20294g(context, "context");
        final Dialog dialog = new Dialog(context, R$style.remind_dialog_theme);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.dialog_with_edit_text, (ViewGroup) null, false);
        AbstractC9979u.m20293f(viewInflate, "inflate(...)");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(viewInflate);
        AbstractC9979u.m20291d(viewDataBindingBind);
        final DialogWithEditTextBinding dialogWithEditTextBinding = (DialogWithEditTextBinding) viewDataBindingBind;
        dialogWithEditTextBinding.f5982h.setVisibility(4);
        dialogWithEditTextBinding.f5981g.setText(StringUtils.equals("0", str) ? AbstractC11958b.m26585f(R$string.folder_name) : "文件名称");
        LimitEditText limitEditText = dialogWithEditTextBinding.f5980f;
        limitEditText.setText(str2);
        limitEditText.setSelection(str2.length());
        limitEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l2.r
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return C5975a.m5409N(textView, i10, keyEvent);
            }
        });
        dialogWithEditTextBinding.f5979e.setText(AbstractC11958b.m26585f(R$string.finish));
        dialogWithEditTextBinding.f5978d.setOnClickListener(new View.OnClickListener() { // from class: l2.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5975a.m5410O(dialog, view);
            }
        });
        dialogWithEditTextBinding.f5979e.setOnClickListener(new View.OnClickListener() { // from class: l2.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5975a.m5411P(dialogWithEditTextBinding, dialog, interfaceC9540l, view);
            }
        });
        dialog.setContentView(viewInflate);
        return dialog;
    }

    /* renamed from: N */
    public static final boolean m5409N(TextView textView, int i10, KeyEvent keyEvent) {
        return keyEvent != null && keyEvent.getKeyCode() == 66;
    }

    /* renamed from: O */
    public static final void m5410O(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* renamed from: P */
    public static final void m5411P(DialogWithEditTextBinding dialogWithEditTextBinding, Dialog dialog, InterfaceC9540l interfaceC9540l, View view) {
        String strValueOf = String.valueOf(dialogWithEditTextBinding.f5980f.getText());
        if (StringUtils.isEmpty(strValueOf)) {
            dialog.dismiss();
            return;
        }
        if (!new Regex("^([\\u4e00-\\u9fa5a-zA-Z0-9\"\\s\\.\\/\\“\\”\\_\\（\\）\\(\\)\\【\\】])+$").m20341g(strValueOf)) {
            AbstractC11958b.m26587h(R$string.name_content_rule);
            return;
        }
        if (AbstractC10793c0.m23132h0(strValueOf)) {
            AbstractC11958b.m26588i("文件名不能为空");
        } else if (strValueOf.length() > 20) {
            AbstractC11958b.m26587h(R$string.name_length_limit);
        } else {
            interfaceC9540l.invoke(strValueOf);
            dialog.dismiss();
        }
    }

    /* renamed from: t */
    public static final Dialog m5430t(boolean z10, final InterfaceC9529a interfaceC9529a, Context context) {
        AbstractC9979u.m20294g(context, "context");
        final Dialog dialog = new Dialog(context, R$style.remind_dialog_theme);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.dialog_with_edit_text, (ViewGroup) null, false);
        AbstractC9979u.m20293f(viewInflate, "inflate(...)");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(viewInflate);
        AbstractC9979u.m20291d(viewDataBindingBind);
        DialogWithEditTextBinding dialogWithEditTextBinding = (DialogWithEditTextBinding) viewDataBindingBind;
        dialogWithEditTextBinding.f5981g.setVisibility(4);
        dialogWithEditTextBinding.f5977c.setVisibility(4);
        if (z10) {
            dialogWithEditTextBinding.f5982h.setText(AbstractC11958b.m26585f(R$string.is_clear));
            dialogWithEditTextBinding.f5979e.setText(AbstractC11958b.m26585f(R$string.confirm));
        } else {
            dialogWithEditTextBinding.f5982h.setText(AbstractC11958b.m26585f(R$string.logout_app_hint));
            dialogWithEditTextBinding.f5979e.setText(AbstractC11958b.m26585f(R$string.exit));
        }
        dialogWithEditTextBinding.f5980f.setVisibility(4);
        dialogWithEditTextBinding.f5979e.setOnClickListener(new View.OnClickListener() { // from class: l2.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5975a.m5431u(interfaceC9529a, dialog, view);
            }
        });
        dialogWithEditTextBinding.f5978d.setOnClickListener(new View.OnClickListener() { // from class: l2.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5975a.m5432v(dialog, view);
            }
        });
        dialog.setContentView(viewInflate);
        return dialog;
    }

    /* renamed from: u */
    public static final void m5431u(InterfaceC9529a interfaceC9529a, Dialog dialog, View view) {
        try {
            interfaceC9529a.invoke();
            dialog.dismiss();
        } catch (Exception e10) {
            AbstractC11958b.m26587h(R$string.delete_error);
            e10.printStackTrace();
        }
    }

    /* renamed from: v */
    public static final void m5432v(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.app.Dialog m5433x(java.lang.String r4, final p181hd.InterfaceC9540l r5, android.content.Context r6) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r6, r0)
            android.app.Dialog r0 = new android.app.Dialog
            int r1 = com.friday.common.R$style.remind_dialog_theme
            r0.<init>(r6, r1)
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r1 = com.friday.common.R$layout.dialog_with_edit_text
            r2 = 0
            r3 = 0
            android.view.View r6 = r6.inflate(r1, r2, r3)
            java.lang.String r1 = "inflate(...)"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r6, r1)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.DataBindingUtil.bind(r6)
            kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
            com.friday.common.databinding.DialogWithEditTextBinding r1 = (com.friday.common.databinding.DialogWithEditTextBinding) r1
            int r2 = r4.hashCode()
            r3 = 48
            if (r2 == r3) goto L53
            r3 = 49
            if (r2 == r3) goto L43
            r3 = 54
            if (r2 == r3) goto L37
            goto L5b
        L37:
            java.lang.String r2 = "6"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L40
            goto L5b
        L40:
            java.lang.String r4 = "新建文本"
            goto L64
        L43:
            java.lang.String r2 = "1"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4c
            goto L5b
        L4c:
            int r4 = com.friday.common.R$string.create_new_note
            java.lang.String r4 = p429z1.AbstractC11958b.m26585f(r4)
            goto L64
        L53:
            java.lang.String r2 = "0"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L5e
        L5b:
            java.lang.String r4 = ""
            goto L64
        L5e:
            int r4 = com.friday.common.R$string.create_new_folder
            java.lang.String r4 = p429z1.AbstractC11958b.m26585f(r4)
        L64:
            android.widget.TextView r2 = r1.f5982h
            r3 = 8
            r2.setVisibility(r3)
            android.widget.TextView r2 = r1.f5981g
            r2.setText(r4)
            com.zykj.view.widget.LimitEditText r2 = r1.f5980f
            r2.setHint(r4)
            l2.g r4 = new l2.g
            r4.<init>()
            r2.setOnEditorActionListener(r4)
            android.widget.TextView r4 = r1.f5979e
            int r2 = com.friday.common.R$string.confirm
            java.lang.String r2 = p429z1.AbstractC11958b.m26585f(r2)
            r4.setText(r2)
            android.widget.TextView r4 = r1.f5978d
            l2.h r2 = new l2.h
            r2.<init>()
            r4.setOnClickListener(r2)
            android.widget.TextView r4 = r1.f5979e
            l2.i r2 = new l2.i
            r2.<init>()
            r4.setOnClickListener(r2)
            r0.setContentView(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.widget.dialog.C5975a.m5433x(java.lang.String, hd.l, android.content.Context):android.app.Dialog"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/widget/dialog/a.smali:1702
    }

    /* renamed from: y */
    public static final boolean m5434y(TextView textView, int i10, KeyEvent keyEvent) {
        return keyEvent != null && keyEvent.getKeyCode() == 66;
    }

    /* renamed from: z */
    public static final void m5435z(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* renamed from: B */
    public final BaseDialog m5436B(final InterfaceC9529a listener) {
        AbstractC9979u.m20294g(listener, "listener");
        return BaseDialog.C5973a.m5383b(BaseDialog.f6188e, true, 0.0f, new InterfaceC9540l() { // from class: l2.j
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C5975a.m5401C(listener, (Context) obj);
            }
        }, 2, null);
    }

    /* renamed from: F */
    public final BaseDialog m5437F(final InterfaceC9529a listener) {
        AbstractC9979u.m20294g(listener, "listener");
        return BaseDialog.C5973a.m5383b(BaseDialog.f6188e, true, 0.0f, new InterfaceC9540l() { // from class: l2.l
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C5975a.m5404G(listener, (Context) obj);
            }
        }, 2, null);
    }

    /* renamed from: J */
    public final BaseDialog m5438J(boolean z10, final String message) {
        AbstractC9979u.m20294g(message, "message");
        return BaseDialog.C5973a.m5383b(BaseDialog.f6188e, z10, 0.0f, new InterfaceC9540l() { // from class: l2.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C5975a.m5407K(message, (Context) obj);
            }
        }, 2, null);
    }

    /* renamed from: L */
    public final BaseDialog m5439L(final String type, final String oldName, final InterfaceC9540l listener) {
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(oldName, "oldName");
        AbstractC9979u.m20294g(listener, "listener");
        return BaseDialog.C5973a.m5383b(BaseDialog.f6188e, true, 0.0f, new InterfaceC9540l() { // from class: l2.k
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C5975a.m5408M(type, oldName, listener, (Context) obj);
            }
        }, 2, null);
    }

    /* renamed from: s */
    public final BaseDialog m5440s(final boolean z10, final InterfaceC9529a listener) {
        AbstractC9979u.m20294g(listener, "listener");
        return BaseDialog.C5973a.m5383b(BaseDialog.f6188e, true, 0.0f, new InterfaceC9540l() { // from class: l2.o
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C5975a.m5430t(z10, listener, (Context) obj);
            }
        }, 2, null);
    }

    /* renamed from: w */
    public final BaseDialog m5441w(final String type, final InterfaceC9540l listener) {
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(listener, "listener");
        return BaseDialog.C5973a.m5383b(BaseDialog.f6188e, true, 0.0f, new InterfaceC9540l() { // from class: l2.f
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C5975a.m5433x(type, listener, (Context) obj);
            }
        }, 2, null);
    }
}
