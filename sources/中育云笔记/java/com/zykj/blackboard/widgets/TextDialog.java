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
import anet.channel.strategy.dispatch.DispatchConstants;
import com.zykj.blackboard.R$id;
import com.zykj.blackboard.R$layout;
import com.zykj.blackboard.R$style;
import com.zykj.blackboard.widgets.TextDialog;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes5.dex */
public final class TextDialog extends Dialog {

    /* renamed from: c */
    public InterfaceC9540l f18695c;

    /* renamed from: d */
    public InterfaceC9540l f18696d;

    /* renamed from: e */
    public InterfaceC9529a f18697e;

    /* renamed from: com.zykj.blackboard.widgets.TextDialog$a */
    public static final class C8447a implements TextWatcher {
        public C8447a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextDialog.this.m14641b().invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDialog(Context context, int i10) {
        super(context, i10);
        AbstractC9979u.m20294g(context, "context");
        this.f18695c = new InterfaceC9540l() { // from class: com.zykj.blackboard.widgets.TextDialog$afterTextChangedCallback$1
            public final void invoke(String str) {
                AbstractC9979u.m20294g(str, "<anonymous parameter 0>");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C10786q.f26013a;
            }
        };
        this.f18696d = new InterfaceC9540l() { // from class: com.zykj.blackboard.widgets.TextDialog$doneCallback$1
            public final void invoke(String str) {
                AbstractC9979u.m20294g(str, "<anonymous parameter 0>");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C10786q.f26013a;
            }
        };
        this.f18697e = new InterfaceC9529a() { // from class: com.zykj.blackboard.widgets.TextDialog$cancelCallback$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34017invoke() {
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34017invoke();
                return C10786q.f26013a;
            }
        };
    }

    /* renamed from: c */
    public static final void m14640c(TextDialog this$0, View view) {
        AbstractC9979u.m20294g(this$0, "this$0");
        this$0.f18696d.invoke(((EditText) this$0.findViewById(R$id.et_input)).getText().toString());
        this$0.dismiss();
    }

    /* renamed from: b */
    public final InterfaceC9540l m14641b() {
        return this.f18695c;
    }

    /* renamed from: d */
    public final void m14642d(String initText, InterfaceC9540l afterTextChangeCallback, InterfaceC9540l doneCallback, InterfaceC9529a cancelCallback) {
        AbstractC9979u.m20294g(initText, "initText");
        AbstractC9979u.m20294g(afterTextChangeCallback, "afterTextChangeCallback");
        AbstractC9979u.m20294g(doneCallback, "doneCallback");
        AbstractC9979u.m20294g(cancelCallback, "cancelCallback");
        this.f18695c = afterTextChangeCallback;
        this.f18696d = doneCallback;
        this.f18697e = cancelCallback;
        show();
        ((EditText) findViewById(R$id.et_input)).setText(initText);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.model_blackboard_dialog_text);
        ((EditText) findViewById(R$id.et_input)).addTextChangedListener(new C8447a());
        ((Button) findViewById(R$id.btn_confirm)).setOnClickListener(new View.OnClickListener() { // from class: oa.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextDialog.m14640c(this.f24853c, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (i10 != 4) {
            return super.onKeyDown(i10, event);
        }
        this.f18697e.invoke();
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
            AbstractC9979u.m20293f(resources, "context.resources");
            window.setLayout(rect.width(), rect.height() - resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID)));
        }
    }

    public /* synthetic */ TextDialog(Context context, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? R$style.AppTheme_Dialog : i10);
    }
}
