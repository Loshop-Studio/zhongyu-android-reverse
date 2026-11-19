package com.zykj.blackboard.widgets;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.zykj.blackboard.C7044R;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class TextDialog extends Dialog {
    private InterfaceC10570l afterTextChangedCallback;
    private InterfaceC10559a cancelCallback;
    private InterfaceC10570l doneCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDialog(Context context, int i10) {
        super(context, i10);
        AbstractC9133u.m16133g(context, "context");
        this.afterTextChangedCallback = new InterfaceC10570l() { // from class: com.zykj.blackboard.widgets.TextDialog$afterTextChangedCallback$1
            public final void invoke(String str) {
                AbstractC9133u.m16133g(str, "<anonymous parameter 0>");
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C8736p.f16368a;
            }
        };
        this.doneCallback = new InterfaceC10570l() { // from class: com.zykj.blackboard.widgets.TextDialog$doneCallback$1
            public final void invoke(String str) {
                AbstractC9133u.m16133g(str, "<anonymous parameter 0>");
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C8736p.f16368a;
            }
        };
        this.cancelCallback = new InterfaceC10559a() { // from class: com.zykj.blackboard.widgets.TextDialog$cancelCallback$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27478invoke() {
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27478invoke();
                return C8736p.f16368a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m27477onCreate$lambda0(TextDialog this$0, View view) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.doneCallback.invoke(((EditText) this$0.findViewById(C7044R.id.et_input)).getText().toString());
        this$0.dismiss();
    }

    public final InterfaceC10570l getAfterTextChangedCallback() {
        return this.afterTextChangedCallback;
    }

    public final InterfaceC10559a getCancelCallback() {
        return this.cancelCallback;
    }

    public final InterfaceC10570l getDoneCallback() {
        return this.doneCallback;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C7044R.layout.model_blackboard_dialog_text);
        ((EditText) findViewById(C7044R.id.et_input)).addTextChangedListener(new TextWatcher() { // from class: com.zykj.blackboard.widgets.TextDialog.onCreate.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                TextDialog.this.getAfterTextChangedCallback().invoke(String.valueOf(editable));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
        ((Button) findViewById(C7044R.id.btn_confirm)).setOnClickListener(new View.OnClickListener() { // from class: com.zykj.blackboard.widgets.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextDialog.m27477onCreate$lambda0(this.f8880a, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (i10 != 4) {
            return super.onKeyDown(i10, event);
        }
        this.cancelCallback.invoke();
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            Resources resources = getContext().getResources();
            AbstractC9133u.m16132f(resources, "context.resources");
            window.setLayout(rect.width(), rect.height() - resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android")));
        }
    }

    public final void setAfterTextChangedCallback(InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(interfaceC10570l, "<set-?>");
        this.afterTextChangedCallback = interfaceC10570l;
    }

    public final void setCancelCallback(InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(interfaceC10559a, "<set-?>");
        this.cancelCallback = interfaceC10559a;
    }

    public final void setDoneCallback(InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(interfaceC10570l, "<set-?>");
        this.doneCallback = interfaceC10570l;
    }

    public final void showDialog(String initText, InterfaceC10570l afterTextChangeCallback, InterfaceC10570l doneCallback, InterfaceC10559a cancelCallback) {
        AbstractC9133u.m16133g(initText, "initText");
        AbstractC9133u.m16133g(afterTextChangeCallback, "afterTextChangeCallback");
        AbstractC9133u.m16133g(doneCallback, "doneCallback");
        AbstractC9133u.m16133g(cancelCallback, "cancelCallback");
        this.afterTextChangedCallback = afterTextChangeCallback;
        this.doneCallback = doneCallback;
        this.cancelCallback = cancelCallback;
        show();
        ((EditText) findViewById(C7044R.id.et_input)).setText(initText);
    }

    public /* synthetic */ TextDialog(Context context, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? C7044R.style.AppTheme_Dialog : i10);
    }
}
